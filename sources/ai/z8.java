package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.hd;
import ci.jd;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.uw;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b41;
import org.telegram.ui.cj;
import org.telegram.ui.fn0;
import org.telegram.ui.kh1;
import org.telegram.ui.ll0;
import org.telegram.ui.pn0;
import org.telegram.ui.q71;
import org.telegram.ui.re;
import org.telegram.ui.v31;
import org.telegram.ui.ye;
import org.telegram.ui.ze;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ z8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    private final void a() {
        yh.t5 t5Var = (yh.t5) this.b;
        List list = (List) this.c;
        m0 m0Var = (m0) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.h hVar = (c5.h) this.f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yh.k4(m0Var, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new yh.k4(m0Var, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(t5Var.a).sendRequest(tL_payments_canPurchaseStore, new kh1(oVar, hVar, m0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void b() {
        yh.t5 t5Var = (yh.t5) this.b;
        Runnable runnable = (Runnable) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (t5Var.e) {
            t5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
        } else {
            yh.t5.e("NO_BALANCE");
            runnable.run();
        }
    }

    private final void c() {
        yh.t5 t5Var = (yh.t5) this.b;
        TLObject tLObject = (TLObject) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        cj cjVar = (cj) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            t5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, cjVar, null);
        } else {
            yh.t5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        cjVar.run();
    }

    private final void e() {
        yh.t5 t5Var = (yh.t5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        zArr[0] = true;
        t5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new yh.w0(1, callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03f3, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x042c, code lost:
    
        if (r8.creator != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0428, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0666 A[Catch: Exception -> 0x0600, TryCatch #0 {Exception -> 0x0600, blocks: (B:399:0x05f0, B:401:0x05fa, B:183:0x0604, B:186:0x0612, B:188:0x061c, B:190:0x0622, B:191:0x0625, B:193:0x0660, B:195:0x0666, B:197:0x066c, B:198:0x066f, B:200:0x0674, B:202:0x067a, B:203:0x067d, B:206:0x0686, B:208:0x0690, B:210:0x06a0, B:212:0x06ac, B:214:0x06b8, B:218:0x0701, B:220:0x0707, B:221:0x070a, B:223:0x0713, B:224:0x0716, B:225:0x0720, B:228:0x072a, B:234:0x073d, B:236:0x0743, B:244:0x0772, B:246:0x0778, B:248:0x0796, B:249:0x0798, B:250:0x07a0, B:252:0x07a4, B:254:0x07b9, B:255:0x07bf, B:257:0x07c5, B:258:0x07c9, B:260:0x07cf, B:261:0x07d3, B:369:0x079d, B:371:0x06c9, B:373:0x06d9, B:375:0x06e3, B:377:0x06fc, B:383:0x062a, B:385:0x0634, B:387:0x063a, B:388:0x063d, B:389:0x0641, B:391:0x064b, B:393:0x0651, B:395:0x0657, B:396:0x065a), top: B:398:0x05f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0690 A[Catch: Exception -> 0x0600, TryCatch #0 {Exception -> 0x0600, blocks: (B:399:0x05f0, B:401:0x05fa, B:183:0x0604, B:186:0x0612, B:188:0x061c, B:190:0x0622, B:191:0x0625, B:193:0x0660, B:195:0x0666, B:197:0x066c, B:198:0x066f, B:200:0x0674, B:202:0x067a, B:203:0x067d, B:206:0x0686, B:208:0x0690, B:210:0x06a0, B:212:0x06ac, B:214:0x06b8, B:218:0x0701, B:220:0x0707, B:221:0x070a, B:223:0x0713, B:224:0x0716, B:225:0x0720, B:228:0x072a, B:234:0x073d, B:236:0x0743, B:244:0x0772, B:246:0x0778, B:248:0x0796, B:249:0x0798, B:250:0x07a0, B:252:0x07a4, B:254:0x07b9, B:255:0x07bf, B:257:0x07c5, B:258:0x07c9, B:260:0x07cf, B:261:0x07d3, B:369:0x079d, B:371:0x06c9, B:373:0x06d9, B:375:0x06e3, B:377:0x06fc, B:383:0x062a, B:385:0x0634, B:387:0x063a, B:388:0x063d, B:389:0x0641, B:391:0x064b, B:393:0x0651, B:395:0x0657, B:396:0x065a), top: B:398:0x05f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0707 A[Catch: Exception -> 0x0600, TryCatch #0 {Exception -> 0x0600, blocks: (B:399:0x05f0, B:401:0x05fa, B:183:0x0604, B:186:0x0612, B:188:0x061c, B:190:0x0622, B:191:0x0625, B:193:0x0660, B:195:0x0666, B:197:0x066c, B:198:0x066f, B:200:0x0674, B:202:0x067a, B:203:0x067d, B:206:0x0686, B:208:0x0690, B:210:0x06a0, B:212:0x06ac, B:214:0x06b8, B:218:0x0701, B:220:0x0707, B:221:0x070a, B:223:0x0713, B:224:0x0716, B:225:0x0720, B:228:0x072a, B:234:0x073d, B:236:0x0743, B:244:0x0772, B:246:0x0778, B:248:0x0796, B:249:0x0798, B:250:0x07a0, B:252:0x07a4, B:254:0x07b9, B:255:0x07bf, B:257:0x07c5, B:258:0x07c9, B:260:0x07cf, B:261:0x07d3, B:369:0x079d, B:371:0x06c9, B:373:0x06d9, B:375:0x06e3, B:377:0x06fc, B:383:0x062a, B:385:0x0634, B:387:0x063a, B:388:0x063d, B:389:0x0641, B:391:0x064b, B:393:0x0651, B:395:0x0657, B:396:0x065a), top: B:398:0x05f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0713 A[Catch: Exception -> 0x0600, TryCatch #0 {Exception -> 0x0600, blocks: (B:399:0x05f0, B:401:0x05fa, B:183:0x0604, B:186:0x0612, B:188:0x061c, B:190:0x0622, B:191:0x0625, B:193:0x0660, B:195:0x0666, B:197:0x066c, B:198:0x066f, B:200:0x0674, B:202:0x067a, B:203:0x067d, B:206:0x0686, B:208:0x0690, B:210:0x06a0, B:212:0x06ac, B:214:0x06b8, B:218:0x0701, B:220:0x0707, B:221:0x070a, B:223:0x0713, B:224:0x0716, B:225:0x0720, B:228:0x072a, B:234:0x073d, B:236:0x0743, B:244:0x0772, B:246:0x0778, B:248:0x0796, B:249:0x0798, B:250:0x07a0, B:252:0x07a4, B:254:0x07b9, B:255:0x07bf, B:257:0x07c5, B:258:0x07c9, B:260:0x07cf, B:261:0x07d3, B:369:0x079d, B:371:0x06c9, B:373:0x06d9, B:375:0x06e3, B:377:0x06fc, B:383:0x062a, B:385:0x0634, B:387:0x063a, B:388:0x063d, B:389:0x0641, B:391:0x064b, B:393:0x0651, B:395:0x0657, B:396:0x065a), top: B:398:0x05f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x072a A[Catch: Exception -> 0x0600, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0600, blocks: (B:399:0x05f0, B:401:0x05fa, B:183:0x0604, B:186:0x0612, B:188:0x061c, B:190:0x0622, B:191:0x0625, B:193:0x0660, B:195:0x0666, B:197:0x066c, B:198:0x066f, B:200:0x0674, B:202:0x067a, B:203:0x067d, B:206:0x0686, B:208:0x0690, B:210:0x06a0, B:212:0x06ac, B:214:0x06b8, B:218:0x0701, B:220:0x0707, B:221:0x070a, B:223:0x0713, B:224:0x0716, B:225:0x0720, B:228:0x072a, B:234:0x073d, B:236:0x0743, B:244:0x0772, B:246:0x0778, B:248:0x0796, B:249:0x0798, B:250:0x07a0, B:252:0x07a4, B:254:0x07b9, B:255:0x07bf, B:257:0x07c5, B:258:0x07c9, B:260:0x07cf, B:261:0x07d3, B:369:0x079d, B:371:0x06c9, B:373:0x06d9, B:375:0x06e3, B:377:0x06fc, B:383:0x062a, B:385:0x0634, B:387:0x063a, B:388:0x063d, B:389:0x0641, B:391:0x064b, B:393:0x0651, B:395:0x0657, B:396:0x065a), top: B:398:0x05f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08bb A[Catch: Exception -> 0x0a07, TryCatch #3 {Exception -> 0x0a07, blocks: (B:265:0x07e4, B:266:0x07f7, B:268:0x07fd, B:270:0x0809, B:272:0x0811, B:274:0x081b, B:276:0x0829, B:277:0x082f, B:279:0x0835, B:281:0x083f, B:283:0x084d, B:284:0x0851, B:286:0x0857, B:288:0x0861, B:290:0x086f, B:291:0x0873, B:293:0x0879, B:295:0x087f, B:297:0x0889, B:299:0x088f, B:300:0x0892, B:301:0x0897, B:304:0x089e, B:306:0x08a3, B:311:0x08b5, B:313:0x08bb, B:315:0x08d1, B:318:0x08e8, B:320:0x08f2, B:322:0x0929, B:324:0x093e, B:325:0x0944, B:327:0x094a, B:328:0x094e, B:330:0x0954, B:331:0x0958, B:333:0x0962, B:334:0x096e, B:336:0x0974, B:338:0x097e, B:344:0x0989, B:346:0x098f, B:348:0x099b, B:350:0x09d2, B:351:0x09df, B:308:0x08b1), top: B:264:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08d1 A[Catch: Exception -> 0x0a07, TryCatch #3 {Exception -> 0x0a07, blocks: (B:265:0x07e4, B:266:0x07f7, B:268:0x07fd, B:270:0x0809, B:272:0x0811, B:274:0x081b, B:276:0x0829, B:277:0x082f, B:279:0x0835, B:281:0x083f, B:283:0x084d, B:284:0x0851, B:286:0x0857, B:288:0x0861, B:290:0x086f, B:291:0x0873, B:293:0x0879, B:295:0x087f, B:297:0x0889, B:299:0x088f, B:300:0x0892, B:301:0x0897, B:304:0x089e, B:306:0x08a3, B:311:0x08b5, B:313:0x08bb, B:315:0x08d1, B:318:0x08e8, B:320:0x08f2, B:322:0x0929, B:324:0x093e, B:325:0x0944, B:327:0x094a, B:328:0x094e, B:330:0x0954, B:331:0x0958, B:333:0x0962, B:334:0x096e, B:336:0x0974, B:338:0x097e, B:344:0x0989, B:346:0x098f, B:348:0x099b, B:350:0x09d2, B:351:0x09df, B:308:0x08b1), top: B:264:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0929 A[Catch: Exception -> 0x0a07, TryCatch #3 {Exception -> 0x0a07, blocks: (B:265:0x07e4, B:266:0x07f7, B:268:0x07fd, B:270:0x0809, B:272:0x0811, B:274:0x081b, B:276:0x0829, B:277:0x082f, B:279:0x0835, B:281:0x083f, B:283:0x084d, B:284:0x0851, B:286:0x0857, B:288:0x0861, B:290:0x086f, B:291:0x0873, B:293:0x0879, B:295:0x087f, B:297:0x0889, B:299:0x088f, B:300:0x0892, B:301:0x0897, B:304:0x089e, B:306:0x08a3, B:311:0x08b5, B:313:0x08bb, B:315:0x08d1, B:318:0x08e8, B:320:0x08f2, B:322:0x0929, B:324:0x093e, B:325:0x0944, B:327:0x094a, B:328:0x094e, B:330:0x0954, B:331:0x0958, B:333:0x0962, B:334:0x096e, B:336:0x0974, B:338:0x097e, B:344:0x0989, B:346:0x098f, B:348:0x099b, B:350:0x09d2, B:351:0x09df, B:308:0x08b1), top: B:264:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0987 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x098f A[Catch: Exception -> 0x0a07, TryCatch #3 {Exception -> 0x0a07, blocks: (B:265:0x07e4, B:266:0x07f7, B:268:0x07fd, B:270:0x0809, B:272:0x0811, B:274:0x081b, B:276:0x0829, B:277:0x082f, B:279:0x0835, B:281:0x083f, B:283:0x084d, B:284:0x0851, B:286:0x0857, B:288:0x0861, B:290:0x086f, B:291:0x0873, B:293:0x0879, B:295:0x087f, B:297:0x0889, B:299:0x088f, B:300:0x0892, B:301:0x0897, B:304:0x089e, B:306:0x08a3, B:311:0x08b5, B:313:0x08bb, B:315:0x08d1, B:318:0x08e8, B:320:0x08f2, B:322:0x0929, B:324:0x093e, B:325:0x0944, B:327:0x094a, B:328:0x094e, B:330:0x0954, B:331:0x0958, B:333:0x0962, B:334:0x096e, B:336:0x0974, B:338:0x097e, B:344:0x0989, B:346:0x098f, B:348:0x099b, B:350:0x09d2, B:351:0x09df, B:308:0x08b1), top: B:264:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0684  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gg.c cVar;
        Location location;
        String str;
        int i10;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i11;
        Address address;
        Locale locale;
        String str2;
        List<Address> list;
        HashSet hashSet3;
        int i12;
        List<Address> list2;
        int i13;
        StringBuilder sb2;
        String str3;
        String thoroughfare;
        boolean z10;
        boolean z11;
        String countryName;
        HashSet hashSet4;
        StringBuilder sb3;
        boolean z12;
        StringBuilder sb4;
        boolean z13;
        String str4;
        int i14;
        TLRPC.User user;
        TLRPC.ChatParticipants chatParticipants;
        boolean z14;
        String str5;
        org.telegram.ui.ActionBar.n2 U;
        String str6 = "";
        int i15 = 0;
        switch (this.a) {
            case 0:
                d9 d9Var = (d9) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                HashSet hashSet5 = (HashSet) this.h;
                StringBuilder sb5 = new StringBuilder("StoriesList ");
                sb5.append(d9Var.e);
                sb5.append("{");
                sb5.append(d9Var.d);
                sb5.append("} preloadCache {");
                sb5.append(l9.a(arrayList));
                com.google.android.gms.internal.vision.e2.t("}", sb5);
                ArrayList arrayList5 = d9Var.g;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                d9Var.t = false;
                int i16 = d9Var.c;
                MessagesController.getInstance(i16).putUsers(arrayList3, true);
                MessagesController.getInstance(i16).putChats(arrayList4, true);
                if (d9Var.v) {
                    d9Var.v = false;
                    d9Var.y = null;
                    d9Var.j();
                    break;
                } else {
                    d9Var.m.addAll(hashSet5);
                    d9Var.k.clear();
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        d9Var.t((MessageObject) arrayList.get(i17), true);
                    }
                    d9Var.d(false);
                    b9 b9Var = d9Var.y;
                    if (b9Var != null) {
                        b9Var.run(0);
                        d9Var.y = null;
                    }
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
                    break;
                }
            case 1:
                int[] iArr = (int[]) this.b;
                TLObject tLObject = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                jd jdVar = (jd) this.f;
                hd hdVar = (hd) this.h;
                iArr[0] = 0;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        jdVar.run();
                        break;
                    }
                }
                hdVar.run(null);
                break;
            case 2:
                gg.c cVar2 = (gg.c) this.b;
                Locale locale2 = (Locale) this.c;
                String str7 = (String) this.d;
                Locale locale3 = (Locale) this.e;
                Location location2 = (Location) this.f;
                String str8 = (String) this.h;
                ArrayList arrayList6 = new ArrayList();
                try {
                    i10 = cVar2.e ? 10 : 5;
                    fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str7, 5);
                    fromLocationName2 = cVar2.d ? new Geocoder(ApplicationLoader.applicationContext, locale3).getFromLocationName(str7, 5) : null;
                    hashSet = new HashSet();
                    hashSet2 = new HashSet();
                    i11 = 0;
                } catch (Exception unused) {
                }
                while (i11 < fromLocationName.size()) {
                    Address address2 = fromLocationName.get(i11);
                    if (fromLocationName2 != null && i11 < fromLocationName2.size()) {
                        address = fromLocationName2.get(i11);
                        if (address2.hasLatitude() || !address2.hasLongitude()) {
                            locale = locale2;
                            str2 = str6;
                            list = fromLocationName2;
                            hashSet3 = hashSet;
                            i12 = i10;
                            cVar = cVar2;
                            location = location2;
                            str = str8;
                            list2 = fromLocationName;
                            i13 = i11;
                        } else {
                            int i18 = i10;
                            double latitude = address2.getLatitude();
                            locale = locale2;
                            str2 = str6;
                            double longitude = address2.getLongitude();
                            list = fromLocationName2;
                            StringBuilder sb6 = new StringBuilder();
                            Address address3 = address;
                            StringBuilder sb7 = new StringBuilder();
                            location = location2;
                            try {
                                sb2 = new StringBuilder();
                                String locality = address2.getLocality();
                                if (TextUtils.isEmpty(locality)) {
                                    locality = address2.getAdminArea();
                                }
                                str = str8;
                                str3 = locality;
                                if (address3 != null) {
                                    try {
                                        if (TextUtils.isEmpty(address3.getLocality())) {
                                            address3.getAdminArea();
                                        }
                                    } catch (Exception unused2) {
                                        cVar = cVar2;
                                    }
                                }
                                list2 = fromLocationName;
                                thoroughfare = address2.getThoroughfare();
                                i13 = i11;
                            } catch (Exception unused3) {
                                cVar = cVar2;
                            }
                            if (TextUtils.isEmpty(thoroughfare) || TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                                String subLocality = address2.getSubLocality();
                                if (TextUtils.isEmpty(subLocality)) {
                                    String locality2 = address2.getLocality();
                                    if (TextUtils.isEmpty(locality2) || TextUtils.equals(locality2, str3)) {
                                        z10 = true;
                                        sb2 = null;
                                        if (TextUtils.isEmpty(str3)) {
                                            if (sb7.length() > 0) {
                                                sb7.append(", ");
                                            }
                                            sb7.append(str3);
                                            if (sb2 != null) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(str3);
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        boolean z15 = z10;
                                        countryName = address2.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                            sb3 = sb2;
                                            z12 = z11;
                                            if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                                hashSet4 = hashSet;
                                                str4 = countryName;
                                                if (sb7.length() > 0) {
                                                    sb7.append(", ");
                                                }
                                                sb7.append(str4);
                                                if (sb6.length() > 0) {
                                                    sb6.append(", ");
                                                }
                                                sb6.append(countryName);
                                            }
                                            String[] split = countryName.split(" ");
                                            int length = split.length;
                                            hashSet4 = hashSet;
                                            str4 = str2;
                                            int i19 = 0;
                                            while (i19 < length) {
                                                int i20 = i19;
                                                String str9 = split[i20];
                                                if (str9.length() > 0) {
                                                    i14 = length;
                                                    str4 = str4 + str9.charAt(0);
                                                } else {
                                                    i14 = length;
                                                }
                                                i19 = i20 + 1;
                                                length = i14;
                                            }
                                            if (sb7.length() > 0) {
                                            }
                                            sb7.append(str4);
                                            if (sb6.length() > 0) {
                                            }
                                            sb6.append(countryName);
                                        } else {
                                            hashSet4 = hashSet;
                                            sb3 = sb2;
                                            z12 = z11;
                                        }
                                        if (cVar2.e) {
                                            if (sb3 == null || sb3.length() <= 0) {
                                                cVar = cVar2;
                                                sb4 = sb6;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint;
                                                tL_geoPoint.lat = latitude;
                                                tL_geoPoint._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb3.toString();
                                                tL_messageMediaVenue.icon = "pin";
                                                tL_messageMediaVenue.address = LocaleController.getString(z15 ? R.string.PassportCity : R.string.PassportStreet1);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue.geoAddress = tL_geoPointAddress;
                                                    tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                                    String locality3 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                    if (TextUtils.isEmpty(locality3)) {
                                                        locality3 = address3.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality3)) {
                                                        locality3 = address3.getSubAdminArea();
                                                    }
                                                    String adminArea = address3.getAdminArea();
                                                    StringBuilder sb8 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        cVar = cVar2;
                                                        sb4 = sb6;
                                                    } else {
                                                        cVar = cVar2;
                                                        try {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue.geoAddress;
                                                            tL_geoPointAddress2.state = adminArea;
                                                            sb4 = sb6;
                                                            tL_geoPointAddress2.flags |= 1;
                                                        } catch (Exception unused4) {
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(locality3)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue.geoAddress;
                                                        tL_geoPointAddress3.city = locality3;
                                                        tL_geoPointAddress3.flags |= 2;
                                                    }
                                                    if (!z15) {
                                                        String thoroughfare2 = (!TextUtils.isEmpty(null) || TextUtils.equals(address3.getThoroughfare(), str3) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? null : address3.getThoroughfare();
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str3) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                                            thoroughfare2 = address3.getSubLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str3) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                                            thoroughfare2 = address3.getLocality();
                                                        }
                                                        if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                                            sb8 = null;
                                                        } else {
                                                            if (sb8.length() > 0) {
                                                                sb8.append(", ");
                                                            }
                                                            sb8.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                            int i21 = 0;
                                                            while (true) {
                                                                String[] strArr = LocationController.unnamedRoads;
                                                                if (i21 < strArr.length) {
                                                                    if (strArr[i21].equalsIgnoreCase(sb8.toString())) {
                                                                        z13 = true;
                                                                    } else {
                                                                        i21++;
                                                                    }
                                                                }
                                                            }
                                                            if (!TextUtils.isEmpty(sb8)) {
                                                                TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue.geoAddress;
                                                                tL_geoPointAddress4.flags |= 4;
                                                                tL_geoPointAddress4.street = sb8.toString();
                                                            }
                                                            if (!z13) {
                                                                arrayList6.add(tL_messageMediaVenue);
                                                                i12 = i18;
                                                                if (arrayList6.size() >= i12) {
                                                                    AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
                                                                    break;
                                                                }
                                                                if (!z12 && !hashSet2.contains(sb7.toString())) {
                                                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                                    TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                                    tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                                    tL_geoPoint2.lat = latitude;
                                                                    tL_geoPoint2._long = longitude;
                                                                    tL_messageMediaVenue2.query_id = -1L;
                                                                    tL_messageMediaVenue2.title = sb7.toString();
                                                                    tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                                    tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                                    hashSet2.add(tL_messageMediaVenue2.title);
                                                                    tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                                    if (address3 != null) {
                                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                                        tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                                                        tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                                                        String locality4 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                                        if (TextUtils.isEmpty(locality4)) {
                                                                            locality4 = address3.getAdminArea();
                                                                        }
                                                                        if (TextUtils.isEmpty(locality4)) {
                                                                            locality4 = address3.getSubAdminArea();
                                                                        }
                                                                        String adminArea2 = address3.getAdminArea();
                                                                        if (!TextUtils.isEmpty(adminArea2)) {
                                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue2.geoAddress;
                                                                            tL_geoPointAddress6.state = adminArea2;
                                                                            tL_geoPointAddress6.flags |= 1;
                                                                        }
                                                                        if (!TextUtils.isEmpty(locality4)) {
                                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue2.geoAddress;
                                                                            tL_geoPointAddress7.city = locality4;
                                                                            tL_geoPointAddress7.flags |= 2;
                                                                        }
                                                                    }
                                                                    arrayList6.add(tL_messageMediaVenue2);
                                                                    if (arrayList6.size() >= i12) {
                                                                        AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
                                                                    }
                                                                }
                                                                if (sb4.length() > 0) {
                                                                    hashSet3 = hashSet4;
                                                                    if (hashSet3.contains(sb4.toString())) {
                                                                        continue;
                                                                    } else {
                                                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                                                        TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                                        tL_messageMediaVenue3.geo = tL_geoPoint3;
                                                                        tL_geoPoint3.lat = latitude;
                                                                        tL_geoPoint3._long = longitude;
                                                                        tL_messageMediaVenue3.query_id = -1L;
                                                                        tL_messageMediaVenue3.title = sb4.toString();
                                                                        tL_messageMediaVenue3.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                                        tL_messageMediaVenue3.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                                        hashSet3.add(tL_messageMediaVenue3.title);
                                                                        tL_messageMediaVenue3.address = LocaleController.getString(R.string.Country);
                                                                        if (address3 != null) {
                                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                                            tL_messageMediaVenue3.geoAddress = tL_geoPointAddress8;
                                                                            tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                                                        }
                                                                        arrayList6.add(tL_messageMediaVenue3);
                                                                        if (arrayList6.size() >= i12) {
                                                                            AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z13 = false;
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                        }
                                                        if (!z13) {
                                                        }
                                                    }
                                                } else {
                                                    cVar = cVar2;
                                                    sb4 = sb6;
                                                }
                                                z13 = false;
                                                if (!z13) {
                                                }
                                            }
                                            i12 = i18;
                                            if (!z12) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue22 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint22 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue22.geo = tL_geoPoint22;
                                                tL_geoPoint22.lat = latitude;
                                                tL_geoPoint22._long = longitude;
                                                tL_messageMediaVenue22.query_id = -1L;
                                                tL_messageMediaVenue22.title = sb7.toString();
                                                tL_messageMediaVenue22.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                tL_messageMediaVenue22.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue22.title);
                                                tL_messageMediaVenue22.address = LocaleController.getString(R.string.PassportCity);
                                                if (address3 != null) {
                                                }
                                                arrayList6.add(tL_messageMediaVenue22);
                                                if (arrayList6.size() >= i12) {
                                                }
                                            }
                                            if (sb4.length() > 0) {
                                            }
                                        } else {
                                            StringBuilder sb9 = new StringBuilder();
                                            try {
                                                String addressLine = address2.getAddressLine(0);
                                                if (!TextUtils.isEmpty(addressLine)) {
                                                    sb9.append(addressLine);
                                                }
                                            } catch (Exception unused5) {
                                            }
                                            if (sb9.length() > 0) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue4.geo = tL_geoPoint4;
                                                tL_geoPoint4.lat = latitude;
                                                tL_geoPoint4._long = longitude;
                                                tL_messageMediaVenue4.query_id = -1L;
                                                tL_messageMediaVenue4.title = sb9.toString();
                                                tL_messageMediaVenue4.icon = "pin";
                                                tL_messageMediaVenue4.address = LocaleController.getString(R.string.PassportAddress);
                                                arrayList6.add(tL_messageMediaVenue4);
                                            }
                                            cVar = cVar2;
                                            i12 = i18;
                                        }
                                        hashSet3 = hashSet4;
                                    } else {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(locality2);
                                    }
                                } else {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(subLocality);
                                }
                            } else {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(thoroughfare);
                            }
                            z10 = false;
                            if (TextUtils.isEmpty(str3)) {
                            }
                            boolean z152 = z10;
                            countryName = address2.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                            }
                            if (cVar2.e) {
                            }
                            hashSet3 = hashSet4;
                        }
                        i11 = i13 + 1;
                        i10 = i12;
                        hashSet = hashSet3;
                        str6 = str2;
                        locale2 = locale;
                        fromLocationName2 = list;
                        location2 = location;
                        fromLocationName = list2;
                        str8 = str;
                        cVar2 = cVar;
                    }
                    address = null;
                    if (address2.hasLatitude()) {
                    }
                    locale = locale2;
                    str2 = str6;
                    list = fromLocationName2;
                    hashSet3 = hashSet;
                    i12 = i10;
                    cVar = cVar2;
                    location = location2;
                    str = str8;
                    list2 = fromLocationName;
                    i13 = i11;
                    i11 = i13 + 1;
                    i10 = i12;
                    hashSet = hashSet3;
                    str6 = str2;
                    locale2 = locale;
                    fromLocationName2 = list;
                    location2 = location;
                    fromLocationName = list2;
                    str8 = str;
                    cVar2 = cVar;
                }
                cVar = cVar2;
                location = location2;
                str = str8;
                AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
                break;
            case 3:
                gg.b1 b1Var = (gg.b1) this.b;
                String str10 = (String) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                gg.k1 k1Var = b1Var.e;
                String str11 = k1Var.q0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                            k1Var.R(user);
                            k1Var.t0 = 0;
                            break;
                        }
                    }
                    user = null;
                    k1Var.R(user);
                    k1Var.t0 = 0;
                }
                break;
            case 4:
                TLObject tLObject3 = (TLObject) this.b;
                String[] strArr2 = (String[]) this.c;
                final FrameLayout frameLayout = (FrameLayout) this.d;
                final l90 l90Var = (l90) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.h;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str12 = ((TL_phone.exportedGroupCallInvite) tLObject3).link;
                    strArr2[0] = str12;
                    if (str12.startsWith("https://")) {
                        str12 = str12.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.j8
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float abs = (Math.abs(floatValue - 0.5f) / 5.0f) + 0.9f;
                            FrameLayout frameLayout2 = frameLayout;
                            frameLayout2.setScaleX(abs);
                            frameLayout2.setScaleY(abs);
                            if (floatValue >= 0.5f) {
                                AtomicBoolean atomicBoolean2 = atomicBoolean;
                                if (atomicBoolean2.get()) {
                                    return;
                                }
                                atomicBoolean2.set(true);
                                l90Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.c9(atomicBoolean, l90Var, str12));
                    duration.start();
                    new xc(f3Var.topBulletinContainer, e6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.vb vbVar = (org.telegram.ui.vb) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                org.telegram.ui.sa saVar = (org.telegram.ui.sa) this.h;
                TLRPC.Chat chat = vbVar.f;
                vbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = vbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = vbVar.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i15 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i15);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i15++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList7.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.Cells.c1.k(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                    }
                    arrayList7.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.Cells.c1.k(R.drawable.msg_block, 35, arrayList8, arrayList9);
                }
                saVar.run();
                break;
            case 6:
                zn znVar = (zn) this.b;
                nf.e eVar = (nf.e) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                String str13 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                eVar.b();
                w70 I = w70.I(znVar, u1Var);
                nm0 nm0Var = new nm0(znVar.getParentActivity(), znVar.ea);
                I.p = new re(nm0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ye(znVar, nm0Var, str13, 1), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i22 = 0;
                    while (i22 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i22);
                        i22++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new org.telegram.ui.ActionBar.h6(29, znVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                nm0Var.e(I);
                nm0Var.f(u1Var, characterStyle, null, false);
                znVar.showDialog(nm0Var);
                break;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                ci.d dVar = (ci.d) this.e;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error2 != null) {
                    new xc(org.telegram.ui.Components.lb.a(context), e6Var2).d0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    new xc(org.telegram.ui.Components.lb.a(context), e6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable.run();
                    break;
                }
            case 8:
                hy0 hy0Var = (hy0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                TextView textView = (TextView) this.e;
                TextView textView2 = (TextView) this.f;
                int[] iArr2 = (int[]) this.h;
                hy0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    z14 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    hy0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
                    z14 = true;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z14) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 9:
                pn0.W((pn0) this.b, (TLRPC.TL_error) this.c, (String) this.d, (fn0) this.e, (TLObject) this.f, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 10:
                b41.n((b41) this.b, (TLObject) this.c, (CharSequence) this.d, (TLRPC.TL_error) this.e, (byte[]) this.f, (String) this.h);
                break;
            case 11:
                TLObject tLObject6 = (TLObject) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                uw uwVar = (uw) this.h;
                b41 b41Var = new b41(context2, e6Var3, 0L, bArr);
                b41Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                b41Var.s = new v31(n2Var, context2, e6Var3, uwVar);
                b41Var.show();
                break;
            case 12:
                q71.R((q71) this.b, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str14 = (String) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                String str15 = (String) this.h;
                org.telegram.ui.ActionBar.e6 e6Var4 = d1Var.e;
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.TL_urlAuthResultRequest) {
                        ll0.b(false, d1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject7, null, null, null, false, d1Var);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        ll0.b(false, d1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject7, null, null, null, false, d1Var);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.e5.p0(d1Var.getContext(), str14, false, true, true, false, 0L, null, null, null);
                        break;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        new xc(d1Var, e6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str15), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, e6Var4)), R.raw.error).j();
                        break;
                    } else {
                        new xc(d1Var, e6Var4).d0(tL_error3, false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) this.b;
                File file = (File) this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                String str16 = (String) this.e;
                String str17 = (String) this.f;
                String str18 = (String) this.h;
                if (file == null) {
                    b2Var.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.globalQueue.postRunnable(new dn0(file, iArr3, new ze(d1Var2, iArr3, file, b2Var, str16, str17, str18, 7), 18));
                    break;
                }
            case 15:
                xh.r1.P((xh.r1) this.b, (org.telegram.ui.ActionBar.b2) this.c, (TLObject) this.d, (xh.o0) this.e, (Utilities.Callback) this.f, (TLRPC.TL_error) this.h);
                break;
            case 16:
                yh.y3.c1((yh.y3) this.b, (TLObject) this.c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f, (TLRPC.TL_error) this.h);
                break;
            case 17:
                yh.y3.y0((yh.y3) this.b, (TLObject) this.c, (tg.m1[]) this.d, (Long) this.e, (tg.r) this.f, (TLRPC.TL_error) this.h);
                break;
            case 18:
                a();
                break;
            case 19:
                b();
                break;
            case 20:
                c();
                break;
            case 21:
                e();
                break;
            default:
                yh.k5 k5Var = (yh.k5) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                yh.l5 l5Var = (yh.l5) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                long j3 = k5Var.b;
                int i23 = k5Var.a;
                HashMap hashMap = k5Var.h;
                ArrayList arrayList11 = k5Var.e;
                k5Var.k = false;
                if (tLObject8 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject8;
                    arrayList11.remove(tL_starGiftCollection);
                    arrayList11.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i24 = tL_starGiftCollection2.collection_id;
                    l5Var.d = i24;
                    hashMap.put(Integer.valueOf(i24), l5Var);
                    k5Var.j();
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var);
                    if (callback != null) {
                        callback.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error4 != null && (U = LaunchActivity.U()) != null) {
                        xc.a0(U).d0(tL_error4, false);
                    }
                    arrayList11.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    k5Var.j();
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), k5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z8(org.telegram.ui.vb vbVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.sa saVar) {
        this.a = 5;
        this.b = vbVar;
        this.f = channelParticipant;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = saVar;
    }
}
