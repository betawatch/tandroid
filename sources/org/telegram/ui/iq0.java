package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ kq0 d;

    public iq0(kq0 kq0Var, Context context) {
        this.d = kq0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
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
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.a;
        kq0 kq0Var = this.d;
        z5Var.setAlbumsCount(kq0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = kq0Var.f;
            if (i11 >= i12) {
                z5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < kq0Var.d.size()) {
                z5Var.a(i11, (MediaController.AlbumEntry) kq0Var.d.get(i13));
            } else {
                z5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
        z5Var.e = new Paint();
        z5Var.b = new MediaController.AlbumEntry[4];
        z5Var.a = new org.telegram.ui.Cells.x5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            z5Var.a[i11] = new org.telegram.ui.Cells.x5(z5Var, context);
            z5Var.addView(z5Var.a[i11]);
            z5Var.a[i11].setVisibility(4);
            z5Var.a[i11].setTag(Integer.valueOf(i11));
            z5Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(z5Var, 9));
        }
        z5Var.setDelegate(new ul0(this, 1));
        return new org.telegram.ui.Components.fl0(z5Var);
    }
}
