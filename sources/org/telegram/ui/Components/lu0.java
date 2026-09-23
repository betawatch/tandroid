package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lu0 extends uk0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ yu0 f;

    public lu0(yu0 yu0Var, Context context, int i10) {
        this.f = yu0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.uk0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((wt0) arrayList.get(i11)).b) {
                return ((wt0) arrayList.get(i11)).a;
            }
        }
        return ((wt0) hg.c.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.uk0
    public final void G(ml0 ml0Var, float f7, int[] iArr) {
        int measuredHeight = ml0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (ml0Var.getMeasuredHeight() - ml0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.uk0
    public final void J(ml0 ml0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ml0Var.getChildCount() && (i10 = yu0.p(ml0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, ml0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.uk0
    public final void K() {
        this.e = true;
        rt0 W = this.f.W(this.d);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        nu0[] nu0VarArr = this.f.t1;
        int i10 = this.d;
        nu0 nu0Var = nu0VarArr[i10];
        if (nu0Var.o) {
            return nu0Var.e();
        }
        if (nu0Var.a.size() == 0 && !nu0VarArr[i10].g) {
            return 1;
        }
        if (nu0VarArr[i10].a.size() == 0) {
            nu0 nu0Var2 = nu0VarArr[i10];
            boolean[] zArr = nu0Var2.i;
            if ((!zArr[0] || !zArr[1]) && nu0Var2.l) {
                return 0;
            }
        }
        if (nu0VarArr[i10].e() != 0) {
            return Math.max(nu0VarArr[i10].e(), nu0VarArr[i10].c().size() + nu0VarArr[i10].d());
        }
        int size = nu0VarArr[i10].c().size() + nu0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        nu0 nu0Var3 = nu0VarArr[i10];
        boolean[] zArr2 = nu0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = nu0Var3.r;
        if ((z10 ? nu0Var3.u : nu0Var3.n) != 0) {
            return (z10 ? nu0Var3.u : nu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        nu0[] nu0VarArr = this.f.t1;
        int i11 = this.d;
        if (nu0VarArr[i11].c.size() == 0 && !nu0VarArr[i11].g) {
            return 9;
        }
        nu0 nu0Var = nu0VarArr[i11];
        int i12 = nu0Var.m;
        if (i10 < i12 || i10 >= nu0Var.a.size() + i12) {
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
        yu0 yu0Var = this.f;
        long j3 = yu0Var.j1;
        SparseArray[] sparseArrayArr = yu0Var.Z0;
        nu0 nu0Var = yu0Var.t1[this.d];
        ArrayList arrayList = nu0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - nu0Var.m);
                j7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (yu0Var.C1) {
                    j7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !yu0Var.b1);
                    return;
                } else {
                    j7Var.b(false, !yu0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.i7)) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - nu0Var.m);
            i7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (yu0Var.C1) {
                i7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !yu0Var.b1);
            } else {
                i7Var.e(false, !yu0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        yu0 yu0Var = this.f;
        u00 u00Var = yu0Var.y;
        ArrayList arrayList = yu0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = yu0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                u00 u00Var2 = new u00(context, d6Var);
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
                    lt0 M = yu0.M(i11, yu0Var.j1, context, d6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new wk0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new tt0(this, context, d6Var, 1);
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
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view2;
                i7Var.setGlobalGradientView(u00Var);
                view = view2;
                if (i11 == 4) {
                    yu0Var.H0.add(i7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, d6Var);
            j7Var.setGlobalGradientView(u00Var);
            view = j7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
