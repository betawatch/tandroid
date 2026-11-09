package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n2 extends View {
    public final /* synthetic */ o2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, Context context) {
        super(context);
        this.a = o2Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float i7;
        o2 o2Var = this.a;
        if (o2Var.e == null) {
            return;
        }
        int b10 = o2Var.c.b();
        int L = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(6.0f, b10 - 1, org.telegram.messenger.g0.L(7.0f) * b10);
        float f10 = o2Var.x + o2Var.w;
        if (L < getMeasuredWidth()) {
            i7 = (getMeasuredWidth() - L) / 2.0f;
        } else {
            float L2 = org.telegram.messenger.g0.L(4.0f);
            int L3 = org.telegram.messenger.g0.L(13.0f);
            i7 = L2 - (Utilities.i(f10 - (((getMeasuredWidth() - org.telegram.messenger.g0.L(8.0f)) / 2) / L3), Math.max(0, (b10 - (r10 * 2)) - 1), 0.0f) * L3);
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        for (int i10 = 0; i10 < o2Var.e.items.size(); i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f10));
            g4.C1.setAlpha((int) ((max * 95.0f) + 160.0f));
            canvas.drawCircle(org.telegram.messenger.g0.L(4.0f) + i7 + (org.telegram.messenger.g0.L(13.0f) * i10), getMeasuredHeight() / 2.0f, (org.telegram.messenger.g0.L(1.0f) * max) + org.telegram.messenger.g0.L(2.0f), g4.C1);
        }
        canvas.restore();
    }
}
