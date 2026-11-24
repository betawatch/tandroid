// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ju8 extends View {
    public final /* synthetic */ ku8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju8(ku8 ku8Var, Context context) {
        super(context);
        this.a = ku8Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ku8 ku8Var = this.a;
        RectF rectF = ku8Var.E;
        Bitmap bitmap = ku8Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(ku8Var.H, (Rect) null, rectF, ku8Var.y);
    }
}
