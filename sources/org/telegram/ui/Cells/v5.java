package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.pe;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v5 extends FrameLayout {
    public t5[] a;
    public pe[] b;
    public int c;
    public u5 d;
    public Paint e;

    public final void a(int i3, pe peVar) {
        t5[] t5VarArr = this.a;
        this.b[i3] = peVar;
        if (peVar == null) {
            t5VarArr[i3].setVisibility(4);
            return;
        }
        ye yeVar = peVar.d;
        t5 t5Var = t5VarArr[i3];
        org.telegram.ui.Components.k9 k9Var = t5Var.b;
        k9Var.r();
        if (yeVar != null) {
            int i10 = yeVar.C;
            String str = yeVar.I;
            if (str != null) {
                k9Var.s(yeVar.J, yeVar.K, true);
                if (yeVar.b) {
                    k9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                } else {
                    k9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                }
                ((TextView) t5Var.c).setText(peVar.c);
                ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(peVar.e.size())));
            }
        }
        k9Var.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
        ((TextView) t5Var.c).setText(peVar.c);
        ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(peVar.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
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
        super.onMeasure(i3, org.telegram.messenger.camera.q.B(4.0f, A, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i3) {
        int i10 = 0;
        while (true) {
            t5[] t5VarArr = this.a;
            if (i10 >= t5VarArr.length) {
                this.c = i3;
                return;
            } else {
                t5VarArr[i10].setVisibility(i10 < i3 ? 0 : 4);
                i10++;
            }
        }
    }

    public void setDelegate(u5 u5Var) {
        this.d = u5Var;
    }
}
