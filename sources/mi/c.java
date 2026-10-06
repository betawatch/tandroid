package mi;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import w7.z;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class c extends z {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // w7.z
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
        li.c cVar;
        float f14;
        int i14;
        Paint paint2;
        f fVar;
        f fVar2 = this.j;
        li.c cVar2 = fVar2.f;
        if (cVar2 != null) {
            li.d dVar = cVar2.b;
            if ((cVar2.a == 3 ? dVar.k : dVar.j) > 0) {
                i10 = 1;
                if (i10 == 0) {
                    li.d dVar2 = cVar2.b;
                    i11 = cVar2.a == 3 ? dVar2.k : dVar2.j;
                } else {
                    i11 = 1;
                }
                if (i10 == 0) {
                    float f15 = rectF.left;
                    li.d dVar3 = cVar2.b;
                    f7 = f.l(f15, cVar2.a == 3 ? dVar3.o : dVar3.m, i11) - (i10 * i11);
                } else {
                    f7 = rectF.left;
                }
                f10 = f7;
                if (i10 == 0) {
                    float f16 = rectF.top;
                    li.d dVar4 = cVar2.b;
                    f11 = f.l(f16, cVar2.a == 3 ? dVar4.p : dVar4.n, i11) - (i10 * i11);
                } else {
                    f11 = rectF.top;
                }
                float f17 = f10 - rectF.left;
                float f18 = f11 - rectF.top;
                f12 = i11;
                ceil = ((int) Math.ceil((rectF.right - f10) / f12)) + i10;
                ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f12)) + i10;
                i12 = i10;
                int ceil3 = (int) Math.ceil(rect.width() / f12);
                float f19 = f11;
                int ceil4 = (int) Math.ceil(rect.height() / f12);
                z10 = fVar2.j;
                paint = this.c;
                if (z10 && this.g == rect.width() && this.h == rect.height() && this.i == i11) {
                    cVar = cVar2;
                    i13 = ceil;
                    f13 = f12;
                    i14 = ceil2;
                    f14 = f10;
                    fVar = fVar2;
                    paint2 = paint;
                } else {
                    int i15 = fVar2.l;
                    float height = (i15 != 1 || i15 == 4) ? rect.height() : rect.width();
                    i13 = ceil;
                    g gVar = fVar2.m;
                    gVar.getClass();
                    float f20 = 0;
                    f13 = f12;
                    cVar = cVar2;
                    f14 = f10;
                    i14 = ceil2;
                    paint2 = paint;
                    LinearGradient m10 = f.m(fVar2, gVar, height, f20, -1, i11);
                    this.f = m10;
                    paint2.setShader(m10);
                    g gVar2 = fVar2.n;
                    gVar2.getClass();
                    LinearGradient m11 = f.m(fVar2, gVar2, height, f20, fVar2.q, i11);
                    fVar = fVar2;
                    this.b.setPosition(0, 0, ceil3, ceil4);
                    this.b.setPivotX(0.0f);
                    this.b.setPivotY(0.0f);
                    this.b.setScaleX(f13);
                    this.b.setScaleY(f13);
                    Paint paint3 = this.d;
                    paint3.setShader(m11);
                    this.b.beginRecording().drawRect(0.0f, 0.0f, ceil3, ceil4, paint3);
                    this.b.endRecording();
                    paint3.setShader(null);
                    this.g = rect.width();
                    this.h = rect.height();
                    this.i = i11;
                }
                Matrix matrix = this.e;
                matrix.setTranslate((-f17) / f13, (-f18) / f13);
                this.f.setLocalMatrix(matrix);
                this.a.setPosition(0, 0, i13, i14);
                this.a.setPivotX(0.0f);
                this.a.setPivotY(0.0f);
                this.a.setScaleX(f13);
                this.a.setScaleY(f13);
                this.a.setTranslationX(f17);
                this.a.setTranslationY(f18);
                RecordingCanvas beginRecording = this.a.beginRecording();
                float f21 = i13;
                float f22 = i14;
                beginRecording.saveLayer(0.0f, 0.0f, f21, f22, null);
                beginRecording.drawColor((fVar.q & 16777215) | (-16777216));
                if (i12 == 0) {
                    li.c cVar3 = cVar;
                    li.d.b(cVar3.b, cVar3.a, beginRecording, rectF, i11, f14, f19);
                } else {
                    beginRecording.save();
                    beginRecording.translate(-rectF.left, -rectF.top);
                    fVar.e.v(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
                    beginRecording.restore();
                }
                beginRecording.drawRect(0.0f, 0.0f, f21, f22, paint2);
                beginRecording.restore();
                this.a.endRecording();
                fVar.j = false;
            }
        }
        i10 = 0;
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        f10 = f7;
        if (i10 == 0) {
        }
        float f172 = f10 - rectF.left;
        float f182 = f11 - rectF.top;
        f12 = i11;
        ceil = ((int) Math.ceil((rectF.right - f10) / f12)) + i10;
        ceil2 = ((int) Math.ceil((rectF.bottom - f11) / f12)) + i10;
        i12 = i10;
        int ceil32 = (int) Math.ceil(rect.width() / f12);
        float f192 = f11;
        int ceil42 = (int) Math.ceil(rect.height() / f12);
        z10 = fVar2.j;
        paint = this.c;
        if (z10) {
        }
        int i152 = fVar2.l;
        float height2 = (i152 != 1 || i152 == 4) ? rect.height() : rect.width();
        i13 = ceil;
        g gVar3 = fVar2.m;
        gVar3.getClass();
        float f202 = 0;
        f13 = f12;
        cVar = cVar2;
        f14 = f10;
        i14 = ceil2;
        paint2 = paint;
        LinearGradient m102 = f.m(fVar2, gVar3, height2, f202, -1, i11);
        this.f = m102;
        paint2.setShader(m102);
        g gVar22 = fVar2.n;
        gVar22.getClass();
        LinearGradient m112 = f.m(fVar2, gVar22, height2, f202, fVar2.q, i11);
        fVar = fVar2;
        this.b.setPosition(0, 0, ceil32, ceil42);
        this.b.setPivotX(0.0f);
        this.b.setPivotY(0.0f);
        this.b.setScaleX(f13);
        this.b.setScaleY(f13);
        Paint paint32 = this.d;
        paint32.setShader(m112);
        this.b.beginRecording().drawRect(0.0f, 0.0f, ceil32, ceil42, paint32);
        this.b.endRecording();
        paint32.setShader(null);
        this.g = rect.width();
        this.h = rect.height();
        this.i = i11;
        Matrix matrix2 = this.e;
        matrix2.setTranslate((-f172) / f13, (-f182) / f13);
        this.f.setLocalMatrix(matrix2);
        this.a.setPosition(0, 0, i13, i14);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f13);
        this.a.setScaleY(f13);
        this.a.setTranslationX(f172);
        this.a.setTranslationY(f182);
        RecordingCanvas beginRecording2 = this.a.beginRecording();
        float f212 = i13;
        float f222 = i14;
        beginRecording2.saveLayer(0.0f, 0.0f, f212, f222, null);
        beginRecording2.drawColor((fVar.q & 16777215) | (-16777216));
        if (i12 == 0) {
        }
        beginRecording2.drawRect(0.0f, 0.0f, f212, f222, paint2);
        beginRecording2.restore();
        this.a.endRecording();
        fVar.j = false;
    }

    @Override // w7.z
    public final void b() {
        this.a.discardDisplayList();
        this.b.discardDisplayList();
        this.g = -1;
    }

    @Override // w7.z
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
        canvas.drawRenderNode(this.b);
    }

    @Override // w7.z
    public final boolean d() {
        return this.a.hasDisplayList() && this.b.hasDisplayList();
    }

    @Override // w7.z
    public final void e(float f7) {
        this.a.setAlpha(f7);
        this.b.setAlpha(f7);
    }
}
