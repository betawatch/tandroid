package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ef;
import org.telegram.messenger.we;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a6 extends FrameLayout {
    public y5[] a;
    public we[] b;
    public int c;
    public z5 d;
    public Paint e;

    public final void a(int i10, we weVar) {
        y5[] y5VarArr = this.a;
        this.b[i10] = weVar;
        if (weVar == null) {
            y5VarArr[i10].setVisibility(4);
            return;
        }
        ef efVar = weVar.d;
        y5 y5Var = y5VarArr[i10];
        org.telegram.ui.Components.g9 g9Var = y5Var.b;
        g9Var.r();
        if (efVar != null) {
            int i11 = efVar.C;
            String str = efVar.I;
            if (str != null) {
                g9Var.s(efVar.J, efVar.K, true);
                if (efVar.b) {
                    g9Var.h("vthumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                } else {
                    g9Var.h("thumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                }
                ((TextView) y5Var.c).setText(weVar.c);
                ((TextView) y5Var.d).setText(String.format("%d", Integer.valueOf(weVar.e.size())));
            }
        }
        g9Var.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
        ((TextView) y5Var.c).setText(weVar.c);
        ((TextView) y5Var.d).setText(String.format("%d", Integer.valueOf(weVar.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        View[] viewArr = this.a;
        int A = org.telegram.messenger.i0.Q1() ? z20.A(4.0f, this.c - 1, org.telegram.messenger.i0.L(490.0f) - org.telegram.messenger.i0.L(12.0f)) / this.c : z20.A(4.0f, this.c - 1, org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(12.0f)) / this.c;
        for (int i12 = 0; i12 < this.c; i12++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i12].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.i0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.i0.L(4.0f) + A) * i12;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i12].setLayoutParams(layoutParams);
        }
        super.onMeasure(i10, z20.B(4.0f, A, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i10) {
        int i11 = 0;
        while (true) {
            y5[] y5VarArr = this.a;
            if (i11 >= y5VarArr.length) {
                this.c = i10;
                return;
            } else {
                y5VarArr[i11].setVisibility(i11 < i10 ? 0 : 4);
                i11++;
            }
        }
    }

    public void setDelegate(z5 z5Var) {
        this.d = z5Var;
    }
}
