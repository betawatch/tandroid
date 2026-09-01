package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class mu0 extends dl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ zu0 f;

    public mu0(zu0 zu0Var, Context context, int i10) {
        this.f = zu0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.q1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((wt0) arrayList.get(i11)).b) {
                return ((wt0) arrayList.get(i11)).a;
            }
        }
        return ((wt0) l.d.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(tl0 tl0Var, float f10, int[] iArr) {
        int measuredHeight = tl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (tl0Var.getMeasuredHeight() - tl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void J(tl0 tl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < tl0Var.getChildCount() && (i10 = zu0.p(tl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, tl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void K() {
        this.e = true;
        rt0 W = this.f.W(this.d);
        if (W != null) {
            zu0.q(W, null, false);
        }
    }

    @Override // f2.p0
    public final int h() {
        ou0[] ou0VarArr = this.f.q1;
        int i10 = this.d;
        ou0 ou0Var = ou0VarArr[i10];
        if (ou0Var.o) {
            return ou0Var.e();
        }
        if (ou0Var.a.size() == 0 && !ou0VarArr[i10].g) {
            return 1;
        }
        if (ou0VarArr[i10].a.size() == 0) {
            ou0 ou0Var2 = ou0VarArr[i10];
            boolean[] zArr = ou0Var2.i;
            if ((!zArr[0] || !zArr[1]) && ou0Var2.l) {
                return 0;
            }
        }
        if (ou0VarArr[i10].e() != 0) {
            return Math.max(ou0VarArr[i10].e(), ou0VarArr[i10].c().size() + ou0VarArr[i10].d());
        }
        int size = ou0VarArr[i10].c().size() + ou0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        ou0 ou0Var3 = ou0VarArr[i10];
        boolean[] zArr2 = ou0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z4 = ou0Var3.r;
        if ((z4 ? ou0Var3.u : ou0Var3.n) != 0) {
            return (z4 ? ou0Var3.u : ou0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        ou0[] ou0VarArr = this.f.q1;
        int i11 = this.d;
        if (ou0VarArr[i11].c.size() == 0 && !ou0VarArr[i11].g) {
            return 9;
        }
        ou0 ou0Var = ou0VarArr[i11];
        int i12 = ou0Var.m;
        if (i10 < i12 || i10 >= ou0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // f2.p0
    public final int k() {
        return this.f.q1[this.d].e();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        zu0 zu0Var = this.f;
        long j10 = zu0Var.g1;
        SparseArray[] sparseArrayArr = zu0Var.W0;
        ou0 ou0Var = zu0Var.q1[this.d];
        ArrayList arrayList = ou0Var.a;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - ou0Var.m);
                i7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (zu0Var.z1) {
                    i7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !zu0Var.Y0);
                    return;
                } else {
                    i7Var.b(false, !zu0Var.Y0);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - ou0Var.m);
            h7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (zu0Var.z1) {
                h7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !zu0Var.Y0);
            } else {
                h7Var.e(false, !zu0Var.Y0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        zu0 zu0Var = this.f;
        u00 u00Var = zu0Var.y;
        ArrayList arrayList = zu0Var.D0;
        org.telegram.ui.ActionBar.g6 g6Var = zu0Var.C1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                u00 u00Var2 = new u00(context, g6Var);
                if (i11 == 2) {
                    u00Var2.setViewType(4);
                } else {
                    u00Var2.setViewType(3);
                }
                u00Var2.w = false;
                u00Var2.setIsSingleCell(true);
                u00Var2.setGlobalGradientView(u00Var);
                view = u00Var2;
            } else {
                if (i10 == 9) {
                    lt0 M = zu0.M(i11, zu0Var.g1, context, g6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new fl0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new tt0(this, context, g6Var, 1);
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
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                h7Var.setGlobalGradientView(u00Var);
                view = view2;
                if (i11 == 4) {
                    zu0Var.E0.add(h7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, g6Var);
            i7Var.setGlobalGradientView(u00Var);
            view = i7Var;
        }
        return org.telegram.ui.yh.o(view, view, -1, -2);
    }
}
