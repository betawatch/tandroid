package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class hv0 extends rl0 {
    public final Context c;
    public final int d;
    public boolean e;
    public final /* synthetic */ uv0 f;

    public hv0(uv0 uv0Var, Context context, int i10) {
        this.f = uv0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // org.telegram.ui.Components.rl0
    public final String F(int i10) {
        ArrayList arrayList = this.f.t1[this.d].e;
        if (arrayList == null || arrayList.isEmpty()) {
            return "";
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (i10 <= ((su0) arrayList.get(i11)).b) {
                return ((su0) arrayList.get(i11)).a;
            }
        }
        return ((su0) i2.e.h(1, arrayList)).a;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void G(jm0 jm0Var, float f7, int[] iArr) {
        int measuredHeight = jm0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f7 * ((k() * measuredHeight) - (jm0Var.getMeasuredHeight() - jm0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void J(jm0 jm0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < jm0Var.getChildCount() && (i10 = uv0.q(jm0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f.S(this.d, jm0Var, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final void K() {
        this.e = true;
        nu0 W = this.f.W(this.d);
        if (W != null) {
            uv0.r(W, null, false);
        }
    }

    @Override // s4.g0
    public final int h() {
        jv0[] jv0VarArr = this.f.t1;
        int i10 = this.d;
        jv0 jv0Var = jv0VarArr[i10];
        if (jv0Var.o) {
            return jv0Var.e();
        }
        if (jv0Var.a.size() == 0 && !jv0VarArr[i10].g) {
            return 1;
        }
        if (jv0VarArr[i10].a.size() == 0) {
            jv0 jv0Var2 = jv0VarArr[i10];
            boolean[] zArr = jv0Var2.i;
            if ((!zArr[0] || !zArr[1]) && jv0Var2.l) {
                return 0;
            }
        }
        if (jv0VarArr[i10].e() != 0) {
            return Math.max(jv0VarArr[i10].e(), jv0VarArr[i10].c().size() + jv0VarArr[i10].d());
        }
        int size = jv0VarArr[i10].c().size() + jv0VarArr[i10].d();
        if (size == 0) {
            return size;
        }
        jv0 jv0Var3 = jv0VarArr[i10];
        boolean[] zArr2 = jv0Var3.i;
        if (zArr2[0] && zArr2[1]) {
            return size;
        }
        boolean z10 = jv0Var3.r;
        if ((z10 ? jv0Var3.u : jv0Var3.n) != 0) {
            return (z10 ? jv0Var3.u : jv0Var3.n) + size;
        }
        return size + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        jv0[] jv0VarArr = this.f.t1;
        int i11 = this.d;
        if (jv0VarArr[i11].c.size() == 0 && !jv0VarArr[i11].g) {
            return 9;
        }
        jv0 jv0Var = jv0VarArr[i11];
        int i12 = jv0Var.m;
        if (i10 < i12 || i10 >= jv0Var.a.size() + i12) {
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
        uv0 uv0Var = this.f;
        long j10 = uv0Var.j1;
        SparseArray[] sparseArrayArr = uv0Var.Z0;
        jv0 jv0Var = uv0Var.t1[this.d];
        ArrayList arrayList = jv0Var.a;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 7) {
            if (view instanceof org.telegram.ui.Cells.i7) {
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - jv0Var.m);
                i7Var.c(messageObject, i10 != arrayList.size() - 1);
                if (uv0Var.C1) {
                    i7Var.b(sparseArrayArr[(messageObject.getDialogId() > j10 ? 1 : (messageObject.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !uv0Var.b1);
                    return;
                } else {
                    i7Var.b(false, !uv0Var.b1);
                    return;
                }
            }
            return;
        }
        if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - jv0Var.m);
            h7Var.f(messageObject2, i10 != arrayList.size() - 1);
            if (uv0Var.C1) {
                h7Var.e(sparseArrayArr[(messageObject2.getDialogId() > j10 ? 1 : (messageObject2.getDialogId() == j10 ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !uv0Var.b1);
            } else {
                h7Var.e(false, !uv0Var.b1);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        uv0 uv0Var = this.f;
        b10 b10Var = uv0Var.y;
        ArrayList arrayList = uv0Var.G0;
        org.telegram.ui.ActionBar.d6 d6Var = uv0Var.F1;
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
                    hu0 M = uv0.M(i11, uv0Var.j1, context, d6Var);
                    M.setLayoutParams(new s4.o0(-1, -1));
                    return new tl0(M);
                }
                if (i11 != 4 || arrayList.isEmpty()) {
                    view2 = new pu0(this, context, d6Var, 1);
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
                    uv0Var.H0.add(h7Var);
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
