package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ov0 extends yl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ bw0 f;

    public ov0(bw0 bw0Var, Context context, int i10) {
        this.f = bw0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.yl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((zu0) arrayList.get(i11)).b) {
                return ((zu0) arrayList.get(i11)).a;
            }
        }
        return ((zu0) hg.c.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.yl0
    public final void G(qm0 qm0Var, float f7, int[] iArr) {
        int measuredHeight = qm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (qm0Var.getMeasuredHeight() - qm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.yl0
    public final void J(qm0 qm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < qm0Var.getChildCount() && (i10 = bw0.p(qm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, qm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public final void K() {
        this.e = true;
        uu0 W = this.f.W(this.d);
        if (W != null) {
            bw0.q(W, null, false);
        }
    }

    @Override // s4.i0
    public final int h() {
        qv0[] qv0VarArr = this.f.t1;
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

    @Override // s4.i0
    public final int j(int i10) {
        qv0[] qv0VarArr = this.f.t1;
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

    @Override // s4.i0
    public final int k() {
        return this.f.t1[this.d].e();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        bw0 bw0Var = this.f;
        long j3 = bw0Var.j1;
        SparseArray[] sparseArrayArr = bw0Var.Z0;
        qv0 qv0Var = bw0Var.t1[this.d];
        ArrayList arrayList = qv0Var.a;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - qv0Var.m);
                k7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (bw0Var.C1) {
                    k7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !bw0Var.b1);
                    return;
                } else {
                    k7Var.b(false, !bw0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - qv0Var.m);
            j7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (bw0Var.C1) {
                j7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !bw0Var.b1);
            } else {
                j7Var.e(false, !bw0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        bw0 bw0Var = this.f;
        j10 j10Var = bw0Var.y;
        ArrayList arrayList = bw0Var.G0;
        org.telegram.ui.ActionBar.e6 e6Var = bw0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                j10 j10Var2 = new j10(context, e6Var);
                if (i11 == 2) {
                    j10Var2.setViewType(4);
                } else {
                    j10Var2.setViewType(3);
                }
                j10Var2.w = false;
                j10Var2.setIsSingleCell(true);
                j10Var2.setGlobalGradientView(j10Var);
                view = j10Var2;
            } else {
                if (i10 == 9) {
                    ou0 M = bw0.M(i11, bw0Var.j1, context, e6Var);
                    M.setLayoutParams(new s4.q0(-1, -1));
                    return new am0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new wu0(this, context, e6Var, 1);
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
                j7Var.setGlobalGradientView(j10Var);
                view = view2;
                if (i11 == 4) {
                    bw0Var.H0.add(j7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, e6Var);
            k7Var.setGlobalGradientView(j10Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
