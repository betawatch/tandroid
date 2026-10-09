package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ kq0 d;

    public iq0(kq0 kq0Var, Context context) {
        this.d = kq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override // s4.i0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) d1Var.a;
        kq0 kq0Var = this.d;
        y5Var.setAlbumsCount(kq0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = kq0Var.f;
            if (i11 >= i12) {
                y5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < kq0Var.d.size()) {
                y5Var.a(i11, (MediaController.AlbumEntry) kq0Var.d.get(i13));
            } else {
                y5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
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
        y5Var.setDelegate(new hq0(this, 0));
        return new org.telegram.ui.Components.am0(y5Var);
    }
}
