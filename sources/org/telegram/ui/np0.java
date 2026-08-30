package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ pp0 d;

    public np0(pp0 pp0Var, Context context) {
        this.d = pp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) l1Var.a;
        pp0 pp0Var = this.d;
        y5Var.setAlbumsCount(pp0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = pp0Var.f;
            if (i11 >= i12) {
                y5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < pp0Var.d.size()) {
                y5Var.a(i11, (MediaController.AlbumEntry) pp0Var.d.get(i13));
            } else {
                y5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
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
        y5Var.setDelegate(new il0(this, 1));
        return new org.telegram.ui.Components.el0(y5Var);
    }
}
