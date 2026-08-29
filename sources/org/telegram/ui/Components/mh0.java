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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mh0 implements nh0 {
    public final float f;
    public final Paint i;
    public final RectF j;
    public final /* synthetic */ oh0 k;
    public final Paint a = new Paint(1);
    public final RenderNode b = new RenderNode("render");
    public final RenderNode c = new RenderNode("effectNotch");
    public final RenderNode d = new RenderNode("effect");
    public final RenderNode e = new RenderNode("blur");
    public final RectF g = new RectF();
    public final RectF h = new RectF();

    public mh0(oh0 oh0Var, float f9) {
        this.k = oh0Var;
        Paint paint = new Paint();
        this.i = paint;
        this.j = new RectF();
        this.f = f9;
        paint.setColor(-16777216);
        paint.setBlendMode(BlendMode.SRC_IN);
    }

    @Override // org.telegram.ui.Components.nh0
    public final void a(float f9) {
        RenderNode renderNode = this.d;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f9, f9, tileMode));
        this.c.setRenderEffect(RenderEffect.createBlurEffect(f9, f9, tileMode));
        this.a.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
    }

    @Override // org.telegram.ui.Components.nh0
    public final void b(float f9) {
        Shader.TileMode tileMode;
        if (f9 == 0.0f) {
            this.e.setRenderEffect(null);
            return;
        }
        RenderNode renderNode = this.e;
        float f10 = this.k.d;
        float f11 = this.f;
        float f12 = (f9 * f10) / f11;
        float f13 = (f9 * f10) / f11;
        tileMode = Shader.TileMode.DECAL;
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(f12, f13, tileMode));
    }

    @Override // org.telegram.ui.Components.nh0
    public final void c(cv cvVar, Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        Paint paint;
        oh0 oh0Var = this.k;
        Paint paint2 = oh0Var.a;
        Path path = oh0Var.b;
        if (canvas.isHardwareAccelerated()) {
            float width = oh0Var.getWidth();
            float height = oh0Var.getHeight();
            RectF rectF = this.g;
            rectF.set(0.0f, 0.0f, width, height);
            int childCount = oh0Var.getChildCount();
            RectF rectF2 = this.j;
            if (childCount > 0) {
                View childAt = oh0Var.getChildAt(0);
                float scaleX = childAt.getScaleX() * childAt.getWidth();
                float scaleY = childAt.getScaleY() * childAt.getHeight();
                float x4 = childAt.getX();
                float y8 = childAt.getY();
                rectF2.set(x4, y8, scaleX + x4, scaleY + y8);
                NotchInfoUtils.NotchInfo notchInfo = oh0Var.n;
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
            float f14 = rectF2.left;
            float f15 = rectF2.top;
            this.b.setPosition(0, 0, ceil, ceil2);
            this.e.setPosition(0, 0, ceil, ceil2);
            this.d.setPosition(0, 0, ceil, ceil2);
            this.c.setPosition(0, 0, ceil, ceil2);
            float f16 = ceil;
            float f17 = ceil2;
            rectF2.set(0.0f, 0.0f, f16, f17);
            RecordingCanvas beginRecording = this.b.beginRecording();
            float f18 = -f14;
            float f19 = -f15;
            beginRecording.translate(f18, f19);
            int ilerp = (int) ((1.0f - AndroidUtilities.ilerp(oh0Var.e, 0.5f, 1.0f)) * 255.0f);
            int b10 = i7.w.b(ilerp, 0, 255);
            oh0.a((oh0) cvVar.b, beginRecording);
            this.b.endRecording();
            float f20 = this.f;
            float z10 = com.google.android.recaptcha.internal.a.z(f20, 1.0f, 2.0f, com.google.android.recaptcha.internal.a.x(oh0Var.f, 0.5f, f20, (f20 / 4.0f) + 1.0f));
            RecordingCanvas beginRecording2 = this.e.beginRecording();
            float f21 = 1.0f / z10;
            beginRecording2.scale(f21, f21, 0.0f, 0.0f);
            beginRecording2.drawRenderNode(this.b);
            this.e.endRecording();
            float f22 = f20 + 2.0f;
            RecordingCanvas beginRecording3 = this.d.beginRecording();
            float f23 = 1.0f / f22;
            beginRecording3.scale(f23, f23, 0.0f, 0.0f);
            Paint paint3 = this.i;
            if (b10 < 255) {
                beginRecording3.saveLayer(rectF2, null);
                beginRecording3.drawRenderNode(this.b);
                beginRecording3.drawRect(rectF2, paint3);
                beginRecording3.restore();
            }
            float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f22, 0.0f, 0.5f, oh0Var.e);
            if (oh0Var.getChildCount() > 0) {
                View childAt2 = oh0Var.getChildAt(0);
                float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f14;
                float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f15;
                float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
                path.rewind();
                f9 = lerp;
                f10 = f14;
                path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f9));
                path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                path.close();
                beginRecording3.drawPath(path, paint2);
            } else {
                f9 = lerp;
                f10 = f14;
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
            beginRecording4.scale(f23, f23, 0.0f, 0.0f);
            if (oh0Var.n != null) {
                beginRecording4.translate(f18, f19);
                beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo2 = oh0Var.n;
                if (notchInfo2.isLikelyCircle) {
                    float min = Math.min(notchInfo2.bounds.width(), oh0Var.n.bounds.height()) / 2.0f;
                    RectF rectF3 = oh0Var.n.bounds;
                    float width2 = rectF3.bottom - (rectF3.width() / 2.0f);
                    beginRecording4.drawCircle(oh0Var.n.bounds.centerX(), width2, min, paint2);
                    path.rewind();
                    float f24 = f9 / 2.0f;
                    path.moveTo(oh0Var.n.bounds.centerX() - f24, width2);
                    path.lineTo(oh0Var.n.bounds.centerX(), min + width2 + f9);
                    path.lineTo(oh0Var.n.bounds.centerX() + f24, width2);
                    path.close();
                    beginRecording4.drawPath(path, paint2);
                } else if (notchInfo2.isAccurate) {
                    beginRecording4.drawPath(notchInfo2.path, paint2);
                } else {
                    float max = Math.max(notchInfo2.bounds.width(), oh0Var.n.bounds.height()) / 2.0f;
                    RectF rectF4 = oh0Var.n.bounds;
                    RectF rectF5 = this.h;
                    rectF5.set(rectF4);
                    beginRecording4.drawRoundRect(rectF5, max, max, paint2);
                    path.rewind();
                    float f25 = f9 / 2.0f;
                    path.moveTo(rectF5.centerX() - f25, rectF5.bottom);
                    path.lineTo(rectF5.centerX(), rectF5.bottom + f9);
                    path.lineTo(rectF5.centerX() + f25, rectF5.bottom);
                    path.close();
                    beginRecording4.drawPath(path, paint2);
                }
                f11 = f17;
                f12 = f16;
                f13 = z10;
                paint = paint3;
            } else {
                f11 = f17;
                f12 = f16;
                f13 = z10;
                paint = paint3;
                beginRecording4.drawRect(0.0f, 0.0f, f12, AndroidUtilities.dp(32.0f), paint2);
                path.rewind();
                path.moveTo((f12 - f9) / 2.0f, AndroidUtilities.dp(32.0f));
                path.lineTo(f12 / 2.0f, AndroidUtilities.dp(32.0f) + f9);
                path.lineTo((f12 + f9) / 2.0f, AndroidUtilities.dp(32.0f));
                path.close();
                beginRecording4.drawPath(path, paint2);
            }
            this.c.endRecording();
            canvas.save();
            canvas.translate(f10, f15 - AndroidUtilities.dp(32.0f));
            NotchInfoUtils.NotchInfo notchInfo3 = oh0Var.n;
            if (notchInfo3 != null) {
                canvas.clipRect(0.0f, notchInfo3.bounds.top, f12, f11);
            }
            Paint paint4 = this.a;
            canvas.saveLayer(rectF2, paint4);
            canvas.scale(f22, f22);
            canvas.drawRenderNode(this.c);
            canvas.drawRenderNode(this.d);
            canvas.restore();
            int b11 = i7.w.b((ilerp * 3) / 4, 0, 255);
            if (b11 < 255) {
                canvas.saveLayer(rectF2, null);
                if (oh0Var.f != 0.0f) {
                    canvas.saveLayer(rectF2, paint4);
                    canvas.scale(f13, f13);
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
                if (oh0Var.f != 0.0f) {
                    canvas.saveLayer(rectF2, paint4);
                    canvas.scale(f13, f13);
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

    @Override // org.telegram.ui.Components.nh0
    public final /* synthetic */ void d(int i10, int i11) {
    }
}
