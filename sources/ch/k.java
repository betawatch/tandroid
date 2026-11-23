package ch;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import di.f6;
import di.h1;
import di.h4;
import hi.f7;
import hi.i3;
import hi.pa;
import hi.v5;
import hi.z3;
import ki.k2;
import ki.r2;
import ki.t2;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z40;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ml;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m6 K0;
        int i7 = this.a;
        char c10 = 1;
        char c11 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                l lVar = (l) obj;
                if (z10) {
                    ((p) lVar.x.c).w.setVisibility(4);
                    break;
                } else {
                    lVar.getClass();
                    break;
                }
            case 1:
                h1 h1Var = (h1) obj;
                if (z10) {
                    h1Var.getClass();
                    break;
                } else {
                    h1Var.m2.setVisibility(8);
                    break;
                }
            case 2:
                f6 f6Var = (f6) obj;
                f6Var.getClass();
                f6Var.C2(f6Var.i3, org.telegram.messenger.g0.W2(gd.a0(null, null, z10 ? 2131750407 : 2131750404, f6Var.E1())), true);
                break;
            case 3:
                f6 f6Var2 = ((h4) obj).W;
                TL_stars.SavedStarGift J1 = f6Var2.J1(z10);
                if (J1 != null) {
                    f6Var2.a3 = true;
                    f6Var2.w2(J1, f6Var2.C2);
                } else {
                    TL_stars.TL_starGiftUnique K1 = f6Var2.K1(z10);
                    if (K1 != null) {
                        f6Var2.a3 = true;
                        f6Var2.u2(K1.slug, K1, f6Var2.C2);
                    }
                }
                f6Var2.Q2 = -1;
                fc fcVar = fc.w;
                if (fcVar != null) {
                    fcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                gi.m mVar = (gi.m) obj;
                eq0 eq0Var = mVar.a0;
                if (z10) {
                    new gi.p(eq0Var.a, gd.N0(2131746497, null), new ai.d0(eq0Var, 20)).show();
                    break;
                } else {
                    eq0Var.b(mVar.a.E);
                    break;
                }
            case 5:
                i3 i3Var = (i3) obj;
                if (z10) {
                    i3Var.getClass();
                    break;
                } else {
                    i3Var.J.setVisibility(8);
                    break;
                }
            case 6:
                ((z3) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 7:
                v5 v5Var = (v5) obj;
                if (z10) {
                    v5Var.getClass();
                    break;
                } else {
                    v5Var.H0.setVisibility(8);
                    break;
                }
            case 8:
                f7 f7Var = (f7) obj;
                if (z10) {
                    f7Var.getClass();
                    break;
                } else {
                    f7Var.setVisibility(8);
                    break;
                }
            case 9:
                pa paVar = (pa) obj;
                if (z10) {
                    paVar.getClass();
                    break;
                } else {
                    paVar.o2.k1.setVisibility(8);
                    break;
                }
            case 10:
                t2 t2Var = (t2) obj;
                r2 r2Var = t2Var.F;
                k2 k2Var = t2Var.E;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().animate().cancel();
                    k2Var.getWebView().animate().alpha(0.0f).start();
                }
                r2Var.setLoadProgress(0.0f);
                r2Var.setAlpha(1.0f);
                r2Var.setVisibility(0);
                k2Var.setBotUser(z10 ? null : mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J)));
                if (!z10) {
                    k2Var.s(t2Var.I, t2Var.J);
                }
                ks.f(k2Var.N).d(new org.telegram.ui.web.q(k2Var, c10 == true ? 1 : 0));
                break;
            case 11:
                ((li.j0) obj).f(z10, false);
                break;
            case 12:
                n2.s sVar = (n2.s) ((jb.m) obj).c;
                String str = h2.l0.a;
                l2.g0 g0Var = ((l2.a0) sVar).a;
                if (g0Var.d0 != z10) {
                    g0Var.d0 = z10;
                    g0Var.m.e(23, new l2.w(c11 == true ? 1 : 0, z10));
                    break;
                }
                break;
            case 13:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 14:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 15:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 16:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 17:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 18:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                q0Var.M = null;
                if (q0Var.getParent() != null) {
                    q0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z10) {
                    q0Var.performHapticFeedback(0);
                }
                q0Var.V(null, null);
                q0Var.r0 = true;
                break;
            case 19:
                vf.c.t((Context) obj, gd.N0(z10 ? 2131753026 : 2131748199, null));
                break;
            case 20:
                zw0 zw0Var = ((ml) obj).b.s1;
                if (zw0Var != null && z10) {
                    zw0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.x0.autotranslation = z10;
                rnVar.getMessagesController().X3(rnVar.x0, false);
                break;
            case 22:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) obj;
                m0Var.M2 = null;
                m0Var.K2 = z10;
                if (z10) {
                    m0Var.L2 = SystemClock.uptimeMillis();
                }
                m0Var.C2.setLoading(z10);
                break;
            case 23:
                kp kpVar = (kp) obj;
                ip ipVar = kpVar.r1;
                if (ipVar != null && ipVar.d != null && !kpVar.J) {
                    kpVar.V0(z10, true);
                    if (kpVar.G1 != null) {
                        kpVar.J1 = true;
                        TLRPC.WallPaper wallPaper = kpVar.Q0() ? null : kpVar.s1.g;
                        s3 s3Var = kpVar.G1.a;
                        if (s3Var.a) {
                            kpVar.s1.r(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            kpVar.s1.r(s3Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (K0 = kp.K0(z10)) != null && K0 != n6.I) {
                        kpVar.d2 = z10 != kpVar.u1;
                        kpVar.Y0(K0);
                    }
                    if (ipVar.d != null) {
                        for (int i10 = 0; i10 < ipVar.d.size(); i10++) {
                            ((jp) ipVar.d.get(i10)).c = z10 ? 1 : 0;
                        }
                        ipVar.f();
                        break;
                    }
                }
                break;
            case 24:
                lv lvVar = (lv) obj;
                if (!z10) {
                    lvVar.F.setVisibility(8);
                    break;
                }
                break;
            case 25:
                g00 g00Var = (g00) obj;
                g00Var.f1(g00Var.u2, z10);
                break;
            case 26:
                c30 c30Var = (c30) obj;
                if (z10) {
                    c30Var.getClass();
                    break;
                } else {
                    c30Var.r.setVisibility(8);
                    break;
                }
            case 27:
                z40 z40Var = ((r40) obj).I0;
                if (!z40Var.l0) {
                    try {
                        z40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(z40Var.h.getParentActivity());
                    z40Var.i0 = z10 ? z40Var.k0 : 0L;
                    z40Var.h0 = System.currentTimeMillis();
                    z40Var.j0 = true;
                    z40Var.w();
                    z40Var.invalidate();
                    ks.f(z40Var.e).k(ks.l2, Integer.valueOf(z40Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 28:
                rk0 rk0Var = (rk0) obj;
                rk0Var.getClass();
                rk0Var.q0(z10 ? "shown after a change away" : "shown, height differs", false);
                break;
            default:
                ((sl0) obj).H.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
        }
    }
}
