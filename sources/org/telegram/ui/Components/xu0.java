package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class xu0 extends el0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ kv0 f;

    public xu0(kv0 kv0Var, Context context, int i10) {
        this.f = kv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((iu0) arrayList.get(i11)).b) {
                return ((iu0) arrayList.get(i11)).a;
            }
        }
        return ((iu0) hg.k0.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.el0
    public final void G(wl0 wl0Var, float f7, int[] iArr) {
        int measuredHeight = wl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (wl0Var.getMeasuredHeight() - wl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.el0
    public final void J(wl0 wl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < wl0Var.getChildCount() && (i10 = kv0.p(wl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, wl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.el0
    public final void K() {
        this.e = true;
        du0 W = this.f.W(this.d);
        if (W != null) {
            kv0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        zu0[] zu0VarArr = this.f.t1;
        int i10 = this.d;
        zu0 zu0Var = zu0VarArr[i10];
        if (zu0Var.o) {
            return zu0Var.e();
        }
        if (zu0Var.a.size() == 0 && !zu0VarArr[i10].g) {
            return 1;
        }
        if (zu0VarArr[i10].a.size() == 0) {
            zu0 zu0Var2 = zu0VarArr[i10];
            boolean[] zArr = zu0Var2.i;
            if ((!zArr[0] || !zArr[1]) && zu0Var2.l) {
                return 0;
            }
        }
        if (zu0VarArr[i10].e() != 0) {
            return Math.max(zu0VarArr[i10].e(), zu0VarArr[i10].c().size() + zu0VarArr[i10].d());
        }
        int size = zu0VarArr[i10].c().size() + zu0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        zu0 zu0Var3 = zu0VarArr[i10];
        boolean[] zArr2 = zu0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = zu0Var3.r;
        if ((z10 ? zu0Var3.u : zu0Var3.n) != 0) {
            return (z10 ? zu0Var3.u : zu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        zu0[] zu0VarArr = this.f.t1;
        int i11 = this.d;
        if (zu0VarArr[i11].c.size() == 0 && !zu0VarArr[i11].g) {
            return 9;
        }
        zu0 zu0Var = zu0VarArr[i11];
        int i12 = zu0Var.m;
        if (i10 < i12 || i10 >= zu0Var.a.size() + i12) {
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
        kv0 kv0Var = this.f;
        long j3 = kv0Var.j1;
        SparseArray[] sparseArrayArr = kv0Var.Z0;
        zu0 zu0Var = kv0Var.t1[this.d];
        ArrayList arrayList = zu0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - zu0Var.m);
                k7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (kv0Var.C1) {
                    k7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !kv0Var.b1);
                    return;
                } else {
                    k7Var.b(false, !kv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.j7)) {
            org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - zu0Var.m);
            j7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (kv0Var.C1) {
                j7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !kv0Var.b1);
            } else {
                j7Var.e(false, !kv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        kv0 kv0Var = this.f;
        t00 t00Var = kv0Var.y;
        ArrayList arrayList = kv0Var.G0;
        org.telegram.ui.ActionBar.e6 e6Var = kv0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                t00 t00Var2 = new t00(context, e6Var);
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
                    xt0 M = kv0.M(i11, kv0Var.j1, context, e6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new gl0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new fu0(this, context, e6Var, 1);
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
                j7Var.setGlobalGradientView(t00Var);
                view = view2;
                if (i11 == 4) {
                    kv0Var.H0.add(j7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, e6Var);
            k7Var.setGlobalGradientView(t00Var);
            view = k7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
