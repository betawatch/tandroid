package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fv0 extends ql0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ sv0 f;

    public fv0(sv0 sv0Var, Context context, int i10) {
        this.f = sv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.ql0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((qu0) arrayList.get(i11)).b) {
                return ((qu0) arrayList.get(i11)).a;
            }
        }
        return ((qu0) i2.d.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int measuredHeight = im0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (im0Var.getMeasuredHeight() - im0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void J(im0 im0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < im0Var.getChildCount() && (i10 = sv0.q(im0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, im0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.ql0
    public final void K() {
        this.e = true;
        lu0 W = this.f.W(this.d);
        if (W != null) {
            sv0.r(W, null, false);
        }
    }

    @Override // s4.g0
    public final int h() {
        hv0[] hv0VarArr = this.f.t1;
        int i10 = this.d;
        hv0 hv0Var = hv0VarArr[i10];
        if (hv0Var.o) {
            return hv0Var.e();
        }
        if (hv0Var.a.size() == 0 && !hv0VarArr[i10].g) {
            return 1;
        }
        if (hv0VarArr[i10].a.size() == 0) {
            hv0 hv0Var2 = hv0VarArr[i10];
            boolean[] zArr = hv0Var2.i;
            if ((!zArr[0] || !zArr[1]) && hv0Var2.l) {
                return 0;
            }
        }
        if (hv0VarArr[i10].e() != 0) {
            return Math.max(hv0VarArr[i10].e(), hv0VarArr[i10].c().size() + hv0VarArr[i10].d());
        }
        int size = hv0VarArr[i10].c().size() + hv0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        hv0 hv0Var3 = hv0VarArr[i10];
        boolean[] zArr2 = hv0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = hv0Var3.r;
        if ((z10 ? hv0Var3.u : hv0Var3.n) != 0) {
            return (z10 ? hv0Var3.u : hv0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        hv0[] hv0VarArr = this.f.t1;
        int i11 = this.d;
        if (hv0VarArr[i11].c.size() == 0 && !hv0VarArr[i11].g) {
            return 9;
        }
        hv0 hv0Var = hv0VarArr[i11];
        int i12 = hv0Var.m;
        if (i10 < i12 || i10 >= hv0Var.a.size() + i12) {
            return 8;
        }
        return (i11 == 2 || i11 == 4) ? 10 : 7;
    }

    @Override // s4.g0
    public final int k() {
        return this.f.t1[this.d].e();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        sv0 sv0Var = this.f;
        long j10 = sv0Var.j1;
        SparseArray[] sparseArrayArr = sv0Var.Z0;
        hv0 hv0Var = sv0Var.t1[this.d];
        ArrayList arrayList = hv0Var.a;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - hv0Var.m);
                i7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (sv0Var.C1) {
                    i7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !sv0Var.b1);
                    return;
                } else {
                    i7Var.b(false, !sv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - hv0Var.m);
            h7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (sv0Var.C1) {
                h7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !sv0Var.b1);
            } else {
                h7Var.e(false, !sv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        sv0 sv0Var = this.f;
        b10 b10Var = sv0Var.y;
        ArrayList arrayList = sv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = sv0Var.F1;
        Context context = this.c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 == 8) {
                b10 b10Var2 = new b10(context, d6Var);
                if (i11 == 2) {
                    b10Var2.setViewType(4);
                } else {
                    b10Var2.setViewType(3);
                }
                b10Var2.w = false;
                b10Var2.setIsSingleCell(true);
                b10Var2.setGlobalGradientView(b10Var);
                view = b10Var2;
            } else {
                if (i10 == 9) {
                    fu0 M = sv0.M(i11, sv0Var.j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new sl0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new nu0(this, context, d6Var, 1);
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
                h7Var.setGlobalGradientView(b10Var);
                view = view2;
                if (i11 == 4) {
                    sv0Var.H0.add(h7Var);
                    view = view2;
                }
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, d6Var);
            i7Var.setGlobalGradientView(b10Var);
            view = i7Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
