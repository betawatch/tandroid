package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h2 extends View {
    public final RectF D;
    public final RectF E;
    public final org.telegram.ui.Components.ic F;
    public final RectF G;
    public final RectF H;
    public final org.telegram.ui.Components.ic I;
    public final long J;
    public boolean K;
    public final org.telegram.ui.Components.w5 L;
    public boolean M;
    public final org.telegram.ui.Components.w5 N;
    public boolean O;
    public final org.telegram.ui.Components.w5 P;
    public final ly0 Q;
    public final ly0 R;
    public final h6.m S;
    public ly0 T;
    public Drawable U;
    public Drawable V;
    public RenderNode W;
    public final Paint a;
    public final a a0;
    public final Paint b;
    public Runnable b0;
    public final Paint c;
    public Runnable c0;
    public final Path d;
    public Runnable d0;
    public final Paint e;
    public Object e0;
    public final Path f;
    public WebView f0;
    public int g0;
    public final RectF h;
    public final RectF n;
    public final org.telegram.ui.Components.ic r;
    public final RectF s;
    public final RectF w;
    public final org.telegram.ui.Components.ic x;
    public final RectF y;

    public h2(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Path();
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Path path = new Path();
        this.f = path;
        this.h = new RectF();
        this.n = new RectF();
        this.r = new org.telegram.ui.Components.ic((View) null);
        this.s = new RectF();
        this.w = new RectF();
        this.x = new org.telegram.ui.Components.ic(this);
        this.y = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new org.telegram.ui.Components.ic(this);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new org.telegram.ui.Components.ic(this);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.L = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.M = true;
        this.N = new org.telegram.ui.Components.w5(this, 0L, 420L, xqVar);
        this.O = false;
        this.P = new org.telegram.ui.Components.w5(this, 0L, 420L, xqVar);
        this.S = new h6.m(28);
        this.a0 = new a(this, 2);
        this.J = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.Q = new ly0(hd.M0(2131753063, null), 13.0f, g0.o());
        this.R = new ly0(hd.M0(2131753062, null), 13.0f, g0.o());
        paint2.setPathEffect(new CornerPathEffect(g0.L(1.0f)));
        path.rewind();
        path.moveTo(-g0.N(1.33f), g0.N(0.16f));
        path.lineTo(-g0.N(1.33f), -g0.N(3.5f));
        path.lineTo(g0.N(1.33f), -g0.N(3.5f));
        path.lineTo(g0.N(1.33f), g0.N(0.16f));
        path.lineTo(g0.N(3.5f), g0.N(0.16f));
        path.lineTo(0.0f, g0.N(3.5f));
        path.lineTo(-g0.N(3.5f), g0.N(0.16f));
        path.close();
    }

    public final org.telegram.ui.Components.ic a(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? this.r : this.I : this.F : this.x;
    }

    public final int b(MotionEvent motionEvent) {
        if (this.w.contains(motionEvent.getX(), motionEvent.getY())) {
            return 1;
        }
        if (this.E.contains(motionEvent.getX(), motionEvent.getY())) {
            return 2;
        }
        return this.H.contains(motionEvent.getX(), motionEvent.getY()) ? 3 : 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        float f11;
        float f12;
        WebView webView;
        super.onDraw(canvas);
        Paint paint = this.b;
        paint.setColor(-1);
        Paint paint2 = this.c;
        paint2.setColor(-1);
        paint2.setStrokeWidth(g0.L(2.0f));
        Path path = this.d;
        path.rewind();
        float width = getWidth();
        RectF rectF = this.h;
        float L2 = (width - rectF.right) - g0.L(79.66f);
        float L3 = rectF.top + g0.L(8.0f);
        float width2 = (getWidth() - rectF.right) - g0.L(8.0f);
        float L4 = rectF.top + g0.L(38.0f);
        RectF rectF2 = this.y;
        rectF2.set(L2, L3, width2, L4);
        float f13 = rectF2.left;
        float f14 = rectF2.top;
        float centerX = rectF2.centerX();
        float f15 = rectF2.bottom;
        RectF rectF3 = this.D;
        rectF3.set(f13, f14, centerX, f15);
        this.E.set(rectF3.left - g0.L(8.0f), rectF3.top - g0.L(8.0f), rectF3.right, rectF3.bottom + g0.L(8.0f));
        float centerX2 = rectF2.centerX();
        float f16 = rectF2.top;
        float f17 = rectF2.right;
        float f18 = rectF2.bottom;
        RectF rectF4 = this.G;
        rectF4.set(centerX2, f16, f17, f18);
        this.H.set(rectF4.left, rectF4.top - g0.L(8.0f), rectF4.right + g0.L(8.0f), rectF4.bottom + g0.L(8.0f));
        float L5 = g0.L(15.0f);
        float L6 = g0.L(15.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF2, L5, L6, direction);
        float d = this.L.d(this.K);
        float d2 = this.N.d(this.M);
        float L7 = (rectF2.left - g0.L(18.0f)) - (rectF.left + g0.L(38.0f));
        ly0 ly0Var = this.T;
        if (ly0Var == null) {
            f10 = 18.0f;
            L = 0.0f;
        } else {
            f10 = 18.0f;
            L = ly0Var.c + g0.L(this.U != null ? 30.0f : 12.0f);
        }
        float min = Math.min(L7, L);
        float T1 = g0.T1(g0.T1(this.R.c, this.Q.c, d) + g0.L(12.0f), min, d2);
        float L8 = rectF.left + g0.L(8.0f);
        float L9 = rectF.top + g0.L(8.0f);
        float L10 = rectF.left + g0.L(38.0f) + T1;
        float L11 = rectF.top + g0.L(38.0f);
        RectF rectF5 = this.n;
        rectF5.set(L8, L9, L10, L11);
        float f19 = rectF5.left;
        float f20 = rectF5.bottom;
        RectF rectF6 = this.s;
        rectF6.set(f19, rectF5.top, g0.L(30.0f) + f19, f20);
        RectF rectF7 = this.w;
        rectF7.set(rectF6);
        rectF7.right = g0.T1(rectF5.right, rectF6.left + g0.L(30.0f), d2);
        rectF7.inset(-g0.L(8.0f), -g0.L(8.0f));
        path.addRoundRect(rectF5, g0.L(15.0f), g0.L(15.0f), direction);
        Object obj = this.e0;
        Paint paint3 = this.a;
        if (obj == null || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || !((webView = this.f0) == null || webView.getLayerType() == 2)) {
            paint3.setColor(org.telegram.ui.ActionBar.k6.r1(0.35f, -16777216));
            canvas.drawPath(path, paint3);
        } else {
            if (this.W == null) {
                RenderNode renderNode = new RenderNode("bot_fullscreen_blur");
                this.W = renderNode;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(g0.L(f10), g0.L(f10), Shader.TileMode.CLAMP));
            }
            RenderNode e10 = ni.a.e(this.e0);
            this.W.setPosition(0, 0, jg.g.e(16.0f, e10.getWidth(), 1), Math.max(1, (int) Math.min(rectF.top + g0.L(46.0f), e10.getHeight())));
            RecordingCanvas beginRecording = this.W.beginRecording();
            beginRecording.translate(-g0.L(8.0f), 0.0f);
            beginRecording.drawRenderNode(e10);
            this.W.endRecording();
            canvas.save();
            canvas.clipPath(path);
            canvas.save();
            canvas.translate(g0.L(8.0f), 0.0f);
            canvas.drawRenderNode(this.W);
            canvas.restore();
            paint3.setColor(org.telegram.ui.ActionBar.k6.r1(0.22f, -16777216));
            canvas.drawPaint(paint3);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(rectF6.centerX(), rectF6.centerY());
        org.telegram.ui.Components.ic icVar = this.x;
        float a10 = icVar.a(0.1f);
        canvas.scale(a10, a10);
        canvas.translate((-g0.L(6.5f)) * d, 0.0f);
        float T12 = g0.T1(g0.L(4.66f), g0.L(5.5f), d);
        float f21 = -T12;
        canvas.drawLine(g0.T1(f21, 0.0f, d), g0.T1(f21, 0.0f, d), T12, T12, paint2);
        canvas.drawLine(g0.T1(f21, 0.0f, d), g0.T1(T12, 0.0f, d), T12, f21, paint2);
        if (d > 0.0f) {
            canvas.drawLine(0.0f, 0.0f, g0.L(11.6f) * d, 0.0f, paint2);
        }
        canvas.restore();
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha((rectF5.left + g0.L(30.0f)) - g0.L(10.0f), rectF5.top, rectF5.right, rectF5.bottom, qs.e4, 31);
        if (d2 <= 0.0f || this.T == null) {
            f11 = d2;
            f12 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(com.google.android.recaptcha.internal.a.v(1.0f, d2, min, rectF5.left + g0.L(30.0f)), rectF5.centerY());
            ly0 ly0Var2 = this.T;
            ly0Var2.p = ((rectF5.right - g0.L(this.U != null ? 30.0f : 12.0f)) - (rectF5.left + g0.L(30.0f))) + 2.0f;
            f12 = 1.0f;
            ly0Var2.c(0.0f, 0.0f, d2, -1, canvas);
            f11 = d2;
            canvas2 = canvas;
            canvas2.translate(this.T.k() + g0.L(5.0f), 0.0f);
            int L12 = g0.L(16.0f);
            Drawable drawable = this.U;
            if (drawable != null) {
                drawable.setBounds(0, (-L12) / 2, L12, L12 / 2);
                this.U.setAlpha((int) (75.0f * f11));
                this.U.draw(canvas2);
            }
            Drawable drawable2 = this.V;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-L12) / 2, L12, L12 / 2);
                this.V.setAlpha((int) (255.0f * f11));
                this.V.draw(canvas2);
            }
            RectF rectF8 = g0.P;
            rectF8.set((rectF5.left + g0.L(30.0f)) - g0.L(10.0f), rectF5.top, rectF5.left + g0.L(30.0f), rectF5.bottom);
            this.S.m(canvas2, rectF8, 2, 1.0f);
            canvas2.restore();
        }
        if (f11 < f12) {
            canvas2.save();
            float a11 = icVar.a(0.1f);
            canvas2.scale(a11, a11, rectF6.centerX(), rectF6.centerY());
            float f22 = f12 - d;
            if (f22 > 0.0f) {
                this.R.c(((rectF6.left + g0.L(30.0f)) - (g0.L(12.0f) * d)) + (g0.L(32.0f) * f11), rectF6.centerY(), (f12 - f11) * f22, -1, canvas);
            }
            if (d > 0.0f) {
                this.Q.c((g0.L(12.0f) * f22) + rectF6.left + g0.L(30.0f) + (g0.L(32.0f) * f11), rectF6.centerY(), (f12 - f11) * d, -1, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(rectF3.centerX() + g0.L(2.0f), rectF3.centerY());
        float a12 = this.F.a(0.1f);
        canvas2.scale(a12, a12);
        float L13 = g0.L(6.0f);
        float L14 = g0.L(3.0f);
        float f23 = -L14;
        canvas2.drawLine(-L13, f23, 0.0f, L14, paint2);
        canvas.drawLine(0.0f, L14, L13, f23, paint2);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF4.centerX() + g0.L(f12), rectF4.centerY());
        float a13 = this.I.a(0.1f);
        canvas.scale(a13, a13);
        canvas.drawCircle(0.0f, -g0.L(5.0f), g0.L(1.66f), paint);
        canvas.drawCircle(0.0f, 0.0f, g0.L(1.66f), paint);
        canvas.drawCircle(0.0f, g0.L(5.0f), g0.L(1.66f), paint);
        float d10 = this.P.d(this.O);
        if (d10 > 0.0f) {
            canvas.translate(-g0.N(8.166f), g0.N(3.5f));
            float f24 = (d10 * 0.5f) + 0.5f;
            canvas.scale(f24, f24);
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.4f, -1);
            Paint paint4 = this.e;
            paint4.setColor(r12);
            Path path2 = this.f;
            canvas.drawPath(path2, paint4);
            float currentTimeMillis = ((System.currentTimeMillis() - this.J) % 450) / 450.0f;
            float f25 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), currentTimeMillis), g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), f25));
            paint4.setColor(org.telegram.ui.ActionBar.k6.r1(f12, -1));
            canvas.drawPath(path2, paint4);
            canvas.restore();
            if (f25 > f12) {
                canvas.save();
                canvas.clipRect(-g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), 0.0f), g0.L(5.0f), g0.T1(-g0.N(3.5f), g0.N(3.5f), f25 - f12));
                paint4.setColor(org.telegram.ui.ActionBar.k6.r1(f12, -1));
                canvas.drawPath(path2, paint4);
                canvas.restore();
            }
            invalidate();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (motionEvent.getAction() == 0) {
            a(this.g0).c(false);
            int b10 = b(motionEvent);
            this.g0 = b10;
            a(b10).c(true);
        } else if (motionEvent.getAction() == 2) {
            if (b(motionEvent) != this.g0) {
                this.g0 = 0;
                a(0).c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            int i7 = this.g0;
            if (i7 == 1 && (runnable3 = this.b0) != null) {
                runnable3.run();
            } else if (i7 == 2 && (runnable2 = this.c0) != null) {
                runnable2.run();
            } else if (i7 == 3 && (runnable = this.d0) != null) {
                runnable.run();
            }
            a(this.g0).c(false);
            this.g0 = 0;
        } else if (motionEvent.getAction() == 3) {
            a(this.g0).c(false);
            this.g0 = 0;
        }
        return this.g0 != 0;
    }

    public void setBack(boolean z9) {
        this.K = z9;
        invalidate();
    }

    public void setDownloading(boolean z9) {
        if (this.O == z9) {
            return;
        }
        this.O = z9;
        invalidate();
    }

    public void setInsets(RectF rectF) {
        this.h.set(rectF);
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.b0 = runnable;
    }

    public void setOnCollapseClickListener(Runnable runnable) {
        this.c0 = runnable;
    }

    public void setOnMenuClickListener(Runnable runnable) {
        this.d0 = runnable;
    }

    public void setParentRenderNode(Object obj) {
        this.e0 = obj;
    }

    public void setWebView(WebView webView) {
        this.f0 = webView;
    }

    public void setInsets(Rect rect) {
        this.h.set(rect);
    }
}
