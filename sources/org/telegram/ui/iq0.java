package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ kq0 d;

    public iq0(kq0 kq0Var, Context context) {
        this.d = kq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
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
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) c1Var.a;
        kq0 kq0Var = this.d;
        x5Var.setAlbumsCount(kq0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = kq0Var.f;
            if (i11 >= i12) {
                x5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < kq0Var.d.size()) {
                x5Var.a(i11, (MediaController.AlbumEntry) kq0Var.d.get(i13));
            } else {
                x5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.x5 x5Var = new org.telegram.ui.Cells.x5(context);
        x5Var.e = new Paint();
        x5Var.b = new MediaController.AlbumEntry[4];
        x5Var.a = new org.telegram.ui.Cells.v5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            x5Var.a[i11] = new org.telegram.ui.Cells.v5(x5Var, context);
            x5Var.addView(x5Var.a[i11]);
            x5Var.a[i11].setVisibility(4);
            x5Var.a[i11].setTag(Integer.valueOf(i11));
            x5Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(x5Var, 9));
        }
        x5Var.setDelegate(new vl0(this, 1));
        return new org.telegram.ui.Components.vk0(x5Var);
    }
}
