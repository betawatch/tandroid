package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gp0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ ip0 d;

    public gp0(ip0 ip0Var, Context context) {
        this.d = ip0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) q1Var.a;
        ip0 ip0Var = this.d;
        y5Var.setAlbumsCount(ip0Var.f);
        int i10 = 0;
        while (true) {
            int i11 = ip0Var.f;
            if (i10 >= i11) {
                y5Var.requestLayout();
                return;
            }
            int i12 = (i11 * i9) + i10;
            if (i12 < ip0Var.d.size()) {
                y5Var.a(i10, (MediaController.AlbumEntry) ip0Var.d.get(i12));
            } else {
                y5Var.a(i10, null);
            }
            i10++;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context);
        y5Var.e = new Paint();
        y5Var.b = new MediaController.AlbumEntry[4];
        y5Var.a = new org.telegram.ui.Cells.w5[4];
        for (int i10 = 0; i10 < 4; i10++) {
            y5Var.a[i10] = new org.telegram.ui.Cells.w5(y5Var, context);
            y5Var.addView(y5Var.a[i10]);
            y5Var.a[i10].setVisibility(4);
            y5Var.a[i10].setTag(Integer.valueOf(i10));
            y5Var.a[i10].setOnClickListener(new org.telegram.ui.Cells.a(y5Var, 9));
        }
        y5Var.setDelegate(new dl0(this, 1));
        return new org.telegram.ui.Components.ik0(y5Var);
    }
}
