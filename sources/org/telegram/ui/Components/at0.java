package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class at0 extends ij0 {
    public final Context c;
    public boolean d;
    public m.o3 e;
    public final /* synthetic */ gt0 f;

    public at0(gt0 gt0Var, Context context) {
        this.f = gt0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
    public boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public final boolean E(ck0 ck0Var) {
        gt0 gt0Var = this.f;
        if (!gt0Var.G0()) {
            int ceil = (int) Math.ceil(e() / ((this == gt0Var.K || gt0.x(gt0Var, this) != -1) ? gt0Var.p1[0] : gt0Var.t1));
            if (ck0Var.getChildCount() != 0 && ck0Var.getChildAt(0).getMeasuredHeight() * ceil > ck0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ij0
    public String F(int i7) {
        ArrayList arrayList = this.f.w1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((gs0) arrayList.get(i10)).b) {
                return ((gs0) arrayList.get(i10)).a;
            }
        }
        return ((gs0) i5.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        gt0 gt0Var = this.f;
        int[] iArr2 = gt0Var.p1;
        int i7 = (gt0.y(gt0Var, this) != -1 || this == gt0Var.L) ? gt0Var.t1 : gt0.x(gt0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i7;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public final float H(ck0 ck0Var) {
        gt0 gt0Var = this.f;
        int[] iArr = gt0Var.p1;
        int i7 = (this == gt0Var.L || gt0.y(gt0Var, this) != -1) ? gt0Var.t1 : gt0.x(gt0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i7);
        if (ck0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(ck0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i7) * measuredHeight) - (r3.getTop() - ck0Var.getPaddingTop())) / ((ceil * measuredHeight) - (ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.ij0
    public void I() {
        this.f.r1(0, true);
    }

    @Override // org.telegram.ui.Components.ij0
    public final void J(ck0 ck0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < ck0Var.getChildCount(); i10++) {
                View childAt = ck0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.p7) {
                    i7 = ((org.telegram.ui.Cells.p7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f.c0(0, ck0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public final void K() {
        this.d = true;
        bs0 g02 = this.f.g0(0);
        if (g02 != null) {
            gt0.s(g02, null, false);
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
        gt0 gt0Var = this.f;
        vs0[] vs0VarArr = gt0Var.w1;
        if (org.telegram.messenger.n5.C(gt0Var.m1)) {
            if (vs0VarArr[0].a.size() != 0 || vs0VarArr[0].g) {
                if (vs0VarArr[0].a.size() == 0) {
                    boolean[] zArr = vs0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = vs0VarArr[0].c().size() + vs0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = vs0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        vs0 vs0Var = vs0VarArr[0];
        if (vs0Var.o) {
            return vs0Var.e();
        }
        if (vs0Var.a.size() != 0 || vs0VarArr[0].g) {
            if (vs0VarArr[0].a.size() == 0) {
                vs0 vs0Var2 = vs0VarArr[0];
                boolean[] zArr3 = vs0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (vs0VarArr[0].e() != 0) {
                return Math.max(vs0VarArr[0].e(), vs0VarArr[0].c().size() + vs0VarArr[0].d());
            }
            int size2 = vs0VarArr[0].c().size() + vs0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            vs0 vs0Var3 = vs0VarArr[0];
            boolean[] zArr4 = vs0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = vs0Var3.r;
            if ((z10 ? vs0Var3.u : vs0Var3.n) != 0) {
                return (z10 ? vs0Var3.u : vs0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.i0
    public int d(int i7) {
        vs0[] vs0VarArr = this.f.w1;
        if (!this.d && vs0VarArr[0].c().size() == 0) {
            vs0 vs0Var = vs0VarArr[0];
            if (!vs0Var.g && vs0Var.l) {
                return 2;
            }
        }
        vs0VarArr[0].getClass();
        vs0VarArr[0].c().size();
        vs0VarArr[0].getClass();
        return 0;
    }

    @Override // v4.i0
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // v4.i0
    public void t(v4.f1 f1Var, int i7) {
        gt0 gt0Var = this.f;
        int[] iArr = gt0Var.p1;
        vs0[] vs0VarArr = gt0Var.w1;
        if (f1Var.f == 0) {
            ArrayList c10 = vs0VarArr[0].c();
            int d = i7 - vs0VarArr[0].d();
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.p7) {
                org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
                int messageId = p7Var.getMessageId();
                int i10 = this == gt0Var.K ? iArr[0] : gt0.x(gt0Var, this) != -1 ? iArr[1] : gt0Var.t1;
                if (d < 0 || d >= c10.size()) {
                    p7Var.k(null, i10, false);
                    p7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c10.get(d);
                boolean z10 = fjVar.e1() == messageId;
                if (gt0Var.F1) {
                    p7Var.i(gt0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > gt0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == gt0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, z10);
                } else {
                    p7Var.i(false, z10);
                }
                p7Var.k(fjVar, i10, false);
            }
        }
    }

    @Override // v4.i0
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        gt0 gt0Var = this.f;
        org.telegram.ui.ActionBar.i6 i6Var = gt0Var.I1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            x3 X = gt0.X(0, gt0Var.m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new kj0(X);
        }
        if (this.e == null) {
            this.e = new m.o3(viewGroup.getContext(), i6Var);
        }
        org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context, this.e, gt0Var.y1.getCurrentAccount());
        if (i7 == 19) {
            p7Var.x0 = true;
        }
        p7Var.setGradientView(gt0Var.E);
        if (gt0.x(gt0Var, this) != -1) {
            p7Var.e0 = true;
        }
        p7Var.setLayoutParams(new v4.q0(-1, -2));
        return new kj0(p7Var);
    }
}
