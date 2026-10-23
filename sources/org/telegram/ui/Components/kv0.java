package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class kv0 extends ul0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ xv0 f;

    public kv0(xv0 xv0Var, Context context, int i10) {
        this.f = xv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vu0) arrayList.get(i11)).b) {
                return ((vu0) arrayList.get(i11)).a;
            }
        }
        return ((vu0) i2.o1.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void J(mm0 mm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < mm0Var.getChildCount() && (i10 = xv0.q(mm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.T(this.d, mm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final void K() {
        this.e = true;
        qu0 X = this.f.X(this.d);
        if (X != null) {
            xv0.r(X, null, false);
        }
    }

    @Override // s4.g0
    public final int h() {
        mv0[] mv0VarArr = this.f.t1;
        int i10 = this.d;
        mv0 mv0Var = mv0VarArr[i10];
        if (mv0Var.o) {
            return mv0Var.e();
        }
        if (mv0Var.a.size() == 0 && !mv0VarArr[i10].g) {
            return 1;
        }
        if (mv0VarArr[i10].a.size() == 0) {
            mv0 mv0Var2 = mv0VarArr[i10];
            boolean[] zArr = mv0Var2.i;
            if ((!zArr[0] || !zArr[1]) && mv0Var2.l) {
                return 0;
            }
        }
        if (mv0VarArr[i10].e() != 0) {
            return Math.max(mv0VarArr[i10].e(), mv0VarArr[i10].c().size() + mv0VarArr[i10].d());
        }
        int size = mv0VarArr[i10].c().size() + mv0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        mv0 mv0Var3 = mv0VarArr[i10];
        boolean[] zArr2 = mv0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = mv0Var3.r;
        if ((z10 ? mv0Var3.u : mv0Var3.n) != 0) {
            return (z10 ? mv0Var3.u : mv0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        mv0[] mv0VarArr = this.f.t1;
        int i11 = this.d;
        if (mv0VarArr[i11].c.size() == 0 && !mv0VarArr[i11].g) {
            return 9;
        }
        mv0 mv0Var = mv0VarArr[i11];
        int i12 = mv0Var.m;
        if (i10 < i12 || i10 >= mv0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // s4.g0
    public final int k() {
        return this.f.t1[this.d].e();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        xv0 xv0Var = this.f;
        long j10 = xv0Var.j1;
        SparseArray[] sparseArrayArr = xv0Var.Z0;
        mv0 mv0Var = xv0Var.t1[this.d];
        ArrayList arrayList = mv0Var.a;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - mv0Var.m);
                k7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (xv0Var.C1) {
                    k7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !xv0Var.b1);
                    return;
                } else {
                    k7Var.b(false, !xv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - mv0Var.m);
            j7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (xv0Var.C1) {
                j7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !xv0Var.b1);
            } else {
                j7Var.e(false, !xv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        xv0 xv0Var = this.f;
        b10 b10Var = xv0Var.y;
        ArrayList arrayList = xv0Var.G0;
        org.telegram.ui.ActionBar.g6 g6Var = xv0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                b10 b10Var2 = new b10(context, g6Var);
                if (i11 == 2) {
                    b10Var2.setViewType(4);
                } else {
                    b10Var2.setViewType(3);
                }
                b10Var2.w = false;
                b10Var2.setIsSingleCell(true);
                b10Var2.setGlobalGradientView(b10Var);
                view = b10Var2;
            } else {
                if (i10 == 9) {
                    ku0 N = xv0.N(i11, xv0Var.j1, context, g6Var);
                    N.setLayoutParams(new s4.o0(-1, -1));
                    return new wl0(N);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new su0(this, context, g6Var, 1);
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
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view2;
                j7Var.setGlobalGradientView(b10Var);
                view = view2;
                if (i11 == 4) {
                    xv0Var.H0.add(j7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, g6Var);
            k7Var.setGlobalGradientView(b10Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
