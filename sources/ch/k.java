package ch;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemClock;
import di.f6;
import di.h1;
import di.h4;
import hi.k5;
import hi.q3;
import hi.u9;
import hi.v6;
import hi.z2;
import ki.k2;
import ki.q2;
import ki.s2;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ml;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        l6 K0;
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
                gc gcVar = gc.w;
                if (gcVar != null) {
                    gcVar.c(0L, false);
                    break;
                }
                break;
            case 4:
                gi.m mVar = (gi.m) obj;
                fq0 fq0Var = mVar.a0;
                if (z10) {
                    new gi.p(fq0Var.a, gd.N0(2131746497, null), new ai.h0(fq0Var, 20)).show();
                    break;
                } else {
                    fq0Var.b(mVar.a.E);
                    break;
                }
            case 5:
                z2 z2Var = (z2) obj;
                if (z10) {
                    z2Var.getClass();
                    break;
                } else {
                    z2Var.J.setVisibility(8);
                    break;
                }
            case 6:
                ((q3) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 7:
                k5 k5Var = (k5) obj;
                if (z10) {
                    k5Var.getClass();
                    break;
                } else {
                    k5Var.H0.setVisibility(8);
                    break;
                }
            case 8:
                v6 v6Var = (v6) obj;
                if (z10) {
                    v6Var.getClass();
                    break;
                } else {
                    v6Var.setVisibility(8);
                    break;
                }
            case 9:
                u9 u9Var = (u9) obj;
                if (z10) {
                    u9Var.getClass();
                    break;
                } else {
                    u9Var.k2.k1.setVisibility(8);
                    break;
                }
            case 10:
                s2 s2Var = (s2) obj;
                q2 q2Var = s2Var.F;
                k2 k2Var = s2Var.E;
                if (k2Var.getWebView() != null) {
                    k2Var.getWebView().animate().cancel();
                    k2Var.getWebView().animate().alpha(0.0f).start();
                }
                q2Var.setLoadProgress(0.0f);
                q2Var.setAlpha(1.0f);
                q2Var.setVisibility(0);
                k2Var.setBotUser(z10 ? null : mp.u1(s2Var.I).c2(Long.valueOf(s2Var.J)));
                if (!z10) {
                    k2Var.s(s2Var.I, s2Var.J);
                }
                ks.f(k2Var.N).d(new org.telegram.ui.web.q(k2Var, c10 == true ? 1 : 0));
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
                ax0 ax0Var = ((ml) obj).b.s1;
                if (ax0Var != null && z10) {
                    ax0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.x0.autotranslation = z10;
                rnVar.getMessagesController().X3(rnVar.x0, false);
                break;
            case 22:
                org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj;
                n0Var.M2 = null;
                n0Var.K2 = z10;
                if (z10) {
                    n0Var.L2 = SystemClock.uptimeMillis();
                }
                n0Var.C2.setLoading(z10);
                break;
            case 23:
                np npVar = (np) obj;
                lp lpVar = npVar.r1;
                if (lpVar != null && lpVar.d != null && !npVar.J) {
                    npVar.V0(z10, true);
                    if (npVar.G1 != null) {
                        npVar.J1 = true;
                        TLRPC.WallPaper wallPaper = npVar.Q0() ? null : npVar.s1.g;
                        s3 s3Var = npVar.G1.a;
                        if (s3Var.a) {
                            npVar.s1.r(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            npVar.s1.r(s3Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (K0 = np.K0(z10)) != null && K0 != m6.I) {
                        npVar.d2 = z10 != npVar.u1;
                        npVar.Y0(K0);
                    }
                    if (lpVar.d != null) {
                        for (int i10 = 0; i10 < lpVar.d.size(); i10++) {
                            ((org.telegram.ui.Components.mp) lpVar.d.get(i10)).c = z10 ? 1 : 0;
                        }
                        lpVar.f();
                        break;
                    }
                }
                break;
            case 24:
                ov ovVar = (ov) obj;
                if (!z10) {
                    ovVar.F.setVisibility(8);
                    break;
                }
                break;
            case 25:
                i00 i00Var = (i00) obj;
                i00Var.f1(i00Var.u2, z10);
                break;
            case 26:
                f30 f30Var = (f30) obj;
                if (z10) {
                    f30Var.getClass();
                    break;
                } else {
                    f30Var.r.setVisibility(8);
                    break;
                }
            case 27:
                c50 c50Var = ((u40) obj).I0;
                if (!c50Var.l0) {
                    try {
                        c50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(c50Var.h.getParentActivity());
                    c50Var.i0 = z10 ? c50Var.k0 : 0L;
                    c50Var.h0 = System.currentTimeMillis();
                    c50Var.j0 = true;
                    c50Var.w();
                    c50Var.invalidate();
                    ks.f(c50Var.e).k(ks.l2, Integer.valueOf(c50Var.V), Boolean.FALSE);
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
