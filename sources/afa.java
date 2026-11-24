// default package

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class afa extends w29 {
    public final Context c;
    public final byte d;
    public boolean e;
    public final /* synthetic */ nfa f;

    /* JADX WARN: Multi-variable type inference failed */
    public afa(nfa nfaVar, Context context, int i) {
        this.f = nfaVar;
        this.c = context;
        this.d = i;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w29
    public final String F(int i) {
        ArrayList arrayList = this.f.w1[this.d].e;
        if (arrayList.isEmpty()) {
            return "";
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (i <= ((nea) arrayList.get(i2)).b) {
                return ((nea) arrayList.get(i2)).a;
            }
        }
        return ((nea) b00.f(1, arrayList)).a;
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        float e = f * ((e() * measuredHeight) - (o39Var.getMeasuredHeight() - o39Var.getPaddingTop()));
        iArr[0] = (int) (e / measuredHeight);
        iArr[1] = ((int) e) % measuredHeight;
    }

    @Override // w29
    public final void J(o39 o39Var) {
        if (this.e) {
            this.e = false;
            int i = 0;
            for (int i2 = 0; i2 < o39Var.getChildCount() && (i = nfa.Q(o39Var.getChildAt(i2))) == 0; i2++) {
            }
            if (i == 0) {
                this.f.L(this.d, o39Var, true);
            }
        }
    }

    @Override // w29
    public final void K() {
        this.e = true;
        iea P = this.f.P(this.d);
        if (P != null) {
            nfa.m1(P, null, false);
        }
    }

    @Override // w39
    public final int b() {
        cfa[] cfaVarArr = this.f.w1;
        byte b = this.d;
        cfa cfaVar = cfaVarArr[b];
        if (cfaVar.o) {
            return cfaVar.e();
        }
        if (cfaVar.a.size() == 0 && !cfaVarArr[b].g) {
            return 1;
        }
        if (cfaVarArr[b].a.size() == 0) {
            cfa cfaVar2 = cfaVarArr[b];
            boolean[] zArr = cfaVar2.i;
            if ((!zArr[0] || !zArr[1]) && cfaVar2.l) {
                return 0;
            }
        }
        if (cfaVarArr[b].e() != 0) {
            return Math.max(cfaVarArr[b].e(), cfaVarArr[b].c().size() + cfaVarArr[b].d());
        }
        int size = cfaVarArr[b].c().size() + cfaVarArr[b].d();
        if (size == 0) {
            return size;
        }
        cfa cfaVar3 = cfaVarArr[b];
        boolean[] zArr2 = cfaVar3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z = cfaVar3.r;
        if ((z ? cfaVar3.u : cfaVar3.n) != 0) {
            return (z ? cfaVar3.u : cfaVar3.n) + size;
        }
        return size + 1;
    }

    @Override // w39
    public final int d(int i) {
        cfa[] cfaVarArr = this.f.w1;
        byte b = this.d;
        if (cfaVarArr[b].c.size() == 0 && !cfaVarArr[b].g) {
            return 9;
        }
        cfa cfaVar = cfaVarArr[b];
        int i2 = cfaVar.m;
        if (i < i2 || i >= cfaVar.a.size() + i2) {
            return 8;
        }
        return (b == 2 || b == 4) ? 10 : 7;
    }

    @Override // w39
    public final int e() {
        return this.f.w1[this.d].e();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        nfa nfaVar = this.f;
        long j = nfaVar.m1;
        SparseArray[] sparseArrayArr = nfaVar.c1;
        cfa cfaVar = nfaVar.w1[this.d];
        ArrayList arrayList = cfaVar.a;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 7) {
            if (view instanceof iba) {
                iba ibaVar = (iba) view;
                k27 k27Var = (k27) arrayList.get(i - cfaVar.m);
                ibaVar.c(k27Var, i != arrayList.size() - 1);
                if (nfaVar.F1) {
                    ibaVar.b(sparseArrayArr[(k27.B0(k27Var.k) > j ? 1 : (k27.B0(k27Var.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) >= 0, !nfaVar.e1);
                    return;
                } else {
                    ibaVar.b(false, !nfaVar.e1);
                    return;
                }
            }
            return;
        }
        if (i2 == 10 && (view instanceof eba)) {
            eba ebaVar = (eba) view;
            k27 k27Var2 = (k27) arrayList.get(i - cfaVar.m);
            ebaVar.f(k27Var2, i != arrayList.size() - 1);
            if (nfaVar.F1) {
                ebaVar.e(sparseArrayArr[(k27.B0(k27Var2.k) > j ? 1 : (k27.B0(k27Var2.k) == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var2.e1()) >= 0, !nfaVar.e1);
            } else {
                ebaVar.e(false, !nfaVar.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View ue4Var;
        nfa nfaVar = this.f;
        pi4 pi4Var = nfaVar.E;
        ArrayList arrayList = nfaVar.J0;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i != 7) {
            byte b = 2;
            byte b2 = this.d;
            if (i == 8) {
                pi4 pi4Var2 = new pi4(context, wjbVar);
                if (b2 == 2) {
                    pi4Var2.setViewType(4);
                } else {
                    pi4Var2.setViewType(3);
                }
                pi4Var2.x = false;
                pi4Var2.setIsSingleCell(true);
                pi4Var2.setGlobalGradientView(pi4Var);
                view = pi4Var2;
            } else {
                if (i == 9) {
                    bi G = nfa.G(b2, nfaVar.m1, wjbVar, context);
                    G.setLayoutParams(new e49(-1, -1));
                    return new y29(G);
                }
                if (b2 != 4 || arrayList.isEmpty()) {
                    ue4Var = new ue4(this, context, wjbVar, b);
                } else {
                    View view2 = (View) arrayList.get(0);
                    arrayList.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                    ue4Var = view2;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view2);
                        ue4Var = view2;
                    }
                }
                eba ebaVar = (eba) ue4Var;
                ebaVar.setGlobalGradientView(pi4Var);
                view = ue4Var;
                if (b2 == 4) {
                    nfaVar.K0.add(ebaVar);
                    view = ue4Var;
                }
            }
        } else {
            iba ibaVar = new iba(0, wjbVar, context);
            ibaVar.setGlobalGradientView(pi4Var);
            view = ibaVar;
        }
        return ls6.h(view, view, -1, -2);
    }
}
