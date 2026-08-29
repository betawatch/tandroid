package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fp0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ hp0 d;

    public fp0(hp0 hp0Var, Context context) {
        this.d = hp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Cells.w5 w5Var = (org.telegram.ui.Cells.w5) n1Var.a;
        hp0 hp0Var = this.d;
        w5Var.setAlbumsCount(hp0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = hp0Var.f;
            if (i11 >= i12) {
                w5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < hp0Var.d.size()) {
                w5Var.a(i11, (MediaController.AlbumEntry) hp0Var.d.get(i13));
            } else {
                w5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.w5 w5Var = new org.telegram.ui.Cells.w5(context);
        w5Var.e = new Paint();
        w5Var.b = new MediaController.AlbumEntry[4];
        w5Var.a = new org.telegram.ui.Cells.u5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            w5Var.a[i11] = new org.telegram.ui.Cells.u5(w5Var, context);
            w5Var.addView(w5Var.a[i11]);
            w5Var.a[i11].setVisibility(4);
            w5Var.a[i11].setTag(Integer.valueOf(i11));
            w5Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(w5Var, 9));
        }
        w5Var.setDelegate(new zk0(this, 1));
        return new org.telegram.ui.Components.vk0(w5Var);
    }
}
