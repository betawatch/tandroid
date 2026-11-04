package ci;

import android.content.Context;
import android.media.AudioManager;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hl;
import org.telegram.ui.ln;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.ActionBar.j6 J0;
        int i3 = this.a;
        char c2 = 1;
        char c10 = 1;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                p1 p1Var = (p1) obj;
                if (z10) {
                    p1Var.getClass();
                    break;
                } else {
                    p1Var.j2.setVisibility(8);
                    break;
                }
            case 1:
                l6 l6Var = (l6) obj;
                l6Var.getClass();
                l6Var.p2(l6Var.c3, org.telegram.messenger.g0.X2(bd.a0(null, null, z10 ? 2131750432 : 2131750429, l6Var.z1())), true);
                break;
            case 2:
                l6 l6Var2 = ((n4) obj).W;
                TL_stars.SavedStarGift E1 = l6Var2.E1(z10);
                if (E1 != null) {
                    l6Var2.X2 = true;
                    l6Var2.j2(E1, l6Var2.z2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = l6Var2.F1(z10);
                    if (F1 != null) {
                        l6Var2.X2 = true;
                        l6Var2.h2(F1.slug, F1, l6Var2.z2);
                    }
                }
                l6Var2.N2 = -1;
                org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
                if (acVar != null) {
                    acVar.c(0L, false);
                    break;
                }
                break;
            case 3:
                dh.k kVar = (dh.k) obj;
                if (z10) {
                    ((dh.o) kVar.x.c).w.setVisibility(4);
                    break;
                } else {
                    kVar.getClass();
                    break;
                }
            case 4:
                fi.m mVar = (fi.m) obj;
                tp0 tp0Var = mVar.a0;
                if (z10) {
                    new fi.p(tp0Var.a, bd.M0(2131746701, null), new ai.v2(tp0Var, 18)).show();
                    break;
                } else {
                    tp0Var.b(mVar.a.E);
                    break;
                }
            case 5:
                gi.z2 z2Var = (gi.z2) obj;
                if (z10) {
                    z2Var.getClass();
                    break;
                } else {
                    z2Var.J.setVisibility(8);
                    break;
                }
            case 6:
                ((gi.r3) obj).b.setVisibility(z10 ? 0 : 8);
                break;
            case 7:
                gi.m5 m5Var = (gi.m5) obj;
                if (z10) {
                    m5Var.getClass();
                    break;
                } else {
                    m5Var.H0.setVisibility(8);
                    break;
                }
            case 8:
                gi.y6 y6Var = (gi.y6) obj;
                if (z10) {
                    y6Var.getClass();
                    break;
                } else {
                    y6Var.setVisibility(8);
                    break;
                }
            case 9:
                gi.x9 x9Var = (gi.x9) obj;
                if (z10) {
                    x9Var.getClass();
                    break;
                } else {
                    x9Var.k2.k1.setVisibility(8);
                    break;
                }
            case 10:
                ii.a3 a3Var = (ii.a3) obj;
                ii.y2 y2Var = a3Var.F;
                ii.s2 s2Var = a3Var.E;
                if (s2Var.getWebView() != null) {
                    s2Var.getWebView().animate().cancel();
                    s2Var.getWebView().animate().alpha(0.0f).start();
                }
                y2Var.setLoadProgress(0.0f);
                y2Var.setAlpha(1.0f);
                y2Var.setVisibility(0);
                s2Var.setBotUser(z10 ? null : hp.s1(a3Var.I).a2(Long.valueOf(a3Var.J)));
                if (!z10) {
                    s2Var.s(a3Var.I, a3Var.J);
                }
                hs.f(s2Var.N).d(new org.telegram.ui.web.r(s2Var, c2 == true ? 1 : 0));
                break;
            case 11:
                ((ji.i0) obj).f(z10, false);
                break;
            case 12:
                m2.u uVar = (m2.u) ((m2.t) obj).c;
                String str = g2.n0.a;
                k2.i0 i0Var = ((k2.c0) uVar).a;
                if (i0Var.d0 != z10) {
                    i0Var.d0 = z10;
                    i0Var.m.e(23, new k2.x(c10 == true ? 1 : 0, z10));
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
                q0Var.U(null, null);
                q0Var.r0 = true;
                break;
            case 19:
                sf.c.t((Context) obj, bd.M0(z10 ? 2131753038 : 2131748400, null));
                break;
            case 20:
                ow0 ow0Var = ((hl) obj).b.s1;
                if (ow0Var != null && z10) {
                    ow0Var.setVisibility(8);
                    break;
                }
                break;
            case 21:
                ln lnVar = (ln) obj;
                lnVar.x0.autotranslation = z10;
                lnVar.getMessagesController().Q3(lnVar.x0, false);
                break;
            case 22:
                vo voVar = (vo) obj;
                to toVar = voVar.o1;
                if (toVar != null && toVar.d != null && !voVar.J) {
                    voVar.U0(z10, true);
                    if (voVar.D1 != null) {
                        voVar.G1 = true;
                        TLRPC.WallPaper wallPaper = voVar.P0() ? null : voVar.p1.g;
                        org.telegram.ui.ActionBar.p3 p3Var = voVar.D1.a;
                        if (p3Var.a) {
                            voVar.p1.r(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            voVar.p1.r(p3Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = vo.J0(z10)) != null && J0 != org.telegram.ui.ActionBar.k6.I) {
                        voVar.a2 = z10 != voVar.r1;
                        voVar.X0(J0);
                    }
                    if (toVar.d != null) {
                        for (int i10 = 0; i10 < toVar.d.size(); i10++) {
                            ((uo) toVar.d.get(i10)).c = z10 ? 1 : 0;
                        }
                        toVar.f();
                        break;
                    }
                }
                break;
            case 23:
                zu zuVar = (zu) obj;
                if (!z10) {
                    zuVar.F.setVisibility(8);
                    break;
                }
                break;
            case 24:
                rz rzVar = (rz) obj;
                rzVar.e1(rzVar.r2, z10);
                break;
            case 25:
                n20 n20Var = (n20) obj;
                if (z10) {
                    n20Var.getClass();
                    break;
                } else {
                    n20Var.r.setVisibility(8);
                    break;
                }
            case 26:
                k40 k40Var = ((c40) obj).I0;
                if (!k40Var.l0) {
                    try {
                        k40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(k40Var.h.getParentActivity());
                    k40Var.i0 = z10 ? k40Var.k0 : 0L;
                    k40Var.h0 = System.currentTimeMillis();
                    k40Var.j0 = true;
                    k40Var.v();
                    k40Var.invalidate();
                    hs.f(k40Var.e).k(hs.l2, Integer.valueOf(k40Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 27:
                gk0 gk0Var = (gk0) obj;
                gk0Var.getClass();
                gk0Var.q0(z10 ? "shown after a change away" : "shown, height differs", false);
                break;
            case 28:
                ((hl0) obj).H.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            default:
                ws0 ws0Var = (ws0) obj;
                if (z10) {
                    ws0Var.getClass();
                    break;
                } else {
                    ws0Var.p0.setVisibility(8);
                    break;
                }
        }
    }
}
