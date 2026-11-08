package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class n3 extends View {
    public final /* synthetic */ o3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(o3 o3Var, Context context) {
        super(context);
        this.a = o3Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o3 o3Var = this.a;
        Bitmap bitmap = o3Var.G;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        o3Var.D.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(o3Var.G, (Rect) null, o3Var.D, o3Var.y);
    }
}
