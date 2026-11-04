package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m3 extends View {
    public final /* synthetic */ n3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(n3 n3Var, Context context) {
        super(context);
        this.a = n3Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        n3 n3Var = this.a;
        Bitmap bitmap = n3Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        n3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(n3Var.H, (Rect) null, n3Var.E, n3Var.y);
    }
}
