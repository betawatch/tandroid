package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v3 extends View {
    public final /* synthetic */ w3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(w3 w3Var, Context context) {
        super(context);
        this.a = w3Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        w3 w3Var = this.a;
        Bitmap bitmap = w3Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        w3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(w3Var.H, (Rect) null, w3Var.E, w3Var.y);
    }
}
