package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vf0 implements wf0 {
    public final float f;
    public final Paint i;
    public final RectF j;
    public final /* synthetic */ xf0 k;
    public final Paint a = new Paint(1);
    public final RenderNode b = new RenderNode("render");
    public final RenderNode c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF g = new RectF();
    public final RectF h = new RectF();

    public vf0(xf0 xf0Var, float f10) {
        this.k = xf0Var;
        Paint paint = new Paint();
        this.i = paint;
        this.j = new RectF();
        this.f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override // org.telegram.ui.Components.wf0
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override // org.telegram.ui.Components.wf0
    public final void b(bx bxVar, Canvas canvas) {
        Paint paint;
        float T1;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Paint paint2;
        xf0 xf0Var = this.k;
        Paint paint3 = xf0Var.a;
        Path path = xf0Var.b;
        if (canvas.isHardwareAccelerated()) {
            float width = xf0Var.getWidth();
            float height = xf0Var.getHeight();
            RectF rectF = this.g;
            rectF.set(0.0f, 0.0f, width, height);
            int childCount = xf0Var.getChildCount();
            RectF rectF2 = this.j;
            if (childCount > 0) {
                View childAt = xf0Var.getChildAt(0);
                float scaleX = childAt.getScaleX() * childAt.getWidth();
                float scaleY = childAt.getScaleY() * childAt.getHeight();
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                rectF2.set(x10, y10, scaleX + x10, scaleY + y10);
                org.telegram.messenger.bs bsVar = xf0Var.n;
                if (bsVar != null) {
                    rectF2.union(bsVar.e);
                }
                rectF2.inset(-org.telegram.messenger.g0.L(20.0f), -org.telegram.messenger.g0.L(20.0f));
                rectF2.intersect(rectF);
                rectF2.top = 0.0f;
            } else {
                rectF2.set(rectF);
            }
            rectF2.bottom += org.telegram.messenger.g0.L(32.0f);
            int ceil = (int) Math.ceil(rectF2.width());
            int ceil2 = (int) Math.ceil(rectF2.height());
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            this.b.setPosition(0, 0, ceil, ceil2);
            this.e.setPosition(0, 0, ceil, ceil2);
            this.d.setPosition(0, 0, ceil, ceil2);
            this.c.setPosition(0, 0, ceil, ceil2);
            float f17 = ceil;
            float f18 = ceil2;
            rectF2.set(0.0f, 0.0f, f17, f18);
            RecordingCanvas beginRecording = this.b.beginRecording();
            float f19 = -f15;
            float f20 = -f16;
            beginRecording.translate(f19, f20);
            int z12 = (int) ((1.0f - org.telegram.messenger.g0.z1(xf0Var.e, 0.5f, 1.0f)) * 255.0f);
            int b10 = c8.j9.b(z12, 0, org.telegram.messenger.qs.e4);
            xf0.a((xf0) bxVar.b, beginRecording);
            this.b.endRecording();
            float f21 = this.f;
            float z9 = com.google.android.recaptcha.internal.a.z(f21, 1.0f, 2.0f, com.google.android.recaptcha.internal.a.x(xf0Var.f, 0.5f, f21, (f21 / 4.0f) + 1.0f));
            RecordingCanvas beginRecording2 = this.e.beginRecording();
            float f22 = 1.0f / z9;
            beginRecording2.scale(f22, f22, 0.0f, 0.0f);
            beginRecording2.drawRenderNode(this.b);
            this.e.endRecording();
            float f23 = f21 + 2.0f;
            RecordingCanvas beginRecording3 = this.d.beginRecording();
            float f24 = 1.0f / f23;
            beginRecording3.scale(f24, f24, 0.0f, 0.0f);
            Paint paint4 = this.i;
            if (b10 < 255) {
                beginRecording3.saveLayer(rectF2, null);
                beginRecording3.drawRenderNode(this.b);
                beginRecording3.drawRect(rectF2, paint4);
                beginRecording3.restore();
            }
            float L = org.telegram.messenger.g0.L(7.0f) * f23;
            float f25 = xf0Var.e;
            if (f25 < 0.5f) {
                paint = paint4;
                T1 = org.telegram.messenger.g0.T1(0.0f, L, f25 / 0.5f);
            } else {
                paint = paint4;
                T1 = org.telegram.messenger.g0.T1(L, 0.0f, (f25 - 0.5f) / 0.5f);
            }
            if (xf0Var.getChildCount() > 0) {
                View childAt2 = xf0Var.getChildAt(0);
                float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f15;
                f10 = T1;
                float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + org.telegram.messenger.g0.L(32.0f)) - f16;
                float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
                path.rewind();
                f11 = f15;
                path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f10));
                path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.close();
                beginRecording3.drawPath(path, paint3);
            } else {
                f10 = T1;
                f11 = f15;
            }
            if (b10 > 0) {
                if (b10 != 255) {
                    beginRecording3.saveLayerAlpha(rectF2, b10);
                }
                beginRecording3.drawRenderNode(this.b);
                if (b10 != 255) {
                    beginRecording3.restore();
                }
            }
            this.d.endRecording();
            RecordingCanvas beginRecording4 = this.c.beginRecording();
            beginRecording4.scale(f24, f24, 0.0f, 0.0f);
            if (xf0Var.n != null) {
                beginRecording4.translate(f19, f20);
                beginRecording4.translate(0.0f, org.telegram.messenger.g0.L(32.0f));
                org.telegram.messenger.bs bsVar2 = xf0Var.n;
                if (bsVar2.c) {
                    float min = Math.min(bsVar2.e.width(), xf0Var.n.e.height()) / 2.0f;
                    RectF rectF3 = xf0Var.n.e;
                    float width2 = rectF3.bottom - (rectF3.width() / 2.0f);
                    beginRecording4.drawCircle(xf0Var.n.e.centerX(), width2, min, paint3);
                    path.rewind();
                    float f26 = f10 / 2.0f;
                    path.moveTo(xf0Var.n.e.centerX() - f26, width2);
                    path.lineTo(xf0Var.n.e.centerX(), min + width2 + f10);
                    path.lineTo(xf0Var.n.e.centerX() + f26, width2);
                    path.close();
                    beginRecording4.drawPath(path, paint3);
                } else if (bsVar2.b) {
                    beginRecording4.drawPath(bsVar2.d, paint3);
                } else {
                    float max = Math.max(bsVar2.e.width(), xf0Var.n.e.height()) / 2.0f;
                    RectF rectF4 = xf0Var.n.e;
                    RectF rectF5 = this.h;
                    rectF5.set(rectF4);
                    beginRecording4.drawRoundRect(rectF5, max, max, paint3);
                    path.rewind();
                    float f27 = f10 / 2.0f;
                    path.moveTo(rectF5.centerX() - f27, rectF5.bottom);
                    path.lineTo(rectF5.centerX(), rectF5.bottom + f10);
                    path.lineTo(rectF5.centerX() + f27, rectF5.bottom);
                    path.close();
                    beginRecording4.drawPath(path, paint3);
                }
                f12 = f18;
                f13 = f17;
                f14 = z9;
                paint2 = paint;
            } else {
                f12 = f18;
                f13 = f17;
                f14 = z9;
                paint2 = paint;
                beginRecording4.drawRect(0.0f, 0.0f, f13, org.telegram.messenger.g0.L(32.0f), paint3);
                path.rewind();
                path.moveTo((f13 - f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
                path.lineTo(f13 / 2.0f, org.telegram.messenger.g0.L(32.0f) + f10);
                path.lineTo((f13 + f10) / 2.0f, org.telegram.messenger.g0.L(32.0f));
                path.close();
                beginRecording4.drawPath(path, paint3);
            }
            this.c.endRecording();
            canvas.save();
            canvas.translate(f11, f16 - org.telegram.messenger.g0.L(32.0f));
            org.telegram.messenger.bs bsVar3 = xf0Var.n;
            if (bsVar3 != null) {
                canvas.clipRect(0.0f, bsVar3.e.top, f13, f12);
            }
            Paint paint5 = this.a;
            canvas.saveLayer(rectF2, paint5);
            canvas.scale(f23, f23);
            canvas.drawRenderNode(this.c);
            canvas.drawRenderNode(this.d);
            canvas.restore();
            int b11 = c8.j9.b((z12 * 3) / 4, 0, org.telegram.messenger.qs.e4);
            if (b11 < 255) {
                canvas.saveLayer(rectF2, null);
                if (xf0Var.f != 0.0f) {
                    canvas.saveLayer(rectF2, paint5);
                    canvas.scale(f14, f14);
                    canvas.drawRenderNode(this.e);
                    canvas.restore();
                } else {
                    canvas.drawRenderNode(this.b);
                }
                canvas.drawRect(rectF2, paint2);
                canvas.restore();
            }
            if (b11 > 0) {
                if (b11 != 255) {
                    canvas.saveLayerAlpha(rectF2, b11);
                }
                if (xf0Var.f != 0.0f) {
                    canvas.saveLayer(rectF2, paint5);
                    canvas.scale(f14, f14);
                    canvas.drawRenderNode(this.e);
                    canvas.restore();
                } else {
                    canvas.drawRenderNode(this.b);
                }
                if (b11 != 255) {
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.wf0
    public final void c(float f10) {
        Shader.TileMode tileMode;
        if (f10 == 0.0f) {
            this.e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.e;
        float f11 = this.k.d;
        float f12 = this.f;
        float f13 = (f10 * f11) / f12;
        float f14 = (f10 * f11) / f12;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f13, f14, tileMode));
    }

    @Override // org.telegram.ui.Components.wf0
    public final /* synthetic */ void d(int i7, int i10) {
    }
}
