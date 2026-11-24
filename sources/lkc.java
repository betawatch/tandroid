// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class lkc extends r86 {
    public final Paint M;
    public final /* synthetic */ nkc N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkc(nkc nkcVar, wjb wjbVar) {
        super(wjbVar);
        this.N = nkcVar;
        Paint paint = new Paint(1);
        this.M = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    @Override // r86
    public final void b(Canvas canvas, Path path) {
        super.b(canvas, path);
        nkc nkcVar = this.N;
        RectF rectF = nkcVar.f;
        if (nkcVar.o0 != null) {
            canvas.saveLayer(rectF, null);
            nkcVar.o0.c((gl.L(206.0f) - nkcVar.o0.j()) / 2.0f, (rectF.bottom - gl.L(7.0f)) - nkcVar.o0.h(), 1.0f, -1, canvas);
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
