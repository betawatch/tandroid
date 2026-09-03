package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class lu0 extends cl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ yu0 f;

    public lu0(yu0 yu0Var, Context context, int i10) {
        this.f = yu0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.q1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((vt0) arrayList.get(i11)).b) {
                return ((vt0) arrayList.get(i11)).a;
            }
        }
        return ((vt0) l.d.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (sl0Var.getMeasuredHeight() - sl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.cl0
    public final void J(sl0 sl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < sl0Var.getChildCount() && (i10 = yu0.p(sl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, sl0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public final void K() {
        this.e = true;
        qt0 W = this.f.W(this.d);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    @Override // f2.p0
    public final int h() {
        nu0[] nu0VarArr = this.f.q1;
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
        boolean z4 = nu0Var3.r;
        if ((z4 ? nu0Var3.u : nu0Var3.n) != 0) {
            return (z4 ? nu0Var3.u : nu0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // f2.p0
    public final int j(int i10) {
        nu0[] nu0VarArr = this.f.q1;
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

    @Override // f2.p0
    public final int k() {
        return this.f.q1[this.d].e();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        yu0 yu0Var = this.f;
        long j10 = yu0Var.g1;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        nu0 nu0Var = yu0Var.q1[this.d];
        ArrayList arrayList = nu0Var.a;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - nu0Var.m);
                i7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (yu0Var.z1) {
                    i7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !yu0Var.Y0);
                    return;
                } else {
                    i7Var.b(false, !yu0Var.Y0);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - nu0Var.m);
            h7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (yu0Var.z1) {
                h7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !yu0Var.Y0);
            } else {
                h7Var.e(false, !yu0Var.Y0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        yu0 yu0Var = this.f;
        u00 u00Var = yu0Var.y;
        ArrayList arrayList = yu0Var.D0;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
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
                    kt0 M = yu0.M(i11, yu0Var.g1, context, g6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new el0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new st0(this, context, g6Var, 1);
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
                    yu0Var.E0.add(h7Var);
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
