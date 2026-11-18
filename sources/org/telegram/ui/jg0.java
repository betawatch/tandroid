package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jg0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ab.c0 c0Var = (ab.c0) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        p4.h hVar = (p4.h) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (c0Var.b) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    c0Var.k(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        TLRPC.Chat O0;
        String str;
        String M0;
        int i10;
        String str2;
        String a02;
        ll0 ll0Var;
        ll0 ll0Var2;
        boolean z10;
        Uri fromFile;
        int i11;
        int indexOf;
        int i12;
        long j3;
        int i13;
        boolean z11;
        char c10;
        String G;
        org.telegram.ui.web.v0 v0Var;
        char c11;
        Bitmap bitmap;
        Bundle bundle;
        h9.i0 i0Var;
        Bundle bundle2;
        boolean z12;
        boolean z13;
        ArrayList arrayList;
        CharSequence charSequence;
        Bundle bundle3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        char c12;
        CharSequence charSequence4;
        long j10 = 0;
        switch (this.a) {
            case 0:
                kg0 kg0Var = (kg0) this.b;
                mg.b bVar = (mg.b) this.c;
                String str3 = (String) this.d;
                b51 b51Var = (b51) this.e;
                ng0 ng0Var = kg0Var.w.d;
                if (bVar != null) {
                    ng0Var.w.l(str3, bVar);
                }
                if (bVar != null && !b51Var.b && (i7 = b51Var.a) >= 0) {
                    View m10 = ng0Var.h.m(i7);
                    if (m10 instanceof m41) {
                        kg0Var.r.e = bVar;
                        m41 m41Var = (m41) m10;
                        m41Var.b.u0.d(false, false);
                        m41Var.g(false);
                    }
                }
                kg0Var.f();
                return;
            case 1:
                rh0 rh0Var = (rh0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                jg.z1 z1Var = rh0Var.h;
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = rh0Var.n;
                if (notificationsCustomSettingsActivity.f) {
                    rh0Var.f = null;
                    rh0Var.d = arrayList2;
                    rh0Var.e = arrayList3;
                    z1Var.f(arrayList4, null);
                    if (notificationsCustomSettingsActivity.f && !z1Var.e()) {
                        notificationsCustomSettingsActivity.c.c();
                    }
                    rh0Var.f();
                    return;
                }
                return;
            case 2:
                ml0 ml0Var = (ml0) this.b;
                org.telegram.ui.ActionBar.s4 s4Var = (org.telegram.ui.ActionBar.s4) this.c;
                Activity activity = (Activity) this.d;
                TLRPC.Message message = (TLRPC.Message) this.e;
                String str4 = "";
                ml0Var.b1 = true;
                ml0Var.g1 = 1;
                ml0Var.D0(s4Var, activity);
                TLRPC.InputInvoice inputInvoice = ml0Var.c1;
                boolean z14 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z15 = z14 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z16 = z14 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z14 && (ll0Var2 = ml0Var.a1) != null) {
                    ll0Var2.d(ml0Var.g1);
                }
                ml0Var.z0();
                if (z14 && (ll0Var = ml0Var.a1) != null) {
                    ll0Var.d(ml0Var.g1);
                }
                long w02 = ml0Var.w0();
                if (w02 > 0) {
                    str4 = org.telegram.messenger.o10.l(ml0Var.getMessagesController().c2(Long.valueOf(w02)));
                } else if (w02 < 0 && (O0 = ml0Var.getMessagesController().O0(Long.valueOf(-w02))) != null) {
                    str4 = O0.title;
                }
                long v02 = ml0Var.v0();
                int i14 = z14 ? (z15 || z16) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z14) {
                    if (z16) {
                        i10 = 2131744857;
                        str = null;
                    } else {
                        str = null;
                        if (z15) {
                            i10 = 2131744865;
                        } else {
                            M0 = org.telegram.messenger.gd.M0(2131744924, null);
                        }
                    }
                    M0 = org.telegram.messenger.gd.M0(i10, str);
                } else {
                    M0 = null;
                }
                if (z14) {
                    a02 = z16 ? org.telegram.messenger.gd.H(',', "StarsGiveawaySentPopupInfo", (int) v02) : org.telegram.messenger.gd.K(z15 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) v02, ',', str4);
                    str2 = null;
                } else {
                    str2 = null;
                    a02 = org.telegram.messenger.gd.a0(null, null, 2131747208, ml0Var.S0[0], ml0Var.r0);
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(a02);
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                org.telegram.ui.Components.lc b02 = org.telegram.ui.Components.lc.b0(T);
                org.telegram.ui.Components.gc I = (w02 == 0 || M0 == null || z16) ? M0 != null ? b02.I(i14, M0, W2) : b02.Q(i14, 36, W2) : b02.L(i14, M0, W2, org.telegram.messenger.gd.M0(2131743315, str2), new di.g3(w02, 3));
                I.r = false;
                I.j = 5000;
                if (message != null) {
                    fi.k3 k3Var = new fi.k3(ml0Var, I, z15, message, 4);
                    org.telegram.ui.Components.lb lbVar = I.e;
                    if (lbVar != null) {
                        lbVar.setOnClickListener(k3Var);
                    }
                }
                I.k(z16);
                return;
            case 3:
                ml0.i0((ml0) this.b, (TLObject) this.c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.e);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) this.c;
                org.telegram.messenger.ef efVar2 = (org.telegram.messenger.ef) this.e;
                String str5 = (String) this.d;
                Drawable[] drawableArr = PhotoViewer.Z8;
                Bitmap decodeFile = BitmapFactory.decodeFile(efVar.I);
                if (decodeFile == null) {
                    org.telegram.messenger.g0.g3(new hn0(photoViewer, 10));
                    return;
                }
                int i15 = 11;
                int[] iArr = new int[11];
                AnimatedFileNative.d(efVar2.I, iArr, 0L);
                int max = Math.max(iArr[1], efVar2.F);
                int max2 = Math.max(iArr[2], efVar2.G);
                if ((iArr[8] / 90) % 2 == 1) {
                    max2 = max;
                    max = max2;
                }
                float f10 = max;
                float f11 = max2;
                float max3 = Math.max(decodeFile.getWidth() / f10, decodeFile.getHeight() / f11);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * max3), (int) (f11 * max3), config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
                float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
                canvas.scale(max4, max4);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str5));
                    createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                    fileOutputStream.close();
                    Bitmap createBitmap2 = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
                    float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
                    canvas2.scale(max5, max5);
                    canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
                    org.telegram.messenger.g0.g3(new jg0(photoViewer, efVar2, str5, createBitmap2, 5));
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    org.telegram.messenger.g0.g3(new hn0(photoViewer, i15));
                    return;
                }
            case 5:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                org.telegram.messenger.ef efVar3 = (org.telegram.messenger.ef) this.c;
                String str6 = (String) this.d;
                Bitmap bitmap2 = (Bitmap) this.e;
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                if (efVar3.g != null) {
                    try {
                        new File(efVar3.g).delete();
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                efVar3.d = -1L;
                efVar3.g = str6;
                efVar3.e = null;
                efVar3.f = null;
                photoViewer2.q5.b.setLoading(false);
                uq0 uq0Var = photoViewer2.d;
                if (uq0Var != null) {
                    uq0Var.X(photoViewer2.P4);
                }
                yo0 yo0Var = photoViewer2.h1;
                if (yo0Var != null) {
                    yo0Var.setImage(bitmap2);
                }
                photoViewer2.c3(0);
                CheckBox checkBox = photoViewer2.O0;
                if (checkBox.y) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 6:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                Bitmap bitmap3 = (Bitmap) this.c;
                boolean[] zArr = (boolean[]) this.d;
                do0 do0Var = (do0) this.e;
                ImageView imageView = photoViewer3.x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap3);
                    photoViewer3.x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer3.D2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (zArr[0]) {
                        return;
                    }
                    zArr[0] = true;
                    do0Var.run();
                    return;
                }
                return;
            case 7:
                ro0 ro0Var = (ro0) this.b;
                TLObject tLObject = (TLObject) this.c;
                org.telegram.messenger.j10 j10Var = (org.telegram.messenger.j10) this.d;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                PhotoViewer photoViewer4 = ro0Var.b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i16 = photoViewer4.U;
                    ArrayList arrayList5 = photoViewer4.f7;
                    org.telegram.messenger.mp.u1(i16).f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(photoViewer4.U).c2(Long.valueOf(j10Var.n));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList5.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList5.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (c22 != null) {
                            c22.photo.photo_id = tL_photos_photo.photo.id;
                            j10Var.w(c22);
                            j10Var.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                is0.Z((is0) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
                return;
            case 9:
                PrivacyControlActivity.a0((PrivacyControlActivity) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
                return;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                try {
                    u1Var.dismiss();
                    z10 = true;
                } catch (Exception e12) {
                    z10 = true;
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.R = z10;
                    privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
                    privacySettingsActivity.a.f();
                    return;
                }
                return;
            case 11:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                Activity activity2 = (Activity) this.d;
                File file = (File) this.e;
                RectF rectF = ProfileActivity.Z6;
                try {
                    u1Var2.dismiss();
                } catch (Exception unused) {
                }
                if (!zArr2[0]) {
                    if (activity2 != null) {
                        Toast.makeText(activity2, org.telegram.messenger.gd.M0(2131751094, null), 0).show();
                        return;
                    }
                    return;
                }
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 24) {
                    org.telegram.messenger.t0.d();
                    fromFile = FileProvider.d(activity2, "org.telegram.messenger.beta.provider", file);
                } else {
                    fromFile = Uri.fromFile(file);
                }
                Intent intent = new Intent("android.intent.action.SEND");
                if (i17 >= 24) {
                    intent.addFlags(1);
                }
                intent.setType("message/rfc822");
                intent.putExtra("android.intent.extra.EMAIL", "");
                intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + org.telegram.messenger.gd.E0().z0().format(System.currentTimeMillis()));
                intent.putExtra("android.intent.extra.STREAM", fromFile);
                if (activity2 != null) {
                    try {
                        activity2.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                        return;
                    } catch (Exception e13) {
                        org.telegram.messenger.a8.g(e13, true);
                        return;
                    }
                }
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                int[] iArr2 = (int[]) this.e;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    i11 = 0;
                } else {
                    RectF rectF2 = ProfileActivity.Z6;
                    profileActivity.getClass();
                    i11 = 0;
                    org.telegram.ui.Components.lc.b0(profileActivity).g0(tL_error, false);
                }
                if (profileActivity.r4 == iArr2[i11]) {
                    profileActivity.r4 = i11;
                    return;
                }
                return;
            case 13:
                ProfileActivity.i0((ProfileActivity) this.b, (TLRPC.TL_error) this.c, (TLObject) this.e, (String) this.d);
                return;
            case 14:
                int i18 = 2;
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                String[] strArr = (String[]) this.c;
                String str7 = (String) this.d;
                String str8 = (String) this.e;
                RectF rectF3 = ProfileActivity.Z6;
                if (org.telegram.messenger.g0.E1(profileActivity2.getParentActivity())) {
                    org.telegram.ui.Components.y21.W0(profileActivity2.getParentActivity(), profileActivity2, strArr[0], str7, str8, new o00(profileActivity2, i18), null);
                    return;
                }
                return;
            case 15:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    m00.a(profileActivity3.getParentActivity(), 0, tL_username.username, profileActivity3.e1 != 0 ? profileActivity3.getMessagesController().c2(Long.valueOf(profileActivity3.e1)) : profileActivity3.getMessagesController().O0(Long.valueOf(profileActivity3.f1)), (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity3.A0);
                    return;
                } else {
                    RectF rectF4 = ProfileActivity.Z6;
                    org.telegram.ui.Components.lc.e0(tL_error2);
                    return;
                }
            case 16:
                rv0 rv0Var = (rv0) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.messenger.j10 j10Var2 = (org.telegram.messenger.j10) this.d;
                TLRPC.Photo photo2 = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = rv0Var.b;
                av0 av0Var = profileActivity4.o0;
                av0Var.d1--;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject5;
                    profileActivity4.getMessagesController().f4(tL_photos_photo2.users, false);
                    TLRPC.User c23 = profileActivity4.getMessagesController().c2(Long.valueOf(j10Var2.n));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList6 = profileActivity4.o0.W0;
                        if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(photo2)) >= 0) {
                            arrayList6.set(indexOf, photo3);
                        }
                        if (c23 != null) {
                            c23.photo.photo_id = tL_photos_photo2.photo.id;
                            j10Var2.w(c23);
                            j10Var2.v(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 17:
                dw0 dw0Var = (dw0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                ProfileActivity profileActivity5 = dw0Var.c.e;
                profileActivity5.h5(null);
                if (!(tLObject6 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.lc.e0(tL_error3);
                    return;
                }
                TLObject c24 = profileActivity5.e1 != 0 ? profileActivity5.getMessagesController().c2(Long.valueOf(profileActivity5.e1)) : profileActivity5.getMessagesController().O0(Long.valueOf(profileActivity5.f1));
                if (profileActivity5.getParentActivity() == null) {
                    return;
                }
                m00.a(profileActivity5.getParentActivity(), 0, tL_username2.username, c24, (TL_fragment.TL_collectibleInfo) tLObject6, profileActivity5.A0);
                return;
            case 18:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.d;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                try {
                    u1Var3.dismiss();
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (tL_error4 == null) {
                    sessionsActivity.d.remove(tL_webAuthorization);
                    sessionsActivity.r0();
                    z21 z21Var = sessionsActivity.a;
                    if (z21Var != null) {
                        z21Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.b;
                org.telegram.ui.ActionBar.u1 u1Var4 = (org.telegram.ui.ActionBar.u1) this.c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.d;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                try {
                    u1Var4.dismiss();
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.d.remove(tL_authorization);
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.r0();
                    z21 z21Var2 = sessionsActivity2.a;
                    if (z21Var2 != null) {
                        z21Var2.f();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                y21 y21Var = (y21) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.d;
                j9 j9Var = (j9) this.e;
                y21Var.a = tLObject7;
                y21Var.b = tL_error6;
                j9Var.run();
                return;
            case 21:
                o31.d0((o31) this.b, (TLRPC.TL_error) this.c, (TLObject) this.e, (String) this.d);
                return;
            case 22:
                n41 n41Var = (n41) this.b;
                mg.b bVar2 = (mg.b) this.c;
                String str9 = (String) this.d;
                b51 b51Var2 = (b51) this.e;
                c51 c51Var = n41Var.x;
                if (bVar2 != null) {
                    c51Var.V.l(str9, bVar2);
                }
                if (bVar2 != null && !b51Var2.b && (i12 = b51Var2.a) >= 0) {
                    View m11 = c51Var.U.m(i12);
                    if (m11 instanceof n41) {
                        n41Var.r.e = bVar2;
                        n41 n41Var2 = (n41) m11;
                        n41Var2.b.u0.d(false, false);
                        n41Var2.g(false);
                    }
                }
                c51.c0(c51Var);
                return;
            case 23:
                o41 o41Var = (o41) this.b;
                mg.b bVar3 = (mg.b) this.c;
                String str10 = (String) this.d;
                org.telegram.messenger.p10 p10Var = (org.telegram.messenger.p10) this.e;
                o41Var.k = false;
                o41Var.d = bVar3;
                o41Var.g = str10;
                m41 m41Var2 = (m41) p10Var.run();
                if (m41Var2 != null) {
                    m41Var2.e(o41Var, true);
                    return;
                }
                return;
            case 24:
                s81 s81Var = (s81) this.b;
                TLObject tLObject8 = (TLObject) this.c;
                String str11 = (String) this.d;
                org.telegram.ui.ActionBar.u1 u1Var5 = (org.telegram.ui.ActionBar.u1) this.e;
                w81 w81Var = s81Var.a;
                if (tLObject8 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject8;
                    int i19 = 0;
                    while (i19 < updates.updates.size()) {
                        if (updates.updates.get(i19) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i19);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str11;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = w81Var.getMessagesController().B1(w81Var.a);
                            tL_messageService.dialog_id = w81Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList7 = new ArrayList();
                            i13 = ((org.telegram.ui.ActionBar.h2) w81Var).currentAccount;
                            arrayList7.add(new org.telegram.messenger.fj(i13, tL_messageService, false, false));
                            TLRPC.Chat O02 = w81Var.getMessagesController().O0(Long.valueOf(-w81Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j11 = w81Var.b;
                            if (j11 != j10) {
                                tL_forumTopic.icon_emoji_id = j11;
                                z11 = true;
                                tL_forumTopic.flags |= 1;
                            } else {
                                z11 = true;
                            }
                            tL_forumTopic.my = z11;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str11;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = w81Var.getMessagesController().B1(w81Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = w81Var.F;
                            bn bnVar = w81Var.E;
                            if (bnVar != null) {
                                bnVar.ob();
                                bnVar.sb();
                                bnVar.Vb(arrayList7, O02, tL_messageService.id, 1, 1, tL_forumTopic);
                                bnVar.c = true;
                                bnVar.L8();
                                bnVar.wd(true);
                                bnVar.p1.n(true);
                                bnVar.Cd();
                                bnVar.g2.setCurrentTopic(bnVar.d());
                                bnVar.zd(true);
                                bnVar.Pc(true);
                                bnVar.D9(true);
                                bnVar.N6(true, true);
                                bnVar.hb();
                                w81Var.getMessagesController().t7.q(w81Var.a, tL_forumTopic, true);
                                w81Var.finishFragment();
                            } else {
                                Bundle bundle4 = new Bundle();
                                j3 = j10;
                                bundle4.putLong("chat_id", -w81Var.a);
                                bundle4.putInt("message_id", 1);
                                bundle4.putInt("unread_count", 0);
                                bundle4.putBoolean("historyPreloaded", false);
                                bn bnVar2 = new bn(bundle4);
                                bnVar2.Vb(arrayList7, O02, tL_messageService.id, 1, 1, tL_forumTopic);
                                bnVar2.c = true;
                                w81Var.getMessagesController().t7.q(w81Var.a, tL_forumTopic, true);
                                w81Var.presentFragment(bnVar2);
                                i19++;
                                j10 = j3;
                            }
                        }
                        j3 = j10;
                        i19++;
                        j10 = j3;
                    }
                }
                u1Var5.dismiss();
                return;
            case 25:
                TwoStepVerificationActivity.j0((TwoStepVerificationActivity) this.b, (byte[]) this.c, (TLObject) this.d, (byte[]) this.e);
                return;
            case 26:
                bb1 bb1Var = (bb1) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                String str12 = (String) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                    bb1Var.z0(new b31(17, bb1Var, str12));
                    return;
                }
                if (tL_error7 == null || tL_error7.text.startsWith("CODE_INVALID")) {
                    bb1Var.D0();
                    return;
                }
                if (!tL_error7.text.startsWith("FLOOD_WAIT")) {
                    bb1Var.L0(org.telegram.messenger.gd.M0(2131743694, null), tL_error7.text);
                    return;
                }
                int intValue = Utilities.z(tL_error7.text).intValue();
                if (intValue < 60) {
                    c10 = 0;
                    G = org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]);
                } else {
                    c10 = 0;
                    G = org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0]);
                }
                String M02 = org.telegram.messenger.gd.M0(2131743694, null);
                Object[] objArr = new Object[1];
                objArr[c10] = G;
                bb1Var.L0(M02, org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, objArr));
                return;
            case 27:
                org.telegram.ui.web.s0 s0Var = (org.telegram.ui.web.s0) this.b;
                fi.f7 f7Var = (fi.f7) this.c;
                String str13 = (String) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                if (s0Var.c && ((v0Var = s0Var.R) == null || !v0Var.o(f7Var))) {
                    org.telegram.messenger.a8.b("notifyEvent " + str13 + " dropped after document change");
                    return;
                }
                s0Var.d("window.Telegram.WebView.receiveEvent('" + str13 + "', " + jSONObject + ");");
                return;
            case 28:
                a();
                return;
            default:
                org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                ArrayList arrayList9 = (ArrayList) this.e;
                if (atomicInteger.incrementAndGet() == arrayList8.size()) {
                    ArrayList arrayList10 = new ArrayList();
                    int i20 = 0;
                    while (i20 < arrayList9.size()) {
                        m9.y yVar = (m9.y) arrayList9.get(i20);
                        if (yVar != null) {
                            try {
                                bitmap = (Bitmap) c8.t9.a(yVar);
                                c11 = '\b';
                            } catch (CancellationException | ExecutionException e16) {
                                c11 = '\b';
                                synchronized (h2.a.b) {
                                    Log.d("MediaSessionLegacyStub", h2.a.a("Failed to get bitmap", e16));
                                }
                            }
                            e2.l0 l0Var = (e2.l0) arrayList8.get(i20);
                            int i21 = p4.n.a;
                            String str14 = !l0Var.a.equals("") ? null : l0Var.a;
                            e2.o0 o0Var = l0Var.d;
                            Bitmap bitmap4 = bitmap == null ? bitmap : null;
                            bundle = o0Var.J;
                            CharSequence charSequence5 = o0Var.a;
                            CharSequence charSequence6 = o0Var.g;
                            CharSequence charSequence7 = o0Var.f;
                            i0Var = o0Var.K;
                            Integer num = o0Var.I;
                            Integer num2 = o0Var.q;
                            if (bundle != null) {
                                bundle = new Bundle(bundle);
                            }
                            bundle2 = bundle;
                            z12 = num2 == null && num2.intValue() != -1;
                            z13 = num == null;
                            if (!z12 || z13) {
                                if (bundle2 == null) {
                                    bundle2 = new Bundle();
                                }
                                Bundle bundle5 = bundle2;
                                if (z12) {
                                    arrayList = arrayList8;
                                    charSequence = charSequence7;
                                } else {
                                    num2.getClass();
                                    arrayList = arrayList8;
                                    charSequence = charSequence7;
                                    bundle5.putLong("android.media.extra.BT_FOLDER_TYPE", p4.n.a(num2.intValue()));
                                }
                                if (z13) {
                                    num.getClass();
                                    bundle5.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                                }
                                bundle3 = bundle5;
                            } else {
                                arrayList = arrayList8;
                                bundle3 = bundle2;
                                charSequence = charSequence7;
                            }
                            if (!i0Var.isEmpty()) {
                                if (bundle3 == null) {
                                    bundle3 = new Bundle();
                                }
                                bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                            }
                            charSequence2 = o0Var.e;
                            if (charSequence2 == null) {
                                if (bundle3 == null) {
                                    bundle3 = new Bundle();
                                }
                                bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence5);
                                charSequence3 = charSequence;
                            } else {
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                int i22 = 0;
                                int i23 = 0;
                                for (int i24 = 3; i22 < i24; i24 = 3) {
                                    String[] strArr2 = q4.i.d;
                                    if (i23 < strArr2.length) {
                                        int i25 = i23 + 1;
                                        String str15 = strArr2[i23];
                                        str15.getClass();
                                        switch (str15.hashCode()) {
                                            case -1853648227:
                                                if (str15.equals("android.media.metadata.ARTIST")) {
                                                    c12 = 0;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case -1850878751:
                                                if (str15.equals("android.media.metadata.AUTHOR")) {
                                                    c12 = 1;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case -1224124471:
                                                if (str15.equals("android.media.metadata.WRITER")) {
                                                    c12 = 2;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 194702059:
                                                if (str15.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                    c12 = 3;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1058837545:
                                                if (str15.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                    c12 = 4;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1684534006:
                                                if (str15.equals("android.media.metadata.COMPOSER")) {
                                                    c12 = 5;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1879671865:
                                                if (str15.equals("android.media.metadata.ALBUM")) {
                                                    c12 = 6;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1897146402:
                                                if (str15.equals("android.media.metadata.TITLE")) {
                                                    c12 = 7;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            case 1965214221:
                                                if (str15.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                    c12 = c11;
                                                    break;
                                                }
                                                c12 = 65535;
                                                break;
                                            default:
                                                c12 = 65535;
                                                break;
                                        }
                                        switch (c12) {
                                            case 0:
                                                charSequence4 = o0Var.b;
                                                break;
                                            case 1:
                                            default:
                                                charSequence4 = null;
                                                break;
                                            case 2:
                                                charSequence4 = o0Var.A;
                                                break;
                                            case 3:
                                                charSequence4 = charSequence;
                                                break;
                                            case 4:
                                                charSequence4 = charSequence6;
                                                break;
                                            case 5:
                                                charSequence4 = o0Var.B;
                                                break;
                                            case 6:
                                                charSequence4 = o0Var.c;
                                                break;
                                            case 7:
                                                charSequence4 = charSequence5;
                                                break;
                                            case '\b':
                                                charSequence4 = o0Var.d;
                                                break;
                                        }
                                        if (!TextUtils.isEmpty(charSequence4)) {
                                            charSequenceArr[i22] = charSequence4;
                                            i22++;
                                        }
                                        i23 = i25;
                                    } else {
                                        charSequence2 = charSequenceArr[0];
                                        CharSequence charSequence8 = charSequenceArr[1];
                                        charSequence6 = charSequenceArr[2];
                                        charSequence3 = charSequence8;
                                    }
                                }
                                charSequence2 = charSequenceArr[0];
                                CharSequence charSequence82 = charSequenceArr[1];
                                charSequence6 = charSequenceArr[2];
                                charSequence3 = charSequence82;
                            }
                            arrayList10.add(new q4.o(new q4.h(str14, charSequence2, charSequence3, charSequence6, bitmap4, o0Var.n, bundle3, l0Var.f.a), i20 != -1 ? -1L : i20));
                            i20++;
                            arrayList8 = arrayList;
                        } else {
                            c11 = '\b';
                        }
                        bitmap = null;
                        e2.l0 l0Var2 = (e2.l0) arrayList8.get(i20);
                        int i212 = p4.n.a;
                        if (!l0Var2.a.equals("")) {
                        }
                        e2.o0 o0Var2 = l0Var2.d;
                        if (bitmap == null) {
                        }
                        bundle = o0Var2.J;
                        CharSequence charSequence52 = o0Var2.a;
                        CharSequence charSequence62 = o0Var2.g;
                        CharSequence charSequence72 = o0Var2.f;
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
                        if (z12) {
                        }
                        if (bundle2 == null) {
                        }
                        Bundle bundle52 = bundle2;
                        if (z12) {
                        }
                        if (z13) {
                        }
                        bundle3 = bundle52;
                        if (!i0Var.isEmpty()) {
                        }
                        charSequence2 = o0Var2.e;
                        if (charSequence2 == null) {
                        }
                        arrayList10.add(new q4.o(new q4.h(str14, charSequence2, charSequence3, charSequence62, bitmap4, o0Var2.n, bundle3, l0Var2.f.a), i20 != -1 ? -1L : i20));
                        i20++;
                        arrayList8 = arrayList;
                    }
                    p4.m0.e0(((p4.m0) peVar.e).n, arrayList10);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ jg0(org.telegram.messenger.fs fsVar, Object obj, Object obj2, String str, int i7) {
        this.a = i7;
        this.b = fsVar;
        this.c = obj;
        this.e = obj2;
        this.d = str;
    }
}
