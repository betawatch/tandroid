package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import di.xa;
import org.telegram.ui.fi1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class o5 extends tg.n {
    public final j5 f0;
    public final p5 g0;
    public final int h0;
    public final m i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public boolean n0;
    public ValueAnimator o0;

    public o5(Context context, p5 p5Var, int i10, int i11) {
        super(context, 0, 0);
        this.g0 = p5Var;
        this.i0 = new m(p5Var, 9);
        j5 j5Var = new j5(context, i10, i11);
        this.f0 = j5Var;
        setRenderer(j5Var);
        setOpaque(false);
        this.h0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // tg.n
    public final int getMaxFrameRate() {
        return 60;
    }

    @Override // tg.n
    public final boolean j() {
        return true;
    }

    @Override // tg.n, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.i0);
        this.g0.setPressed(false);
        ValueAnimator valueAnimator = this.o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.o0.cancel();
            this.o0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f0.getClass();
        this.g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r2 = ((long[]) r10.e)[r4];
     */
    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j10;
        j5 j5Var = this.f0;
        long timestamp = surfaceTexture.getTimestamp();
        e2.j0 j0Var = j5Var.X;
        synchronized (j0Var) {
            int i10 = 0;
            while (true) {
                if (i10 >= j0Var.c) {
                    j10 = 0;
                    break;
                }
                int i11 = (j0Var.b - 1) - i10;
                long[] jArr = (long[]) j0Var.d;
                int length = (i11 + jArr.length) % jArr.length;
                if (jArr[length] == timestamp) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        p5 p5Var = this.g0;
        if (j10 >= p5Var.f && p5Var.c) {
            p5Var.c = false;
            setAlpha(1.0f);
            this.g0.b.setVisibility(4);
            n5 n5Var = this.g0.v;
            n5Var.e = true;
            n5Var.f = false;
            n5Var.invalidate();
            this.g0.invalidate();
        }
        p5 p5Var2 = this.g0;
        Runnable runnable = p5Var2.n;
        if (runnable == null || j10 < p5Var2.h) {
            return;
        }
        p5Var2.n = null;
        runnable.run();
    }

    @Override // tg.n, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        j5 j5Var = this.f0;
        p5 p5Var = this.g0;
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.o0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.o0.cancel();
                this.o0 = null;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            this.j0 = motionEvent.getX();
            this.k0 = motionEvent.getY();
            this.l0 = j5Var.d;
            this.m0 = j5Var.i;
            this.n0 = false;
            p5Var.setPressed(true);
            return true;
        }
        if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            p5Var.setPressed(false);
            if (this.n0) {
                p();
                return true;
            }
            postDelayed(this.i0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            float abs = Math.abs(motionEvent.getX() - this.j0);
            float f7 = this.h0;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.k0) > f7) {
                this.n0 = true;
                p5Var.setPressed(false);
            }
            if (this.n0) {
                float D = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getX(), this.j0, 0.03f, this.l0);
                float f10 = this.l0;
                j5Var.d = p5.b(D, f10 - 32.0f, f10 + 32.0f);
                float D2 = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getY(), this.k0, 0.03f, this.m0);
                float f11 = this.m0;
                j5Var.i = p5.b(D2, f11 - 22.0f, f11 + 22.0f);
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
            p5Var.setPressed(false);
            if (this.n0) {
                p();
            }
            this.n0 = true;
            return true;
        }
        return true;
    }

    public final void p() {
        ValueAnimator valueAnimator = this.o0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.o0.cancel();
            this.o0 = null;
        }
        j5 j5Var = this.f0;
        float f7 = j5Var.d;
        float f10 = j5Var.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o0 = ofFloat;
        ofFloat.setDuration(600L);
        org.telegram.ui.Cells.d0.l(1.2f, this.o0);
        this.o0.addUpdateListener(new xa(this, f7, f10, 7));
        this.o0.addListener(new fi1(this, 5));
        this.o0.start();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // tg.n
    public final void setPaused(boolean z10) {
        j5 j5Var = this.f0;
        synchronized (j5Var) {
            if (j5Var.e0 != z10) {
                j5Var.e0 = z10;
                j5Var.g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override // tg.n
    public final void n() {
    }
}
