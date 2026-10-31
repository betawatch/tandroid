package ag;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.TextView;
import bi.a4;
import bi.t4;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.b8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.tz;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.zx;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.af;
import org.telegram.ui.ay;
import org.telegram.ui.le;
import org.telegram.ui.lt;
import org.telegram.ui.ox;
import org.telegram.ui.sm0;
import org.telegram.ui.tc1;
import org.telegram.ui.un;
import org.telegram.ui.wd;
import org.telegram.ui.zd;
import rh.l5;
import vh.n5;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z10;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0770  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        File file;
        File file2;
        boolean z10;
        Object obj;
        double d;
        int i10;
        TLRPC.FileLocation fileLocation;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.a) {
            case 0:
                s0 s0Var = (s0) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                boolean z12 = this.b;
                ArrayList arrayList4 = s0Var.b;
                arrayList4.clear();
                arrayList4.addAll(arrayList);
                int i18 = s0Var.a;
                vp.r1(i18).V3(arrayList2, true);
                vp.r1(i18).P3(arrayList3, true);
                zs.f(i18).k(zs.F1, new Object[0]);
                s0Var.c = false;
                s0Var.e(false, z12);
                return;
            case 1:
                t4.f((org.telegram.ui.ActionBar.k2) this.c, (Context) this.d, (p6) this.e, (a4) this.f, this.b);
                return;
            case 2:
                li.x0 x0Var = (li.x0) this.c;
                boolean z13 = this.b;
                li.z zVar = (li.z) this.d;
                li.t0 t0Var = (li.t0) this.e;
                File file3 = (File) this.f;
                x0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    x0Var.g();
                    long j10 = x0Var.H;
                    if (z13) {
                        try {
                            synchronized (zVar) {
                                zVar.w = true;
                                try {
                                    zVar.g();
                                    zVar.w = false;
                                } catch (Throwable th2) {
                                    zVar.w = false;
                                    throw th2;
                                }
                            }
                            x0Var.g();
                            x0Var.k(t0Var, 1);
                            file2 = zVar.a;
                        } catch (Exception e) {
                            e = e;
                            file = null;
                            try {
                                x0Var.i.post(new li.h0(x0Var, e, 1));
                                if (file3 != null) {
                                    w7.q.c(file3);
                                }
                                if (file == null) {
                                    w7.q.c(file);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (file3 != null) {
                                    w7.q.c(file3);
                                }
                                if (file != null) {
                                    w7.q.c(file);
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            file = null;
                            if (file3 != null) {
                            }
                            if (file != null) {
                            }
                            throw th;
                        }
                        try {
                            x0Var.c(true);
                            li.z zVar2 = x0Var.T;
                            long j11 = x0Var.J;
                            long j12 = x0Var.K;
                            int i19 = zVar.i();
                            int i20 = x0Var.n.a;
                            z10 = z13;
                            int i21 = x0Var.o;
                            if (i19 <= 0) {
                                i19 = x0Var.p.a;
                            }
                            k2.v0 a2 = w7.q.a(file3, zVar2, j11, j12, true, new a3.l(i20, i21, i19));
                            j10 = a2.b;
                            x0Var.m.b("resume trim remux completed: requested=" + x0Var.J + ".." + x0Var.K + ", actualStartMs=" + a2.a + ", mode=" + ((String) a2.c) + ", retainedDurationMs=" + j10 + ", outputSize=" + x0Var.T.a.length() + ", elapsedMs=" + li.x0.f(nanoTime));
                        } catch (Exception e7) {
                            e = e7;
                            file = file2;
                            x0Var.i.post(new li.h0(x0Var, e, 1));
                            if (file3 != null) {
                            }
                            if (file == null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            file = file2;
                            if (file3 != null) {
                            }
                            if (file != null) {
                            }
                            throw th;
                        }
                    } else {
                        z10 = z13;
                        file2 = null;
                    }
                    x0Var.g();
                    x0Var.U = null;
                    if (!z10) {
                        x0Var.m.b("resume prepared without remux: retainedDurationMs=" + j10 + ", elapsedMs=" + li.x0.f(nanoTime));
                    }
                    x0Var.i.post(new li.i0(x0Var, j10, 0));
                    if (file3 != null) {
                        w7.q.c(file3);
                    }
                    if (file2 != null) {
                        w7.q.c(file2);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    e = e10;
                    file = null;
                } catch (Throwable th6) {
                    th = th6;
                    file = null;
                }
            case 3:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z14 = this.b;
                String str = (String) this.d;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.e;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    mg.p.d(z14, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, k2Var.getParentActivity(), k2Var.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        mg.p.e(z14, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, k2Var.getParentActivity(), k2Var.getResourceProvider());
                        return;
                    }
                    return;
                }
            case 4:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 5:
                le leVar = (le) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z15 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.q0(password);
                    leVar.F(z15, twoStepVerificationActivity.p0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 6:
                un unVar = (un) this.c;
                gf.e eVar = (gf.e) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                af afVar = (af) this.f;
                boolean z16 = this.b;
                eVar.b();
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    unVar.getMessagesController().V3(tL_contacts_resolvedPeer.users, false);
                    unVar.getMessagesController().P3(tL_contacts_resolvedPeer.chats, false);
                    long o10 = o5.o(tL_contacts_resolvedPeer.peer);
                    if (o10 >= 0) {
                        obj = unVar.getMessagesController().Z1(Long.valueOf(o10));
                    } else if (o10 < 0) {
                        obj = unVar.getMessagesController().L0(Long.valueOf(-o10));
                    }
                    afVar.a(obj, Boolean.valueOf(z16));
                    return;
                }
                obj = null;
                afVar.a(obj, Boolean.valueOf(z16));
                return;
            case 7:
                e2.c cVar = (e2.c) this.c;
                String str2 = (String) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z17 = this.b;
                Bitmap bitmap2 = (Bitmap) this.f;
                if (TextUtils.equals((String) cVar.b, str2)) {
                    cVar.f = null;
                    Bitmap bitmap3 = (Bitmap) cVar.c;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    cVar.c = bitmap;
                    Runnable runnable = (Runnable) cVar.e;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    bitmap.recycle();
                }
                if (z17) {
                    bitmap2.recycle();
                    return;
                }
                return;
            case 8:
                mt mtVar = (mt) this.c;
                boolean z18 = this.b;
                zd zdVar = (zd) this.d;
                String str3 = (String) this.e;
                TextView textView = (TextView) this.f;
                ClipboardManager clipboardManager = (ClipboardManager) mtVar.getContext().getSystemService("clipboard");
                boolean z19 = z18 && (TextUtils.isEmpty(zdVar.getText()) || TextUtils.equals(zdVar.getText().toString(), str3)) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                z20.m(textView.animate().alpha(z19 ? 1.0f : 0.0f).scaleX(z19 ? 1.0f : 0.7f).scaleY(z19 ? 1.0f : 0.7f), gr.h, 300L);
                return;
            case 9:
                dy dyVar = (dy) this.c;
                String str4 = (String) this.d;
                boolean z20 = this.b;
                String str5 = (String) this.e;
                TLObject tLObject3 = (TLObject) this.f;
                dyVar.a.remove(str5);
                vy vyVar = dyVar.b;
                zx zxVar = vyVar.j0;
                HashMap hashMap = vyVar.l0;
                if (zxVar.w && zxVar.x.equals(str4)) {
                    vyVar.j0.E(str4, "", false, true, z20, str5, tLObject3);
                    return;
                }
                if (z20 && (!(tLObject3 instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject3).results.isEmpty())) {
                    dyVar.a(str4, false);
                    return;
                } else {
                    if (!(tLObject3 instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str5)) {
                        return;
                    }
                    hashMap.put(str5, (TLRPC.messages_BotResults) tLObject3);
                    return;
                }
            case 10:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) this.c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                TLRPC.Document document = (TLRPC.Document) this.e;
                un unVar2 = (un) this.f;
                boolean z21 = this.b;
                File w9 = n5.w(k2Var2.getCurrentAccount(), "webp");
                int o11 = tz.o();
                float f7 = 512;
                float f10 = o11 != 0 ? o11 != 2 ? 2560 : 3840 : 1280;
                double d10 = (f10 * f7) / f7;
                if (((float) Math.floor(d10)) > f10) {
                    f10 = (float) Math.floor(d10);
                }
                float f11 = f10;
                Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
                try {
                    createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w9));
                } catch (Throwable th7) {
                    f8.g(th7, true);
                }
                createBitmap.recycle();
                ArrayList arrayList5 = new ArrayList();
                ef efVar = new ef(0, w9.getAbsolutePath(), 0, false, 0, 0);
                arrayList5.add(efVar);
                v20 v20Var = new v20();
                v20Var.a = (byte) 0;
                v20Var.C = tL_messages_stickerSet;
                b8.G(d20.s0);
                v20Var.j = b8.K(document, null, true, true).getAbsolutePath();
                v20Var.c = 0.5f - ((Math.min(512, 512) / f7) / 2.0f);
                v20Var.d = 0.5f - ((Math.min(512, 512) / f7) / 2.0f);
                v20Var.f = Math.min(512, 512) / f7;
                v20Var.g = Math.min(512, 512) / f7;
                int floor = (int) Math.floor(f11 * 0.5d);
                v20Var.q = floor;
                v20Var.r = floor;
                v20Var.v = 2.0f;
                v20Var.B = document;
                if (jj.K2(document, true) || jj.O4(document)) {
                    v20Var.b = (byte) ((jj.K2(document, true) ? (byte) 1 : (byte) 4) | v20Var.b);
                }
                ArrayList arrayList6 = new ArrayList();
                efVar.p = arrayList6;
                arrayList6.add(v20Var);
                efVar.t = 3000L;
                if (jj.K2(document, true)) {
                    b8.G(d20.s0);
                    File K = b8.K(document, null, true, true);
                    if (K != null) {
                        try {
                            RLottieNative a10 = RLottieNative.a(K.getAbsolutePath(), null, null, null, 0, null);
                            if (a10 != null) {
                                int[] iArr = a10.a;
                                int i22 = iArr[0];
                                int i23 = iArr[1];
                                a10.d();
                                d = i22 / i23;
                            } else {
                                d = 0.0d;
                            }
                            efVar.t = (long) (d * 1000.0d);
                        } catch (Exception e11) {
                            f8.g(e11, true);
                        }
                    }
                } else if (jj.O4(document)) {
                    efVar.t = (long) (jj.H0(document) * 1000.0d);
                }
                PhotoViewer.v1().N2(k2Var2.getParentActivity(), null, k2Var2.getResourceProvider());
                PhotoViewer.v1().j2(arrayList5, 0, 11, false, new tw0(), unVar2);
                PhotoViewer.v1().Z0(document, z21 ? document : null, true, null);
                lt.p().T = z21 ? tL_messages_stickerSet : null;
                return;
            case 11:
                ox oxVar = (ox) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                String str6 = (String) this.f;
                boolean z22 = this.b;
                ay ayVar = oxVar.a;
                if (tL_error2 == null) {
                    TLRPC.User Z1 = ayVar.getMessagesController().Z1(Long.valueOf(ayVar.getUserConfig().e()));
                    if (Z1 == null) {
                        Z1 = ayVar.getUserConfig().f();
                        if (Z1 == null) {
                            return;
                        } else {
                            ayVar.getMessagesController().U3(Z1, false, false);
                        }
                    } else {
                        ayVar.getUserConfig().w(Z1);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    ArrayList<TLRPC.PhotoSize> arrayList7 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = b8.w(arrayList7, zs.g2, false, null, false);
                    TLRPC.PhotoSize w11 = b8.w(arrayList7, 800, false, null, false);
                    TLRPC.VideoSize x10 = tL_photos_photo.photo.video_sizes.isEmpty() ? null : b8.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    Z1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || ayVar.b4 == null) {
                        z11 = true;
                    } else {
                        i15 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        b8.G(i15);
                        File K2 = b8.K(w10, null, true, true);
                        i16 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        b8.G(i16);
                        b8.K(ayVar.b4, null, true, true).renameTo(K2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ayVar.b4.volume_id);
                        sb2.append("_");
                        String p5 = a1.g.p(sb2, ayVar.b4.local_id, "@50_50");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        String p9 = a1.g.p(sb3, w10.location.local_id, "@50_50");
                        hc D = hc.D();
                        i17 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        z11 = true;
                        D.S(p5, p9, ic.m(i17, 1, Z1));
                    }
                    if (x10 != null && str6 != null) {
                        i14 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        b8.G(i14);
                        new File(str6).renameTo(b8.K(x10, "mp4", z11, z11));
                    } else if (w11 != null && ayVar.c4 != null) {
                        i12 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        b8.G(i12);
                        File K3 = b8.K(w11, null, true, true);
                        i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                        b8.G(i13);
                        b8.K(ayVar.c4, null, true, true).renameTo(K3);
                    }
                    ayVar.getMessagesController().T0(Z1.id);
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(Z1);
                    i10 = 0;
                    ayVar.getMessagesStorage().m1(arrayList8, null, false, true);
                    TLRPC.UserFull a22 = ayVar.getMessagesController().a2(ayVar.getUserConfig().e());
                    if (a22 != null) {
                        a22.profile_photo = tL_photos_photo.photo;
                        ayVar.getMessagesStorage().j2(a22, false);
                    }
                    fileLocation = null;
                } else {
                    i10 = 0;
                    fileLocation = null;
                }
                ayVar.b4 = fileLocation;
                ayVar.c4 = fileLocation;
                zs notificationCenter = ayVar.getNotificationCenter();
                Object[] objArr = new Object[1];
                objArr[i10] = Integer.valueOf(vp.D8);
                notificationCenter.k(2, objArr);
                ayVar.getNotificationCenter().k(46, new Object[i10]);
                ayVar.getUserConfig().v(true);
                i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                vp.r1(i11).h4(0L, "USERPIC_SETUP");
                ayVar.f5();
                wb wbVar = ayVar.d4;
                if (wbVar != null) {
                    nb nbVar = (nb) wbVar.e;
                    nbVar.d.c(cd.L0(z22 ? 2131742818 : 2131742820, null), true, true);
                    nbVar.setProgress(1.0f);
                    sa button = nbVar.getButton();
                    button.setScaleX(0.6f);
                    button.setScaleY(0.6f);
                    button.setAlpha(0.0f);
                    button.setVisibility(0);
                    z20.m(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), gr.h, 360L);
                    wb wbVar2 = ayVar.d4;
                    wbVar2.j = 5000;
                    wbVar2.i(false);
                    ayVar.d4.i(true);
                    return;
                }
                return;
            case 12:
                sm0.e0((sm0) this.c, this.b, (String) this.d, (String) this.e, (TL_account.updatePasswordSettings) this.f);
                return;
            case 13:
                sm0.m0((sm0) this.c, (TLRPC.TL_error) this.d, this.b, (TLObject) this.e, (String) this.f);
                return;
            case 14:
                tc1.Y((tc1) this.c, (TLObject) this.d, this.b, (String) this.e, (TL_account.passwordInputSettings) this.f);
                return;
            case 15:
                vh.e1 e1Var = (vh.e1) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                boolean z23 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str7 = (String) this.f;
                vh.g1 g1Var = e1Var.s;
                ArrayList arrayList9 = g1Var.n;
                if (e1Var.r) {
                    if (!(tLObject5 instanceof TLRPC.messages_BotResults)) {
                        vh.u1 u1Var = g1Var.r;
                        int i24 = vh.u1.y1;
                        e1Var.d = ConnectionsManager.getInstance(u1Var.a).sendRequest(tL_messages_getInlineBotResults, new wd(e1Var, str7, z23, 7));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    e1Var.h = messages_botresults.next_offset;
                    if (z23) {
                        arrayList9.clear();
                    }
                    arrayList9.size();
                    arrayList9.addAll(messages_botresults.results);
                    e1Var.f();
                    g1Var.d.c(false);
                    e1Var.r = false;
                    return;
                }
                return;
            default:
                o8 o8Var = (o8) this.c;
                Bitmap bitmap4 = (Bitmap) this.d;
                boolean z24 = this.b;
                File file4 = (File) this.e;
                n5 n5Var = (n5) this.f;
                try {
                    bitmap4.compress(Bitmap.CompressFormat.JPEG, z24 ? 95 : 99, new FileOutputStream(file4));
                } catch (Exception e12) {
                    f8.g(e12, true);
                }
                org.telegram.messenger.i0.g3(new l5(o8Var, n5Var, file4, 18));
                return;
        }
    }

    public /* synthetic */ n0(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z10;
        this.f = obj4;
    }

    public /* synthetic */ n0(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = z10;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n0(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ n0(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = 3;
        this.c = payments_giveawayinfo;
        this.b = z10;
        this.d = str;
        this.e = tL_messageMediaGiveaway;
        this.f = k2Var;
    }
}
