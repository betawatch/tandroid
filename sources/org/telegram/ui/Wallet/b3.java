package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class b3 extends ia0 {
    public final Paint M;
    public final /* synthetic */ d3 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var);
        this.N = d3Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.ia0
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        d3 d3Var = this.N;
        RectF rectF = d3Var.f;
        if (d3Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            d3Var.o0.c((AndroidUtilities.dp(206.0f) - d3Var.o0.l()) / 2.0f, (rectF.bottom - AndroidUtilities.dp(7.0f)) - d3Var.o0.j(), 1.0f, -1, canvas);
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
