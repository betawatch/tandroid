package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ff;
import org.telegram.messenger.i20;
import org.telegram.messenger.ve;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v5 extends FrameLayout {
    public t5[] a;
    public ve[] b;
    public int c;
    public u5 d;
    public Paint e;

    public final void a(int i7, ve veVar) {
        t5[] t5VarArr = this.a;
        this.b[i7] = veVar;
        if (veVar == null) {
            t5VarArr[i7].setVisibility(4);
            return;
        }
        ff ffVar = veVar.d;
        t5 t5Var = t5VarArr[i7];
        org.telegram.ui.Components.i9 i9Var = t5Var.b;
        i9Var.r();
        if (ffVar != null) {
            int i10 = ffVar.C;
            String str = ffVar.I;
            if (str != null) {
                i9Var.s(ffVar.J, ffVar.K, true);
                if (ffVar.b) {
                    i9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                } else {
                    i9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                }
                ((TextView) t5Var.c).setText(veVar.c);
                ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(veVar.e.size())));
            }
        }
        i9Var.setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
        ((TextView) t5Var.c).setText(veVar.c);
        ((TextView) t5Var.d).setText(String.format("%d", Integer.valueOf(veVar.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View[] viewArr = this.a;
        int A = org.telegram.messenger.g0.Q1() ? i20.A(4.0f, this.c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.c : i20.A(4.0f, this.c - 1, org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) / this.c;
        for (int i11 = 0; i11 < this.c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + A) * i11;
            layoutParams.width = A;
            layoutParams.height = A;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, i20.B(4.0f, A, TLObject.FLAG_30));
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
