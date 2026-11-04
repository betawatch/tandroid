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
import org.telegram.messenger.hs;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.uq;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends z1 {
    public float h0;
    public final /* synthetic */ r3 i0;
    public final /* synthetic */ x j0;
    public final /* synthetic */ TextPaint k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ TextPaint m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ StaticLayout p0;
    public final /* synthetic */ x30 q0;
    public final /* synthetic */ String r0;
    public final /* synthetic */ float s0;
    public final /* synthetic */ r t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, Context context, r3 r3Var, x xVar, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, x30 x30Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.t0 = rVar;
        this.i0 = r3Var;
        this.j0 = xVar;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f10;
        this.p0 = staticLayout2;
        this.q0 = x30Var;
        this.r0 = str2;
        this.s0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.z1
    public final void a() {
        super.a();
        this.h0 = this.t0.x0;
    }

    @Override // org.telegram.ui.Components.voip.z1
    public final void b() {
        int i3;
        s3 s3Var;
        r rVar = this.t0;
        TextView textView = rVar.P;
        n nVar = rVar.a;
        invalidate();
        r3 r3Var = this.i0;
        if (r3Var != null && r3Var.b.rtmp_stream && rVar.A0) {
            org.telegram.messenger.g0.r(rVar.B0);
            rVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            nVar.animate().cancel();
            nVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = rVar.t0;
        y1 y1Var = this.d;
        if (!z10 && y1Var.getAlpha() != 1.0f) {
            y1Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = rVar.y0;
        if (imageView != null && imageView.getParent() != null) {
            if (rVar.y0.getAlpha() == 1.0f) {
                rVar.y0.animate().alpha(0.0f).setDuration(300L).setListener(new w9(this, 11)).start();
            } else if (rVar.y0.getParent() != null) {
                nVar.removeView(rVar.y0);
            }
        }
        int i10 = y1Var.rotatedFrameHeight;
        if (i10 == 0 || (i3 = y1Var.rotatedFrameWidth) == 0 || (s3Var = rVar.x) == null) {
            return;
        }
        s3Var.a(i3, i10, r3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0462  */
    @Override // org.telegram.ui.Components.voip.z1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        uq uqVar;
        float f11;
        int c2;
        float f12;
        int i3;
        float f13;
        float f14;
        float f15;
        r rVar = this.t0;
        uq uqVar2 = rVar.v0;
        Drawable drawable = rVar.w0;
        n nVar = rVar.a;
        ImageReceiver imageReceiver = rVar.m0;
        TextView textView = rVar.P;
        org.telegram.ui.ActionBar.k2 k2Var = rVar.O;
        y1 y1Var = this.d;
        boolean isFirstFrameRendered = y1Var.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        r3 r3Var = this.i0;
        x xVar = this.j0;
        if (!isFirstFrameRendered || (!(y1Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || rVar.t0)) {
            float f16 = rVar.l0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                rVar.l0 = f17;
                if (f17 > 1.0f) {
                    rVar.l0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (rVar.r0 != null) {
                canvas.save();
                float f18 = this.a0;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (rVar.s0 == null) {
                    Paint paint = new Paint(1);
                    rVar.s0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(rVar.r0, (getMeasuredWidth() - rVar.r0.getWidth()) / 2.0f, (getMeasuredHeight() - rVar.r0.getHeight()) / 2.0f, rVar.s0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.y0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(rVar.l0);
                imageReceiver.h(canvas, null);
            }
            s3 s3Var = rVar.x;
            if (s3Var == r3Var.z) {
                if (rVar.b || !xVar.b) {
                    float L = org.telegram.messenger.g0.L(48.0f);
                    textPaint.setAlpha(hs.e4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + org.telegram.messenger.g0.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (k2Var.getVisibility() != 4) {
                    k2Var.setVisibility(4);
                }
                uqVar = uqVar2;
            } else if (s3Var.b && s3Var.a.self) {
                if (k2Var.getVisibility() != 0) {
                    k2Var.setVisibility(0);
                    k2Var.setScaleX(1.0f);
                    k2Var.setScaleY(1.0f);
                }
                float f19 = rVar.z0 ? f10 : xVar.c;
                int L2 = org.telegram.messenger.g0.L(33.0f);
                if (rVar.r || rVar.b) {
                    f11 = 10.0f;
                    c2 = (int) t4.c.c(org.telegram.messenger.g0.L(39.0f), xVar.c, org.telegram.messenger.g0.L(10.0f), L2);
                } else {
                    f11 = 10.0f;
                    c2 = (int) ((Math.max(1.0f - xVar.c, (rVar.h || rVar.f) ? xVar.n : f10) * org.telegram.messenger.g0.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - c2) / 2;
                boolean z10 = rVar.h;
                float f20 = (z10 || rVar.f) ? xVar.n : f10;
                float f21 = f19;
                if (rVar.b) {
                    f12 = f21;
                } else {
                    f12 = rVar.r ? xVar.c : f20;
                    f21 = (z10 || rVar.f) ? xVar.n : xVar.c;
                }
                float f22 = f12;
                int L3 = (int) ((org.telegram.messenger.g0.L(17.0f) * f21) + ((((getMeasuredHeight() - c2) / 2) - org.telegram.messenger.g0.L(28.0f)) - (((((rVar.b || rVar.r) ? xVar.c : f10) * org.telegram.messenger.g0.L(74.0f)) + org.telegram.messenger.g0.L(17.0f)) * f22)));
                uqVar = uqVar2;
                int i10 = L3 + c2;
                drawable.setBounds(measuredWidth, L3, measuredWidth + c2, i10);
                drawable.draw(canvas);
                float f23 = xVar.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (rVar.r || rVar.b) {
                        k2Var.setAlpha((1.0f - f20) * max);
                    } else {
                        k2Var.setAlpha(0.0f);
                    }
                    i3 = i10;
                    canvas.drawText(this.n0, (c2 / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), org.telegram.messenger.g0.L(32.0f) + i10, textPaint2);
                } else {
                    k2Var.setAlpha(f10);
                    i3 = i10;
                }
                k2Var.setTranslationY(((org.telegram.messenger.g0.L(72.0f) + i3) + rVar.q0) - this.O);
                k2Var.setTranslationX(((getMeasuredWidth() - k2Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (xVar.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((c2 / 2.0f) + (measuredWidth - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), org.telegram.messenger.g0.L(f11) + i3);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                uqVar = uqVar2;
                if (k2Var.getVisibility() != 4) {
                    k2Var.setVisibility(4);
                }
                g gVar = this.q0.j4;
                Paint paint2 = gVar.c;
                Matrix matrix = gVar.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = gVar.h;
                if (j10 != 0) {
                    long j11 = currentTimeMillis - j10;
                    if (j11 > 10) {
                        float f24 = (j11 / 500.0f) + gVar.g;
                        gVar.g = f24;
                        if (f24 > 4.0f) {
                            gVar.g = 0.0f;
                            r4.u uVar = gVar.p;
                            if (uVar != null) {
                                uVar.run();
                            }
                        }
                        gVar.h = currentTimeMillis;
                    }
                } else {
                    gVar.h = currentTimeMillis;
                }
                float f25 = gVar.g;
                if (f25 <= 1.0f) {
                    int i11 = gVar.f;
                    matrix.setTranslate(((((r10 * 2) + i11) * f25) - gVar.e) - rVar.getX(), 0.0f);
                    gVar.b.setLocalMatrix(matrix);
                    gVar.d.setLocalMatrix(matrix);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(nVar.P, nVar.O, nVar.getMeasuredWidth() - nVar.P, nVar.getMeasuredHeight() - nVar.O);
                    canvas.drawRect(rectF, gVar.a);
                    if (gVar.k) {
                        if (gVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f26 = nVar.b;
                        canvas.drawRoundRect(rectF, f26, f26, paint2);
                    }
                }
            }
            invalidate();
        } else {
            uqVar = uqVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + rVar.q0) - this.O);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.P);
        ImageView imageView = rVar.y0;
        if (imageView != null && imageView.getParent() != null) {
            rVar.y0.setScaleX(nVar.d.getScaleX());
            rVar.y0.setScaleY(nVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(80.0f);
        if (rVar.x != r3Var.z) {
            canvas.save();
            if ((rVar.b || rVar.r) && !x30.x5 && !x30.y5) {
                measuredHeight = a1.g.D(1.0f, xVar.a0, org.telegram.messenger.g0.L(90.0f) * xVar.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(rVar.E);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z11 = rVar.t0;
        if (!z11 && rVar.u0 == f13) {
            return;
        }
        if (z11) {
            float f27 = rVar.u0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                rVar.u0 = f28;
                if (f28 > 1.0f) {
                    rVar.u0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = rVar.u0;
                if (this.c0 == null) {
                    float f30 = this.h0;
                    float f31 = this.e0;
                    f14 = (rVar.x0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = rVar.x0;
                }
                f15 = f29 * f14;
                if (f15 <= 0.0f) {
                    float L4 = org.telegram.messenger.g0.L(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
                    if (rVar.x == r3Var.z) {
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
                    float f33 = f15 * xVar.c;
                    if (f33 <= 0.0f || rVar.x == r3Var.z) {
                        return;
                    }
                    textPaint.setAlpha((int) (f33 * 255.0f));
                    canvas.drawText(this.r0, (L4 / 2.0f) + (measuredWidth2 - (this.s0 / 2.0f)), f32 + org.telegram.messenger.g0.L(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z11) {
            float f34 = rVar.u0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                rVar.u0 = f35;
                if (f35 < 0.0f) {
                    rVar.u0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = rVar.u0;
        if (this.c0 == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.z1, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r rVar = this.t0;
        if (!rVar.k0 || view != rVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f10 = rVar.f0;
        canvas.scale(f10, f10, rVar.g0, rVar.h0);
        canvas.translate(rVar.i0, rVar.j0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.z1
    public final void e() {
        super.e();
        r rVar = this.t0;
        n nVar = rVar.a;
        ImageView imageView = rVar.y0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        rVar.y0.getLayoutParams().width = nVar.d.getMeasuredWidth();
        rVar.y0.getLayoutParams().height = nVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        r rVar = this.t0;
        rVar.R = true;
        rVar.invalidate();
        rVar.R = false;
    }

    @Override // org.telegram.ui.Components.voip.z1, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        r rVar = this.t0;
        n nVar = rVar.a;
        boolean z11 = rVar.w;
        y1 y1Var = this.d;
        if (z11 && rVar.S && y1Var.rotatedFrameHeight != 0 && y1Var.rotatedFrameWidth != 0) {
            if (rVar.h) {
                nVar.b0 = 1;
            } else if (rVar.b) {
                nVar.b0 = 1;
            } else if (this.j0.b) {
                nVar.b0 = 0;
            } else if (rVar.x.b) {
                nVar.b0 = 1;
            } else {
                nVar.b0 = 2;
            }
            rVar.S = false;
        }
        super.onLayout(z10, i3, i10, i11, i12);
        int i14 = y1Var.rotatedFrameHeight;
        if (i14 == 0 || (i13 = y1Var.rotatedFrameWidth) == 0 || (s3Var = rVar.x) == null) {
            return;
        }
        s3Var.a(i13, i14, this.i0);
    }

    @Override // org.telegram.ui.Components.voip.z1, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
