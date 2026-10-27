package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ov0 extends ul0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ bw0 f;

    public ov0(bw0 bw0Var, Context context, int i10) {
        this.f = bw0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        ArrayList arrayList = this.f.v1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((av0) arrayList.get(i11)).b) {
                return ((av0) arrayList.get(i11)).a;
            }
        }
        return ((av0) ic.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(nm0 nm0Var, float f7, int[] iArr) {
        int measuredHeight = nm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (nm0Var.getMeasuredHeight() - nm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void J(nm0 nm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < nm0Var.getChildCount() && (i10 = bw0.r(nm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.Z(this.d, nm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final void K() {
        this.e = true;
        uu0 d02 = this.f.d0(this.d);
        if (d02 != null) {
            bw0.t(d02, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        qv0[] qv0VarArr = this.f.v1;
        int i10 = this.d;
        qv0 qv0Var = qv0VarArr[i10];
        if (qv0Var.o) {
            return qv0Var.e();
        }
        if (qv0Var.a.size() == 0 && !qv0VarArr[i10].g) {
            return 1;
        }
        if (qv0VarArr[i10].a.size() == 0) {
            qv0 qv0Var2 = qv0VarArr[i10];
            boolean[] zArr = qv0Var2.i;
            if ((!zArr[0] || !zArr[1]) && qv0Var2.l) {
                return 0;
            }
        }
        if (qv0VarArr[i10].e() != 0) {
            return Math.max(qv0VarArr[i10].e(), qv0VarArr[i10].c().size() + qv0VarArr[i10].d());
        }
        int size = qv0VarArr[i10].c().size() + qv0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        qv0 qv0Var3 = qv0VarArr[i10];
        boolean[] zArr2 = qv0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = qv0Var3.r;
        if ((z10 ? qv0Var3.u : qv0Var3.n) != 0) {
            return (z10 ? qv0Var3.u : qv0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        qv0[] qv0VarArr = this.f.v1;
        int i11 = this.d;
        if (qv0VarArr[i11].c.size() == 0 && !qv0VarArr[i11].g) {
            return 9;
        }
        qv0 qv0Var = qv0VarArr[i11];
        int i12 = qv0Var.m;
        if (i10 < i12 || i10 >= qv0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // s4.h0
    public final int k() {
        return this.f.v1[this.d].e();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        bw0 bw0Var = this.f;
        long j10 = bw0Var.l1;
        SparseArray[] sparseArrayArr = bw0Var.b1;
        qv0 qv0Var = bw0Var.v1[this.d];
        ArrayList arrayList = qv0Var.a;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - qv0Var.m);
                o7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (bw0Var.E1) {
                    o7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !bw0Var.d1);
                    return;
                } else {
                    o7Var.b(false, !bw0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.n7)) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - qv0Var.m);
            n7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (bw0Var.E1) {
                n7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !bw0Var.d1);
            } else {
                n7Var.e(false, !bw0Var.d1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        bw0 bw0Var = this.f;
        c10 c10Var = bw0Var.y;
        ArrayList arrayList = bw0Var.I0;
        org.telegram.ui.ActionBar.u6 u6Var = bw0Var.H1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                c10 c10Var2 = new c10(context, u6Var);
                if (i11 == 2) {
                    c10Var2.setViewType(4);
                } else {
                    c10Var2.setViewType(3);
                }
                c10Var2.w = false;
                c10Var2.setIsSingleCell(true);
                c10Var2.setGlobalGradientView(c10Var);
                view = c10Var2;
            } else {
                if (i10 == 9) {
                    ou0 U = bw0.U(i11, bw0Var.l1, context, u6Var);
                    U.setLayoutParams(new s4.q0(-1, -1));
                    return new wl0(U);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new wu0(this, context, u6Var, 1);
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
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view2;
                n7Var.setGlobalGradientView(c10Var);
                view = view2;
                if (i11 == 4) {
                    bw0Var.J0.add(n7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.o7 o7Var = new org.telegram.ui.Cells.o7(context, 0, u6Var);
            o7Var.setGlobalGradientView(c10Var);
            view = o7Var;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
