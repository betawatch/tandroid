package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wu0 extends dl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ jv0 f;

    public wu0(jv0 jv0Var, Context context, int i10) {
        this.f = jv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.dl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((hu0) arrayList.get(i11)).b) {
                return ((hu0) arrayList.get(i11)).a;
            }
        }
        return ((hu0) hg.k0.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        int measuredHeight = vl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (vl0Var.getMeasuredHeight() - vl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.dl0
    public final void J(vl0 vl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < vl0Var.getChildCount() && (i10 = jv0.p(vl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, vl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public final void K() {
        this.e = true;
        cu0 W = this.f.W(this.d);
        if (W != null) {
            jv0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        yu0[] yu0VarArr = this.f.t1;
        int i10 = this.d;
        yu0 yu0Var = yu0VarArr[i10];
        if (yu0Var.o) {
            return yu0Var.e();
        }
        if (yu0Var.a.size() == 0 && !yu0VarArr[i10].g) {
            return 1;
        }
        if (yu0VarArr[i10].a.size() == 0) {
            yu0 yu0Var2 = yu0VarArr[i10];
            boolean[] zArr = yu0Var2.i;
            if ((!zArr[0] || !zArr[1]) && yu0Var2.l) {
                return 0;
            }
        }
        if (yu0VarArr[i10].e() != 0) {
            return Math.max(yu0VarArr[i10].e(), yu0VarArr[i10].c().size() + yu0VarArr[i10].d());
        }
        int size = yu0VarArr[i10].c().size() + yu0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        yu0 yu0Var3 = yu0VarArr[i10];
        boolean[] zArr2 = yu0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = yu0Var3.r;
        if ((z10 ? yu0Var3.u : yu0Var3.n) != 0) {
            return (z10 ? yu0Var3.u : yu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        yu0[] yu0VarArr = this.f.t1;
        int i11 = this.d;
        if (yu0VarArr[i11].c.size() == 0 && !yu0VarArr[i11].g) {
            return 9;
        }
        yu0 yu0Var = yu0VarArr[i11];
        int i12 = yu0Var.m;
        if (i10 < i12 || i10 >= yu0Var.a.size() + i12) {
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
        jv0 jv0Var = this.f;
        long j3 = jv0Var.j1;
        SparseArray[] sparseArrayArr = jv0Var.Z0;
        yu0 yu0Var = jv0Var.t1[this.d];
        ArrayList arrayList = yu0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - yu0Var.m);
                l7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (jv0Var.C1) {
                    l7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !jv0Var.b1);
                    return;
                } else {
                    l7Var.b(false, !jv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - yu0Var.m);
            k7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (jv0Var.C1) {
                k7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !jv0Var.b1);
            } else {
                k7Var.e(false, !jv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        jv0 jv0Var = this.f;
        t00 t00Var = jv0Var.y;
        ArrayList arrayList = jv0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = jv0Var.F1;
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
                    wt0 M = jv0.M(i11, jv0Var.j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new fl0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new eu0(this, context, f6Var, 1);
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
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view2;
                k7Var.setGlobalGradientView(t00Var);
                view = view2;
                if (i11 == 4) {
                    jv0Var.H0.add(k7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.l7 l7Var = new org.telegram.ui.Cells.l7(context, 0, f6Var);
            l7Var.setGlobalGradientView(t00Var);
            view = l7Var;
        }
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
