package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.q1;
import fi.w3;
import li.r3;
import li.t3;
import org.telegram.messenger.oa;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.af0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.x80;
import org.telegram.ui.bu;
import org.telegram.ui.cn;
import org.telegram.ui.cn0;
import org.telegram.ui.cu;
import org.telegram.ui.ef0;
import org.telegram.ui.pr;
import org.telegram.ui.td;
import org.telegram.ui.yw;
import zh.z1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    ((t3) this.c).u3.V();
                    break;
                }
                break;
            case 6:
                cu cuVar = (cu) this.c;
                bu[] buVarArr = cuVar.f;
                ((v4.s0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar = ((f2) cuVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            buVarArr[0].d.w0(0, i11, null);
                            q1 q1Var = buVarArr[0].e;
                            if (q1Var != null) {
                                q1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            buVarArr[0].d.w0(0, i12, null);
                            q1 q1Var2 = buVarArr[0].e;
                            if (q1Var2 != null) {
                                q1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                cn0 cn0Var = (cn0) this.c;
                x4[] x4VarArr = cn0Var.n;
                ((v4.s0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar2 = ((f2) cn0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((qj0) x4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((qj0) x4VarArr[0].f).w0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ((v4.s0) this.b).a(recyclerView, i7);
                ((x80) this.c).D.getClass();
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                w wVar = (w) this.b;
                float translationY = wVar.getTranslationY();
                float f10 = ((s0) this.c).d0;
                if (translationY != f10) {
                    wVar.setTranslationY(f10);
                    wVar.invalidate();
                    break;
                }
                break;
            case 1:
                t3 t3Var = (t3) this.c;
                ((r3) this.b).y(i10);
                t3Var.u3.G();
                li.g1 g1Var = t3Var.S3;
                if (g1Var != null && (F = t3Var.F(g1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.S3 = null;
                        g1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        break;
                    }
                }
                break;
            case 2:
                r41 r41Var = ((td) this.c).a;
                if (r41Var.canScrollVertically(1)) {
                    for (int i13 = 0; i13 < r41Var.getChildCount(); i13++) {
                        if (!(r41Var.getChildAt(i13) instanceof mz)) {
                        }
                    }
                    break;
                }
                ((bg.m0) this.b).run();
                break;
            case 3:
                cn cnVar = (cn) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(cnVar.l1);
                }
                int N0 = ((v4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > cnVar.a4.h - 5) {
                    if (cnVar.f4 != 7) {
                        cnVar.getMediaDataController().O0();
                        break;
                    } else if (!cnVar.W6 && !cnVar.S6[0]) {
                        cnVar.W6 = true;
                        cnVar.x6.add(Integer.valueOf(cnVar.l6));
                        i11 = ((f2) cnVar).currentAccount;
                        oa a10 = oa.a(i11);
                        String str = cnVar.I3;
                        i12 = ((f2) cnVar).classGuid;
                        int i14 = cnVar.c4;
                        int i15 = cnVar.l6;
                        cnVar.l6 = i15 + 1;
                        a10.e(i12, i14, i15, str);
                        break;
                    }
                }
                break;
            case 4:
                yw ywVar = (yw) this.b;
                af0 af0Var = (af0) this.c;
                r41 r41Var2 = af0Var.c;
                if (!(TextUtils.isEmpty(af0Var.x) ? af0Var.e : af0Var.n).isEmpty()) {
                    if (r41Var2.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < r41Var2.getChildCount(); i16++) {
                            if (!(r41Var2.getChildAt(i16) instanceof mz)) {
                            }
                        }
                    }
                    af0Var.a(false);
                }
                if (r41Var2.I1 && !af0Var.Q && ywVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((pr) this.c).W.I1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                cu cuVar = (cu) this.c;
                bu buVar = cuVar.f[0];
                if (recyclerView == buVar.d || recyclerView == buVar.e) {
                    kVar = ((f2) cuVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        cu.o0(cuVar, f11);
                        break;
                    }
                }
                break;
            case 7:
                ef0 ef0Var = (ef0) this.c;
                if (ef0Var.b0 && !ef0Var.W) {
                    if (ef0Var.X - ((jg.b0) this.b).N0() < 10) {
                        ef0Var.j0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                cn0 cn0Var = (cn0) this.c;
                if (recyclerView == ((qj0) cn0Var.n[0].f)) {
                    kVar2 = ((f2) cn0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        cn0.l0(cn0Var, f12);
                        break;
                    }
                }
                break;
            case 9:
                sh.o oVar = (sh.o) this.c;
                sh.n nVar = (sh.n) this.b;
                if (!nVar.h && !nVar.i) {
                    if ((oVar.c.f3.D.size() - 1) - oVar.c.e3.M0() < 5) {
                        nVar.a();
                        break;
                    }
                }
                break;
            case 10:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                ((x80) this.c).D.b(recyclerView, i7, i10);
                break;
            default:
                z1 z1Var = (z1) this.c;
                w3 w3Var = z1Var.f;
                if (z1Var.isAttachedToWindow()) {
                    if (w3Var.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < w3Var.getChildCount(); i17++) {
                            if (!(w3Var.getChildAt(i17) instanceof mz)) {
                            }
                        }
                    }
                    z1Var.e.a();
                }
                ((vp0) this.b).p();
                break;
        }
    }
}
