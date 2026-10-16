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
import di.cd;
import di.ed;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
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
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.b81;
import org.telegram.ui.c41;
import org.telegram.ui.ef;
import org.telegram.ui.ff;
import org.telegram.ui.fo;
import org.telegram.ui.gj;
import org.telegram.ui.i41;
import org.telegram.ui.in0;
import org.telegram.ui.jd;
import org.telegram.ui.kf;
import org.telegram.ui.mt;
import org.telegram.ui.ql0;
import org.telegram.ui.sh1;
import org.telegram.ui.sn0;
import org.telegram.ui.ye;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    private final void a() {
        ((WalletEngine2) this.b).lambda$prepareSendNFT$26((String) this.c, (String) this.d, (String) this.e, (byte[]) this.f, (Utilities.Callback2) this.h);
    }

    private final void b() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.c6 c6Var = c1Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new zc(c1Var, c6Var).f0(tL_error, false);
                    return;
                }
                new zc(c1Var, c6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, c6Var)), R.raw.error).j();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            ql0.b(false, c1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, c1Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            ql0.b(false, c1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, c1Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.g5.o0(c1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    private final void c() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
        File file = (File) this.c;
        org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.d;
        String str = (String) this.e;
        String str2 = (String) this.f;
        String str3 = (String) this.h;
        if (file == null) {
            a2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new ze0(file, iArr, new ff(c1Var, iArr, file, a2Var, str, str2, str3, 10), 21));
    }

    private final void d() {
        yh.p1.Q((yh.p1) this.b, (org.telegram.ui.ActionBar.a2) this.c, (TLObject) this.d, (rg.g2) this.e, (Utilities.Callback) this.f, (TLRPC.TL_error) this.h);
    }

    private final void f() {
        zh.r3.d1((zh.r3) this.b, (TLObject) this.c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f, (TLRPC.TL_error) this.h);
    }

    private final void g() {
        zh.r3.z0((zh.r3) this.b, (TLObject) this.c, (ug.m1[]) this.d, (Long) this.e, (pi.g) this.f, (TLRPC.TL_error) this.h);
    }

    private final void h() {
        zh.n5 n5Var = (zh.n5) this.b;
        List list = (List) this.c;
        rh.r rVar = (rh.r) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.i iVar = (c5.i) this.f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new zh.e4(rVar, 0));
            return;
        }
        c5.p pVar = (c5.p) list.get(0);
        if (pVar.a() == null) {
            AndroidUtilities.runOnUIThread(new zh.e4(rVar, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(n5Var.a).sendRequest(tL_payments_canPurchaseStore, new sh1(pVar, iVar, rVar, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void i() {
        zh.n5 n5Var = (zh.n5) this.b;
        Runnable runnable = (Runnable) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (n5Var.e) {
            n5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
        } else {
            zh.n5.e("NO_BALANCE");
            runnable.run();
        }
    }

    private final void j() {
        zh.n5 n5Var = (zh.n5) this.b;
        TLObject tLObject = (TLObject) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        gj gjVar = (gj) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            n5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, gjVar, null);
        } else {
            zh.n5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        gjVar.run();
    }

    private final void k() {
        zh.n5 n5Var = (zh.n5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        zArr[0] = true;
        n5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new zh.v0(1, callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f3, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x042c, code lost:
    
        if (r7.creator != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0428, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x066b A[Catch: Exception -> 0x0603, TryCatch #3 {Exception -> 0x0603, blocks: (B:419:0x05f3, B:421:0x05fd, B:199:0x0607, B:203:0x0615, B:205:0x061f, B:207:0x0625, B:208:0x0628, B:210:0x0665, B:212:0x066b, B:214:0x0671, B:215:0x0674, B:217:0x0679, B:219:0x067f, B:220:0x0682, B:223:0x068b, B:225:0x0695, B:227:0x06a5, B:229:0x06b1, B:231:0x06bd, B:235:0x0706, B:237:0x070c, B:238:0x070f, B:240:0x0718, B:241:0x071b, B:242:0x0725, B:245:0x072f, B:251:0x0742, B:253:0x0748, B:260:0x0777, B:262:0x077d, B:264:0x079b, B:265:0x079d, B:266:0x07a5, B:268:0x07a9, B:270:0x07be, B:271:0x07c4, B:273:0x07ca, B:274:0x07ce, B:276:0x07d4, B:277:0x07d8, B:279:0x07e7, B:388:0x07a2, B:390:0x06ce, B:392:0x06de, B:394:0x06e8, B:396:0x0701, B:402:0x062f, B:404:0x0639, B:406:0x063f, B:407:0x0642, B:408:0x0646, B:410:0x0650, B:412:0x0656, B:414:0x065c, B:415:0x065f), top: B:418:0x05f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0695 A[Catch: Exception -> 0x0603, TryCatch #3 {Exception -> 0x0603, blocks: (B:419:0x05f3, B:421:0x05fd, B:199:0x0607, B:203:0x0615, B:205:0x061f, B:207:0x0625, B:208:0x0628, B:210:0x0665, B:212:0x066b, B:214:0x0671, B:215:0x0674, B:217:0x0679, B:219:0x067f, B:220:0x0682, B:223:0x068b, B:225:0x0695, B:227:0x06a5, B:229:0x06b1, B:231:0x06bd, B:235:0x0706, B:237:0x070c, B:238:0x070f, B:240:0x0718, B:241:0x071b, B:242:0x0725, B:245:0x072f, B:251:0x0742, B:253:0x0748, B:260:0x0777, B:262:0x077d, B:264:0x079b, B:265:0x079d, B:266:0x07a5, B:268:0x07a9, B:270:0x07be, B:271:0x07c4, B:273:0x07ca, B:274:0x07ce, B:276:0x07d4, B:277:0x07d8, B:279:0x07e7, B:388:0x07a2, B:390:0x06ce, B:392:0x06de, B:394:0x06e8, B:396:0x0701, B:402:0x062f, B:404:0x0639, B:406:0x063f, B:407:0x0642, B:408:0x0646, B:410:0x0650, B:412:0x0656, B:414:0x065c, B:415:0x065f), top: B:418:0x05f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x070c A[Catch: Exception -> 0x0603, TryCatch #3 {Exception -> 0x0603, blocks: (B:419:0x05f3, B:421:0x05fd, B:199:0x0607, B:203:0x0615, B:205:0x061f, B:207:0x0625, B:208:0x0628, B:210:0x0665, B:212:0x066b, B:214:0x0671, B:215:0x0674, B:217:0x0679, B:219:0x067f, B:220:0x0682, B:223:0x068b, B:225:0x0695, B:227:0x06a5, B:229:0x06b1, B:231:0x06bd, B:235:0x0706, B:237:0x070c, B:238:0x070f, B:240:0x0718, B:241:0x071b, B:242:0x0725, B:245:0x072f, B:251:0x0742, B:253:0x0748, B:260:0x0777, B:262:0x077d, B:264:0x079b, B:265:0x079d, B:266:0x07a5, B:268:0x07a9, B:270:0x07be, B:271:0x07c4, B:273:0x07ca, B:274:0x07ce, B:276:0x07d4, B:277:0x07d8, B:279:0x07e7, B:388:0x07a2, B:390:0x06ce, B:392:0x06de, B:394:0x06e8, B:396:0x0701, B:402:0x062f, B:404:0x0639, B:406:0x063f, B:407:0x0642, B:408:0x0646, B:410:0x0650, B:412:0x0656, B:414:0x065c, B:415:0x065f), top: B:418:0x05f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0718 A[Catch: Exception -> 0x0603, TryCatch #3 {Exception -> 0x0603, blocks: (B:419:0x05f3, B:421:0x05fd, B:199:0x0607, B:203:0x0615, B:205:0x061f, B:207:0x0625, B:208:0x0628, B:210:0x0665, B:212:0x066b, B:214:0x0671, B:215:0x0674, B:217:0x0679, B:219:0x067f, B:220:0x0682, B:223:0x068b, B:225:0x0695, B:227:0x06a5, B:229:0x06b1, B:231:0x06bd, B:235:0x0706, B:237:0x070c, B:238:0x070f, B:240:0x0718, B:241:0x071b, B:242:0x0725, B:245:0x072f, B:251:0x0742, B:253:0x0748, B:260:0x0777, B:262:0x077d, B:264:0x079b, B:265:0x079d, B:266:0x07a5, B:268:0x07a9, B:270:0x07be, B:271:0x07c4, B:273:0x07ca, B:274:0x07ce, B:276:0x07d4, B:277:0x07d8, B:279:0x07e7, B:388:0x07a2, B:390:0x06ce, B:392:0x06de, B:394:0x06e8, B:396:0x0701, B:402:0x062f, B:404:0x0639, B:406:0x063f, B:407:0x0642, B:408:0x0646, B:410:0x0650, B:412:0x0656, B:414:0x065c, B:415:0x065f), top: B:418:0x05f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x072f A[Catch: Exception -> 0x0603, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0603, blocks: (B:419:0x05f3, B:421:0x05fd, B:199:0x0607, B:203:0x0615, B:205:0x061f, B:207:0x0625, B:208:0x0628, B:210:0x0665, B:212:0x066b, B:214:0x0671, B:215:0x0674, B:217:0x0679, B:219:0x067f, B:220:0x0682, B:223:0x068b, B:225:0x0695, B:227:0x06a5, B:229:0x06b1, B:231:0x06bd, B:235:0x0706, B:237:0x070c, B:238:0x070f, B:240:0x0718, B:241:0x071b, B:242:0x0725, B:245:0x072f, B:251:0x0742, B:253:0x0748, B:260:0x0777, B:262:0x077d, B:264:0x079b, B:265:0x079d, B:266:0x07a5, B:268:0x07a9, B:270:0x07be, B:271:0x07c4, B:273:0x07ca, B:274:0x07ce, B:276:0x07d4, B:277:0x07d8, B:279:0x07e7, B:388:0x07a2, B:390:0x06ce, B:392:0x06de, B:394:0x06e8, B:396:0x0701, B:402:0x062f, B:404:0x0639, B:406:0x063f, B:407:0x0642, B:408:0x0646, B:410:0x0650, B:412:0x0656, B:414:0x065c, B:415:0x065f), top: B:418:0x05f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08d6 A[Catch: Exception -> 0x0a0c, TryCatch #1 {Exception -> 0x0a0c, blocks: (B:282:0x07ef, B:283:0x07fc, B:285:0x0802, B:287:0x080e, B:289:0x0816, B:291:0x0820, B:293:0x082e, B:294:0x0834, B:296:0x083a, B:298:0x0844, B:300:0x0852, B:301:0x0856, B:303:0x085c, B:305:0x0866, B:307:0x0874, B:308:0x0878, B:310:0x087e, B:312:0x0884, B:314:0x088e, B:316:0x0894, B:317:0x0897, B:318:0x089c, B:321:0x08a3, B:323:0x08a8, B:328:0x08ba, B:330:0x08c0, B:332:0x08d6, B:339:0x08e7, B:341:0x08f3, B:343:0x092a, B:345:0x093f, B:346:0x0945, B:348:0x094b, B:349:0x094f, B:351:0x0955, B:352:0x0959, B:354:0x0963, B:355:0x096f, B:357:0x0975, B:359:0x097f, B:363:0x098c, B:365:0x0992, B:367:0x099e, B:369:0x09d5, B:370:0x09e2, B:325:0x08b6), top: B:281:0x07ef }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0689  */
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
        char c10;
        Address address;
        Locale locale;
        String str2;
        List<Address> list;
        HashSet hashSet3;
        int i12;
        List<Address> list2;
        StringBuilder sb2;
        String str3;
        String thoroughfare;
        HashSet hashSet4;
        boolean z10;
        boolean z11;
        String countryName;
        HashSet hashSet5;
        StringBuilder sb3;
        boolean z12;
        StringBuilder sb4;
        boolean z13;
        String str4;
        int i13;
        TLRPC.User user;
        TLRPC.ChatParticipants chatParticipants;
        boolean z14;
        String str5;
        org.telegram.ui.ActionBar.m2 U;
        String str6 = "";
        int i14 = 4;
        char c11 = 2;
        int i15 = 0;
        switch (this.a) {
            case 0:
                o8 o8Var = (o8) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                HashSet hashSet6 = (HashSet) this.h;
                StringBuilder sb5 = new StringBuilder("StoriesList ");
                sb5.append(o8Var.e);
                sb5.append("{");
                sb5.append(o8Var.d);
                sb5.append("} preloadCache {");
                sb5.append(x8.a(arrayList));
                i2.d.v("}", sb5);
                ArrayList arrayList5 = o8Var.g;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                o8Var.t = false;
                int i16 = o8Var.c;
                MessagesController.getInstance(i16).putUsers(arrayList3, true);
                MessagesController.getInstance(i16).putChats(arrayList4, true);
                if (o8Var.v) {
                    o8Var.v = false;
                    o8Var.y = null;
                    o8Var.j();
                    break;
                } else {
                    o8Var.m.addAll(hashSet6);
                    o8Var.k.clear();
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        o8Var.t((MessageObject) arrayList.get(i17), true);
                    }
                    o8Var.d(false);
                    m8 m8Var = o8Var.y;
                    if (m8Var != null) {
                        m8Var.run(0);
                        o8Var.y = null;
                    }
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, o8Var);
                    break;
                }
            case 1:
                int[] iArr = (int[]) this.b;
                TLObject tLObject = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                ed edVar = (ed) this.f;
                cd cdVar = (cd) this.h;
                iArr[0] = 0;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        edVar.run();
                        break;
                    }
                }
                cdVar.run(null);
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
                    if (fromLocationName2 != null) {
                        c10 = c11;
                        if (i11 < fromLocationName2.size()) {
                            address = fromLocationName2.get(i11);
                            if (address2.hasLatitude() || !address2.hasLongitude()) {
                                locale = locale2;
                                str2 = str6;
                                list = fromLocationName2;
                                hashSet3 = hashSet2;
                                i12 = i11;
                                cVar = cVar2;
                                location = location2;
                                str = str8;
                                list2 = fromLocationName;
                            } else {
                                i12 = i11;
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
                                } catch (Exception unused3) {
                                    cVar = cVar2;
                                }
                                if (TextUtils.isEmpty(thoroughfare)) {
                                    hashSet4 = hashSet;
                                } else {
                                    hashSet4 = hashSet;
                                    if (!TextUtils.equals(thoroughfare, address2.getAdminArea())) {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(thoroughfare);
                                        z10 = false;
                                        if (TextUtils.isEmpty(str3)) {
                                            z11 = true;
                                        } else {
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
                                        }
                                        boolean z15 = z10;
                                        countryName = address2.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                            hashSet5 = hashSet2;
                                            sb3 = sb2;
                                            z12 = z11;
                                        } else {
                                            sb3 = sb2;
                                            z12 = z11;
                                            if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                                hashSet5 = hashSet2;
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
                                            hashSet5 = hashSet2;
                                            str4 = str2;
                                            int i18 = 0;
                                            while (i18 < length) {
                                                int i19 = i18;
                                                String str9 = split[i19];
                                                if (str9.length() > 0) {
                                                    i13 = length;
                                                    str4 = str4 + str9.charAt(0);
                                                } else {
                                                    i13 = length;
                                                }
                                                i18 = i19 + 1;
                                                length = i13;
                                            }
                                            if (sb7.length() > 0) {
                                            }
                                            sb7.append(str4);
                                            if (sb6.length() > 0) {
                                            }
                                            sb6.append(countryName);
                                        }
                                        if (cVar2.e) {
                                            StringBuilder sb8 = new StringBuilder();
                                            try {
                                                String addressLine = address2.getAddressLine(0);
                                                if (!TextUtils.isEmpty(addressLine)) {
                                                    sb8.append(addressLine);
                                                }
                                            } catch (Exception unused4) {
                                            }
                                            if (sb8.length() > 0) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint;
                                                tL_geoPoint.lat = latitude;
                                                tL_geoPoint._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb8.toString();
                                                tL_messageMediaVenue.icon = "pin";
                                                tL_messageMediaVenue.address = LocaleController.getString(R.string.PassportAddress);
                                                arrayList6.add(tL_messageMediaVenue);
                                            }
                                            cVar = cVar2;
                                            hashSet = hashSet4;
                                            hashSet3 = hashSet5;
                                        } else {
                                            if (sb3 == null || sb3.length() <= 0) {
                                                sb4 = sb7;
                                                cVar = cVar2;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                tL_geoPoint2.lat = latitude;
                                                tL_geoPoint2._long = longitude;
                                                tL_messageMediaVenue2.query_id = -1L;
                                                tL_messageMediaVenue2.title = sb3.toString();
                                                tL_messageMediaVenue2.icon = "pin";
                                                tL_messageMediaVenue2.address = LocaleController.getString(z15 ? R.string.PassportCity : R.string.PassportStreet1);
                                                if (address3 != null) {
                                                    TL_stories.TL_geoPointAddress tL_geoPointAddress = new TL_stories.TL_geoPointAddress();
                                                    tL_messageMediaVenue2.geoAddress = tL_geoPointAddress;
                                                    tL_geoPointAddress.country_iso2 = address3.getCountryCode();
                                                    String locality2 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address3.getAdminArea();
                                                    }
                                                    if (TextUtils.isEmpty(locality2)) {
                                                        locality2 = address3.getSubAdminArea();
                                                    }
                                                    String adminArea = address3.getAdminArea();
                                                    StringBuilder sb9 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        sb4 = sb7;
                                                        cVar = cVar2;
                                                    } else {
                                                        sb4 = sb7;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        cVar = cVar2;
                                                        try {
                                                            tL_geoPointAddress2.flags |= 1;
                                                        } catch (Exception unused5) {
                                                        }
                                                    }
                                                    if (!TextUtils.isEmpty(locality2)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue2.geoAddress;
                                                        tL_geoPointAddress3.city = locality2;
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
                                                            sb9 = null;
                                                        } else {
                                                            if (sb9.length() > 0) {
                                                                sb9.append(", ");
                                                            }
                                                            sb9.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            int i20 = 0;
                                                            while (true) {
                                                                String[] strArr = LocationController.unnamedRoads;
                                                                if (i20 < strArr.length) {
                                                                    if (strArr[i20].equalsIgnoreCase(sb9.toString())) {
                                                                        z13 = true;
                                                                    } else {
                                                                        i20++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z13 = false;
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue2.geoAddress;
                                                            tL_geoPointAddress4.flags |= 4;
                                                            tL_geoPointAddress4.street = sb9.toString();
                                                        }
                                                        if (!z13) {
                                                            arrayList6.add(tL_messageMediaVenue2);
                                                            if (arrayList6.size() >= i10) {
                                                                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 11));
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sb4 = sb7;
                                                    cVar = cVar2;
                                                }
                                                z13 = false;
                                                if (!z13) {
                                                }
                                            }
                                            if (z12) {
                                                hashSet3 = hashSet5;
                                            } else {
                                                hashSet3 = hashSet5;
                                                if (!hashSet3.contains(sb4.toString())) {
                                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue3 = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint3 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue3.geo = tL_geoPoint3;
                                                    tL_geoPoint3.lat = latitude;
                                                    tL_geoPoint3._long = longitude;
                                                    tL_messageMediaVenue3.query_id = -1L;
                                                    tL_messageMediaVenue3.title = sb4.toString();
                                                    tL_messageMediaVenue3.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                    tL_messageMediaVenue3.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                    hashSet3.add(tL_messageMediaVenue3.title);
                                                    tL_messageMediaVenue3.address = LocaleController.getString(R.string.PassportCity);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue3.geoAddress = tL_geoPointAddress5;
                                                        tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                                        String locality3 = TextUtils.isEmpty(null) ? address3.getLocality() : null;
                                                        if (TextUtils.isEmpty(locality3)) {
                                                            locality3 = address3.getAdminArea();
                                                        }
                                                        if (TextUtils.isEmpty(locality3)) {
                                                            locality3 = address3.getSubAdminArea();
                                                        }
                                                        String adminArea2 = address3.getAdminArea();
                                                        if (!TextUtils.isEmpty(adminArea2)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress6 = tL_messageMediaVenue3.geoAddress;
                                                            tL_geoPointAddress6.state = adminArea2;
                                                            tL_geoPointAddress6.flags |= 1;
                                                        }
                                                        if (!TextUtils.isEmpty(locality3)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress7 = tL_messageMediaVenue3.geoAddress;
                                                            tL_geoPointAddress7.city = locality3;
                                                            tL_geoPointAddress7.flags |= 2;
                                                        }
                                                    }
                                                    arrayList6.add(tL_messageMediaVenue3);
                                                    if (arrayList6.size() >= i10) {
                                                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 11));
                                                    }
                                                }
                                            }
                                            if (sb6.length() > 0) {
                                                hashSet = hashSet4;
                                                if (hashSet.contains(sb6.toString())) {
                                                    continue;
                                                } else {
                                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue4.geo = tL_geoPoint4;
                                                    tL_geoPoint4.lat = latitude;
                                                    tL_geoPoint4._long = longitude;
                                                    tL_messageMediaVenue4.query_id = -1L;
                                                    tL_messageMediaVenue4.title = sb6.toString();
                                                    tL_messageMediaVenue4.icon = "https://ss3.4sqi.net/img/categories_v2/building/government_capitolbuilding_64.png";
                                                    tL_messageMediaVenue4.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                    hashSet.add(tL_messageMediaVenue4.title);
                                                    tL_messageMediaVenue4.address = LocaleController.getString(R.string.Country);
                                                    if (address3 != null) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                        tL_messageMediaVenue4.geoAddress = tL_geoPointAddress8;
                                                        tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                                    }
                                                    arrayList6.add(tL_messageMediaVenue4);
                                                    if (arrayList6.size() >= i10) {
                                                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 11));
                                                    }
                                                }
                                            } else {
                                                hashSet = hashSet4;
                                            }
                                        }
                                    }
                                }
                                String subLocality = address2.getSubLocality();
                                if (TextUtils.isEmpty(subLocality)) {
                                    String locality4 = address2.getLocality();
                                    if (TextUtils.isEmpty(locality4) || TextUtils.equals(locality4, str3)) {
                                        z10 = true;
                                        sb2 = null;
                                        if (TextUtils.isEmpty(str3)) {
                                        }
                                        boolean z152 = z10;
                                        countryName = address2.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                        }
                                        if (cVar2.e) {
                                        }
                                    } else {
                                        if (sb2.length() > 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(locality4);
                                    }
                                } else {
                                    if (sb2.length() > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(subLocality);
                                }
                                z10 = false;
                                if (TextUtils.isEmpty(str3)) {
                                }
                                boolean z1522 = z10;
                                countryName = address2.getCountryName();
                                if (TextUtils.isEmpty(countryName)) {
                                }
                                if (cVar2.e) {
                                }
                            }
                            i11 = i12 + 1;
                            hashSet2 = hashSet3;
                            c11 = c10;
                            str6 = str2;
                            locale2 = locale;
                            fromLocationName2 = list;
                            location2 = location;
                            fromLocationName = list2;
                            str8 = str;
                            cVar2 = cVar;
                        }
                    } else {
                        c10 = c11;
                    }
                    address = null;
                    if (address2.hasLatitude()) {
                    }
                    locale = locale2;
                    str2 = str6;
                    list = fromLocationName2;
                    hashSet3 = hashSet2;
                    i12 = i11;
                    cVar = cVar2;
                    location = location2;
                    str = str8;
                    list2 = fromLocationName;
                    i11 = i12 + 1;
                    hashSet2 = hashSet3;
                    c11 = c10;
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
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList6, 11));
                break;
            case 3:
                hg.a1 a1Var = (hg.a1) this.b;
                String str10 = (String) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                hg.j1 j1Var = a1Var.e;
                String str11 = j1Var.q0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                            j1Var.R(user);
                            j1Var.t0 = 0;
                            break;
                        }
                    }
                    user = null;
                    j1Var.R(user);
                    j1Var.t0 = 0;
                }
                break;
            case 4:
                TLObject tLObject3 = (TLObject) this.b;
                String[] strArr2 = (String[]) this.c;
                final FrameLayout frameLayout = (FrameLayout) this.d;
                final da0 da0Var = (da0) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.h;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str12 = ((TL_phone.exportedGroupCallInvite) tLObject3).link;
                    strArr2[0] = str12;
                    if (str12.startsWith("https://")) {
                        str12 = str12.substring(8);
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(220L);
                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.m8
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
                                da0Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.e9(atomicBoolean, da0Var, str12));
                    duration.start();
                    new zc(e3Var.topBulletinContainer, c6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ac acVar = (org.telegram.ui.ac) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                org.telegram.ui.wa waVar = (org.telegram.ui.wa) this.h;
                TLRPC.Chat chat = acVar.f;
                acVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = acVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = acVar.getMessagesController().getChatFull(chat.id);
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
                waVar.run();
                break;
            case 6:
                fo foVar = (fo) this.b;
                pf.c cVar3 = (pf.c) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                String str13 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                cVar3.b();
                l80 I = l80.I(foVar, u1Var);
                cn0 cn0Var = new cn0(foVar.getParentActivity(), foVar.ea);
                I.p = new ye(cn0Var, i15);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ef(foVar, cn0Var, str13, 3), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i21);
                        i21++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new jd(9, foVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                cn0Var.e(I);
                cn0Var.f(u1Var, characterStyle, null, false);
                foVar.showDialog(cn0Var);
                break;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var2 = (org.telegram.ui.ActionBar.c6) this.d;
                di.d dVar = (di.d) this.e;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error2 != null) {
                    new zc(org.telegram.ui.Components.nb.a(context), c6Var2).f0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    e3Var2.dismiss();
                    new zc(org.telegram.ui.Components.nb.a(context), c6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable.run();
                    break;
                }
            case 8:
                uy0 uy0Var = (uy0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                TextView textView = (TextView) this.e;
                TextView textView2 = (TextView) this.f;
                int[] iArr2 = (int[]) this.h;
                uy0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    z14 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    uy0Var.n0(textView, editTextBoldCursor.getText().toString(), true);
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
                sn0.W((sn0) this.b, (TLRPC.TL_error) this.c, (String) this.d, (in0) this.e, (TLObject) this.f, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 10:
                i41.o((i41) this.b, (TLObject) this.c, (CharSequence) this.d, (TLRPC.TL_error) this.e, (byte[]) this.f, (String) this.h);
                break;
            case 11:
                TLObject tLObject6 = (TLObject) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.c6 c6Var3 = (org.telegram.ui.ActionBar.c6) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f;
                g90 g90Var = (g90) this.h;
                i41 i41Var = new i41(context2, c6Var3, 0L, bArr);
                i41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                i41Var.s = new c41(m2Var, context2, c6Var3, g90Var);
                i41Var.show();
                break;
            case 12:
                b81.S((b81) this.b, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 13:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) this.b;
                String str14 = (String) this.c;
                byte[] bArr2 = (byte[]) this.d;
                org.telegram.ui.Wallet.b2 b2Var = (org.telegram.ui.Wallet.b2) this.e;
                byte[] bArr3 = b2Var.b;
                f0 f0Var = (f0) this.f;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                org.telegram.ui.Wallet.k0 k0Var = e2Var.b;
                if (!TextUtils.equals(str14, k0Var.r()) || !Arrays.equals(bArr2, k0Var.w())) {
                    Arrays.fill(bArr3, (byte) 0);
                    f0Var.run(null, "Wallet changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                    inputtonconnectoauthsession.session_id = tonconnectsession.id;
                    inputtonconnectoauthsession.challenge_answer = bArr3;
                    inputtonconnectoauthsession.body = b2Var.c;
                    inputtonconnectoauthsession.proof = b2Var.d;
                    f0Var.run(inputtonconnectoauthsession, null);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Wallet.e2 e2Var2 = (org.telegram.ui.Wallet.e2) this.b;
                String str15 = (String) this.c;
                byte[] bArr4 = (byte[]) this.d;
                mt mtVar = (mt) this.e;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f;
                org.telegram.ui.Wallet.b2 b2Var2 = (org.telegram.ui.Wallet.b2) this.h;
                org.telegram.ui.Wallet.k0 k0Var2 = e2Var2.b;
                if (!TextUtils.equals(str15, k0Var2.r()) || !Arrays.equals(bArr4, k0Var2.w())) {
                    mtVar.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession2.id;
                    tonconnectclosesession.body = b2Var2.c;
                    e2Var2.f.sendRequestTyped(tonconnectclosesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.d(mtVar, i14));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Wallet.e2 e2Var3 = (org.telegram.ui.Wallet.e2) this.b;
                String str16 = (String) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.e;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.h;
                if (str16 != null) {
                    callback.run(str16);
                    break;
                } else if (!e2Var3.y(a2Var) || e2Var3.i(a2Var)) {
                    callback.run("Request expired or wallet changed");
                    break;
                } else {
                    e2Var3.f.sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new kf(e2Var3, callback, a2Var, h0Var, sendtransfer, 5));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.e2 e2Var4 = (org.telegram.ui.Wallet.e2) this.b;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.c;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.d;
                mt mtVar2 = (mt) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                String str17 = (String) this.h;
                if (!e2Var4.y(a2Var2) || e2Var4.i(a2Var2)) {
                    e2Var4.w(a2Var2, h0Var2, null, 0, "Request expired or wallet changed", mtVar2);
                    break;
                } else {
                    e2Var4.w(a2Var2, h0Var2, jSONObject, jSONObject == null ? 0 : -1, str17, mtVar2);
                    break;
                }
                break;
            case 17:
                a();
                break;
            case 18:
                b();
                break;
            case 19:
                c();
                break;
            case 20:
                d();
                break;
            case 21:
                f();
                break;
            case 22:
                g();
                break;
            case 23:
                h();
                break;
            case 24:
                i();
                break;
            case 25:
                j();
                break;
            case 26:
                k();
                break;
            default:
                zh.e5 e5Var = (zh.e5) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                zh.f5 f5Var = (zh.f5) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                long j10 = e5Var.b;
                int i22 = e5Var.a;
                HashMap hashMap = e5Var.h;
                ArrayList arrayList11 = e5Var.e;
                e5Var.k = false;
                if (tLObject7 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject7;
                    arrayList11.remove(tL_starGiftCollection);
                    arrayList11.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i23 = tL_starGiftCollection2.collection_id;
                    f5Var.d = i23;
                    hashMap.put(Integer.valueOf(i23), f5Var);
                    e5Var.j();
                    NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var);
                    if (callback2 != null) {
                        callback2.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error3 != null && (U = LaunchActivity.U()) != null) {
                        zc.a0(U).f0(tL_error3, false);
                    }
                    arrayList11.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    e5Var.j();
                    NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), e5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k8(org.telegram.ui.ac acVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.wa waVar) {
        this.a = 5;
        this.b = acVar;
        this.f = channelParticipant;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = waVar;
    }
}
