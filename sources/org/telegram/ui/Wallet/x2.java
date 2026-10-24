package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
