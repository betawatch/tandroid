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
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b41;
import org.telegram.ui.en0;
import org.telegram.ui.eo;
import org.telegram.ui.fj;
import org.telegram.ui.h41;
import org.telegram.ui.kl0;
import org.telegram.ui.on0;
import org.telegram.ui.qh1;
import org.telegram.ui.v71;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class te implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ te(fg.b1 b1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.a = 2;
        this.b = b1Var;
        this.e = str;
        this.f = tL_error;
        this.c = tLObject;
        this.d = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        xh.v5 v5Var = (xh.v5) this.b;
        TLObject tLObject = (TLObject) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        fj fjVar = (fj) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            v5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, fjVar, null);
        } else {
            xh.v5.e(tL_error == null ? "NO_PAYMENT_FORM" : tL_error.text);
        }
        fjVar.run();
    }

    private final void b() {
        xh.v5 v5Var = (xh.v5) this.b;
        boolean[] zArr = (boolean[]) this.c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
        Utilities.Callback callback = (Utilities.Callback) this.h;
        zArr[0] = true;
        v5Var.a0(messageObject, inputInvoice, tL_payments_paymentFormStars, new xh.w0(1, callback));
    }

    private final void c() {
        org.telegram.ui.ActionBar.p2 U;
        xh.l5 l5Var = (xh.l5) this.b;
        TLObject tLObject = (TLObject) this.c;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
        xh.n5 n5Var = (xh.n5) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        long j3 = l5Var.b;
        int i10 = l5Var.a;
        HashMap hashMap = l5Var.h;
        ArrayList arrayList = l5Var.e;
        l5Var.k = false;
        if (!(tLObject instanceof TL_stars.TL_starGiftCollection)) {
            if (tL_error != null && (U = LaunchActivity.U()) != null) {
                org.telegram.ui.Components.wc.a0(U).d0(tL_error, false);
            }
            arrayList.remove(tL_starGiftCollection);
            hashMap.remove(-1);
            l5Var.j();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var);
            return;
        }
        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
        arrayList.remove(tL_starGiftCollection);
        arrayList.add(tL_starGiftCollection2);
        hashMap.remove(-1);
        int i11 = tL_starGiftCollection2.collection_id;
        n5Var.d = i11;
        hashMap.put(Integer.valueOf(i11), n5Var);
        l5Var.j();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var);
        if (callback != null) {
            callback.run(tL_starGiftCollection2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0485, code lost:
    
        if (r1.admin_rights.manage_call != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04be, code lost:
    
        if (r9.creator != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04ba, code lost:
    
        if ((r11 instanceof org.telegram.tgnet.TLRPC.TL_chatParticipantCreator) == false) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06f6 A[Catch: Exception -> 0x0691, TryCatch #4 {Exception -> 0x0691, blocks: (B:413:0x0681, B:415:0x068b, B:198:0x0694, B:201:0x06a2, B:203:0x06ac, B:205:0x06b2, B:206:0x06b5, B:208:0x06f0, B:210:0x06f6, B:212:0x06fc, B:213:0x06ff, B:215:0x0704, B:217:0x070a, B:218:0x070d, B:221:0x0716, B:223:0x0720, B:225:0x0730, B:227:0x073c, B:229:0x0748, B:233:0x0791, B:235:0x0797, B:236:0x079a, B:238:0x07a3, B:239:0x07a6, B:240:0x07b0, B:385:0x0759, B:387:0x0769, B:389:0x0773, B:391:0x078c, B:397:0x06ba, B:399:0x06c4, B:401:0x06ca, B:402:0x06cd, B:403:0x06d1, B:405:0x06db, B:407:0x06e1, B:409:0x06e7, B:410:0x06ea), top: B:412:0x0681 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0720 A[Catch: Exception -> 0x0691, TryCatch #4 {Exception -> 0x0691, blocks: (B:413:0x0681, B:415:0x068b, B:198:0x0694, B:201:0x06a2, B:203:0x06ac, B:205:0x06b2, B:206:0x06b5, B:208:0x06f0, B:210:0x06f6, B:212:0x06fc, B:213:0x06ff, B:215:0x0704, B:217:0x070a, B:218:0x070d, B:221:0x0716, B:223:0x0720, B:225:0x0730, B:227:0x073c, B:229:0x0748, B:233:0x0791, B:235:0x0797, B:236:0x079a, B:238:0x07a3, B:239:0x07a6, B:240:0x07b0, B:385:0x0759, B:387:0x0769, B:389:0x0773, B:391:0x078c, B:397:0x06ba, B:399:0x06c4, B:401:0x06ca, B:402:0x06cd, B:403:0x06d1, B:405:0x06db, B:407:0x06e1, B:409:0x06e7, B:410:0x06ea), top: B:412:0x0681 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0797 A[Catch: Exception -> 0x0691, TryCatch #4 {Exception -> 0x0691, blocks: (B:413:0x0681, B:415:0x068b, B:198:0x0694, B:201:0x06a2, B:203:0x06ac, B:205:0x06b2, B:206:0x06b5, B:208:0x06f0, B:210:0x06f6, B:212:0x06fc, B:213:0x06ff, B:215:0x0704, B:217:0x070a, B:218:0x070d, B:221:0x0716, B:223:0x0720, B:225:0x0730, B:227:0x073c, B:229:0x0748, B:233:0x0791, B:235:0x0797, B:236:0x079a, B:238:0x07a3, B:239:0x07a6, B:240:0x07b0, B:385:0x0759, B:387:0x0769, B:389:0x0773, B:391:0x078c, B:397:0x06ba, B:399:0x06c4, B:401:0x06ca, B:402:0x06cd, B:403:0x06d1, B:405:0x06db, B:407:0x06e1, B:409:0x06e7, B:410:0x06ea), top: B:412:0x0681 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07a3 A[Catch: Exception -> 0x0691, TryCatch #4 {Exception -> 0x0691, blocks: (B:413:0x0681, B:415:0x068b, B:198:0x0694, B:201:0x06a2, B:203:0x06ac, B:205:0x06b2, B:206:0x06b5, B:208:0x06f0, B:210:0x06f6, B:212:0x06fc, B:213:0x06ff, B:215:0x0704, B:217:0x070a, B:218:0x070d, B:221:0x0716, B:223:0x0720, B:225:0x0730, B:227:0x073c, B:229:0x0748, B:233:0x0791, B:235:0x0797, B:236:0x079a, B:238:0x07a3, B:239:0x07a6, B:240:0x07b0, B:385:0x0759, B:387:0x0769, B:389:0x0773, B:391:0x078c, B:397:0x06ba, B:399:0x06c4, B:401:0x06ca, B:402:0x06cd, B:403:0x06d1, B:405:0x06db, B:407:0x06e1, B:409:0x06e7, B:410:0x06ea), top: B:412:0x0681 }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x095c A[Catch: Exception -> 0x0a8e, TryCatch #0 {Exception -> 0x0a8e, blocks: (B:371:0x07b9, B:377:0x07cc, B:379:0x07d2, B:244:0x07ff, B:246:0x0805, B:248:0x0823, B:249:0x0825, B:250:0x082d, B:252:0x0831, B:254:0x0846, B:255:0x084c, B:257:0x0852, B:258:0x0856, B:260:0x085c, B:261:0x0860, B:263:0x086f, B:264:0x0882, B:266:0x0888, B:268:0x0894, B:270:0x089c, B:272:0x08a6, B:274:0x08b4, B:275:0x08ba, B:277:0x08c0, B:279:0x08ca, B:281:0x08d8, B:282:0x08dc, B:284:0x08e2, B:286:0x08ec, B:288:0x08fa, B:289:0x08fe, B:291:0x0904, B:293:0x090a, B:295:0x0914, B:297:0x091a, B:298:0x091d, B:299:0x0922, B:302:0x0929, B:304:0x092e, B:309:0x0940, B:311:0x0946, B:313:0x095c, B:316:0x0973, B:318:0x097d, B:320:0x09b4, B:322:0x09c9, B:323:0x09cf, B:325:0x09d5, B:326:0x09d9, B:328:0x09df, B:329:0x09e3, B:331:0x09ed, B:332:0x09f7, B:334:0x09fd, B:336:0x0a07, B:342:0x0a12, B:347:0x0a18, B:349:0x0a24, B:351:0x0a5b, B:352:0x0a68, B:306:0x093c, B:368:0x082a), top: B:370:0x07b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x09b4 A[Catch: Exception -> 0x0a8e, TryCatch #0 {Exception -> 0x0a8e, blocks: (B:371:0x07b9, B:377:0x07cc, B:379:0x07d2, B:244:0x07ff, B:246:0x0805, B:248:0x0823, B:249:0x0825, B:250:0x082d, B:252:0x0831, B:254:0x0846, B:255:0x084c, B:257:0x0852, B:258:0x0856, B:260:0x085c, B:261:0x0860, B:263:0x086f, B:264:0x0882, B:266:0x0888, B:268:0x0894, B:270:0x089c, B:272:0x08a6, B:274:0x08b4, B:275:0x08ba, B:277:0x08c0, B:279:0x08ca, B:281:0x08d8, B:282:0x08dc, B:284:0x08e2, B:286:0x08ec, B:288:0x08fa, B:289:0x08fe, B:291:0x0904, B:293:0x090a, B:295:0x0914, B:297:0x091a, B:298:0x091d, B:299:0x0922, B:302:0x0929, B:304:0x092e, B:309:0x0940, B:311:0x0946, B:313:0x095c, B:316:0x0973, B:318:0x097d, B:320:0x09b4, B:322:0x09c9, B:323:0x09cf, B:325:0x09d5, B:326:0x09d9, B:328:0x09df, B:329:0x09e3, B:331:0x09ed, B:332:0x09f7, B:334:0x09fd, B:336:0x0a07, B:342:0x0a12, B:347:0x0a18, B:349:0x0a24, B:351:0x0a5b, B:352:0x0a68, B:306:0x093c, B:368:0x082a), top: B:370:0x07b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a10 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a18 A[Catch: Exception -> 0x0a8e, TryCatch #0 {Exception -> 0x0a8e, blocks: (B:371:0x07b9, B:377:0x07cc, B:379:0x07d2, B:244:0x07ff, B:246:0x0805, B:248:0x0823, B:249:0x0825, B:250:0x082d, B:252:0x0831, B:254:0x0846, B:255:0x084c, B:257:0x0852, B:258:0x0856, B:260:0x085c, B:261:0x0860, B:263:0x086f, B:264:0x0882, B:266:0x0888, B:268:0x0894, B:270:0x089c, B:272:0x08a6, B:274:0x08b4, B:275:0x08ba, B:277:0x08c0, B:279:0x08ca, B:281:0x08d8, B:282:0x08dc, B:284:0x08e2, B:286:0x08ec, B:288:0x08fa, B:289:0x08fe, B:291:0x0904, B:293:0x090a, B:295:0x0914, B:297:0x091a, B:298:0x091d, B:299:0x0922, B:302:0x0929, B:304:0x092e, B:309:0x0940, B:311:0x0946, B:313:0x095c, B:316:0x0973, B:318:0x097d, B:320:0x09b4, B:322:0x09c9, B:323:0x09cf, B:325:0x09d5, B:326:0x09d9, B:328:0x09df, B:329:0x09e3, B:331:0x09ed, B:332:0x09f7, B:334:0x09fd, B:336:0x0a07, B:342:0x0a12, B:347:0x0a18, B:349:0x0a24, B:351:0x0a5b, B:352:0x0a68, B:306:0x093c, B:368:0x082a), top: B:370:0x07b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0714  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        fg.c cVar;
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
        int i12;
        int i13;
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
        int i14;
        TLRPC.User user;
        TLRPC.ChatParticipants chatParticipants;
        String str5;
        String str6 = "";
        int i15 = 7;
        int i16 = 2;
        int i17 = 1;
        int i18 = 0;
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.b;
                TLObject tLObject = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.User[] userArr = (TLRPC.User[]) this.e;
                ye yeVar = (ye) this.f;
                we weVar = (we) this.h;
                iArr[0] = 0;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User user2 = messagesController.getUser(Long.valueOf(DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = user2;
                    if (user2 != null) {
                        yeVar.run();
                        break;
                    }
                }
                weVar.run(null);
                break;
            case 1:
                fg.c cVar2 = (fg.c) this.b;
                Locale locale2 = (Locale) this.c;
                String str7 = (String) this.d;
                Locale locale3 = (Locale) this.e;
                Location location2 = (Location) this.f;
                String str8 = (String) this.h;
                ArrayList arrayList = new ArrayList();
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
                            i12 = i10;
                            location = location2;
                            str = str8;
                            i13 = i11;
                            list2 = fromLocationName;
                            cVar = cVar2;
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
                                i13 = i11;
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
                                        boolean z14 = z10;
                                        countryName = address2.getCountryName();
                                        if (TextUtils.isEmpty(countryName)) {
                                            sb3 = sb2;
                                            z12 = z11;
                                            if (!"US".equals(address2.getCountryCode()) && !"AE".equals(address2.getCountryCode()) && (!"GB".equals(address2.getCountryCode()) || !"en".equals(locale.getLanguage()))) {
                                                hashSet3 = hashSet;
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
                                            hashSet3 = hashSet;
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
                                            hashSet3 = hashSet;
                                            sb3 = sb2;
                                            z12 = z11;
                                        }
                                        cVar = cVar2;
                                        if (cVar2.e) {
                                            if (sb3 == null || sb3.length() <= 0) {
                                                sb4 = sb6;
                                                sb5 = sb7;
                                            } else {
                                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                                tL_messageMediaVenue.geo = tL_geoPoint;
                                                tL_geoPoint.lat = latitude;
                                                tL_geoPoint._long = longitude;
                                                tL_messageMediaVenue.query_id = -1L;
                                                tL_messageMediaVenue.title = sb3.toString();
                                                tL_messageMediaVenue.icon = "pin";
                                                tL_messageMediaVenue.address = LocaleController.getString(z14 ? R.string.PassportCity : R.string.PassportStreet1);
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
                                                        sb4 = sb6;
                                                        sb5 = sb7;
                                                    } else {
                                                        sb4 = sb6;
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress2 = tL_messageMediaVenue.geoAddress;
                                                        tL_geoPointAddress2.state = adminArea;
                                                        sb5 = sb7;
                                                        tL_geoPointAddress2.flags |= 1;
                                                    }
                                                    if (!TextUtils.isEmpty(locality3)) {
                                                        TL_stories.TL_geoPointAddress tL_geoPointAddress3 = tL_messageMediaVenue.geoAddress;
                                                        tL_geoPointAddress3.city = locality3;
                                                        tL_geoPointAddress3.flags |= 2;
                                                    }
                                                    if (!z14) {
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
                                                            arrayList.add(tL_messageMediaVenue);
                                                            i12 = i19;
                                                            if (arrayList.size() >= i12) {
                                                                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList, 7));
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
                                                                arrayList.add(tL_messageMediaVenue2);
                                                                if (arrayList.size() >= i12) {
                                                                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList, 7));
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
                                                                    arrayList.add(tL_messageMediaVenue3);
                                                                    if (arrayList.size() >= i12) {
                                                                        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList, 7));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    sb4 = sb6;
                                                    sb5 = sb7;
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
                                                tL_messageMediaVenue22.title = sb5.toString();
                                                tL_messageMediaVenue22.icon = "https://ss3.4sqi.net/img/categories_v2/travel/hotel_64.png";
                                                tL_messageMediaVenue22.emoji = LocationController.countryCodeToEmoji(address2.getCountryCode());
                                                hashSet2.add(tL_messageMediaVenue22.title);
                                                tL_messageMediaVenue22.address = LocaleController.getString(R.string.PassportCity);
                                                if (address3 != null) {
                                                }
                                                arrayList.add(tL_messageMediaVenue22);
                                                if (arrayList.size() >= i12) {
                                                }
                                            }
                                            if (sb4.length() > 0) {
                                            }
                                        } else {
                                            try {
                                                StringBuilder sb9 = new StringBuilder();
                                                try {
                                                    String addressLine = address2.getAddressLine(0);
                                                    if (!TextUtils.isEmpty(addressLine)) {
                                                        sb9.append(addressLine);
                                                    }
                                                } catch (Exception unused4) {
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
                                                    arrayList.add(tL_messageMediaVenue4);
                                                }
                                                i12 = i19;
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
                            boolean z142 = z10;
                            countryName = address2.getCountryName();
                            if (TextUtils.isEmpty(countryName)) {
                            }
                            cVar = cVar2;
                            if (cVar2.e) {
                            }
                            hashSet = hashSet3;
                        }
                        i10 = i12;
                        cVar2 = cVar;
                        str6 = str2;
                        locale2 = locale;
                        fromLocationName2 = list;
                        location2 = location;
                        str8 = str;
                        fromLocationName = list2;
                        i11 = i13 + 1;
                    }
                    address = null;
                    if (address2.hasLatitude()) {
                    }
                    locale = locale2;
                    str2 = str6;
                    list = fromLocationName2;
                    i12 = i10;
                    location = location2;
                    str = str8;
                    i13 = i11;
                    list2 = fromLocationName;
                    cVar = cVar2;
                    i10 = i12;
                    cVar2 = cVar;
                    str6 = str2;
                    locale2 = locale;
                    fromLocationName2 = list;
                    location2 = location;
                    str8 = str;
                    fromLocationName = list2;
                    i11 = i13 + 1;
                }
                cVar = cVar2;
                location = location2;
                str = str8;
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(cVar, location, str, arrayList, 7));
                break;
            case 2:
                fg.b1 b1Var = (fg.b1) this.b;
                String str10 = (String) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.h;
                fg.l1 l1Var = b1Var.e;
                String str11 = l1Var.q0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (!tL_contacts_resolvedPeer2.users.isEmpty()) {
                            TLRPC.User user3 = tL_contacts_resolvedPeer2.users.get(0);
                            messagesController2.putUser(user3, false);
                            messagesStorage.putUsersAndChats(tL_contacts_resolvedPeer2.users, null, true, true);
                            user = user3;
                            l1Var.R(user);
                            l1Var.t0 = 0;
                            break;
                        }
                    }
                    user = null;
                    l1Var.R(user);
                    l1Var.t0 = 0;
                }
                break;
            case 3:
                TLObject tLObject3 = (TLObject) this.c;
                String[] strArr2 = (String[]) this.b;
                final FrameLayout frameLayout = (FrameLayout) this.d;
                final m90 m90Var = (m90) this.e;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f;
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
                                m90Var.setText(str12);
                            }
                        }
                    });
                    duration.addListener(new org.telegram.ui.b9(atomicBoolean, m90Var, str12));
                    duration.start();
                    new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, f6Var).M(LocaleController.getString(R.string.GroupCallCreatedLinkRevokedTitle), LocaleController.getString(R.string.GroupCallCreatedLinkRevokedText), R.raw.linkbroken).j();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.wb wbVar = (org.telegram.ui.wb) this.b;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                org.telegram.ui.ta taVar = (org.telegram.ui.ta) this.h;
                TLRPC.Chat chat = wbVar.s;
                wbVar.d0 = channelParticipant;
                if (channelParticipant != null) {
                    if (channelParticipant.peer instanceof TLRPC.TL_peerUser) {
                        if (ChatObject.isChannel(chat)) {
                            TLRPC.ChannelParticipant adminInChannel = wbVar.getMessagesController().getAdminInChannel(channelParticipant.peer.user_id, chat.id);
                            if (adminInChannel != null) {
                                if (!(adminInChannel instanceof TLRPC.TL_channelParticipantCreator)) {
                                    break;
                                }
                                break;
                            }
                        } else {
                            TLRPC.ChatFull chatFull = wbVar.getMessagesController().getChatFull(chat.id);
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                int size = chatParticipants.participants.size();
                                while (true) {
                                    if (i18 < size) {
                                        TLRPC.ChatParticipant chatParticipant = chatFull.participants.participants.get(i18);
                                        if (chatParticipant.user_id == channelParticipant.peer.user_id) {
                                            if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                break;
                                            }
                                        } else {
                                            i18++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (ChatObject.canUserDoAction(chat, channelParticipant, 6) || ChatObject.canUserDoAction(chat, channelParticipant, 7)) {
                        arrayList2.add(LocaleController.getString(R.string.Restrict));
                        org.telegram.ui.Cells.r6.n(R.drawable.msg_block2, 33, arrayList3, arrayList4);
                    }
                    arrayList2.add(LocaleController.getString(R.string.Ban));
                    org.telegram.ui.Cells.r6.n(R.drawable.msg_block, 35, arrayList3, arrayList4);
                }
                taVar.run();
                break;
            case 5:
                eo eoVar = (eo) this.b;
                nf.e eVar = (nf.e) this.d;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.e;
                String str13 = (String) this.f;
                TLObject tLObject4 = (TLObject) this.c;
                CharacterStyle characterStyle = (CharacterStyle) this.h;
                eVar.b();
                w70 I = w70.I(eoVar, t1Var);
                km0 km0Var = new km0(eoVar.getParentActivity(), eoVar.ea);
                I.p = new org.telegram.ui.se(km0Var, 0);
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyCardNumber), new org.telegram.ui.af(eoVar, km0Var, str13, i16), false);
                if (tLObject4 instanceof TLRPC.TL_payments_bankCardData) {
                    TLRPC.TL_payments_bankCardData tL_payments_bankCardData = (TLRPC.TL_payments_bankCardData) tLObject4;
                    ArrayList<TLRPC.TL_bankCardOpenUrl> arrayList5 = tL_payments_bankCardData.open_urls;
                    int size2 = arrayList5.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl = arrayList5.get(i23);
                        i23++;
                        TLRPC.TL_bankCardOpenUrl tL_bankCardOpenUrl2 = tL_bankCardOpenUrl;
                        I.c(R.drawable.msg_payment_card, tL_bankCardOpenUrl2.name, new org.telegram.ui.n(29, eoVar, tL_bankCardOpenUrl2), false);
                    }
                    if (!TextUtils.isEmpty(tL_payments_bankCardData.title)) {
                        I.k();
                        I.p(13, AndroidUtilities.dp(200.0f), tL_payments_bankCardData.title);
                    }
                }
                km0Var.e(I);
                km0Var.f(t1Var, characterStyle, null, false);
                eoVar.showDialog(km0Var);
                break;
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Context context = (Context) this.c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                d dVar = (d) this.e;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.f;
                Runnable runnable = (Runnable) this.h;
                if (tL_error2 != null) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(context), f6Var2).d0(tL_error2, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    h3Var2.dismiss();
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(context), f6Var2).Q(R.raw.chats_infotip, 36, LocaleController.getString(R.string.PremiumReadSet)).j();
                    runnable.run();
                    break;
                }
            case 7:
                hy0 hy0Var = (hy0) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.e;
                TextView textView = (TextView) this.f;
                TextView textView2 = (TextView) this.h;
                int[] iArr2 = (int[]) this.b;
                hy0Var.getClass();
                if (!(tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) || (str5 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) == null) {
                    i17 = 0;
                } else {
                    editTextBoldCursor.setText(str5);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    hy0Var.m0(textView, editTextBoldCursor.getText().toString(), true);
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), AndroidUtilities.dp(4.0f), 0, 0);
                if (i17 == 0) {
                    editTextBoldCursor.setText("");
                }
                iArr2[0] = 2;
                break;
            case 8:
                on0.W((on0) this.b, (TLRPC.TL_error) this.d, (String) this.e, (en0) this.f, (TLObject) this.c, (TL_account.sendVerifyPhoneCode) this.h);
                break;
            case 9:
                h41.n((h41) this.b, (TLObject) this.c, (CharSequence) this.d, (TLRPC.TL_error) this.e, (byte[]) this.f, (String) this.h);
                break;
            case 10:
                TLObject tLObject6 = (TLObject) this.c;
                Context context2 = (Context) this.b;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) this.d;
                byte[] bArr = (byte[]) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f;
                hy hyVar = (hy) this.h;
                h41 h41Var = new h41(context2, f6Var3, 0L, bArr);
                h41Var.O((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject6);
                h41Var.s = new b41(p2Var, context2, f6Var3, hyVar);
                h41Var.show();
                break;
            case 11:
                v71.R((v71) this.b, (TLRPC.TL_error) this.c, (TLRPC.InputCheckPasswordSRP) this.d, (TLRPC.User) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.h);
                break;
            case 12:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) this.d;
                String str14 = (String) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f;
                String str15 = (String) this.h;
                org.telegram.ui.ActionBar.f6 f6Var4 = c1Var.e;
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.TL_urlAuthResultRequest) {
                        kl0.b(false, c1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject7, null, null, null, false, c1Var);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        kl0.b(false, c1Var.M, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject7, null, null, null, false, c1Var);
                        break;
                    } else if (tLObject7 instanceof TLRPC.TL_urlAuthResultDefault) {
                        org.telegram.ui.Components.d5.p0(c1Var.getContext(), str14, false, true, true, false, 0L, null, null, null);
                        break;
                    }
                } else if (tL_error3 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error3.text)) {
                        new org.telegram.ui.Components.wc(c1Var, f6Var4).M(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str15), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Gi, f6Var4)), R.raw.error).j();
                        break;
                    } else {
                        new org.telegram.ui.Components.wc(c1Var, f6Var4).d0(tL_error3, false);
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.web.c1 c1Var2 = (org.telegram.ui.web.c1) this.b;
                File file = (File) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                String str16 = (String) this.e;
                String str17 = (String) this.f;
                String str18 = (String) this.h;
                if (file == null) {
                    d2Var.c(500L);
                    break;
                } else {
                    int[] iArr3 = new int[11];
                    Utilities.globalQueue.postRunnable(new sx0(file, iArr3, new org.telegram.ui.bf(c1Var2, iArr3, file, d2Var, str16, str17, str18, 7), i15));
                    break;
                }
            case 14:
                wh.p1.P((wh.p1) this.b, (org.telegram.ui.ActionBar.d2) this.d, (TLObject) this.c, (xh.r6) this.e, (Utilities.Callback) this.f, (TLRPC.TL_error) this.h);
                break;
            case 15:
                xh.x3.c1((xh.x3) this.b, (TLObject) this.c, (CharSequence) this.d, (TL_stars.TL_starGiftUnique) this.e, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f, (TLRPC.TL_error) this.h);
                break;
            case 16:
                xh.x3.y0((xh.x3) this.b, (TLObject) this.c, (sg.p1[]) this.d, (Long) this.e, (sx0) this.f, (TLRPC.TL_error) this.h);
                break;
            case 17:
                xh.v5 v5Var = (xh.v5) this.b;
                List list3 = (List) this.c;
                k6 k6Var = (k6) this.d;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) this.e;
                c5.h hVar = (c5.h) this.f;
                Activity activity = (Activity) this.h;
                if (list3.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new xh.j4(k6Var, i18));
                    break;
                } else {
                    c5.o oVar = (c5.o) list3.get(0);
                    if (oVar.a() == null) {
                        AndroidUtilities.runOnUIThread(new xh.j4(k6Var, i17));
                        break;
                    } else {
                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                        ConnectionsManager.getInstance(v5Var.a).sendRequest(tL_payments_canPurchaseStore, new qh1(oVar, hVar, k6Var, activity, tL_inputStorePaymentStarsGiveaway, list3, 3));
                        break;
                    }
                }
            case 18:
                xh.v5 v5Var2 = (xh.v5) this.b;
                Runnable runnable2 = (Runnable) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                if (v5Var2.e) {
                    v5Var2.Y(messageObject, inputInvoice, tL_payments_paymentFormStars, runnable2, callback);
                    break;
                } else {
                    xh.v5.e("NO_BALANCE");
                    runnable2.run();
                    break;
                }
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
                zh.a5 a5Var = (zh.a5) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                ArrayList<TLRPC.User> arrayList8 = (ArrayList) this.e;
                ArrayList<TLRPC.Chat> arrayList9 = (ArrayList) this.f;
                HashSet hashSet4 = (HashSet) this.h;
                StringBuilder sb10 = new StringBuilder("StoriesList ");
                sb10.append(a5Var.e);
                sb10.append("{");
                sb10.append(a5Var.d);
                sb10.append("} preloadCache {");
                sb10.append(zh.i5.a(arrayList6));
                hc.b.v("}", sb10);
                ArrayList arrayList10 = a5Var.g;
                arrayList10.clear();
                arrayList10.addAll(arrayList7);
                a5Var.t = false;
                int i24 = a5Var.c;
                MessagesController.getInstance(i24).putUsers(arrayList8, true);
                MessagesController.getInstance(i24).putChats(arrayList9, true);
                if (a5Var.v) {
                    a5Var.v = false;
                    a5Var.y = null;
                    a5Var.j();
                    break;
                } else {
                    a5Var.m.addAll(hashSet4);
                    a5Var.k.clear();
                    for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                        a5Var.t((MessageObject) arrayList6.get(i25), true);
                    }
                    a5Var.d(false);
                    zh.z4 z4Var = a5Var.y;
                    if (z4Var != null) {
                        z4Var.run(0);
                        a5Var.y = null;
                    }
                    NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a5Var);
                    break;
                }
        }
    }

    public /* synthetic */ te(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public /* synthetic */ te(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = tLObject;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ te(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.a = i10;
        this.b = p2Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = tLObject;
        this.h = obj4;
    }

    public /* synthetic */ te(hy0 hy0Var, TLObject tLObject, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.a = 7;
        this.d = hy0Var;
        this.c = tLObject;
        this.e = editTextBoldCursor;
        this.f = textView;
        this.h = textView2;
        this.b = iArr;
    }

    public /* synthetic */ te(wh.p1 p1Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, xh.r6 r6Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.a = 14;
        this.b = p1Var;
        this.d = d2Var;
        this.c = tLObject;
        this.e = r6Var;
        this.f = callback;
        this.h = tL_error;
    }
}
