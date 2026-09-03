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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zh0 implements ai0 {
    public final float f;
    public final Paint i;
    public final RectF j;
    public final /* synthetic */ bi0 k;
    public final Paint a = new Paint(1);
    public final RenderNode b = new RenderNode("render");
    public final RenderNode c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF g = new RectF();
    public final RectF h = new RectF();

    public zh0(bi0 bi0Var, float f10) {
        this.k = bi0Var;
        Paint paint = new Paint();
        this.i = paint;
        this.j = new RectF();
        this.f = f10;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override // org.telegram.ui.Components.ai0
    public final void a(float f10) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.c.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, tileMode));
        this.a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override // org.telegram.ui.Components.ai0
    public final void b(float f10) {
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

    @Override // org.telegram.ui.Components.ai0
    public final void c(hv hvVar, Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        Paint paint;
        bi0 bi0Var = this.k;
        Paint paint2 = bi0Var.a;
        Path path = bi0Var.b;
        if (canvas.isHardwareAccelerated()) {
            float width = bi0Var.getWidth();
            float height = bi0Var.getHeight();
            RectF rectF = this.g;
            rectF.set(0.0f, 0.0f, width, height);
            int childCount = bi0Var.getChildCount();
            RectF rectF2 = this.j;
            if (childCount > 0) {
                View childAt = bi0Var.getChildAt(0);
                float scaleX = childAt.getScaleX() * childAt.getWidth();
                float scaleY = childAt.getScaleY() * childAt.getHeight();
                float x10 = childAt.getX();
                float y10 = childAt.getY();
                rectF2.set(x10, y10, scaleX + x10, scaleY + y10);
                NotchInfoUtils.NotchInfo notchInfo = bi0Var.n;
                if (notchInfo != null) {
                    rectF2.union(notchInfo.bounds);
                }
                rectF2.inset(-AndroidUtilities.dp(20.0f), -AndroidUtilities.dp(20.0f));
                rectF2.intersect(rectF);
                rectF2.top = 0.0f;
            } else {
                rectF2.set(rectF);
            }
            rectF2.bottom += AndroidUtilities.dp(32.0f);
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
            int ilerp = (int) ((1.0f - AndroidUtilities.ilerp(bi0Var.e, 0.5f, 1.0f)) * 255.0f);
            int b10 = k7.o.b(ilerp, 0, 255);
            bi0.a((bi0) hvVar.b, beginRecording);
            this.b.endRecording();
            float f21 = this.f;
            float w10 = e2.c.w(f21, 1.0f, 2.0f, e2.c.u(bi0Var.f, 0.5f, f21, (f21 / 4.0f) + 1.0f));
            RecordingCanvas beginRecording2 = this.e.beginRecording();
            float f22 = 1.0f / w10;
            beginRecording2.scale(f22, f22, 0.0f, 0.0f);
            beginRecording2.drawRenderNode(this.b);
            this.e.endRecording();
            float f23 = f21 + 2.0f;
            RecordingCanvas beginRecording3 = this.d.beginRecording();
            float f24 = 1.0f / f23;
            beginRecording3.scale(f24, f24, 0.0f, 0.0f);
            Paint paint3 = this.i;
            if (b10 < 255) {
                beginRecording3.saveLayer(rectF2, null);
                beginRecording3.drawRenderNode(this.b);
                beginRecording3.drawRect(rectF2, paint3);
                beginRecording3.restore();
            }
            float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f23, 0.0f, 0.5f, bi0Var.e);
            if (bi0Var.getChildCount() > 0) {
                View childAt2 = bi0Var.getChildAt(0);
                float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f15;
                float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f16;
                float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
                path.rewind();
                f10 = lerp;
                f11 = f15;
                path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f10));
                path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.close();
                beginRecording3.drawPath(path, paint2);
            } else {
                f10 = lerp;
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
            if (bi0Var.n != null) {
                beginRecording4.translate(f19, f20);
                beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo2 = bi0Var.n;
                if (notchInfo2.isLikelyCircle) {
                    float min = Math.min(notchInfo2.bounds.width(), bi0Var.n.bounds.height()) / 2.0f;
                    RectF rectF3 = bi0Var.n.bounds;
                    float width2 = rectF3.bottom - (rectF3.width() / 2.0f);
                    beginRecording4.drawCircle(bi0Var.n.bounds.centerX(), width2, min, paint2);
                    path.rewind();
                    float f25 = f10 / 2.0f;
                    path.moveTo(bi0Var.n.bounds.centerX() - f25, width2);
                    path.lineTo(bi0Var.n.bounds.centerX(), min + width2 + f10);
                    path.lineTo(bi0Var.n.bounds.centerX() + f25, width2);
                    path.close();
                    beginRecording4.drawPath(path, paint2);
                } else if (notchInfo2.isAccurate) {
                    beginRecording4.drawPath(notchInfo2.path, paint2);
                } else {
                    float max = Math.max(notchInfo2.bounds.width(), bi0Var.n.bounds.height()) / 2.0f;
                    RectF rectF4 = bi0Var.n.bounds;
                    RectF rectF5 = this.h;
                    rectF5.set(rectF4);
                    beginRecording4.drawRoundRect(rectF5, max, max, paint2);
                    path.rewind();
                    float f26 = f10 / 2.0f;
                    path.moveTo(rectF5.centerX() - f26, rectF5.bottom);
                    path.lineTo(rectF5.centerX(), rectF5.bottom + f10);
                    path.lineTo(rectF5.centerX() + f26, rectF5.bottom);
                    path.close();
                    beginRecording4.drawPath(path, paint2);
                }
                f12 = f18;
                f13 = f17;
                f14 = w10;
                paint = paint3;
            } else {
                f12 = f18;
                f13 = f17;
                f14 = w10;
                paint = paint3;
                beginRecording4.drawRect(0.0f, 0.0f, f13, AndroidUtilities.dp(32.0f), paint2);
                path.rewind();
                path.moveTo((f13 - f10) / 2.0f, AndroidUtilities.dp(32.0f));
                path.lineTo(f13 / 2.0f, AndroidUtilities.dp(32.0f) + f10);
                path.lineTo((f13 + f10) / 2.0f, AndroidUtilities.dp(32.0f));
                path.close();
                beginRecording4.drawPath(path, paint2);
            }
            this.c.endRecording();
            canvas.save();
            canvas.translate(f11, f16 - AndroidUtilities.dp(32.0f));
            NotchInfoUtils.NotchInfo notchInfo3 = bi0Var.n;
            if (notchInfo3 != null) {
                canvas.clipRect(0.0f, notchInfo3.bounds.top, f13, f12);
            }
            Paint paint4 = this.a;
            canvas.saveLayer(rectF2, paint4);
            canvas.scale(f23, f23);
            canvas.drawRenderNode(this.c);
            canvas.drawRenderNode(this.d);
            canvas.restore();
            int b11 = k7.o.b((ilerp * 3) / 4, 0, 255);
            if (b11 < 255) {
                canvas.saveLayer(rectF2, null);
                if (bi0Var.f != 0.0f) {
                    canvas.saveLayer(rectF2, paint4);
                    canvas.scale(f14, f14);
                    canvas.drawRenderNode(this.e);
                    canvas.restore();
                } else {
                    canvas.drawRenderNode(this.b);
                }
                canvas.drawRect(rectF2, paint);
                canvas.restore();
            }
            if (b11 > 0) {
                if (b11 != 255) {
                    canvas.saveLayerAlpha(rectF2, b11);
                }
                if (bi0Var.f != 0.0f) {
                    canvas.saveLayer(rectF2, paint4);
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

    @Override // org.telegram.ui.Components.ai0
    public final /* synthetic */ void d(int i10, int i11) {
    }
}
