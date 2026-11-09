package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gf;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v5 extends FrameLayout {
    public t5[] a;
    public we[] b;
    public int c;
    public u5 d;
    public Paint e;

    public final void a(int i7, we weVar) {
        t5[] t5VarArr = this.a;
        this.b[i7] = weVar;
        if (weVar == null) {
            t5VarArr[i7].setVisibility(4);
            return;
        }
        gf gfVar = weVar.d;
        t5 t5Var = t5VarArr[i7];
        org.telegram.ui.Components.l9 l9Var = t5Var.b;
        l9Var.r();
        if (gfVar != null) {
            int i10 = gfVar.C;
            String str = gfVar.I;
            if (str != null) {
                l9Var.s(gfVar.J, gfVar.K, true);
                if (gfVar.b) {
                    l9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.l6.R4);
                } else {
                    l9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.l6.R4);
                }
                ((TextView) t5Var.c).setText(weVar.c);
                ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(weVar.e.size())));
            }
        }
        l9Var.setImageDrawable(org.telegram.ui.ActionBar.l6.R4);
        ((TextView) t5Var.c).setText(weVar.c);
        ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(weVar.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View[] viewArr = this.a;
        int A = org.telegram.messenger.g0.Q1() ? org.telegram.messenger.camera.q.A(4.0f, this.c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.c : org.telegram.messenger.camera.q.A(4.0f, this.c - 1, org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) / this.c;
        for (int i11 = 0; i11 < this.c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, org.telegram.messenger.camera.q.B(4.0f, A, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i7) {
        int i10 = 0;
        while (true) {
            t5[] t5VarArr = this.a;
            if (i10 >= t5VarArr.length) {
                this.c = i7;
                return;
            } else {
                t5VarArr[i10].setVisibility(i10 < i7 ? 0 : 4);
                i10++;
            }
        }
    }

    public void setDelegate(u5 u5Var) {
        this.d = u5Var;
    }
}
