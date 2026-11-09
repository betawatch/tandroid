package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
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
        Bitmap bitmap = n3Var.G;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        n3Var.D.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(n3Var.G, (Rect) null, n3Var.D, n3Var.y);
    }
}
