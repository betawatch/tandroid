package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class qs0 extends zi0 {
    public final Context c;
    public boolean d;
    public m.o3 e;
    public final /* synthetic */ ws0 f;

    public qs0(ws0 ws0Var, Context context) {
        this.f = ws0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.zi0
    public final boolean E(tj0 tj0Var) {
        ws0 ws0Var = this.f;
        if (!ws0Var.F0()) {
            int ceil = (int) Math.ceil(e() / ((this == ws0Var.K || ws0.x(ws0Var, this) != -1) ? ws0Var.p1[0] : ws0Var.t1));
            if (tj0Var.getChildCount() != 0 && tj0Var.getChildAt(0).getMeasuredHeight() * ceil > tj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.zi0
    public String F(int i3) {
        ArrayList arrayList = this.f.w1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i3 <= ((wr0) arrayList.get(i10)).b) {
                return ((wr0) arrayList.get(i10)).a;
            }
        }
        return ((wr0) k2.p1.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        ws0 ws0Var = this.f;
        int[] iArr2 = ws0Var.p1;
        int i3 = (ws0.y(ws0Var, this) != -1 || this == ws0Var.L) ? ws0Var.t1 : ws0.x(ws0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i3) * measuredHeight);
        int measuredHeight2 = tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i3;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.zi0
    public final float H(tj0 tj0Var) {
        ws0 ws0Var = this.f;
        int[] iArr = ws0Var.p1;
        int i3 = (this == ws0Var.L || ws0.y(ws0Var, this) != -1) ? ws0Var.t1 : ws0.x(ws0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i3);
        if (tj0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(tj0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i3) * measuredHeight) - (r3.getTop() - tj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.zi0
    public void I() {
        this.f.p1(0, true);
    }

    @Override // org.telegram.ui.Components.zi0
    public final void J(tj0 tj0Var) {
        if (this.d) {
            this.d = false;
            int i3 = 0;
            for (int i10 = 0; i10 < tj0Var.getChildCount(); i10++) {
                View childAt = tj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.n7) {
                    i3 = ((org.telegram.ui.Cells.n7) childAt).getMessageId();
                }
                if (i3 != 0) {
                    break;
                }
            }
            if (i3 == 0) {
                this.f.c0(0, tj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.zi0
    public final void K() {
        this.d = true;
        rr0 g02 = this.f.g0(0);
        if (g02 != null) {
            ws0.s(g02, null, false);
        }
    }

    public int L(int i3) {
        return this.f.w1[0].m + i3;
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
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        ws0 ws0Var = this.f;
        ls0[] ls0VarArr = ws0Var.w1;
        if (org.telegram.messenger.m5.C(ws0Var.m1)) {
            if (ls0VarArr[0].a.size() != 0 || ls0VarArr[0].g) {
                if (ls0VarArr[0].a.size() == 0) {
                    boolean[] zArr = ls0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = ls0VarArr[0].c().size() + ls0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = ls0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        ls0 ls0Var = ls0VarArr[0];
        if (ls0Var.o) {
            return ls0Var.e();
        }
        if (ls0Var.a.size() != 0 || ls0VarArr[0].g) {
            if (ls0VarArr[0].a.size() == 0) {
                ls0 ls0Var2 = ls0VarArr[0];
                boolean[] zArr3 = ls0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (ls0VarArr[0].e() != 0) {
                return Math.max(ls0VarArr[0].e(), ls0VarArr[0].c().size() + ls0VarArr[0].d());
            }
            int size2 = ls0VarArr[0].c().size() + ls0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            ls0 ls0Var3 = ls0VarArr[0];
            boolean[] zArr4 = ls0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = ls0Var3.r;
            if ((z10 ? ls0Var3.u : ls0Var3.n) != 0) {
                return (z10 ? ls0Var3.u : ls0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // u4.h0
    public int d(int i3) {
        ls0[] ls0VarArr = this.f.w1;
        if (!this.d && ls0VarArr[0].c().size() == 0) {
            ls0 ls0Var = ls0VarArr[0];
            if (!ls0Var.g && ls0Var.l) {
                return 2;
            }
        }
        ls0VarArr[0].getClass();
        ls0VarArr[0].c().size();
        ls0VarArr[0].getClass();
        return 0;
    }

    @Override // u4.h0
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // u4.h0
    public void t(u4.d1 d1Var, int i3) {
        ws0 ws0Var = this.f;
        int[] iArr = ws0Var.p1;
        ls0[] ls0VarArr = ws0Var.w1;
        if (d1Var.f == 0) {
            ArrayList c2 = ls0VarArr[0].c();
            int d = i3 - ls0VarArr[0].d();
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.n7) {
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
                int messageId = n7Var.getMessageId();
                int i10 = this == ws0Var.K ? iArr[0] : ws0.x(ws0Var, this) != -1 ? iArr[1] : ws0Var.t1;
                if (d < 0 || d >= c2.size()) {
                    n7Var.k(null, i10, false);
                    n7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) c2.get(d);
                boolean z10 = ziVar.f1() == messageId;
                if (ws0Var.F1) {
                    n7Var.i(ws0Var.c1[(org.telegram.messenger.zi.B0(ziVar.k) > ws0Var.m1 ? 1 : (org.telegram.messenger.zi.B0(ziVar.k) == ws0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ziVar.f1()) >= 0, z10);
                } else {
                    n7Var.i(false, z10);
                }
                n7Var.k(ziVar, i10, false);
            }
        }
    }

    @Override // u4.h0
    public u4.d1 x(ViewGroup viewGroup, int i3) {
        ws0 ws0Var = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = ws0Var.I1;
        Context context = this.c;
        if (i3 != 0 && i3 != 19) {
            p3 X = ws0.X(0, ws0Var.m1, context, e6Var);
            X.setLayoutParams(new u4.p0(-1, -1));
            return new bj0(X);
        }
        if (this.e == null) {
            this.e = new m.o3(viewGroup.getContext(), e6Var);
        }
        org.telegram.ui.Cells.n7 n7Var = new org.telegram.ui.Cells.n7(context, this.e, ws0Var.y1.getCurrentAccount());
        if (i3 == 19) {
            n7Var.x0 = true;
        }
        n7Var.setGradientView(ws0Var.E);
        if (ws0.x(ws0Var, this) != -1) {
            n7Var.e0 = true;
        }
        n7Var.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(n7Var);
    }
}
