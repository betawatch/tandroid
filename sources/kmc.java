// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class kmc extends qa6 {
    public final Paint M;
    public final /* synthetic */ mmc N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kmc(mmc mmcVar, ylb ylbVar) {
        super(ylbVar);
        this.N = mmcVar;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // qa6
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        mmc mmcVar = this.N;
        RectF rectF = mmcVar.f;
        if (mmcVar.o0 != null) {
            canvas.saveLayer(rectF, null);
            mmcVar.o0.c((gm.L(206.0f) - mmcVar.o0.j()) / 2.0f, (rectF.bottom - gm.L(7.0f)) - mmcVar.o0.h(), 1.0f, -1, canvas);
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
