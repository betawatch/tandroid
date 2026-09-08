package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ku0 extends tk0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ xu0 f;

    public ku0(xu0 xu0Var, Context context, int i10) {
        this.f = xu0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).b) {
                return ((vt0) arrayList.get(i11)).a;
            }
        }
        return ((vt0) i2.g.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(ll0 ll0Var, float f7, int[] iArr) {
        int measuredHeight = ll0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (ll0Var.getMeasuredHeight() - ll0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void J(ll0 ll0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < ll0Var.getChildCount() && (i10 = xu0.p(ll0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, ll0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final void K() {
        this.e = true;
        qt0 W = this.f.W(this.d);
        if (W != null) {
            xu0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        mu0[] mu0VarArr = this.f.t1;
        int i10 = this.d;
        mu0 mu0Var = mu0VarArr[i10];
        if (mu0Var.o) {
            return mu0Var.e();
        }
        if (mu0Var.a.size() == 0 && !mu0VarArr[i10].g) {
            return 1;
        }
        if (mu0VarArr[i10].a.size() == 0) {
            mu0 mu0Var2 = mu0VarArr[i10];
            boolean[] zArr = mu0Var2.i;
            if ((!zArr[0] || !zArr[1]) && mu0Var2.l) {
                return 0;
            }
        }
        if (mu0VarArr[i10].e() != 0) {
            return Math.max(mu0VarArr[i10].e(), mu0VarArr[i10].c().size() + mu0VarArr[i10].d());
        }
        int size = mu0VarArr[i10].c().size() + mu0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        mu0 mu0Var3 = mu0VarArr[i10];
        boolean[] zArr2 = mu0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = mu0Var3.r;
        if ((z10 ? mu0Var3.u : mu0Var3.n) != 0) {
            return (z10 ? mu0Var3.u : mu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        mu0[] mu0VarArr = this.f.t1;
        int i11 = this.d;
        if (mu0VarArr[i11].c.size() == 0 && !mu0VarArr[i11].g) {
            return 9;
        }
        mu0 mu0Var = mu0VarArr[i11];
        int i12 = mu0Var.m;
        if (i10 < i12 || i10 >= mu0Var.a.size() + i12) {
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
        xu0 xu0Var = this.f;
        long j3 = xu0Var.j1;
        SparseArray[] sparseArrayArr = xu0Var.Z0;
        mu0 mu0Var = xu0Var.t1[this.d];
        ArrayList arrayList = mu0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.j7) {
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - mu0Var.m);
                j7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (xu0Var.C1) {
                    j7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !xu0Var.b1);
                    return;
                } else {
                    j7Var.b(false, !xu0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.i7)) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - mu0Var.m);
            i7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (xu0Var.C1) {
                i7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !xu0Var.b1);
            } else {
                i7Var.e(false, !xu0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        xu0 xu0Var = this.f;
        t00 t00Var = xu0Var.y;
        ArrayList arrayList = xu0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = xu0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                t00 t00Var2 = new t00(context, f6Var);
                if (i11 == 2) {
                    t00Var2.setViewType(4);
                } else {
                    t00Var2.setViewType(3);
                }
                t00Var2.w = false;
                t00Var2.setIsSingleCell(true);
                t00Var2.setGlobalGradientView(t00Var);
                view = t00Var2;
            } else {
                if (i10 == 9) {
                    kt0 M = xu0.M(i11, xu0Var.j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new vk0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new st0(this, context, f6Var, 1);
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
                i7Var.setGlobalGradientView(t00Var);
                view = view2;
                if (i11 == 4) {
                    xu0Var.H0.add(i7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.j7 j7Var = new org.telegram.ui.Cells.j7(context, 0, f6Var);
            j7Var.setGlobalGradientView(t00Var);
            view = j7Var;
        }
        return com.google.android.gms.internal.vision.e2.l(view, view, -1, -2);
    }
}
