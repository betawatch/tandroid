package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ jp0 d;

    public hp0(jp0 jp0Var, Context context) {
        this.d = jp0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        if (this.d.d != null) {
            return (int) Math.ceil(r1.size() / r0.f);
        }
        return 0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) o1Var.a;
        jp0 jp0Var = this.d;
        v5Var.setAlbumsCount(jp0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = jp0Var.f;
            if (i11 >= i12) {
                v5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < jp0Var.d.size()) {
                v5Var.a(i11, (MediaController.AlbumEntry) jp0Var.d.get(i13));
            } else {
                v5Var.a(i11, null);
            }
            i11++;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.v5 v5Var = new org.telegram.ui.Cells.v5(context);
        v5Var.e = new Paint();
        v5Var.b = new MediaController.AlbumEntry[4];
        v5Var.a = new org.telegram.ui.Cells.t5[4];
        for (int i11 = 0; i11 < 4; i11++) {
            v5Var.a[i11] = new org.telegram.ui.Cells.t5(v5Var, context);
            v5Var.addView(v5Var.a[i11]);
            v5Var.a[i11].setVisibility(4);
            v5Var.a[i11].setTag(Integer.valueOf(i11));
            v5Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(v5Var, 9));
        }
        v5Var.setDelegate(new dl0(this, 1));
        return new org.telegram.ui.Components.lk0(v5Var);
    }
}
