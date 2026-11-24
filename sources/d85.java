// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d85 extends aic {
    public float h0;
    public final /* synthetic */ fc2 i0;
    public final /* synthetic */ l95 j0;
    public final /* synthetic */ TextPaint k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ TextPaint m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ StaticLayout p0;
    public final /* synthetic */ h75 q0;
    public final /* synthetic */ String r0;
    public final /* synthetic */ float s0;
    public final /* synthetic */ h85 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d85(h85 h85Var, Context context, fc2 fc2Var, l95 l95Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f, StaticLayout staticLayout2, h75 h75Var, String str2, float f2) {
        super(context, false, false, true, true);
        this.t0 = h85Var;
        this.i0 = fc2Var;
        this.j0 = l95Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f;
        this.p0 = staticLayout2;
        this.q0 = h75Var;
        this.r0 = str2;
        this.s0 = f2;
    }

    @Override // aic
    public final void a() {
        super.a();
        this.h0 = this.t0.w0;
    }

    @Override // aic
    public final void b() {
        int i;
        gc2 gc2Var;
        invalidate();
        h85 h85Var = this.t0;
        boolean z = h85Var.s0;
        zhc zhcVar = this.d;
        if (!z && zhcVar.getAlpha() != 1.0f) {
            zhcVar.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = h85Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            float alpha = h85Var.x0.getAlpha();
            ImageView imageView2 = h85Var.x0;
            if (alpha == 1.0f) {
                imageView2.animate().alpha(0.0f).setDuration(300L).setListener(new im2(this, (byte) 29)).start();
            } else if (imageView2.getParent() != null) {
                h85Var.a.removeView(h85Var.x0);
            }
        }
        int i2 = zhcVar.rotatedFrameHeight;
        if (i2 == 0 || (i = zhcVar.rotatedFrameWidth) == 0 || (gc2Var = h85Var.x) == null) {
            return;
        }
        gc2Var.a(i, i2, this.i0);
    }

    @Override // aic, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        int i2;
        float f5;
        float f6;
        float f7;
        h85 h85Var = this.t0;
        k33 k33Var = h85Var.u0;
        Drawable drawable = h85Var.v0;
        d85 d85Var = h85Var.a;
        ImageReceiver imageReceiver = h85Var.l0;
        xw0 xw0Var = h85Var.O;
        zhc zhcVar = this.d;
        boolean isFirstFrameRendered = zhcVar.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        fc2 fc2Var = this.i0;
        l95 l95Var = this.j0;
        if (!isFirstFrameRendered || (!(zhcVar.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || h85Var.s0)) {
            float f8 = h85Var.k0;
            if (f8 != 1.0f) {
                float f9 = f8 + 0.10666667f;
                h85Var.k0 = f9;
                if (f9 > 1.0f) {
                    h85Var.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (h85Var.q0 != null) {
                canvas.save();
                float f10 = this.a0;
                canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (h85Var.r0 == null) {
                    Paint paint = new Paint(1);
                    h85Var.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f = 255.0f;
                canvas.drawBitmap(h85Var.q0, (getMeasuredWidth() - h85Var.q0.getWidth()) / 2.0f, (getMeasuredHeight() - h85Var.q0.getHeight()) / 2.0f, h85Var.r0);
                canvas.restore();
                f2 = 0.0f;
            } else {
                f = 255.0f;
                f2 = 0.0f;
                imageReceiver.i0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(h85Var.k0);
                imageReceiver.h(canvas, null);
            }
            gc2 gc2Var = h85Var.x;
            if (gc2Var == fc2Var.z) {
                if (h85Var.b || !l95Var.b) {
                    float L = gl.L(48.0f);
                    textPaint.setAlpha(kk7.d4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (gl.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + gl.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (xw0Var.getVisibility() != 4) {
                    xw0Var.setVisibility(4);
                }
            } else if (gc2Var.b && gc2Var.a.self) {
                if (xw0Var.getVisibility() != 0) {
                    xw0Var.setVisibility(0);
                    xw0Var.setScaleX(1.0f);
                    xw0Var.setScaleY(1.0f);
                }
                float f11 = h85Var.y0 ? f2 : l95Var.c;
                int L2 = gl.L(33.0f);
                if (h85Var.r || h85Var.b) {
                    f3 = 400.0f;
                    i = (int) ir2.i(gl.L(39.0f), l95Var.c, gl.L(10.0f), L2);
                } else {
                    f3 = 400.0f;
                    i = (int) ((Math.max(1.0f - l95Var.c, (h85Var.h || h85Var.f) ? l95Var.n : f2) * gl.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - i) / 2;
                boolean z = h85Var.h;
                float f12 = (z || h85Var.f) ? l95Var.n : f2;
                if (h85Var.b) {
                    f4 = f11;
                } else {
                    f11 = h85Var.r ? l95Var.c : f12;
                    f4 = (z || h85Var.f) ? l95Var.n : l95Var.c;
                }
                float f13 = f11;
                int L3 = (int) ((gl.L(17.0f) * f4) + ((((getMeasuredHeight() - i) / 2) - gl.L(28.0f)) - (((((h85Var.b || h85Var.r) ? l95Var.c : f2) * gl.L(74.0f)) + gl.L(17.0f)) * f13)));
                int i3 = L3 + i;
                drawable.setBounds(measuredWidth, L3, measuredWidth + i, i3);
                drawable.draw(canvas);
                float f14 = l95Var.c;
                if (f14 > f2 || f12 > f2) {
                    float max = Math.max(f14, f12) * f13;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * f));
                    if (h85Var.r || h85Var.b) {
                        xw0Var.setAlpha((1.0f - f12) * max);
                    } else {
                        xw0Var.setAlpha(0.0f);
                    }
                    i2 = i3;
                    canvas.drawText(this.n0, (i / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), gl.L(32.0f) + i3, textPaint2);
                } else {
                    xw0Var.setAlpha(f2);
                    i2 = i3;
                }
                xw0Var.setTranslationY(((gl.L(72.0f) + i2) + h85Var.p0) - this.O);
                xw0Var.setTranslationX(((getMeasuredWidth() - xw0Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (l95Var.c < 1.0f && f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r4, f12)) * 255.0d));
                    canvas.save();
                    canvas.translate((i / 2.0f) + (measuredWidth - (gl.L(f3) / 2.0f)), gl.L(10.0f) + i2);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                if (xw0Var.getVisibility() != 4) {
                    xw0Var.setVisibility(4);
                }
                wd1 wd1Var = this.q0.j4;
                Paint paint2 = wd1Var.c;
                Matrix matrix = wd1Var.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j = wd1Var.h;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 10) {
                        float f15 = (j2 / 500.0f) + wd1Var.g;
                        wd1Var.g = f15;
                        if (f15 > 4.0f) {
                            wd1Var.g = 0.0f;
                            w88 w88Var = wd1Var.p;
                            if (w88Var != null) {
                                w88Var.run();
                            }
                        }
                        wd1Var.h = currentTimeMillis;
                    }
                } else {
                    wd1Var.h = currentTimeMillis;
                }
                float f16 = wd1Var.g;
                if (f16 <= 1.0f) {
                    int i4 = wd1Var.f;
                    matrix.setTranslate((((i4 + (r10 << 1)) * f16) - wd1Var.e) - h85Var.getX(), 0.0f);
                    wd1Var.b.setLocalMatrix(matrix);
                    wd1Var.d.setLocalMatrix(matrix);
                    RectF rectF = gl.P;
                    rectF.set(d85Var.P, d85Var.O, d85Var.getMeasuredWidth() - d85Var.P, d85Var.getMeasuredHeight() - d85Var.O);
                    canvas.drawRect(rectF, wd1Var.a);
                    if (wd1Var.k) {
                        if (wd1Var.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f17 = d85Var.b;
                        canvas.drawRoundRect(rectF, f17, f17, paint2);
                    }
                }
            }
            invalidate();
        } else {
            f = 255.0f;
        }
        ImageView imageView = h85Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            h85Var.x0.setScaleX(d85Var.d.getScaleX());
            h85Var.x0.setScaleY(d85Var.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.O) - gl.L(80.0f);
        if (h85Var.x != fc2Var.z) {
            canvas.save();
            if ((h85Var.b || h85Var.r) && !h75.u5 && !h75.v5) {
                measuredHeight = ls6.B(1.0f, l95Var.a0, gl.L(90.0f) * l95Var.c, measuredHeight);
            }
            f5 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(h85Var.E);
            canvas.restore();
        } else {
            f5 = 0.0f;
        }
        boolean z2 = h85Var.s0;
        float f18 = h85Var.t0;
        if (z2) {
            f6 = 1.0f;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.064f;
                h85Var.t0 = f19;
                if (f19 > 1.0f) {
                    h85Var.t0 = 1.0f;
                } else {
                    invalidate();
                }
            }
        } else {
            if (f18 == f5) {
                return;
            }
            if (f18 != f5) {
                float f20 = f18 - 0.064f;
                h85Var.t0 = f20;
                if (f20 < f5) {
                    h85Var.t0 = f5;
                } else {
                    invalidate();
                }
            }
            f6 = 1.0f;
        }
        float f21 = h85Var.t0;
        if (this.c0 != null) {
            float f22 = this.h0;
            float f23 = this.e0;
            f7 = (h85Var.w0 * f23) + ((f6 - f23) * f22);
        } else {
            f7 = h85Var.w0;
        }
        float f24 = f21 * f7;
        if (f24 > 0.0f) {
            float L4 = gl.L(48.0f);
            float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
            float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
            if (h85Var.x == fc2Var.z) {
                measuredHeight2 -= L4 / 2.5f;
            }
            RectF rectF2 = gl.P;
            float f25 = measuredHeight2 + L4;
            rectF2.set((int) measuredWidth2, (int) measuredHeight2, (int) (measuredWidth2 + L4), (int) f25);
            if (f24 != 1.0f) {
                canvas.saveLayerAlpha(rectF2, (int) (f24 * f), 31);
            } else {
                canvas.save();
            }
            k33Var.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            k33Var.draw(canvas);
            canvas.restore();
            float f26 = f24 * l95Var.c;
            if (f26 <= 0.0f || h85Var.x == fc2Var.z) {
                return;
            }
            textPaint.setAlpha((int) (f26 * f));
            canvas.drawText(this.r0, (L4 / 2.0f) + (measuredWidth2 - (this.s0 / 2.0f)), f25 + gl.L(16.0f), textPaint);
        }
    }

    @Override // aic, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h85 h85Var = this.t0;
        if (!h85Var.j0 || view != h85Var.a.d) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float f = h85Var.e0;
        canvas.scale(f, f, h85Var.f0, h85Var.g0);
        canvas.translate(h85Var.h0, h85Var.i0);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // aic
    public final void e() {
        super.e();
        h85 h85Var = this.t0;
        d85 d85Var = h85Var.a;
        ImageView imageView = h85Var.x0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        h85Var.x0.getLayoutParams().width = d85Var.d.getMeasuredWidth();
        h85Var.x0.getLayoutParams().height = d85Var.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        h85 h85Var = this.t0;
        h85Var.Q = true;
        h85Var.invalidate();
        h85Var.Q = false;
    }

    @Override // aic, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        gc2 gc2Var;
        h85 h85Var = this.t0;
        d85 d85Var = h85Var.a;
        boolean z2 = h85Var.w;
        zhc zhcVar = this.d;
        if (z2 && h85Var.R && zhcVar.rotatedFrameHeight != 0 && zhcVar.rotatedFrameWidth != 0) {
            if (h85Var.h) {
                d85Var.b0 = (byte) 1;
            } else if (h85Var.b) {
                d85Var.b0 = (byte) 1;
            } else if (this.j0.b) {
                d85Var.b0 = (byte) 0;
            } else if (h85Var.x.b) {
                d85Var.b0 = (byte) 1;
            } else {
                d85Var.b0 = (byte) 2;
            }
            h85Var.R = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i6 = zhcVar.rotatedFrameHeight;
        if (i6 == 0 || (i5 = zhcVar.rotatedFrameWidth) == 0 || (gc2Var = h85Var.x) == null) {
            return;
        }
        gc2Var.a(i5, i6, this.i0);
    }

    @Override // aic, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
