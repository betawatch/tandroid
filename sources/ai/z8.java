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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.vw;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.aj;
import org.telegram.ui.cl0;
import org.telegram.ui.dh1;
import org.telegram.ui.fh;
import org.telegram.ui.gn0;
import org.telegram.ui.k71;
import org.telegram.ui.n31;
import org.telegram.ui.qe;
import org.telegram.ui.t31;
import org.telegram.ui.wm0;
import org.telegram.ui.wn;
import org.telegram.ui.xe;
import org.telegram.ui.ye;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
        yh.s5 s5Var = (yh.s5) this.b;
        List list = (List) this.c;
        m0 m0Var = (m0) this.d;
        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
        c5.h hVar = (c5.h) this.f;
        Activity activity = (Activity) this.h;
        if (list.isEmpty()) {
            AndroidUtilities.runOnUIThread(new yh.j4(m0Var, 0));
            return;
        }
        c5.o oVar = (c5.o) list.get(0);
        if (oVar.a() == null) {
            AndroidUtilities.runOnUIThread(new yh.j4(m0Var, 1));
            return;
        }
        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
        ConnectionsManager.getInstance(s5Var.a).sendRequest(tL_payments_canPurchaseStore, new dh1(oVar, hVar, m0Var, activity, tL_inputStorePaymentStarsGiveaway, list, 3));
    }

    private final void b() {
        yh.s5 s5Var = (yh.s5) this.b;
        Runnable runnable = (Runnable) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        if (s5Var.e) {
            s5Var.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable, callback);
        } else {
            yh.s5.e("NO_BALANCE");
            runnable.run();
        }
    }

    private final void c() {
        yh.s5 s5Var = (yh.s5) this.b;
        TLObject tLObject = (TLObject) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        aj ajVar = (aj) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            s5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, ajVar, null);
        } else {
            yh.s5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        ajVar.run();
    }

    private final void e() {
        yh.s5 s5Var = (yh.s5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        zArr[0] = true;
        s5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new yh.w0(1, callback));
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x03f1, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x042a, code lost:
    
        if (r8.creator != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0426, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0665 A[Catch: Exception -> 0x05fe, TryCatch #0 {Exception -> 0x05fe, blocks: (B:398:0x05ee, B:400:0x05f8, B:182:0x0602, B:185:0x0610, B:187:0x061a, B:189:0x0620, B:190:0x0623, B:192:0x065f, B:194:0x0665, B:196:0x066b, B:197:0x066e, B:199:0x0673, B:201:0x0679, B:202:0x067c, B:205:0x0685, B:207:0x068f, B:209:0x069f, B:211:0x06ab, B:213:0x06b7, B:217:0x0700, B:219:0x0706, B:220:0x0709, B:222:0x0712, B:223:0x0715, B:224:0x071f, B:227:0x0729, B:233:0x073c, B:235:0x0742, B:243:0x0771, B:245:0x0777, B:247:0x0795, B:248:0x0797, B:249:0x079f, B:251:0x07a3, B:253:0x07b6, B:254:0x07bd, B:256:0x07c3, B:257:0x07c7, B:259:0x07cd, B:260:0x07d1, B:368:0x079c, B:370:0x06c8, B:372:0x06d8, B:374:0x06e2, B:376:0x06fb, B:382:0x0628, B:384:0x0632, B:386:0x0638, B:387:0x063b, B:388:0x063f, B:390:0x0649, B:392:0x064f, B:394:0x0655, B:395:0x0658), top: B:397:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x068f A[Catch: Exception -> 0x05fe, TryCatch #0 {Exception -> 0x05fe, blocks: (B:398:0x05ee, B:400:0x05f8, B:182:0x0602, B:185:0x0610, B:187:0x061a, B:189:0x0620, B:190:0x0623, B:192:0x065f, B:194:0x0665, B:196:0x066b, B:197:0x066e, B:199:0x0673, B:201:0x0679, B:202:0x067c, B:205:0x0685, B:207:0x068f, B:209:0x069f, B:211:0x06ab, B:213:0x06b7, B:217:0x0700, B:219:0x0706, B:220:0x0709, B:222:0x0712, B:223:0x0715, B:224:0x071f, B:227:0x0729, B:233:0x073c, B:235:0x0742, B:243:0x0771, B:245:0x0777, B:247:0x0795, B:248:0x0797, B:249:0x079f, B:251:0x07a3, B:253:0x07b6, B:254:0x07bd, B:256:0x07c3, B:257:0x07c7, B:259:0x07cd, B:260:0x07d1, B:368:0x079c, B:370:0x06c8, B:372:0x06d8, B:374:0x06e2, B:376:0x06fb, B:382:0x0628, B:384:0x0632, B:386:0x0638, B:387:0x063b, B:388:0x063f, B:390:0x0649, B:392:0x064f, B:394:0x0655, B:395:0x0658), top: B:397:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0706 A[Catch: Exception -> 0x05fe, TryCatch #0 {Exception -> 0x05fe, blocks: (B:398:0x05ee, B:400:0x05f8, B:182:0x0602, B:185:0x0610, B:187:0x061a, B:189:0x0620, B:190:0x0623, B:192:0x065f, B:194:0x0665, B:196:0x066b, B:197:0x066e, B:199:0x0673, B:201:0x0679, B:202:0x067c, B:205:0x0685, B:207:0x068f, B:209:0x069f, B:211:0x06ab, B:213:0x06b7, B:217:0x0700, B:219:0x0706, B:220:0x0709, B:222:0x0712, B:223:0x0715, B:224:0x071f, B:227:0x0729, B:233:0x073c, B:235:0x0742, B:243:0x0771, B:245:0x0777, B:247:0x0795, B:248:0x0797, B:249:0x079f, B:251:0x07a3, B:253:0x07b6, B:254:0x07bd, B:256:0x07c3, B:257:0x07c7, B:259:0x07cd, B:260:0x07d1, B:368:0x079c, B:370:0x06c8, B:372:0x06d8, B:374:0x06e2, B:376:0x06fb, B:382:0x0628, B:384:0x0632, B:386:0x0638, B:387:0x063b, B:388:0x063f, B:390:0x0649, B:392:0x064f, B:394:0x0655, B:395:0x0658), top: B:397:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0712 A[Catch: Exception -> 0x05fe, TryCatch #0 {Exception -> 0x05fe, blocks: (B:398:0x05ee, B:400:0x05f8, B:182:0x0602, B:185:0x0610, B:187:0x061a, B:189:0x0620, B:190:0x0623, B:192:0x065f, B:194:0x0665, B:196:0x066b, B:197:0x066e, B:199:0x0673, B:201:0x0679, B:202:0x067c, B:205:0x0685, B:207:0x068f, B:209:0x069f, B:211:0x06ab, B:213:0x06b7, B:217:0x0700, B:219:0x0706, B:220:0x0709, B:222:0x0712, B:223:0x0715, B:224:0x071f, B:227:0x0729, B:233:0x073c, B:235:0x0742, B:243:0x0771, B:245:0x0777, B:247:0x0795, B:248:0x0797, B:249:0x079f, B:251:0x07a3, B:253:0x07b6, B:254:0x07bd, B:256:0x07c3, B:257:0x07c7, B:259:0x07cd, B:260:0x07d1, B:368:0x079c, B:370:0x06c8, B:372:0x06d8, B:374:0x06e2, B:376:0x06fb, B:382:0x0628, B:384:0x0632, B:386:0x0638, B:387:0x063b, B:388:0x063f, B:390:0x0649, B:392:0x064f, B:394:0x0655, B:395:0x0658), top: B:397:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0729 A[Catch: Exception -> 0x05fe, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x05fe, blocks: (B:398:0x05ee, B:400:0x05f8, B:182:0x0602, B:185:0x0610, B:187:0x061a, B:189:0x0620, B:190:0x0623, B:192:0x065f, B:194:0x0665, B:196:0x066b, B:197:0x066e, B:199:0x0673, B:201:0x0679, B:202:0x067c, B:205:0x0685, B:207:0x068f, B:209:0x069f, B:211:0x06ab, B:213:0x06b7, B:217:0x0700, B:219:0x0706, B:220:0x0709, B:222:0x0712, B:223:0x0715, B:224:0x071f, B:227:0x0729, B:233:0x073c, B:235:0x0742, B:243:0x0771, B:245:0x0777, B:247:0x0795, B:248:0x0797, B:249:0x079f, B:251:0x07a3, B:253:0x07b6, B:254:0x07bd, B:256:0x07c3, B:257:0x07c7, B:259:0x07cd, B:260:0x07d1, B:368:0x079c, B:370:0x06c8, B:372:0x06d8, B:374:0x06e2, B:376:0x06fb, B:382:0x0628, B:384:0x0632, B:386:0x0638, B:387:0x063b, B:388:0x063f, B:390:0x0649, B:392:0x064f, B:394:0x0655, B:395:0x0658), top: B:397:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x08cf A[Catch: Exception -> 0x0a03, TryCatch #4 {Exception -> 0x0a03, blocks: (B:264:0x07e2, B:265:0x07f5, B:267:0x07fb, B:269:0x0807, B:271:0x080d, B:273:0x0817, B:275:0x0825, B:276:0x082c, B:278:0x0832, B:280:0x083c, B:282:0x084a, B:283:0x084e, B:285:0x0854, B:287:0x085e, B:289:0x086c, B:290:0x0870, B:292:0x0876, B:294:0x087c, B:296:0x0886, B:298:0x088c, B:299:0x088f, B:300:0x0895, B:303:0x089c, B:305:0x08a1, B:310:0x08b3, B:312:0x08b9, B:314:0x08cf, B:321:0x08e0, B:323:0x08ec, B:325:0x0923, B:327:0x0936, B:328:0x093d, B:330:0x0943, B:331:0x0947, B:333:0x094d, B:334:0x0951, B:336:0x095b, B:337:0x0967, B:339:0x096d, B:341:0x0977, B:345:0x0984, B:347:0x098a, B:349:0x0996, B:351:0x09cd, B:352:0x09da, B:307:0x08af), top: B:263:0x07e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0683  */
    /* JADX WARN: Type inference failed for: r18v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r3v61, types: [android.location.Address] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
        TLRPC.User user;
        Address address;
        ?? r18;
        Locale locale;
        String str2;
        List<Address> list;
        HashSet hashSet3;
        HashSet hashSet4;
        int i12;
        List<Address> list2;
        StringBuilder sb2;
        String str3;
        String thoroughfare;
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
        TLRPC.ChatParticipants chatParticipants;
        boolean z14;
        String str5;
        org.telegram.ui.ActionBar.m2 U;
        String str6 = "";
        TLRPC.User user2 = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                d9 d9Var = (d9) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList4 = (ArrayList) this.f;
                HashSet hashSet6 = (HashSet) this.h;
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
                int i15 = d9Var.c;
                MessagesController.getInstance(i15).putUsers(arrayList3, true);
                MessagesController.getInstance(i15).putChats(arrayList4, true);
                if (d9Var.v) {
                    d9Var.v = false;
                    d9Var.y = null;
                    d9Var.j();
                    break;
                } else {
                    d9Var.m.addAll(hashSet6);
                    d9Var.k.clear();
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        d9Var.t((MessageObject) arrayList.get(i16), true);
                    }
                    d9Var.d(false);
                    b9 b9Var = d9Var.y;
                    if (b9Var != null) {
                        b9Var.run(0);
                        d9Var.y = null;
                    }
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, d9Var);
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
                    TLRPC.User user3 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user3;
                    if (user3 != null) {
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
                        TLRPC.User user4 = user2;
                        user = user4;
                        if (i11 < fromLocationName2.size()) {
                            address = fromLocationName2.get(i11);
                            r18 = user4;
                            if (address2.hasLatitude() || !address2.hasLongitude()) {
                                locale = locale2;
                                str2 = str6;
                                list = fromLocationName2;
                                hashSet3 = hashSet;
                                hashSet4 = hashSet2;
                                cVar = cVar2;
                                location = location2;
                                str = str8;
                                i12 = i11;
                                list2 = fromLocationName;
                            } else {
                                HashSet hashSet7 = hashSet2;
                                double latitude = address2.getLatitude();
                                locale = locale2;
                                str2 = str6;
                                double longitude = address2.getLongitude();
                                Address address3 = address;
                                StringBuilder sb6 = new StringBuilder();
                                list = fromLocationName2;
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
                                    i12 = i11;
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
                                            sb2 = r18;
                                            z10 = true;
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
                                                    hashSet5 = hashSet;
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
                                                hashSet5 = hashSet;
                                                str4 = str2;
                                                int i17 = 0;
                                                while (i17 < length) {
                                                    int i18 = i17;
                                                    String str9 = split[i18];
                                                    if (str9.length() > 0) {
                                                        i13 = length;
                                                        str4 = str4 + str9.charAt(0);
                                                    } else {
                                                        i13 = length;
                                                    }
                                                    i17 = i18 + 1;
                                                    length = i13;
                                                }
                                                if (sb7.length() > 0) {
                                                }
                                                sb7.append(str4);
                                                if (sb6.length() > 0) {
                                                }
                                                sb6.append(countryName);
                                            } else {
                                                hashSet5 = hashSet;
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
                                                        String locality3 = TextUtils.isEmpty(r18) ? address3.getLocality() : r18;
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
                                                            String thoroughfare2 = (!TextUtils.isEmpty(r18) || TextUtils.equals(address3.getThoroughfare(), str3) || TextUtils.equals(address3.getThoroughfare(), address3.getCountryName())) ? r18 : address3.getThoroughfare();
                                                            if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getSubLocality(), str3) && !TextUtils.equals(address3.getSubLocality(), address3.getCountryName())) {
                                                                thoroughfare2 = address3.getSubLocality();
                                                            }
                                                            if (TextUtils.isEmpty(thoroughfare2) && !TextUtils.equals(address3.getLocality(), str3) && !TextUtils.equals(address3.getLocality(), address3.getCountryName())) {
                                                                thoroughfare2 = address3.getLocality();
                                                            }
                                                            if (TextUtils.isEmpty(thoroughfare2) || TextUtils.equals(thoroughfare2, adminArea) || TextUtils.equals(thoroughfare2, address3.getCountryName())) {
                                                                sb8 = r18;
                                                            } else {
                                                                if (sb8.length() > 0) {
                                                                    sb8.append(", ");
                                                                }
                                                                sb8.append(thoroughfare2);
                                                            }
                                                            if (!TextUtils.isEmpty(sb8)) {
                                                                int i19 = 0;
                                                                while (true) {
                                                                    String[] strArr = LocationController.unnamedRoads;
                                                                    if (i19 < strArr.length) {
                                                                        if (strArr[i19].equalsIgnoreCase(sb8.toString())) {
                                                                            z13 = true;
                                                                        } else {
                                                                            i19++;
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
                                                                if (arrayList6.size() >= i10) {
                                                                    AndroidUtilities.runOnUIThread(new h5(cVar, location, str, arrayList6, 11));
                                                                    break;
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
                                                if (z12) {
                                                    hashSet4 = hashSet7;
                                                } else {
                                                    hashSet4 = hashSet7;
                                                    if (!hashSet4.contains(sb7.toString())) {
                                                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2 = new TLRPC.TL_messageMediaVenue();
                                                        TLRPC.TL_geoPoint tL_geoPoint2 = new TLRPC.TL_geoPoint();
                                                        tL_messageMediaVenue2.geo = tL_geoPoint2;
                                                        tL_geoPoint2.lat = latitude;
                                                        tL_geoPoint2._long = longitude;
                                                        tL_messageMediaVenue2.query_id = -1L;
                                                        tL_messageMediaVenue2.title = sb7.toString();
                                                        tL_messageMediaVenue2.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                        tL_messageMediaVenue2.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                        hashSet4.add(tL_messageMediaVenue2.title);
                                                        tL_messageMediaVenue2.address = LocaleController.getString(R.string.PassportCity);
                                                        if (address3 != null) {
                                                            TL_stories.TL_geoPointAddress tL_geoPointAddress5 = new TL_stories.TL_geoPointAddress();
                                                            tL_messageMediaVenue2.geoAddress = tL_geoPointAddress5;
                                                            tL_geoPointAddress5.country_iso2 = address3.getCountryCode();
                                                            String locality4 = TextUtils.isEmpty(r18) ? address3.getLocality() : r18;
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
                                                        if (arrayList6.size() >= i10) {
                                                            AndroidUtilities.runOnUIThread(new h5(cVar, location, str, arrayList6, 11));
                                                        }
                                                    }
                                                }
                                                if (sb4.length() > 0) {
                                                    hashSet3 = hashSet5;
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
                                                        if (arrayList6.size() >= i10) {
                                                            AndroidUtilities.runOnUIThread(new h5(cVar, location, str, arrayList6, 11));
                                                        }
                                                    }
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
                                                hashSet4 = hashSet7;
                                            }
                                            hashSet3 = hashSet5;
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
                                hashSet3 = hashSet5;
                            }
                            i11 = i12 + 1;
                            hashSet2 = hashSet4;
                            hashSet = hashSet3;
                            user2 = r18;
                            str6 = str2;
                            locale2 = locale;
                            fromLocationName2 = list;
                            location2 = location;
                            str8 = str;
                            fromLocationName = list2;
                            cVar2 = cVar;
                        }
                    } else {
                        user = user2;
                    }
                    address = user;
                    r18 = user;
                    if (address2.hasLatitude()) {
                    }
                    locale = locale2;
                    str2 = str6;
                    list = fromLocationName2;
                    hashSet3 = hashSet;
                    hashSet4 = hashSet2;
                    cVar = cVar2;
                    location = location2;
                    str = str8;
                    i12 = i11;
                    list2 = fromLocationName;
                    i11 = i12 + 1;
                    hashSet2 = hashSet4;
                    hashSet = hashSet3;
                    user2 = r18;
                    str6 = str2;
                    locale2 = locale;
                    fromLocationName2 = list;
                    location2 = location;
                    str8 = str;
                    fromLocationName = list2;
                    cVar2 = cVar;
                }
                cVar = cVar2;
                location = location2;
                str = str8;
                AndroidUtilities.runOnUIThread(new h5(cVar, location, str, arrayList6, 11));
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
                            TLRPC.User user5 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user5, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user2 = user5;
                        }
                    }
                    k1Var.R(user2);
                    k1Var.t0 = 0;
                    break;
                }
                break;
            case 4:
                TLObject tLObject3 = (TLObject) this.b;
                String[] strArr2 = (String[]) this.c;
                final FrameLayout frameLayout = (FrameLayout) this.d;
                final n90 n90Var = (n90) this.e;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.h;
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
                                n90Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.b9(atomicBoolean, n90Var, str12));
                    duration.start();
                    new xc(e3Var.topBulletinContainer, d6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ub ubVar = (org.telegram.ui.ub) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.f;
                ArrayList arrayList7 = (ArrayList) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                org.telegram.ui.ra raVar = (org.telegram.ui.ra) this.h;
                TLRPC.Chat chat = ubVar.f;
                ubVar.Z = channelParticipant;
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
                                    if (i14 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i14);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i14++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList7.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.Cells.c1.m(R.drawable.msg_block2, 33, arrayList8, arrayList9);
                    }
                    arrayList7.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.Cells.c1.m(R.drawable.msg_block, 35, arrayList8, arrayList9);
                }
                raVar.run();
                break;
            case 6:
                wn wnVar = (wn) this.b;
                nf.e eVar = (nf.e) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                String str13 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                eVar.b();
                y70 I = y70.I(wnVar, u1Var);
                mm0 mm0Var = new mm0(wnVar.getParentActivity(), wnVar.ea);
                I.p = new qe(mm0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new xe(wnVar, mm0Var, str13, 1), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList10 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList10.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList10.get(i20);
                        i20++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new fh(i14, wnVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                mm0Var.e(I);
                mm0Var.f(u1Var, characterStyle, null, false);
                wnVar.showDialog(mm0Var);
                break;
            case 7:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                ci.d dVar = (ci.d) this.e;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error2 != null) {
                    new xc(org.telegram.ui.Components.lb.a(context), d6Var2).d0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    e3Var2.dismiss();
                    new xc(org.telegram.ui.Components.lb.a(context), d6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable.run();
                    break;
                }
            case 8:
                fy0 fy0Var = (fy0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                TextView textView = (TextView) this.e;
                TextView textView2 = (TextView) this.f;
                int[] iArr2 = (int[]) this.h;
                fy0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    z14 = false;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    fy0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
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
                gn0.W((gn0) this.b, (TLRPC.TL_error) this.c, (String) this.d, (wm0) this.e, (TLObject) this.f, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 10:
                t31.n((t31) this.b, (TLObject) this.c, (CharSequence) this.d, (TLRPC.TL_error) this.e, (byte[]) this.f, (String) this.h);
                break;
            case 11:
                TLObject tLObject6 = (TLObject) this.b;
                Context context2 = (Context) this.c;
                org.telegram.ui.ActionBar.d6 d6Var3 = (org.telegram.ui.ActionBar.d6) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f;
                vw vwVar = (vw) this.h;
                t31 t31Var = new t31(context2, d6Var3, 0L, bArr);
                t31Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                t31Var.s = new n31(m2Var, context2, d6Var3, vwVar);
                t31Var.show();
                break;
            case 12:
                k71.R((k71) this.b, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 13:
                org.telegram.ui.web.b1 b1Var2 = (org.telegram.ui.web.b1) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str14 = (String) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                String str15 = (String) this.h;
                org.telegram.ui.ActionBar.d6 d6Var4 = b1Var2.e;
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.TL_urlAuthResultRequest) {
                        cl0.b(false, b1Var2.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject7, null, null, null, false, b1Var2);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        cl0.b(false, b1Var2.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject7, null, null, null, false, b1Var2);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.e5.p0(b1Var2.getContext(), str14, false, true, true, false, 0L, null, null, null);
                        break;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        new xc(b1Var2, d6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str15), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, d6Var4)), R.raw.error).j();
                        break;
                    } else {
                        new xc(b1Var2, d6Var4).d0(tL_error3, false);
                        break;
                    }
                }
                break;
            case 14:
                org.telegram.ui.web.b1 b1Var3 = (org.telegram.ui.web.b1) this.b;
                File file = (File) this.c;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.d;
                String str16 = (String) this.e;
                String str17 = (String) this.f;
                String str18 = (String) this.h;
                if (file == null) {
                    a2Var.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.globalQueue.postRunnable(new cn0(file, iArr3, new ye(b1Var3, iArr3, file, a2Var, str16, str17, str18, 7), 18));
                    break;
                }
            case 15:
                xh.r1.P((xh.r1) this.b, (org.telegram.ui.ActionBar.a2) this.c, (TLObject) this.d, (xh.o0) this.e, (Utilities.Callback) this.f, (TLRPC.TL_error) this.h);
                break;
            case 16:
                yh.x3.c1((yh.x3) this.b, (TLObject) this.c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f, (TLRPC.TL_error) this.h);
                break;
            case 17:
                yh.x3.y0((yh.x3) this.b, (TLObject) this.c, (tg.m1[]) this.d, (Long) this.e, (tg.r) this.f, (TLRPC.TL_error) this.h);
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
                yh.j5 j5Var = (yh.j5) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                yh.k5 k5Var = (yh.k5) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.h;
                long j3 = j5Var.b;
                int i21 = j5Var.a;
                HashMap hashMap = j5Var.h;
                ArrayList arrayList11 = j5Var.e;
                j5Var.k = false;
                if (tLObject8 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject8;
                    arrayList11.remove(tL_starGiftCollection);
                    arrayList11.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i22 = tL_starGiftCollection2.collection_id;
                    k5Var.d = i22;
                    hashMap.put(Integer.valueOf(i22), k5Var);
                    j5Var.j();
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var);
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
                    j5Var.j();
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), j5Var);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z8(org.telegram.ui.ub ubVar, TLRPC.ChannelParticipant channelParticipant, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, org.telegram.ui.ra raVar) {
        this.a = 5;
        this.b = ubVar;
        this.f = channelParticipant;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.h = raVar;
    }
}
