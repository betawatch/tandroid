package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class x2 extends View {
    public final /* synthetic */ y2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y2 y2Var, Context context) {
        super(context);
        this.a = y2Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        y2 y2Var = this.a;
        Bitmap bitmap = y2Var.G;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        y2Var.y.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(y2Var.G, (Rect) null, y2Var.y, y2Var.x);
    }
}
