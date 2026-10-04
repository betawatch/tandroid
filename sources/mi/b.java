package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import w7.z;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class b extends z {
    public final RenderNode a = ah.f.n();
    public final Paint b = new Paint(1);
    public final /* synthetic */ f c;

    public b(f fVar) {
        this.c = fVar;
    }

    @Override // w7.z
    public final void a(Rect rect, RectF rectF) {
        f fVar = this.c;
        if (fVar.k || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i10 = fVar.l;
            float f7 = (i10 == 1 || i10 == 4) ? height : width;
            g gVar = fVar.o;
            gVar.getClass();
            LinearGradient m10 = f.m(fVar, gVar, f7, 0, fVar.s, 1);
            Paint paint = this.b;
            paint.setShader(m10);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            fVar.k = false;
        }
    }

    @Override // w7.z
    public final void b() {
        this.a.discardDisplayList();
    }

    @Override // w7.z
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // w7.z
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // w7.z
    public final void e(float f7) {
        this.a.setAlpha(f7);
    }
}
