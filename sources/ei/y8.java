package ei;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ci.tb;
import ci.vb;
import com.google.android.gms.tasks.OnSuccessListener;
import gi.ja;
import gi.la;
import gi.va;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.o10;
import org.telegram.messenger.s10;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.ui0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y8 implements r0.m, OnSuccessListener, o10, hj0, g9.g1, org.telegram.ui.ActionBar.p1, ui0, s10, tg.j1, CameraController.VideoTakeCallback, et0, e3.g, g2.p, h2.u {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        r9 r9Var = (r9) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r9Var.w.getLayoutParams();
        marginLayoutParams.topMargin = r9Var.c ? 0 : k1Var.d();
        marginLayoutParams.bottomMargin = r9Var.c ? k1Var.a.f(2).d : k1Var.a();
        marginLayoutParams.leftMargin = I0.a;
        marginLayoutParams.rightMargin = I0.c;
        e9 e9Var = r9Var.s;
        if (e9Var != null) {
            e9Var.requestLayout();
        }
        f9 f9Var = r9Var.w;
        if (f9Var != null) {
            f9Var.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // h2.u
    public void a(long j10, g2.y yVar) {
        switch (this.a) {
            case 28:
                e3.b.c(j10, yVar, ((l4.c0) this.b).c);
                break;
            default:
                e3.b.d(j10, yVar, ((l4.c0) this.b).c);
                break;
        }
    }

    @Override // org.telegram.messenger.o10
    public Object d(Number number, Object obj) {
        tp0 tp0Var = (tp0) this.b;
        if (((Integer) number).intValue() != -1) {
            return Boolean.FALSE;
        }
        new fi.p(tp0Var.a, bd.M0(2131746701, null), new ai.v2(tp0Var, 18)).show();
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i3, View view) {
        ye yeVar;
        switch (this.a) {
            case 3:
                tp0 tp0Var = ((fi.m) this.b).a0;
                if (!tp0Var.H.F1 && (view instanceof org.telegram.ui.Cells.n7)) {
                    zi messageObject = ((org.telegram.ui.Cells.n7) view).getMessageObject();
                    if (!tp0Var.c(messageObject)) {
                        tp0Var.e(messageObject);
                        break;
                    } else {
                        tp0Var.g(messageObject);
                        break;
                    }
                }
                break;
            default:
                gi.d3 d3Var = (gi.d3) this.b;
                ArrayList arrayList = d3Var.c0;
                ArrayList arrayList2 = d3Var.i0;
                if (i3 >= 2 && d3Var.a0 != null && (view instanceof gi.z2)) {
                    int i10 = i3 - 2;
                    if (!d3Var.d0) {
                        if (d3Var.e0) {
                            if (i10 < 0 || i10 >= arrayList.size()) {
                                i10 -= arrayList.size();
                            }
                        }
                        if (i10 >= 0) {
                            yeVar = (ye) d3Var.g0.get(i10);
                            if (arrayList2.isEmpty()) {
                                if (!arrayList2.contains(yeVar)) {
                                }
                                org.telegram.messenger.g0.b4(d3Var.d);
                                d3Var.j();
                            }
                        }
                    } else if (i10 != 0) {
                        i10 = i3 - 3;
                        if (i10 >= 0 && i10 < d3Var.g0.size()) {
                            yeVar = (ye) d3Var.g0.get(i10);
                            if (arrayList2.isEmpty() && !d3Var.R) {
                                if (!arrayList2.contains(yeVar)) {
                                    arrayList2.remove(yeVar);
                                } else if (arrayList2.size() + 1 > d3Var.S) {
                                    int i11 = -d3Var.O;
                                    d3Var.O = i11;
                                    org.telegram.messenger.g0.G3(i11, view, null);
                                    org.telegram.messenger.p2.E.a();
                                    break;
                                } else {
                                    arrayList2.add(yeVar);
                                }
                                org.telegram.messenger.g0.b4(d3Var.d);
                                d3Var.j();
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 5:
                va vaVar = ((la) ((gi.r) this.b)).S1;
                ja jaVar = vaVar.Y0;
                if (jaVar != null) {
                    jaVar.s(null, null, true);
                }
                gi.x9 x9Var = vaVar.w1;
                if (x9Var != null) {
                    x9Var.n0();
                }
                la laVar = vaVar.d1;
                if (laVar != null) {
                    laVar.setHasRoundVideo(false);
                }
                gi.f7 f7Var = vaVar.L1;
                if (f7Var != null) {
                    File file = f7Var.o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        vaVar.L1.o0 = null;
                    }
                    if (vaVar.L1.p0 != null) {
                        try {
                            new File(vaVar.L1.p0).delete();
                        } catch (Exception unused2) {
                        }
                        vaVar.L1.p0 = null;
                        break;
                    }
                }
                break;
            case 10:
                ((gi.f5) this.b).a.Z1.r();
                break;
            case 13:
                ((ii.d) this.b).run();
                break;
            default:
                ii.k kVar = (ii.k) this.b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().o1(kVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, kVar.getParentActivity(), null);
                s1Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ii.b(kVar, s1Var2, 0));
                break;
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public void h() {
        ((gi.m1) this.b).invalidate();
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // g2.p
    public void invoke(Object obj) {
        switch (this.a) {
            case 18:
                ((d2.c1) obj).u((d2.f) this.b);
                break;
            case 19:
                ((d2.c1) obj).B((d2.s1) this.b);
                break;
            case 20:
                ((d2.c1) obj).k((f2.c) this.b);
                break;
            case 21:
                ((d2.c1) obj).L(((k2.c0) this.b).a.Q);
                break;
            case 22:
                ((d2.c1) obj).m((d2.s0) this.b);
                break;
            case 23:
            default:
                ((l2.b) obj).d((w2.c0) this.b);
                break;
            case 24:
                ((l2.b) obj).j((d2.x0) this.b);
                break;
            case 25:
                ((l2.b) obj).onSeekStarted((l2.a) this.b);
                break;
            case 26:
                ((l2.b) obj).t((k2.d) this.b);
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.a) {
            case 8:
                gi.o9 o9Var = (gi.o9) this.b;
                r31 r31Var = (r31) obj;
                int i3 = r31Var.d;
                gi.f7 f7Var = (gi.f7) r31Var.G;
                o9Var.c(false, true);
                va vaVar = o9Var.P;
                if (f7Var != vaVar.L1 && !vaVar.Y1) {
                    vaVar.e1.setSelected(i3);
                    vaVar.Y1 = true;
                    cg.l0 l0Var = new cg.l0(vaVar, i3, 9);
                    gi.x9 x9Var = vaVar.w1;
                    gi.f7 f7Var2 = vaVar.L1;
                    if (x9Var != null && f7Var2 != null) {
                        if (!x9Var.r0()) {
                            l0Var.run();
                            break;
                        } else {
                            f7Var2.f();
                            boolean r02 = x9Var.r0();
                            boolean z10 = x9Var.y0.getPainting().E;
                            Utilities.g.c(new gi.y8(vaVar, x9Var, f7Var2.i0, f7Var2.j0, f7Var2, z10, r02, l0Var, 0));
                            break;
                        }
                    } else {
                        l0Var.run();
                        break;
                    }
                }
                break;
            case 15:
                ii.s.a0((ii.s) this.b, (r31) obj);
                break;
            default:
                ((ii.p4) this.b).a0((r31) obj);
                break;
        }
    }

    @Override // e3.g
    public long k(long j10) {
        return g2.n0.j((j10 * r0.e) / 1000000, 0L, ((e3.u) this.b).j - 1);
    }

    @Override // g9.g1
    public Object l(Object obj, Object obj2) {
        return g9.o.y((List) ((Collection) obj2), new tf.b(((g9.l1) this.b).f, obj));
    }

    @Override // org.telegram.ui.Components.et0
    public RecyclerView m(View view) {
        ((vb) this.b).getClass();
        return ((tb) view).a;
    }

    @Override // tg.j1
    public void o() {
        gi.x9 x9Var = (gi.x9) this.b;
        TextView textView = x9Var.Y0;
        boolean a10 = x9Var.n0.a();
        ImageView imageView = x9Var.X0;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // org.telegram.messenger.camera.CameraController.VideoTakeCallback
    public void onFinishVideoRecording(String str, long j10) {
        gi.s9 s9Var = (gi.s9) this.b;
        va vaVar = s9Var.a;
        gi.h6 h6Var = vaVar.P0;
        int i3 = vaVar.c;
        if (h6Var != null) {
            h6Var.g(true);
        }
        if (vaVar.p0()) {
            vaVar.s.d();
        }
        if (vaVar.H1 == null || vaVar.C0 == null) {
            return;
        }
        vaVar.R1 = false;
        vaVar.S1 = false;
        gi.c6 c6Var = vaVar.D0;
        if (c6Var != null) {
            c6Var.c(false);
        }
        if (j10 <= 800) {
            vaVar.g(false, true);
            vaVar.c0(false);
            vaVar.K0.b(false, true);
            gi.h6 h6Var2 = vaVar.P0;
            if (h6Var2 != null) {
                h6Var2.g(true);
            }
            try {
                vaVar.H1.delete();
                vaVar.H1 = null;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (str != null) {
                try {
                    new File(str).delete();
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            }
            return;
        }
        vaVar.h0(false, true);
        gi.f7 o10 = gi.f7.o(vaVar.H1, str, j10);
        o10.J0 = vaVar.w0;
        o10.K0 = vaVar.x0;
        o10.B();
        vaVar.g(false, true);
        vaVar.c0(false);
        vaVar.K0.b(false, true);
        gi.h6 h6Var3 = vaVar.P0;
        if (h6Var3 != null) {
            h6Var3.g(true);
        }
        if (!vaVar.B0.j()) {
            vaVar.L1 = o10;
            gi.u8.a(i3, o10);
            vaVar.M1 = false;
            int videoWidth = vaVar.C0.getVideoWidth();
            int videoHeight = vaVar.C0.getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                gi.f7 f7Var = vaVar.L1;
                f7Var.k0 = videoWidth;
                f7Var.l0 = videoHeight;
                f7Var.A();
            }
            vaVar.K(new gi.q9(s9Var, 3), 0L);
            return;
        }
        vaVar.H1 = null;
        o10.P = 1.0f;
        if (vaVar.B0.l(o10)) {
            gi.f7 a10 = gi.f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
            vaVar.L1 = a10;
            gi.u8.a(i3, a10);
            vaVar.M1 = false;
            int videoWidth2 = vaVar.C0.getVideoWidth();
            int videoHeight2 = vaVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                gi.f7 f7Var2 = vaVar.L1;
                f7Var2.k0 = videoWidth2;
                f7Var2.l0 = videoHeight2;
                f7Var2.A();
            }
        }
        vaVar.l0(true);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((e1.b) this.b).invoke(obj);
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public /* synthetic */ y8(l2.a aVar, Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    public /* synthetic */ y8(l2.a aVar, w2.u uVar, w2.c0 c0Var, IOException iOException, boolean z10) {
        this.a = 27;
        this.b = c0Var;
    }
}
