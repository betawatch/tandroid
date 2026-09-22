package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.view.ViewGroup;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hq0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ jq0 d;

    public hq0(jq0 jq0Var, Context context) {
        this.d = jq0Var;
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
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) c1Var.a;
        jq0 jq0Var = this.d;
        y5Var.setAlbumsCount(jq0Var.f);
        int i11 = 0;
        while (true) {
            int i12 = jq0Var.f;
            if (i11 >= i12) {
                y5Var.requestLayout();
                return;
            }
            int i13 = (i12 * i10) + i11;
            if (i13 < jq0Var.d.size()) {
                y5Var.a(i11, (MediaController.AlbumEntry) jq0Var.d.get(i13));
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
        y5Var.setDelegate(new tl0(this, 1));
        return new org.telegram.ui.Components.vk0(y5Var);
    }
}
