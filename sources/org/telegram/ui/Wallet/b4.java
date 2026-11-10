package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.a80;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class b4 extends a80 {
    public final Paint M;
    public final /* synthetic */ d4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(d4 d4Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var);
        this.N = d4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.a80
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d4 d4Var = this.N;
        RectF rectF = d4Var.f;
        if (d4Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            d4Var.o0.c((org.telegram.messenger.g0.L(206.0f) - d4Var.o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - d4Var.o0.i(), 1.0f, -1, canvas);
            Shader shader = this.x.getShader();
            Paint paint = this.M;
            paint.setShader(shader);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        this.N.a.invalidate();
    }
}
