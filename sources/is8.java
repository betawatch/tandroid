// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class is8 extends View {
    public final /* synthetic */ js8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is8(js8 js8Var, Context context) {
        super(context);
        this.a = js8Var;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        js8 js8Var = this.a;
        RectF rectF = js8Var.E;
        Bitmap bitmap = js8Var.H;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawBitmap(js8Var.H, (Rect) null, rectF, js8Var.y);
    }
}
