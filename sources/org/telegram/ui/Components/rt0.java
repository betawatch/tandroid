package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rt0 extends gk0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ eu0 f;

    public rt0(eu0 eu0Var, Context context, int i9) {
        this.f = eu0Var;
        this.c = context;
        this.d = i9;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        ArrayList arrayList = this.f.p1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i9 <= ((ct0) arrayList.get(i10)).b) {
                return ((ct0) arrayList.get(i10)).a;
            }
        }
        return ((ct0) j3.r0.j(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int measuredHeight = wk0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (wk0Var.getMeasuredHeight() - wk0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void J(wk0 wk0Var) {
        if (this.e) {
            this.e = false;
            int i9 = 0;
            for (int i10 = 0; i10 < wk0Var.getChildCount() && (i9 = eu0.p(wk0Var.getChildAt(i10))) == 0; i10++) {
            }
            if (i9 == 0) {
                this.f.S(this.d, wk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gk0
    public final void K() {
        this.e = true;
        xs0 W = this.f.W(this.d);
        if (W != null) {
            eu0.q(W, null, false);
        }
    }

    @Override // f2.r0
    public final int h() {
        tt0[] tt0VarArr = this.f.p1;
        int i9 = this.d;
        tt0 tt0Var = tt0VarArr[i9];
        if (tt0Var.o) {
            return tt0Var.e();
        }
        if (tt0Var.a.size() == 0 && !tt0VarArr[i9].g) {
            return 1;
        }
        if (tt0VarArr[i9].a.size() == 0) {
            tt0 tt0Var2 = tt0VarArr[i9];
            boolean[] zArr = tt0Var2.i;
            if ((!zArr[0] || !zArr[1]) && tt0Var2.l) {
                return 0;
            }
        }
        if (tt0VarArr[i9].e() != 0) {
            return Math.max(tt0VarArr[i9].e(), tt0VarArr[i9].c().size() + tt0VarArr[i9].d());
        }
        int size = tt0VarArr[i9].c().size() + tt0VarArr[i9].d();
        if (size == 0) {
            return size;
        }
        tt0 tt0Var3 = tt0VarArr[i9];
        boolean[] zArr2 = tt0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = tt0Var3.r;
        if ((z10 ? tt0Var3.u : tt0Var3.n) != 0) {
            return (z10 ? tt0Var3.u : tt0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // f2.r0
    public final int j(int i9) {
        tt0[] tt0VarArr = this.f.p1;
        int i10 = this.d;
        if (tt0VarArr[i10].c.size() == 0 && !tt0VarArr[i10].g) {
            return 9;
        }
        tt0 tt0Var = tt0VarArr[i10];
        int i11 = tt0Var.m;
        if (i9 < i11 || i9 >= tt0Var.a.size() + i11) {
            return 8;
        }
        return (i10 == 2 || i10 == 4) ? 10 : 7;
    }

    @Override // f2.r0
    public final int k() {
        return this.f.p1[this.d].e();
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        eu0 eu0Var = this.f;
        long j10 = eu0Var.f1;
        SparseArray[] sparseArrayArr = eu0Var.V0;
        tt0 tt0Var = eu0Var.p1[this.d];
        ArrayList arrayList = tt0Var.a;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 7) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i9 - tt0Var.m);
                i7Var.c(messageObject, i9 != arrayList.size() - 1);
                if (eu0Var.y1) {
                    i7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !eu0Var.X0);
                    return;
                } else {
                    i7Var.b(false, !eu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i10 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i9 - tt0Var.m);
            h7Var.f(messageObject2, i9 != arrayList.size() - 1);
            if (eu0Var.y1) {
                h7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !eu0Var.X0);
            } else {
                h7Var.e(false, !eu0Var.X0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        View view2;
        eu0 eu0Var = this.f;
        e00 e00Var = eu0Var.y;
        ArrayList arrayList = eu0Var.C0;
        org.telegram.ui.ActionBar.b6 b6Var = eu0Var.B1;
        Context context = this.c;
        if (i9 != 7) {
            int i10 = this.d;
            if (i9 == 8) {
                e00 e00Var2 = new e00(context, b6Var);
                if (i10 == 2) {
                    e00Var2.setViewType(4);
                } else {
                    e00Var2.setViewType(3);
                }
                e00Var2.w = false;
                e00Var2.setIsSingleCell(true);
                e00Var2.setGlobalGradientView(e00Var);
                view = e00Var2;
            } else {
                if (i9 == 9) {
                    rs0 M = eu0.M(i10, eu0Var.f1, context, b6Var);
                    M.setLayoutParams(new f2.a1(-1, -1));
                    return new ik0(M);
                }
                if (i10 != 4 || arrayList.isEmpty()) {
                    view2 = new zs0(this, context, b6Var, 1);
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
                h7Var.setGlobalGradientView(e00Var);
                view = view2;
                if (i10 == 4) {
                    eu0Var.D0.add(h7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, b6Var);
            i7Var.setGlobalGradientView(e00Var);
            view = i7Var;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
