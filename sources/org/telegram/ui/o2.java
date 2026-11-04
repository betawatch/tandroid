package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o2 extends View {
    public final /* synthetic */ p2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, Context context) {
        super(context);
        this.a = p2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float i3;
        p2 p2Var = this.a;
        if (p2Var.e == null) {
            return;
        }
        int b10 = p2Var.c.b();
        int L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, b10 - 1, org.telegram.messenger.g0.L(7.0f) * b10);
        float f10 = p2Var.x + p2Var.w;
        if (L < getMeasuredWidth()) {
            i3 = (getMeasuredWidth() - L) / 2.0f;
        } else {
            float L2 = org.telegram.messenger.g0.L(4.0f);
            int L3 = org.telegram.messenger.g0.L(13.0f);
            i3 = L2 - (Utilities.i(f10 - (((getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) / 2) / L3), Math.max(0, (b10 - (r10 * 2)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < p2Var.e.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            i4.D1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(4.0f) + i3 + (org.telegram.messenger.g0.L(13.0f) * i10), getMeasuredHeight() / 2.0f, (org.telegram.messenger.g0.L(1.0f) * max) + org.telegram.messenger.g0.L(2.0f), i4.D1);
        }
        canvas.restore();
    }
}
