package fi;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import v7.i7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class d extends i7 {
    public final RenderNode a = new RenderNode("glass-fade-content");
    public final RenderNode b = new RenderNode("glass-fade-overlay");
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ g j;

    public d(g gVar) {
        BlendMode blendMode;
        this.j = gVar;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    @Override // v7.i7
    public final void a(Rect rect, RectF rectF) {
        float f7;
        float f10;
        int i10;
        int i11;
        int i12;
        g gVar = this.j;
        a aVar = gVar.h;
        int i13 = (aVar == null || !aVar.h() || aVar.f() <= 0) ? 0 : 1;
        int f11 = i13 != 0 ? aVar.f() : 1;
        float l4 = i13 != 0 ? g.l(rectF.left, aVar.g(), f11) - (i13 * f11) : rectF.left;
        float l10 = i13 != 0 ? g.l(rectF.top, aVar.a(), f11) - (i13 * f11) : rectF.top;
        float f12 = l4 - rectF.left;
        float f13 = l10 - rectF.top;
        float f14 = f11;
        int ceil = ((int) Math.ceil((rectF.right - l4) / f14)) + i13;
        int ceil2 = ((int) Math.ceil((rectF.bottom - l10) / f14)) + i13;
        int ceil3 = (int) Math.ceil(rect.width() / f14);
        int ceil4 = (int) Math.ceil(rect.height() / f14);
        boolean z10 = gVar.w;
        Paint paint = this.c;
        if (!z10 && this.g == rect.width() && this.h == rect.height() && this.i == f11) {
            f10 = l10;
            i12 = i13;
            f7 = l4;
            i11 = ceil;
            i10 = ceil2;
        } else {
            int i14 = gVar.y;
            float height = (i14 == 1 || i14 == 4) ? rect.height() : rect.width();
            h hVar = gVar.D;
            hVar.getClass();
            float f15 = 0;
            f7 = l4;
            f10 = l10;
            i10 = ceil2;
            i11 = ceil;
            i12 = i13;
            LinearGradient k10 = g.k(gVar, hVar, height, f15, -1, f11);
            this.f = k10;
            paint.setShader(k10);
            h hVar2 = gVar.E;
            hVar2.getClass();
            LinearGradient k11 = g.k(gVar, hVar2, height, f15, gVar.H, f11);
            this.b.setPosition(0, 0, ceil3, ceil4);
            this.b.setPivotX(0.0f);
            this.b.setPivotY(0.0f);
            this.b.setScaleX(f14);
            this.b.setScaleY(f14);
            Paint paint2 = this.d;
            paint2.setShader(k11);
            this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint2);
            this.b.endRecording();
            paint2.setShader(null);
            this.g = rect.width();
            this.h = rect.height();
            this.i = f11;
        }
        Matrix matrix = this.e;
        matrix.setTranslate((-f12) / f14, (-f13) / f14);
        this.f.setLocalMatrix(matrix);
        this.a.setPosition(0, 0, i11, i10);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f14);
        this.a.setScaleY(f14);
        this.a.setTranslationX(f12);
        this.a.setTranslationY(f13);
        RecordingCanvas beginRecording = this.a.beginRecording();
        float f16 = i11;
        float f17 = i10;
        beginRecording.saveLayer(0.0f, 0.0f, f16, f17, null);
        beginRecording.drawColor((gVar.H & 16777215) | (-16777216));
        if (i12 != 0) {
            gVar.h.d(f7, f10, f11, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            gVar.f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        beginRecording.drawRect(0.0f, 0.0f, f16, f17, paint);
        beginRecording.restore();
        this.a.endRecording();
        gVar.w = false;
    }

    @Override // v7.i7
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override // v7.i7
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override // v7.i7
    public final boolean d() {
        return this.a.hasDisplayList() && this.b.hasDisplayList();
    }

    @Override // v7.i7
    public final void e(float f7) {
        this.a.setAlpha(f7);
        this.b.setAlpha(f7);
    }
}
