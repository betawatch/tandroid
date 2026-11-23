package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class ct0 extends kj0 {
    public final Context c;
    public boolean d;
    public ga.d e;
    public final /* synthetic */ it0 f;

    public ct0(it0 it0Var, Context context) {
        this.f = it0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.kj0
    public final boolean E(ek0 ek0Var) {
        it0 it0Var = this.f;
        if (!it0Var.G0()) {
            int ceil = (int) Math.ceil(e() / ((this == it0Var.K || it0.x(it0Var, this) != -1) ? it0Var.p1[0] : it0Var.t1));
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
            if (i7 <= ((is0) arrayList.get(i10)).b) {
                return ((is0) arrayList.get(i10)).a;
            }
        }
        return ((is0) i5.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        it0 it0Var = this.f;
        int[] iArr2 = it0Var.p1;
        int i7 = (it0.y(it0Var, this) != -1 || this == it0Var.L) ? it0Var.t1 : it0.x(it0Var, this) != -1 ? iArr2[1] : iArr2[0];
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
        it0 it0Var = this.f;
        int[] iArr = it0Var.p1;
        int i7 = (this == it0Var.L || it0.y(it0Var, this) != -1) ? it0Var.t1 : it0.x(it0Var, this) != -1 ? iArr[1] : iArr[0];
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
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i7 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
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
            it0.s(g02, null, false);
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
        it0 it0Var = this.f;
        xs0[] xs0VarArr = it0Var.w1;
        if (org.telegram.messenger.n5.C(it0Var.m1)) {
            if (xs0VarArr[0].a.size() != 0 || xs0VarArr[0].g) {
                if (xs0VarArr[0].a.size() == 0) {
                    boolean[] zArr = xs0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = xs0VarArr[0].c().size() + xs0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = xs0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        xs0 xs0Var = xs0VarArr[0];
        if (xs0Var.o) {
            return xs0Var.e();
        }
        if (xs0Var.a.size() != 0 || xs0VarArr[0].g) {
            if (xs0VarArr[0].a.size() == 0) {
                xs0 xs0Var2 = xs0VarArr[0];
                boolean[] zArr3 = xs0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (xs0VarArr[0].e() != 0) {
                return Math.max(xs0VarArr[0].e(), xs0VarArr[0].c().size() + xs0VarArr[0].d());
            }
            int size2 = xs0VarArr[0].c().size() + xs0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            xs0 xs0Var3 = xs0VarArr[0];
            boolean[] zArr4 = xs0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z10 = xs0Var3.r;
            if ((z10 ? xs0Var3.u : xs0Var3.n) != 0) {
                return (z10 ? xs0Var3.u : xs0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.i0
    public int d(int i7) {
        xs0[] xs0VarArr = this.f.w1;
        if (!this.d && xs0VarArr[0].c().size() == 0) {
            xs0 xs0Var = xs0VarArr[0];
            if (!xs0Var.g && xs0Var.l) {
                return 2;
            }
        }
        xs0VarArr[0].getClass();
        xs0VarArr[0].c().size();
        xs0VarArr[0].getClass();
        return 0;
    }

    @Override // v4.i0
    public int e() {
        return this.f.w1[0].e();
    }

    @Override // v4.i0
    public void t(v4.f1 f1Var, int i7) {
        it0 it0Var = this.f;
        int[] iArr = it0Var.p1;
        xs0[] xs0VarArr = it0Var.w1;
        if (f1Var.f == 0) {
            ArrayList c10 = xs0VarArr[0].c();
            int d = i7 - xs0VarArr[0].d();
            View view = f1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                int i10 = this == it0Var.K ? iArr[0] : it0.x(it0Var, this) != -1 ? iArr[1] : it0Var.t1;
                if (d < 0 || d >= c10.size()) {
                    o7Var.k(null, i10, false);
                    o7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) c10.get(d);
                boolean z10 = fjVar.e1() == messageId;
                if (it0Var.F1) {
                    o7Var.i(it0Var.c1[(org.telegram.messenger.fj.B0(fjVar.k) > it0Var.m1 ? 1 : (org.telegram.messenger.fj.B0(fjVar.k) == it0Var.m1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(fjVar.e1()) >= 0, z10);
                } else {
                    o7Var.i(false, z10);
                }
                o7Var.k(fjVar, i10, false);
            }
        }
    }

    @Override // v4.i0
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        it0 it0Var = this.f;
        org.telegram.ui.ActionBar.i6 i6Var = it0Var.I1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            x3 X = it0.X(0, it0Var.m1, context, i6Var);
            X.setLayoutParams(new v4.q0(-1, -1));
            return new mj0(X);
        }
        if (this.e == null) {
            this.e = new ga.d(viewGroup.getContext(), i6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.e, it0Var.y1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.x0 = true;
        }
        o7Var.setGradientView(it0Var.E);
        if (it0.x(it0Var, this) != -1) {
            o7Var.e0 = true;
        }
        o7Var.setLayoutParams(new v4.q0(-1, -2));
        return new mj0(o7Var);
    }
}
