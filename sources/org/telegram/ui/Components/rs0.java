package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class rs0 extends vi0 {
    public final Context c;
    public boolean d;
    public m.q3 e;
    public final /* synthetic */ xs0 f;

    public rs0(xs0 xs0Var, Context context) {
        this.f = xs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.vi0
    public final boolean E(pj0 pj0Var) {
        xs0 xs0Var = this.f;
        if (!xs0Var.F0()) {
            int ceil = (int) Math.ceil(e() / ((this == xs0Var.J || xs0.x(xs0Var, this) != -1) ? xs0Var.o1[0] : xs0Var.s1));
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
            if (i7 <= ((xr0) arrayList.get(i10)).b) {
                return ((xr0) arrayList.get(i10)).a;
            }
        }
        return ((xr0) jg.g.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.vi0
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        xs0 xs0Var = this.f;
        int[] iArr2 = xs0Var.o1;
        int i7 = (xs0.y(xs0Var, this) != -1 || this == xs0Var.K) ? xs0Var.s1 : xs0.x(xs0Var, this) != -1 ? iArr2[1] : iArr2[0];
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
        xs0 xs0Var = this.f;
        int[] iArr = xs0Var.o1;
        int i7 = (this == xs0Var.K || xs0.y(xs0Var, this) != -1) ? xs0Var.s1 : xs0.x(xs0Var, this) != -1 ? iArr[1] : iArr[0];
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
        this.f.p1(0, true);
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
        sr0 g02 = this.f.g0(0);
        if (g02 != null) {
            xs0.s(g02, null, false);
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
        xs0 xs0Var = this.f;
        ms0[] ms0VarArr = xs0Var.v1;
        if (org.telegram.messenger.m5.C(xs0Var.l1)) {
            if (ms0VarArr[0].a.size() != 0 || ms0VarArr[0].g) {
                if (ms0VarArr[0].a.size() == 0) {
                    boolean[] zArr = ms0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = ms0VarArr[0].c().size() + ms0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = ms0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        ms0 ms0Var = ms0VarArr[0];
        if (ms0Var.o) {
            return ms0Var.e();
        }
        if (ms0Var.a.size() != 0 || ms0VarArr[0].g) {
            if (ms0VarArr[0].a.size() == 0) {
                ms0 ms0Var2 = ms0VarArr[0];
                boolean[] zArr3 = ms0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (ms0VarArr[0].e() != 0) {
                return Math.max(ms0VarArr[0].e(), ms0VarArr[0].c().size() + ms0VarArr[0].d());
            }
            int size2 = ms0VarArr[0].c().size() + ms0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            ms0 ms0Var3 = ms0VarArr[0];
            boolean[] zArr4 = ms0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z9 = ms0Var3.r;
            if ((z9 ? ms0Var3.u : ms0Var3.n) != 0) {
                return (z9 ? ms0Var3.u : ms0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.g0
    public int d(int i7) {
        ms0[] ms0VarArr = this.f.v1;
        if (!this.d && ms0VarArr[0].c().size() == 0) {
            ms0 ms0Var = ms0VarArr[0];
            if (!ms0Var.g && ms0Var.l) {
                return 2;
            }
        }
        ms0VarArr[0].getClass();
        ms0VarArr[0].c().size();
        ms0VarArr[0].getClass();
        return 0;
    }

    @Override // v4.g0
    public int e() {
        return this.f.v1[0].e();
    }

    @Override // v4.g0
    public void t(v4.d1 d1Var, int i7) {
        xs0 xs0Var = this.f;
        int[] iArr = xs0Var.o1;
        ms0[] ms0VarArr = xs0Var.v1;
        if (d1Var.f == 0) {
            ArrayList c10 = ms0VarArr[0].c();
            int d = i7 - ms0VarArr[0].d();
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                int i10 = this == xs0Var.J ? iArr[0] : xs0.x(xs0Var, this) != -1 ? iArr[1] : xs0Var.s1;
                if (d < 0 || d >= c10.size()) {
                    o7Var.k(null, i10, false);
                    o7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(d);
                boolean z9 = ijVar.f1() == messageId;
                if (xs0Var.E1) {
                    o7Var.i(xs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > xs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == xs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.f1()) >= 0, z9);
                } else {
                    o7Var.i(false, z9);
                }
                o7Var.k(ijVar, i10, false);
            }
        }
    }

    @Override // v4.g0
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        xs0 xs0Var = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = xs0Var.H1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            r3 X = xs0.X(0, xs0Var.l1, context, f6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new xi0(X);
        }
        if (this.e == null) {
            this.e = new m.q3(viewGroup.getContext(), f6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.e, xs0Var.x1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.w0 = true;
        }
        o7Var.setGradientView(xs0Var.D);
        if (xs0.x(xs0Var, this) != -1) {
            o7Var.d0 = true;
        }
        o7Var.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(o7Var);
    }
}
