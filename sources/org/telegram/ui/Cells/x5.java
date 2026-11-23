package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ff;
import org.telegram.messenger.o10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x5 extends FrameLayout {
    public v5[] a;
    public ve[] b;
    public int c;
    public w5 d;
    public Paint e;

    public final void a(int i7, ve veVar) {
        v5[] v5VarArr = this.a;
        this.b[i7] = veVar;
        if (veVar == null) {
            v5VarArr[i7].setVisibility(4);
            return;
        }
        ff ffVar = veVar.d;
        v5 v5Var = v5VarArr[i7];
        org.telegram.ui.Components.q9 q9Var = v5Var.b;
        q9Var.r();
        if (ffVar != null) {
            int i10 = ffVar.C;
            String str = ffVar.I;
            if (str != null) {
                q9Var.s(ffVar.J, ffVar.K, true);
                if (ffVar.b) {
                    q9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                } else {
                    q9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                }
                ((TextView) v5Var.c).setText(veVar.c);
                ((TextView) v5Var.d).setText(String.format("%d", Integer.valueOf(veVar.e.size())));
            }
        }
        q9Var.setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
        ((TextView) v5Var.c).setText(veVar.c);
        ((TextView) v5Var.d).setText(String.format("%d", Integer.valueOf(veVar.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View[] viewArr = this.a;
        int B = org.telegram.messenger.g0.Q1() ? o10.B(4.0f, this.c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.c : o10.B(4.0f, this.c - 1, org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) / this.c;
        for (int i11 = 0; i11 < this.c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + B) * i11;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, o10.C(4.0f, B, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i7) {
        int i10 = 0;
        while (true) {
            v5[] v5VarArr = this.a;
            if (i10 >= v5VarArr.length) {
                this.c = i7;
                return;
            } else {
                v5VarArr[i10].setVisibility(i10 < i7 ? 0 : 4);
                i10++;
            }
        }
    }

    public void setDelegate(w5 w5Var) {
        this.d = w5Var;
    }
}
