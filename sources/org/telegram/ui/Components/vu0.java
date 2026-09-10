package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vu0 extends dl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ iv0 f;

    public vu0(iv0 iv0Var, Context context, int i10) {
        this.f = iv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((fu0) arrayList.get(i11)).b) {
                return ((fu0) arrayList.get(i11)).a;
            }
        }
        return ((fu0) hc.b.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void J(vl0 vl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < vl0Var.getChildCount() && (i10 = iv0.p(vl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, vl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void K() {
        this.e = true;
        au0 W = this.f.W(this.d);
        if (W != null) {
            iv0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        xu0[] xu0VarArr = this.f.t1;
        int i10 = this.d;
        xu0 xu0Var = xu0VarArr[i10];
        if (xu0Var.o) {
            return xu0Var.e();
        }
        if (xu0Var.a.size() == 0 && !xu0VarArr[i10].g) {
            return 1;
        }
        if (xu0VarArr[i10].a.size() == 0) {
            xu0 xu0Var2 = xu0VarArr[i10];
            boolean[] zArr = xu0Var2.i;
            if ((!zArr[0] || !zArr[1]) && xu0Var2.l) {
                return 0;
            }
        }
        if (xu0VarArr[i10].e() != 0) {
            return Math.max(xu0VarArr[i10].e(), xu0VarArr[i10].c().size() + xu0VarArr[i10].d());
        }
        int size = xu0VarArr[i10].c().size() + xu0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        xu0 xu0Var3 = xu0VarArr[i10];
        boolean[] zArr2 = xu0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = xu0Var3.r;
        if ((z10 ? xu0Var3.u : xu0Var3.n) != 0) {
            return (z10 ? xu0Var3.u : xu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        xu0[] xu0VarArr = this.f.t1;
        int i11 = this.d;
        if (xu0VarArr[i11].c.size() == 0 && !xu0VarArr[i11].g) {
            return 9;
        }
        xu0 xu0Var = xu0VarArr[i11];
        int i12 = xu0Var.m;
        if (i10 < i12 || i10 >= xu0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // s4.h0
    public final int k() {
        return this.f.t1[this.d].e();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        iv0 iv0Var = this.f;
        long j3 = iv0Var.j1;
        SparseArray[] sparseArrayArr = iv0Var.Z0;
        xu0 xu0Var = iv0Var.t1[this.d];
        ArrayList arrayList = xu0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - xu0Var.m);
                l7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (iv0Var.C1) {
                    l7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !iv0Var.b1);
                    return;
                } else {
                    l7Var.b(false, !iv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - xu0Var.m);
            k7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (iv0Var.C1) {
                k7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !iv0Var.b1);
            } else {
                k7Var.e(false, !iv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        iv0 iv0Var = this.f;
        a10 a10Var = iv0Var.y;
        ArrayList arrayList = iv0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = iv0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                a10 a10Var2 = new a10(context, f6Var);
                if (i11 == 2) {
                    a10Var2.setViewType(4);
                } else {
                    a10Var2.setViewType(3);
                }
                a10Var2.w = false;
                a10Var2.setIsSingleCell(true);
                a10Var2.setGlobalGradientView(a10Var);
                view = a10Var2;
            } else {
                if (i10 == 9) {
                    ut0 M = iv0.M(i11, iv0Var.j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new fl0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new cu0(this, context, f6Var, 1);
                } else {
                    View view3 = (View) arrayList.get(0);
                    arrayList.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                    view2 = view3;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view3);
                        view2 = view3;
                    }
                }
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                k7Var.setGlobalGradientView(a10Var);
                view = view2;
                if (i11 == 4) {
                    iv0Var.H0.add(k7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, f6Var);
            l7Var.setGlobalGradientView(a10Var);
            view = l7Var;
        }
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
