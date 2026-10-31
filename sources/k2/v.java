package k2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ay;
import org.telegram.ui.hf0;
import org.telegram.ui.hm;
import org.telegram.ui.iw;
import org.telegram.ui.iz;
import org.telegram.ui.oo;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s6 J0;
        int i10 = this.a;
        oh.f fVar = null;
        fVar = null;
        fVar = null;
        char c10 = 1;
        int i11 = 0;
        boolean z10 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                w wVar = (w) ((hf.b) obj).c;
                String str = e2.l0.a;
                i2.i0 i0Var = ((i2.c0) wVar).a;
                if (i0Var.d0 != z10) {
                    i0Var.d0 = z10;
                    i0Var.m.e(23, new i2.y(c10 == true ? 1 : 0, z10));
                    break;
                }
                break;
            case 1:
                li.l lVar = (li.l) obj;
                lVar.P = z10;
                lVar.Q = lVar.F();
                lVar.R = 0;
                lVar.S = 0;
                lVar.j.b("torch requested: enabled=" + z10 + ", available=" + lVar.F() + ", cameraId=" + lVar.o + ", facing=" + lVar.G);
                lVar.g();
                break;
            case 2:
                oh.q qVar = (oh.q) obj;
                ArrayList arrayList = qVar.c;
                boolean isEmpty = TextUtils.isEmpty(qVar.t);
                String str2 = qVar.t;
                qVar.w = true;
                qVar.A = false;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (!isEmpty || arrayList.isEmpty()) ? null : (TLRPC.TL_chatInviteImporter) i0.a.g(1, arrayList);
                boolean z11 = tL_chatInviteImporter == null;
                if (isEmpty && z11 && z10) {
                    fVar = new oh.f(qVar, 1);
                }
                oh.f fVar2 = fVar;
                if (isEmpty) {
                    org.telegram.messenger.i0.h3(fVar2, 300L);
                }
                qVar.v = qVar.i.a(qVar.j, str2, tL_chatInviteImporter, qVar.d, new oh.g(qVar, isEmpty, fVar2, str2, z11));
                break;
            case 3:
                ((CameraController) obj).lambda$recordVideo$11(z10);
                break;
            case 4:
                ((VideoCapturerDevice) obj).lambda$new$0(z10);
                break;
            case 5:
                ((VoIPService) obj).lambda$startGroupCall$27(z10);
                break;
            case 6:
                ((AudioManager) obj).setSpeakerphoneOn(z10);
                break;
            case 7:
                ((ConnectionsManager) obj).lambda$setIsUpdating$22(z10);
                break;
            case 8:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                t0Var.L = null;
                if (t0Var.getParent() != null) {
                    t0Var.getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (z10) {
                    t0Var.performHapticFeedback(0);
                }
                t0Var.U(null, null);
                t0Var.q0 = true;
                break;
            case 9:
                gf.f.r((Context) obj, cd.L0(z10 ? 2131753038 : 2131748407, null));
                break;
            case 10:
                sx0 sx0Var = ((hm) obj).b.r1;
                if (sx0Var != null && z10) {
                    sx0Var.setVisibility(8);
                    break;
                }
                break;
            case 11:
                oo ooVar = (oo) obj;
                ooVar.w0.autotranslation = z10;
                ooVar.getMessagesController().N3(ooVar.w0, false);
                break;
            case 12:
                dp dpVar = (dp) obj;
                bp bpVar = dpVar.n1;
                if (bpVar != null && bpVar.d != null && !dpVar.I) {
                    dpVar.U0(z10, true);
                    if (dpVar.C1 != null) {
                        dpVar.F1 = true;
                        TLRPC.WallPaper wallPaper = dpVar.P0() ? null : dpVar.o1.g;
                        y3 y3Var = dpVar.C1.a;
                        if (y3Var.a) {
                            dpVar.o1.r(null, wallPaper, false, Boolean.valueOf(z10), false);
                        } else {
                            dpVar.o1.r(y3Var, wallPaper, false, Boolean.valueOf(z10), false);
                        }
                    }
                    if (org.telegram.messenger.i0.Q1() && (J0 = dp.J0(z10)) != null && J0 != t6.I) {
                        dpVar.Z1 = z10 != dpVar.q1;
                        dpVar.X0(J0);
                    }
                    if (bpVar.d != null) {
                        while (i11 < bpVar.d.size()) {
                            ((cp) bpVar.d.get(i11)).c = z10 ? 1 : 0;
                            i11++;
                        }
                        bpVar.f();
                        break;
                    }
                }
                break;
            case 13:
                mv mvVar = (mv) obj;
                if (!z10) {
                    mvVar.E.setVisibility(8);
                    break;
                }
                break;
            case 14:
                j00 j00Var = (j00) obj;
                j00Var.e1(j00Var.q2, z10);
                break;
            case 15:
                j30 j30Var = (j30) obj;
                if (!z10) {
                    j30Var.r.setVisibility(8);
                    break;
                } else {
                    j30Var.getClass();
                    break;
                }
            case 16:
                e50 e50Var = ((x40) obj).H0;
                if (!e50Var.k0) {
                    try {
                        e50Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    org.telegram.messenger.i0.f2(e50Var.h.getParentActivity());
                    e50Var.h0 = z10 ? e50Var.j0 : 0L;
                    e50Var.g0 = System.currentTimeMillis();
                    e50Var.i0 = true;
                    e50Var.v();
                    e50Var.invalidate();
                    zs.f(e50Var.e).k(zs.l2, Integer.valueOf(e50Var.U), Boolean.FALSE);
                    break;
                }
                break;
            case 17:
                gl0 gl0Var = (gl0) obj;
                gl0Var.getClass();
                gl0Var.q0(z10 ? "shown after a change away" : "shown, height differs", false);
                break;
            case 18:
                ((gm0) obj).G.presentFragment(new PremiumPreviewFragment(0, z10 ? "upload_speed" : "download_speed"));
                break;
            case 19:
                zt0 zt0Var = (zt0) obj;
                if (!z10) {
                    zt0Var.o0.setVisibility(8);
                    break;
                } else {
                    zt0Var.getClass();
                    break;
                }
            case 20:
                vq0 vq0Var = (vq0) obj;
                if (!z10) {
                    vq0Var.V.s0.setVisibility(0);
                    break;
                } else {
                    vq0Var.getClass();
                    break;
                }
            case 21:
                zq0 zq0Var = (zq0) obj;
                if (!z10) {
                    zq0Var.x.s0.setVisibility(0);
                    break;
                } else {
                    zq0Var.getClass();
                    break;
                }
            case 22:
                uu0 uu0Var = (uu0) obj;
                ArrayList arrayList2 = uu0Var.r;
                tu0 tu0Var = uu0Var.n;
                if (tu0Var != null) {
                    tu0Var.K(uu0Var.f, z10);
                }
                while (i11 < arrayList2.size()) {
                    ((tu0) arrayList2.get(i11)).K(uu0Var.f, z10);
                    i11++;
                }
                break;
            case 23:
                vu0 vu0Var = (vu0) obj;
                ArrayList arrayList3 = vu0Var.r;
                tu0 tu0Var2 = vu0Var.n;
                if (tu0Var2 != null) {
                    tu0Var2.K(vu0Var.h0, z10);
                }
                while (i11 < arrayList3.size()) {
                    ((tu0) arrayList3.get(i11)).K(vu0Var.h0, z10);
                    i11++;
                }
                break;
            case 24:
                ((j20) obj).a(null, Boolean.valueOf(z10));
                break;
            case 25:
                ((p51) obj).Q(z10);
                break;
            case 26:
                ay ayVar = (ay) obj;
                s4.L(ayVar.getParentActivity(), z10 ? ayVar.getUserConfig().e() : -1L, new iw(ayVar), ayVar.getResourceProvider());
                break;
            case 27:
                iz izVar = (iz) obj;
                izVar.d0(izVar.O, z10);
                break;
            case 28:
                hf0 hf0Var = (hf0) obj;
                if (!z10) {
                    hf0Var.W.setVisibility(8);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (!z10) {
                    photoViewer.V0.setVisibility(8);
                    break;
                } else {
                    Drawable[] drawableArr = PhotoViewer.U8;
                    photoViewer.getClass();
                    break;
                }
        }
    }
}
