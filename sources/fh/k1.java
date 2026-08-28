package fh;

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
import gh.l7;
import gh.n7;
import gh.v7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.qc;
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
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ke;
import org.telegram.ui.l61;
import org.telegram.ui.nm0;
import org.telegram.ui.oa;
import org.telegram.ui.pb;
import org.telegram.ui.qe;
import org.telegram.ui.qn;
import org.telegram.ui.r21;
import org.telegram.ui.rd;
import org.telegram.ui.ri;
import org.telegram.ui.tk0;
import org.telegram.ui.wm0;
import org.telegram.ui.y21;
import org.telegram.ui.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k1(v7 v7Var, Object obj, MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Utilities.Callback callback, int i9) {
        this.a = i9;
        this.d = v7Var;
        this.e = obj;
        this.b = messageObject;
        this.f = inputInvoice;
        this.c = tL_payments_paymentFormStars;
        this.h = callback;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.b;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
        byte[] bArr = (byte[]) this.f;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.h;
        jg0 jg0Var = (jg0) this.c;
        y21 y21Var = new y21(context, b6Var, 0L, bArr);
        y21Var.N((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject);
        y21Var.s = new r21(o2Var, context, b6Var, jg0Var);
        y21Var.show();
    }

    private final void b() {
        l61.Q((l61) this.d, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.e, (TLRPC.User) this.b, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
    }

    private final void c() {
        org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
        TLObject tLObject = (TLObject) this.b;
        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.e;
        String str = (String) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        String str2 = (String) this.h;
        org.telegram.ui.ActionBar.b6 b6Var = y0Var.e;
        if (tLObject == null) {
            if (tL_error != null) {
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    new oc(y0Var, b6Var).d0(tL_error, false);
                    return;
                }
                new oc(y0Var, b6Var).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Gi, b6Var)), R.raw.error).j();
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            tk0.b(false, y0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject, null, null, null, false, y0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            tk0.b(false, y0Var.I, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject, null, null, null, false, y0Var);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            org.telegram.ui.Components.y4.p0(y0Var.getContext(), str, false, true, true, false, 0L, null, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0205, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023e, code lost:
    
        if (r8.creator != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023a, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0475 A[Catch: Exception -> 0x0410, TryCatch #0 {Exception -> 0x0410, blocks: (B:350:0x0400, B:352:0x040a, B:135:0x0413, B:138:0x0421, B:140:0x042b, B:142:0x0431, B:143:0x0434, B:145:0x046f, B:147:0x0475, B:149:0x047b, B:150:0x047e, B:152:0x0483, B:154:0x0489, B:155:0x048c, B:158:0x0495, B:160:0x049f, B:162:0x04af, B:164:0x04bb, B:166:0x04c7, B:170:0x0510, B:172:0x0516, B:173:0x0519, B:175:0x0522, B:176:0x0525, B:177:0x052f, B:322:0x04d8, B:324:0x04e8, B:326:0x04f2, B:328:0x050b, B:334:0x0439, B:336:0x0443, B:338:0x0449, B:339:0x044c, B:340:0x0450, B:342:0x045a, B:344:0x0460, B:346:0x0466, B:347:0x0469), top: B:349:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x049f A[Catch: Exception -> 0x0410, TryCatch #0 {Exception -> 0x0410, blocks: (B:350:0x0400, B:352:0x040a, B:135:0x0413, B:138:0x0421, B:140:0x042b, B:142:0x0431, B:143:0x0434, B:145:0x046f, B:147:0x0475, B:149:0x047b, B:150:0x047e, B:152:0x0483, B:154:0x0489, B:155:0x048c, B:158:0x0495, B:160:0x049f, B:162:0x04af, B:164:0x04bb, B:166:0x04c7, B:170:0x0510, B:172:0x0516, B:173:0x0519, B:175:0x0522, B:176:0x0525, B:177:0x052f, B:322:0x04d8, B:324:0x04e8, B:326:0x04f2, B:328:0x050b, B:334:0x0439, B:336:0x0443, B:338:0x0449, B:339:0x044c, B:340:0x0450, B:342:0x045a, B:344:0x0460, B:346:0x0466, B:347:0x0469), top: B:349:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0516 A[Catch: Exception -> 0x0410, TryCatch #0 {Exception -> 0x0410, blocks: (B:350:0x0400, B:352:0x040a, B:135:0x0413, B:138:0x0421, B:140:0x042b, B:142:0x0431, B:143:0x0434, B:145:0x046f, B:147:0x0475, B:149:0x047b, B:150:0x047e, B:152:0x0483, B:154:0x0489, B:155:0x048c, B:158:0x0495, B:160:0x049f, B:162:0x04af, B:164:0x04bb, B:166:0x04c7, B:170:0x0510, B:172:0x0516, B:173:0x0519, B:175:0x0522, B:176:0x0525, B:177:0x052f, B:322:0x04d8, B:324:0x04e8, B:326:0x04f2, B:328:0x050b, B:334:0x0439, B:336:0x0443, B:338:0x0449, B:339:0x044c, B:340:0x0450, B:342:0x045a, B:344:0x0460, B:346:0x0466, B:347:0x0469), top: B:349:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0522 A[Catch: Exception -> 0x0410, TryCatch #0 {Exception -> 0x0410, blocks: (B:350:0x0400, B:352:0x040a, B:135:0x0413, B:138:0x0421, B:140:0x042b, B:142:0x0431, B:143:0x0434, B:145:0x046f, B:147:0x0475, B:149:0x047b, B:150:0x047e, B:152:0x0483, B:154:0x0489, B:155:0x048c, B:158:0x0495, B:160:0x049f, B:162:0x04af, B:164:0x04bb, B:166:0x04c7, B:170:0x0510, B:172:0x0516, B:173:0x0519, B:175:0x0522, B:176:0x0525, B:177:0x052f, B:322:0x04d8, B:324:0x04e8, B:326:0x04f2, B:328:0x050b, B:334:0x0439, B:336:0x0443, B:338:0x0449, B:339:0x044c, B:340:0x0450, B:342:0x045a, B:344:0x0460, B:346:0x0466, B:347:0x0469), top: B:349:0x0400 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06dc A[Catch: Exception -> 0x080e, TryCatch #1 {Exception -> 0x080e, blocks: (B:308:0x0539, B:314:0x054c, B:316:0x0552, B:181:0x057f, B:183:0x0585, B:185:0x05a3, B:186:0x05a5, B:187:0x05ad, B:189:0x05b1, B:191:0x05c6, B:192:0x05cc, B:194:0x05d2, B:195:0x05d6, B:197:0x05dc, B:198:0x05e0, B:200:0x05ef, B:201:0x0602, B:203:0x0608, B:205:0x0614, B:207:0x061c, B:209:0x0626, B:211:0x0634, B:212:0x063a, B:214:0x0640, B:216:0x064a, B:218:0x0658, B:219:0x065c, B:221:0x0662, B:223:0x066c, B:225:0x067a, B:226:0x067e, B:228:0x0684, B:230:0x068a, B:232:0x0694, B:234:0x069a, B:235:0x069d, B:236:0x06a2, B:239:0x06a9, B:241:0x06ae, B:246:0x06c0, B:248:0x06c6, B:250:0x06dc, B:253:0x06f3, B:255:0x06fd, B:257:0x0734, B:259:0x0749, B:260:0x074f, B:262:0x0755, B:263:0x0759, B:265:0x075f, B:266:0x0763, B:268:0x076d, B:269:0x0777, B:271:0x077d, B:273:0x0787, B:279:0x0792, B:284:0x0798, B:286:0x07a4, B:288:0x07db, B:289:0x07e8, B:243:0x06bc, B:305:0x05aa), top: B:307:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0734 A[Catch: Exception -> 0x080e, TryCatch #1 {Exception -> 0x080e, blocks: (B:308:0x0539, B:314:0x054c, B:316:0x0552, B:181:0x057f, B:183:0x0585, B:185:0x05a3, B:186:0x05a5, B:187:0x05ad, B:189:0x05b1, B:191:0x05c6, B:192:0x05cc, B:194:0x05d2, B:195:0x05d6, B:197:0x05dc, B:198:0x05e0, B:200:0x05ef, B:201:0x0602, B:203:0x0608, B:205:0x0614, B:207:0x061c, B:209:0x0626, B:211:0x0634, B:212:0x063a, B:214:0x0640, B:216:0x064a, B:218:0x0658, B:219:0x065c, B:221:0x0662, B:223:0x066c, B:225:0x067a, B:226:0x067e, B:228:0x0684, B:230:0x068a, B:232:0x0694, B:234:0x069a, B:235:0x069d, B:236:0x06a2, B:239:0x06a9, B:241:0x06ae, B:246:0x06c0, B:248:0x06c6, B:250:0x06dc, B:253:0x06f3, B:255:0x06fd, B:257:0x0734, B:259:0x0749, B:260:0x074f, B:262:0x0755, B:263:0x0759, B:265:0x075f, B:266:0x0763, B:268:0x076d, B:269:0x0777, B:271:0x077d, B:273:0x0787, B:279:0x0792, B:284:0x0798, B:286:0x07a4, B:288:0x07db, B:289:0x07e8, B:243:0x06bc, B:305:0x05aa), top: B:307:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0790 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0798 A[Catch: Exception -> 0x080e, TryCatch #1 {Exception -> 0x080e, blocks: (B:308:0x0539, B:314:0x054c, B:316:0x0552, B:181:0x057f, B:183:0x0585, B:185:0x05a3, B:186:0x05a5, B:187:0x05ad, B:189:0x05b1, B:191:0x05c6, B:192:0x05cc, B:194:0x05d2, B:195:0x05d6, B:197:0x05dc, B:198:0x05e0, B:200:0x05ef, B:201:0x0602, B:203:0x0608, B:205:0x0614, B:207:0x061c, B:209:0x0626, B:211:0x0634, B:212:0x063a, B:214:0x0640, B:216:0x064a, B:218:0x0658, B:219:0x065c, B:221:0x0662, B:223:0x066c, B:225:0x067a, B:226:0x067e, B:228:0x0684, B:230:0x068a, B:232:0x0694, B:234:0x069a, B:235:0x069d, B:236:0x06a2, B:239:0x06a9, B:241:0x06ae, B:246:0x06c0, B:248:0x06c6, B:250:0x06dc, B:253:0x06f3, B:255:0x06fd, B:257:0x0734, B:259:0x0749, B:260:0x074f, B:262:0x0755, B:263:0x0759, B:265:0x075f, B:266:0x0763, B:268:0x076d, B:269:0x0777, B:271:0x077d, B:273:0x0787, B:279:0x0792, B:284:0x0798, B:286:0x07a4, B:288:0x07db, B:289:0x07e8, B:243:0x06bc, B:305:0x05aa), top: B:307:0x0539 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0539 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0493  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.o2 U;
        of.c cVar;
        Location location;
        String str;
        int i9;
        List<Address> fromLocationName;
        List<Address> fromLocationName2;
        HashSet hashSet;
        HashSet hashSet2;
        int i10;
        Address address;
        Locale locale;
        List<Address> list;
        String str2;
        int i11;
        int i12;
        List<Address> list2;
        StringBuilder sb2;
        String str3;
        String thoroughfare;
        boolean z10;
        boolean z11;
        String countryName;
        HashSet hashSet3;
        StringBuilder sb3;
        boolean z12;
        StringBuilder sb4;
        StringBuilder sb5;
        boolean z13;
        String str4;
        int i13;
        TLRPC.User user;
        TLRPC.ChatParticipants chatParticipants;
        String str5;
        int i14 = 8;
        String str6 = "";
        int i15 = 2;
        boolean z14 = true;
        int i16 = 0;
        switch (this.a) {
            case 0:
                p2.O((p2) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLObject) this.b, (g1) this.f, (Utilities.Callback) this.h, (TLRPC.TL_error) this.c);
                break;
            case 1:
                gh.k5.c1((gh.k5) this.d, (TLObject) this.b, (CharSequence) this.e, (TL_stars.TL_starGiftUnique) this.f, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.h, (TLRPC.TL_error) this.c);
                break;
            case 2:
                gh.k5.w0((gh.k5) this.d, (TLObject) this.b, (bg.g3[]) this.e, (Long) this.f, (androidx.car.app.utils.b) this.h, (TLRPC.TL_error) this.c);
                break;
            case 3:
                v7 v7Var = (v7) this.d;
                List list3 = (List) this.e;
                bg.y0 y0Var = (bg.y0) this.b;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.f;
                n2.g gVar = (n2.g) this.h;
                Activity activity = (Activity) this.c;
                if (list3.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new gh.z5(y0Var, 0));
                    break;
                } else {
                    n2.l lVar = (n2.l) list3.get(0);
                    if (lVar.a() == null) {
                        AndroidUtilities.runOnUIThread(new gh.z5(y0Var, 1));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(v7Var.a).sendRequest(tL_payments_canPurchaseStore, new bg.n0(lVar, gVar, (Utilities.Callback2) y0Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list3, 2));
                        break;
                    }
                }
            case 4:
                v7 v7Var2 = (v7) this.d;
                Runnable runnable = (Runnable) this.e;
                MessageObject messageObject = (MessageObject) this.b;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (v7Var2.e) {
                    v7Var2.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
                    break;
                } else {
                    v7.e("NO_BALANCE");
                    runnable.run();
                    break;
                }
            case 5:
                v7 v7Var3 = (v7) this.d;
                TLObject tLObject = (TLObject) this.b;
                MessageObject messageObject2 = (MessageObject) this.e;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.f;
                ri riVar = (ri) this.h;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                    v7Var3.Y(messageObject2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, riVar, null);
                } else {
                    v7.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
                }
                riVar.run();
                break;
            case 6:
                v7 v7Var4 = (v7) this.d;
                boolean[] zArr = (boolean[]) this.e;
                MessageObject messageObject3 = (MessageObject) this.b;
                TLRPC.InputInvoice inputInvoice2 = (TLRPC.InputInvoice) this.f;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = (TLRPC.TL_payments_paymentFormStars) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                zArr[0] = true;
                v7Var4.a0(messageObject3, inputInvoice2, tL_payments_paymentFormStars2, new gh.p1(1, callback2));
                break;
            case 7:
                l7 l7Var = (l7) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.e;
                n7 n7Var = (n7) this.f;
                Utilities.Callback callback3 = (Utilities.Callback) this.h;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                long j10 = l7Var.b;
                int i17 = l7Var.a;
                HashMap hashMap = l7Var.h;
                ArrayList arrayList = l7Var.e;
                l7Var.k = false;
                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                    arrayList.remove(tL_starGiftCollection);
                    arrayList.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i18 = tL_starGiftCollection2.collection_id;
                    n7Var.d = i18;
                    hashMap.put(Integer.valueOf(i18), n7Var);
                    l7Var.j();
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var);
                    if (callback3 != null) {
                        callback3.run(tL_starGiftCollection2);
                        break;
                    }
                } else {
                    if (tL_error2 != null && (U = LaunchActivity.U()) != null) {
                        oc.a0(U).d0(tL_error2, false);
                    }
                    arrayList.remove(tL_starGiftCollection);
                    hashMap.remove(-1);
                    l7Var.j();
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var);
                    break;
                }
                break;
            case 8:
                ih.n6 n6Var = (ih.n6) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.b;
                ArrayList<TLRPC.User> arrayList4 = (ArrayList) this.f;
                ArrayList<TLRPC.Chat> arrayList5 = (ArrayList) this.h;
                HashSet hashSet4 = (HashSet) this.c;
                StringBuilder sb6 = new StringBuilder("StoriesList ");
                sb6.append(n6Var.e);
                sb6.append("{");
                sb6.append(n6Var.d);
                sb6.append("} preloadCache {");
                sb6.append(ih.v6.a(arrayList2));
                j3.r0.x("}", sb6);
                ArrayList arrayList6 = n6Var.g;
                arrayList6.clear();
                arrayList6.addAll(arrayList3);
                n6Var.t = false;
                int i19 = n6Var.c;
                MessagesController.getInstance(i19).putUsers(arrayList4, true);
                MessagesController.getInstance(i19).putChats(arrayList5, true);
                if (n6Var.v) {
                    n6Var.v = false;
                    n6Var.y = null;
                    n6Var.j();
                    break;
                } else {
                    n6Var.m.addAll(hashSet4);
                    n6Var.k.clear();
                    for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                        n6Var.t((MessageObject) arrayList2.get(i20), true);
                    }
                    n6Var.d(false);
                    ih.m6 m6Var = n6Var.y;
                    if (m6Var != null) {
                        m6Var.run(0);
                        n6Var.y = null;
                    }
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, n6Var);
                    break;
                }
            case 9:
                int[] iArr = (int[]) this.d;
                TLObject tLObject3 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.e;
                TLRPC.User[] userArr = (TLRPC.User[]) this.f;
                qc qcVar = (qc) this.h;
                kh.oc ocVar = (kh.oc) this.c;
                iArr[0] = 0;
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        qcVar.run();
                        break;
                    }
                }
                ocVar.run(null);
                break;
            case 10:
                of.c cVar2 = (of.c) this.d;
                Locale locale2 = (Locale) this.e;
                String str7 = (String) this.b;
                Locale locale3 = (Locale) this.f;
                Location location2 = (Location) this.h;
                String str8 = (String) this.c;
                ArrayList arrayList7 = new ArrayList();
                try {
                    i9 = cVar2.e ? 10 : 5;
                    fromLocationName = new Geocoder(ApplicationLoader.applicationContext, locale2).getFromLocationName(str7, 5);
                    fromLocationName2 = cVar2.d ? new Geocoder(ApplicationLoader.applicationContext, locale3).getFromLocationName(str7, 5) : null;
                    hashSet = new HashSet();
                    hashSet2 = new HashSet();
                    i10 = 0;
                } catch (Exception unused) {
                }
                while (i10 < fromLocationName.size()) {
                    Address address2 = fromLocationName.get(i10);
                    if (fromLocationName2 != null && i10 < fromLocationName2.size()) {
                        address = fromLocationName2.get(i10);
                        if (address2.hasLatitude() || !address2.hasLongitude()) {
                            locale = locale2;
                            list = fromLocationName2;
                            str2 = str6;
                            i11 = i9;
                            location = location2;
                            str = str8;
                            i12 = i10;
                            list2 = fromLocationName;
                            cVar = cVar2;
                        } else {
                            int i21 = i9;
                            double latitude = address2.getLatitude();
                            locale = locale2;
                            list = fromLocationName2;
                            double longitude = address2.getLongitude();
                            str2 = str6;
                            StringBuilder sb7 = new StringBuilder();
                            Address address3 = address;
                            StringBuilder sb8 = new StringBuilder();
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
                                i12 = i10;
                                thoroughfare = address2.getThoroughfare();
                                list2 = fromLocationName;
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
                                            if (sb8.length() > 0) {
                                                sb8.append(", ");
                                            }
                                            sb8.append(str3);
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
                                                hashSet3 = hashSet;
                                                str4 = countryName;
                                                if (sb8.length() > 0) {
                                                    sb8.append(", ");
                                                }
                                                sb8.append(str4);
                                                if (sb7.length() > 0) {
                                                    sb7.append(", ");
                                                }
                                                sb7.append(countryName);
                                            }
                                            String[] split = countryName.split(" ");
                                            int length = split.length;
                                            hashSet3 = hashSet;
                                            str4 = str2;
                                            int i22 = 0;
                                            while (i22 < length) {
                                                int i23 = i22;
                                                String str9 = split[i23];
                                                if (str9.length() > 0) {
                                                    i13 = length;
                                                    str4 = str4 + str9.charAt(0);
                                                } else {
                                                    i13 = length;
                                                }
                                                i22 = i23 + 1;
                                                length = i13;
                                            }
                                            if (sb8.length() > 0) {
                                            }
                                            sb8.append(str4);
                                            if (sb7.length() > 0) {
                                            }
                                            sb7.append(countryName);
                                        } else {
                                            hashSet3 = hashSet;
                                            sb3 = sb2;
                                            z12 = z11;
                                        }
                                        cVar = cVar2;
                                        if (cVar2.e) {
                                            if (sb3 == null || sb3.length() <= 0) {
                                                sb4 = sb7;
                                                sb5 = sb8;
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
                                                    StringBuilder sb9 = new StringBuilder();
                                                    if (TextUtils.isEmpty(adminArea)) {
                                                        sb4 = sb7;
                                                        sb5 = sb8;
                                                    } else {
                                                        sb4 = sb7;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        sb5 = sb8;
                                                        tL_geoPointAddress2.flags |= 1;
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
                                                            sb9 = null;
                                                        } else {
                                                            if (sb9.length() > 0) {
                                                                sb9.append(", ");
                                                            }
                                                            sb9.append(thoroughfare2);
                                                        }
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            int i24 = 0;
                                                            while (true) {
                                                                String[] strArr = LocationController.unnamedRoads;
                                                                if (i24 < strArr.length) {
                                                                    if (strArr[i24].equalsIgnoreCase(sb9.toString())) {
                                                                        z13 = true;
                                                                    } else {
                                                                        i24++;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        z13 = false;
                                                        if (!TextUtils.isEmpty(sb9)) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress4 = tL_messageMediaVenue.geoAddress;
                                                            tL_geoPointAddress4.flags |= 4;
                                                            tL_geoPointAddress4.street = sb9.toString();
                                                        }
                                                        if (!z13) {
                                                            arrayList7.add(tL_messageMediaVenue);
                                                            i11 = i21;
                                                            if (arrayList7.size() >= i11) {
                                                                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(cVar, location, str, arrayList7, 21));
                                                                break;
                                                            }
                                                            if (!z12 && !hashSet2.contains(sb5.toString())) {
                                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                                TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                                tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                                tL_geoPoint2.lat = latitude;
                                                                tL_geoPoint2._long = longitude;
                                                                tL_messageMediaVenue2.query_id = -1L;
                                                                tL_messageMediaVenue2.title = sb5.toString();
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
                                                                arrayList7.add(tL_messageMediaVenue2);
                                                                if (arrayList7.size() >= i11) {
                                                                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(cVar, location, str, arrayList7, 21));
                                                                }
                                                            }
                                                            if (sb4.length() > 0) {
                                                                hashSet = hashSet3;
                                                                if (hashSet.contains(sb4.toString())) {
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
                                                                    hashSet.add(tL_messageMediaVenue3.title);
                                                                    tL_messageMediaVenue3.address = LocaleController.getString(R.string.Country);
                                                                    if (address3 != null) {
                                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress8 = new TL_stories.TL_geoPointAddress();
                                                                        tL_messageMediaVenue3.geoAddress = tL_geoPointAddress8;
                                                                        tL_geoPointAddress8.country_iso2 = address3.getCountryCode();
                                                                    }
                                                                    arrayList7.add(tL_messageMediaVenue3);
                                                                    if (arrayList7.size() >= i11) {
                                                                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(cVar, location, str, arrayList7, 21));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sb4 = sb7;
                                                    sb5 = sb8;
                                                }
                                                z13 = false;
                                                if (!z13) {
                                                }
                                            }
                                            i11 = i21;
                                            if (!z12) {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue22 = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint22 = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue22.geo = tL_geoPoint22;
                                                tL_geoPoint22.lat = latitude;
                                                tL_geoPoint22._long = longitude;
                                                tL_messageMediaVenue22.query_id = -1L;
                                                tL_messageMediaVenue22.title = sb5.toString();
                                                tL_messageMediaVenue22.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                tL_messageMediaVenue22.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue22.title);
                                                tL_messageMediaVenue22.address = LocaleController.getString(R.string.PassportCity);
                                                if (address3 != null) {
                                                }
                                                arrayList7.add(tL_messageMediaVenue22);
                                                if (arrayList7.size() >= i11) {
                                                }
                                            }
                                            if (sb4.length() > 0) {
                                            }
                                        } else {
                                            try {
                                                StringBuilder sb10 = new StringBuilder();
                                                try {
                                                    String addressLine = address2.getAddressLine(0);
                                                    if (!TextUtils.isEmpty(addressLine)) {
                                                        sb10.append(addressLine);
                                                    }
                                                } catch (Exception unused4) {
                                                }
                                                if (sb10.length() > 0) {
                                                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue4 = new TLRPC.TL_messageMediaVenue();
                                                    TLRPC.TL_geoPoint tL_geoPoint4 = new TLRPC.TL_geoPoint();
                                                    tL_messageMediaVenue4.geo = tL_geoPoint4;
                                                    tL_geoPoint4.lat = latitude;
                                                    tL_geoPoint4._long = longitude;
                                                    tL_messageMediaVenue4.query_id = -1L;
                                                    tL_messageMediaVenue4.title = sb10.toString();
                                                    tL_messageMediaVenue4.icon = "pin";
                                                    tL_messageMediaVenue4.address = LocaleController.getString(R.string.PassportAddress);
                                                    arrayList7.add(tL_messageMediaVenue4);
                                                }
                                                i11 = i21;
                                            } catch (Exception unused5) {
                                            }
                                        }
                                        hashSet = hashSet3;
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
                            cVar = cVar2;
                            if (cVar2.e) {
                            }
                            hashSet = hashSet3;
                        }
                        i9 = i11;
                        cVar2 = cVar;
                        locale2 = locale;
                        fromLocationName2 = list;
                        str6 = str2;
                        location2 = location;
                        str8 = str;
                        fromLocationName = list2;
                        i10 = i12 + 1;
                    }
                    address = null;
                    if (address2.hasLatitude()) {
                    }
                    locale = locale2;
                    list = fromLocationName2;
                    str2 = str6;
                    i11 = i9;
                    location = location2;
                    str = str8;
                    i12 = i10;
                    list2 = fromLocationName;
                    cVar = cVar2;
                    i9 = i11;
                    cVar2 = cVar;
                    locale2 = locale;
                    fromLocationName2 = list;
                    str6 = str2;
                    location2 = location;
                    str8 = str;
                    fromLocationName = list2;
                    i10 = i12 + 1;
                }
                cVar = cVar2;
                location = location2;
                str = str8;
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(cVar, location, str, arrayList7, 21));
                break;
            case 11:
                of.x0 x0Var = (of.x0) this.d;
                String str10 = (String) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                MessagesController messagesController2 = (MessagesController) this.f;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                of.f1 f1Var = x0Var.e;
                String str11 = f1Var.m0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error3 == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                            f1Var.R(user);
                            f1Var.p0 = 0;
                            break;
                        }
                    }
                    user = null;
                    f1Var.R(user);
                    f1Var.p0 = 0;
                }
                break;
            case 12:
                TLObject tLObject5 = (TLObject) this.b;
                String[] strArr2 = (String[]) this.d;
                final FrameLayout frameLayout = (FrameLayout) this.e;
                final l80 l80Var = (l80) this.f;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.h;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.c;
                if (tLObject5 instanceof TL_phone.exportedGroupCallInvite) {
                    final String str12 = ((TL_phone.exportedGroupCallInvite) tLObject5).link;
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
                                l80Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new z8(atomicBoolean, l80Var, str12));
                    duration.start();
                    new oc(f3Var.topBulletinContainer, b6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 13:
                pb pbVar = (pb) this.d;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.e;
                ArrayList arrayList8 = (ArrayList) this.b;
                ArrayList arrayList9 = (ArrayList) this.f;
                ArrayList arrayList10 = (ArrayList) this.h;
                oa oaVar = (oa) this.c;
                TLRPC.Chat chat = pbVar.s;
                pbVar.Z = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = pbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = pbVar.getMessagesController().getChatFull(chat.id);
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
                        arrayList8.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.Cells.j2.j(R.drawable.msg_block2, 33, arrayList9, arrayList10);
                    }
                    arrayList8.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.Cells.j2.j(R.drawable.msg_block, 35, arrayList9, arrayList10);
                }
                oaVar.run();
                break;
            case 14:
                qn qnVar = (qn) this.d;
                ve.d dVar = (ve.d) this.e;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f;
                String str13 = (String) this.h;
                TLObject tLObject6 = (TLObject) this.b;
                CharacterStyle characterStyle = (CharacterStyle) this.c;
                dVar.b();
                x60 I = x60.I(qnVar, t1Var);
                ll0 ll0Var = new ll0(qnVar.getParentActivity(), qnVar.aa);
                I.p = new ke(ll0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new qe(qnVar, ll0Var, str13, i15), false);
                if (tLObject6 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject6;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList11 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList11.size();
                    int i25 = 0;
                    while (i25 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList11.get(i25);
                        i25++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new rd(i14, qnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                ll0Var.e(I);
                ll0Var.f(t1Var, characterStyle, null, false);
                qnVar.showDialog(ll0Var);
                break;
            case 15:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) this.e;
                kh.d dVar2 = (kh.d) this.b;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.f;
                Runnable runnable2 = (Runnable) this.h;
                if (tL_error4 != null) {
                    new oc(cb.a(context), b6Var2).d0(tL_error4, false);
                    break;
                } else {
                    dVar2.setLoading(false);
                    f3Var2.dismiss();
                    new oc(cb.a(context), b6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable2.run();
                    break;
                }
            case 16:
                cx0 cx0Var = (cx0) this.d;
                TLObject tLObject7 = (TLObject) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.c;
                cx0Var.getClass();
                if (!(tLObject7 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject7).short_name) == null) {
                    z14 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    cx0Var.l0(textView, editTextBoldCursor.getText().toString(), true);
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (!z14) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 17:
                wm0.V((wm0) this.d, (TLRPC.TL_error) this.c, (String) this.e, (nm0) this.f, (TLObject) this.b, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 18:
                y21.n((y21) this.d, (TLObject) this.b, (CharSequence) this.e, (TLRPC.TL_error) this.c, (byte[]) this.f, (String) this.h);
                break;
            case 19:
                a();
                break;
            case 20:
                b();
                break;
            case 21:
                c();
                break;
            default:
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) this.d;
                File file = (File) this.b;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                String str14 = (String) this.f;
                String str15 = (String) this.h;
                String str16 = (String) this.c;
                if (file == null) {
                    c2Var.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.globalQueue.postRunnable(new ue0(file, iArr3, new bg.k0(y0Var2, iArr3, file, c2Var, str14, str15, str16, 13), 22));
                    break;
                }
        }
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9, boolean z10) {
        this.a = i9;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.c = obj6;
    }

    public /* synthetic */ k1(of.x0 x0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.a = 11;
        this.d = x0Var;
        this.e = str;
        this.c = tL_error;
        this.b = tLObject;
        this.f = messagesController;
        this.h = messagesStorage;
    }

    public /* synthetic */ k1(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i9) {
        this.a = i9;
        this.b = tLObject;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
        this.c = obj5;
    }

    public /* synthetic */ k1(TLRPC.TL_error tL_error, Context context, org.telegram.ui.ActionBar.b6 b6Var, kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, Runnable runnable) {
        this.a = 15;
        this.c = tL_error;
        this.d = context;
        this.e = b6Var;
        this.b = dVar;
        this.f = f3Var;
        this.h = runnable;
    }

    public /* synthetic */ k1(qn qnVar, ve.d dVar, org.telegram.ui.Cells.t1 t1Var, String str, TLObject tLObject, CharacterStyle characterStyle) {
        this.a = 14;
        this.d = qnVar;
        this.e = dVar;
        this.f = t1Var;
        this.h = str;
        this.b = tLObject;
        this.c = characterStyle;
    }

    public /* synthetic */ k1(wm0 wm0Var, TLRPC.TL_error tL_error, String str, nm0 nm0Var, TLObject tLObject, TL_account.sendVerifyPhoneCode sendverifyphonecode) {
        this.a = 17;
        this.d = wm0Var;
        this.c = tL_error;
        this.e = str;
        this.f = nm0Var;
        this.b = tLObject;
        this.h = sendverifyphonecode;
    }

    public /* synthetic */ k1(y21 y21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        this.a = 18;
        this.d = y21Var;
        this.b = tLObject;
        this.e = charSequence;
        this.c = tL_error;
        this.f = bArr;
        this.h = str;
    }

    public /* synthetic */ k1(l61 l61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        this.a = 20;
        this.d = l61Var;
        this.c = tL_error;
        this.e = inputCheckPasswordSRP;
        this.b = user;
        this.f = twoStepVerificationActivity;
        this.h = tL_channels_editCreator;
    }

    public /* synthetic */ k1(org.telegram.ui.web.y0 y0Var, TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error, String str2) {
        this.a = 21;
        this.d = y0Var;
        this.b = tLObject;
        this.e = tL_messages_requestUrlAuth;
        this.f = str;
        this.c = tL_error;
        this.h = str2;
    }
}
