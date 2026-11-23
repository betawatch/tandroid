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
import org.telegram.messenger.ls;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.kr;
import org.telegram.ui.f40;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u extends n2 {
    public float h0;
    public final /* synthetic */ t3 i0;
    public final /* synthetic */ k0 j0;
    public final /* synthetic */ TextPaint k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ TextPaint m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ StaticLayout p0;
    public final /* synthetic */ f40 q0;
    public final /* synthetic */ String r0;
    public final /* synthetic */ float s0;
    public final /* synthetic */ y t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, Context context, t3 t3Var, k0 k0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, f40 f40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.t0 = yVar;
        this.i0 = t3Var;
        this.j0 = k0Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f10;
        this.p0 = staticLayout2;
        this.q0 = f40Var;
        this.r0 = str2;
        this.s0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final void a() {
        super.a();
        this.h0 = this.t0.x0;
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final void b() {
        int i7;
        u3 u3Var;
        y yVar = this.t0;
        TextView textView = yVar.P;
        u uVar = yVar.a;
        invalidate();
        t3 t3Var = this.i0;
        if (t3Var != null && t3Var.b.rtmp_stream && yVar.A0) {
            org.telegram.messenger.g0.r(yVar.B0);
            yVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            uVar.animate().cancel();
            uVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = yVar.t0;
        m2 m2Var = this.d;
        if (!z10 && m2Var.getAlpha() != 1.0f) {
            m2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = yVar.y0;
        if (imageView != null && imageView.getParent() != null) {
            if (yVar.y0.getAlpha() == 1.0f) {
                yVar.y0.animate().alpha(0.0f).setDuration(300L).setListener(new y9(this, 11)).start();
            } else if (yVar.y0.getParent() != null) {
                uVar.removeView(yVar.y0);
            }
        }
        int i10 = m2Var.rotatedFrameHeight;
        if (i10 == 0 || (i7 = m2Var.rotatedFrameWidth) == 0 || (u3Var = yVar.x) == null) {
            return;
        }
        u3Var.a(i7, i10, t3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0462  */
    @Override // org.telegram.ui.Components.voip.n2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        kr krVar;
        float f11;
        int e10;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        y yVar = this.t0;
        kr krVar2 = yVar.v0;
        Drawable drawable = yVar.w0;
        u uVar = yVar.a;
        ImageReceiver imageReceiver = yVar.m0;
        TextView textView = yVar.P;
        org.telegram.ui.ActionBar.n2 n2Var = yVar.O;
        m2 m2Var = this.d;
        boolean isFirstFrameRendered = m2Var.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        t3 t3Var = this.i0;
        k0 k0Var = this.j0;
        if (!isFirstFrameRendered || (!(m2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || yVar.t0)) {
            float f16 = yVar.l0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                yVar.l0 = f17;
                if (f17 > 1.0f) {
                    yVar.l0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (yVar.r0 != null) {
                canvas.save();
                float f18 = this.a0;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (yVar.s0 == null) {
                    Paint paint = new Paint(1);
                    yVar.s0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(yVar.r0, (getMeasuredWidth() - yVar.r0.getWidth()) / 2.0f, (getMeasuredHeight() - yVar.r0.getHeight()) / 2.0f, yVar.s0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.y0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(yVar.l0);
                imageReceiver.h(canvas, null);
            }
            u3 u3Var = yVar.x;
            if (u3Var == t3Var.z) {
                if (yVar.b || !k0Var.b) {
                    float L = org.telegram.messenger.g0.L(48.0f);
                    textPaint.setAlpha(ls.e4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + org.telegram.messenger.g0.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (n2Var.getVisibility() != 4) {
                    n2Var.setVisibility(4);
                }
                krVar = krVar2;
            } else if (u3Var.b && u3Var.a.self) {
                if (n2Var.getVisibility() != 0) {
                    n2Var.setVisibility(0);
                    n2Var.setScaleX(1.0f);
                    n2Var.setScaleY(1.0f);
                }
                float f19 = yVar.z0 ? f10 : k0Var.c;
                int L2 = org.telegram.messenger.g0.L(33.0f);
                if (yVar.r || yVar.b) {
                    f11 = 10.0f;
                    e10 = (int) p5.c.e(org.telegram.messenger.g0.L(39.0f), k0Var.c, org.telegram.messenger.g0.L(10.0f), L2);
                } else {
                    f11 = 10.0f;
                    e10 = (int) ((Math.max(1.0f - k0Var.c, (yVar.h || yVar.f) ? k0Var.n : f10) * org.telegram.messenger.g0.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - e10) / 2;
                boolean z10 = yVar.h;
                float f20 = (z10 || yVar.f) ? k0Var.n : f10;
                float f21 = f19;
                if (yVar.b) {
                    f12 = f21;
                } else {
                    f12 = yVar.r ? k0Var.c : f20;
                    f21 = (z10 || yVar.f) ? k0Var.n : k0Var.c;
                }
                float f22 = f12;
                int L3 = (int) ((org.telegram.messenger.g0.L(17.0f) * f21) + ((((getMeasuredHeight() - e10) / 2) - org.telegram.messenger.g0.L(28.0f)) - (((((yVar.b || yVar.r) ? k0Var.c : f10) * org.telegram.messenger.g0.L(74.0f)) + org.telegram.messenger.g0.L(17.0f)) * f22)));
                krVar = krVar2;
                int i10 = L3 + e10;
                drawable.setBounds(measuredWidth, L3, measuredWidth + e10, i10);
                drawable.draw(canvas);
                float f23 = k0Var.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (yVar.r || yVar.b) {
                        n2Var.setAlpha((1.0f - f20) * max);
                    } else {
                        n2Var.setAlpha(0.0f);
                    }
                    i7 = i10;
                    canvas.drawText(this.n0, (e10 / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), org.telegram.messenger.g0.L(32.0f) + i10, textPaint2);
                } else {
                    n2Var.setAlpha(f10);
                    i7 = i10;
                }
                n2Var.setTranslationY(((org.telegram.messenger.g0.L(72.0f) + i7) + yVar.q0) - this.O);
                n2Var.setTranslationX(((getMeasuredWidth() - n2Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (k0Var.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((e10 / 2.0f) + (measuredWidth - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), org.telegram.messenger.g0.L(f11) + i7);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                krVar = krVar2;
                if (n2Var.getVisibility() != 4) {
                    n2Var.setVisibility(4);
                }
                n nVar = this.q0.q4;
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
                            org.telegram.ui.web.z0 z0Var = nVar.p;
                            if (z0Var != null) {
                                z0Var.run();
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
                    rectF.set(uVar.P, uVar.O, uVar.getMeasuredWidth() - uVar.P, uVar.getMeasuredHeight() - uVar.O);
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
            krVar = krVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + yVar.q0) - this.O);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.P);
        ImageView imageView = yVar.y0;
        if (imageView != null && imageView.getParent() != null) {
            yVar.y0.setScaleX(uVar.d.getScaleX());
            yVar.y0.setScaleY(uVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(80.0f);
        if (yVar.x != t3Var.z) {
            canvas.save();
            if ((yVar.b || yVar.r) && !f40.E5 && !f40.F5) {
                measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, k0Var.a0, org.telegram.messenger.g0.L(90.0f) * k0Var.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(yVar.E);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z11 = yVar.t0;
        if (!z11 && yVar.u0 == f13) {
            return;
        }
        if (z11) {
            float f27 = yVar.u0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                yVar.u0 = f28;
                if (f28 > 1.0f) {
                    yVar.u0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = yVar.u0;
                if (this.c0 == null) {
                    float f30 = this.h0;
                    float f31 = this.e0;
                    f14 = (yVar.x0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = yVar.x0;
                }
                f15 = f29 * f14;
                if (f15 <= 0.0f) {
                    float L4 = org.telegram.messenger.g0.L(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
                    if (yVar.x == t3Var.z) {
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
                    kr krVar3 = krVar;
                    krVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    krVar3.draw(canvas);
                    canvas.restore();
                    float f33 = f15 * k0Var.c;
                    if (f33 <= 0.0f || yVar.x == t3Var.z) {
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
            float f34 = yVar.u0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                yVar.u0 = f35;
                if (f35 < 0.0f) {
                    yVar.u0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = yVar.u0;
        if (this.c0 == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.n2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        y yVar = this.t0;
        if (!yVar.k0 || view != yVar.a.d) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = yVar.f0;
        canvas.scale(f10, f10, yVar.g0, yVar.h0);
        canvas.translate(yVar.i0, yVar.j0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.n2
    public final void e() {
        super.e();
        y yVar = this.t0;
        u uVar = yVar.a;
        ImageView imageView = yVar.y0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        yVar.y0.getLayoutParams().width = uVar.d.getMeasuredWidth();
        yVar.y0.getLayoutParams().height = uVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        y yVar = this.t0;
        yVar.R = true;
        yVar.invalidate();
        yVar.R = false;
    }

    @Override // org.telegram.ui.Components.voip.n2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        u3 u3Var;
        y yVar = this.t0;
        u uVar = yVar.a;
        boolean z11 = yVar.w;
        m2 m2Var = this.d;
        if (z11 && yVar.S && m2Var.rotatedFrameHeight != 0 && m2Var.rotatedFrameWidth != 0) {
            if (yVar.h) {
                uVar.b0 = 1;
            } else if (yVar.b) {
                uVar.b0 = 1;
            } else if (this.j0.b) {
                uVar.b0 = 0;
            } else if (yVar.x.b) {
                uVar.b0 = 1;
            } else {
                uVar.b0 = 2;
            }
            yVar.S = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = m2Var.rotatedFrameHeight;
        if (i14 == 0 || (i13 = m2Var.rotatedFrameWidth) == 0 || (u3Var = yVar.x) == null) {
            return;
        }
        u3Var.a(i13, i14, this.i0);
    }

    @Override // org.telegram.ui.Components.voip.n2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
