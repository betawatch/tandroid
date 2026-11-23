package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import org.telegram.ui.Components.n80;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l4 extends n80 {
    public final Paint M;
    public final /* synthetic */ n4 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(n4 n4Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i6Var);
        this.N = n4Var;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // org.telegram.ui.Components.n80
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        n4 n4Var = this.N;
        RectF rectF = n4Var.f;
        if (n4Var.o0 != null) {
            canvas.saveLayer(rectF, null);
            n4Var.o0.c((org.telegram.messenger.g0.L(206.0f) - n4Var.o0.k()) / 2.0f, (rectF.bottom - org.telegram.messenger.g0.L(7.0f)) - n4Var.o0.i(), 1.0f, -1, canvas);
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
