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
import c3.i0;
import v7.i7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c extends i7 {
    public final RenderNode a = new RenderNode("glass-fade-content");
    public final RenderNode b = new RenderNode("glass-fade-overlay");
    public final Paint c;
    public final Paint d;
    public final Matrix e;
    public LinearGradient f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ f j;

    public c(f fVar) {
        BlendMode blendMode;
        this.j = fVar;
        Paint paint = new Paint();
        this.c = paint;
        this.d = new Paint(1);
        this.e = new Matrix();
        this.g = -1;
        this.h = -1;
        blendMode = BlendMode.DST_IN;
        paint.setBlendMode(blendMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // v7.i7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        int ceil;
        int ceil2;
        int i12;
        boolean z10;
        Paint paint;
        int i13;
        float f13;
        ei.d dVar;
        int i14;
        float f14;
        Paint paint2;
        f fVar;
        f fVar2 = this.j;
        ei.d dVar2 = fVar2.h;
        if (dVar2 != null) {
            ei.e eVar = dVar2.b;
            if ((i0.b(dVar2.a) ? eVar.n : eVar.m) > 0) {
                i10 = 1;
                if (i10 == 0) {
                    ei.e eVar2 = dVar2.b;
                    i11 = i0.b(dVar2.a) ? eVar2.n : eVar2.m;
                } else {
                    i11 = 1;
                }
                if (i10 == 0) {
                    float f15 = rectF.left;
                    ei.e eVar3 = dVar2.b;
                    f7 = f.k(f15, i0.b(dVar2.a) ? eVar3.r : eVar3.p, i11) - (i10 * i11);
                } else {
                    f7 = rectF.left;
                }
                float f16 = f7;
                if (i10 == 0) {
                    float f17 = rectF.top;
                    ei.e eVar4 = dVar2.b;
                    f10 = f.k(f17, i0.b(dVar2.a) ? eVar4.s : eVar4.q, i11) - (i10 * i11);
                } else {
                    f10 = rectF.top;
                }
                f11 = f10;
                float f18 = f16 - rectF.left;
                float f19 = f11 - rectF.top;
                f12 = i11;
                ceil = ((int) Math.ceil((rectF.right - f16) / f12)) + i10;
                ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f12)) + i10;
                int ceil3 = (int) Math.ceil(rect.width() / f12);
                i12 = i10;
                int ceil4 = (int) Math.ceil(rect.height() / f12);
                z10 = fVar2.w;
                paint = this.c;
                if (z10 && this.g == rect.width() && this.h == rect.height() && this.i == i11) {
                    dVar = dVar2;
                    i13 = ceil;
                    f13 = f12;
                    i14 = ceil2;
                    f14 = f11;
                    fVar = fVar2;
                    paint2 = paint;
                } else {
                    int i15 = fVar2.y;
                    float height = (i15 != 1 || i15 == 4) ? rect.height() : rect.width();
                    i13 = ceil;
                    g gVar = fVar2.D;
                    gVar.getClass();
                    float f20 = 0;
                    f13 = f12;
                    dVar = dVar2;
                    i14 = ceil2;
                    f14 = f11;
                    paint2 = paint;
                    LinearGradient l4 = f.l(fVar2, gVar, height, f20, -1, i11);
                    this.f = l4;
                    paint2.setShader(l4);
                    g gVar2 = fVar2.E;
                    gVar2.getClass();
                    LinearGradient l10 = f.l(fVar2, gVar2, height, f20, fVar2.H, i11);
                    fVar = fVar2;
                    this.b.setPosition(0, 0, ceil3, ceil4);
                    this.b.setPivotX(0.0f);
                    this.b.setPivotY(0.0f);
                    this.b.setScaleX(f13);
                    this.b.setScaleY(f13);
                    Paint paint3 = this.d;
                    paint3.setShader(l10);
                    this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint3);
                    this.b.endRecording();
                    paint3.setShader(null);
                    this.g = rect.width();
                    this.h = rect.height();
                    this.i = i11;
                }
                Matrix matrix = this.e;
                matrix.setTranslate((-f18) / f13, (-f19) / f13);
                this.f.setLocalMatrix(matrix);
                this.a.setPosition(0, 0, i13, i14);
                this.a.setPivotX(0.0f);
                this.a.setPivotY(0.0f);
                this.a.setScaleX(f13);
                this.a.setScaleY(f13);
                this.a.setTranslationX(f18);
                this.a.setTranslationY(f19);
                RecordingCanvas beginRecording = this.a.beginRecording();
                float f21 = i13;
                float f22 = i14;
                beginRecording.saveLayer(0.0f, 0.0f, f21, f22, null);
                beginRecording.drawColor((fVar.H & 16777215) | (-16777216));
                if (i12 == 0) {
                    ei.d dVar3 = dVar;
                    ei.e.b(dVar3.b, dVar3.a, beginRecording, rectF, i11, f16, f14);
                } else {
                    beginRecording.save();
                    beginRecording.translate(-rectF.left, -rectF.top);
                    fVar.f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
                    beginRecording.restore();
                }
                beginRecording.drawRect(0.0f, 0.0f, f21, f22, paint2);
                beginRecording.restore();
                this.a.endRecording();
                fVar.w = false;
            }
        }
        i10 = 0;
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        float f162 = f7;
        if (i10 == 0) {
        }
        f11 = f10;
        float f182 = f162 - rectF.left;
        float f192 = f11 - rectF.top;
        f12 = i11;
        ceil = ((int) Math.ceil((rectF.right - f162) / f12)) + i10;
        ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f12)) + i10;
        int ceil32 = (int) Math.ceil(rect.width() / f12);
        i12 = i10;
        int ceil42 = (int) Math.ceil(rect.height() / f12);
        z10 = fVar2.w;
        paint = this.c;
        if (z10) {
        }
        int i152 = fVar2.y;
        float height2 = (i152 != 1 || i152 == 4) ? rect.height() : rect.width();
        i13 = ceil;
        g gVar3 = fVar2.D;
        gVar3.getClass();
        float f202 = 0;
        f13 = f12;
        dVar = dVar2;
        i14 = ceil2;
        f14 = f11;
        paint2 = paint;
        LinearGradient l42 = f.l(fVar2, gVar3, height2, f202, -1, i11);
        this.f = l42;
        paint2.setShader(l42);
        g gVar22 = fVar2.E;
        gVar22.getClass();
        LinearGradient l102 = f.l(fVar2, gVar22, height2, f202, fVar2.H, i11);
        fVar = fVar2;
        this.b.setPosition(0, 0, ceil32, ceil42);
        this.b.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
        this.b.setScaleX(f13);
        this.b.setScaleY(f13);
        Paint paint32 = this.d;
        paint32.setShader(l102);
        this.b.beginRecording().drawRect(0.0f, 0.0f, ceil32, ceil42, paint32);
        this.b.endRecording();
        paint32.setShader(null);
        this.g = rect.width();
        this.h = rect.height();
        this.i = i11;
        Matrix matrix2 = this.e;
        matrix2.setTranslate((-f182) / f13, (-f192) / f13);
        this.f.setLocalMatrix(matrix2);
        this.a.setPosition(0, 0, i13, i14);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f13);
        this.a.setScaleY(f13);
        this.a.setTranslationX(f182);
        this.a.setTranslationY(f192);
        RecordingCanvas beginRecording2 = this.a.beginRecording();
        float f212 = i13;
        float f222 = i14;
        beginRecording2.saveLayer(0.0f, 0.0f, f212, f222, null);
        beginRecording2.drawColor((fVar.H & 16777215) | (-16777216));
        if (i12 == 0) {
        }
        beginRecording2.drawRect(0.0f, 0.0f, f212, f222, paint2);
        beginRecording2.restore();
        this.a.endRecording();
        fVar.w = false;
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
