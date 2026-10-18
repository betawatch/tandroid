package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ba0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class j3 extends ba0 {
    public final Paint M;
    public final /* synthetic */ l3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l3 l3Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var);
        this.N = l3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.ba0
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        l3 l3Var = this.N;
        RectF rectF = l3Var.f;
        if (l3Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            l3Var.o0.c((AndroidUtilities.dp(206.0f) - l3Var.o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - l3Var.o0.j(), 1.0f, -1, canvas);
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
