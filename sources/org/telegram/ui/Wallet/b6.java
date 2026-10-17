package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import ei.ja;
import org.telegram.messenger.wh;
import org.telegram.ui.vf1;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class b6 extends tg.n {
    public final y5 f0;
    public final c6 g0;
    public final int h0;
    public final n i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public boolean n0;
    public ValueAnimator o0;

    public b6(Context context, c6 c6Var, int i10, int i11) {
        super(context, 0, 0);
        this.g0 = c6Var;
        this.i0 = new n(c6Var, 11);
        y5 y5Var = new y5(context, i10, i11);
        this.f0 = y5Var;
        setRenderer(y5Var);
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
        this.f0.Z = false;
        this.g0.d();
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.g0.d();
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // tg.n, android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f0.Z) {
            c6 c6Var = this.g0;
            if (c6Var.c) {
                c6Var.c = false;
                setAlpha(1.0f);
                this.g0.b.setVisibility(4);
                this.g0.n.invalidate();
                this.g0.invalidate();
            }
        }
    }

    @Override // tg.n, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        y5 y5Var = this.f0;
        c6 c6Var = this.g0;
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
            this.l0 = y5Var.d;
            this.m0 = y5Var.i;
            this.n0 = false;
            c6Var.setPressed(true);
            return true;
        }
        if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            c6Var.setPressed(false);
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
                c6Var.setPressed(false);
            }
            if (this.n0) {
                float D = com.google.android.gms.internal.cast.a6.D(motionEvent.getX(), this.j0, 0.03f, this.l0);
                float f10 = this.l0;
                y5Var.d = c6.b(D, f10 - 32.0f, f10 + 32.0f);
                float D2 = com.google.android.gms.internal.cast.a6.D(motionEvent.getY(), this.k0, 0.03f, this.m0);
                float f11 = this.m0;
                y5Var.i = c6.b(D2, f11 - 22.0f, f11 + 22.0f);
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
            c6Var.setPressed(false);
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
        y5 y5Var = this.f0;
        float f7 = y5Var.d;
        float f10 = y5Var.i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.o0 = ofFloat;
        ofFloat.setDuration(600L);
        wh.l(1.2f, this.o0);
        int i10 = 7;
        this.o0.addUpdateListener(new ja(this, f7, f10, i10));
        this.o0.addListener(new vf1(this, i10));
        this.o0.start();
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    @Override // tg.n
    public final void setPaused(boolean z10) {
        y5 y5Var = this.f0;
        synchronized (y5Var) {
            if (y5Var.a0 != z10) {
                y5Var.a0 = z10;
                y5Var.c0 = 0L;
            }
        }
        super.setPaused(z10);
    }

    @Override // tg.n
    public final void n() {
    }
}
