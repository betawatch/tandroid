// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class hfa extends w29 {
    public final Context c;
    public boolean d;
    public jb4 e;
    public final /* synthetic */ nfa f;

    public hfa(nfa nfaVar, Context context) {
        this.f = nfaVar;
        this.c = context;
    }

    @Override // n39
    public boolean D(s49 s49Var) {
        return false;
    }

    @Override // w29
    public final boolean E(o39 o39Var) {
        nfa nfaVar = this.f;
        if (!nfaVar.q0()) {
            int ceil = (int) Math.ceil(e() / ((this == nfaVar.K || nfaVar.x1(this) != -1) ? nfaVar.p1[0] : nfaVar.t1));
            if (o39Var.getChildCount() != 0 && o39Var.getChildAt(0).getMeasuredHeight() * ceil > o39Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // w29
    public String F(int i) {
        ArrayList arrayList = this.f.w1[0].e;
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
        int i;
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        nfa nfaVar = this.f;
        if (nfaVar.y1(this) != -1 || this == nfaVar.L) {
            i = nfaVar.t1;
        } else {
            int x1 = nfaVar.x1(this);
            int[] iArr2 = nfaVar.p1;
            i = x1 != -1 ? iArr2[1] : iArr2[0];
        }
        int ceil = (int) (Math.ceil(e() / i) * measuredHeight);
        int measuredHeight2 = o39Var.getMeasuredHeight() - o39Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f2 = f * (ceil - measuredHeight2);
            iArr[0] = ((int) (f2 / measuredHeight)) * i;
            iArr[1] = ((int) f2) % measuredHeight;
        }
    }

    @Override // w29
    public final float H(o39 o39Var) {
        int i;
        nfa nfaVar = this.f;
        if (this == nfaVar.L || nfaVar.y1(this) != -1) {
            i = nfaVar.t1;
        } else {
            int x1 = nfaVar.x1(this);
            int[] iArr = nfaVar.p1;
            i = x1 != -1 ? iArr[1] : iArr[0];
        }
        int ceil = (int) Math.ceil(e() / i);
        if (o39Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(o39Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r3 / i) * measuredHeight) - (r2.getTop() - o39Var.getPaddingTop())) / ((ceil * measuredHeight) - (o39Var.getMeasuredHeight() - o39Var.getPaddingTop()));
    }

    @Override // w29
    public void I() {
        this.f.n1(0, true);
    }

    @Override // w29
    public final void J(o39 o39Var) {
        if (this.d) {
            this.d = false;
            int i = 0;
            for (int i2 = 0; i2 < o39Var.getChildCount(); i2++) {
                View childAt = o39Var.getChildAt(i2);
                if (childAt instanceof qfa) {
                    i = ((qfa) childAt).getMessageId();
                }
                if (i != 0) {
                    break;
                }
            }
            if (i == 0) {
                this.f.L(0, o39Var, true);
            }
        }
    }

    @Override // w29
    public final void K() {
        this.d = true;
        iea P = this.f.P(0);
        if (P != null) {
            nfa.m1(P, null, false);
        }
    }

    public int L(int i) {
        return this.f.w1[0].m + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r0[1] != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r5[1] != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r3[1] != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (r0.l == false) goto L39;
     */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        int size;
        nfa nfaVar = this.f;
        boolean B = cf3.B(nfaVar.m1);
        cfa[] cfaVarArr = nfaVar.w1;
        if (B) {
            if (cfaVarArr[0].a.size() != 0 || cfaVarArr[0].g) {
                if (cfaVarArr[0].a.size() == 0) {
                    boolean[] zArr = cfaVarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                size = cfaVarArr[0].c().size() + cfaVarArr[0].d();
                if (size != 0) {
                    boolean[] zArr2 = cfaVarArr[0].i;
                    if (zArr2[0]) {
                    }
                    return size + 1;
                }
                return size;
            }
            return 1;
        }
        cfa cfaVar = cfaVarArr[0];
        if (cfaVar.o) {
            return cfaVar.e();
        }
        if (cfaVar.a.size() != 0 || cfaVarArr[0].g) {
            if (cfaVarArr[0].a.size() == 0) {
                cfa cfaVar2 = cfaVarArr[0];
                boolean[] zArr3 = cfaVar2.i;
                if (zArr3[0]) {
                }
            }
            if (cfaVarArr[0].e() != 0) {
                return Math.max(cfaVarArr[0].e(), cfaVarArr[0].c().size() + cfaVarArr[0].d());
            }
            size = cfaVarArr[0].c().size() + cfaVarArr[0].d();
            if (size == 0) {
                return size;
            }
            cfa cfaVar3 = cfaVarArr[0];
            boolean[] zArr4 = cfaVar3.i;
            if (zArr4[0] && zArr4[1]) {
                return size;
            }
            boolean z = cfaVar3.r;
            if ((z ? cfaVar3.u : cfaVar3.n) != 0) {
                return (z ? cfaVar3.u : cfaVar3.n) + size;
            }
            return size + 1;
        }
        return 1;
    }

    @Override // w39
    public int d(int i) {
        cfa[] cfaVarArr = this.f.w1;
        if (!this.d && cfaVarArr[0].c().size() == 0) {
            cfa cfaVar = cfaVarArr[0];
            if (!cfaVar.g && cfaVar.l) {
                return 2;
            }
        }
        cfaVarArr[0].getClass();
        cfaVarArr[0].c().size();
        cfaVarArr[0].getClass();
        return 0;
    }

    @Override // w39
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // w39
    public void t(s49 s49Var, int i) {
        nfa nfaVar = this.f;
        int[] iArr = nfaVar.p1;
        cfa[] cfaVarArr = nfaVar.w1;
        if (s49Var.f == 0) {
            ArrayList c = cfaVarArr[0].c();
            int d = i - cfaVarArr[0].d();
            View view = s49Var.a;
            if (view instanceof qfa) {
                qfa qfaVar = (qfa) view;
                int messageId = qfaVar.getMessageId();
                int i2 = this == nfaVar.K ? iArr[0] : nfaVar.x1(this) != -1 ? iArr[1] : nfaVar.t1;
                if (d < 0 || d >= c.size()) {
                    qfaVar.k(null, i2, false);
                    qfaVar.i(false, false);
                    return;
                }
                k27 k27Var = (k27) c.get(d);
                boolean z = k27Var.e1() == messageId;
                if (nfaVar.F1) {
                    qfaVar.i(nfaVar.c1[(k27.B0(k27Var.k) > nfaVar.m1 ? 1 : (k27.B0(k27Var.k) == nfaVar.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(k27Var.e1()) >= 0, z);
                } else {
                    qfaVar.i(false, z);
                }
                qfaVar.k(k27Var, i2, false);
            }
        }
    }

    @Override // w39
    public s49 x(ViewGroup viewGroup, int i) {
        nfa nfaVar = this.f;
        wjb wjbVar = nfaVar.I1;
        Context context = this.c;
        if (i != 0 && i != 19) {
            bi G = nfa.G(0, nfaVar.m1, wjbVar, context);
            G.setLayoutParams(new e49(-1, -1));
            return new y29(G);
        }
        if (this.e == null) {
            this.e = new jb4(viewGroup.getContext(), wjbVar);
        }
        qfa qfaVar = new qfa(context, this.e, nfaVar.y1.getCurrentAccount());
        if (i == 19) {
            qfaVar.x0 = true;
        }
        qfaVar.setGradientView(nfaVar.E);
        if (nfaVar.x1(this) != -1) {
            qfaVar.e0 = true;
        }
        qfaVar.setLayoutParams(new e49(-1, -2));
        return new y29(qfaVar);
    }
}
