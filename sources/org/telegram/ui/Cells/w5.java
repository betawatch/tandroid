package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ef;
import org.telegram.messenger.n10;
import org.telegram.messenger.ue;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w5 extends FrameLayout {
    public u5[] a;
    public ue[] b;
    public int c;
    public v5 d;
    public Paint e;

    public final void a(int i7, ue ueVar) {
        u5[] u5VarArr = this.a;
        this.b[i7] = ueVar;
        if (ueVar == null) {
            u5VarArr[i7].setVisibility(4);
            return;
        }
        ef efVar = ueVar.d;
        u5 u5Var = u5VarArr[i7];
        org.telegram.ui.Components.q9 q9Var = u5Var.b;
        q9Var.r();
        if (efVar != null) {
            int i10 = efVar.C;
            String str = efVar.I;
            if (str != null) {
                q9Var.s(efVar.J, efVar.K, true);
                if (efVar.b) {
                    q9Var.h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                } else {
                    q9Var.h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                }
                ((TextView) u5Var.c).setText(ueVar.c);
                ((TextView) u5Var.d).setText(String.format("%d", Integer.valueOf(ueVar.e.size())));
            }
        }
        q9Var.setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
        ((TextView) u5Var.c).setText(ueVar.c);
        ((TextView) u5Var.d).setText(String.format("%d", Integer.valueOf(ueVar.e.size())));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        View[] viewArr = this.a;
        int B = org.telegram.messenger.g0.Q1() ? n10.B(4.0f, this.c - 1, org.telegram.messenger.g0.L(490.0f) - org.telegram.messenger.g0.L(12.0f)) / this.c : n10.B(4.0f, this.c - 1, org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(12.0f)) / this.c;
        for (int i11 = 0; i11 < this.c; i11++) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewArr[i11].getLayoutParams();
            layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f);
            layoutParams.leftMargin = (org.telegram.messenger.g0.L(4.0f) + B) * i11;
            layoutParams.width = B;
            layoutParams.height = B;
            layoutParams.gravity = 51;
            viewArr[i11].setLayoutParams(layoutParams);
        }
        super.onMeasure(i7, n10.C(4.0f, B, TLObject.FLAG_30));
    }

    public void setAlbumsCount(int i7) {
        int i10 = 0;
        while (true) {
            u5[] u5VarArr = this.a;
            if (i10 >= u5VarArr.length) {
                this.c = i7;
                return;
            } else {
                u5VarArr[i10].setVisibility(i10 < i7 ? 0 : 4);
                i10++;
            }
        }
    }

    public void setDelegate(v5 v5Var) {
        this.d = v5Var;
    }
}
