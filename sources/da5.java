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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class da5 extends akc {
    public float h0;
    public final /* synthetic */ qd2 i0;
    public final /* synthetic */ jb5 j0;
    public final /* synthetic */ TextPaint k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ TextPaint m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ StaticLayout p0;
    public final /* synthetic */ g95 q0;
    public final /* synthetic */ String r0;
    public final /* synthetic */ float s0;
    public final /* synthetic */ ha5 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da5(ha5 ha5Var, Context context, qd2 qd2Var, jb5 jb5Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f, StaticLayout staticLayout2, g95 g95Var, String str2, float f2) {
        super(context, false, false, true, true);
        this.t0 = ha5Var;
        this.i0 = qd2Var;
        this.j0 = jb5Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f;
        this.p0 = staticLayout2;
        this.q0 = g95Var;
        this.r0 = str2;
        this.s0 = f2;
    }

    @Override // akc
    public final void a() {
        super.a();
        this.h0 = this.t0.w0;
    }

    @Override // akc
    public final void b() {
        int i;
        rd2 rd2Var;
        invalidate();
        ha5 ha5Var = this.t0;
        boolean z = ha5Var.s0;
        zjc zjcVar = this.d;
        if (!z && zjcVar.getAlpha() != 1.0f) {
            zjcVar.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = ha5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            float alpha = ha5Var.x0.getAlpha();
            ImageView imageView2 = ha5Var.x0;
            if (alpha == 1.0f) {
                imageView2.animate().alpha(0.0f).setDuration(300L).setListener(new v85(this, (byte) 1)).start();
            } else if (imageView2.getParent() != null) {
                ha5Var.a.removeView(ha5Var.x0);
            }
        }
        int i2 = zjcVar.rotatedFrameHeight;
        if (i2 == 0 || (i = zjcVar.rotatedFrameWidth) == 0 || (rd2Var = ha5Var.x) == null) {
            return;
        }
        rd2Var.a(i, i2, this.i0);
    }

    @Override // akc, android.view.ViewGroup, android.view.View
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
        ha5 ha5Var = this.t0;
        v43 v43Var = ha5Var.u0;
        Drawable drawable = ha5Var.v0;
        da5 da5Var = ha5Var.a;
        ImageReceiver imageReceiver = ha5Var.l0;
        ey0 ey0Var = ha5Var.O;
        zjc zjcVar = this.d;
        boolean isFirstFrameRendered = zjcVar.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        qd2 qd2Var = this.i0;
        jb5 jb5Var = this.j0;
        if (!isFirstFrameRendered || (!(zjcVar.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || ha5Var.s0)) {
            float f8 = ha5Var.k0;
            if (f8 != 1.0f) {
                float f9 = f8 + 0.10666667f;
                ha5Var.k0 = f9;
                if (f9 > 1.0f) {
                    ha5Var.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (ha5Var.q0 != null) {
                canvas.save();
                float f10 = this.a0;
                canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (ha5Var.r0 == null) {
                    Paint paint = new Paint(1);
                    ha5Var.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f = 255.0f;
                canvas.drawBitmap(ha5Var.q0, (getMeasuredWidth() - ha5Var.q0.getWidth()) / 2.0f, (getMeasuredHeight() - ha5Var.q0.getHeight()) / 2.0f, ha5Var.r0);
                canvas.restore();
                f2 = 0.0f;
            } else {
                f = 255.0f;
                f2 = 0.0f;
                imageReceiver.i0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(ha5Var.k0);
                imageReceiver.h(canvas, null);
            }
            rd2 rd2Var = ha5Var.x;
            if (rd2Var == qd2Var.z) {
                if (ha5Var.b || !jb5Var.b) {
                    float L = gm.L(48.0f);
                    textPaint.setAlpha(nm7.d4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (gm.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + gm.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (ey0Var.getVisibility() != 4) {
                    ey0Var.setVisibility(4);
                }
            } else if (rd2Var.b && rd2Var.a.self) {
                if (ey0Var.getVisibility() != 0) {
                    ey0Var.setVisibility(0);
                    ey0Var.setScaleX(1.0f);
                    ey0Var.setScaleY(1.0f);
                }
                float f11 = ha5Var.y0 ? f2 : jb5Var.c;
                int L2 = gm.L(33.0f);
                if (ha5Var.r || ha5Var.b) {
                    f3 = 400.0f;
                    i = (int) ts2.i(gm.L(39.0f), jb5Var.c, gm.L(10.0f), L2);
                } else {
                    f3 = 400.0f;
                    i = (int) ((Math.max(1.0f - jb5Var.c, (ha5Var.h || ha5Var.f) ? jb5Var.n : f2) * gm.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - i) / 2;
                boolean z = ha5Var.h;
                float f12 = (z || ha5Var.f) ? jb5Var.n : f2;
                if (ha5Var.b) {
                    f4 = f11;
                } else {
                    f11 = ha5Var.r ? jb5Var.c : f12;
                    f4 = (z || ha5Var.f) ? jb5Var.n : jb5Var.c;
                }
                float f13 = f11;
                int L3 = (int) ((gm.L(17.0f) * f4) + ((((getMeasuredHeight() - i) / 2) - gm.L(28.0f)) - (((((ha5Var.b || ha5Var.r) ? jb5Var.c : f2) * gm.L(74.0f)) + gm.L(17.0f)) * f13)));
                int i3 = L3 + i;
                drawable.setBounds(measuredWidth, L3, measuredWidth + i, i3);
                drawable.draw(canvas);
                float f14 = jb5Var.c;
                if (f14 > f2 || f12 > f2) {
                    float max = Math.max(f14, f12) * f13;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * f));
                    if (ha5Var.r || ha5Var.b) {
                        ey0Var.setAlpha((1.0f - f12) * max);
                    } else {
                        ey0Var.setAlpha(0.0f);
                    }
                    i2 = i3;
                    canvas.drawText(this.n0, (i / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), gm.L(32.0f) + i3, textPaint2);
                } else {
                    ey0Var.setAlpha(f2);
                    i2 = i3;
                }
                ey0Var.setTranslationY(((gm.L(72.0f) + i2) + ha5Var.p0) - this.O);
                ey0Var.setTranslationX(((getMeasuredWidth() - ey0Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (jb5Var.c < 1.0f && f12 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r4, f12)) * 255.0d));
                    canvas.save();
                    canvas.translate((i / 2.0f) + (measuredWidth - (gm.L(f3) / 2.0f)), gm.L(10.0f) + i2);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                if (ey0Var.getVisibility() != 4) {
                    ey0Var.setVisibility(4);
                }
                ef1 ef1Var = this.q0.j4;
                Paint paint2 = ef1Var.c;
                Matrix matrix = ef1Var.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j = ef1Var.h;
                if (j != 0) {
                    long j2 = currentTimeMillis - j;
                    if (j2 > 10) {
                        float f15 = (j2 / 500.0f) + ef1Var.g;
                        ef1Var.g = f15;
                        if (f15 > 4.0f) {
                            ef1Var.g = 0.0f;
                            q78 q78Var = ef1Var.p;
                            if (q78Var != null) {
                                q78Var.run();
                            }
                        }
                        ef1Var.h = currentTimeMillis;
                    }
                } else {
                    ef1Var.h = currentTimeMillis;
                }
                float f16 = ef1Var.g;
                if (f16 <= 1.0f) {
                    int i4 = ef1Var.f;
                    matrix.setTranslate((((i4 + (r10 << 1)) * f16) - ef1Var.e) - ha5Var.getX(), 0.0f);
                    ef1Var.b.setLocalMatrix(matrix);
                    ef1Var.d.setLocalMatrix(matrix);
                    RectF rectF = gm.P;
                    rectF.set(da5Var.P, da5Var.O, da5Var.getMeasuredWidth() - da5Var.P, da5Var.getMeasuredHeight() - da5Var.O);
                    canvas.drawRect(rectF, ef1Var.a);
                    if (ef1Var.k) {
                        if (ef1Var.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f17 = da5Var.b;
                        canvas.drawRoundRect(rectF, f17, f17, paint2);
                    }
                }
            }
            invalidate();
        } else {
            f = 255.0f;
        }
        ImageView imageView = ha5Var.x0;
        if (imageView != null && imageView.getParent() != null) {
            ha5Var.x0.setScaleX(da5Var.d.getScaleX());
            ha5Var.x0.setScaleY(da5Var.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.O) - gm.L(80.0f);
        if (ha5Var.x != qd2Var.z) {
            canvas.save();
            if ((ha5Var.b || ha5Var.r) && !g95.u5 && !g95.v5) {
                measuredHeight = kt6.B(1.0f, jb5Var.a0, gm.L(90.0f) * jb5Var.c, measuredHeight);
            }
            f5 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(ha5Var.E);
            canvas.restore();
        } else {
            f5 = 0.0f;
        }
        boolean z2 = ha5Var.s0;
        float f18 = ha5Var.t0;
        if (z2) {
            f6 = 1.0f;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.064f;
                ha5Var.t0 = f19;
                if (f19 > 1.0f) {
                    ha5Var.t0 = 1.0f;
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
                ha5Var.t0 = f20;
                if (f20 < f5) {
                    ha5Var.t0 = f5;
                } else {
                    invalidate();
                }
            }
            f6 = 1.0f;
        }
        float f21 = ha5Var.t0;
        if (this.c0 != null) {
            float f22 = this.h0;
            float f23 = this.e0;
            f7 = (ha5Var.w0 * f23) + ((f6 - f23) * f22);
        } else {
            f7 = ha5Var.w0;
        }
        float f24 = f21 * f7;
        if (f24 > 0.0f) {
            float L4 = gm.L(48.0f);
            float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
            float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
            if (ha5Var.x == qd2Var.z) {
                measuredHeight2 -= L4 / 2.5f;
            }
            RectF rectF2 = gm.P;
            float f25 = measuredHeight2 + L4;
            rectF2.set((int) measuredWidth2, (int) measuredHeight2, (int) (measuredWidth2 + L4), (int) f25);
            if (f24 != 1.0f) {
                canvas.saveLayerAlpha(rectF2, (int) (f24 * f), 31);
            } else {
                canvas.save();
            }
            v43Var.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            v43Var.draw(canvas);
            canvas.restore();
            float f26 = f24 * jb5Var.c;
            if (f26 <= 0.0f || ha5Var.x == qd2Var.z) {
                return;
            }
            textPaint.setAlpha((int) (f26 * f));
            canvas.drawText(this.r0, (L4 / 2.0f) + (measuredWidth2 - (this.s0 / 2.0f)), f25 + gm.L(16.0f), textPaint);
        }
    }

    @Override // akc, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ha5 ha5Var = this.t0;
        if (!ha5Var.j0 || view != ha5Var.a.d) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float f = ha5Var.e0;
        canvas.scale(f, f, ha5Var.f0, ha5Var.g0);
        canvas.translate(ha5Var.h0, ha5Var.i0);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // akc
    public final void e() {
        super.e();
        ha5 ha5Var = this.t0;
        da5 da5Var = ha5Var.a;
        ImageView imageView = ha5Var.x0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        ha5Var.x0.getLayoutParams().width = da5Var.d.getMeasuredWidth();
        ha5Var.x0.getLayoutParams().height = da5Var.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        ha5 ha5Var = this.t0;
        ha5Var.Q = true;
        ha5Var.invalidate();
        ha5Var.Q = false;
    }

    @Override // akc, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        rd2 rd2Var;
        ha5 ha5Var = this.t0;
        da5 da5Var = ha5Var.a;
        boolean z2 = ha5Var.w;
        zjc zjcVar = this.d;
        if (z2 && ha5Var.R && zjcVar.rotatedFrameHeight != 0 && zjcVar.rotatedFrameWidth != 0) {
            if (ha5Var.h) {
                da5Var.b0 = (byte) 1;
            } else if (ha5Var.b) {
                da5Var.b0 = (byte) 1;
            } else if (this.j0.b) {
                da5Var.b0 = (byte) 0;
            } else if (ha5Var.x.b) {
                da5Var.b0 = (byte) 1;
            } else {
                da5Var.b0 = (byte) 2;
            }
            ha5Var.R = false;
        }
        super.onLayout(z, i, i2, i3, i4);
        int i6 = zjcVar.rotatedFrameHeight;
        if (i6 == 0 || (i5 = zjcVar.rotatedFrameWidth) == 0 || (rd2Var = ha5Var.x) == null) {
            return;
        }
        rd2Var.a(i5, i6, this.i0);
    }

    @Override // akc, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
