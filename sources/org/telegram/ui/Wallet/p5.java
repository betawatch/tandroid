package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ci.ya;
import org.telegram.messenger.bi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class p5 extends sg.n {
    public final k5 f0;
    public final q5 g0;
    public final int h0;
    public final m i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public boolean n0;
    public ValueAnimator o0;

    public p5(Context context, q5 q5Var, int i10, int i11) {
        super(context, 0, 0);
        this.g0 = q5Var;
        this.i0 = new m(q5Var, 9);
        k5 k5Var = new k5(context, i10, i11);
        this.f0 = k5Var;
        setRenderer(k5Var);
        setOpaque(false);
        this.h0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // sg.n
    public final int getMaxFrameRate() {
        return 60;
    }

    @Override // sg.n
    public final boolean j() {
        return true;
    }

    @Override // sg.n, android.view.View
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

    @Override // sg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f0.getClass();
        this.g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override // sg.n, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r2 = ((long[]) r10.e)[r4];
     */
    @Override // sg.n, android.view.TextureView.SurfaceTextureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j3;
        k5 k5Var = this.f0;
        long timestamp = surfaceTexture.getTimestamp();
        e2.a0 a0Var = k5Var.X;
        synchronized (a0Var) {
            int i10 = 0;
            while (true) {
                if (i10 >= a0Var.c) {
                    j3 = 0;
                    break;
                }
                int i11 = (a0Var.b - 1) - i10;
                long[] jArr = (long[]) a0Var.d;
                int length = (i11 + jArr.length) % jArr.length;
                if (jArr[length] == timestamp) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        q5 q5Var = this.g0;
        if (j3 >= q5Var.f && q5Var.c) {
            q5Var.c = false;
            setAlpha(1.0f);
            this.g0.b.setVisibility(4);
            o5 o5Var = this.g0.v;
            o5Var.e = true;
            o5Var.f = false;
            o5Var.invalidate();
            this.g0.invalidate();
        }
        q5 q5Var2 = this.g0;
        Runnable runnable = q5Var2.n;
        if (runnable == null || j3 < q5Var2.h) {
            return;
        }
        q5Var2.n = null;
        runnable.run();
    }

    @Override // sg.n, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        k5 k5Var = this.f0;
        q5 q5Var = this.g0;
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
            this.l0 = k5Var.d;
            this.m0 = k5Var.i;
            this.n0 = false;
            q5Var.setPressed(true);
            return true;
        }
        if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            q5Var.setPressed(false);
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
                q5Var.setPressed(false);
            }
            if (this.n0) {
                float b10 = com.google.android.gms.internal.vision.e2.b(motionEvent.getX(), this.j0, 0.03f, this.l0);
                float f10 = this.l0;
                k5Var.d = q5.b(b10, f10 - 32.0f, f10 + 32.0f);
                float b11 = com.google.android.gms.internal.vision.e2.b(motionEvent.getY(), this.k0, 0.03f, this.m0);
                float f11 = this.m0;
                k5Var.i = q5.b(b11, f11 - 22.0f, f11 + 22.0f);
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
            q5Var.setPressed(false);
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
        k5 k5Var = this.f0;
        float f7 = k5Var.d;
        float f10 = k5Var.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o0 = ofFloat;
        ofFloat.setDuration(600L);
        bi.l(1.2f, this.o0);
        this.o0.addUpdateListener(new ya(this, f7, f10, 7));
        this.o0.addListener(new x4(this, 2));
        this.o0.start();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // sg.n
    public final void setPaused(boolean z10) {
        k5 k5Var = this.f0;
        synchronized (k5Var) {
            if (k5Var.e0 != z10) {
                k5Var.e0 = z10;
                k5Var.g0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override // sg.n
    public final void n() {
    }
}
