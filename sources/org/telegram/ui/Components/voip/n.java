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
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.dr;
import org.telegram.ui.b50;
import org.telegram.ui.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends y1 {
    public float g0;
    public final /* synthetic */ u3 h0;
    public final /* synthetic */ w i0;
    public final /* synthetic */ TextPaint j0;
    public final /* synthetic */ StaticLayout k0;
    public final /* synthetic */ TextPaint l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ float n0;
    public final /* synthetic */ StaticLayout o0;
    public final /* synthetic */ b50 p0;
    public final /* synthetic */ String q0;
    public final /* synthetic */ float r0;
    public final /* synthetic */ r s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, Context context, u3 u3Var, w wVar, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f7, StaticLayout staticLayout2, b50 b50Var, String str2, float f10) {
        super(context, false, false, true, true);
        this.s0 = rVar;
        this.h0 = u3Var;
        this.i0 = wVar;
        this.j0 = textPaint;
        this.k0 = staticLayout;
        this.l0 = textPaint2;
        this.m0 = str;
        this.n0 = f7;
        this.o0 = staticLayout2;
        this.p0 = b50Var;
        this.q0 = str2;
        this.r0 = f10;
    }

    @Override // org.telegram.ui.Components.voip.y1
    public final void a() {
        super.a();
        this.g0 = this.s0.w0;
    }

    @Override // org.telegram.ui.Components.voip.y1
    public final void b() {
        int i10;
        v3 v3Var;
        r rVar = this.s0;
        TextView textView = rVar.O;
        n nVar = rVar.a;
        invalidate();
        u3 u3Var = this.h0;
        if (u3Var != null && u3Var.b.rtmp_stream && rVar.z0) {
            org.telegram.messenger.i0.r(rVar.A0);
            rVar.z0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            nVar.animate().cancel();
            nVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = rVar.s0;
        x1 x1Var = this.d;
        if (!z10 && x1Var.getAlpha() != 1.0f) {
            x1Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = rVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            if (rVar.x0.getAlpha() == 1.0f) {
                rVar.x0.animate().alpha(0.0f).setDuration(300L).setListener(new s9(this, 22)).start();
            } else if (rVar.x0.getParent() != null) {
                nVar.removeView(rVar.x0);
            }
        }
        int i11 = x1Var.rotatedFrameHeight;
        if (i11 == 0 || (i10 = x1Var.rotatedFrameWidth) == 0 || (v3Var = rVar.x) == null) {
            return;
        }
        v3Var.a(i10, i11, u3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0462  */
    @Override // org.telegram.ui.Components.voip.y1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        dr drVar;
        float f10;
        int d;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        r rVar = this.s0;
        dr drVar2 = rVar.u0;
        Drawable drawable = rVar.v0;
        n nVar = rVar.a;
        ImageReceiver imageReceiver = rVar.l0;
        TextView textView = rVar.O;
        org.telegram.ui.ActionBar.q2 q2Var = rVar.N;
        x1 x1Var = this.d;
        boolean isFirstFrameRendered = x1Var.isFirstFrameRendered();
        TextPaint textPaint = this.j0;
        u3 u3Var = this.h0;
        w wVar = this.i0;
        if (!isFirstFrameRendered || (!(x1Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || rVar.s0)) {
            float f15 = rVar.k0;
            if (f15 != 1.0f) {
                float f16 = f15 + 0.10666667f;
                rVar.k0 = f16;
                if (f16 > 1.0f) {
                    rVar.k0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (rVar.q0 != null) {
                canvas.save();
                float f17 = this.W;
                canvas.scale(f17, f17, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (rVar.r0 == null) {
                    Paint paint = new Paint(1);
                    rVar.r0 = paint;
                    paint.setFilterBitmap(true);
                }
                f7 = 0.0f;
                canvas.drawBitmap(rVar.q0, (getMeasuredWidth() - rVar.q0.getWidth()) / 2.0f, (getMeasuredHeight() - rVar.q0.getHeight()) / 2.0f, rVar.r0);
                canvas.restore();
            } else {
                f7 = 0.0f;
                imageReceiver.y0(this.O, this.N, getMeasuredWidth() - (this.O * 2.0f), getMeasuredHeight() - (this.N * 2.0f));
                imageReceiver.setAlpha(rVar.k0);
                imageReceiver.h(canvas, null);
            }
            v3 v3Var = rVar.x;
            if (v3Var == u3Var.z) {
                if (rVar.b || !wVar.b) {
                    float L = org.telegram.messenger.i0.L(48.0f);
                    textPaint.setAlpha(zs.e4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (org.telegram.messenger.i0.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + org.telegram.messenger.i0.L(10.0f));
                    this.k0.draw(canvas);
                    canvas.restore();
                }
                if (q2Var.getVisibility() != 4) {
                    q2Var.setVisibility(4);
                }
                drVar = drVar2;
            } else if (v3Var.b && v3Var.a.self) {
                if (q2Var.getVisibility() != 0) {
                    q2Var.setVisibility(0);
                    q2Var.setScaleX(1.0f);
                    q2Var.setScaleY(1.0f);
                }
                float f18 = rVar.y0 ? f7 : wVar.c;
                int L2 = org.telegram.messenger.i0.L(33.0f);
                if (rVar.r || rVar.b) {
                    f10 = 10.0f;
                    d = (int) sc.e.d(org.telegram.messenger.i0.L(39.0f), wVar.c, org.telegram.messenger.i0.L(10.0f), L2);
                } else {
                    f10 = 10.0f;
                    d = (int) ((Math.max(1.0f - wVar.c, (rVar.h || rVar.f) ? wVar.n : f7) * org.telegram.messenger.i0.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - d) / 2;
                boolean z10 = rVar.h;
                float f19 = (z10 || rVar.f) ? wVar.n : f7;
                float f20 = f18;
                if (rVar.b) {
                    f11 = f20;
                } else {
                    f11 = rVar.r ? wVar.c : f19;
                    f20 = (z10 || rVar.f) ? wVar.n : wVar.c;
                }
                float f21 = f11;
                int L3 = (int) ((org.telegram.messenger.i0.L(17.0f) * f20) + ((((getMeasuredHeight() - d) / 2) - org.telegram.messenger.i0.L(28.0f)) - (((((rVar.b || rVar.r) ? wVar.c : f7) * org.telegram.messenger.i0.L(74.0f)) + org.telegram.messenger.i0.L(17.0f)) * f21)));
                drVar = drVar2;
                int i11 = L3 + d;
                drawable.setBounds(measuredWidth, L3, measuredWidth + d, i11);
                drawable.draw(canvas);
                float f22 = wVar.c;
                if (f22 > f7 || f19 > f7) {
                    float max = Math.max(f22, f19) * f21;
                    TextPaint textPaint2 = this.l0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (rVar.r || rVar.b) {
                        q2Var.setAlpha((1.0f - f19) * max);
                    } else {
                        q2Var.setAlpha(0.0f);
                    }
                    i10 = i11;
                    canvas.drawText(this.m0, (d / 2.0f) + (measuredWidth - (this.n0 / 2.0f)), org.telegram.messenger.i0.L(32.0f) + i11, textPaint2);
                } else {
                    q2Var.setAlpha(f7);
                    i10 = i11;
                }
                q2Var.setTranslationY(((org.telegram.messenger.i0.L(72.0f) + i10) + rVar.p0) - this.N);
                q2Var.setTranslationX(((getMeasuredWidth() - q2Var.getMeasuredWidth()) / 2.0f) - this.O);
                if (wVar.c < 1.0f && f19 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f19)) * 255.0d));
                    canvas.save();
                    canvas.translate((d / 2.0f) + (measuredWidth - (org.telegram.messenger.i0.L(400.0f) / 2.0f)), org.telegram.messenger.i0.L(f10) + i10);
                    this.o0.draw(canvas);
                    canvas.restore();
                }
            } else {
                drVar = drVar2;
                if (q2Var.getVisibility() != 4) {
                    q2Var.setVisibility(4);
                }
                g gVar = this.p0.i4;
                Paint paint2 = gVar.c;
                Matrix matrix = gVar.i;
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = gVar.h;
                if (j10 != 0) {
                    long j11 = currentTimeMillis - j10;
                    if (j11 > 10) {
                        float f23 = (j11 / 500.0f) + gVar.g;
                        gVar.g = f23;
                        if (f23 > 4.0f) {
                            gVar.g = 0.0f;
                            gg.c cVar = gVar.p;
                            if (cVar != null) {
                                cVar.run();
                            }
                        }
                        gVar.h = currentTimeMillis;
                    }
                } else {
                    gVar.h = currentTimeMillis;
                }
                float f24 = gVar.g;
                if (f24 <= 1.0f) {
                    int i12 = gVar.f;
                    matrix.setTranslate(((((r10 * 2) + i12) * f24) - gVar.e) - rVar.getX(), 0.0f);
                    gVar.b.setLocalMatrix(matrix);
                    gVar.d.setLocalMatrix(matrix);
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(nVar.O, nVar.N, nVar.getMeasuredWidth() - nVar.O, nVar.getMeasuredHeight() - nVar.N);
                    canvas.drawRect(rectF, gVar.a);
                    if (gVar.k) {
                        if (gVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f25 = nVar.b;
                        canvas.drawRoundRect(rectF, f25, f25, paint2);
                    }
                }
            }
            invalidate();
        } else {
            drVar = drVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + rVar.p0) - this.N);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.O);
        ImageView imageView = rVar.x0;
        if (imageView != null && imageView.getParent() != null) {
            rVar.x0.setScaleX(nVar.d.getScaleX());
            rVar.x0.setScaleY(nVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.N) - org.telegram.messenger.i0.L(80.0f);
        if (rVar.x != u3Var.z) {
            canvas.save();
            if ((rVar.b || rVar.r) && !b50.w5 && !b50.x5) {
                measuredHeight = sc.e.z(1.0f, wVar.W, org.telegram.messenger.i0.L(90.0f) * wVar.c, measuredHeight);
            }
            f12 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(rVar.D);
            canvas.restore();
        } else {
            f12 = 0.0f;
        }
        boolean z11 = rVar.s0;
        if (!z11 && rVar.t0 == f12) {
            return;
        }
        if (z11) {
            float f26 = rVar.t0;
            if (f26 != 1.0f) {
                float f27 = f26 + 0.064f;
                rVar.t0 = f27;
                if (f27 > 1.0f) {
                    rVar.t0 = 1.0f;
                } else {
                    invalidate();
                }
                float f28 = rVar.t0;
                if (this.b0 == null) {
                    float f29 = this.g0;
                    float f30 = this.d0;
                    f13 = (rVar.w0 * f30) + ((1.0f - f30) * f29);
                } else {
                    f13 = rVar.w0;
                }
                f14 = f28 * f13;
                if (f14 <= 0.0f) {
                    float L4 = org.telegram.messenger.i0.L(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
                    if (rVar.x == u3Var.z) {
                        measuredHeight2 -= L4 / 2.5f;
                    }
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f31 = measuredHeight2 + L4;
                    rectF2.set((int) measuredWidth2, (int) measuredHeight2, (int) (measuredWidth2 + L4), (int) f31);
                    if (f14 != 1.0f) {
                        canvas.saveLayerAlpha(rectF2, (int) (f14 * 255.0f), 31);
                    } else {
                        canvas.save();
                    }
                    dr drVar3 = drVar;
                    drVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    drVar3.draw(canvas);
                    canvas.restore();
                    float f32 = f14 * wVar.c;
                    if (f32 <= 0.0f || rVar.x == u3Var.z) {
                        return;
                    }
                    textPaint.setAlpha((int) (f32 * 255.0f));
                    canvas.drawText(this.q0, (L4 / 2.0f) + (measuredWidth2 - (this.r0 / 2.0f)), f31 + org.telegram.messenger.i0.L(16.0f), textPaint);
                    return;
                }
                return;
            }
        }
        if (!z11) {
            float f33 = rVar.t0;
            if (f33 != 0.0f) {
                float f34 = f33 - 0.064f;
                rVar.t0 = f34;
                if (f34 < 0.0f) {
                    rVar.t0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f282 = rVar.t0;
        if (this.b0 == null) {
        }
        f14 = f282 * f13;
        if (f14 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.y1, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        r rVar = this.s0;
        if (!rVar.j0 || view != rVar.a.d) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float f7 = rVar.e0;
        canvas.scale(f7, f7, rVar.f0, rVar.g0);
        canvas.translate(rVar.h0, rVar.i0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.y1
    public final void e() {
        super.e();
        r rVar = this.s0;
        n nVar = rVar.a;
        ImageView imageView = rVar.x0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        rVar.x0.getLayoutParams().width = nVar.d.getMeasuredWidth();
        rVar.x0.getLayoutParams().height = nVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        r rVar = this.s0;
        rVar.Q = true;
        rVar.invalidate();
        rVar.Q = false;
    }

    @Override // org.telegram.ui.Components.voip.y1, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        v3 v3Var;
        r rVar = this.s0;
        n nVar = rVar.a;
        boolean z11 = rVar.w;
        x1 x1Var = this.d;
        if (z11 && rVar.R && x1Var.rotatedFrameHeight != 0 && x1Var.rotatedFrameWidth != 0) {
            if (rVar.h) {
                nVar.a0 = 1;
            } else if (rVar.b) {
                nVar.a0 = 1;
            } else if (this.i0.b) {
                nVar.a0 = 0;
            } else if (rVar.x.b) {
                nVar.a0 = 1;
            } else {
                nVar.a0 = 2;
            }
            rVar.R = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = x1Var.rotatedFrameHeight;
        if (i15 == 0 || (i14 = x1Var.rotatedFrameWidth) == 0 || (v3Var = rVar.x) == null) {
            return;
        }
        v3Var.a(i14, i15, this.h0);
    }

    @Override // org.telegram.ui.Components.voip.y1, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.s0.requestLayout();
        super.requestLayout();
    }
}
