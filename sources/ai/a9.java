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
import ci.ed;
import ci.gd;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.c41;
import org.telegram.ui.cj;
import org.telegram.ui.df;
import org.telegram.ui.dn0;
import org.telegram.ui.ft;
import org.telegram.ui.mh1;
import org.telegram.ui.ml0;
import org.telegram.ui.nn0;
import org.telegram.ui.se;
import org.telegram.ui.sg;
import org.telegram.ui.u71;
import org.telegram.ui.w31;
import org.telegram.ui.ye;
import org.telegram.ui.ze;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a9(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
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
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
        String str = (String) this.e;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.e6 e6Var = b1Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new ad(b1Var, e6Var).f0(tL_error, false);
                    return;
                }
                new ad(b1Var, e6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, e6Var)), R.raw.error).j();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            ml0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, b1Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            ml0.b(false, b1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, b1Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.g5.o0(b1Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    private final void c() {
        org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.b;
        File file = (File) this.c;
        org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
        String str = (String) this.e;
        String str2 = (String) this.f;
        String str3 = (String) this.h;
        if (file == null) {
            b2Var.c(500L);
            return;
        }
        int[] iArr = new int[11];
        Utilities.globalQueue.postRunnable(new og0(file, iArr, new ze(b1Var, iArr, file, b2Var, str, str2, str3, 10), 20));
    }

    private final void e() {
        xh.r1.Q((xh.r1) this.b, (org.telegram.ui.ActionBar.b2) this.c, (TLObject) this.d, (qg.f2) this.e, (Utilities.Callback) this.f, (TLRPC.TL_error) this.h);
    }

    private final void f() {
        yh.s3.d1((yh.s3) this.b, (TLObject) this.c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f, (TLRPC.TL_error) this.h);
    }

    private final void g() {
        yh.s3.z0((yh.s3) this.b, (TLObject) this.c, (tg.m1[]) this.d, (Long) this.e, (tg.q) this.f, (TLRPC.TL_error) this.h);
    }

    private final void h() {
        yh.m5 m5Var = (yh.m5) this.b;
        List list = (List) this.c;
        qh.r rVar = (qh.r) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.h hVar = (c5.h) this.f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yh.e4(rVar, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new yh.e4(rVar, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(m5Var.a).sendRequest(tL_payments_canPurchaseStore, new mh1(oVar, hVar, rVar, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void i() {
        yh.m5 m5Var = (yh.m5) this.b;
        Runnable runnable = (Runnable) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (m5Var.e) {
            m5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
        } else {
            yh.m5.e("NO_BALANCE");
            runnable.run();
        }
    }

    private final void j() {
        yh.m5 m5Var = (yh.m5) this.b;
        TLObject tLObject = (TLObject) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        cj cjVar = (cj) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            m5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, cjVar, null);
        } else {
            yh.m5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        cjVar.run();
    }

    private final void k() {
        yh.m5 m5Var = (yh.m5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        zArr[0] = true;
        m5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new yh.v0(1, callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f1, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x042a, code lost:
    
        if (r7.creator != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0426, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0669 A[Catch: Exception -> 0x0601, TryCatch #4 {Exception -> 0x0601, blocks: (B:419:0x05f1, B:421:0x05fb, B:199:0x0605, B:203:0x0613, B:205:0x061d, B:207:0x0623, B:208:0x0626, B:210:0x0663, B:212:0x0669, B:214:0x066f, B:215:0x0672, B:217:0x0677, B:219:0x067d, B:220:0x0680, B:223:0x0689, B:225:0x0693, B:227:0x06a3, B:229:0x06af, B:231:0x06bb, B:235:0x0704, B:237:0x070a, B:238:0x070d, B:240:0x0716, B:241:0x0719, B:242:0x0723, B:245:0x072d, B:251:0x0740, B:253:0x0746, B:260:0x0775, B:262:0x077b, B:264:0x0799, B:265:0x079b, B:266:0x07a3, B:268:0x07a7, B:270:0x07bc, B:271:0x07c2, B:273:0x07c8, B:274:0x07cc, B:276:0x07d2, B:277:0x07d6, B:279:0x07e5, B:388:0x07a0, B:390:0x06cc, B:392:0x06dc, B:394:0x06e6, B:396:0x06ff, B:402:0x062d, B:404:0x0637, B:406:0x063d, B:407:0x0640, B:408:0x0644, B:410:0x064e, B:412:0x0654, B:414:0x065a, B:415:0x065d), top: B:418:0x05f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0693 A[Catch: Exception -> 0x0601, TryCatch #4 {Exception -> 0x0601, blocks: (B:419:0x05f1, B:421:0x05fb, B:199:0x0605, B:203:0x0613, B:205:0x061d, B:207:0x0623, B:208:0x0626, B:210:0x0663, B:212:0x0669, B:214:0x066f, B:215:0x0672, B:217:0x0677, B:219:0x067d, B:220:0x0680, B:223:0x0689, B:225:0x0693, B:227:0x06a3, B:229:0x06af, B:231:0x06bb, B:235:0x0704, B:237:0x070a, B:238:0x070d, B:240:0x0716, B:241:0x0719, B:242:0x0723, B:245:0x072d, B:251:0x0740, B:253:0x0746, B:260:0x0775, B:262:0x077b, B:264:0x0799, B:265:0x079b, B:266:0x07a3, B:268:0x07a7, B:270:0x07bc, B:271:0x07c2, B:273:0x07c8, B:274:0x07cc, B:276:0x07d2, B:277:0x07d6, B:279:0x07e5, B:388:0x07a0, B:390:0x06cc, B:392:0x06dc, B:394:0x06e6, B:396:0x06ff, B:402:0x062d, B:404:0x0637, B:406:0x063d, B:407:0x0640, B:408:0x0644, B:410:0x064e, B:412:0x0654, B:414:0x065a, B:415:0x065d), top: B:418:0x05f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x070a A[Catch: Exception -> 0x0601, TryCatch #4 {Exception -> 0x0601, blocks: (B:419:0x05f1, B:421:0x05fb, B:199:0x0605, B:203:0x0613, B:205:0x061d, B:207:0x0623, B:208:0x0626, B:210:0x0663, B:212:0x0669, B:214:0x066f, B:215:0x0672, B:217:0x0677, B:219:0x067d, B:220:0x0680, B:223:0x0689, B:225:0x0693, B:227:0x06a3, B:229:0x06af, B:231:0x06bb, B:235:0x0704, B:237:0x070a, B:238:0x070d, B:240:0x0716, B:241:0x0719, B:242:0x0723, B:245:0x072d, B:251:0x0740, B:253:0x0746, B:260:0x0775, B:262:0x077b, B:264:0x0799, B:265:0x079b, B:266:0x07a3, B:268:0x07a7, B:270:0x07bc, B:271:0x07c2, B:273:0x07c8, B:274:0x07cc, B:276:0x07d2, B:277:0x07d6, B:279:0x07e5, B:388:0x07a0, B:390:0x06cc, B:392:0x06dc, B:394:0x06e6, B:396:0x06ff, B:402:0x062d, B:404:0x0637, B:406:0x063d, B:407:0x0640, B:408:0x0644, B:410:0x064e, B:412:0x0654, B:414:0x065a, B:415:0x065d), top: B:418:0x05f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0716 A[Catch: Exception -> 0x0601, TryCatch #4 {Exception -> 0x0601, blocks: (B:419:0x05f1, B:421:0x05fb, B:199:0x0605, B:203:0x0613, B:205:0x061d, B:207:0x0623, B:208:0x0626, B:210:0x0663, B:212:0x0669, B:214:0x066f, B:215:0x0672, B:217:0x0677, B:219:0x067d, B:220:0x0680, B:223:0x0689, B:225:0x0693, B:227:0x06a3, B:229:0x06af, B:231:0x06bb, B:235:0x0704, B:237:0x070a, B:238:0x070d, B:240:0x0716, B:241:0x0719, B:242:0x0723, B:245:0x072d, B:251:0x0740, B:253:0x0746, B:260:0x0775, B:262:0x077b, B:264:0x0799, B:265:0x079b, B:266:0x07a3, B:268:0x07a7, B:270:0x07bc, B:271:0x07c2, B:273:0x07c8, B:274:0x07cc, B:276:0x07d2, B:277:0x07d6, B:279:0x07e5, B:388:0x07a0, B:390:0x06cc, B:392:0x06dc, B:394:0x06e6, B:396:0x06ff, B:402:0x062d, B:404:0x0637, B:406:0x063d, B:407:0x0640, B:408:0x0644, B:410:0x064e, B:412:0x0654, B:414:0x065a, B:415:0x065d), top: B:418:0x05f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x072d A[Catch: Exception -> 0x0601, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0601, blocks: (B:419:0x05f1, B:421:0x05fb, B:199:0x0605, B:203:0x0613, B:205:0x061d, B:207:0x0623, B:208:0x0626, B:210:0x0663, B:212:0x0669, B:214:0x066f, B:215:0x0672, B:217:0x0677, B:219:0x067d, B:220:0x0680, B:223:0x0689, B:225:0x0693, B:227:0x06a3, B:229:0x06af, B:231:0x06bb, B:235:0x0704, B:237:0x070a, B:238:0x070d, B:240:0x0716, B:241:0x0719, B:242:0x0723, B:245:0x072d, B:251:0x0740, B:253:0x0746, B:260:0x0775, B:262:0x077b, B:264:0x0799, B:265:0x079b, B:266:0x07a3, B:268:0x07a7, B:270:0x07bc, B:271:0x07c2, B:273:0x07c8, B:274:0x07cc, B:276:0x07d2, B:277:0x07d6, B:279:0x07e5, B:388:0x07a0, B:390:0x06cc, B:392:0x06dc, B:394:0x06e6, B:396:0x06ff, B:402:0x062d, B:404:0x0637, B:406:0x063d, B:407:0x0640, B:408:0x0644, B:410:0x064e, B:412:0x0654, B:414:0x065a, B:415:0x065d), top: B:418:0x05f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x08d4 A[Catch: Exception -> 0x0a0a, TryCatch #2 {Exception -> 0x0a0a, blocks: (B:282:0x07ed, B:283:0x07fa, B:285:0x0800, B:287:0x080c, B:289:0x0814, B:291:0x081e, B:293:0x082c, B:294:0x0832, B:296:0x0838, B:298:0x0842, B:300:0x0850, B:301:0x0854, B:303:0x085a, B:305:0x0864, B:307:0x0872, B:308:0x0876, B:310:0x087c, B:312:0x0882, B:314:0x088c, B:316:0x0892, B:317:0x0895, B:318:0x089a, B:321:0x08a1, B:323:0x08a6, B:328:0x08b8, B:330:0x08be, B:332:0x08d4, B:339:0x08e5, B:341:0x08f1, B:343:0x0928, B:345:0x093d, B:346:0x0943, B:348:0x0949, B:349:0x094d, B:351:0x0953, B:352:0x0957, B:354:0x0961, B:355:0x096d, B:357:0x0973, B:359:0x097d, B:363:0x098a, B:365:0x0990, B:367:0x099c, B:369:0x09d3, B:370:0x09e0, B:325:0x08b4), top: B:281:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0687  */
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
        org.telegram.ui.ActionBar.n2 U;
        String str6 = "";
        int i14 = 4;
        char c11 = 2;
        int i15 = 0;
        switch (this.a) {
            case 0:
                e9 e9Var = (e9) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                HashSet hashSet6 = (HashSet) this.h;
                StringBuilder sb5 = new StringBuilder("StoriesList ");
                sb5.append(e9Var.e);
                sb5.append("{");
                sb5.append(e9Var.d);
                sb5.append("} preloadCache {");
                sb5.append(m9.a(arrayList));
                hg.c.t("}", sb5);
                ArrayList arrayList5 = e9Var.g;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                e9Var.t = false;
                int i16 = e9Var.c;
                MessagesController.getInstance(i16).putUsers(arrayList3, true);
                MessagesController.getInstance(i16).putChats(arrayList4, true);
                if (e9Var.v) {
                    e9Var.v = false;
                    e9Var.y = null;
                    e9Var.j();
                    break;
                } else {
                    e9Var.m.addAll(hashSet6);
                    e9Var.k.clear();
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        e9Var.t((MessageObject) arrayList.get(i17), true);
                    }
                    e9Var.d(false);
                    c9 c9Var = e9Var.y;
                    if (c9Var != null) {
                        c9Var.run(0);
                        e9Var.y = null;
                    }
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, e9Var);
                    break;
                }
            case 1:
                int[] iArr = (int[]) this.b;
                TLObject tLObject = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                gd gdVar = (gd) this.f;
                ed edVar = (ed) this.h;
                iArr[0] = 0;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        gdVar.run();
                        break;
                    }
                }
                edVar.run(null);
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
                                                                AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
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
                                                        AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
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
                                                        AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
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
                AndroidUtilities.runOnUIThread(new i5(cVar, location, str, arrayList6, 11));
                break;
            case 3:
                gg.a1 a1Var = (gg.a1) this.b;
                String str10 = (String) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                gg.j1 j1Var = a1Var.e;
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
                final ea0 ea0Var = (ea0) this.e;
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
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.h8
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
                                ea0Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.a9(atomicBoolean, ea0Var, str12));
                    duration.start();
                    new ad(f3Var.topBulletinContainer, e6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
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
                of.e eVar = (of.e) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                String str13 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                eVar.b();
                p80 I = p80.I(znVar, u1Var);
                gn0 gn0Var = new gn0(znVar.getParentActivity(), znVar.ea);
                I.p = new se(gn0Var, i15);
                int i21 = 3;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new ye(znVar, gn0Var, str13, i21), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i22 = 0;
                    while (i22 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i22);
                        i22++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new sg(i21, znVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                gn0Var.e(I);
                gn0Var.f(u1Var, characterStyle, null, false);
                znVar.showDialog(gn0Var);
                break;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) this.d;
                ci.d dVar = (ci.d) this.e;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error2 != null) {
                    new ad(org.telegram.ui.Components.ob.a(context), e6Var2).f0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    f3Var2.dismiss();
                    new ad(org.telegram.ui.Components.ob.a(context), e6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable.run();
                    break;
                }
            case 8:
                xy0 xy0Var = (xy0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                TextView textView = (TextView) this.e;
                TextView textView2 = (TextView) this.f;
                int[] iArr2 = (int[]) this.h;
                xy0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    z14 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    xy0Var.n0(textView, editTextBoldCursor.getText().toString(), true);
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
                nn0.W((nn0) this.b, (TLRPC.TL_error) this.c, (String) this.d, (dn0) this.e, (TLObject) this.f, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 10:
                c41.p((c41) this.b, (TLObject) this.c, (CharSequence) this.d, (TLRPC.TL_error) this.e, (byte[]) this.f, (String) this.h);
                break;
            case 11:
                TLObject tLObject6 = (TLObject) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f;
                ci0 ci0Var = (ci0) this.h;
                c41 c41Var = new c41(context2, e6Var3, 0L, bArr);
                c41Var.P((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                c41Var.s = new w31(n2Var, context2, e6Var3, ci0Var);
                c41Var.show();
                break;
            case 12:
                u71.S((u71) this.b, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 13:
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) this.b;
                String str14 = (String) this.c;
                byte[] bArr2 = (byte[]) this.d;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) this.e;
                byte[] bArr3 = a2Var.b;
                m0 m0Var = (m0) this.f;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.h;
                org.telegram.ui.Wallet.k0 k0Var = d2Var.b;
                if (!TextUtils.equals(str14, k0Var.r()) || !Arrays.equals(bArr2, k0Var.w())) {
                    Arrays.fill(bArr3, (byte) 0);
                    m0Var.run(null, "Wallet changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = new TL_wallet.inputTonConnectOauthSession();
                    inputtonconnectoauthsession.session_id = tonconnectsession.id;
                    inputtonconnectoauthsession.challenge_answer = bArr3;
                    inputtonconnectoauthsession.body = a2Var.c;
                    inputtonconnectoauthsession.proof = a2Var.d;
                    m0Var.run(inputtonconnectoauthsession, null);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Wallet.d2 d2Var2 = (org.telegram.ui.Wallet.d2) this.b;
                String str15 = (String) this.c;
                byte[] bArr4 = (byte[]) this.d;
                ft ftVar = (ft) this.e;
                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) this.f;
                org.telegram.ui.Wallet.a2 a2Var2 = (org.telegram.ui.Wallet.a2) this.h;
                org.telegram.ui.Wallet.k0 k0Var2 = d2Var2.b;
                if (!TextUtils.equals(str15, k0Var2.r()) || !Arrays.equals(bArr4, k0Var2.w())) {
                    ftVar.run("Wallet or TON Connect session changed. Open the request again.");
                    break;
                } else {
                    TL_wallet.tonConnectCloseSession tonconnectclosesession = new TL_wallet.tonConnectCloseSession();
                    tonconnectclosesession.session_id = tonconnectsession2.id;
                    tonconnectclosesession.body = a2Var2.c;
                    d2Var2.f.sendRequestTyped(tonconnectclosesession, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.d(ftVar, i14));
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Wallet.d2 d2Var3 = (org.telegram.ui.Wallet.d2) this.b;
                String str16 = (String) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.e;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) this.f;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) this.h;
                if (str16 != null) {
                    callback.run(str16);
                    break;
                } else if (!d2Var3.y(z1Var) || d2Var3.i(z1Var)) {
                    callback.run("Request expired or wallet changed");
                    break;
                } else {
                    d2Var3.f.sendRequestTyped(sendtransfer, new org.telegram.messenger.a(), new df(d2Var3, callback, z1Var, h0Var, sendtransfer, 5));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Wallet.d2 d2Var4 = (org.telegram.ui.Wallet.d2) this.b;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) this.c;
                org.telegram.ui.Wallet.h0 h0Var2 = (org.telegram.ui.Wallet.h0) this.d;
                ft ftVar2 = (ft) this.e;
                JSONObject jSONObject = (JSONObject) this.f;
                String str17 = (String) this.h;
                if (!d2Var4.y(z1Var2) || d2Var4.i(z1Var2)) {
                    d2Var4.w(z1Var2, h0Var2, null, 0, "Request expired or wallet changed", ftVar2);
                    break;
                } else {
                    d2Var4.w(z1Var2, h0Var2, jSONObject, jSONObject == null ? 0 : -1, str17, ftVar2);
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
                e();
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
                yh.d5 d5Var = (yh.d5) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                yh.e5 e5Var = (yh.e5) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.h;
                long j3 = d5Var.b;
                int i23 = d5Var.a;
                HashMap hashMap = d5Var.h;
                ArrayList arrayList11 = d5Var.e;
                d5Var.k = false;
                if (tLObject7 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject7;
                    arrayList11.remove(tL_starGiftCollection);
                    arrayList11.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i24 = tL_starGiftCollection2.collection_id;
                    e5Var.d = i24;
                    hashMap.put(Integer.valueOf(i24), e5Var);
                    d5Var.j();
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var);
                    if (callback2 != null) {
                        callback2.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error3 != null && (U = LaunchActivity.U()) != null) {
                        ad.a0(U).f0(tL_error3, false);
                    }
                    arrayList11.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    d5Var.j();
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), d5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a9(org.telegram.ui.vb vbVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.sa saVar) {
        this.a = 5;
        this.b = vbVar;
        this.f = channelParticipant;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = saVar;
    }
}
