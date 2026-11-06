package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ io0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r6.equals("android.media.metadata.WRITER") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        Bitmap bitmap;
        Bundle bundle;
        h9.i0 i0Var;
        Bundle bundle2;
        boolean z9;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        org.telegram.messenger.re reVar = (org.telegram.messenger.re) this.c;
        AtomicInteger atomicInteger = (AtomicInteger) this.b;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i7 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i7 < arrayList5.size(); arrayList5 = arrayList2) {
                m9.y yVar = (m9.y) arrayList5.get(i7);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) c8.s9.a(yVar);
                    } catch (CancellationException | ExecutionException e10) {
                        synchronized (h2.a.b) {
                            Log.d("MediaSessionLegacyStub", h2.a.a("Failed to get bitmap", e10));
                        }
                    }
                    e2.l0 l0Var = (e2.l0) arrayList3.get(i7);
                    int i10 = p4.n.a;
                    String str = !l0Var.a.equals("") ? null : l0Var.a;
                    e2.o0 o0Var = l0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = o0Var.J;
                    CharSequence charSequence3 = o0Var.a;
                    CharSequence charSequence4 = o0Var.g;
                    CharSequence charSequence5 = o0Var.f;
                    i0Var = o0Var.K;
                    Integer num = o0Var.I;
                    Integer num2 = o0Var.q;
                    if (bundle != null) {
                        bundle = new Bundle(bundle);
                    }
                    bundle2 = bundle;
                    z9 = num2 == null && num2.intValue() != -1;
                    z10 = num == null;
                    if (!z9 || z10) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle4 = bundle2;
                        if (z9) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                        } else {
                            num2.getClass();
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", p4.n.a(num2.intValue()));
                        }
                        if (z10) {
                            num.getClass();
                            bundle4.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                        }
                        bundle3 = bundle4;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        bundle3 = bundle2;
                    }
                    if (!i0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                    }
                    charSequence = o0Var.e;
                    if (charSequence == null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                    } else {
                        int i11 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            char c10 = 2;
                            if (i12 < i11) {
                                String[] strArr = q4.i.d;
                                if (i13 < strArr.length) {
                                    int i14 = i13 + 1;
                                    String str2 = strArr[i13];
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -1853648227:
                                            if (str2.equals("android.media.metadata.ARTIST")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1850878751:
                                            if (str2.equals("android.media.metadata.AUTHOR")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1224124471:
                                            break;
                                        case 194702059:
                                            if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1058837545:
                                            if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            charSequence2 = o0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = o0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = o0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = o0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = o0Var.d;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence2)) {
                                        charSequenceArr[i12] = charSequence2;
                                        i12++;
                                    }
                                    i13 = i14;
                                    i11 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence4 = charSequenceArr[2];
                    }
                    arrayList4.add(new q4.o(new q4.h(str, charSequence, charSequence5, charSequence4, bitmap2, o0Var.n, bundle3, l0Var.f.a), i7 != -1 ? -1L : i7));
                    i7++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                e2.l0 l0Var2 = (e2.l0) arrayList3.get(i7);
                int i102 = p4.n.a;
                if (!l0Var2.a.equals("")) {
                }
                e2.o0 o0Var2 = l0Var2.d;
                if (bitmap == null) {
                }
                bundle = o0Var2.J;
                CharSequence charSequence32 = o0Var2.a;
                CharSequence charSequence42 = o0Var2.g;
                CharSequence charSequence52 = o0Var2.f;
                i0Var = o0Var2.K;
                Integer num3 = o0Var2.I;
                Integer num22 = o0Var2.q;
                if (bundle != null) {
                }
                bundle2 = bundle;
                if (num22 == null) {
                }
                if (num3 == null) {
                }
                if (z9) {
                }
                if (bundle2 == null) {
                }
                Bundle bundle42 = bundle2;
                if (z9) {
                }
                if (z10) {
                }
                bundle3 = bundle42;
                if (!i0Var.isEmpty()) {
                }
                charSequence = o0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new q4.o(new q4.h(str, charSequence, charSequence52, charSequence42, bitmap2, o0Var2.n, bundle3, l0Var2.f.a), i7 != -1 ? -1L : i7));
                i7++;
                arrayList3 = arrayList;
            }
            p4.m0.e0(((p4.m0) reVar.e).n, arrayList4);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Uri fromFile;
        int i7;
        int indexOf;
        int i10;
        int i11;
        char c10;
        String G;
        org.telegram.ui.web.x0 x0Var;
        boolean z9;
        int i12 = 2;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                po0 po0Var = (po0) this.c;
                TLObject tLObject = (TLObject) this.b;
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                PhotoViewer photoViewer = po0Var.b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i13 = photoViewer.T;
                    ArrayList arrayList = photoViewer.e7;
                    org.telegram.messenger.qp.s1(i13).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(photoViewer.T).a2(Long.valueOf(p10Var.n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (a22 != null) {
                            a22.photo.photo_id = tL_photos_photo.photo.id;
                            p10Var.w(a22);
                            p10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                gs0.Z((gs0) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (TL_stars.updatePaidMessagesPrice) this.e);
                return;
            case 2:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (boolean[]) this.e);
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.c;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                try {
                    u1Var.dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().H = setaccountttl.ttl.days;
                    privacySettingsActivity.a.f();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                boolean[] zArr = (boolean[]) this.b;
                Activity activity = (Activity) this.d;
                File file = (File) this.e;
                RectF rectF = ProfileActivity.S6;
                try {
                    u1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr[0]) {
                    if (activity != null) {
                        Toast.makeText(activity, org.telegram.messenger.hd.M0(2131751106, null), 0).show();
                        return;
                    }
                    return;
                }
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 24) {
                    org.telegram.messenger.t0.d();
                    fromFile = FileProvider.d(activity, "org.telegram.messenger.beta.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i14 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.hd.E0().z0().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity != null) {
                    try {
                        activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr = (int[]) this.e;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    i7 = 0;
                } else {
                    RectF rectF2 = ProfileActivity.S6;
                    profileActivity.getClass();
                    i7 = 0;
                    org.telegram.ui.Components.hc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.n4 == iArr[i7]) {
                    profileActivity.n4 = i7;
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity2 = (ProfileActivity) this.c;
                String[] strArr = (String[]) this.b;
                String str = (String) this.d;
                String str2 = (String) this.e;
                RectF rectF3 = ProfileActivity.S6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.e21.U0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str, str2, new j00(profileActivity2, 2), null);
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity3 = (ProfileActivity) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    h00.a(profileActivity3.getParentActivity(), 0, tL_username.username, profileActivity3.d1 != 0 ? profileActivity3.getMessagesController().a2(Long.valueOf(profileActivity3.d1)) : profileActivity3.getMessagesController().M0(Long.valueOf(profileActivity3.e1)), (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.z0);
                    return;
                } else {
                    RectF rectF4 = ProfileActivity.S6;
                    org.telegram.ui.Components.hc.d0(tL_error2);
                    return;
                }
            case 8:
                ProfileActivity.e0((ProfileActivity) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (String) this.e);
                return;
            case 9:
                qv0 qv0Var = (qv0) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                org.telegram.messenger.p10 p10Var2 = (org.telegram.messenger.p10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = qv0Var.b;
                profileActivity4.n0.c1--;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject5;
                    profileActivity4.getMessagesController().Y3(tL_photos_photo2.users, false);
                    TLRPC.User a23 = profileActivity4.getMessagesController().a2(Long.valueOf(p10Var2.n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (a23 != null) {
                            a23.photo.photo_id = tL_photos_photo2.photo.id;
                            p10Var2.w(a23);
                            p10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                cw0 cw0Var = (cw0) this.c;
                TLObject tLObject6 = (TLObject) this.b;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity5 = cw0Var.c.e;
                profileActivity5.e5(null);
                if (!(tLObject6 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.hc.d0(tL_error3);
                    return;
                }
                TLObject a24 = profileActivity5.d1 != 0 ? profileActivity5.getMessagesController().a2(Long.valueOf(profileActivity5.d1)) : profileActivity5.getMessagesController().M0(Long.valueOf(profileActivity5.e1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                h00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, a24, (TL_fragment.TL_collectibleInfo) tLObject6, profileActivity5.z0);
                return;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                try {
                    u1Var3.dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    y21 y21Var = sessionsActivity.a;
                    if (y21Var != null) {
                        y21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.c;
                org.telegram.ui.ActionBar.u1 u1Var4 = (org.telegram.ui.ActionBar.u1) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                try {
                    u1Var4.dismiss();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    y21 y21Var2 = sessionsActivity2.a;
                    if (y21Var2 != null) {
                        y21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                x21 x21Var = (x21) this.c;
                TLObject tLObject7 = (TLObject) this.b;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                j9 j9Var = (j9) this.e;
                x21Var.a = tLObject7;
                x21Var.b = tL_error6;
                j9Var.run();
                return;
            case 14:
                m31.d0((m31) this.c, (TLRPC.TL_error) this.d, (TLObject) this.b, (String) this.e);
                return;
            case 15:
                m41 m41Var = (m41) this.c;
                mg.b bVar = (mg.b) this.b;
                String str3 = (String) this.d;
                b51 b51Var = (b51) this.e;
                c51 c51Var = m41Var.x;
                if (bVar != null) {
                    c51Var.U.l(str3, bVar);
                }
                if (bVar != null && !b51Var.b && (i10 = b51Var.a) >= 0) {
                    View m10 = c51Var.T.m(i10);
                    if (m10 instanceof m41) {
                        m41Var.r.e = bVar;
                        m41 m41Var2 = (m41) m10;
                        m41Var2.b.t0.d(false, false);
                        m41Var2.g(false);
                    }
                }
                c51.c0(c51Var);
                return;
            case 16:
                o41 o41Var = (o41) this.c;
                mg.b bVar2 = (mg.b) this.b;
                String str4 = (String) this.d;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.e;
                o41Var.k = false;
                o41Var.d = bVar2;
                o41Var.g = str4;
                l41 l41Var = (l41) u10Var.run();
                if (l41Var != null) {
                    l41Var.e(o41Var, true);
                    return;
                }
                return;
            case 17:
                p81 p81Var = (p81) this.c;
                TLObject tLObject8 = (TLObject) this.b;
                String str5 = (String) this.d;
                org.telegram.ui.ActionBar.u1 u1Var5 = (org.telegram.ui.ActionBar.u1) this.e;
                u81 u81Var = p81Var.a;
                if (tLObject8 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    int i15 = 0;
                    while (i15 < updates.updates.size()) {
                        if (updates.updates.get(i15) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i15);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str5;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = u81Var.getMessagesController().z1(u81Var.a);
                            tL_messageService.dialog_id = u81Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.f2) u81Var).currentAccount;
                            arrayList3.add(new org.telegram.messenger.ij(i11, tL_messageService, false, false));
                            TLRPC.Chat M0 = u81Var.getMessagesController().M0(Long.valueOf(-u81Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j3 = u81Var.b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i12;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str5;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = u81Var.getMessagesController().z1(u81Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = u81Var.E;
                            an anVar = u81Var.D;
                            if (anVar != null) {
                                anVar.kb();
                                anVar.ob();
                                anVar.Rb(arrayList3, M0, tL_messageService.id, 1, 1, tL_forumTopic);
                                anVar.c = true;
                                anVar.J8();
                                anVar.sd(true);
                                anVar.o1.n(true);
                                anVar.yd();
                                anVar.f2.setCurrentTopic(anVar.b());
                                anVar.vd(true);
                                anVar.Lc(true);
                                anVar.B9(true);
                                anVar.M6(true, true);
                                anVar.db();
                                u81Var.getMessagesController().q7.q(u81Var.a, tL_forumTopic, true);
                                u81Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -u81Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                an anVar2 = new an(bundle);
                                anVar2.Rb(arrayList3, M0, tL_messageService.id, 1, 1, tL_forumTopic);
                                anVar2.c = true;
                                u81Var.getMessagesController().q7.q(u81Var.a, tL_forumTopic, true);
                                u81Var.presentFragment(anVar2);
                            }
                        }
                        i15++;
                        i12 = 2;
                    }
                }
                u1Var5.dismiss();
                return;
            case 18:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.c, (byte[]) this.d, (TLObject) this.b, (byte[]) this.e);
                return;
            case 19:
                ya1 ya1Var = (ya1) this.c;
                TLObject tLObject9 = (TLObject) this.b;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                    ya1Var.z0(new by0(25, ya1Var, str6));
                    return;
                }
                if (tL_error7 == null || tL_error7.text.startsWith("CODE_INVALID")) {
                    ya1Var.D0();
                    return;
                }
                if (!tL_error7.text.startsWith("FLOOD_WAIT")) {
                    ya1Var.L0(org.telegram.messenger.hd.M0(2131743932, null), tL_error7.text);
                    return;
                }
                int intValue = Utilities.z(tL_error7.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String M02 = org.telegram.messenger.hd.M0(2131743932, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                ya1Var.L0(M02, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750687, objArr));
                return;
            case 20:
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) this.c;
                di.o7 o7Var = (di.o7) this.b;
                String str7 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (u0Var.c && ((x0Var = u0Var.Q) == null || !x0Var.o(o7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str7 + " dropped after document change");
                    return;
                }
                u0Var.d("window.Telegram.WebView.receiveEvent('" + str7 + "', " + jSONObject + ");");
                return;
            case 21:
                ui.e eVar = (ui.e) this.c;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                p4.h hVar = (p4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
                synchronized (eVar.b) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            eVar.p(hVar);
                        }
                    } finally {
                    }
                }
                return;
            case 22:
                a();
                return;
            case 23:
                p4.c1 c1Var = (p4.c1) this.c;
                p4.v vVar = (p4.v) this.b;
                p4.d0 d0Var = (p4.d0) this.d;
                p4.l lVar = (p4.l) this.e;
                ui.e eVar2 = c1Var.b;
                try {
                    c1Var.c.remove(vVar);
                    if (!d0Var.j()) {
                        p4.x0 x0Var2 = (p4.x0) vVar.d;
                        x0Var2.getClass();
                        IBinder asBinder = x0Var2.a.asBinder();
                        p4.t m11 = d0Var.m(vVar);
                        if (eVar2.D(vVar)) {
                            try {
                                h2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
                            } catch (Throwable th2) {
                                th = th2;
                                if (!z10) {
                                    c8.ab.a(lVar);
                                }
                                throw th;
                            }
                        }
                        eVar2.b(asBinder, vVar, m11.a, m11.b);
                        com.google.android.gms.common.api.internal.s C = eVar2.C(vVar);
                        if (C == null) {
                            h2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            p4.g1 g1Var = d0Var.t;
                            p4.e1 e1Var = d0Var.s;
                            e2.y0 y0Var = m11.b;
                            p4.e1 a12 = c1Var.a1(e1Var);
                            MediaSession.Token token = ((q4.l) d0Var.h.n.b).c.b;
                            h9.i0 i0Var = m11.c;
                            if (i0Var == null) {
                                i0Var = d0Var.y;
                            }
                            h9.i0 i0Var2 = m11.d;
                            if (i0Var2 == null) {
                                i0Var2 = d0Var.z;
                            }
                            h9.i0 i0Var3 = d0Var.r;
                            p4.j1 j1Var = m11.a;
                            e2.y0 t6 = g1Var.t();
                            p4.o1 o1Var = d0Var.j.a;
                            o1Var.getClass();
                            p4.j jVar = new p4.j(c1Var, i0Var, i0Var2, i0Var3, j1Var, y0Var, t6, new Bundle(o1Var.g), d0Var.A, a12, token);
                            if (!d0Var.j()) {
                                try {
                                    ((p4.k) lVar).H0(C.e(), jVar.a(vVar.c));
                                    z9 = true;
                                } catch (RemoteException unused2) {
                                    z9 = false;
                                }
                                if (z9 && (!d0Var.x || !p4.d0.k(vVar))) {
                                    d0Var.e.getClass();
                                    break;
                                }
                                return;
                            }
                        }
                    }
                    c8.ab.a(lVar);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                }
                break;
            case 24:
                p4.d0 d0Var2 = (p4.d0) this.c;
                m9.e0 e0Var = (m9.e0) this.b;
                h2.j jVar2 = (h2.j) this.d;
                m9.y yVar = (m9.y) this.e;
                if (d0Var2.j()) {
                    e0Var.m(null);
                    return;
                }
                try {
                    jVar2.accept(yVar);
                    e0Var.m(null);
                    return;
                } catch (Throwable th4) {
                    e0Var.n(th4);
                    return;
                }
            case 25:
                p4.d0 d0Var3 = (p4.d0) this.c;
                p4.z0 z0Var = (p4.z0) this.b;
                p4.v vVar2 = (p4.v) this.d;
                List list = (List) this.e;
                if (d0Var3.j()) {
                    return;
                }
                z0Var.a(d0Var3.t, vVar2, list);
                return;
            case 26:
                t5.a aVar = (t5.a) this.c;
                o5.i iVar = (o5.i) this.b;
                String str8 = iVar.a;
                l5.g gVar = (l5.g) this.d;
                o5.h hVar2 = (o5.h) this.e;
                aVar.getClass();
                Logger logger = t5.a.f;
                try {
                    p5.e a10 = aVar.c.a(str8);
                    if (a10 == null) {
                        String str9 = "Transport backend '" + str8 + "' is not registered";
                        logger.warning(str9);
                        gVar.b(new IllegalArgumentException(str9));
                    } else {
                        ((v5.g) aVar.e).f(new org.telegram.ui.Components.hr(aVar, iVar, ((m5.b) a10).a(hVar2), 11));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e14) {
                    logger.warning("Error scheduling event " + e14.getMessage());
                    gVar.b(e14);
                    return;
                }
            case 27:
                tg.c2 c2Var = (tg.c2) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                jn0 jn0Var = (jn0) this.d;
                tg.z1 z1Var = (tg.z1) this.e;
                c2Var.G = true;
                c2Var.H = (tg.z1[]) arrayList4.toArray(new tg.z1[0]);
                jn0Var.a(z1Var);
                return;
            case 28:
                tg.c2 c2Var2 = (tg.c2) this.c;
                TLObject tLObject10 = (TLObject) this.b;
                tg.a2 a2Var = (tg.a2) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.e;
                if (!(tLObject10 instanceof TLRPC.TL_messageMediaDocument)) {
                    c2Var2.h();
                    c2Var2.n(tL_error8);
                    return;
                }
                c2Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject10;
                a2Var.e = org.telegram.messenger.ui.a0(tL_messageMediaDocument.document, a2Var.c);
                a2Var.f = tL_messageMediaDocument;
                c2Var2.a();
                return;
            default:
                ui.e eVar3 = (ui.e) this.c;
                ((ArrayDeque) eVar3.b).addLast(new ui.d((l2.y) this.b, (ui.a) this.d, (RequestTimeDelegate) this.e));
                eVar3.S();
                return;
        }
    }

    public /* synthetic */ io0(org.telegram.ui.ActionBar.f2 f2Var, Object obj, TLObject tLObject, Object obj2, int i7) {
        this.a = i7;
        this.c = f2Var;
        this.d = obj;
        this.b = tLObject;
        this.e = obj2;
    }
}
