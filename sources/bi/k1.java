package bi;

import android.content.Context;
import android.media.AudioManager;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.nl;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k1(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.k6 J0;
        int i7 = this.a;
        char c10 = 1;
        char c11 = 1;
        boolean z9 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                w1 w1Var = (w1) obj;
                if (z9) {
                    w1Var.getClass();
                    break;
                } else {
                    w1Var.i2.setVisibility(8);
                    break;
                }
            case 1:
                k7 k7Var = (k7) obj;
                k7Var.getClass();
                k7Var.p2(k7Var.b3, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, z9 ? 2131750424 : 2131750421, k7Var.y1())), true);
                break;
            case 2:
                k7 k7Var2 = ((f5) obj).V;
                TL_stars.SavedStarGift D1 = k7Var2.D1(z9);
                if (D1 != null) {
                    k7Var2.W2 = true;
                    k7Var2.i2(D1, k7Var2.y2);
                } else {
                    TL_stars.TL_starGiftUnique E1 = k7Var2.E1(z9);
                    if (E1 != null) {
                        k7Var2.W2 = true;
                        k7Var2.g2(E1.slug, E1, k7Var2.y2);
                    }
                }
                k7Var2.M2 = -1;
                org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
                if (ccVar != null) {
                    ccVar.c(0L, false);
                    break;
                }
                break;
            case 3:
                ch.k kVar = (ch.k) obj;
                if (z9) {
                    ((ch.o) kVar.x.c).w.setVisibility(4);
                    break;
                } else {
                    kVar.getClass();
                    break;
                }
            case 4:
                ei.n nVar = (ei.n) obj;
                tp0 tp0Var = nVar.W;
                if (z9) {
                    new ei.q(tp0Var.a, org.telegram.messenger.id.M0(2131746693, null), new ai.i(tp0Var, 15)).show();
                    break;
                } else {
                    tp0Var.b(nVar.a.E);
                    break;
                }
            case 5:
                fi.b3 b3Var = (fi.b3) obj;
                if (z9) {
                    b3Var.getClass();
                    break;
                } else {
                    b3Var.I.setVisibility(8);
                    break;
                }
            case 6:
                ((fi.s3) obj).b.setVisibility(z9 ? 0 : 8);
                break;
            case 7:
                fi.o5 o5Var = (fi.o5) obj;
                if (z9) {
                    o5Var.getClass();
                    break;
                } else {
                    o5Var.G0.setVisibility(8);
                    break;
                }
            case 8:
                fi.x6 x6Var = (fi.x6) obj;
                if (z9) {
                    x6Var.getClass();
                    break;
                } else {
                    x6Var.setVisibility(8);
                    break;
                }
            case 9:
                fi.x9 x9Var = (fi.x9) obj;
                if (z9) {
                    x9Var.getClass();
                    break;
                } else {
                    x9Var.j2.j1.setVisibility(8);
                    break;
                }
            case 10:
                hi.a3 a3Var = (hi.a3) obj;
                hi.y2 y2Var = a3Var.E;
                hi.s2 s2Var = a3Var.D;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().animate().cancel();
                    s2Var.getWebView().animate().alpha(0.0f).start();
                }
                y2Var.setLoadProgress(0.0f);
                y2Var.setAlpha(1.0f);
                y2Var.setVisibility(0);
                s2Var.setBotUser(z9 ? null : qp.s1(a3Var.H).a2(Long.valueOf(a3Var.I)));
                if (!z9) {
                    s2Var.s(a3Var.H, a3Var.I);
                }
                qs.f(s2Var.M).d(new org.telegram.ui.web.p(s2Var, c10 == true ? 1 : 0));
                break;
            case 11:
                ((ii.l0) obj).f(z9, false);
                break;
            case 12:
                n2.s sVar = (n2.s) ((j2.n) obj).c;
                String str = h2.m0.a;
                l2.i0 i0Var = ((l2.c0) sVar).a;
                if (i0Var.d0 != z9) {
                    i0Var.d0 = z9;
                    i0Var.m.e(23, new l2.w(c11 == true ? 1 : 0, z9));
                    break;
                }
                break;
            case 13:
                ((CameraController) obj).lambda$recordVideo$11(z9);
                break;
            case 14:
                ((VideoCapturerDevice) obj).lambda$new$0(z9);
                break;
            case 15:
                ((VoIPService) obj).lambda$startGroupCall$27(z9);
                break;
            case 16:
                ((AudioManager) obj).setSpeakerphoneOn(z9);
                break;
            case 17:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z9);
                break;
            case 18:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj;
                r0Var.L = null;
                if (r0Var.getParent() != null) {
                    r0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z9) {
                    r0Var.performHapticFeedback(0);
                }
                r0Var.U(null, null);
                r0Var.q0 = true;
                break;
            case 19:
                vf.c.t((Context) obj, org.telegram.messenger.id.M0(z9 ? 2131753038 : 2131748392, null));
                break;
            case 20:
                pw0 pw0Var = ((nl) obj).b.r1;
                if (pw0Var != null && z9) {
                    pw0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                rn rnVar = (rn) obj;
                rnVar.w0.autotranslation = z9;
                rnVar.getMessagesController().Q3(rnVar.w0, false);
                break;
            case 22:
                vo voVar = (vo) obj;
                to toVar = voVar.n1;
                if (toVar != null && toVar.d != null && !voVar.I) {
                    voVar.U0(z9, true);
                    if (voVar.C1 != null) {
                        voVar.F1 = true;
                        TLRPC.WallPaper wallPaper = voVar.P0() ? null : voVar.o1.g;
                        org.telegram.ui.ActionBar.r3 r3Var = voVar.C1.a;
                        if (r3Var.a) {
                            voVar.o1.r(null, wallPaper, false, Boolean.valueOf(z9), false);
                        } else {
                            voVar.o1.r(r3Var, wallPaper, false, Boolean.valueOf(z9), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = vo.J0(z9)) != null && J0 != org.telegram.ui.ActionBar.l6.I) {
                        voVar.Z1 = z9 != voVar.q1;
                        voVar.X0(J0);
                    }
                    if (toVar.d != null) {
                        for (int i10 = 0; i10 < toVar.d.size(); i10++) {
                            ((uo) toVar.d.get(i10)).c = z9 ? 1 : 0;
                        }
                        toVar.f();
                        break;
                    }
                }
                break;
            case 23:
                bv bvVar = (bv) obj;
                if (!z9) {
                    bvVar.E.setVisibility(8);
                    break;
                }
                break;
            case 24:
                wz wzVar = (wz) obj;
                wzVar.e1(wzVar.q2, z9);
                break;
            case 25:
                s20 s20Var = (s20) obj;
                if (z9) {
                    s20Var.getClass();
                    break;
                } else {
                    s20Var.r.setVisibility(8);
                    break;
                }
            case 26:
                p40 p40Var = ((h40) obj).H0;
                if (!p40Var.k0) {
                    try {
                        p40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(p40Var.h.getParentActivity());
                    p40Var.h0 = z9 ? p40Var.j0 : 0L;
                    p40Var.g0 = System.currentTimeMillis();
                    p40Var.i0 = true;
                    p40Var.w();
                    p40Var.invalidate();
                    qs.f(p40Var.e).k(qs.l2, Integer.valueOf(p40Var.U), Boolean.FALSE);
                    break;
                }
                break;
            case 27:
                dk0 dk0Var = (dk0) obj;
                dk0Var.getClass();
                dk0Var.q0(z9 ? "shown after a change away" : "shown, height differs", false);
                break;
            case 28:
                ((el0) obj).G.presentFragment(new PremiumPreviewFragment(0, z9 ? "upload_speed" : "download_speed"));
                break;
            default:
                zs0 zs0Var = (zs0) obj;
                if (z9) {
                    zs0Var.getClass();
                    break;
                } else {
                    zs0Var.o0.setVisibility(8);
                    break;
                }
        }
    }
}
