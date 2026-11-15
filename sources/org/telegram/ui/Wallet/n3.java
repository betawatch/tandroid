package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
