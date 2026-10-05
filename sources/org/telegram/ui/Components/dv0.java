package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class dv0 extends gl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ qv0 f;

    public dv0(qv0 qv0Var, Context context, int i10) {
        this.f = qv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.gl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ou0) arrayList.get(i11)).b) {
                return ((ou0) arrayList.get(i11)).a;
            }
        }
        return ((ou0) hg.c.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void G(zl0 zl0Var, float f7, int[] iArr) {
        int measuredHeight = zl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (zl0Var.getMeasuredHeight() - zl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void J(zl0 zl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zl0Var.getChildCount() && (i10 = qv0.p(zl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, zl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public final void K() {
        this.e = true;
        ju0 W = this.f.W(this.d);
        if (W != null) {
            qv0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        fv0[] fv0VarArr = this.f.t1;
        int i10 = this.d;
        fv0 fv0Var = fv0VarArr[i10];
        if (fv0Var.o) {
            return fv0Var.e();
        }
        if (fv0Var.a.size() == 0 && !fv0VarArr[i10].g) {
            return 1;
        }
        if (fv0VarArr[i10].a.size() == 0) {
            fv0 fv0Var2 = fv0VarArr[i10];
            boolean[] zArr = fv0Var2.i;
            if ((!zArr[0] || !zArr[1]) && fv0Var2.l) {
                return 0;
            }
        }
        if (fv0VarArr[i10].e() != 0) {
            return Math.max(fv0VarArr[i10].e(), fv0VarArr[i10].c().size() + fv0VarArr[i10].d());
        }
        int size = fv0VarArr[i10].c().size() + fv0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        fv0 fv0Var3 = fv0VarArr[i10];
        boolean[] zArr2 = fv0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = fv0Var3.r;
        if ((z10 ? fv0Var3.u : fv0Var3.n) != 0) {
            return (z10 ? fv0Var3.u : fv0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        fv0[] fv0VarArr = this.f.t1;
        int i11 = this.d;
        if (fv0VarArr[i11].c.size() == 0 && !fv0VarArr[i11].g) {
            return 9;
        }
        fv0 fv0Var = fv0VarArr[i11];
        int i12 = fv0Var.m;
        if (i10 < i12 || i10 >= fv0Var.a.size() + i12) {
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
        qv0 qv0Var = this.f;
        long j3 = qv0Var.j1;
        SparseArray[] sparseArrayArr = qv0Var.Z0;
        fv0 fv0Var = qv0Var.t1[this.d];
        ArrayList arrayList = fv0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - fv0Var.m);
                k7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (qv0Var.C1) {
                    k7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !qv0Var.b1);
                    return;
                } else {
                    k7Var.b(false, !qv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - fv0Var.m);
            j7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (qv0Var.C1) {
                j7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !qv0Var.b1);
            } else {
                j7Var.e(false, !qv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        qv0 qv0Var = this.f;
        w00 w00Var = qv0Var.y;
        ArrayList arrayList = qv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = qv0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                w00 w00Var2 = new w00(context, d6Var);
                if (i11 == 2) {
                    w00Var2.setViewType(4);
                } else {
                    w00Var2.setViewType(3);
                }
                w00Var2.w = false;
                w00Var2.setIsSingleCell(true);
                w00Var2.setGlobalGradientView(w00Var);
                view = w00Var2;
            } else {
                if (i10 == 9) {
                    du0 M = qv0.M(i11, qv0Var.j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new il0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new lu0(this, context, d6Var, 1);
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
                j7Var.setGlobalGradientView(w00Var);
                view = view2;
                if (i11 == 4) {
                    qv0Var.H0.add(j7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, d6Var);
            k7Var.setGlobalGradientView(w00Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
