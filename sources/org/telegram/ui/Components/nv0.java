package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nv0 extends tl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ aw0 f;

    public nv0(aw0 aw0Var, Context context, int i10) {
        this.f = aw0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.tl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.v1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((zu0) arrayList.get(i11)).b) {
                return ((zu0) arrayList.get(i11)).a;
            }
        }
        return ((zu0) ic.a.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void G(mm0 mm0Var, float f7, int[] iArr) {
        int measuredHeight = mm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (mm0Var.getMeasuredHeight() - mm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void J(mm0 mm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < mm0Var.getChildCount() && (i10 = aw0.r(mm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.Z(this.d, mm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tl0
    public final void K() {
        this.e = true;
        tu0 d02 = this.f.d0(this.d);
        if (d02 != null) {
            aw0.t(d02, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        pv0[] pv0VarArr = this.f.v1;
        int i10 = this.d;
        pv0 pv0Var = pv0VarArr[i10];
        if (pv0Var.o) {
            return pv0Var.e();
        }
        if (pv0Var.a.size() == 0 && !pv0VarArr[i10].g) {
            return 1;
        }
        if (pv0VarArr[i10].a.size() == 0) {
            pv0 pv0Var2 = pv0VarArr[i10];
            boolean[] zArr = pv0Var2.i;
            if ((!zArr[0] || !zArr[1]) && pv0Var2.l) {
                return 0;
            }
        }
        if (pv0VarArr[i10].e() != 0) {
            return Math.max(pv0VarArr[i10].e(), pv0VarArr[i10].c().size() + pv0VarArr[i10].d());
        }
        int size = pv0VarArr[i10].c().size() + pv0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        pv0 pv0Var3 = pv0VarArr[i10];
        boolean[] zArr2 = pv0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = pv0Var3.r;
        if ((z10 ? pv0Var3.u : pv0Var3.n) != 0) {
            return (z10 ? pv0Var3.u : pv0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        pv0[] pv0VarArr = this.f.v1;
        int i11 = this.d;
        if (pv0VarArr[i11].c.size() == 0 && !pv0VarArr[i11].g) {
            return 9;
        }
        pv0 pv0Var = pv0VarArr[i11];
        int i12 = pv0Var.m;
        if (i10 < i12 || i10 >= pv0Var.a.size() + i12) {
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
        aw0 aw0Var = this.f;
        long j10 = aw0Var.l1;
        SparseArray[] sparseArrayArr = aw0Var.b1;
        pv0 pv0Var = aw0Var.v1[this.d];
        ArrayList arrayList = pv0Var.a;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.o7) {
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - pv0Var.m);
                o7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (aw0Var.E1) {
                    o7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !aw0Var.d1);
                    return;
                } else {
                    o7Var.b(false, !aw0Var.d1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.n7)) {
            org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - pv0Var.m);
            n7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (aw0Var.E1) {
                n7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !aw0Var.d1);
            } else {
                n7Var.e(false, !aw0Var.d1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        aw0 aw0Var = this.f;
        c10 c10Var = aw0Var.y;
        ArrayList arrayList = aw0Var.I0;
        org.telegram.ui.ActionBar.u6 u6Var = aw0Var.H1;
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
                    nu0 U = aw0.U(i11, aw0Var.l1, context, u6Var);
                    U.setLayoutParams(new s4.q0(-1, -1));
                    return new vl0(U);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new vu0(this, context, u6Var, 1);
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
                    aw0Var.J0.add(n7Var);
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
