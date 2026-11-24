// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gm0 extends pqd {
    public final float a = gm.N(0.55f);
    public final Outline b = new Outline();
    public final Rect c = new Rect();
    public final RenderNode d;
    public final RenderNode e;
    public final Paint f;
    public s66 g;
    public boolean h;
    public boolean i;
    public final RectF j;
    public final /* synthetic */ im0 k;

    public gm0(im0 im0Var) {
        this.k = im0Var;
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

    @Override // pqd
    public final void a() {
        this.d.discardDisplayList();
        this.e.discardDisplayList();
        this.h = true;
    }

    @Override // pqd
    public final void b(Canvas canvas, iz4 iz4Var) {
        im0 im0Var = this.k;
        hm0 hm0Var = im0Var.S;
        if (!this.d.hasDisplayList() || this.h) {
            e();
        }
        int p1 = cmb.p1(this.d.getAlpha() * im0Var.X, im0Var.x);
        int alpha = Color.alpha(p1);
        Paint paint = this.f;
        if (alpha != 0) {
            paint.setShadowLayer(im0Var.V, 0.0f, im0Var.W, p1);
            hm0Var.d(canvas, paint, im0Var.U);
        }
        int p12 = cmb.p1(this.d.getAlpha() * im0Var.X, im0Var.G);
        if (Color.alpha(p12) != 0) {
            paint.setShadowLayer(this.a, 0.0f, 0.0f, p12);
            hm0Var.d(canvas, paint, im0Var.U);
        }
        Rect rect = hm0Var.m;
        canvas.save();
        if (hm0Var.e()) {
            canvas.clipPath(hm0Var.k);
        }
        canvas.translate(rect.left, rect.top);
        canvas.drawRenderNode(this.d);
        canvas.restore();
    }

    public final boolean c() {
        return this.d.hasDisplayList();
    }

    public final void d() {
        hm0 hm0Var = this.k.S;
        Rect rect = hm0Var.m;
        int width = rect.width();
        int height = rect.height();
        Rect rect2 = this.c;
        boolean z = false;
        rect2.set(0, 0, width, height);
        float[] fArr = hm0Var.b;
        Outline outline = this.b;
        im0.l(outline, rect2, fArr);
        outline.setAlpha(1.0f);
        if (rect.isEmpty()) {
            return;
        }
        this.e.setPosition(0, 0, rect.width(), rect.height());
        this.d.setPosition(0, 0, rect.width(), rect.height());
        this.d.setOutline(outline);
        RenderNode renderNode = this.d;
        if (this.i && !hm0Var.e()) {
            z = true;
        }
        renderNode.setClipToOutline(z);
        this.h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i;
        im0 im0Var;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        im0 im0Var2;
        float f5;
        float f6;
        int i3;
        float f7;
        this.h = false;
        im0 im0Var3 = this.k;
        hm0 hm0Var = im0Var3.S;
        Rect rect = hm0Var.m;
        float f8 = rect.left;
        float f9 = im0Var3.d;
        float f10 = f8 + f9;
        float f11 = rect.top;
        float f12 = im0Var3.e;
        float f13 = f11 + f12;
        float f14 = rect.right + f9;
        float f15 = rect.bottom + f12;
        if (this.g != null && Build.VERSION.SDK_INT >= 33) {
            iz4 iz4Var = im0Var3.r;
            if (iz4Var instanceof ty4) {
                ty4 ty4Var = (ty4) iz4Var;
                if (ty4Var.h()) {
                    i = Math.max(ty4Var.f(), 1);
                    if (i <= 1) {
                        ty4 ty4Var2 = (ty4) im0Var3.r;
                        float f16 = i;
                        float k = yy4.k(f10, ty4Var2.g(), i) - f16;
                        f2 = yy4.k(f13, ty4Var2.a(), i) - f16;
                        i2 = 1;
                        im0Var = im0Var3;
                        this.e.setPosition(0, 0, ((int) Math.ceil((f14 - k) / f16)) + 1, ((int) Math.ceil((f15 - f2) / f16)) + 1);
                        f = k;
                    } else {
                        im0Var = im0Var3;
                        i2 = 1;
                        this.e.setPosition(0, 0, rect.width(), rect.height());
                        f = f10;
                        f2 = f13;
                    }
                    this.e.setPivotX(0.0f);
                    this.e.setPivotY(0.0f);
                    float f17 = i;
                    this.e.setScaleX(f17);
                    this.e.setScaleY(f17);
                    float f18 = f - f10;
                    this.e.setTranslationX(f18);
                    float f19 = f2 - f13;
                    this.e.setTranslationY(f19);
                    if (this.g != null || Build.VERSION.SDK_INT < 33) {
                        f3 = f;
                        f4 = f2;
                        im0Var2 = im0Var;
                    } else {
                        RectF rectF = hm0Var.s;
                        int i4 = hm0Var.f;
                        if (i4 <= 0) {
                            i4 = gm.L(11.0f);
                        }
                        int max = Math.max(Math.min(i4, (int) (Math.min(rectF.width(), rectF.height()) / 5.0f)), i2);
                        if (hm0Var.e()) {
                            float f20 = hm0Var.u;
                            f3 = f;
                            f4 = f2;
                            float max2 = Math.max(f20, Math.min(max + f20 + 1.0f, Math.min(hm0Var.v, hm0Var.w)));
                            s66 s66Var = this.g;
                            RectF rectF2 = hm0Var.s;
                            int i5 = hm0Var.n;
                            if (i5 == 0) {
                                f5 = rectF2.left;
                            } else if (i5 != 1) {
                                f5 = rectF2.right;
                                if (i5 != 2) {
                                    f5 -= hm0Var.t;
                                }
                            } else {
                                f5 = rectF2.left + hm0Var.t;
                            }
                            float centerX = f5 - rectF.centerX();
                            RectF rectF3 = hm0Var.s;
                            int i6 = hm0Var.n;
                            if (i6 == 1) {
                                f6 = rectF3.top;
                            } else if (i6 != 2) {
                                f6 = rectF3.bottom;
                                if (i6 != 3) {
                                    f6 -= hm0Var.t;
                                }
                            } else {
                                f6 = rectF3.top + hm0Var.t;
                            }
                            float centerY = f6 - rectF.centerY();
                            int i7 = hm0Var.n;
                            if (i7 == 0) {
                                f7 = -1.0f;
                            } else if (i7 == 2) {
                                f7 = 1.0f;
                            } else {
                                i3 = 1;
                                f7 = 0.0f;
                                float f21 = i7 != i3 ? -1.0f : i7 == 3 ? 1.0f : 0.0f;
                                float f22 = hm0Var.p;
                                s66Var.a(centerX, centerY, f7, f21, f22, Math.min(hm0Var.q, f22), hm0Var.r, max2);
                            }
                            i3 = 1;
                            if (i7 != i3) {
                            }
                            float f222 = hm0Var.p;
                            s66Var.a(centerX, centerY, f7, f21, f222, Math.min(hm0Var.q, f222), hm0Var.r, max2);
                        } else {
                            f3 = f;
                            f4 = f2;
                            this.g.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                        }
                        s66 s66Var2 = this.g;
                        float width = rectF.width();
                        float height = rectF.height();
                        float f23 = rectF.left - rect.left;
                        float f24 = rectF.top - rect.top;
                        float[] fArr = hm0Var.c;
                        im0Var2 = im0Var;
                        int i8 = i;
                        s66Var2.b(width, height, f23, f24, fArr[0], fArr[2], fArr[4], fArr[6], max, hm0Var.g, hm0Var.h, im0Var2.y, f18, f19, i8);
                        i = i8;
                    }
                    RecordingCanvas beginRecording = this.e.beginRecording();
                    if (i <= 1) {
                        RectF rectF4 = this.j;
                        rectF4.set(f10, f13, f14, f15);
                        ((ty4) im0Var2.r).d(f3, f4, i, beginRecording, rectF4);
                    } else {
                        beginRecording.save();
                        beginRecording.translate(-f10, -f13);
                        im0Var2.r.e(f10, f13, f14, f15, beginRecording);
                        beginRecording.restore();
                    }
                    this.e.endRecording();
                    RecordingCanvas beginRecording2 = this.d.beginRecording();
                    if (Color.alpha(im0Var2.y) != 255) {
                        beginRecording2.drawColor(im0Var2.y);
                    } else {
                        beginRecording2.drawRenderNode(this.e);
                        if (this.g == null && Color.alpha(im0Var2.y) != 0) {
                            beginRecording2.drawColor(im0Var2.y);
                        }
                    }
                    this.d.endRecording();
                }
            }
        }
        i = 1;
        if (i <= 1) {
        }
        this.e.setPivotX(0.0f);
        this.e.setPivotY(0.0f);
        float f172 = i;
        this.e.setScaleX(f172);
        this.e.setScaleY(f172);
        float f182 = f - f10;
        this.e.setTranslationX(f182);
        float f192 = f2 - f13;
        this.e.setTranslationY(f192);
        if (this.g != null) {
        }
        f3 = f;
        f4 = f2;
        im0Var2 = im0Var;
        RecordingCanvas beginRecording3 = this.e.beginRecording();
        if (i <= 1) {
        }
        this.e.endRecording();
        RecordingCanvas beginRecording22 = this.d.beginRecording();
        if (Color.alpha(im0Var2.y) != 255) {
        }
        this.d.endRecording();
    }

    public final void f(float f) {
        this.d.setAlpha(f);
    }

    public final void g(boolean z) {
        this.i = z;
        this.d.setClipToOutline(z && !this.k.S.e());
    }

    public final void h(boolean z) {
        if (z == (this.g != null) || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (z) {
            this.g = new s66(this.e);
        } else {
            this.g = null;
            this.e.setRenderEffect(null);
        }
        this.h = true;
    }
}
