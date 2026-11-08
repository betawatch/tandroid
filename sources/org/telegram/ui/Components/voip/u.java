package org.telegram.ui.Components.voip;

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
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.qs;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.ui.Components.uq;
import org.telegram.ui.c40;
import org.telegram.ui.va;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class u extends k2 {
    public float g0;
    public final /* synthetic */ r3 h0;
    public final /* synthetic */ k0 i0;
    public final /* synthetic */ TextPaint j0;
    public final /* synthetic */ StaticLayout k0;
    public final /* synthetic */ TextPaint l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ float n0;
    public final /* synthetic */ StaticLayout o0;
    public final /* synthetic */ c40 p0;
    public final /* synthetic */ String q0;
    public final /* synthetic */ float r0;
    public final /* synthetic */ y s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Context context, r3 r3Var, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, c40 c40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.s0 = yVar;
        this.h0 = r3Var;
        this.i0 = k0Var;
        this.j0 = textPaint;
        this.k0 = staticLayout;
        this.l0 = textPaint2;
        this.m0 = str;
        this.n0 = f10;
        this.o0 = staticLayout2;
        this.p0 = c40Var;
        this.q0 = str2;
        this.r0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.k2
    public final void a() {
        super.a();
        this.g0 = this.s0.w0;
    }

    @Override // org.telegram.ui.Components.voip.k2
    public final void b() {
        int i7;
        s3 s3Var;
        y yVar = this.s0;
        TextView textView = yVar.O;
        u uVar = yVar.a;
        invalidate();
        r3 r3Var = this.h0;
        if (r3Var != null && r3Var.b.rtmp_stream && yVar.z0) {
            org.telegram.messenger.g0.r(yVar.A0);
            yVar.z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            uVar.animate().cancel();
            uVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z9 = yVar.s0;
        j2 j2Var = this.d;
        if (!z9 && j2Var.getAlpha() != 1.0f) {
            j2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = yVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            if (yVar.x0.getAlpha() == 1.0f) {
                yVar.x0.animate().alpha(0.0f).setDuration(300L).setListener(new va(this, 10)).start();
            } else if (yVar.x0.getParent() != null) {
                uVar.removeView(yVar.x0);
            }
        }
        int i10 = j2Var.rotatedFrameHeight;
        if (i10 == 0 || (i7 = j2Var.rotatedFrameWidth) == 0 || (s3Var = yVar.x) == null) {
            return;
        }
        s3Var.a(i7, i10, r3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0462  */
    @Override // org.telegram.ui.Components.voip.k2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        uq uqVar;
        float f11;
        int d;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        y yVar = this.s0;
        uq uqVar2 = yVar.u0;
        Drawable drawable = yVar.v0;
        u uVar = yVar.a;
        ImageReceiver imageReceiver = yVar.l0;
        TextView textView = yVar.O;
        org.telegram.ui.ActionBar.m2 m2Var = yVar.N;
        j2 j2Var = this.d;
        boolean isFirstFrameRendered = j2Var.isFirstFrameRendered();
        TextPaint textPaint = this.j0;
        r3 r3Var = this.h0;
        k0 k0Var = this.i0;
        if (!isFirstFrameRendered || (!(j2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || yVar.s0)) {
            float f16 = yVar.k0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                yVar.k0 = f17;
                if (f17 > 1.0f) {
                    yVar.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (yVar.q0 != null) {
                canvas.save();
                float f18 = this.W;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (yVar.r0 == null) {
                    Paint paint = new Paint(1);
                    yVar.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(yVar.q0, (getMeasuredWidth() - yVar.q0.getWidth()) / 2.0f, (getMeasuredHeight() - yVar.q0.getHeight()) / 2.0f, yVar.r0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.y0(this.O, this.N, getMeasuredWidth() - (this.O * 2.0f), getMeasuredHeight() - (this.N * 2.0f));
                imageReceiver.setAlpha(yVar.k0);
                imageReceiver.h(canvas, null);
            }
            s3 s3Var = yVar.x;
            if (s3Var == r3Var.z) {
                if (yVar.b || !k0Var.b) {
                    float L = org.telegram.messenger.g0.L(48.0f);
                    textPaint.setAlpha(qs.e4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + org.telegram.messenger.g0.L(10.0f));
                    this.k0.draw(canvas);
                    canvas.restore();
                }
                if (m2Var.getVisibility() != 4) {
                    m2Var.setVisibility(4);
                }
                uqVar = uqVar2;
            } else if (s3Var.b && s3Var.a.self) {
                if (m2Var.getVisibility() != 0) {
                    m2Var.setVisibility(0);
                    m2Var.setScaleX(1.0f);
                    m2Var.setScaleY(1.0f);
                }
                float f19 = yVar.y0 ? f10 : k0Var.c;
                int L2 = org.telegram.messenger.g0.L(33.0f);
                if (yVar.r || yVar.b) {
                    f11 = 10.0f;
                    d = (int) rf.b.d(org.telegram.messenger.g0.L(39.0f), k0Var.c, org.telegram.messenger.g0.L(10.0f), L2);
                } else {
                    f11 = 10.0f;
                    d = (int) ((Math.max(1.0f - k0Var.c, (yVar.h || yVar.f) ? k0Var.n : f10) * org.telegram.messenger.g0.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - d) / 2;
                boolean z9 = yVar.h;
                float f20 = (z9 || yVar.f) ? k0Var.n : f10;
                float f21 = f19;
                if (yVar.b) {
                    f12 = f21;
                } else {
                    f12 = yVar.r ? k0Var.c : f20;
                    f21 = (z9 || yVar.f) ? k0Var.n : k0Var.c;
                }
                float f22 = f12;
                int L3 = (int) ((org.telegram.messenger.g0.L(17.0f) * f21) + ((((getMeasuredHeight() - d) / 2) - org.telegram.messenger.g0.L(28.0f)) - (((((yVar.b || yVar.r) ? k0Var.c : f10) * org.telegram.messenger.g0.L(74.0f)) + org.telegram.messenger.g0.L(17.0f)) * f22)));
                uqVar = uqVar2;
                int i10 = L3 + d;
                drawable.setBounds(measuredWidth, L3, measuredWidth + d, i10);
                drawable.draw(canvas);
                float f23 = k0Var.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.l0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (yVar.r || yVar.b) {
                        m2Var.setAlpha((1.0f - f20) * max);
                    } else {
                        m2Var.setAlpha(0.0f);
                    }
                    i7 = i10;
                    canvas.drawText(this.m0, (d / 2.0f) + (measuredWidth - (this.n0 / 2.0f)), org.telegram.messenger.g0.L(32.0f) + i10, textPaint2);
                } else {
                    m2Var.setAlpha(f10);
                    i7 = i10;
                }
                m2Var.setTranslationY(((org.telegram.messenger.g0.L(72.0f) + i7) + yVar.p0) - this.N);
                m2Var.setTranslationX(((getMeasuredWidth() - m2Var.getMeasuredWidth()) / 2.0f) - this.O);
                if (k0Var.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((d / 2.0f) + (measuredWidth - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), org.telegram.messenger.g0.L(f11) + i7);
                    this.o0.draw(canvas);
                    canvas.restore();
                }
            } else {
                uqVar = uqVar2;
                if (m2Var.getVisibility() != 4) {
                    m2Var.setVisibility(4);
                }
                n nVar = this.p0.i4;
                Paint paint2 = nVar.c;
                Matrix matrix = nVar.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = nVar.h;
                if (j3 != 0) {
                    long j10 = currentTimeMillis - j3;
                    if (j10 > 10) {
                        float f24 = (j10 / 500.0f) + nVar.g;
                        nVar.g = f24;
                        if (f24 > 4.0f) {
                            nVar.g = 0.0f;
                            sg.t0 t0Var = nVar.p;
                            if (t0Var != null) {
                                t0Var.run();
                            }
                        }
                        nVar.h = currentTimeMillis;
                    }
                } else {
                    nVar.h = currentTimeMillis;
                }
                float f25 = nVar.g;
                if (f25 <= 1.0f) {
                    int i11 = nVar.f;
                    matrix.setTranslate(((((r10 * 2) + i11) * f25) - nVar.e) - yVar.getX(), 0.0f);
                    nVar.b.setLocalMatrix(matrix);
                    nVar.d.setLocalMatrix(matrix);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(uVar.O, uVar.N, uVar.getMeasuredWidth() - uVar.O, uVar.getMeasuredHeight() - uVar.N);
                    canvas.drawRect(rectF, nVar.a);
                    if (nVar.k) {
                        if (nVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f26 = uVar.b;
                        canvas.drawRoundRect(rectF, f26, f26, paint2);
                    }
                }
            }
            invalidate();
        } else {
            uqVar = uqVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + yVar.p0) - this.N);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.O);
        ImageView imageView = yVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            yVar.x0.setScaleX(uVar.d.getScaleX());
            yVar.x0.setScaleY(uVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.N) - org.telegram.messenger.g0.L(80.0f);
        if (yVar.x != r3Var.z) {
            canvas.save();
            if ((yVar.b || yVar.r) && !c40.w5 && !c40.x5) {
                measuredHeight = com.google.android.recaptcha.internal.a.v(1.0f, k0Var.W, org.telegram.messenger.g0.L(90.0f) * k0Var.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(yVar.D);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z10 = yVar.s0;
        if (!z10 && yVar.t0 == f13) {
            return;
        }
        if (z10) {
            float f27 = yVar.t0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                yVar.t0 = f28;
                if (f28 > 1.0f) {
                    yVar.t0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = yVar.t0;
                if (this.b0 == null) {
                    float f30 = this.g0;
                    float f31 = this.d0;
                    f14 = (yVar.w0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = yVar.w0;
                }
                f15 = f29 * f14;
                if (f15 <= 0.0f) {
                    float L4 = org.telegram.messenger.g0.L(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
                    if (yVar.x == r3Var.z) {
                        measuredHeight2 -= L4 / 2.5f;
                    }
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f32 = measuredHeight2 + L4;
                    rectF2.set((int) measuredWidth2, (int) measuredHeight2, (int) (measuredWidth2 + L4), (int) f32);
                    if (f15 != 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (f15 * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    uq uqVar3 = uqVar;
                    uqVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    uqVar3.draw(canvas);
                    canvas.restore();
                    float f33 = f15 * k0Var.c;
                    if (f33 <= 0.0f || yVar.x == r3Var.z) {
                        return;
                    }
                    textPaint.setAlpha((int) (f33 * 255.0f));
                    canvas.drawText(this.q0, (L4 / 2.0f) + (measuredWidth2 - (this.r0 / 2.0f)), f32 + org.telegram.messenger.g0.L(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f34 = yVar.t0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                yVar.t0 = f35;
                if (f35 < 0.0f) {
                    yVar.t0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = yVar.t0;
        if (this.b0 == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.k2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y yVar = this.s0;
        if (!yVar.j0 || view != yVar.a.d) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = yVar.e0;
        canvas.scale(f10, f10, yVar.f0, yVar.g0);
        canvas.translate(yVar.h0, yVar.i0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.k2
    public final void e() {
        super.e();
        y yVar = this.s0;
        u uVar = yVar.a;
        ImageView imageView = yVar.x0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        yVar.x0.getLayoutParams().width = uVar.d.getMeasuredWidth();
        yVar.x0.getLayoutParams().height = uVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        y yVar = this.s0;
        yVar.Q = true;
        yVar.invalidate();
        yVar.Q = false;
    }

    @Override // org.telegram.ui.Components.voip.k2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        y yVar = this.s0;
        u uVar = yVar.a;
        boolean z10 = yVar.w;
        j2 j2Var = this.d;
        if (z10 && yVar.R && j2Var.rotatedFrameHeight != 0 && j2Var.rotatedFrameWidth != 0) {
            if (yVar.h) {
                uVar.a0 = 1;
            } else if (yVar.b) {
                uVar.a0 = 1;
            } else if (this.i0.b) {
                uVar.a0 = 0;
            } else if (yVar.x.b) {
                uVar.a0 = 1;
            } else {
                uVar.a0 = 2;
            }
            yVar.R = false;
        }
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = j2Var.rotatedFrameHeight;
        if (i14 == 0 || (i13 = j2Var.rotatedFrameWidth) == 0 || (s3Var = yVar.x) == null) {
            return;
        }
        s3Var.a(i13, i14, this.h0);
    }

    @Override // org.telegram.ui.Components.voip.k2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.s0.requestLayout();
        super.requestLayout();
    }
}
