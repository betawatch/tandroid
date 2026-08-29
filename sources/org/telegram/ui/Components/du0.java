package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class du0 extends tk0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ qu0 f;

    public du0(qu0 qu0Var, Context context, int i10) {
        this.f = qu0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        ArrayList arrayList = this.f.p1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((nt0) arrayList.get(i11)).b) {
                return ((nt0) arrayList.get(i11)).a;
            }
        }
        return ((nt0) j7.l1.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int measuredHeight = jl0Var.getChildAt(0).getMeasuredHeight();
        float k9 = f9 * ((k() * measuredHeight) - (jl0Var.getMeasuredHeight() - jl0Var.getPaddingTop()));
        iArr[0] = (int) (k9 / measuredHeight);
        iArr[1] = ((int) k9) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J(jl0 jl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jl0Var.getChildCount() && (i10 = qu0.p(jl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, jl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void K() {
        this.e = true;
        it0 W = this.f.W(this.d);
        if (W != null) {
            qu0.q(W, null, false);
        }
    }

    @Override // f2.p0
    public final int h() {
        fu0[] fu0VarArr = this.f.p1;
        int i10 = this.d;
        fu0 fu0Var = fu0VarArr[i10];
        if (fu0Var.o) {
            return fu0Var.e();
        }
        if (fu0Var.a.size() == 0 && !fu0VarArr[i10].g) {
            return 1;
        }
        if (fu0VarArr[i10].a.size() == 0) {
            fu0 fu0Var2 = fu0VarArr[i10];
            boolean[] zArr = fu0Var2.i;
            if ((!zArr[0] || !zArr[1]) && fu0Var2.l) {
                return 0;
            }
        }
        if (fu0VarArr[i10].e() != 0) {
            return Math.max(fu0VarArr[i10].e(), fu0VarArr[i10].c().size() + fu0VarArr[i10].d());
        }
        int size = fu0VarArr[i10].c().size() + fu0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        fu0 fu0Var3 = fu0VarArr[i10];
        boolean[] zArr2 = fu0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = fu0Var3.r;
        if ((z10 ? fu0Var3.u : fu0Var3.n) != 0) {
            return (z10 ? fu0Var3.u : fu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        fu0[] fu0VarArr = this.f.p1;
        int i11 = this.d;
        if (fu0VarArr[i11].c.size() == 0 && !fu0VarArr[i11].g) {
            return 9;
        }
        fu0 fu0Var = fu0VarArr[i11];
        int i12 = fu0Var.m;
        if (i10 < i12 || i10 >= fu0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // f2.p0
    public final int k() {
        return this.f.p1[this.d].e();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        qu0 qu0Var = this.f;
        long j10 = qu0Var.f1;
        SparseArray[] sparseArrayArr = qu0Var.V0;
        fu0 fu0Var = qu0Var.p1[this.d];
        ArrayList arrayList = fu0Var.a;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - fu0Var.m);
                g7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (qu0Var.y1) {
                    g7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !qu0Var.X0);
                    return;
                } else {
                    g7Var.b(false, !qu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.f7)) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - fu0Var.m);
            f7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (qu0Var.y1) {
                f7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !qu0Var.X0);
            } else {
                f7Var.e(false, !qu0Var.X0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        qu0 qu0Var = this.f;
        p00 p00Var = qu0Var.y;
        ArrayList arrayList = qu0Var.C0;
        org.telegram.ui.ActionBar.c6 c6Var = qu0Var.B1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                p00 p00Var2 = new p00(context, c6Var);
                if (i11 == 2) {
                    p00Var2.setViewType(4);
                } else {
                    p00Var2.setViewType(3);
                }
                p00Var2.w = false;
                p00Var2.setIsSingleCell(true);
                p00Var2.setGlobalGradientView(p00Var);
                view = p00Var2;
            } else {
                if (i10 == 9) {
                    ct0 M = qu0.M(i11, qu0Var.f1, context, c6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new vk0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new kt0(this, context, c6Var, 1);
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
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view2;
                f7Var.setGlobalGradientView(p00Var);
                view = view2;
                if (i11 == 4) {
                    qu0Var.D0.add(f7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.g7 g7Var = new org.telegram.ui.Cells.g7(context, 0, c6Var);
            g7Var.setGlobalGradientView(p00Var);
            view = g7Var;
        }
        return org.telegram.ui.th.m(view, view, -1, -2);
    }
}
