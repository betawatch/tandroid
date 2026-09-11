package bi;

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
import di.hd;
import di.jd;
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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.co;
import org.telegram.ui.dj;
import org.telegram.ui.e41;
import org.telegram.ui.fh;
import org.telegram.ui.fn0;
import org.telegram.ui.lh1;
import org.telegram.ui.ll0;
import org.telegram.ui.pn0;
import org.telegram.ui.qe;
import org.telegram.ui.t71;
import org.telegram.ui.y31;
import org.telegram.ui.ye;
import org.telegram.ui.ze;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ h8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    private final void a() {
        zh.s5 s5Var = (zh.s5) this.b;
        List list = (List) this.c;
        f0 f0Var = (f0) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.h hVar = (c5.h) this.f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new zh.i4(f0Var, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new zh.i4(f0Var, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(s5Var.a).sendRequest(tL_payments_canPurchaseStore, new lh1(oVar, hVar, f0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void b() {
        zh.s5 s5Var = (zh.s5) this.b;
        Runnable runnable = (Runnable) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (s5Var.e) {
            s5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
        } else {
            zh.s5.e("NO_BALANCE");
            runnable.run();
        }
    }

    private final void c() {
        zh.s5 s5Var = (zh.s5) this.b;
        TLObject tLObject = (TLObject) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        dj djVar = (dj) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            s5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, djVar, null);
        } else {
            zh.s5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        djVar.run();
    }

    private final void e() {
        zh.s5 s5Var = (zh.s5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        zArr[0] = true;
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new zh.w0(1, callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03f0, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0429, code lost:
    
        if (r8.creator != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0425, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0663 A[Catch: Exception -> 0x05fd, TryCatch #1 {Exception -> 0x05fd, blocks: (B:399:0x05ed, B:401:0x05f7, B:183:0x0601, B:186:0x060f, B:188:0x0619, B:190:0x061f, B:191:0x0622, B:193:0x065d, B:195:0x0663, B:197:0x0669, B:198:0x066c, B:200:0x0671, B:202:0x0677, B:203:0x067a, B:206:0x0683, B:208:0x068d, B:210:0x069d, B:212:0x06a9, B:214:0x06b5, B:218:0x06fe, B:220:0x0704, B:221:0x0707, B:223:0x0710, B:224:0x0713, B:225:0x071d, B:228:0x0727, B:234:0x073a, B:236:0x0740, B:244:0x076f, B:246:0x0775, B:248:0x0793, B:249:0x0795, B:250:0x079d, B:252:0x07a1, B:254:0x07b6, B:255:0x07bc, B:257:0x07c2, B:258:0x07c6, B:260:0x07cc, B:261:0x07d0, B:369:0x079a, B:371:0x06c6, B:373:0x06d6, B:375:0x06e0, B:377:0x06f9, B:383:0x0627, B:385:0x0631, B:387:0x0637, B:388:0x063a, B:389:0x063e, B:391:0x0648, B:393:0x064e, B:395:0x0654, B:396:0x0657), top: B:398:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x068d A[Catch: Exception -> 0x05fd, TryCatch #1 {Exception -> 0x05fd, blocks: (B:399:0x05ed, B:401:0x05f7, B:183:0x0601, B:186:0x060f, B:188:0x0619, B:190:0x061f, B:191:0x0622, B:193:0x065d, B:195:0x0663, B:197:0x0669, B:198:0x066c, B:200:0x0671, B:202:0x0677, B:203:0x067a, B:206:0x0683, B:208:0x068d, B:210:0x069d, B:212:0x06a9, B:214:0x06b5, B:218:0x06fe, B:220:0x0704, B:221:0x0707, B:223:0x0710, B:224:0x0713, B:225:0x071d, B:228:0x0727, B:234:0x073a, B:236:0x0740, B:244:0x076f, B:246:0x0775, B:248:0x0793, B:249:0x0795, B:250:0x079d, B:252:0x07a1, B:254:0x07b6, B:255:0x07bc, B:257:0x07c2, B:258:0x07c6, B:260:0x07cc, B:261:0x07d0, B:369:0x079a, B:371:0x06c6, B:373:0x06d6, B:375:0x06e0, B:377:0x06f9, B:383:0x0627, B:385:0x0631, B:387:0x0637, B:388:0x063a, B:389:0x063e, B:391:0x0648, B:393:0x064e, B:395:0x0654, B:396:0x0657), top: B:398:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0704 A[Catch: Exception -> 0x05fd, TryCatch #1 {Exception -> 0x05fd, blocks: (B:399:0x05ed, B:401:0x05f7, B:183:0x0601, B:186:0x060f, B:188:0x0619, B:190:0x061f, B:191:0x0622, B:193:0x065d, B:195:0x0663, B:197:0x0669, B:198:0x066c, B:200:0x0671, B:202:0x0677, B:203:0x067a, B:206:0x0683, B:208:0x068d, B:210:0x069d, B:212:0x06a9, B:214:0x06b5, B:218:0x06fe, B:220:0x0704, B:221:0x0707, B:223:0x0710, B:224:0x0713, B:225:0x071d, B:228:0x0727, B:234:0x073a, B:236:0x0740, B:244:0x076f, B:246:0x0775, B:248:0x0793, B:249:0x0795, B:250:0x079d, B:252:0x07a1, B:254:0x07b6, B:255:0x07bc, B:257:0x07c2, B:258:0x07c6, B:260:0x07cc, B:261:0x07d0, B:369:0x079a, B:371:0x06c6, B:373:0x06d6, B:375:0x06e0, B:377:0x06f9, B:383:0x0627, B:385:0x0631, B:387:0x0637, B:388:0x063a, B:389:0x063e, B:391:0x0648, B:393:0x064e, B:395:0x0654, B:396:0x0657), top: B:398:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0710 A[Catch: Exception -> 0x05fd, TryCatch #1 {Exception -> 0x05fd, blocks: (B:399:0x05ed, B:401:0x05f7, B:183:0x0601, B:186:0x060f, B:188:0x0619, B:190:0x061f, B:191:0x0622, B:193:0x065d, B:195:0x0663, B:197:0x0669, B:198:0x066c, B:200:0x0671, B:202:0x0677, B:203:0x067a, B:206:0x0683, B:208:0x068d, B:210:0x069d, B:212:0x06a9, B:214:0x06b5, B:218:0x06fe, B:220:0x0704, B:221:0x0707, B:223:0x0710, B:224:0x0713, B:225:0x071d, B:228:0x0727, B:234:0x073a, B:236:0x0740, B:244:0x076f, B:246:0x0775, B:248:0x0793, B:249:0x0795, B:250:0x079d, B:252:0x07a1, B:254:0x07b6, B:255:0x07bc, B:257:0x07c2, B:258:0x07c6, B:260:0x07cc, B:261:0x07d0, B:369:0x079a, B:371:0x06c6, B:373:0x06d6, B:375:0x06e0, B:377:0x06f9, B:383:0x0627, B:385:0x0631, B:387:0x0637, B:388:0x063a, B:389:0x063e, B:391:0x0648, B:393:0x064e, B:395:0x0654, B:396:0x0657), top: B:398:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0727 A[Catch: Exception -> 0x05fd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x05fd, blocks: (B:399:0x05ed, B:401:0x05f7, B:183:0x0601, B:186:0x060f, B:188:0x0619, B:190:0x061f, B:191:0x0622, B:193:0x065d, B:195:0x0663, B:197:0x0669, B:198:0x066c, B:200:0x0671, B:202:0x0677, B:203:0x067a, B:206:0x0683, B:208:0x068d, B:210:0x069d, B:212:0x06a9, B:214:0x06b5, B:218:0x06fe, B:220:0x0704, B:221:0x0707, B:223:0x0710, B:224:0x0713, B:225:0x071d, B:228:0x0727, B:234:0x073a, B:236:0x0740, B:244:0x076f, B:246:0x0775, B:248:0x0793, B:249:0x0795, B:250:0x079d, B:252:0x07a1, B:254:0x07b6, B:255:0x07bc, B:257:0x07c2, B:258:0x07c6, B:260:0x07cc, B:261:0x07d0, B:369:0x079a, B:371:0x06c6, B:373:0x06d6, B:375:0x06e0, B:377:0x06f9, B:383:0x0627, B:385:0x0631, B:387:0x0637, B:388:0x063a, B:389:0x063e, B:391:0x0648, B:393:0x064e, B:395:0x0654, B:396:0x0657), top: B:398:0x05ed }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08ce A[Catch: Exception -> 0x0a04, TryCatch #4 {Exception -> 0x0a04, blocks: (B:265:0x07e1, B:266:0x07f4, B:268:0x07fa, B:270:0x0806, B:272:0x080e, B:274:0x0818, B:276:0x0826, B:277:0x082c, B:279:0x0832, B:281:0x083c, B:283:0x084a, B:284:0x084e, B:286:0x0854, B:288:0x085e, B:290:0x086c, B:291:0x0870, B:293:0x0876, B:295:0x087c, B:297:0x0886, B:299:0x088c, B:300:0x088f, B:301:0x0894, B:304:0x089b, B:306:0x08a0, B:311:0x08b2, B:313:0x08b8, B:315:0x08ce, B:318:0x08e5, B:320:0x08ef, B:322:0x0926, B:324:0x093b, B:325:0x0941, B:327:0x0947, B:328:0x094b, B:330:0x0951, B:331:0x0955, B:333:0x095f, B:334:0x096b, B:336:0x0971, B:338:0x097b, B:344:0x0986, B:346:0x098c, B:348:0x0998, B:350:0x09cf, B:351:0x09dc, B:308:0x08ae), top: B:264:0x07e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0926 A[Catch: Exception -> 0x0a04, TryCatch #4 {Exception -> 0x0a04, blocks: (B:265:0x07e1, B:266:0x07f4, B:268:0x07fa, B:270:0x0806, B:272:0x080e, B:274:0x0818, B:276:0x0826, B:277:0x082c, B:279:0x0832, B:281:0x083c, B:283:0x084a, B:284:0x084e, B:286:0x0854, B:288:0x085e, B:290:0x086c, B:291:0x0870, B:293:0x0876, B:295:0x087c, B:297:0x0886, B:299:0x088c, B:300:0x088f, B:301:0x0894, B:304:0x089b, B:306:0x08a0, B:311:0x08b2, B:313:0x08b8, B:315:0x08ce, B:318:0x08e5, B:320:0x08ef, B:322:0x0926, B:324:0x093b, B:325:0x0941, B:327:0x0947, B:328:0x094b, B:330:0x0951, B:331:0x0955, B:333:0x095f, B:334:0x096b, B:336:0x0971, B:338:0x097b, B:344:0x0986, B:346:0x098c, B:348:0x0998, B:350:0x09cf, B:351:0x09dc, B:308:0x08ae), top: B:264:0x07e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0984 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x098c A[Catch: Exception -> 0x0a04, TryCatch #4 {Exception -> 0x0a04, blocks: (B:265:0x07e1, B:266:0x07f4, B:268:0x07fa, B:270:0x0806, B:272:0x080e, B:274:0x0818, B:276:0x0826, B:277:0x082c, B:279:0x0832, B:281:0x083c, B:283:0x084a, B:284:0x084e, B:286:0x0854, B:288:0x085e, B:290:0x086c, B:291:0x0870, B:293:0x0876, B:295:0x087c, B:297:0x0886, B:299:0x088c, B:300:0x088f, B:301:0x0894, B:304:0x089b, B:306:0x08a0, B:311:0x08b2, B:313:0x08b8, B:315:0x08ce, B:318:0x08e5, B:320:0x08ef, B:322:0x0926, B:324:0x093b, B:325:0x0941, B:327:0x0947, B:328:0x094b, B:330:0x0951, B:331:0x0955, B:333:0x095f, B:334:0x096b, B:336:0x0971, B:338:0x097b, B:344:0x0986, B:346:0x098c, B:348:0x0998, B:350:0x09cf, B:351:0x09dc, B:308:0x08ae), top: B:264:0x07e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0681  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hg.c cVar;
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
        int i15 = 2;
        int i16 = 0;
        switch (this.a) {
            case 0:
                l8 l8Var = (l8) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                HashSet hashSet5 = (HashSet) this.h;
                StringBuilder sb5 = new StringBuilder("StoriesList ");
                sb5.append(l8Var.e);
                sb5.append("{");
                sb5.append(l8Var.d);
                sb5.append("} preloadCache {");
                sb5.append(u8.a(arrayList));
                com.google.android.gms.internal.vision.e2.t("}", sb5);
                ArrayList arrayList5 = l8Var.g;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                l8Var.t = false;
                int i17 = l8Var.c;
                MessagesController.getInstance(i17).putUsers(arrayList3, true);
                MessagesController.getInstance(i17).putChats(arrayList4, true);
                if (l8Var.v) {
                    l8Var.v = false;
                    l8Var.y = null;
                    l8Var.j();
                    break;
                } else {
                    l8Var.m.addAll(hashSet5);
                    l8Var.k.clear();
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        l8Var.t((MessageObject) arrayList.get(i18), true);
                    }
                    l8Var.d(false);
                    j8 j8Var = l8Var.y;
                    if (j8Var != null) {
                        j8Var.run(0);
                        l8Var.y = null;
                    }
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, l8Var);
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
                hg.c cVar2 = (hg.c) this.b;
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
                            int i19 = i10;
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
                                            int i20 = 0;
                                            while (i20 < length) {
                                                int i21 = i20;
                                                String str9 = split[i21];
                                                if (str9.length() > 0) {
                                                    i14 = length;
                                                    str4 = str4 + str9.charAt(0);
                                                } else {
                                                    i14 = length;
                                                }
                                                i20 = i21 + 1;
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
                                                            int i22 = 0;
                                                            while (true) {
                                                                String[] strArr = LocationController.unnamedRoads;
                                                                if (i22 < strArr.length) {
                                                                    if (strArr[i22].equalsIgnoreCase(sb8.toString())) {
                                                                        z13 = true;
                                                                    } else {
                                                                        i22++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z13 = false;
                                                        if (!TextUtils.isEmpty(sb8)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue.geoAddress;
                                                            tL_geoPointAddress4.flags |= 4;
                                                            tL_geoPointAddress4.street = sb8.toString();
                                                        }
                                                        if (!z13) {
                                                            arrayList6.add(tL_messageMediaVenue);
                                                            i12 = i19;
                                                            if (arrayList6.size() >= i12) {
                                                                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 12));
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
                                                                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 12));
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
                                                                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 12));
                                                                    }
                                                                }
                                                            }
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
                                            i12 = i19;
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
                                            i12 = i19;
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
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 12));
                break;
            case 3:
                hg.b1 b1Var = (hg.b1) this.b;
                String str10 = (String) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                hg.k1 k1Var = b1Var.e;
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
                final d90 d90Var = (d90) this.e;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.h;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str12 = ((TL_phone.exportedGroupCallInvite) tLObject3).link;
                    strArr2[0] = str12;
                    if (str12.startsWith("https://")) {
                        str12 = str12.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.i8
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
                                d90Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.b9(atomicBoolean, d90Var, str12));
                    duration.start();
                    new yc(f3Var.topBulletinContainer, f6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ub ubVar = (org.telegram.ui.ub) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                org.telegram.ui.sa saVar = (org.telegram.ui.sa) this.h;
                TLRPC.Chat chat = ubVar.s;
                ubVar.d0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = ubVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = ubVar.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i16 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i16);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList7.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.Cells.p6.n(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                    }
                    arrayList7.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.Cells.p6.n(R.drawable.msg_block, 35, arrayList8, arrayList9);
                }
                saVar.run();
                break;
            case 6:
                co coVar = (co) this.b;
                of.e eVar = (of.e) this.c;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                String str13 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                eVar.b();
                n70 I = n70.I(coVar, t1Var);
                am0 am0Var = new am0(coVar.getParentActivity(), coVar.ea);
                I.p = new qe(am0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ye(coVar, am0Var, str13, i15), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i23);
                        i23++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new fh(i15, coVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                am0Var.e(I);
                am0Var.f(t1Var, characterStyle, null, false);
                coVar.showDialog(am0Var);
                break;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                di.d dVar = (di.d) this.e;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error2 != null) {
                    new yc(org.telegram.ui.Components.lb.a(context), f6Var2).d0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    new yc(org.telegram.ui.Components.lb.a(context), f6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable.run();
                    break;
                }
            case 8:
                ux0 ux0Var = (ux0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                TextView textView = (TextView) this.e;
                TextView textView2 = (TextView) this.f;
                int[] iArr2 = (int[]) this.h;
                ux0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    z14 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    ux0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
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
                e41.n((e41) this.b, (TLObject) this.c, (CharSequence) this.d, (TLRPC.TL_error) this.e, (byte[]) this.f, (String) this.h);
                break;
            case 11:
                TLObject tLObject6 = (TLObject) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                jn0 jn0Var = (jn0) this.h;
                e41 e41Var = new e41(context2, f6Var3, 0L, bArr);
                e41Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                e41Var.s = new y31(n2Var, context2, f6Var3, jn0Var);
                e41Var.show();
                break;
            case 12:
                t71.R((t71) this.b, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 13:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str14 = (String) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                String str15 = (String) this.h;
                org.telegram.ui.ActionBar.f6 f6Var4 = d1Var.e;
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
                        new yc(d1Var, f6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str15), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var4)), R.raw.error).j();
                        break;
                    } else {
                        new yc(d1Var, f6Var4).d0(tL_error3, false);
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
                    Utilities.globalQueue.postRunnable(new er0(file, iArr3, new ze(d1Var2, iArr3, file, b2Var, str16, str17, str18, 7), 15));
                    break;
                }
            case 15:
                yh.p1.P((yh.p1) this.b, (org.telegram.ui.ActionBar.b2) this.c, (TLObject) this.d, (zh.o6) this.e, (Utilities.Callback) this.f, (TLRPC.TL_error) this.h);
                break;
            case 16:
                zh.w3.c1((zh.w3) this.b, (TLObject) this.c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f, (TLRPC.TL_error) this.h);
                break;
            case 17:
                zh.w3.y0((zh.w3) this.b, (TLObject) this.c, (ug.n1[]) this.d, (Long) this.e, (wh.n) this.f, (TLRPC.TL_error) this.h);
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
                zh.i5 i5Var = (zh.i5) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                zh.j5 j5Var = (zh.j5) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                long j3 = i5Var.b;
                int i24 = i5Var.a;
                HashMap hashMap = i5Var.h;
                ArrayList arrayList11 = i5Var.e;
                i5Var.k = false;
                if (tLObject8 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject8;
                    arrayList11.remove(tL_starGiftCollection);
                    arrayList11.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i25 = tL_starGiftCollection2.collection_id;
                    j5Var.d = i25;
                    hashMap.put(Integer.valueOf(i25), j5Var);
                    i5Var.j();
                    NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var);
                    if (callback != null) {
                        callback.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error4 != null && (U = LaunchActivity.U()) != null) {
                        yc.a0(U).d0(tL_error4, false);
                    }
                    arrayList11.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    i5Var.j();
                    NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), i5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h8(org.telegram.ui.ub ubVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.sa saVar) {
        this.a = 5;
        this.b = ubVar;
        this.f = channelParticipant;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = saVar;
    }
}
