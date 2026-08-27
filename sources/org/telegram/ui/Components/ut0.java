package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ut0 extends jk0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ hu0 f;

    public ut0(hu0 hu0Var, Context context, int i10) {
        this.f = hu0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        ArrayList arrayList = this.f.p1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((et0) arrayList.get(i11)).b) {
                return ((et0) arrayList.get(i11)).a;
            }
        }
        return ((et0) i0.a.i(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        int measuredHeight = zk0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (zk0Var.getMeasuredHeight() - zk0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void J(zk0 zk0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < zk0Var.getChildCount() && (i10 = hu0.p(zk0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, zk0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.jk0
    public final void K() {
        this.e = true;
        zs0 W = this.f.W(this.d);
        if (W != null) {
            hu0.q(W, null, false);
        }
    }

    @Override // f2.q0
    public final int h() {
        wt0[] wt0VarArr = this.f.p1;
        int i10 = this.d;
        wt0 wt0Var = wt0VarArr[i10];
        if (wt0Var.o) {
            return wt0Var.e();
        }
        if (wt0Var.a.size() == 0 && !wt0VarArr[i10].g) {
            return 1;
        }
        if (wt0VarArr[i10].a.size() == 0) {
            wt0 wt0Var2 = wt0VarArr[i10];
            boolean[] zArr = wt0Var2.i;
            if ((!zArr[0] || !zArr[1]) && wt0Var2.l) {
                return 0;
            }
        }
        if (wt0VarArr[i10].e() != 0) {
            return Math.max(wt0VarArr[i10].e(), wt0VarArr[i10].c().size() + wt0VarArr[i10].d());
        }
        int size = wt0VarArr[i10].c().size() + wt0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        wt0 wt0Var3 = wt0VarArr[i10];
        boolean[] zArr2 = wt0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = wt0Var3.r;
        if ((z10 ? wt0Var3.u : wt0Var3.n) != 0) {
            return (z10 ? wt0Var3.u : wt0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // f2.q0
    public final int j(int i10) {
        wt0[] wt0VarArr = this.f.p1;
        int i11 = this.d;
        if (wt0VarArr[i11].c.size() == 0 && !wt0VarArr[i11].g) {
            return 9;
        }
        wt0 wt0Var = wt0VarArr[i11];
        int i12 = wt0Var.m;
        if (i10 < i12 || i10 >= wt0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // f2.q0
    public final int k() {
        return this.f.p1[this.d].e();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        hu0 hu0Var = this.f;
        long j10 = hu0Var.f1;
        SparseArray[] sparseArrayArr = hu0Var.V0;
        wt0 wt0Var = hu0Var.p1[this.d];
        ArrayList arrayList = wt0Var.a;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - wt0Var.m);
                f7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (hu0Var.y1) {
                    f7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !hu0Var.X0);
                    return;
                } else {
                    f7Var.b(false, !hu0Var.X0);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.e7)) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - wt0Var.m);
            e7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (hu0Var.y1) {
                e7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !hu0Var.X0);
            } else {
                e7Var.e(false, !hu0Var.X0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        hu0 hu0Var = this.f;
        h00 h00Var = hu0Var.y;
        ArrayList arrayList = hu0Var.C0;
        org.telegram.ui.ActionBar.c6 c6Var = hu0Var.B1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                h00 h00Var2 = new h00(context, c6Var);
                if (i11 == 2) {
                    h00Var2.setViewType(4);
                } else {
                    h00Var2.setViewType(3);
                }
                h00Var2.w = false;
                h00Var2.setIsSingleCell(true);
                h00Var2.setGlobalGradientView(h00Var);
                view = h00Var2;
            } else {
                if (i10 == 9) {
                    ts0 M = hu0.M(i11, hu0Var.f1, context, c6Var);
                    M.setLayoutParams(new f2.y0(-1, -1));
                    return new lk0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new bt0(this, context, c6Var, 1);
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
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view2;
                e7Var.setGlobalGradientView(h00Var);
                view = view2;
                if (i11 == 4) {
                    hu0Var.D0.add(e7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context, 0, c6Var);
            f7Var.setGlobalGradientView(h00Var);
            view = f7Var;
        }
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
