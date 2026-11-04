package gi;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ye;
import org.telegram.messenger.z10;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dl0;
import org.telegram.ui.gw;
import org.telegram.ui.is;
import org.telegram.ui.ra1;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q1(g2.d dVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 7;
        this.c = dVar;
        this.f = str;
        this.d = bitmap;
        this.b = z10;
        this.e = bitmap2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        double d;
        int i3;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        File file;
        File file2;
        switch (this.a) {
            case 0:
                r1 r1Var = (r1) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z12 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str = (String) this.f;
                t1 t1Var = r1Var.s;
                ArrayList arrayList = t1Var.n;
                if (r1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        i2 i2Var = t1Var.r;
                        int i17 = i2.z1;
                        r1Var.d = ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_messages_getInlineBotResults, new ci.t8(r1Var, str, z12, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    r1Var.h = messages_botresults.next_offset;
                    if (z12) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    r1Var.f();
                    t1Var.d.c(false);
                    r1Var.r = false;
                    return;
                }
                return;
            case 1:
                va vaVar = (va) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z13 = this.b;
                File file3 = (File) this.e;
                f7 f7Var = (f7) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z13 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new ei.h9(vaVar, f7Var, file3, 11));
                return;
            case 2:
                lg.z zVar = (lg.z) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                boolean z14 = this.b;
                ArrayList arrayList5 = zVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i18 = zVar.a;
                hp.s1(i18).Y3(arrayList3, true);
                hp.s1(i18).S3(arrayList4, true);
                hs.f(i18).k(hs.F1, new Object[0]);
                zVar.c = false;
                zVar.e(false, z14);
                return;
            case 3:
                mi.i4.f((org.telegram.ui.ActionBar.d2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.e6) this.e, (mi.q3) this.f, this.b);
                return;
            case 4:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 5:
                xd xdVar = (xd) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    xdVar.F(z15, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                wm wmVar = (wm) this.c;
                sf.b bVar = (sf.b) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                ci.g3 g3Var = (ci.g3) this.f;
                boolean z16 = this.b;
                bVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    wmVar.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    wmVar.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        obj = wmVar.getMessagesController().a2(Long.valueOf(o10));
                    } else if (o10 < 0) {
                        obj = wmVar.getMessagesController().M0(Long.valueOf(-o10));
                    }
                    g3Var.a(obj, Boolean.valueOf(z16));
                    return;
                }
                obj = null;
                g3Var.a(obj, Boolean.valueOf(z16));
                return;
            case 7:
                g2.d dVar = (g2.d) this.c;
                String str2 = (String) this.f;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z17 = this.b;
                Bitmap bitmap3 = (Bitmap) this.e;
                if (TextUtils.equals((String) dVar.b, str2)) {
                    dVar.f = null;
                    Bitmap bitmap4 = (Bitmap) dVar.c;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    dVar.c = bitmap2;
                    Runnable runnable = (Runnable) dVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap2.recycle();
                }
                if (z17) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 8:
                xs xsVar = (xs) this.c;
                boolean z18 = this.b;
                ci.s sVar = (ci.s) this.d;
                String str3 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) xsVar.getContext().getSystemService("clipboard");
                boolean z19 = z18 && (TextUtils.isEmpty(sVar.getText()) || TextUtils.equals(sVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                org.telegram.messenger.camera.q.l(textView.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.7f).scaleY(z19 ? 1.0f : 0.7f), xq.h, 300L);
                return;
            case 9:
                mx mxVar = (mx) this.c;
                String str4 = (String) this.f;
                boolean z20 = this.b;
                String str5 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                mxVar.a.remove(str5);
                ey eyVar = mxVar.b;
                jx jxVar = eyVar.k0;
                HashMap hashMap = eyVar.m0;
                if (jxVar.w && jxVar.x.equals(str4)) {
                    eyVar.k0.E(str4, "", false, true, z20, str5, tLObject4);
                    return;
                }
                if (z20 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    mxVar.a(str4, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str5)) {
                        return;
                    }
                    hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                wm wmVar2 = (wm) this.f;
                boolean z21 = this.b;
                File w10 = f7.w(d2Var.getCurrentAccount(), "webp");
                int o11 = az.o();
                float f10 = 512;
                float f11 = o11 != 0 ? o11 != 2 ? 2560 : 3840 : 1280;
                double d10 = (f11 * f10) / f10;
                if (((float) Math.floor(d10)) > f11) {
                    f11 = (float) Math.floor(d10);
                }
                float f12 = f11;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w10));
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
                createBitmap.recycle();
                ArrayList arrayList6 = new ArrayList();
                ye yeVar = new ye(0, w10.getAbsolutePath(), 0, false, 0, 0);
                arrayList6.add(yeVar);
                z10 z10Var = new z10();
                z10Var.a = (byte) 0;
                z10Var.C = tL_messages_stickerSet;
                org.telegram.messenger.w7.G(h10.t0);
                z10Var.j = org.telegram.messenger.w7.K(document, null, true, true).getAbsolutePath();
                z10Var.c = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                z10Var.d = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                z10Var.f = Math.min(512, 512) / f10;
                z10Var.g = Math.min(512, 512) / f10;
                int floor = (int) Math.floor(f12 * 0.5d);
                z10Var.q = floor;
                z10Var.r = floor;
                z10Var.v = 2.0f;
                z10Var.B = document;
                if (zi.L2(document, true) || zi.P4(document)) {
                    z10Var.b = (byte) (z10Var.b | (zi.L2(document, true) ? (byte) 1 : (byte) 4));
                }
                ArrayList arrayList7 = new ArrayList();
                yeVar.p = arrayList7;
                arrayList7.add(z10Var);
                yeVar.t = 3000L;
                if (zi.L2(document, true)) {
                    org.telegram.messenger.w7.G(h10.t0);
                    File K = org.telegram.messenger.w7.K(document, null, true, true);
                    if (K != null) {
                        try {
                            RLottieNative a10 = RLottieNative.a(K.getAbsolutePath(), null, null, null, 0, null);
                            if (a10 != null) {
                                int[] iArr = a10.a;
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                a10.d();
                                d = i19 / i20;
                            } else {
                                d = 0.0d;
                            }
                            yeVar.t = (long) (d * 1000.0d);
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                } else if (zi.P4(document)) {
                    yeVar.t = (long) (zi.H0(document) * 1000.0d);
                }
                PhotoViewer.v1().N2(d2Var.getParentActivity(), null, d2Var.getResourceProvider());
                PhotoViewer.v1().j2(arrayList6, 0, 11, false, new ov0(), wmVar2);
                PhotoViewer.v1().Z0(document, z21 ? document : null, true, null);
                is.p().T = z21 ? tL_messages_stickerSet : null;
                return;
            case 11:
                gw gwVar = (gw) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str6 = (String) this.f;
                boolean z22 = this.b;
                uw uwVar = gwVar.a;
                if (tL_error2 == null) {
                    TLRPC.User a22 = uwVar.getMessagesController().a2(Long.valueOf(uwVar.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = uwVar.getUserConfig().f();
                        if (a22 == null) {
                            return;
                        }
                        z10 = false;
                        uwVar.getMessagesController().X3(a22, false, false);
                    } else {
                        z10 = false;
                        uwVar.getUserConfig().w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList8, hs.g2, z10, null, z10);
                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(arrayList8, 800, z10, null, z10);
                    TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : org.telegram.messenger.w7.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_small = w11.location;
                    }
                    if (w12 != null) {
                        tL_userProfilePhoto.photo_big = w12.location;
                    }
                    if (w11 == null || uwVar.c4 == null) {
                        z11 = true;
                    } else {
                        i14 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        org.telegram.messenger.w7.G(i14);
                        File K2 = org.telegram.messenger.w7.K(w11, null, true, true);
                        i15 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        org.telegram.messenger.w7.G(i15);
                        org.telegram.messenger.w7.K(uwVar.c4, null, true, true).renameTo(K2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(uwVar.c4.volume_id);
                        sb2.append("_");
                        String o12 = a1.g.o(uwVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w11.location.volume_id);
                        sb3.append("_");
                        String o13 = a1.g.o(w11.location.local_id, "@50_50", sb3);
                        zb D = zb.D();
                        i16 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        z11 = true;
                        D.S(o12, o13, ac.m(i16, 1, a22));
                    }
                    if (x10 != null && str6 != null) {
                        i13 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        org.telegram.messenger.w7.G(i13);
                        new File(str6).renameTo(org.telegram.messenger.w7.K(x10, "mp4", z11, z11));
                    } else if (w12 != null && uwVar.d4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        org.telegram.messenger.w7.G(i11);
                        File K3 = org.telegram.messenger.w7.K(w12, null, true, true);
                        i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                        org.telegram.messenger.w7.G(i12);
                        org.telegram.messenger.w7.K(uwVar.d4, null, true, true).renameTo(K3);
                    }
                    uwVar.getMessagesController().U0(a22.id);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(a22);
                    i3 = 0;
                    uwVar.getMessagesStorage().m1(arrayList9, null, false, true);
                    TLRPC.UserFull b22 = uwVar.getMessagesController().b2(uwVar.getUserConfig().e());
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        uwVar.getMessagesStorage().j2(b22, false);
                    }
                } else {
                    i3 = 0;
                }
                uwVar.c4 = null;
                uwVar.d4 = null;
                hs notificationCenter = uwVar.getNotificationCenter();
                Object[] objArr = new Object[1];
                objArr[i3] = Integer.valueOf(hp.C8);
                notificationCenter.k(2, objArr);
                uwVar.getNotificationCenter().k(46, new Object[i3]);
                uwVar.getUserConfig().v(true);
                i10 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
                hp.s1(i10).k4(0L, "USERPIC_SETUP");
                uwVar.g5();
                org.telegram.ui.Components.ac acVar = uwVar.e4;
                if (acVar != null) {
                    org.telegram.ui.Components.rb rbVar = (org.telegram.ui.Components.rb) acVar.e;
                    rbVar.d.c(bd.M0(z22 ? 2131742803 : 2131742805, null), true, true);
                    rbVar.setProgress(1.0f);
                    org.telegram.ui.Components.xa button = rbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    org.telegram.messenger.camera.q.l(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), xq.h, 360L);
                    org.telegram.ui.Components.ac acVar2 = uwVar.e4;
                    acVar2.j = 5000;
                    acVar2.i(false);
                    uwVar.e4.i(true);
                    return;
                }
                return;
            case 12:
                dl0.f0((dl0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 13:
                dl0.n0((dl0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 14:
                ra1.Z((ra1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            case 15:
                wi.t0 t0Var = (wi.t0) this.c;
                boolean z23 = this.b;
                wi.w wVar = (wi.w) this.d;
                wi.p0 p0Var = (wi.p0) this.e;
                File file4 = (File) this.f;
                t0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    t0Var.g();
                    long j10 = t0Var.H;
                    if (z23) {
                        synchronized (wVar) {
                            wVar.w = true;
                            try {
                                wVar.g();
                                wVar.w = false;
                            } catch (Throwable th3) {
                                wVar.w = false;
                                throw th3;
                            }
                        }
                        t0Var.g();
                        t0Var.k(p0Var, 1);
                        file2 = wVar.a;
                        try {
                            t0Var.c(true);
                            wi.w wVar2 = t0Var.T;
                            long j11 = t0Var.J;
                            long j12 = t0Var.K;
                            int i21 = wVar.i();
                            int i22 = t0Var.n.a;
                            int i23 = t0Var.o;
                            if (i21 <= 0) {
                                i21 = t0Var.p.a;
                            }
                            m2.r0 a11 = x7.u5.a(file4, wVar2, j11, j12, true, new a7.d(i22, i23, i21));
                            j10 = a11.b;
                            t0Var.m.b("resume trim remux completed: requested=" + t0Var.J + ".." + t0Var.K + ", actualStartMs=" + a11.a + ", mode=" + ((String) a11.c) + ", retainedDurationMs=" + j10 + ", outputSize=" + t0Var.T.a.length() + ", elapsedMs=" + wi.t0.f(nanoTime));
                        } catch (Exception e12) {
                            e = e12;
                            file = file2;
                            try {
                                t0Var.i.post(new wi.d0(t0Var, e, 1));
                                if (file4 != null) {
                                    x7.u5.c(file4);
                                }
                                if (file != null) {
                                    x7.u5.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                if (file4 != null) {
                                    x7.u5.c(file4);
                                }
                                if (file != null) {
                                    x7.u5.c(file);
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            file = file2;
                            if (file4 != null) {
                            }
                            if (file != null) {
                            }
                            throw th;
                        }
                    } else {
                        file2 = null;
                    }
                    t0Var.g();
                    t0Var.U = null;
                    if (!z23) {
                        t0Var.m.b("resume prepared without remux: retainedDurationMs=" + j10 + ", elapsedMs=" + wi.t0.f(nanoTime));
                    }
                    t0Var.i.post(new wi.e0(t0Var, j10, 0));
                    if (file4 != null) {
                        x7.u5.c(file4);
                    }
                    if (file2 != null) {
                        x7.u5.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    e = e13;
                    file = null;
                } catch (Throwable th6) {
                    th = th6;
                    file = null;
                }
            default:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z24 = this.b;
                String str7 = (String) this.f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    xg.j.d(z24, str7, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, d2Var2.getParentActivity(), d2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        xg.j.e(z24, str7, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, d2Var2.getParentActivity(), d2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
    }

    public /* synthetic */ q1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i3) {
        this.a = i3;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f = obj3;
        this.b = z10;
    }

    public /* synthetic */ q1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ q1(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.a = 4;
        this.c = cameraController;
        this.d = iCameraView;
        this.e = file;
        this.b = z10;
        this.f = runnable;
    }

    public /* synthetic */ q1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = 16;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = d2Var;
    }

    public /* synthetic */ q1(xs xsVar, boolean z10, ci.s sVar, String str, TextView textView) {
        this.a = 8;
        this.c = xsVar;
        this.b = z10;
        this.d = sVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ q1(mx mxVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 9;
        this.c = mxVar;
        this.f = str;
        this.b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ q1(dl0 dl0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        this.a = 13;
        this.c = dl0Var;
        this.e = tL_error;
        this.b = z10;
        this.d = tLObject;
        this.f = str;
    }

    public /* synthetic */ q1(dl0 dl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 12;
        this.c = dl0Var;
        this.b = z10;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ q1(ra1 ra1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 14;
        this.c = ra1Var;
        this.d = tLObject;
        this.b = z10;
        this.f = str;
        this.e = passwordinputsettings;
    }

    public /* synthetic */ q1(wi.t0 t0Var, boolean z10, wi.w wVar, wi.p0 p0Var, File file) {
        this.a = 15;
        this.c = t0Var;
        this.b = z10;
        this.d = wVar;
        this.e = p0Var;
        this.f = file;
    }
}
