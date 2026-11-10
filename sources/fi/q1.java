package fi;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import c8.jd;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gc;
import org.telegram.messenger.gf;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cb1;
import org.telegram.ui.cn;
import org.telegram.ui.kl0;
import org.telegram.ui.mw;
import org.telegram.ui.ns;
import org.telegram.ui.zd;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ q1(h2.c cVar, String str, Bitmap bitmap, boolean z9, Bitmap bitmap2) {
        this.a = 7;
        this.c = cVar;
        this.f = str;
        this.d = bitmap;
        this.b = z9;
        this.e = bitmap2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        double d;
        int i7;
        int i10;
        boolean z9;
        boolean z10;
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
                boolean z11 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str = (String) this.f;
                t1 t1Var = r1Var.s;
                ArrayList arrayList = t1Var.n;
                if (r1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        k2 k2Var = t1Var.r;
                        int i17 = k2.B1;
                        r1Var.d = ConnectionsManager.getInstance(k2Var.a).sendRequest(tL_messages_getInlineBotResults, new bi.u9(r1Var, str, z11, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    r1Var.h = messages_botresults.next_offset;
                    if (z11) {
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
                boolean z12 = this.b;
                File file3 = (File) this.e;
                e7 e7Var = (e7) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z12 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new x1(vaVar, e7Var, file3, 7));
                return;
            case 2:
                kg.y yVar = (kg.y) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                boolean z13 = this.b;
                ArrayList arrayList5 = yVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i18 = yVar.a;
                qp.s1(i18).Y3(arrayList3, true);
                qp.s1(i18).S3(arrayList4, true);
                qs.f(i18).k(qs.F1, new Object[0]);
                yVar.c = false;
                yVar.e(false, z13);
                return;
            case 3:
                li.h4.f((org.telegram.ui.ActionBar.f2) this.c, (Context) this.d, (org.telegram.ui.ActionBar.h6) this.e, (li.q3) this.f, this.b);
                return;
            case 4:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 5:
                zd zdVar = (zd) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.d;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z14 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    zdVar.F(z14, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                cn cnVar = (cn) this.c;
                vf.b bVar = (vf.b) this.e;
                TLObject tLObject3 = (TLObject) this.d;
                bi.t3 t3Var = (bi.t3) this.f;
                boolean z15 = this.b;
                bVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    cnVar.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    cnVar.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        obj = cnVar.getMessagesController().a2(Long.valueOf(o4));
                    } else if (o4 < 0) {
                        obj = cnVar.getMessagesController().M0(Long.valueOf(-o4));
                    }
                    t3Var.a(obj, Boolean.valueOf(z15));
                    return;
                }
                obj = null;
                t3Var.a(obj, Boolean.valueOf(z15));
                return;
            case 7:
                h2.c cVar = (h2.c) this.c;
                String str2 = (String) this.f;
                Bitmap bitmap2 = (Bitmap) this.d;
                boolean z16 = this.b;
                Bitmap bitmap3 = (Bitmap) this.e;
                if (TextUtils.equals((String) cVar.b, str2)) {
                    cVar.f = null;
                    Bitmap bitmap4 = (Bitmap) cVar.c;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                    }
                    cVar.c = bitmap2;
                    Runnable runnable = (Runnable) cVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap2.recycle();
                }
                if (z16) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 8:
                ys ysVar = (ys) this.c;
                boolean z17 = this.b;
                bi.v vVar = (bi.v) this.d;
                String str3 = (String) this.f;
                TextView textView = (TextView) this.e;
                ClipboardManager clipboardManager = (ClipboardManager) ysVar.getContext().getSystemService("clipboard");
                boolean z18 = z17 && (TextUtils.isEmpty(vVar.getText()) || TextUtils.equals(vVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                org.telegram.messenger.camera.q.l(textView.animate().alpha(z18 ? 1.0f : 0.0f).scaleX(z18 ? 1.0f : 0.7f).scaleY(z18 ? 1.0f : 0.7f), wq.h, 300L);
                return;
            case 9:
                ox oxVar = (ox) this.c;
                String str4 = (String) this.f;
                boolean z19 = this.b;
                String str5 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.d;
                oxVar.a.remove(str5);
                gy gyVar = oxVar.b;
                lx lxVar = gyVar.j0;
                HashMap hashMap = gyVar.l0;
                if (lxVar.w && lxVar.x.equals(str4)) {
                    gyVar.j0.E(str4, "", false, true, z19, str5, tLObject4);
                    return;
                }
                if (z19 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    oxVar.a(str4, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str5)) {
                        return;
                    }
                    hashMap.put(str5, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                cn cnVar2 = (cn) this.f;
                boolean z20 = this.b;
                File w10 = e7.w(f2Var.getCurrentAccount(), "webp");
                int o10 = iz.o();
                float f10 = 512;
                float f11 = o10 != 0 ? o10 != 2 ? 2560 : 3840 : 1280;
                double d2 = (f11 * f10) / f10;
                if (((float) Math.floor(d2)) > f11) {
                    f11 = (float) Math.floor(d2);
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
                gf gfVar = new gf(0, w10.getAbsolutePath(), 0, false, 0, 0);
                arrayList6.add(gfVar);
                h20 h20Var = new h20();
                h20Var.a = (byte) 0;
                h20Var.C = tL_messages_stickerSet;
                org.telegram.messenger.w7.G(p10.s0);
                h20Var.j = org.telegram.messenger.w7.J(document, null, true, true).getAbsolutePath();
                h20Var.c = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                h20Var.d = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                h20Var.f = Math.min(512, 512) / f10;
                h20Var.g = Math.min(512, 512) / f10;
                int floor = (int) Math.floor(f12 * 0.5d);
                h20Var.q = floor;
                h20Var.r = floor;
                h20Var.v = 2.0f;
                h20Var.B = document;
                if (ij.K2(document, true) || ij.O4(document)) {
                    h20Var.b = (byte) (h20Var.b | (ij.K2(document, true) ? (byte) 1 : (byte) 4));
                }
                ArrayList arrayList7 = new ArrayList();
                gfVar.p = arrayList7;
                arrayList7.add(h20Var);
                gfVar.t = 3000L;
                if (ij.K2(document, true)) {
                    org.telegram.messenger.w7.G(p10.s0);
                    File J = org.telegram.messenger.w7.J(document, null, true, true);
                    if (J != null) {
                        try {
                            RLottieNative a10 = RLottieNative.a(J.getAbsolutePath(), null, null, null, 0, null);
                            if (a10 != null) {
                                int[] iArr = a10.a;
                                int i19 = iArr[0];
                                int i20 = iArr[1];
                                a10.d();
                                d = i19 / i20;
                            } else {
                                d = 0.0d;
                            }
                            gfVar.t = (long) (d * 1000.0d);
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                    }
                } else if (ij.O4(document)) {
                    gfVar.t = (long) (ij.H0(document) * 1000.0d);
                }
                PhotoViewer.p1().H2(f2Var.getParentActivity(), null, f2Var.getResourceProvider());
                PhotoViewer.p1().e2(arrayList6, 0, 11, false, new pv0(), cnVar2);
                PhotoViewer.p1().S0(document, z20 ? document : null, true, null);
                ns.p().T = z20 ? tL_messages_stickerSet : null;
                return;
            case 11:
                mw mwVar = (mw) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.d;
                String str6 = (String) this.f;
                boolean z21 = this.b;
                zw zwVar = mwVar.a;
                if (tL_error2 == null) {
                    TLRPC.User a22 = zwVar.getMessagesController().a2(Long.valueOf(zwVar.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = zwVar.getUserConfig().f();
                        if (a22 == null) {
                            return;
                        }
                        z9 = false;
                        zwVar.getMessagesController().X3(a22, false, false);
                    } else {
                        z9 = false;
                        zwVar.getUserConfig().w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList8, qs.g2, z9, null, z9);
                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(arrayList8, 800, z9, null, z9);
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
                    if (w11 == null || zwVar.c4 == null) {
                        z10 = true;
                    } else {
                        i14 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                        org.telegram.messenger.w7.G(i14);
                        File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                        i15 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                        org.telegram.messenger.w7.G(i15);
                        org.telegram.messenger.w7.J(zwVar.c4, null, true, true).renameTo(J2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(zwVar.c4.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(zwVar.c4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w11.location.volume_id);
                        sb3.append("_");
                        String n11 = a8.p0.n(w11.location.local_id, "@50_50", sb3);
                        gc D = gc.D();
                        i16 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                        z10 = true;
                        D.S(n10, n11, hc.m(i16, 1, a22));
                    }
                    if (x10 != null && str6 != null) {
                        i13 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                        org.telegram.messenger.w7.G(i13);
                        new File(str6).renameTo(org.telegram.messenger.w7.J(x10, "mp4", z10, z10));
                    } else if (w12 != null && zwVar.d4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                        org.telegram.messenger.w7.G(i11);
                        File J3 = org.telegram.messenger.w7.J(w12, null, true, true);
                        i12 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                        org.telegram.messenger.w7.G(i12);
                        org.telegram.messenger.w7.J(zwVar.d4, null, true, true).renameTo(J3);
                    }
                    zwVar.getMessagesController().U0(a22.id);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(a22);
                    i7 = 0;
                    zwVar.getMessagesStorage().m1(arrayList9, null, false, true);
                    TLRPC.UserFull b22 = zwVar.getMessagesController().b2(zwVar.getUserConfig().e());
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        zwVar.getMessagesStorage().j2(b22, false);
                    }
                } else {
                    i7 = 0;
                }
                zwVar.c4 = null;
                zwVar.d4 = null;
                qs notificationCenter = zwVar.getNotificationCenter();
                Object[] objArr = new Object[1];
                objArr[i7] = Integer.valueOf(qp.C8);
                notificationCenter.k(2, objArr);
                zwVar.getNotificationCenter().k(46, new Object[i7]);
                zwVar.getUserConfig().v(true);
                i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
                qp.s1(i10).k4(0L, "USERPIC_SETUP");
                zwVar.g5();
                bc bcVar = zwVar.e4;
                if (bcVar != null) {
                    org.telegram.ui.Components.sb sbVar = (org.telegram.ui.Components.sb) bcVar.e;
                    sbVar.d.c(id.M0(z21 ? 2131742793 : 2131742795, null), true, true);
                    sbVar.setProgress(1.0f);
                    org.telegram.ui.Components.xa button = sbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    org.telegram.messenger.camera.q.l(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), wq.h, 360L);
                    bc bcVar2 = zwVar.e4;
                    bcVar2.j = 5000;
                    bcVar2.i(false);
                    zwVar.e4.i(true);
                    return;
                }
                return;
            case 12:
                kl0.f0((kl0) this.c, this.b, (String) this.f, (String) this.d, (TL_account.updatePasswordSettings) this.e);
                return;
            case 13:
                kl0.n0((kl0) this.c, (TLRPC.TL_error) this.e, this.b, (TLObject) this.d, (String) this.f);
                return;
            case 14:
                cb1.Z((cb1) this.c, (TLObject) this.d, this.b, (String) this.f, (TL_account.passwordInputSettings) this.e);
                return;
            case 15:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z22 = this.b;
                String str7 = (String) this.f;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    wg.h.d(z22, str7, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, f2Var2.getParentActivity(), f2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        wg.h.e(z22, str7, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, f2Var2.getParentActivity(), f2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
            default:
                wi.t0 t0Var = (wi.t0) this.c;
                boolean z23 = this.b;
                wi.x xVar = (wi.x) this.d;
                wi.p0 p0Var = (wi.p0) this.e;
                File file4 = (File) this.f;
                t0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    t0Var.g();
                    long j3 = t0Var.I;
                    if (z23) {
                        synchronized (xVar) {
                            xVar.w = true;
                            try {
                                xVar.g();
                                xVar.w = false;
                            } catch (Throwable th3) {
                                xVar.w = false;
                                throw th3;
                            }
                        }
                        t0Var.g();
                        t0Var.k(p0Var, 1);
                        file2 = xVar.a;
                        try {
                            t0Var.c(true);
                            wi.x xVar2 = t0Var.U;
                            long j10 = t0Var.K;
                            long j11 = t0Var.L;
                            int i21 = xVar.i();
                            int i22 = t0Var.n.a;
                            int i23 = t0Var.o;
                            if (i21 <= 0) {
                                i21 = t0Var.p.a;
                            }
                            n2.p0 a11 = jd.a(file4, xVar2, j10, j11, true, new b7.d(i22, i23, i21));
                            j3 = a11.b;
                            t0Var.m.b("resume trim remux completed: requested=" + t0Var.K + ".." + t0Var.L + ", actualStartMs=" + a11.a + ", mode=" + ((String) a11.c) + ", retainedDurationMs=" + j3 + ", outputSize=" + t0Var.U.a.length() + ", elapsedMs=" + wi.t0.f(nanoTime));
                        } catch (Exception e12) {
                            e = e12;
                            file = file2;
                            try {
                                t0Var.i.post(new wi.e0(t0Var, e, 1));
                                if (file4 != null) {
                                    jd.c(file4);
                                }
                                if (file == null) {
                                    jd.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                if (file4 != null) {
                                    jd.c(file4);
                                }
                                if (file != null) {
                                    jd.c(file);
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
                    t0Var.V = null;
                    if (!z23) {
                        t0Var.m.b("resume prepared without remux: retainedDurationMs=" + j3 + ", elapsedMs=" + wi.t0.f(nanoTime));
                    }
                    t0Var.i.post(new wi.f0(t0Var, j3, 0));
                    if (file4 != null) {
                        jd.c(file4);
                    }
                    if (file2 != null) {
                        jd.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    e = e13;
                    file = null;
                    t0Var.i.post(new wi.e0(t0Var, e, 1));
                    if (file4 != null) {
                    }
                    if (file == null) {
                    }
                } catch (Throwable th6) {
                    th = th6;
                    file = null;
                    if (file4 != null) {
                    }
                    if (file != null) {
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z9;
    }

    public /* synthetic */ q1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z9, int i7) {
        this.a = i7;
        this.c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f = obj3;
        this.b = z9;
    }

    public /* synthetic */ q1(Object obj, Object obj2, boolean z9, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = z9;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ q1(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z9, Runnable runnable) {
        this.a = 4;
        this.c = cameraController;
        this.d = iCameraView;
        this.e = file;
        this.b = z9;
        this.f = runnable;
    }

    public /* synthetic */ q1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z9, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = 15;
        this.c = payments_giveawayinfo;
        this.b = z9;
        this.f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = f2Var;
    }

    public /* synthetic */ q1(ys ysVar, boolean z9, bi.v vVar, String str, TextView textView) {
        this.a = 8;
        this.c = ysVar;
        this.b = z9;
        this.d = vVar;
        this.f = str;
        this.e = textView;
    }

    public /* synthetic */ q1(ox oxVar, String str, boolean z9, String str2, TLObject tLObject) {
        this.a = 9;
        this.c = oxVar;
        this.f = str;
        this.b = z9;
        this.e = str2;
        this.d = tLObject;
    }

    public /* synthetic */ q1(kl0 kl0Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, String str) {
        this.a = 13;
        this.c = kl0Var;
        this.e = tL_error;
        this.b = z9;
        this.d = tLObject;
        this.f = str;
    }

    public /* synthetic */ q1(kl0 kl0Var, boolean z9, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 12;
        this.c = kl0Var;
        this.b = z9;
        this.f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public /* synthetic */ q1(cb1 cb1Var, TLObject tLObject, boolean z9, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.a = 14;
        this.c = cb1Var;
        this.d = tLObject;
        this.b = z9;
        this.f = str;
        this.e = passwordinputsettings;
    }

    public /* synthetic */ q1(wi.t0 t0Var, boolean z9, wi.x xVar, wi.p0 p0Var, File file) {
        this.a = 16;
        this.c = t0Var;
        this.b = z9;
        this.d = xVar;
        this.e = p0Var;
        this.f = file;
    }
}
