package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class nu extends fu {
    public final Paint W;

    public nu(kv kvVar, Rect rect, int i7) {
        super(kvVar, rect, i7);
        this.W = new Paint(1);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return g0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        return g0.L(32.0f);
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        kv kvVar = this.a;
        int i7 = kvVar.C;
        int i10 = kvVar.S;
        int i11 = i7 + i10 + kvVar.T;
        Rect rect = this.b;
        int i12 = rect.left;
        int i13 = ((i11 - i12) - rect.right) / 2;
        float f10 = (((r1 - i13) / 2.0f) - i10) + i12;
        float L = (g0.L(12.0f) - g0.L(1.0f)) / 2.0f;
        int w02 = org.telegram.ui.ActionBar.k6.w0(kvVar.E() ? org.telegram.ui.ActionBar.k6.kl : org.telegram.ui.ActionBar.k6.jl, kvVar.D);
        Paint paint = this.W;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(f10, L, i13 + f10, g0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, g0.L(0.5f), g0.L(0.5f), paint);
    }
}
