package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class ts0 extends wi0 {
    public final Context c;
    public boolean d;
    public m.q3 e;
    public final /* synthetic */ zs0 f;

    public ts0(zs0 zs0Var, Context context) {
        this.f = zs0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public final boolean E(qj0 qj0Var) {
        zs0 zs0Var = this.f;
        if (!zs0Var.G0()) {
            int ceil = (int) Math.ceil(e() / ((this == zs0Var.J || zs0.x(zs0Var, this) != -1) ? zs0Var.o1[0] : zs0Var.s1));
            if (qj0Var.getChildCount() != 0 && qj0Var.getChildAt(0).getMeasuredHeight() * ceil > qj0Var.getMeasuredHeight()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.wi0
    public String F(int i7) {
        ArrayList arrayList = this.f.v1[0].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i7 <= ((zr0) arrayList.get(i10)).b) {
                return ((zr0) arrayList.get(i10)).a;
            }
        }
        return ((zr0) jg.g.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.wi0
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
        zs0 zs0Var = this.f;
        int[] iArr2 = zs0Var.o1;
        int i7 = (zs0.y(zs0Var, this) != -1 || this == zs0Var.K) ? zs0Var.s1 : zs0.x(zs0Var, this) != -1 ? iArr2[1] : iArr2[0];
        int ceil = (int) (Math.ceil(e() / i7) * measuredHeight);
        int measuredHeight2 = qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f11 = f10 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f11 / measuredHeight)) * i7;
            iArr[1] = ((int) f11) % measuredHeight;
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final float H(qj0 qj0Var) {
        zs0 zs0Var = this.f;
        int[] iArr = zs0Var.o1;
        int i7 = (this == zs0Var.K || zs0.y(zs0Var, this) != -1) ? zs0Var.s1 : zs0.x(zs0Var, this) != -1 ? iArr[1] : iArr[0];
        int ceil = (int) Math.ceil(e() / i7);
        if (qj0Var.getChildCount() == 0) {
            return 0.0f;
        }
        int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
        if (RecyclerView.R(qj0Var.getChildAt(0)) < 0) {
            return 0.0f;
        }
        return (((r4 / i7) * measuredHeight) - (r3.getTop() - qj0Var.getPaddingTop())) / ((ceil * measuredHeight) - (qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop()));
    }

    @Override // org.telegram.ui.Components.wi0
    public void I() {
        this.f.r1(0, true);
    }

    @Override // org.telegram.ui.Components.wi0
    public final void J(qj0 qj0Var) {
        if (this.d) {
            this.d = false;
            int i7 = 0;
            for (int i10 = 0; i10 < qj0Var.getChildCount(); i10++) {
                View childAt = qj0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.o7) {
                    i7 = ((org.telegram.ui.Cells.o7) childAt).getMessageId();
                }
                if (i7 != 0) {
                    break;
                }
            }
            if (i7 == 0) {
                this.f.c0(0, qj0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.wi0
    public final void K() {
        this.d = true;
        ur0 g02 = this.f.g0(0);
        if (g02 != null) {
            zs0.s(g02, null, false);
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
        zs0 zs0Var = this.f;
        os0[] os0VarArr = zs0Var.v1;
        if (org.telegram.messenger.m5.C(zs0Var.l1)) {
            if (os0VarArr[0].a.size() != 0 || os0VarArr[0].g) {
                if (os0VarArr[0].a.size() == 0) {
                    boolean[] zArr = os0VarArr[0].i;
                    if (zArr[0]) {
                    }
                    return 0;
                }
                int size = os0VarArr[0].c().size() + os0VarArr[0].d();
                if (size == 0) {
                    return size;
                }
                boolean[] zArr2 = os0VarArr[0].i;
                return (zArr2[0] && zArr2[1]) ? size : size + 1;
            }
            return 1;
        }
        os0 os0Var = os0VarArr[0];
        if (os0Var.o) {
            return os0Var.e();
        }
        if (os0Var.a.size() != 0 || os0VarArr[0].g) {
            if (os0VarArr[0].a.size() == 0) {
                os0 os0Var2 = os0VarArr[0];
                boolean[] zArr3 = os0Var2.i;
                if (zArr3[0]) {
                }
            }
            if (os0VarArr[0].e() != 0) {
                return Math.max(os0VarArr[0].e(), os0VarArr[0].c().size() + os0VarArr[0].d());
            }
            int size2 = os0VarArr[0].c().size() + os0VarArr[0].d();
            if (size2 == 0) {
                return size2;
            }
            os0 os0Var3 = os0VarArr[0];
            boolean[] zArr4 = os0Var3.i;
            if (zArr4[0] && zArr4[1]) {
                return size2;
            }
            boolean z9 = os0Var3.r;
            if ((z9 ? os0Var3.u : os0Var3.n) != 0) {
                return (z9 ? os0Var3.u : os0Var3.n) + size2;
            }
            return size2 + 1;
        }
        return 1;
    }

    @Override // v4.g0
    public int d(int i7) {
        os0[] os0VarArr = this.f.v1;
        if (!this.d && os0VarArr[0].c().size() == 0) {
            os0 os0Var = os0VarArr[0];
            if (!os0Var.g && os0Var.l) {
                return 2;
            }
        }
        os0VarArr[0].getClass();
        os0VarArr[0].c().size();
        os0VarArr[0].getClass();
        return 0;
    }

    @Override // v4.g0
    public int e() {
        return this.f.v1[0].e();
    }

    @Override // v4.g0
    public void t(v4.d1 d1Var, int i7) {
        zs0 zs0Var = this.f;
        int[] iArr = zs0Var.o1;
        os0[] os0VarArr = zs0Var.v1;
        if (d1Var.f == 0) {
            ArrayList c10 = os0VarArr[0].c();
            int d = i7 - os0VarArr[0].d();
            View view = d1Var.a;
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                int messageId = o7Var.getMessageId();
                int i10 = this == zs0Var.J ? iArr[0] : zs0.x(zs0Var, this) != -1 ? iArr[1] : zs0Var.s1;
                if (d < 0 || d >= c10.size()) {
                    o7Var.k(null, i10, false);
                    o7Var.i(false, false);
                    return;
                }
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) c10.get(d);
                boolean z9 = ijVar.e1() == messageId;
                if (zs0Var.E1) {
                    o7Var.i(zs0Var.b1[(org.telegram.messenger.ij.B0(ijVar.k) > zs0Var.l1 ? 1 : (org.telegram.messenger.ij.B0(ijVar.k) == zs0Var.l1 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(ijVar.e1()) >= 0, z9);
                } else {
                    o7Var.i(false, z9);
                }
                o7Var.k(ijVar, i10, false);
            }
        }
    }

    @Override // v4.g0
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        zs0 zs0Var = this.f;
        org.telegram.ui.ActionBar.g6 g6Var = zs0Var.H1;
        Context context = this.c;
        if (i7 != 0 && i7 != 19) {
            r3 X = zs0.X(0, zs0Var.l1, context, g6Var);
            X.setLayoutParams(new v4.o0(-1, -1));
            return new yi0(X);
        }
        if (this.e == null) {
            this.e = new m.q3(viewGroup.getContext(), g6Var);
        }
        org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, this.e, zs0Var.x1.getCurrentAccount());
        if (i7 == 19) {
            o7Var.w0 = true;
        }
        o7Var.setGradientView(zs0Var.D);
        if (zs0.x(zs0Var, this) != -1) {
            o7Var.d0 = true;
        }
        o7Var.setLayoutParams(new v4.o0(-1, -2));
        return new yi0(o7Var);
    }
}
