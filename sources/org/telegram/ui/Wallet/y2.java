package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class y2 extends View {
    public final /* synthetic */ z2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z2 z2Var, Context context) {
        super(context);
        this.a = z2Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        z2 z2Var = this.a;
        Bitmap bitmap = z2Var.G;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        z2Var.y.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(z2Var.G, (Rect) null, z2Var.y, z2Var.x);
    }
}
