package ch;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import di.f6;
import di.h1;
import di.h4;
import hi.a3;
import hi.l5;
import hi.r3;
import hi.v9;
import hi.w6;
import ki.l2;
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
import org.telegram.ui.ActionBar.t3;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.Components.z40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ml;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                f6Var.C2(f6Var.i3, org.telegram.messenger.g0.W2(gd.a0(null, null, z10 ? 2131750408 : 2131750405, f6Var.E1())), true);
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
                gc gcVar = gc.w;
                if (gcVar != null) {
                    gcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                gi.m mVar = (gi.m) obj;
                dq0 dq0Var = mVar.a0;
                if (z10) {
                    new gi.p(dq0Var.a, gd.M0(2131746498, null), new ai.g0(dq0Var, 20)).show();
                    break;
                } else {
                    dq0Var.b(mVar.a.E);
                    break;
                }
            case 5:
                a3 a3Var = (a3) obj;
                if (z10) {
                    a3Var.getClass();
                    break;
                } else {
                    a3Var.J.setVisibility(8);
                    break;
                }
            case 6:
                ((r3) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 7:
                l5 l5Var = (l5) obj;
                if (z10) {
                    l5Var.getClass();
                    break;
                } else {
                    l5Var.H0.setVisibility(8);
                    break;
                }
            case 8:
                w6 w6Var = (w6) obj;
                if (z10) {
                    w6Var.getClass();
                    break;
                } else {
                    w6Var.setVisibility(8);
                    break;
                }
            case 9:
                v9 v9Var = (v9) obj;
                if (z10) {
                    v9Var.getClass();
                    break;
                } else {
                    v9Var.k2.k1.setVisibility(8);
                    break;
                }
            case 10:
                t2 t2Var = (t2) obj;
                r2 r2Var = t2Var.F;
                l2 l2Var = t2Var.E;
                if (l2Var.getWebView() != null) {
                    l2Var.getWebView().animate().cancel();
                    l2Var.getWebView().animate().alpha(0.0f).start();
                }
                r2Var.setLoadProgress(0.0f);
                r2Var.setAlpha(1.0f);
                r2Var.setVisibility(0);
                l2Var.setBotUser(z10 ? null : mp.u1(t2Var.I).c2(Long.valueOf(t2Var.J)));
                if (!z10) {
                    l2Var.s(t2Var.I, t2Var.J);
                }
                ks.f(l2Var.N).d(new org.telegram.ui.web.q(l2Var, c10 == true ? 1 : 0));
                break;
            case 11:
                ((li.k0) obj).f(z10, false);
                break;
            case 12:
                n2.s sVar = (n2.s) ((k8.a) obj).c;
                String str = h2.l0.a;
                l2.f0 f0Var = ((l2.z) sVar).a;
                if (f0Var.d0 != z10) {
                    f0Var.d0 = z10;
                    f0Var.m.e(23, new l2.v(c11 == true ? 1 : 0, z10));
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
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                r0Var.M = null;
                if (r0Var.getParent() != null) {
                    r0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z10) {
                    r0Var.performHapticFeedback(0);
                }
                r0Var.V(null, null);
                r0Var.r0 = true;
                break;
            case 19:
                vf.c.t((Context) obj, gd.M0(z10 ? 2131753027 : 2131748200, null));
                break;
            case 20:
                yw0 yw0Var = ((ml) obj).b.s1;
                if (yw0Var != null && z10) {
                    yw0Var.setVisibility(8);
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
                lp lpVar = (lp) obj;
                jp jpVar = lpVar.r1;
                if (jpVar != null && jpVar.d != null && !lpVar.J) {
                    lpVar.V0(z10, true);
                    if (lpVar.G1 != null) {
                        lpVar.J1 = true;
                        TLRPC.WallPaper wallPaper = lpVar.Q0() ? null : lpVar.s1.g;
                        t3 t3Var = lpVar.G1.a;
                        if (t3Var.a) {
                            lpVar.s1.r(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            lpVar.s1.r(t3Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (K0 = lp.K0(z10)) != null && K0 != n6.I) {
                        lpVar.d2 = z10 != lpVar.u1;
                        lpVar.Y0(K0);
                    }
                    if (jpVar.d != null) {
                        for (int i10 = 0; i10 < jpVar.d.size(); i10++) {
                            ((kp) jpVar.d.get(i10)).c = z10 ? 1 : 0;
                        }
                        jpVar.f();
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
                pk0 pk0Var = (pk0) obj;
                pk0Var.getClass();
                pk0Var.q0(z10 ? "shown after a change away" : "shown, height differs", false);
                break;
            default:
                ((ql0) obj).H.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
        }
    }
}
