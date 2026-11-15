package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        Bitmap bitmap = o3Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        o3Var.E.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(o3Var.H, (Rect) null, o3Var.E, o3Var.y);
    }
}
