package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class ss0 extends aj0 {
    public final Context c;
    public boolean d;
    public m.o3 e;
    public final /* synthetic */ ys0 f;

    public ss0(ys0 ys0Var, Context context) {
        this.f = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.aj0
    public final boolean E(uj0 uj0Var) {
        ys0 ys0Var = this.f;
        if (!ys0Var.G0()) {
            int ceil = (int) Math.ceil(e() / ((this == ys0Var.K || ys0.x(ys0Var, this) != -1) ? ys0Var.p1[0] : ys0Var.t1));
            if (uj0Var.getChildCount() != 0 && uj0Var.getChildAt(0).getMeasuredHeight() * ceil > uj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.aj0
    public String F(int i7) {
        ArrayList arrayList = this.f.w1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((yr0) arrayList.get(i10)).b) {
                return ((yr0) arrayList.get(i10)).a;
            }
        }
        return ((yr0) i5.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        ys0 ys0Var = this.f;
        int[] iArr2 = ys0Var.p1;
        int i7 = (ys0.y(ys0Var, this) != -1 || this == ys0Var.L) ? ys0Var.t1 : ys0.x(ys0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i7;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.aj0
    public final float H(uj0 uj0Var) {
        ys0 ys0Var = this.f;
        int[] iArr = ys0Var.p1;
        int i7 = (this == ys0Var.L || ys0.y(ys0Var, this) != -1) ? ys0Var.t1 : ys0.x(ys0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i7);
        if (uj0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(uj0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i7) * measuredHeight) - (r3.getTop() - uj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.aj0
    public void I() {
        this.f.r1(0, true);
    }

    @Override // org.telegram.ui.Components.aj0
    public final void J(uj0 uj0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < uj0Var.getChildCount(); i10++) {
                View childAt = uj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.n7) {
                    i7 = ((org.telegram.ui.Cells.n7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f.c0(0, uj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.aj0
    public final void K() {
        this.d = true;
        tr0 g02 = this.f.g0(0);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f.w1[0].m + i7;
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        ys0 ys0Var = this.f;
        ns0[] ns0VarArr = ys0Var.w1;
        if (org.telegram.messenger.m5.C(ys0Var.m1)) {
            if (ns0VarArr[0].a.size() != 0 || ns0VarArr[0].g) {
                if (ns0VarArr[0].a.size() == 0) {
                    boolean[] zArr = ns0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = ns0VarArr[0].c().size() + ns0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = ns0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        ns0 ns0Var = ns0VarArr[0];
        if (ns0Var.o) {
            return ns0Var.e();
        }
        if (ns0Var.a.size() != 0 || ns0VarArr[0].g) {
            if (ns0VarArr[0].a.size() == 0) {
                ns0 ns0Var2 = ns0VarArr[0];
                boolean[] zArr3 = ns0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (ns0VarArr[0].e() != 0) {
                return Math.max(ns0VarArr[0].e(), ns0VarArr[0].c().size() + ns0VarArr[0].d());
            }
            int size2 = ns0VarArr[0].c().size() + ns0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            ns0 ns0Var3 = ns0VarArr[0];
            boolean[] zArr4 = ns0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = ns0Var3.r;
            if ((z10 ? ns0Var3.u : ns0Var3.n) != 0) {
                return (z10 ? ns0Var3.u : ns0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.h0
    public int d(int i7) {
        ns0[] ns0VarArr = this.f.w1;
        if (!this.d && ns0VarArr[0].c().size() == 0) {
            ns0 ns0Var = ns0VarArr[0];
            if (!ns0Var.g && ns0Var.l) {
                return 2;
            }
        }
        ns0VarArr[0].getClass();
        ns0VarArr[0].c().size();
        ns0VarArr[0].getClass();
        return 0;
    }

    @Override // v4.h0
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // v4.h0
    public void t(v4.e1 e1Var, int i7) {
        ys0 ys0Var = this.f;
        int[] iArr = ys0Var.p1;
        ns0[] ns0VarArr = ys0Var.w1;
        if (e1Var.f == 0) {
            ArrayList c10 = ns0VarArr[0].c();
            int d = i7 - ns0VarArr[0].d();
            View view = e1Var.a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                int messageId = n7Var.getMessageId();
                int i10 = this == ys0Var.K ? iArr[0] : ys0.x(ys0Var, this) != -1 ? iArr[1] : ys0Var.t1;
                if (d < 0 || d >= c10.size()) {
                    n7Var.k(null, i10, false);
                    n7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c10.get(d);
                boolean z10 = gjVar.e1() == messageId;
                if (ys0Var.F1) {
                    n7Var.i(ys0Var.c1[(org.telegram.messenger.gj.B0(gjVar.k) > ys0Var.m1 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == ys0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0, z10);
                } else {
                    n7Var.i(false, z10);
                }
                n7Var.k(gjVar, i10, false);
            }
        }
    }

    @Override // v4.h0
    public v4.e1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = ys0Var.I1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            p3 X = ys0.X(0, ys0Var.m1, context, e6Var);
            X.setLayoutParams(new v4.p0(-1, -1));
            return new cj0(X);
        }
        if (this.e == null) {
            this.e = new m.o3(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.e, ys0Var.y1.getCurrentAccount());
        if (i7 == 19) {
            n7Var.x0 = true;
        }
        n7Var.setGradientView(ys0Var.E);
        if (ys0.x(ys0Var, this) != -1) {
            n7Var.e0 = true;
        }
        n7Var.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(n7Var);
    }
}
