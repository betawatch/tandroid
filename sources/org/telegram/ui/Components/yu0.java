package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class yu0 extends gl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ lv0 f;

    public yu0(lv0 lv0Var, Context context, int i10) {
        this.f = lv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.gl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((ju0) arrayList.get(i11)).b) {
                return ((ju0) arrayList.get(i11)).a;
            }
        }
        return ((ju0) hg.k0.g(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void G(yl0 yl0Var, float f7, int[] iArr) {
        int measuredHeight = yl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (yl0Var.getMeasuredHeight() - yl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.gl0
    public final void J(yl0 yl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < yl0Var.getChildCount() && (i10 = lv0.p(yl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, yl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.gl0
    public final void K() {
        this.e = true;
        eu0 W = this.f.W(this.d);
        if (W != null) {
            lv0.q(W, null, false);
        }
    }

    @Override // s4.h0
    public final int h() {
        av0[] av0VarArr = this.f.t1;
        int i10 = this.d;
        av0 av0Var = av0VarArr[i10];
        if (av0Var.o) {
            return av0Var.e();
        }
        if (av0Var.a.size() == 0 && !av0VarArr[i10].g) {
            return 1;
        }
        if (av0VarArr[i10].a.size() == 0) {
            av0 av0Var2 = av0VarArr[i10];
            boolean[] zArr = av0Var2.i;
            if ((!zArr[0] || !zArr[1]) && av0Var2.l) {
                return 0;
            }
        }
        if (av0VarArr[i10].e() != 0) {
            return Math.max(av0VarArr[i10].e(), av0VarArr[i10].c().size() + av0VarArr[i10].d());
        }
        int size = av0VarArr[i10].c().size() + av0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        av0 av0Var3 = av0VarArr[i10];
        boolean[] zArr2 = av0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = av0Var3.r;
        if ((z10 ? av0Var3.u : av0Var3.n) != 0) {
            return (z10 ? av0Var3.u : av0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        av0[] av0VarArr = this.f.t1;
        int i11 = this.d;
        if (av0VarArr[i11].c.size() == 0 && !av0VarArr[i11].g) {
            return 9;
        }
        av0 av0Var = av0VarArr[i11];
        int i12 = av0Var.m;
        if (i10 < i12 || i10 >= av0Var.a.size() + i12) {
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
        lv0 lv0Var = this.f;
        long j3 = lv0Var.j1;
        SparseArray[] sparseArrayArr = lv0Var.Z0;
        av0 av0Var = lv0Var.t1[this.d];
        ArrayList arrayList = av0Var.a;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.l7) {
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - av0Var.m);
                l7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (lv0Var.C1) {
                    l7Var.b(sparseArrayArr[(messageObject.getDialogId() > j3 ? 1 : (messageObject.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !lv0Var.b1);
                    return;
                } else {
                    l7Var.b(false, !lv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.k7)) {
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - av0Var.m);
            k7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (lv0Var.C1) {
                k7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j3 ? 1 : (messageObject2.getDialogId() == j3 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !lv0Var.b1);
            } else {
                k7Var.e(false, !lv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        lv0 lv0Var = this.f;
        t00 t00Var = lv0Var.y;
        ArrayList arrayList = lv0Var.G0;
        org.telegram.ui.ActionBar.f6 f6Var = lv0Var.F1;
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
                    yt0 M = lv0.M(i11, lv0Var.j1, context, f6Var);
                    M.setLayoutParams(new s4.p0(-1, -1));
                    return new il0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new gu0(this, context, f6Var, 1);
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
                    lv0Var.H0.add(k7Var);
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
