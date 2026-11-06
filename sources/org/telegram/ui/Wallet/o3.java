package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class o3 extends View {
    public final /* synthetic */ p3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(p3 p3Var, Context context) {
        super(context);
        this.a = p3Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        p3 p3Var = this.a;
        Bitmap bitmap = p3Var.G;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        p3Var.D.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(p3Var.G, (Rect) null, p3Var.D, p3Var.y);
    }
}
