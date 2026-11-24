// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bfa extends j39 {
    public final Context r;
    public final /* synthetic */ nfa s;

    public bfa(nfa nfaVar, Context context) {
        this.s = nfaVar;
        this.r = context;
    }

    @Override // w29
    public final String F(int i) {
        return null;
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // j39
    public final int M(int i) {
        cfa[] cfaVarArr = this.s.w1;
        if ((cfaVarArr[3].c.size() == 0 && !cfaVarArr[3].g) || i >= cfaVarArr[3].c.size()) {
            return 1;
        }
        cfa cfaVar = cfaVarArr[3];
        return ((ArrayList) cfaVar.d.get(cfaVar.c.get(i))).size() + (i == 0 ? 0 : 1);
    }

    @Override // j39
    public final Object O(int i, int i2) {
        return null;
    }

    @Override // j39
    public final int P(int i, int i2) {
        cfa[] cfaVarArr = this.s.w1;
        if (cfaVarArr[3].c.size() == 0 && !cfaVarArr[3].g) {
            return 5;
        }
        if (i < cfaVarArr[3].c.size()) {
            return (i == 0 || i2 != 0) ? 4 : 3;
        }
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r5[1] != false) goto L13;
     */
    @Override // j39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        cfa[] cfaVarArr = this.s.w1;
        int i = 1;
        if (cfaVarArr[3].c.size() == 0 && !cfaVarArr[3].g) {
            return 1;
        }
        int size = cfaVarArr[3].c.size();
        if (!cfaVarArr[3].c.isEmpty()) {
            boolean[] zArr = cfaVarArr[3].i;
            if (zArr[0]) {
            }
            return size + i;
        }
        i = 0;
        return size + i;
    }

    @Override // j39
    public final View T(int i, View view) {
        nfa nfaVar = this.s;
        cfa[] cfaVarArr = nfaVar.w1;
        if (view == null) {
            view = new l35(28, nfaVar.I1, this.r);
        }
        if (i == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i < cfaVarArr[3].c.size()) {
            view.setAlpha(1.0f);
            ((l35) view).setText(k96.e0(((k27) ((ArrayList) cfaVarArr[3].d.get((String) cfaVarArr[3].c.get(i))).get(0)).k.date, false));
        }
        return view;
    }

    @Override // j39
    public final boolean V(int i, int i2, s49 s49Var) {
        cfa[] cfaVarArr = this.s.w1;
        if (cfaVarArr[3].c.size() != 0 || cfaVarArr[3].g) {
            return i == 0 || i2 != 0;
        }
        return false;
    }

    @Override // j39
    public final void W(int i, int i2, s49 s49Var) {
        nfa nfaVar = this.s;
        cfa[] cfaVarArr = nfaVar.w1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 == 6 || i3 == 5) {
            return;
        }
        ArrayList arrayList = (ArrayList) cfaVarArr[3].d.get((String) cfaVarArr[3].c.get(i));
        int i4 = s49Var.f;
        if (i4 == 3) {
            k27 k27Var = (k27) arrayList.get(0);
            if (view instanceof l35) {
                ((l35) view).setText(k96.e0(k27Var.k.date, false));
                return;
            }
            return;
        }
        if (i4 == 4) {
            if (i != 0) {
                i2--;
            }
            if (!(view instanceof lba) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            lba lbaVar = (lba) view;
            k27 k27Var2 = (k27) arrayList.get(i2);
            lbaVar.E = i2 != arrayList.size() - 1 || (i == cfaVarArr[3].c.size() - 1 && cfaVarArr[3].g);
            lbaVar.e();
            lbaVar.c0 = k27Var2;
            lbaVar.requestLayout();
            if (nfaVar.F1) {
                lbaVar.f(nfaVar.c1[(k27.B0(k27Var2.k) > nfaVar.m1 ? 1 : (k27.B0(k27Var2.k) == nfaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var2.e1()) >= 0, !nfaVar.e1);
            } else {
                lbaVar.f(false, !nfaVar.e1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        l35 l35Var;
        nfa nfaVar = this.s;
        wjb wjbVar = nfaVar.I1;
        Context context = this.r;
        if (i == 3) {
            l35Var = new l35(28, wjbVar, context);
        } else if (i == 4) {
            lba lbaVar = new lba(0, wjbVar, context);
            lbaVar.setDelegate(nfaVar.W1);
            l35Var = lbaVar;
        } else {
            if (i == 5) {
                bi G = nfa.G(3, nfaVar.m1, wjbVar, context);
                G.setLayoutParams(new e49(-1, -1));
                return new y29(G);
            }
            pi4 pi4Var = new pi4(context, wjbVar);
            pi4Var.setIsSingleCell(true);
            pi4Var.x = false;
            pi4Var.setViewType(5);
            l35Var = pi4Var;
        }
        return ls6.h(l35Var, l35Var, -1, -2);
    }
}
