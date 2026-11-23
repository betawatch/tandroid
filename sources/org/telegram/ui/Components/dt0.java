package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class dt0 extends kj0 {
    public final Context c;
    public boolean d;
    public m.o3 e;
    public final /* synthetic */ jt0 f;

    public dt0(jt0 jt0Var, Context context) {
        this.f = jt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean E(ek0 ek0Var) {
        jt0 jt0Var = this.f;
        if (!jt0Var.G0()) {
            int ceil = (int) Math.ceil(e() / ((this == jt0Var.K || jt0.x(jt0Var, this) != -1) ? jt0Var.p1[0] : jt0Var.t1));
            if (ek0Var.getChildCount() != 0 && ek0Var.getChildAt(0).getMeasuredHeight() * ceil > ek0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public String F(int i7) {
        ArrayList arrayList = this.f.w1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((js0) arrayList.get(i10)).b) {
                return ((js0) arrayList.get(i10)).a;
            }
        }
        return ((js0) i5.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        jt0 jt0Var = this.f;
        int[] iArr2 = jt0Var.p1;
        int i7 = (jt0.y(jt0Var, this) != -1 || this == jt0Var.L) ? jt0Var.t1 : jt0.x(jt0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i7;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.kj0
    public final float H(ek0 ek0Var) {
        jt0 jt0Var = this.f;
        int[] iArr = jt0Var.p1;
        int i7 = (this == jt0Var.L || jt0.y(jt0Var, this) != -1) ? jt0Var.t1 : jt0.x(jt0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i7);
        if (ek0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(ek0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i7) * measuredHeight) - (r3.getTop() - ek0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.kj0
    public void I() {
        this.f.r1(0, true);
    }

    @Override // org.telegram.ui.Components.kj0
    public final void J(ek0 ek0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ek0Var.getChildCount(); i10++) {
                View childAt = ek0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    i7 = ((org.telegram.ui.Cells.p7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f.c0(0, ek0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.kj0
    public final void K() {
        this.d = true;
        ds0 g02 = this.f.g0(0);
        if (g02 != null) {
            jt0.s(g02, null, false);
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        jt0 jt0Var = this.f;
        ys0[] ys0VarArr = jt0Var.w1;
        if (org.telegram.messenger.n5.C(jt0Var.m1)) {
            if (ys0VarArr[0].a.size() != 0 || ys0VarArr[0].g) {
                if (ys0VarArr[0].a.size() == 0) {
                    boolean[] zArr = ys0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = ys0VarArr[0].c().size() + ys0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = ys0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        ys0 ys0Var = ys0VarArr[0];
        if (ys0Var.o) {
            return ys0Var.e();
        }
        if (ys0Var.a.size() != 0 || ys0VarArr[0].g) {
            if (ys0VarArr[0].a.size() == 0) {
                ys0 ys0Var2 = ys0VarArr[0];
                boolean[] zArr3 = ys0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (ys0VarArr[0].e() != 0) {
                return Math.max(ys0VarArr[0].e(), ys0VarArr[0].c().size() + ys0VarArr[0].d());
            }
            int size2 = ys0VarArr[0].c().size() + ys0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            ys0 ys0Var3 = ys0VarArr[0];
            boolean[] zArr4 = ys0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = ys0Var3.r;
            if ((z10 ? ys0Var3.u : ys0Var3.n) != 0) {
                return (z10 ? ys0Var3.u : ys0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.i0
    public int d(int i7) {
        ys0[] ys0VarArr = this.f.w1;
        if (!this.d && ys0VarArr[0].c().size() == 0) {
            ys0 ys0Var = ys0VarArr[0];
            if (!ys0Var.g && ys0Var.l) {
                return 2;
            }
        }
        ys0VarArr[0].getClass();
        ys0VarArr[0].c().size();
        ys0VarArr[0].getClass();
        return 0;
    }

    @Override // v4.i0
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // v4.i0
    public void t(v4.f1 f1Var, int i7) {
        jt0 jt0Var = this.f;
        int[] iArr = jt0Var.p1;
        ys0[] ys0VarArr = jt0Var.w1;
        if (f1Var.f == 0) {
            ArrayList c10 = ys0VarArr[0].c();
            int d = i7 - ys0VarArr[0].d();
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                int messageId = p7Var.getMessageId();
                int i10 = this == jt0Var.K ? iArr[0] : jt0.x(jt0Var, this) != -1 ? iArr[1] : jt0Var.t1;
                if (d < 0 || d >= c10.size()) {
                    p7Var.k(null, i10, false);
                    p7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) c10.get(d);
                boolean z10 = gjVar.e1() == messageId;
                if (jt0Var.F1) {
                    p7Var.i(jt0Var.c1[(org.telegram.messenger.gj.B0(gjVar.k) > jt0Var.m1 ? 1 : (org.telegram.messenger.gj.B0(gjVar.k) == jt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(gjVar.e1()) >= 0, z10);
                } else {
                    p7Var.i(false, z10);
                }
                p7Var.k(gjVar, i10, false);
            }
        }
    }

    @Override // v4.i0
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        jt0 jt0Var = this.f;
        org.telegram.ui.ActionBar.h6 h6Var = jt0Var.I1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            y3 X = jt0.X(0, jt0Var.m1, context, h6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new mj0(X);
        }
        if (this.e == null) {
            this.e = new m.o3(viewGroup.getContext(), h6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.e, jt0Var.y1.getCurrentAccount());
        if (i7 == 19) {
            p7Var.x0 = true;
        }
        p7Var.setGradientView(jt0Var.E);
        if (jt0.x(jt0Var, this) != -1) {
            p7Var.e0 = true;
        }
        p7Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(p7Var);
    }
}
