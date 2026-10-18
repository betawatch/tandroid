package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.kk;
import org.telegram.ui.vf1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class e6 extends tg.n {
    public final b6 i0;
    public final f6 j0;
    public final int k0;
    public final n l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public boolean q0;
    public ValueAnimator r0;

    public e6(Context context, f6 f6Var, int i10, int i11) {
        super(context, 0, 0);
        this.j0 = f6Var;
        this.l0 = new n(f6Var, 11);
        b6 b6Var = new b6(context, i10, i11);
        this.i0 = b6Var;
        setRenderer(b6Var);
        setOpaque(false);
        this.k0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // tg.n
    public final int getMaxFrameRate() {
        return 60;
    }

    @Override // tg.n
    public final int getMsaaSamples() {
        return SharedConfig.getDevicePerformanceClass() == 2 ? 4 : 2;
    }

    @Override // tg.n
    public final float getRenderScale() {
        return SharedConfig.getDevicePerformanceClass() == 1 ? 0.85f : 1.0f;
    }

    @Override // tg.n
    public final long h(long j10) {
        return this.i0.h0 ? Math.max(j10, 33333333L) : j10;
    }

    @Override // tg.n
    public final boolean k() {
        return true;
    }

    @Override // tg.n, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.l0);
        this.j0.setPressed(false);
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.r0.cancel();
            this.r0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.i0.Z = false;
        this.j0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.j0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.i0.Z) {
            f6 f6Var = this.j0;
            if (f6Var.c) {
                f6Var.c = false;
                setAlpha(1.0f);
                this.j0.b.setVisibility(4);
                this.j0.n.invalidate();
                this.j0.invalidate();
            }
        }
    }

    @Override // tg.n, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        b6 b6Var = this.i0;
        f6 f6Var = this.j0;
        if (actionMasked == 0) {
            ValueAnimator valueAnimator = this.r0;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.r0.cancel();
                this.r0 = null;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            this.m0 = motionEvent.getX();
            this.n0 = motionEvent.getY();
            this.o0 = b6Var.d;
            this.p0 = b6Var.i;
            this.q0 = false;
            f6Var.setPressed(true);
            return true;
        }
        if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            f6Var.setPressed(false);
            if (this.q0) {
                r();
                return true;
            }
            postDelayed(this.l0, Math.max(0L, 80 - (motionEvent.getEventTime() - motionEvent.getDownTime())));
            return true;
        }
        if (actionMasked == 2) {
            float abs = Math.abs(motionEvent.getX() - this.m0);
            float f7 = this.k0;
            if (abs > f7 || Math.abs(motionEvent.getY() - this.n0) > f7) {
                this.q0 = true;
                f6Var.setPressed(false);
            }
            if (this.q0) {
                float D = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getX(), this.m0, 0.03f, this.o0);
                float f10 = this.o0;
                b6Var.d = f6.b(D, f10 - 32.0f, f10 + 32.0f);
                float D2 = com.google.android.gms.internal.play_billing.k3.D(motionEvent.getY(), this.n0, 0.03f, this.p0);
                float f11 = this.p0;
                b6Var.i = f6.b(D2, f11 - 22.0f, f11 + 22.0f);
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
            f6Var.setPressed(false);
            if (this.q0) {
                r();
            }
            this.q0 = true;
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void r() {
        ValueAnimator valueAnimator = this.r0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.r0.cancel();
            this.r0 = null;
        }
        b6 b6Var = this.i0;
        float f7 = b6Var.d;
        float f10 = b6Var.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.r0 = ofFloat;
        ofFloat.setDuration(600L);
        kk.l(1.2f, this.r0);
        int i10 = 7;
        this.r0.addUpdateListener(new ei.ja(this, f7, f10, i10));
        this.r0.addListener(new vf1(this, i10));
        this.r0.start();
    }

    @Override // tg.n
    public final void setPaused(boolean z10) {
        b6 b6Var = this.i0;
        synchronized (b6Var) {
            if (b6Var.i0 != z10) {
                b6Var.i0 = z10;
                b6Var.k0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override // tg.n
    public final void p() {
    }
}
