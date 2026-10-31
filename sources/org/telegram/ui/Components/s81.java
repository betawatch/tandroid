package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s81 extends View {
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public r81 L;
    public boolean M;
    public final org.telegram.ui.Cells.f2 N;
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;
    public final Drawable f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public s81(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.f2(this);
        this.a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f7) {
        if (f7 < 0.0f || f7 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.J = f7;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.K = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.N, f7));
        this.K.setDuration(180L);
        this.K.addListener(new p11(this, 9));
        this.K.start();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0012, code lost:
    
        if (r4 > 1.0f) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10, float f7) {
        r81 r81Var;
        if (f7 == this.E) {
            return;
        }
        float f10 = f7 >= 0.0f ? 1.0f : 0.0f;
        f7 = f10;
        this.E = f7;
        if (z10 && (r81Var = this.L) != null) {
            r81Var.c(f7);
        }
        invalidate();
    }

    public float getZoom() {
        return this.K != null ? this.J : this.E;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z10 = getMeasuredWidth() > getMeasuredHeight();
        if (z10) {
            this.h = org.telegram.messenger.i0.L(41.0f);
            this.n = measuredHeight;
            this.r = getMeasuredWidth() - org.telegram.messenger.i0.L(41.0f);
            this.s = measuredHeight;
            this.w = org.telegram.messenger.i0.L(18.0f) + this.h;
            this.x = measuredHeight;
            this.y = this.r - org.telegram.messenger.i0.L(18.0f);
            this.D = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.n = org.telegram.messenger.i0.L(41.0f);
            this.r = measuredWidth;
            this.s = getMeasuredHeight() - org.telegram.messenger.i0.L(41.0f);
            this.w = measuredWidth;
            this.x = org.telegram.messenger.i0.L(18.0f) + this.n;
            this.y = measuredWidth;
            this.D = this.s - org.telegram.messenger.i0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.i0.L(7.0f);
        int L2 = this.n - org.telegram.messenger.i0.L(7.0f);
        int L3 = org.telegram.messenger.i0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.i0.L(7.0f) + this.n;
        Drawable drawable = this.a;
        drawable.setBounds(L, L2, L3, L4);
        drawable.draw(canvas);
        int L5 = this.r - org.telegram.messenger.i0.L(7.0f);
        int L6 = this.s - org.telegram.messenger.i0.L(7.0f);
        int L7 = org.telegram.messenger.i0.L(7.0f) + this.r;
        int L8 = org.telegram.messenger.i0.L(7.0f) + this.s;
        Drawable drawable2 = this.b;
        drawable2.setBounds(L5, L6, L7, L8);
        drawable2.draw(canvas);
        int i10 = this.y;
        int i11 = this.w;
        int i12 = this.D;
        int i13 = this.x;
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
        Drawable drawable3 = this.d;
        Drawable drawable4 = this.c;
        if (z10) {
            drawable4.setBounds(i11, i13 - org.telegram.messenger.i0.L(3.0f), this.y, org.telegram.messenger.i0.L(3.0f) + this.x);
            drawable3.setBounds(this.w, this.x - org.telegram.messenger.i0.L(3.0f), i14, org.telegram.messenger.i0.L(3.0f) + this.x);
        } else {
            drawable4.setBounds(i13, 0, i12, org.telegram.messenger.i0.L(6.0f));
            drawable3.setBounds(this.x, 0, i15, org.telegram.messenger.i0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.w) - org.telegram.messenger.i0.L(3.0f));
        }
        drawable4.draw(canvas);
        drawable3.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        Drawable drawable5 = this.G ? this.f : this.e;
        int intrinsicWidth = drawable5.getIntrinsicWidth() / 2;
        drawable5.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.M) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = getMeasuredWidth() > getMeasuredHeight();
        int i10 = this.w;
        float f7 = i10;
        float f10 = this.y - i10;
        float f11 = this.E;
        int i11 = (int) ((f10 * f11) + f7);
        int i12 = this.x;
        float f12 = i12;
        float f13 = this.D - i12;
        int i13 = (int) ((f11 * f13) + f12);
        if (action == 1 || action == 0) {
            if (x10 < i11 - org.telegram.messenger.i0.L(20.0f) || x10 > org.telegram.messenger.i0.L(20.0f) + i11 || y3 < i13 - org.telegram.messenger.i0.L(25.0f) || y3 > org.telegram.messenger.i0.L(25.0f) + i13) {
                try {
                    if (x10 >= this.h - org.telegram.messenger.i0.L(16.0f)) {
                        if (x10 <= org.telegram.messenger.i0.L(16.0f) + this.h && y3 >= this.n - org.telegram.messenger.i0.L(16.0f)) {
                            if (y3 <= org.telegram.messenger.i0.L(16.0f) + this.n) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) - 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.F = true;
                                }
                            }
                        }
                    }
                    if (x10 >= this.r - org.telegram.messenger.i0.L(16.0f)) {
                        if (x10 <= org.telegram.messenger.i0.L(16.0f) + this.r && y3 >= this.s - org.telegram.messenger.i0.L(16.0f)) {
                            if (y3 <= org.telegram.messenger.i0.L(16.0f) + this.s) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) + 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.F = true;
                                }
                            }
                        }
                    }
                    if (z11) {
                        if (x10 >= this.w && x10 <= this.y) {
                            if (action == 0) {
                                this.H = x10;
                                this.F = true;
                            } else if (Math.abs(this.H - x10) <= org.telegram.messenger.i0.L(10.0f)) {
                                float f14 = (x10 - this.w) / (this.y - r2);
                                this.E = f14;
                                r81 r81Var = this.L;
                                if (r81Var != null) {
                                    r81Var.c(f14);
                                }
                                invalidate();
                            }
                        }
                    } else if (y3 >= this.x && y3 <= this.D) {
                        if (action == 1) {
                            this.I = y3;
                            this.F = true;
                        } else if (Math.abs(this.I - y3) <= org.telegram.messenger.i0.L(10.0f)) {
                            float f15 = (y3 - this.x) / (this.D - r0);
                            this.E = f15;
                            r81 r81Var2 = this.L;
                            if (r81Var2 != null) {
                                r81Var2.c(f15);
                            }
                            invalidate();
                        }
                    }
                } catch (Exception unused) {
                }
            } else if (action == 0) {
                this.G = true;
                this.H = x10 - i11;
                this.I = y3 - i13;
                invalidate();
            }
            z10 = true;
            if (action == 1) {
                this.F = false;
                this.G = false;
                invalidate();
            }
            return !z10 || this.F || this.G || super.onTouchEvent(motionEvent);
        }
        if (action == 2 && this.G) {
            if (z11) {
                this.E = ((x10 + this.H) - f7) / f10;
            } else {
                this.E = ((y3 + this.I) - f12) / f13;
            }
            float f16 = this.E;
            if (f16 < 0.0f) {
                this.E = 0.0f;
            } else if (f16 > 1.0f) {
                this.E = 1.0f;
            }
            r81 r81Var3 = this.L;
            if (r81Var3 != null) {
                r81Var3.c(this.E);
            }
            invalidate();
        }
        z10 = false;
        if (action == 1) {
        }
        if (z10) {
        }
    }

    public void setDelegate(r81 r81Var) {
        this.L = r81Var;
    }
}
