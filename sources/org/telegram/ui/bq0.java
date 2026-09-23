package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bq0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ dq0 d;

    public bq0(dq0 dq0Var, Context context) {
        this.d = dq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) c1Var.a;
        dq0 dq0Var = this.d;
        y5Var.setAlbumsCount(dq0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = dq0Var.f;
            if (i11 >= i12) {
                y5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < dq0Var.d.size()) {
                y5Var.a(i11, (MediaController.AlbumEntry) dq0Var.d.get(i13));
            } else {
                y5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context);
        y5Var.e = new Paint();
        y5Var.b = new MediaController.AlbumEntry[4];
        y5Var.a = new org.telegram.ui.Cells.w5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            y5Var.a[i11] = new org.telegram.ui.Cells.w5(y5Var, context);
            y5Var.addView(y5Var.a[i11]);
            y5Var.a[i11].setVisibility(4);
            y5Var.a[i11].setTag(Integer.valueOf(i11));
            y5Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(y5Var, 9));
        }
        y5Var.setDelegate(new nl0(this, 1));
        return new org.telegram.ui.Components.wk0(y5Var);
    }
}
