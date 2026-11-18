package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import c8.oe;
import di.ga;
import di.n8;
import hi.d7;
import hi.ta;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import oi.g4;
import oi.p3;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.ec;
import org.telegram.messenger.ef;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yx;
import org.telegram.ui.Components.zv0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bb1;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.ml0;
import org.telegram.ui.ne;
import org.telegram.ui.ns;
import org.telegram.ui.ow;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.a = 8;
        this.d = cVar;
        this.c = str;
        this.e = bitmap;
        this.b = z10;
        this.f = bitmap2;
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
                boolean[] zArr = (boolean[]) this.d;
                ii.h hVar = (ii.h) this.e;
                String str = (String) this.c;
                int[] iArr = (int[]) this.f;
                boolean z12 = this.b;
                t[] tVarArr = DictationAsr.a;
                if (zArr[0]) {
                    return;
                }
                hVar.a(str, iArr, z12);
                return;
            case 1:
                hi.s1 s1Var = (hi.s1) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.f;
                String str2 = (String) this.c;
                hi.u1 u1Var = s1Var.s;
                ArrayList arrayList = u1Var.n;
                if (s1Var.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        hi.j2 j2Var = u1Var.r;
                        int i17 = hi.j2.C1;
                        s1Var.d = ConnectionsManager.getInstance(j2Var.a).sendRequest(tL_messages_getInlineBotResults, new n8(s1Var, str2, z13, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    s1Var.h = messages_botresults.next_offset;
                    if (z13) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    s1Var.f();
                    u1Var.d.c(false);
                    s1Var.r = false;
                    return;
                }
                return;
            case 2:
                ta taVar = (ta) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z14 = this.b;
                File file3 = (File) this.c;
                d7 d7Var = (d7) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z14 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new ga(taVar, d7Var, file3, 18));
                return;
            case 3:
                kg.y yVar = (kg.y) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.c;
                ArrayList arrayList4 = (ArrayList) this.f;
                boolean z15 = this.b;
                ArrayList arrayList5 = yVar.b;
                arrayList5.clear();
                arrayList5.addAll(arrayList2);
                int i18 = yVar.a;
                mp.u1(i18).f4(arrayList3, true);
                mp.u1(i18).Z3(arrayList4, true);
                ks.f(i18).k(ks.F1, new Object[0]);
                yVar.c = false;
                yVar.e(false, z15);
                return;
            case 4:
                g4.f((org.telegram.ui.ActionBar.h2) this.d, (Context) this.e, (i6) this.c, (p3) this.f, this.b);
                return;
            case 5:
                ((CameraController) this.d).lambda$recordVideo$12((CameraController.ICameraView) this.e, (File) this.c, this.b, (Runnable) this.f);
                return;
            case 6:
                xd xdVar = (xd) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.c;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z16 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    xdVar.F(z16, twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 7:
                bn bnVar = (bn) this.d;
                vf.b bVar = (vf.b) this.e;
                TLObject tLObject3 = (TLObject) this.c;
                ne neVar = (ne) this.f;
                boolean z17 = this.b;
                bVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    bnVar.getMessagesController().f4(tL_contacts_resolvedPeer.users, false);
                    bnVar.getMessagesController().Z3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = n5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        obj = bnVar.getMessagesController().c2(Long.valueOf(o4));
                    } else if (o4 < 0) {
                        obj = bnVar.getMessagesController().O0(Long.valueOf(-o4));
                    }
                    neVar.a(obj, Boolean.valueOf(z17));
                    return;
                }
                obj = null;
                neVar.a(obj, Boolean.valueOf(z17));
                return;
            case 8:
                h2.c cVar = (h2.c) this.d;
                String str3 = (String) this.c;
                Bitmap bitmap2 = (Bitmap) this.e;
                boolean z18 = this.b;
                Bitmap bitmap3 = (Bitmap) this.f;
                if (TextUtils.equals((String) cVar.b, str3)) {
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
                if (z18) {
                    bitmap3.recycle();
                    return;
                }
                return;
            case 9:
                mt mtVar = (mt) this.d;
                boolean z19 = this.b;
                di.q qVar = (di.q) this.e;
                String str4 = (String) this.c;
                TextView textView = (TextView) this.f;
                ClipboardManager clipboardManager = (ClipboardManager) mtVar.getContext().getSystemService("clipboard");
                boolean z20 = z19 && (TextUtils.isEmpty(qVar.getText()) || TextUtils.equals(qVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                n10.o(textView.animate().alpha(z20 ? 1.0f : 0.0f).scaleX(z20 ? 1.0f : 0.7f).scaleY(z20 ? 1.0f : 0.7f), lr.h, 300L);
                return;
            case 10:
                yx yxVar = (yx) this.d;
                String str5 = (String) this.c;
                boolean z21 = this.b;
                String str6 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                yxVar.a.remove(str6);
                ry ryVar = yxVar.b;
                vx vxVar = ryVar.k0;
                HashMap hashMap = ryVar.m0;
                if (vxVar.w && vxVar.x.equals(str5)) {
                    ryVar.k0.E(str5, "", false, true, z21, str6, tLObject4);
                    return;
                }
                if (z21 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    yxVar.a(str5, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str6)) {
                        return;
                    }
                    hashMap.put(str6, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 11:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                TLRPC.Document document = (TLRPC.Document) this.c;
                bn bnVar2 = (bn) this.f;
                boolean z22 = this.b;
                File w10 = d7.w(h2Var.getCurrentAccount(), "webp");
                int o10 = bz.o();
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
                    a8.g(th2, true);
                }
                createBitmap.recycle();
                ArrayList arrayList6 = new ArrayList();
                ef efVar = new ef(0, w10.getAbsolutePath(), 0, false, 0, 0);
                arrayList6.add(efVar);
                c20 c20Var = new c20();
                c20Var.a = (byte) 0;
                c20Var.C = tL_messages_stickerSet;
                w7.G(j10.t0);
                c20Var.j = w7.J(document, null, true, true).getAbsolutePath();
                c20Var.c = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                c20Var.d = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                c20Var.f = Math.min(512, 512) / f10;
                c20Var.g = Math.min(512, 512) / f10;
                int floor = (int) Math.floor(f12 * 0.5d);
                c20Var.q = floor;
                c20Var.r = floor;
                c20Var.v = 2.0f;
                c20Var.B = document;
                if (fj.K2(document, true) || fj.O4(document)) {
                    c20Var.b = (byte) (c20Var.b | (fj.K2(document, true) ? (byte) 1 : (byte) 4));
                }
                ArrayList arrayList7 = new ArrayList();
                efVar.p = arrayList7;
                arrayList7.add(c20Var);
                efVar.t = 3000L;
                if (fj.K2(document, true)) {
                    w7.G(j10.t0);
                    File J = w7.J(document, null, true, true);
                    if (J != null) {
                        try {
                            RLottieNative a10 = RLottieNative.a(J.getAbsolutePath(), null, null, null, 0, null);
                            if (a10 != null) {
                                int[] iArr2 = a10.a;
                                int i19 = iArr2[0];
                                int i20 = iArr2[1];
                                a10.d();
                                d = i19 / i20;
                            } else {
                                d = 0.0d;
                            }
                            efVar.t = (long) (d * 1000.0d);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                } else if (fj.O4(document)) {
                    efVar.t = (long) (fj.H0(document) * 1000.0d);
                }
                PhotoViewer.p1().I2(h2Var.getParentActivity(), null, h2Var.getResourceProvider());
                PhotoViewer.p1().f2(arrayList6, 0, 11, false, new zv0(), bnVar2);
                PhotoViewer.p1().S0(document, z22 ? document : null, true, null);
                ns.p().T = z22 ? tL_messages_stickerSet : null;
                return;
            case 12:
                ow owVar = (ow) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.f;
                String str7 = (String) this.c;
                boolean z23 = this.b;
                cx cxVar = owVar.a;
                if (tL_error2 == null) {
                    TLRPC.User c22 = cxVar.getMessagesController().c2(Long.valueOf(cxVar.getUserConfig().e()));
                    if (c22 == null) {
                        c22 = cxVar.getUserConfig().f();
                        if (c22 == null) {
                            return;
                        }
                        z10 = false;
                        cxVar.getMessagesController().e4(c22, false, false);
                    } else {
                        z10 = false;
                        cxVar.getUserConfig().w(c22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w11 = w7.w(arrayList8, ks.g2, z10, null, z10);
                    TLRPC.PhotoSize w12 = w7.w(arrayList8, 800, z10, null, z10);
                    TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : w7.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    c22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_small = w11.location;
                    }
                    if (w12 != null) {
                        tL_userProfilePhoto.photo_big = w12.location;
                    }
                    if (w11 == null || cxVar.g4 == null) {
                        z11 = true;
                    } else {
                        i14 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        w7.G(i14);
                        File J2 = w7.J(w11, null, true, true);
                        i15 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        w7.G(i15);
                        w7.J(cxVar.g4, null, true, true).renameTo(J2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cxVar.g4.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(cxVar.g4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w11.location.volume_id);
                        sb3.append("_");
                        String n11 = a8.p0.n(w11.location.local_id, "@50_50", sb3);
                        ec D = ec.D();
                        i16 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        z11 = true;
                        D.S(n10, n11, fc.m(i16, 1, c22));
                    }
                    if (x10 != null && str7 != null) {
                        i13 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        w7.G(i13);
                        new File(str7).renameTo(w7.J(x10, "mp4", z11, z11));
                    } else if (w12 != null && cxVar.h4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        w7.G(i11);
                        File J3 = w7.J(w12, null, true, true);
                        i12 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                        w7.G(i12);
                        w7.J(cxVar.h4, null, true, true).renameTo(J3);
                    }
                    cxVar.getMessagesController().W0(c22.id);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(c22);
                    i7 = 0;
                    cxVar.getMessagesStorage().m1(arrayList9, null, false, true);
                    TLRPC.UserFull d22 = cxVar.getMessagesController().d2(cxVar.getUserConfig().e());
                    if (d22 != null) {
                        d22.profile_photo = tL_photos_photo.photo;
                        cxVar.getMessagesStorage().j2(d22, false);
                    }
                } else {
                    i7 = 0;
                }
                cxVar.g4 = null;
                cxVar.h4 = null;
                ks notificationCenter = cxVar.getNotificationCenter();
                Object[] objArr = new Object[1];
                objArr[i7] = Integer.valueOf(mp.I8);
                notificationCenter.k(2, objArr);
                cxVar.getNotificationCenter().k(46, new Object[i7]);
                cxVar.getUserConfig().v(true);
                i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                mp.u1(i10).s4(0L, "USERPIC_SETUP");
                cxVar.o5();
                gc gcVar = cxVar.i4;
                if (gcVar != null) {
                    xb xbVar = (xb) gcVar.e;
                    xbVar.d.c(gd.M0(z23 ? 2131742535 : 2131742537, null), true, true);
                    xbVar.setProgress(1.0f);
                    db button = xbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    n10.o(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), lr.h, 360L);
                    gc gcVar2 = cxVar.i4;
                    gcVar2.j = 5000;
                    gcVar2.i(false);
                    cxVar.i4.i(true);
                    return;
                }
                return;
            case 13:
                ml0.f0((ml0) this.d, this.b, (String) this.c, (String) this.e, (TL_account.updatePasswordSettings) this.f);
                return;
            case 14:
                ml0.n0((ml0) this.d, (TLRPC.TL_error) this.e, this.b, (TLObject) this.f, (String) this.c);
                return;
            case 15:
                bb1.Z((bb1) this.d, (TLObject) this.e, this.b, (String) this.c, (TL_account.passwordInputSettings) this.f);
                return;
            case 16:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.d;
                boolean z24 = this.b;
                String str8 = (String) this.c;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.e;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) this.f;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    wg.h.d(z24, str8, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, h2Var2.getParentActivity(), h2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        wg.h.e(z24, str8, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, h2Var2.getParentActivity(), h2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
            default:
                zi.u0 u0Var = (zi.u0) this.d;
                boolean z25 = this.b;
                zi.x xVar = (zi.x) this.e;
                zi.q0 q0Var = (zi.q0) this.c;
                File file4 = (File) this.f;
                u0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    u0Var.g();
                    long j3 = u0Var.I;
                    if (z25) {
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
                        u0Var.g();
                        u0Var.k(q0Var, 1);
                        file2 = xVar.a;
                        try {
                            u0Var.c(true);
                            zi.x xVar2 = u0Var.U;
                            long j10 = u0Var.K;
                            long j11 = u0Var.L;
                            int i21 = xVar.i();
                            int i22 = u0Var.n.a;
                            int i23 = u0Var.o;
                            if (i21 <= 0) {
                                i21 = u0Var.p.a;
                            }
                            n2.q0 a11 = oe.a(file4, xVar2, j10, j11, true, new b7.d(i22, i23, i21));
                            j3 = a11.b;
                            u0Var.m.b("resume trim remux completed: requested=" + u0Var.K + ".." + u0Var.L + ", actualStartMs=" + a11.a + ", mode=" + ((String) a11.c) + ", retainedDurationMs=" + j3 + ", outputSize=" + u0Var.U.a.length() + ", elapsedMs=" + zi.u0.f(nanoTime));
                        } catch (Exception e12) {
                            e = e12;
                            file = file2;
                            try {
                                u0Var.i.post(new zi.e0(u0Var, e, 1));
                                if (file4 != null) {
                                    oe.c(file4);
                                }
                                if (file == null) {
                                    oe.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                if (file4 != null) {
                                    oe.c(file4);
                                }
                                if (file != null) {
                                    oe.c(file);
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
                    u0Var.g();
                    u0Var.V = null;
                    if (!z25) {
                        u0Var.m.b("resume prepared without remux: retainedDurationMs=" + j3 + ", elapsedMs=" + zi.u0.f(nanoTime));
                    }
                    u0Var.i.post(new zi.f0(u0Var, j3, 0));
                    if (file4 != null) {
                        oe.c(file4);
                    }
                    if (file2 != null) {
                        oe.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    e = e13;
                    file = null;
                    u0Var.i.post(new zi.e0(u0Var, e, 1));
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

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = z10;
    }

    public /* synthetic */ n(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.f = tLObject2;
        this.c = str;
    }

    public /* synthetic */ n(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.a = 5;
        this.d = cameraController;
        this.e = iCameraView;
        this.c = file;
        this.b = z10;
        this.f = runnable;
    }

    public /* synthetic */ n(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = 16;
        this.d = payments_giveawayinfo;
        this.b = z10;
        this.c = str;
        this.e = tL_messageMediaGiveaway;
        this.f = h2Var;
    }

    public /* synthetic */ n(yx yxVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 10;
        this.d = yxVar;
        this.c = str;
        this.b = z10;
        this.e = str2;
        this.f = tLObject;
    }

    public /* synthetic */ n(ow owVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.a = 12;
        this.d = owVar;
        this.e = tL_error;
        this.f = tLObject;
        this.c = str;
        this.b = z10;
    }

    public /* synthetic */ n(ml0 ml0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 13;
        this.d = ml0Var;
        this.b = z10;
        this.c = str;
        this.e = str2;
        this.f = updatepasswordsettings;
    }
}
