package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class w3 extends View {
    public final /* synthetic */ x3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x3 x3Var, Context context) {
        super(context);
        this.a = x3Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        x3 x3Var = this.a;
        Bitmap bitmap = x3Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        x3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(x3Var.H, (Rect) null, x3Var.E, x3Var.y);
    }
}
