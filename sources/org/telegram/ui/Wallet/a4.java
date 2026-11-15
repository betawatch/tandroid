package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.d80;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class a4 extends d80 {
    public final Paint M;
    public final /* synthetic */ c4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(c4 c4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var);
        this.N = c4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.d80
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        c4 c4Var = this.N;
        RectF rectF = c4Var.f;
        if (c4Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            c4Var.o0.c((org.telegram.messenger.g0.L(206.0f) - c4Var.o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - c4Var.o0.i(), 1.0f, -1, canvas);
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
