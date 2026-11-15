package ai;

import android.content.Context;
import android.media.AudioManager;
import di.c6;
import di.e4;
import hi.m5;
import hi.r3;
import hi.u9;
import hi.w6;
import hi.z2;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.zz;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ll;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i6 J0;
        int i7 = 0;
        switch (this.a) {
            case 0:
                boolean z10 = this.b;
                t tVar = (t) this.c;
                t[] tVarArr = DictationAsr.a;
                if (z10 == (tVar.d == 0 ? 0 : 1)) {
                    ArrayList arrayList = new ArrayList(tVar.j);
                    tVar.j.clear();
                    int size = arrayList.size();
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((u) obj).a(z10);
                    }
                    break;
                }
                break;
            case 1:
                ch.k kVar = (ch.k) this.c;
                if (!this.b) {
                    kVar.getClass();
                    break;
                } else {
                    ((ch.o) kVar.x.c).w.setVisibility(4);
                    break;
                }
            case 2:
                di.i1 i1Var = (di.i1) this.c;
                if (!this.b) {
                    i1Var.m2.setVisibility(8);
                    break;
                } else {
                    i1Var.getClass();
                    break;
                }
            case 3:
                c6 c6Var = (c6) this.c;
                boolean z11 = this.b;
                c6Var.getClass();
                c6Var.q2(c6Var.f3, org.telegram.messenger.g0.X2(hd.a0(null, null, z11 ? 2131750424 : 2131750421, c6Var.z1())), true);
                break;
            case 4:
                e4 e4Var = (e4) this.c;
                boolean z12 = this.b;
                c6 c6Var2 = e4Var.W;
                TL_stars.SavedStarGift E1 = c6Var2.E1(z12);
                if (E1 != null) {
                    c6Var2.a3 = true;
                    c6Var2.k2(E1, c6Var2.C2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = c6Var2.F1(z12);
                    if (F1 != null) {
                        c6Var2.a3 = true;
                        c6Var2.i2(F1.slug, F1, c6Var2.C2);
                    }
                }
                c6Var2.Q2 = -1;
                xb xbVar = xb.w;
                if (xbVar != null) {
                    xbVar.c(0L, false);
                    break;
                }
                break;
            case 5:
                gi.m mVar = (gi.m) this.c;
                boolean z13 = this.b;
                vp0 vp0Var = mVar.a0;
                if (!z13) {
                    vp0Var.b(mVar.a.E);
                    break;
                } else {
                    new gi.p(vp0Var.a, hd.M0(2131746693, null), new g0(vp0Var, 19)).show();
                    break;
                }
            case 6:
                z2 z2Var = (z2) this.c;
                if (!this.b) {
                    z2Var.J.setVisibility(8);
                    break;
                } else {
                    z2Var.getClass();
                    break;
                }
            case 7:
                ((r3) this.c).b.setVisibility(this.b ? 0 : 8);
                break;
            case 8:
                m5 m5Var = (m5) this.c;
                if (!this.b) {
                    m5Var.H0.setVisibility(8);
                    break;
                } else {
                    m5Var.getClass();
                    break;
                }
            case 9:
                w6 w6Var = (w6) this.c;
                if (!this.b) {
                    w6Var.setVisibility(8);
                    break;
                } else {
                    w6Var.getClass();
                    break;
                }
            case 10:
                u9 u9Var = (u9) this.c;
                if (!this.b) {
                    u9Var.k2.k1.setVisibility(8);
                    break;
                } else {
                    u9Var.getClass();
                    break;
                }
            case 11:
                ki.x2 x2Var = (ki.x2) this.c;
                boolean z14 = this.b;
                ki.v2 v2Var = x2Var.F;
                ki.p2 p2Var = x2Var.E;
                if (p2Var.getWebView() != null) {
                    p2Var.getWebView().animate().cancel();
                    p2Var.getWebView().animate().alpha(0.0f).start();
                }
                v2Var.setLoadProgress(0.0f);
                v2Var.setAlpha(1.0f);
                v2Var.setVisibility(0);
                p2Var.setBotUser(z14 ? null : np.s1(x2Var.I).a2(Long.valueOf(x2Var.J)));
                if (!z14) {
                    p2Var.s(x2Var.I, x2Var.J);
                }
                ns.f(p2Var.N).d(new org.telegram.ui.web.q(p2Var, r5));
                break;
            case 12:
                ((li.k0) this.c).f(this.b, false);
                break;
            case 13:
                k8.a aVar = (k8.a) this.c;
                boolean z15 = this.b;
                n2.s sVar = (n2.s) aVar.c;
                String str = h2.l0.a;
                l2.f0 f0Var = ((l2.z) sVar).a;
                if (f0Var.d0 != z15) {
                    f0Var.d0 = z15;
                    f0Var.m.e(23, new l2.v(r5, z15));
                    break;
                }
                break;
            case 14:
                ((CameraController) this.c).lambda$recordVideo$11(this.b);
                break;
            case 15:
                ((VideoCapturerDevice) this.c).lambda$new$0(this.b);
                break;
            case 16:
                ((VoIPService) this.c).lambda$startGroupCall$27(this.b);
                break;
            case 17:
                ((AudioManager) this.c).setSpeakerphoneOn(this.b);
                break;
            case 18:
                ((ConnectionsManager) this.c).lambda$setIsUpdating$22(this.b);
                break;
            case 19:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                boolean z16 = this.b;
                q0Var.M = null;
                if (q0Var.getParent() != null) {
                    q0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z16) {
                    q0Var.performHapticFeedback(0);
                }
                q0Var.V(null, null);
                q0Var.r0 = true;
                break;
            case 20:
                vf.c.t((Context) this.c, hd.M0(this.b ? 2131753038 : 2131748392, null));
                break;
            case 21:
                ll llVar = (ll) this.c;
                boolean z17 = this.b;
                rw0 rw0Var = llVar.b.s1;
                if (rw0Var != null && z17) {
                    rw0Var.setVisibility(8);
                    break;
                }
                break;
            case 22:
                qn qnVar = (qn) this.c;
                qnVar.x0.autotranslation = this.b;
                qnVar.getMessagesController().Q3(qnVar.x0, false);
                break;
            case 23:
                ep epVar = (ep) this.c;
                boolean z18 = this.b;
                cp cpVar = epVar.r1;
                if (cpVar != null && cpVar.d != null && !epVar.J) {
                    epVar.U0(z18, true);
                    if (epVar.G1 != null) {
                        epVar.J1 = true;
                        TLRPC.WallPaper wallPaper = epVar.P0() ? null : epVar.s1.g;
                        p3 p3Var = epVar.G1.a;
                        if (p3Var.a) {
                            epVar.s1.r(null, wallPaper, false, Boolean.valueOf(z18), false);
                        } else {
                            epVar.s1.r(p3Var, wallPaper, false, Boolean.valueOf(z18), false);
                        }
                    }
                    if (org.telegram.messenger.g0.Q1() && (J0 = ep.J0(z18)) != null && J0 != j6.I) {
                        epVar.d2 = z18 != epVar.u1;
                        epVar.X0(J0);
                    }
                    if (cpVar.d != null) {
                        while (i7 < cpVar.d.size()) {
                            ((dp) cpVar.d.get(i7)).c = z18 ? 1 : 0;
                            i7++;
                        }
                        cpVar.f();
                        break;
                    }
                }
                break;
            case 24:
                gv gvVar = (gv) this.c;
                if (!this.b) {
                    gvVar.F.setVisibility(8);
                    break;
                }
                break;
            case 25:
                zz zzVar = (zz) this.c;
                zzVar.e1(zzVar.u2, this.b);
                break;
            case 26:
                u20 u20Var = (u20) this.c;
                if (!this.b) {
                    u20Var.r.setVisibility(8);
                    break;
                } else {
                    u20Var.getClass();
                    break;
                }
            case 27:
                j40 j40Var = (j40) this.c;
                boolean z19 = this.b;
                r40 r40Var = j40Var.I0;
                if (!r40Var.l0) {
                    try {
                        r40Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.g0.f2(r40Var.h.getParentActivity());
                    r40Var.i0 = z19 ? r40Var.k0 : 0L;
                    r40Var.h0 = System.currentTimeMillis();
                    r40Var.j0 = true;
                    r40Var.w();
                    r40Var.invalidate();
                    ns.f(r40Var.e).k(ns.l2, Integer.valueOf(r40Var.V), Boolean.FALSE);
                    break;
                }
                break;
            case 28:
                hk0 hk0Var = (hk0) this.c;
                boolean z20 = this.b;
                hk0Var.getClass();
                hk0Var.q0(z20 ? "shown after a change away" : "shown, height differs", false);
                break;
            default:
                ((il0) this.c).H.presentFragment(new PremiumPreviewFragment(0, this.b ? "upload_speed" : "download_speed"));
                break;
        }
    }

    public /* synthetic */ q(boolean z10, t tVar) {
        this.a = 0;
        this.b = z10;
        this.c = tVar;
    }
}
