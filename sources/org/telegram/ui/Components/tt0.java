package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class tt0 extends ak0 {
    public final Context c;
    public boolean d;
    public m.p3 e;
    public final /* synthetic */ zt0 f;

    public tt0(zt0 zt0Var, Context context) {
        this.f = zt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ak0
    public final boolean E(tk0 tk0Var) {
        zt0 zt0Var = this.f;
        if (!zt0Var.C0()) {
            int ceil = (int) Math.ceil(e() / ((this == zt0Var.J || zt0.v(zt0Var, this) != -1) ? zt0Var.o1[0] : zt0Var.s1));
            if (tk0Var.getChildCount() != 0 && tk0Var.getChildAt(0).getMeasuredHeight() * ceil > tk0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ak0
    public String F(int i10) {
        ArrayList arrayList = this.f.v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((xs0) arrayList.get(i11)).b) {
                return ((xs0) arrayList.get(i11)).a;
            }
        }
        return ((xs0) i0.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        zt0 zt0Var = this.f;
        int[] iArr2 = zt0Var.o1;
        int i10 = (zt0.w(zt0Var, this) != -1 || this == zt0Var.K) ? zt0Var.s1 : zt0.v(zt0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i10) * measuredHeight);
        int measuredHeight2 = tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.ak0
    public final float H(tk0 tk0Var) {
        zt0 zt0Var = this.f;
        int[] iArr = zt0Var.o1;
        int i10 = (this == zt0Var.K || zt0.w(zt0Var, this) != -1) ? zt0Var.s1 : zt0.v(zt0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i10);
        if (tk0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(tk0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i10) * measuredHeight) - (r3.getTop() - tk0Var.getPaddingTop())) / ((ceil * measuredHeight) - (tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.ak0
    public void I() {
        this.f.m1(0, true);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void J(tk0 tk0Var) {
        if (this.d) {
            this.d = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tk0Var.getChildCount(); i11++) {
                View childAt = tk0Var.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s7) {
                    i10 = ((org.telegram.ui.Cells.s7) childAt).getMessageId();
                }
                if (i10 != 0) {
                    break;
                }
            }
            if (i10 == 0) {
                this.f.a0(0, tk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ak0
    public final void K() {
        this.d = true;
        ss0 e02 = this.f.e0(0);
        if (e02 != null) {
            zt0.p(e02, null, false);
        }
    }

    public int L(int i10) {
        return this.f.v1[0].m + i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r0[1] != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        if (r4[1] != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        if (r0.l == false) goto L42;
     */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        zt0 zt0Var = this.f;
        ot0[] ot0VarArr = zt0Var.v1;
        if (org.telegram.messenger.o5.C(zt0Var.l1)) {
            if (ot0VarArr[0].a.size() != 0 || ot0VarArr[0].g) {
                if (ot0VarArr[0].a.size() == 0) {
                    boolean[] zArr = ot0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = ot0VarArr[0].c().size() + ot0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = ot0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        ot0 ot0Var = ot0VarArr[0];
        if (ot0Var.o) {
            return ot0Var.e();
        }
        if (ot0Var.a.size() != 0 || ot0VarArr[0].g) {
            if (ot0VarArr[0].a.size() == 0) {
                ot0 ot0Var2 = ot0VarArr[0];
                boolean[] zArr3 = ot0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (ot0VarArr[0].e() != 0) {
                return Math.max(ot0VarArr[0].e(), ot0VarArr[0].c().size() + ot0VarArr[0].d());
            }
            int size2 = ot0VarArr[0].c().size() + ot0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            ot0 ot0Var3 = ot0VarArr[0];
            boolean[] zArr4 = ot0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = ot0Var3.r;
            if ((z10 ? ot0Var3.u : ot0Var3.n) != 0) {
                return (z10 ? ot0Var3.u : ot0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // s4.g0
    public int d(int i10) {
        ot0[] ot0VarArr = this.f.v1;
        if (!this.d && ot0VarArr[0].c().size() == 0) {
            ot0 ot0Var = ot0VarArr[0];
            if (!ot0Var.g && ot0Var.l) {
                return 2;
            }
        }
        ot0VarArr[0].getClass();
        ot0VarArr[0].c().size();
        ot0VarArr[0].getClass();
        return 0;
    }

    @Override // s4.g0
    public int e() {
        return this.f.v1[0].e();
    }

    @Override // s4.g0
    public void t(s4.c1 c1Var, int i10) {
        zt0 zt0Var = this.f;
        int[] iArr = zt0Var.o1;
        ot0[] ot0VarArr = zt0Var.v1;
        if (c1Var.f == 0) {
            ArrayList c10 = ot0VarArr[0].c();
            int d = i10 - ot0VarArr[0].d();
            View view = c1Var.a;
            if (view instanceof org.telegram.ui.Cells.s7) {
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
                int messageId = s7Var.getMessageId();
                int i11 = this == zt0Var.J ? iArr[0] : zt0.v(zt0Var, this) != -1 ? iArr[1] : zt0Var.s1;
                if (d < 0 || d >= c10.size()) {
                    s7Var.k(null, i11, false);
                    s7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) c10.get(d);
                boolean z10 = jjVar.f1() == messageId;
                if (zt0Var.E1) {
                    s7Var.i(zt0Var.b1[(org.telegram.messenger.jj.B0(jjVar.k) > zt0Var.l1 ? 1 : (org.telegram.messenger.jj.B0(jjVar.k) == zt0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(jjVar.f1()) >= 0, z10);
                } else {
                    s7Var.i(false, z10);
                }
                s7Var.k(jjVar, i11, false);
            }
        }
    }

    @Override // s4.g0
    public s4.c1 w(ViewGroup viewGroup, int i10) {
        zt0 zt0Var = this.f;
        org.telegram.ui.ActionBar.p6 p6Var = zt0Var.H1;
        Context context = this.c;
        if (i10 != 0 && i10 != 19) {
            p3 V = zt0.V(0, zt0Var.l1, context, p6Var);
            V.setLayoutParams(new s4.o0(-1, -1));
            return new ck0(V);
        }
        if (this.e == null) {
            this.e = new m.p3(viewGroup.getContext(), p6Var);
        }
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.e, zt0Var.x1.getCurrentAccount());
        if (i10 == 19) {
            s7Var.w0 = true;
        }
        s7Var.setGradientView(zt0Var.D);
        if (zt0.v(zt0Var, this) != -1) {
            s7Var.d0 = true;
        }
        s7Var.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(s7Var);
    }
}
