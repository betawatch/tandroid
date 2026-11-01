package fi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import v7.i7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class c extends i7 {
    public final RenderNode a = w.k();
    public final Paint b = new Paint(1);
    public final /* synthetic */ g c;

    public c(g gVar) {
        this.c = gVar;
    }

    @Override // v7.i7
    public final void a(Rect rect, RectF rectF) {
        g gVar = this.c;
        if (gVar.x || !this.a.hasDisplayList()) {
            int width = rect.width();
            int height = rect.height();
            int i10 = gVar.y;
            float f7 = (i10 == 1 || i10 == 4) ? height : width;
            h hVar = gVar.F;
            hVar.getClass();
            LinearGradient k10 = g.k(gVar, hVar, f7, 0, gVar.J, 1);
            Paint paint = this.b;
            paint.setShader(k10);
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording().drawRect(0.0f, 0.0f, width, height, paint);
            this.a.endRecording();
            paint.setShader(null);
            gVar.x = false;
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
