package fi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import v7.i7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class b extends i7 {
    public final RenderNode a = w.k();
    public final Paint b = new Paint(1);
    public final /* synthetic */ f c;

    public b(f fVar) {
        this.c = fVar;
    }

    @Override // v7.i7
    public final void a(Rect rect, RectF rectF) {
        f fVar = this.c;
        if (fVar.x || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i10 = fVar.y;
            float f7 = (i10 == 1 || i10 == 4) ? height : width;
            g gVar = fVar.F;
            gVar.getClass();
            LinearGradient l4 = f.l(fVar, gVar, f7, 0, fVar.J, 1);
            Paint paint = this.b;
            paint.setShader(l4);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            fVar.x = false;
        }
    }

    @Override // v7.i7
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // v7.i7
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // v7.i7
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // v7.i7
    public final void e(float f7) {
        this.a.setAlpha(f7);
    }
}
