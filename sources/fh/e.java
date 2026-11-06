package fh;

import a8.aa;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e extends aa {
    public final float a = g0.N(0.55f);
    public final Outline b = new Outline();
    public final Rect c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f;
    public dh.h g;
    public boolean h;
    public boolean i;
    public final RectF j;
    public final /* synthetic */ g k;

    public e(g gVar) {
        this.k = gVar;
        RenderNode renderNode = new RenderNode("BlurredNode");
        this.d = renderNode;
        this.e = new RenderNode("BlurredFill");
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = true;
        this.i = true;
        this.j = new RectF();
        renderNode.setClipToOutline(true);
        renderNode.setClipToBounds(true);
        paint.setColor(0);
    }

    @Override // a8.aa
    public final void a() {
        this.d.discardDisplayList();
        this.e.discardDisplayList();
        this.h = true;
    }

    @Override // a8.aa
    public final void b(Canvas canvas, ri.a aVar) {
        g gVar = this.k;
        f fVar = gVar.Q;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int r12 = k6.r1(this.d.getAlpha() * gVar.V, gVar.x);
        int alpha = Color.alpha(r12);
        Paint paint = this.f;
        if (alpha != 0) {
            paint.setShadowLayer(gVar.T, 0.0f, gVar.U, r12);
            fVar.d(canvas, paint, gVar.S);
        }
        int r13 = k6.r1(this.d.getAlpha() * gVar.V, gVar.F);
        if (Color.alpha(r13) != 0) {
            paint.setShadowLayer(this.a, 0.0f, 0.0f, r13);
            fVar.d(canvas, paint, gVar.S);
        }
        Rect rect = fVar.m;
        canvas.save();
        if (fVar.e()) {
            canvas.clipPath(fVar.k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        f fVar = this.k.Q;
        Rect rect = fVar.m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.c;
        boolean z9 = false;
        rect2.set(0, 0, width, height);
        float[] fArr = fVar.b;
        Outline outline = this.b;
        g.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (rect.isEmpty()) {
            return;
        }
        this.e.setPosition(0, 0, rect.width(), rect.height());
        this.d.setPosition(0, 0, rect.width(), rect.height());
        this.d.setOutline(outline);
        RenderNode renderNode = this.d;
        if (this.i && !fVar.e()) {
            z9 = true;
        }
        renderNode.setClipToOutline(z9);
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i7;
        g gVar;
        int i10;
        float f10;
        float f11;
        float f12;
        int i11;
        g gVar2;
        int i12;
        int i13;
        float f13;
        this.h = false;
        g gVar3 = this.k;
        f fVar = gVar3.Q;
        Rect rect = fVar.m;
        float f14 = rect.left;
        float f15 = gVar3.d;
        float f16 = f14 + f15;
        float f17 = rect.top;
        float f18 = gVar3.e;
        float f19 = f17 + f18;
        float f20 = rect.right + f15;
        float f21 = rect.bottom + f18;
        if (this.g != null && Build.VERSION.SDK_INT >= 33) {
            ri.a aVar = gVar3.r;
            if (aVar instanceof pi.a) {
                pi.a aVar2 = (pi.a) aVar;
                if (aVar2.h()) {
                    i7 = Math.max(aVar2.f(), 1);
                    if (i7 <= 1) {
                        pi.a aVar3 = (pi.a) gVar3.r;
                        float f22 = i7;
                        float l10 = pi.f.l(f16, aVar3.g(), i7) - f22;
                        f11 = pi.f.l(f19, aVar3.a(), i7) - f22;
                        i10 = 1;
                        gVar = gVar3;
                        this.e.setPosition(0, 0, ((int) Math.ceil((f20 - l10) / f22)) + 1, ((int) Math.ceil((f21 - f11) / f22)) + 1);
                        f10 = l10;
                    } else {
                        gVar = gVar3;
                        i10 = 1;
                        this.e.setPosition(0, 0, rect.width(), rect.height());
                        f10 = f16;
                        f11 = f19;
                    }
                    this.e.setPivotX(0.0f);
                    this.e.setPivotY(0.0f);
                    float f23 = i7;
                    this.e.setScaleX(f23);
                    this.e.setScaleY(f23);
                    float f24 = f10 - f16;
                    this.e.setTranslationX(f24);
                    float f25 = f11 - f19;
                    this.e.setTranslationY(f25);
                    if (this.g != null || Build.VERSION.SDK_INT < 33) {
                        f12 = f10;
                        i11 = i7;
                        gVar2 = gVar;
                    } else {
                        RectF rectF = fVar.s;
                        int i14 = fVar.f;
                        if (i14 <= 0) {
                            i14 = g0.L(11.0f);
                        }
                        int max = Math.max(Math.min(i14, (int) (Math.min(rectF.width(), rectF.height()) / 5.0f)), i10);
                        if (fVar.e()) {
                            float f26 = fVar.u;
                            f12 = f10;
                            i12 = i7;
                            float max2 = Math.max(f26, Math.min(max + f26 + 1.0f, Math.min(fVar.v, fVar.w)));
                            dh.h hVar = this.g;
                            RectF rectF2 = fVar.s;
                            int i15 = fVar.n;
                            float centerX = (i15 != 0 ? i15 != 1 ? i15 != 2 ? rectF2.right - fVar.t : rectF2.right : rectF2.left + fVar.t : rectF2.left) - rectF.centerX();
                            RectF rectF3 = fVar.s;
                            int i16 = fVar.n;
                            float centerY = (i16 != 1 ? i16 != 2 ? i16 != 3 ? rectF3.bottom - fVar.t : rectF3.bottom : rectF3.top + fVar.t : rectF3.top) - rectF.centerY();
                            int i17 = fVar.n;
                            if (i17 == 0) {
                                f13 = -1.0f;
                            } else if (i17 == 2) {
                                f13 = 1.0f;
                            } else {
                                i13 = 1;
                                f13 = 0.0f;
                                float f27 = i17 != i13 ? -1.0f : i17 == 3 ? 1.0f : 0.0f;
                                float f28 = fVar.p;
                                hVar.a(centerX, centerY, f13, f27, f28, Math.min(fVar.q, f28), fVar.r, max2);
                            }
                            i13 = 1;
                            if (i17 != i13) {
                            }
                            float f282 = fVar.p;
                            hVar.a(centerX, centerY, f13, f27, f282, Math.min(fVar.q, f282), fVar.r, max2);
                        } else {
                            f12 = f10;
                            i12 = i7;
                            this.g.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        dh.h hVar2 = this.g;
                        float width = rectF.width();
                        float height = rectF.height();
                        float f29 = rectF.left - rect.left;
                        float f30 = rectF.top - rect.top;
                        float[] fArr = fVar.c;
                        gVar2 = gVar;
                        hVar2.b(width, height, f29, f30, fArr[0], fArr[2], fArr[4], fArr[6], max, fVar.g, fVar.h, gVar2.y, f24, f25, i12);
                        i11 = i12;
                    }
                    RecordingCanvas beginRecording = this.e.beginRecording();
                    if (i11 <= 1) {
                        RectF rectF4 = this.j;
                        rectF4.set(f16, f19, f20, f21);
                        ((pi.a) gVar2.r).d(f12, f11, i11, beginRecording, rectF4);
                    } else {
                        beginRecording.save();
                        beginRecording.translate(-f16, -f19);
                        gVar2.r.e(beginRecording, f16, f19, f20, f21);
                        beginRecording.restore();
                    }
                    this.e.endRecording();
                    RecordingCanvas beginRecording2 = this.d.beginRecording();
                    if (Color.alpha(gVar2.y) != 255) {
                        beginRecording2.drawColor(gVar2.y);
                    } else {
                        beginRecording2.drawRenderNode(this.e);
                        if (this.g == null && Color.alpha(gVar2.y) != 0) {
                            beginRecording2.drawColor(gVar2.y);
                        }
                    }
                    this.d.endRecording();
                }
            }
        }
        i7 = 1;
        if (i7 <= 1) {
        }
        this.e.setPivotX(0.0f);
        this.e.setPivotY(0.0f);
        float f232 = i7;
        this.e.setScaleX(f232);
        this.e.setScaleY(f232);
        float f242 = f10 - f16;
        this.e.setTranslationX(f242);
        float f252 = f11 - f19;
        this.e.setTranslationY(f252);
        if (this.g != null) {
        }
        f12 = f10;
        i11 = i7;
        gVar2 = gVar;
        RecordingCanvas beginRecording3 = this.e.beginRecording();
        if (i11 <= 1) {
        }
        this.e.endRecording();
        RecordingCanvas beginRecording22 = this.d.beginRecording();
        if (Color.alpha(gVar2.y) != 255) {
        }
        this.d.endRecording();
    }

    public final void f(float f10) {
        this.d.setAlpha(f10);
    }

    public final void g(boolean z9) {
        this.i = z9;
        this.d.setClipToOutline(z9 && !this.k.Q.e());
    }

    public final void h(boolean z9) {
        if (z9 == (this.g != null) || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (z9) {
            this.g = new dh.h(this.e);
        } else {
            this.g = null;
            this.e.setRenderEffect(null);
        }
        this.h = true;
    }
}
