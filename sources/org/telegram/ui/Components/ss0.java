package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class ss0 extends vi0 {
    public final Context c;
    public boolean d;
    public m.q3 e;
    public final /* synthetic */ ys0 f;

    public ss0(ys0 ys0Var, Context context) {
        this.f = ys0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.vi0
    public final boolean E(pj0 pj0Var) {
        ys0 ys0Var = this.f;
        if (!ys0Var.G0()) {
            int ceil = (int) Math.ceil(e() / ((this == ys0Var.J || ys0.x(ys0Var, this) != -1) ? ys0Var.o1[0] : ys0Var.s1));
            if (pj0Var.getChildCount() != 0 && pj0Var.getChildAt(0).getMeasuredHeight() * ceil > pj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.vi0
    public String F(int i7) {
        ArrayList arrayList = this.f.v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((yr0) arrayList.get(i10)).b) {
                return ((yr0) arrayList.get(i10)).a;
            }
        }
        return ((yr0) jg.g.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        ys0 ys0Var = this.f;
        int[] iArr2 = ys0Var.o1;
        int i7 = (ys0.y(ys0Var, this) != -1 || this == ys0Var.K) ? ys0Var.s1 : ys0.x(ys0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i7;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public final float H(pj0 pj0Var) {
        ys0 ys0Var = this.f;
        int[] iArr = ys0Var.o1;
        int i7 = (this == ys0Var.K || ys0.y(ys0Var, this) != -1) ? ys0Var.s1 : ys0.x(ys0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i7);
        if (pj0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(pj0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i7) * measuredHeight) - (r3.getTop() - pj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.vi0
    public void I() {
        this.f.r1(0, true);
    }

    @Override // org.telegram.ui.Components.vi0
    public final void J(pj0 pj0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < pj0Var.getChildCount(); i10++) {
                View childAt = pj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i7 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f.c0(0, pj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.vi0
    public final void K() {
        this.d = true;
        tr0 g02 = this.f.g0(0);
        if (g02 != null) {
            ys0.s(g02, null, false);
        }
    }

    public int L(int i7) {
        return this.f.v1[0].m + i7;
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b() {
        ys0 ys0Var = this.f;
        ns0[] ns0VarArr = ys0Var.v1;
        if (org.telegram.messenger.m5.C(ys0Var.l1)) {
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
            boolean z9 = ns0Var3.r;
            if ((z9 ? ns0Var3.u : ns0Var3.n) != 0) {
                return (z9 ? ns0Var3.u : ns0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.g0
    public int d(int i7) {
        ns0[] ns0VarArr = this.f.v1;
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

    @Override // v4.g0
    public int e() {
        return this.f.v1[0].e();
    }

    @Override // v4.g0
    public void t(v4.d1 d1Var, int i7) {
        ys0 ys0Var = this.f;
        int[] iArr = ys0Var.o1;
        ns0[] ns0VarArr = ys0Var.v1;
        if (d1Var.f == 0) {
            ArrayList c10 = ns0VarArr[0].c();
            int d = i7 - ns0VarArr[0].d();
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                int i10 = this == ys0Var.J ? iArr[0] : ys0.x(ys0Var, this) != -1 ? iArr[1] : ys0Var.s1;
                if (d < 0 || d >= c10.size()) {
                    o7Var.k(null, i10, false);
                    o7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(d);
                boolean z9 = ijVar.e1() == messageId;
                if (ys0Var.E1) {
                    o7Var.i(ys0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > ys0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == ys0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, z9);
                } else {
                    o7Var.i(false, z9);
                }
                o7Var.k(ijVar, i10, false);
            }
        }
    }

    @Override // v4.g0
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        ys0 ys0Var = this.f;
        org.telegram.ui.ActionBar.h6 h6Var = ys0Var.H1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            q3 X = ys0.X(0, ys0Var.l1, context, h6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new xi0(X);
        }
        if (this.e == null) {
            this.e = new m.q3(viewGroup.getContext(), h6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.e, ys0Var.x1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.w0 = true;
        }
        o7Var.setGradientView(ys0Var.D);
        if (ys0.x(ys0Var, this) != -1) {
            o7Var.d0 = true;
        }
        o7Var.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(o7Var);
    }
}
