package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class hu extends zt {
    public final Paint X;

    public hu(ev evVar, Rect rect, int i7) {
        super(evVar, rect, i7);
        this.X = new Paint(1);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return g0.L(12.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final int K() {
        return g0.L(32.0f);
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        ev evVar = this.a;
        int i7 = evVar.C;
        int i10 = evVar.S;
        int i11 = i7 + i10 + evVar.T;
        Rect rect = this.b;
        int i12 = rect.left;
        int i13 = ((i11 - i12) - rect.right) / 2;
        float f10 = (((r1 - i13) / 2.0f) - i10) + i12;
        float L = (g0.L(12.0f) - g0.L(1.0f)) / 2.0f;
        int w02 = org.telegram.ui.ActionBar.n6.w0(evVar.E() ? org.telegram.ui.ActionBar.n6.nl : org.telegram.ui.ActionBar.n6.ml, evVar.D);
        Paint paint = this.X;
        paint.setColor(w02);
        RectF rectF = g0.P;
        rectF.set(f10, L, i13 + f10, g0.L(1.0f) + L);
        canvas.drawRoundRect(rectF, g0.L(0.5f), g0.L(0.5f), paint);
    }
}
