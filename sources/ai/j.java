package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import c8.le;
import di.k8;
import di.z2;
import fi.s5;
import hi.d7;
import hi.sa;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import oi.e4;
import oi.n3;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.e20;
import org.telegram.messenger.fc;
import org.telegram.messenger.ff;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qx;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.kl0;
import org.telegram.ui.lw;
import org.telegram.ui.xa1;
import org.telegram.ui.xd;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
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
                ki.r1 r1Var = (ki.r1) this.e;
                String str = (String) this.c;
                int[] iArr = (int[]) this.f;
                boolean z12 = this.b;
                t[] tVarArr = DictationAsr.a;
                if (zArr[0]) {
                    return;
                }
                r1Var.a(str, iArr, z12);
                return;
            case 1:
                hi.r1 r1Var2 = (hi.r1) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z13 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.f;
                String str2 = (String) this.c;
                hi.t1 t1Var = r1Var2.s;
                ArrayList arrayList = t1Var.n;
                if (r1Var2.r) {
                    if (!(tLObject instanceof TLRPC.messages_BotResults)) {
                        hi.i2 i2Var = t1Var.r;
                        int i17 = hi.i2.C1;
                        r1Var2.d = ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_messages_getInlineBotResults, new k8(r1Var2, str2, z13, 1));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    r1Var2.h = messages_botresults.next_offset;
                    if (z13) {
                        arrayList.clear();
                    }
                    arrayList.size();
                    arrayList.addAll(messages_botresults.results);
                    r1Var2.f();
                    t1Var.d.c(false);
                    r1Var2.r = false;
                    return;
                }
                return;
            case 2:
                sa saVar = (sa) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z14 = this.b;
                File file3 = (File) this.c;
                d7 d7Var = (d7) this.f;
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, z14 ? 95 : 99, new FileOutputStream(file3));
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new s5(saVar, d7Var, file3, 14));
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
                np.s1(i18).Y3(arrayList3, true);
                np.s1(i18).S3(arrayList4, true);
                ns.f(i18).k(ns.F1, new Object[0]);
                yVar.c = false;
                yVar.e(false, z15);
                return;
            case 4:
                e4.f((org.telegram.ui.ActionBar.e2) this.d, (Context) this.e, (e6) this.c, (n3) this.f, this.b);
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
                an anVar = (an) this.d;
                vf.b bVar = (vf.b) this.e;
                TLObject tLObject3 = (TLObject) this.c;
                z2 z2Var = (z2) this.f;
                boolean z17 = this.b;
                bVar.b();
                if (tLObject3 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject3;
                    anVar.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    anVar.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        obj = anVar.getMessagesController().a2(Long.valueOf(o4));
                    } else if (o4 < 0) {
                        obj = anVar.getMessagesController().M0(Long.valueOf(-o4));
                    }
                    z2Var.a(obj, Boolean.valueOf(z17));
                    return;
                }
                obj = null;
                z2Var.a(obj, Boolean.valueOf(z17));
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
                ft ftVar = (ft) this.d;
                boolean z19 = this.b;
                di.q qVar = (di.q) this.e;
                String str4 = (String) this.c;
                TextView textView = (TextView) this.f;
                ClipboardManager clipboardManager = (ClipboardManager) ftVar.getContext().getSystemService("clipboard");
                boolean z20 = z19 && (TextUtils.isEmpty(qVar.getText()) || TextUtils.equals(qVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                i20.n(textView.animate().alpha(z20 ? 1.0f : 0.0f).scaleX(z20 ? 1.0f : 0.7f).scaleY(z20 ? 1.0f : 0.7f), er.h, 300L);
                return;
            case 10:
                tx txVar = (tx) this.d;
                String str5 = (String) this.c;
                boolean z21 = this.b;
                String str6 = (String) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                txVar.a.remove(str6);
                ly lyVar = txVar.b;
                qx qxVar = lyVar.k0;
                HashMap hashMap = lyVar.m0;
                if (qxVar.w && qxVar.x.equals(str5)) {
                    lyVar.k0.E(str5, "", false, true, z21, str6, tLObject4);
                    return;
                }
                if (z21 && (!(tLObject4 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject4).results.isEmpty())) {
                    txVar.a(str5, false);
                    return;
                } else {
                    if (!(tLObject4 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str6)) {
                        return;
                    }
                    hashMap.put(str6, (TLRPC.messages_BotResults) tLObject4);
                    return;
                }
            case 11:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.e;
                TLRPC.Document document = (TLRPC.Document) this.c;
                an anVar2 = (an) this.f;
                boolean z22 = this.b;
                File w10 = d7.w(e2Var.getCurrentAccount(), "webp");
                int o10 = gz.o();
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
                ff ffVar = new ff(0, w10.getAbsolutePath(), 0, false, 0, 0);
                arrayList6.add(ffVar);
                e20 e20Var = new e20();
                e20Var.a = (byte) 0;
                e20Var.C = tL_messages_stickerSet;
                w7.G(m10.t0);
                e20Var.j = w7.J(document, null, true, true).getAbsolutePath();
                e20Var.c = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                e20Var.d = 0.5f - ((Math.min(512, 512) / f10) / 2.0f);
                e20Var.f = Math.min(512, 512) / f10;
                e20Var.g = Math.min(512, 512) / f10;
                int floor = (int) Math.floor(f12 * 0.5d);
                e20Var.q = floor;
                e20Var.r = floor;
                e20Var.v = 2.0f;
                e20Var.B = document;
                if (gj.K2(document, true) || gj.O4(document)) {
                    e20Var.b = (byte) (e20Var.b | (gj.K2(document, true) ? (byte) 1 : (byte) 4));
                }
                ArrayList arrayList7 = new ArrayList();
                ffVar.p = arrayList7;
                arrayList7.add(e20Var);
                ffVar.t = 3000L;
                if (gj.K2(document, true)) {
                    w7.G(m10.t0);
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
                            ffVar.t = (long) (d * 1000.0d);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                    }
                } else if (gj.O4(document)) {
                    ffVar.t = (long) (gj.H0(document) * 1000.0d);
                }
                PhotoViewer.p1().I2(e2Var.getParentActivity(), null, e2Var.getResourceProvider());
                PhotoViewer.p1().f2(arrayList6, 0, 11, false, new rv0(), anVar2);
                PhotoViewer.p1().S0(document, z22 ? document : null, true, null);
                org.telegram.ui.ns.p().T = z22 ? tL_messages_stickerSet : null;
                return;
            case 12:
                lw lwVar = (lw) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.f;
                String str7 = (String) this.c;
                boolean z23 = this.b;
                yw ywVar = lwVar.a;
                if (tL_error2 == null) {
                    TLRPC.User a22 = ywVar.getMessagesController().a2(Long.valueOf(ywVar.getUserConfig().e()));
                    if (a22 == null) {
                        a22 = ywVar.getUserConfig().f();
                        if (a22 == null) {
                            return;
                        }
                        z10 = false;
                        ywVar.getMessagesController().X3(a22, false, false);
                    } else {
                        z10 = false;
                        ywVar.getUserConfig().w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    ArrayList<TLRPC.PhotoSize> arrayList8 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w11 = w7.w(arrayList8, ns.g2, z10, null, z10);
                    TLRPC.PhotoSize w12 = w7.w(arrayList8, 800, z10, null, z10);
                    TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : w7.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_small = w11.location;
                    }
                    if (w12 != null) {
                        tL_userProfilePhoto.photo_big = w12.location;
                    }
                    if (w11 == null || ywVar.d4 == null) {
                        z11 = true;
                    } else {
                        i14 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        w7.G(i14);
                        File J2 = w7.J(w11, null, true, true);
                        i15 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        w7.G(i15);
                        w7.J(ywVar.d4, null, true, true).renameTo(J2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ywVar.d4.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(ywVar.d4.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w11.location.volume_id);
                        sb3.append("_");
                        String n11 = a8.p0.n(w11.location.local_id, "@50_50", sb3);
                        fc D = fc.D();
                        i16 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        z11 = true;
                        D.S(n10, n11, gc.m(i16, 1, a22));
                    }
                    if (x10 != null && str7 != null) {
                        i13 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        w7.G(i13);
                        new File(str7).renameTo(w7.J(x10, "mp4", z11, z11));
                    } else if (w12 != null && ywVar.e4 != null) {
                        i11 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        w7.G(i11);
                        File J3 = w7.J(w12, null, true, true);
                        i12 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                        w7.G(i12);
                        w7.J(ywVar.e4, null, true, true).renameTo(J3);
                    }
                    ywVar.getMessagesController().U0(a22.id);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(a22);
                    i7 = 0;
                    ywVar.getMessagesStorage().m1(arrayList9, null, false, true);
                    TLRPC.UserFull b22 = ywVar.getMessagesController().b2(ywVar.getUserConfig().e());
                    if (b22 != null) {
                        b22.profile_photo = tL_photos_photo.photo;
                        ywVar.getMessagesStorage().j2(b22, false);
                    }
                } else {
                    i7 = 0;
                }
                ywVar.d4 = null;
                ywVar.e4 = null;
                ns notificationCenter = ywVar.getNotificationCenter();
                Object[] objArr = new Object[1];
                objArr[i7] = Integer.valueOf(np.D8);
                notificationCenter.k(2, objArr);
                ywVar.getNotificationCenter().k(46, new Object[i7]);
                ywVar.getUserConfig().v(true);
                i10 = ((org.telegram.ui.ActionBar.e2) ywVar).currentAccount;
                np.s1(i10).k4(0L, "USERPIC_SETUP");
                ywVar.g5();
                xb xbVar = ywVar.f4;
                if (xbVar != null) {
                    ob obVar = (ob) xbVar.e;
                    obVar.d.c(hd.M0(z23 ? 2131742793 : 2131742795, null), true, true);
                    obVar.setProgress(1.0f);
                    ua button = obVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    i20.n(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), er.h, 360L);
                    xb xbVar2 = ywVar.f4;
                    xbVar2.j = 5000;
                    xbVar2.i(false);
                    ywVar.f4.i(true);
                    return;
                }
                return;
            case 13:
                kl0.f0((kl0) this.d, this.b, (String) this.c, (String) this.e, (TL_account.updatePasswordSettings) this.f);
                return;
            case 14:
                kl0.n0((kl0) this.d, (TLRPC.TL_error) this.e, this.b, (TLObject) this.f, (String) this.c);
                return;
            case 15:
                xa1.Z((xa1) this.d, (TLObject) this.e, this.b, (String) this.c, (TL_account.passwordInputSettings) this.f);
                return;
            case 16:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.d;
                boolean z24 = this.b;
                String str8 = (String) this.c;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.e;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.f;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    wg.h.d(z24, str8, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, e2Var2.getParentActivity(), e2Var2.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        wg.h.e(z24, str8, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, e2Var2.getParentActivity(), e2Var2.getResourceProvider());
                        return;
                    }
                    return;
                }
            default:
                zi.v0 v0Var = (zi.v0) this.d;
                boolean z25 = this.b;
                zi.y yVar2 = (zi.y) this.e;
                zi.r0 r0Var = (zi.r0) this.c;
                File file4 = (File) this.f;
                v0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    v0Var.g();
                    long j3 = v0Var.I;
                    if (z25) {
                        synchronized (yVar2) {
                            yVar2.w = true;
                            try {
                                yVar2.g();
                                yVar2.w = false;
                            } catch (Throwable th3) {
                                yVar2.w = false;
                                throw th3;
                            }
                        }
                        v0Var.g();
                        v0Var.k(r0Var, 1);
                        file2 = yVar2.a;
                        try {
                            v0Var.c(true);
                            zi.y yVar3 = v0Var.U;
                            long j10 = v0Var.K;
                            long j11 = v0Var.L;
                            int i21 = yVar2.i();
                            int i22 = v0Var.n.a;
                            int i23 = v0Var.o;
                            if (i21 <= 0) {
                                i21 = v0Var.p.a;
                            }
                            n2.q0 a11 = le.a(file4, yVar3, j10, j11, true, new b7.d(i22, i23, i21));
                            j3 = a11.b;
                            v0Var.m.b("resume trim remux completed: requested=" + v0Var.K + ".." + v0Var.L + ", actualStartMs=" + a11.a + ", mode=" + ((String) a11.c) + ", retainedDurationMs=" + j3 + ", outputSize=" + v0Var.U.a.length() + ", elapsedMs=" + zi.v0.f(nanoTime));
                        } catch (Exception e12) {
                            e = e12;
                            file = file2;
                            try {
                                v0Var.i.post(new zi.f0(v0Var, e, 1));
                                if (file4 != null) {
                                    le.c(file4);
                                }
                                if (file == null) {
                                    le.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                if (file4 != null) {
                                    le.c(file4);
                                }
                                if (file != null) {
                                    le.c(file);
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
                    v0Var.g();
                    v0Var.V = null;
                    if (!z25) {
                        v0Var.m.b("resume prepared without remux: retainedDurationMs=" + j3 + ", elapsedMs=" + zi.v0.f(nanoTime));
                    }
                    v0Var.i.post(new zi.g0(v0Var, j3, 0));
                    if (file4 != null) {
                        le.c(file4);
                    }
                    if (file2 != null) {
                        le.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    e = e13;
                    file = null;
                    v0Var.i.post(new zi.f0(v0Var, e, 1));
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

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = z10;
    }

    public /* synthetic */ j(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = obj2;
        this.b = z10;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = tLObject;
        this.b = z10;
        this.f = tLObject2;
        this.c = str;
    }

    public /* synthetic */ j(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ j(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.a = 5;
        this.d = cameraController;
        this.e = iCameraView;
        this.c = file;
        this.b = z10;
        this.f = runnable;
    }

    public /* synthetic */ j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = 16;
        this.d = payments_giveawayinfo;
        this.b = z10;
        this.c = str;
        this.e = tL_messageMediaGiveaway;
        this.f = e2Var;
    }

    public /* synthetic */ j(tx txVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.a = 10;
        this.d = txVar;
        this.c = str;
        this.b = z10;
        this.e = str2;
        this.f = tLObject;
    }

    public /* synthetic */ j(lw lwVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.a = 12;
        this.d = lwVar;
        this.e = tL_error;
        this.f = tLObject;
        this.c = str;
        this.b = z10;
    }

    public /* synthetic */ j(kl0 kl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.a = 13;
        this.d = kl0Var;
        this.b = z10;
        this.c = str;
        this.e = str2;
        this.f = updatepasswordsettings;
    }
}
