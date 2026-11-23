package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ma;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.cu;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.ef0;
import org.telegram.ui.qr;
import org.telegram.ui.rd;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j6 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j6(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                if (i7 == 0) {
                    ((oi.t3) this.c).v3.V();
                    break;
                }
                break;
            case 7:
                du duVar = (du) this.c;
                cu[] cuVarArr = duVar.f;
                ((v4.u0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            cuVarArr[0].d.w0(0, i11, null);
                            di.b1 b1Var = cuVarArr[0].e;
                            if (b1Var != null) {
                                b1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            cuVarArr[0].d.w0(0, i12, null);
                            di.b1 b1Var2 = cuVarArr[0].e;
                            if (b1Var2 != null) {
                                b1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                dn0 dn0Var = (dn0) this.c;
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.n;
                ((v4.u0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) dn0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((ek0) y4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((ek0) y4VarArr[0].f).w0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ((v4.u0) this.b).a(recyclerView, i7);
                ((i90) this.c).D.getClass();
                break;
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                p6 p6Var = (p6) this.c;
                i6 i6Var = p6Var.f;
                if (p6Var.isAttachedToWindow()) {
                    if (i6Var.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < i6Var.getChildCount(); i13++) {
                            if (!(i6Var.getChildAt(i13) instanceof vz)) {
                            }
                        }
                    }
                    p6Var.e.a();
                }
                ((fq0) this.b).p();
                break;
            case 1:
                ci.r rVar = (ci.r) this.b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.j0) this.c).e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    break;
                }
                break;
            case 2:
                oi.t3 t3Var = (oi.t3) this.c;
                ((oi.r3) this.b).S(i10);
                t3Var.v3.G();
                oi.f1 f1Var = t3Var.T3;
                if (f1Var != null && (F = t3Var.F(f1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.T3 = null;
                        f1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        break;
                    }
                }
                break;
            case 3:
                g51 g51Var = ((rd) this.c).a;
                if (g51Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < g51Var.getChildCount(); i14++) {
                        if (!(g51Var.getChildAt(i14) instanceof vz)) {
                        }
                    }
                    break;
                }
                ((ai.u0) this.b).run();
                break;
            case 4:
                bn bnVar = (bn) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(bnVar.m1);
                }
                int N0 = ((v4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > bnVar.b4.h - 5) {
                    if (bnVar.g4 != 7) {
                        bnVar.getMediaDataController().R0();
                        break;
                    } else if (!bnVar.Y6 && !bnVar.U6[0]) {
                        bnVar.Y6 = true;
                        bnVar.z6.add(Integer.valueOf(bnVar.n6));
                        i11 = ((org.telegram.ui.ActionBar.g2) bnVar).currentAccount;
                        ma a10 = ma.a(i11);
                        String str = bnVar.J3;
                        i12 = ((org.telegram.ui.ActionBar.g2) bnVar).classGuid;
                        int i15 = bnVar.d4;
                        int i16 = bnVar.n6;
                        bnVar.n6 = i16 + 1;
                        a10.e(i12, i15, i16, str);
                        break;
                    }
                }
                break;
            case 5:
                bx bxVar = (bx) this.b;
                nf0 nf0Var = (nf0) this.c;
                g51 g51Var2 = nf0Var.c;
                if (!(TextUtils.isEmpty(nf0Var.x) ? nf0Var.e : nf0Var.n).isEmpty()) {
                    if (g51Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < g51Var2.getChildCount(); i17++) {
                            if (!(g51Var2.getChildAt(i17) instanceof vz)) {
                            }
                        }
                    }
                    nf0Var.a(false);
                }
                if (g51Var2.J1 && !nf0Var.R && bxVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(bxVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (((qr) this.c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 7:
                ((v4.u0) this.b).b(recyclerView, i7, i10);
                du duVar = (du) this.c;
                cu cuVar = duVar.f[0];
                if (recyclerView == cuVar.d || recyclerView == cuVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.g2) duVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        du.o0(duVar, f11);
                        break;
                    }
                }
                break;
            case 8:
                ef0 ef0Var = (ef0) this.c;
                if (ef0Var.c0 && !ef0Var.X) {
                    if (ef0Var.Y - ((jg.b0) this.b).N0() < 10) {
                        ef0Var.j0(true);
                        break;
                    }
                }
                break;
            case 9:
                ((v4.u0) this.b).b(recyclerView, i7, i10);
                dn0 dn0Var = (dn0) this.c;
                if (recyclerView == ((ek0) dn0Var.n[0].f)) {
                    kVar2 = ((org.telegram.ui.ActionBar.g2) dn0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        dn0.l0(dn0Var, f12);
                        break;
                    }
                }
                break;
            case 10:
                sh.n nVar = (sh.n) this.c;
                sh.m mVar = (sh.m) this.b;
                if (!mVar.h && !mVar.i) {
                    if ((nVar.c.g3.E.size() - 1) - nVar.c.f3.M0() < 5) {
                        mVar.a();
                        break;
                    }
                }
                break;
            default:
                ((v4.u0) this.b).b(recyclerView, i7, i10);
                ((i90) this.c).D.b(recyclerView, i7, i10);
                break;
        }
    }
}
