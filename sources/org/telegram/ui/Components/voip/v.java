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
import org.telegram.messenger.ns;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.br;
import org.telegram.ui.c40;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v extends o2 {
    public float h0;
    public final /* synthetic */ r3 i0;
    public final /* synthetic */ l0 j0;
    public final /* synthetic */ TextPaint k0;
    public final /* synthetic */ StaticLayout l0;
    public final /* synthetic */ TextPaint m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ float o0;
    public final /* synthetic */ StaticLayout p0;
    public final /* synthetic */ c40 q0;
    public final /* synthetic */ String r0;
    public final /* synthetic */ float s0;
    public final /* synthetic */ z t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, Context context, r3 r3Var, l0 l0Var, TextPaint textPaint, StaticLayout staticLayout, TextPaint textPaint2, String str, float f10, StaticLayout staticLayout2, c40 c40Var, String str2, float f11) {
        super(context, false, false, true, true);
        this.t0 = zVar;
        this.i0 = r3Var;
        this.j0 = l0Var;
        this.k0 = textPaint;
        this.l0 = staticLayout;
        this.m0 = textPaint2;
        this.n0 = str;
        this.o0 = f10;
        this.p0 = staticLayout2;
        this.q0 = c40Var;
        this.r0 = str2;
        this.s0 = f11;
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final void a() {
        super.a();
        this.h0 = this.t0.x0;
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final void b() {
        int i7;
        s3 s3Var;
        z zVar = this.t0;
        TextView textView = zVar.P;
        v vVar = zVar.a;
        invalidate();
        r3 r3Var = this.i0;
        if (r3Var != null && r3Var.b.rtmp_stream && zVar.A0) {
            org.telegram.messenger.g0.r(zVar.B0);
            zVar.A0 = false;
            textView.animate().cancel();
            textView.animate().alpha(0.0f).setDuration(150L).start();
            vVar.animate().cancel();
            vVar.animate().alpha(1.0f).setDuration(150L).start();
        }
        boolean z10 = zVar.t0;
        n2 n2Var = this.d;
        if (!z10 && n2Var.getAlpha() != 1.0f) {
            n2Var.animate().setDuration(300L).alpha(1.0f);
        }
        TextureView textureView = this.e;
        if (textureView != null && textureView.getAlpha() != 1.0f) {
            textureView.animate().setDuration(300L).alpha(1.0f);
        }
        ImageView imageView = zVar.y0;
        if (imageView != null && imageView.getParent() != null) {
            if (zVar.y0.getAlpha() == 1.0f) {
                zVar.y0.animate().alpha(0.0f).setDuration(300L).setListener(new w9(this, 11)).start();
            } else if (zVar.y0.getParent() != null) {
                vVar.removeView(zVar.y0);
            }
        }
        int i10 = n2Var.rotatedFrameHeight;
        if (i10 == 0 || (i7 = n2Var.rotatedFrameWidth) == 0 || (s3Var = zVar.x) == null) {
            return;
        }
        s3Var.a(i7, i10, r3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0462  */
    @Override // org.telegram.ui.Components.voip.o2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        br brVar;
        float f11;
        int e10;
        float f12;
        int i7;
        float f13;
        float f14;
        float f15;
        z zVar = this.t0;
        br brVar2 = zVar.v0;
        Drawable drawable = zVar.w0;
        v vVar = zVar.a;
        ImageReceiver imageReceiver = zVar.m0;
        TextView textView = zVar.P;
        org.telegram.ui.ActionBar.l2 l2Var = zVar.O;
        n2 n2Var = this.d;
        boolean isFirstFrameRendered = n2Var.isFirstFrameRendered();
        TextPaint textPaint = this.k0;
        r3 r3Var = this.i0;
        l0 l0Var = this.j0;
        if (!isFirstFrameRendered || (!(n2Var.getAlpha() == 1.0f || this.e.getAlpha() == 1.0f) || zVar.t0)) {
            float f16 = zVar.l0;
            if (f16 != 1.0f) {
                float f17 = f16 + 0.10666667f;
                zVar.l0 = f17;
                if (f17 > 1.0f) {
                    zVar.l0 = 1.0f;
                } else {
                    invalidate();
                }
            }
            if (zVar.r0 != null) {
                canvas.save();
                float f18 = this.a0;
                canvas.scale(f18, f18, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
                if (zVar.s0 == null) {
                    Paint paint = new Paint(1);
                    zVar.s0 = paint;
                    paint.setFilterBitmap(true);
                }
                f10 = 0.0f;
                canvas.drawBitmap(zVar.r0, (getMeasuredWidth() - zVar.r0.getWidth()) / 2.0f, (getMeasuredHeight() - zVar.r0.getHeight()) / 2.0f, zVar.s0);
                canvas.restore();
            } else {
                f10 = 0.0f;
                imageReceiver.y0(this.P, this.O, getMeasuredWidth() - (this.P * 2.0f), getMeasuredHeight() - (this.O * 2.0f));
                imageReceiver.setAlpha(zVar.l0);
                imageReceiver.h(canvas, null);
            }
            s3 s3Var = zVar.x;
            if (s3Var == r3Var.z) {
                if (zVar.b || !l0Var.b) {
                    float L = org.telegram.messenger.g0.L(48.0f);
                    textPaint.setAlpha(ns.e4);
                    canvas.save();
                    canvas.translate((L / 2.0f) + (((getMeasuredWidth() - L) / 2.0f) - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), ((getMeasuredHeight() / 2) - L) + L + org.telegram.messenger.g0.L(10.0f));
                    this.l0.draw(canvas);
                    canvas.restore();
                }
                if (l2Var.getVisibility() != 4) {
                    l2Var.setVisibility(4);
                }
                brVar = brVar2;
            } else if (s3Var.b && s3Var.a.self) {
                if (l2Var.getVisibility() != 0) {
                    l2Var.setVisibility(0);
                    l2Var.setScaleX(1.0f);
                    l2Var.setScaleY(1.0f);
                }
                float f19 = zVar.z0 ? f10 : l0Var.c;
                int L2 = org.telegram.messenger.g0.L(33.0f);
                if (zVar.r || zVar.b) {
                    f11 = 10.0f;
                    e10 = (int) r.b.e(org.telegram.messenger.g0.L(39.0f), l0Var.c, org.telegram.messenger.g0.L(10.0f), L2);
                } else {
                    f11 = 10.0f;
                    e10 = (int) ((Math.max(1.0f - l0Var.c, (zVar.h || zVar.f) ? l0Var.n : f10) * org.telegram.messenger.g0.L(10.0f)) + L2);
                }
                int measuredWidth = (getMeasuredWidth() - e10) / 2;
                boolean z10 = zVar.h;
                float f20 = (z10 || zVar.f) ? l0Var.n : f10;
                float f21 = f19;
                if (zVar.b) {
                    f12 = f21;
                } else {
                    f12 = zVar.r ? l0Var.c : f20;
                    f21 = (z10 || zVar.f) ? l0Var.n : l0Var.c;
                }
                float f22 = f12;
                int L3 = (int) ((org.telegram.messenger.g0.L(17.0f) * f21) + ((((getMeasuredHeight() - e10) / 2) - org.telegram.messenger.g0.L(28.0f)) - (((((zVar.b || zVar.r) ? l0Var.c : f10) * org.telegram.messenger.g0.L(74.0f)) + org.telegram.messenger.g0.L(17.0f)) * f22)));
                brVar = brVar2;
                int i10 = L3 + e10;
                drawable.setBounds(measuredWidth, L3, measuredWidth + e10, i10);
                drawable.draw(canvas);
                float f23 = l0Var.c;
                if (f23 > f10 || f20 > f10) {
                    float max = Math.max(f23, f20) * f22;
                    TextPaint textPaint2 = this.m0;
                    textPaint2.setAlpha((int) (max * 255.0f));
                    if (zVar.r || zVar.b) {
                        l2Var.setAlpha((1.0f - f20) * max);
                    } else {
                        l2Var.setAlpha(0.0f);
                    }
                    i7 = i10;
                    canvas.drawText(this.n0, (e10 / 2.0f) + (measuredWidth - (this.o0 / 2.0f)), org.telegram.messenger.g0.L(32.0f) + i10, textPaint2);
                } else {
                    l2Var.setAlpha(f10);
                    i7 = i10;
                }
                l2Var.setTranslationY(((org.telegram.messenger.g0.L(72.0f) + i7) + zVar.q0) - this.O);
                l2Var.setTranslationX(((getMeasuredWidth() - l2Var.getMeasuredWidth()) / 2.0f) - this.P);
                if (l0Var.c < 1.0f && f20 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0d - Math.max(r3, f20)) * 255.0d));
                    canvas.save();
                    canvas.translate((e10 / 2.0f) + (measuredWidth - (org.telegram.messenger.g0.L(400.0f) / 2.0f)), org.telegram.messenger.g0.L(f11) + i7);
                    this.p0.draw(canvas);
                    canvas.restore();
                }
            } else {
                brVar = brVar2;
                if (l2Var.getVisibility() != 4) {
                    l2Var.setVisibility(4);
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
                            q2.d dVar = nVar.p;
                            if (dVar != null) {
                                dVar.run();
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
                    matrix.setTranslate(((((r10 * 2) + i11) * f25) - nVar.e) - zVar.getX(), 0.0f);
                    nVar.b.setLocalMatrix(matrix);
                    nVar.d.setLocalMatrix(matrix);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(vVar.P, vVar.O, vVar.getMeasuredWidth() - vVar.P, vVar.getMeasuredHeight() - vVar.O);
                    canvas.drawRect(rectF, nVar.a);
                    if (nVar.k) {
                        if (nVar.l) {
                            rectF.inset(paint2.getStrokeWidth() / 2.0f, paint2.getStrokeWidth() / 2.0f);
                        }
                        float f26 = vVar.b;
                        canvas.drawRoundRect(rectF, f26, f26, paint2);
                    }
                }
            }
            invalidate();
        } else {
            brVar = brVar2;
        }
        textView.setTranslationY((((getMeasuredHeight() - textView.getMeasuredHeight()) / 2.0f) + zVar.q0) - this.O);
        textView.setTranslationX(((getMeasuredWidth() - textView.getMeasuredWidth()) / 2.0f) - this.P);
        ImageView imageView = zVar.y0;
        if (imageView != null && imageView.getParent() != null) {
            zVar.y0.setScaleX(vVar.d.getScaleX());
            zVar.y0.setScaleY(vVar.d.getScaleY());
        }
        super.dispatchDraw(canvas);
        float measuredHeight = (getMeasuredHeight() - this.O) - org.telegram.messenger.g0.L(80.0f);
        if (zVar.x != r3Var.z) {
            canvas.save();
            if ((zVar.b || zVar.r) && !c40.E5 && !c40.F5) {
                measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, l0Var.a0, org.telegram.messenger.g0.L(90.0f) * l0Var.c, measuredHeight);
            }
            f13 = 0.0f;
            canvas.translate(0.0f, measuredHeight);
            canvas.drawPaint(zVar.E);
            canvas.restore();
        } else {
            f13 = 0.0f;
        }
        boolean z11 = zVar.t0;
        if (!z11 && zVar.u0 == f13) {
            return;
        }
        if (z11) {
            float f27 = zVar.u0;
            if (f27 != 1.0f) {
                float f28 = f27 + 0.064f;
                zVar.u0 = f28;
                if (f28 > 1.0f) {
                    zVar.u0 = 1.0f;
                } else {
                    invalidate();
                }
                float f29 = zVar.u0;
                if (this.c0 == null) {
                    float f30 = this.h0;
                    float f31 = this.e0;
                    f14 = (zVar.x0 * f31) + ((1.0f - f31) * f30);
                } else {
                    f14 = zVar.x0;
                }
                f15 = f29 * f14;
                if (f15 <= 0.0f) {
                    float L4 = org.telegram.messenger.g0.L(48.0f);
                    float measuredWidth2 = (getMeasuredWidth() - L4) / 2.0f;
                    float measuredHeight2 = (getMeasuredHeight() - L4) / 2.0f;
                    if (zVar.x == r3Var.z) {
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
                    br brVar3 = brVar;
                    brVar3.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                    brVar3.draw(canvas);
                    canvas.restore();
                    float f33 = f15 * l0Var.c;
                    if (f33 <= 0.0f || zVar.x == r3Var.z) {
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
            float f34 = zVar.u0;
            if (f34 != 0.0f) {
                float f35 = f34 - 0.064f;
                zVar.u0 = f35;
                if (f35 < 0.0f) {
                    zVar.u0 = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        float f292 = zVar.u0;
        if (this.c0 == null) {
        }
        f15 = f292 * f14;
        if (f15 <= 0.0f) {
        }
    }

    @Override // org.telegram.ui.Components.voip.o2, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z zVar = this.t0;
        if (!zVar.k0 || view != zVar.a.d) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        float f10 = zVar.f0;
        canvas.scale(f10, f10, zVar.g0, zVar.h0);
        canvas.translate(zVar.i0, zVar.j0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.voip.o2
    public final void e() {
        super.e();
        z zVar = this.t0;
        v vVar = zVar.a;
        ImageView imageView = zVar.y0;
        if (imageView == null || imageView.getParent() == null) {
            return;
        }
        zVar.y0.getLayoutParams().width = vVar.d.getMeasuredWidth();
        zVar.y0.getLayoutParams().height = vVar.d.getMeasuredHeight();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        z zVar = this.t0;
        zVar.R = true;
        zVar.invalidate();
        zVar.R = false;
    }

    @Override // org.telegram.ui.Components.voip.o2, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        s3 s3Var;
        z zVar = this.t0;
        v vVar = zVar.a;
        boolean z11 = zVar.w;
        n2 n2Var = this.d;
        if (z11 && zVar.S && n2Var.rotatedFrameHeight != 0 && n2Var.rotatedFrameWidth != 0) {
            if (zVar.h) {
                vVar.b0 = 1;
            } else if (zVar.b) {
                vVar.b0 = 1;
            } else if (this.j0.b) {
                vVar.b0 = 0;
            } else if (zVar.x.b) {
                vVar.b0 = 1;
            } else {
                vVar.b0 = 2;
            }
            zVar.S = false;
        }
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = n2Var.rotatedFrameHeight;
        if (i14 == 0 || (i13 = n2Var.rotatedFrameWidth) == 0 || (s3Var = zVar.x) == null) {
            return;
        }
        s3Var.a(i13, i14, this.i0);
    }

    @Override // org.telegram.ui.Components.voip.o2, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.t0.requestLayout();
        super.requestLayout();
    }
}
