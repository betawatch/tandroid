package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class nv0 extends org.telegram.ui.Components.k9 implements org.telegram.ui.Components.nt0 {
    public static final r0 h0 = new r0("crossfadeProgress", 4);
    public boolean H;
    public float I;
    public float J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final Path O;
    public final RectF P;
    public final Paint Q;
    public boolean R;
    public float S;
    public float T;
    public ImageReceiver U;
    public final ImageReceiver V;
    public float W;
    public org.telegram.messenger.cc a0;
    public boolean b0;
    public float c0;
    public org.telegram.ui.Components.vf0 d0;
    public boolean e0;
    public float f0;
    public Runnable g0;

    public nv0(Context context) {
        super(context);
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.O = new Path();
        this.P = new RectF();
        this.R = true;
        this.S = 1.0f;
        this.b0 = true;
        this.f0 = 1.0f;
        this.g0 = null;
        setLayerType(2, null);
        this.V = new ImageReceiver(this);
        Paint paint = new Paint(1);
        this.Q = paint;
        paint.setColor(-16777216);
    }

    @Override // org.telegram.ui.Components.nt0
    public final void f(Runnable runnable) {
        this.g0 = runnable;
    }

    public float getForegroundAlpha() {
        return this.W;
    }

    public org.telegram.ui.Components.ig getPrevFragment() {
        return null;
    }

    public int getRoundRadiusForExpand() {
        return !this.N ? getRoundRadius()[0] : this.L;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        org.telegram.ui.Components.vf0 vf0Var = this.d0;
        if (vf0Var != null) {
            vf0Var.invalidate();
        }
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.P();
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V.R();
        org.telegram.messenger.cc ccVar = this.a0;
        if (ccVar != null) {
            ccVar.a();
            this.a0 = null;
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.nf0 nf0Var;
        float f10;
        boolean z10;
        float f11;
        int i3;
        float f12;
        float f13;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        org.telegram.ui.Components.vf0 vf0Var = this.d0;
        boolean z11 = vf0Var != null && vf0Var.getVisibility() == 0 && this.N && this.I > 0.0f;
        if (z11) {
            org.telegram.ui.Components.nf0 blurDrawer = this.d0.getBlurDrawer();
            nf0Var = blurDrawer;
            z11 = blurDrawer != null;
        } else {
            nf0Var = null;
        }
        float A = org.telegram.messenger.k5.A(1.0f, this.W, this.f0, (1.0f - this.c0) * (this.e0 ? (int) org.telegram.messenger.g0.N(3.5f) : 0.0f));
        org.telegram.ui.Components.g5 g5Var = this.e;
        ImageReceiver imageReceiver = g5Var != null ? g5Var.k : this.a;
        int i10 = this.L;
        if (i10 > 0) {
            Path path = this.O;
            path.rewind();
            RectF rectF = org.telegram.messenger.g0.P;
            f10 = 1.0f;
            rectF.set(A, A, measuredWidth - A, measuredHeight - A);
            float f14 = i10;
            path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            f10 = 1.0f;
        }
        canvas.save();
        float f15 = this.S;
        float f16 = measuredWidth;
        float f17 = measuredHeight;
        canvas.scale(f15, f15, f16 / 2.0f, f17 / 2.0f);
        if (z11) {
            measuredHeight = this.H ? Math.min(measuredHeight, measuredWidth) : (int) (f17 - org.telegram.messenger.g0.T1(0.0f, this.M / this.J, this.I));
        }
        ImageReceiver imageReceiver2 = this.U;
        if (imageReceiver2 != null) {
            float f18 = this.T;
            float f19 = (f10 - f18) * f10;
            if (f18 > 0.0f) {
                float f20 = imageReceiver2.L0;
                float f21 = imageReceiver2.M0;
                f11 = 0.0f;
                float f22 = imageReceiver2.N0;
                i3 = 0;
                float f23 = imageReceiver2.O0;
                float alpha = imageReceiver2.getAlpha();
                float f24 = A * 2.0f;
                z10 = z11;
                f13 = f19;
                this.U.y0(A, A, f16 - f24, measuredHeight - f24);
                this.U.setAlpha(f18);
                this.U.h(canvas, null);
                this.U.y0(f20, f21, f22, f23);
                this.U.setAlpha(alpha);
            } else {
                z10 = z11;
                f11 = 0.0f;
                f13 = f19;
                i3 = 0;
            }
            f12 = f13;
        } else {
            z10 = z11;
            f11 = 0.0f;
            i3 = 0;
            f12 = f10;
        }
        if (imageReceiver != null && f12 > f11 && (this.W < f10 || !this.b0)) {
            float f25 = A * 2.0f;
            imageReceiver.y0(A, A, f16 - f25, measuredHeight - f25);
            float alpha2 = imageReceiver.getAlpha();
            imageReceiver.setAlpha(alpha2 * f12);
            if (this.R) {
                int i11 = imageReceiver.X0[i3];
                if (z10) {
                    imageReceiver.J0(i3);
                }
                imageReceiver.h(canvas, null);
                if (z10) {
                    imageReceiver.J0(i11);
                }
            }
            imageReceiver.setAlpha(alpha2);
        }
        if (this.W > f11 && this.b0 && f12 > f11) {
            ImageReceiver imageReceiver3 = this.V;
            if (imageReceiver3.t() != null) {
                float f26 = A * 2.0f;
                imageReceiver3.y0(A, A, f16 - f26, measuredHeight - f26);
                imageReceiver3.setAlpha(this.W * f12);
                imageReceiver3.h(canvas, null);
            } else {
                RectF rectF2 = this.P;
                float f27 = f11;
                rectF2.set(f27, f27, f16, measuredHeight);
                int i12 = (int) (this.W * f12 * 255.0f);
                Paint paint = this.Q;
                paint.setAlpha(i12);
                float f28 = imageReceiver3.X0[0];
                canvas.drawRoundRect(rectF2, f28, f28, paint);
            }
        }
        if (z10) {
            float f29 = measuredHeight;
            canvas.translate(A, A + f29);
            float f30 = A * 2.0f;
            nf0Var.e(canvas, this, f16 - f30, f29 - f30, true, (this.H || nf0Var.a || this.d0.getRealPosition() == 0) ? f10 - this.I : f10, f12);
        }
        canvas.restore();
    }

    public void setAnimateFromImageReceiver(ImageReceiver imageReceiver) {
        this.U = imageReceiver;
    }

    public void setAvatarsViewPager(org.telegram.ui.Components.vf0 vf0Var) {
        this.d0 = vf0Var;
    }

    public void setCrossfadeProgress(float f10) {
        this.T = f10;
        invalidate();
    }

    public void setForegroundAlpha(float f10) {
        this.W = f10;
        invalidate();
    }

    public void setForegroundImageDrawable(org.telegram.messenger.cc ccVar) {
        if (ccVar != null) {
            this.V.w0(ccVar.d);
        }
        org.telegram.messenger.cc ccVar2 = this.a0;
        if (ccVar2 != null) {
            ccVar2.a();
            this.a0 = null;
        }
        this.a0 = ccVar;
    }

    public void setHasStories(boolean z10) {
        if (this.e0 == z10) {
            return;
        }
        this.e0 = z10;
        invalidate();
    }

    public void setProgressToExpand(float f10) {
        if (this.c0 == f10) {
            return;
        }
        this.c0 = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (f10 == this.f0) {
            return;
        }
        this.f0 = f10;
        invalidate();
    }

    @Override // org.telegram.ui.Components.k9
    public void setRoundRadius(int i3) {
        super.setRoundRadius(i3);
        this.V.J0(i3);
    }

    public void setRoundRadiusCollapse(int i3) {
        int i10 = this.K;
        this.K = i3;
        if (i10 != i3) {
            super.invalidate();
        }
    }

    public void setRoundRadiusForExpand(int i3) {
        if (!this.N) {
            setRoundRadius(i3);
        } else {
            this.L = i3;
            setRoundRadius(i3);
        }
    }

    public final void v(int i3) {
        this.M = i3;
        this.N = true;
    }

    public final void w(org.telegram.messenger.ac acVar, String str, Drawable drawable) {
        this.V.p0(acVar, str, drawable, 0L, null, null, 0);
        org.telegram.messenger.cc ccVar = this.a0;
        if (ccVar != null) {
            ccVar.a();
            this.a0 = null;
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        Runnable runnable = this.g0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
