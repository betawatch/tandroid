package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s71 extends View {
    public int D;
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public r71 L;
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

    public s71(Context context) {
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

    public final boolean a(float f10) {
        if (f10 < 0.0f || f10 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.J = f10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.K = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.N, f10));
        this.K.setDuration(180L);
        this.K.addListener(new g11(this, 8));
        this.K.start();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0012, code lost:
    
        if (r4 > 1.0f) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z9, float f10) {
        r71 r71Var;
        if (f10 == this.E) {
            return;
        }
        float f11 = f10 >= 0.0f ? 1.0f : 0.0f;
        f10 = f11;
        this.E = f10;
        if (z9 && (r71Var = this.L) != null) {
            r71Var.b(f10);
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
        boolean z9 = getMeasuredWidth() > getMeasuredHeight();
        if (z9) {
            this.h = org.telegram.messenger.g0.L(41.0f);
            this.n = measuredHeight;
            this.r = getMeasuredWidth() - org.telegram.messenger.g0.L(41.0f);
            this.s = measuredHeight;
            this.w = org.telegram.messenger.g0.L(18.0f) + this.h;
            this.x = measuredHeight;
            this.y = this.r - org.telegram.messenger.g0.L(18.0f);
            this.D = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.n = org.telegram.messenger.g0.L(41.0f);
            this.r = measuredWidth;
            this.s = getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f);
            this.w = measuredWidth;
            this.x = org.telegram.messenger.g0.L(18.0f) + this.n;
            this.y = measuredWidth;
            this.D = this.s - org.telegram.messenger.g0.L(18.0f);
        }
        int L = this.h - org.telegram.messenger.g0.L(7.0f);
        int L2 = this.n - org.telegram.messenger.g0.L(7.0f);
        int L3 = org.telegram.messenger.g0.L(7.0f) + this.h;
        int L4 = org.telegram.messenger.g0.L(7.0f) + this.n;
        Drawable drawable = this.a;
        drawable.setBounds(L, L2, L3, L4);
        drawable.draw(canvas);
        int L5 = this.r - org.telegram.messenger.g0.L(7.0f);
        int L6 = this.s - org.telegram.messenger.g0.L(7.0f);
        int L7 = org.telegram.messenger.g0.L(7.0f) + this.r;
        int L8 = org.telegram.messenger.g0.L(7.0f) + this.s;
        Drawable drawable2 = this.b;
        drawable2.setBounds(L5, L6, L7, L8);
        drawable2.draw(canvas);
        int i7 = this.y;
        int i10 = this.w;
        int i11 = this.D;
        int i12 = this.x;
        float f10 = this.E;
        int i13 = (int) (((i7 - i10) * f10) + i10);
        int i14 = (int) (((i11 - i12) * f10) + i12);
        Drawable drawable3 = this.d;
        Drawable drawable4 = this.c;
        if (z9) {
            drawable4.setBounds(i10, i12 - org.telegram.messenger.g0.L(3.0f), this.y, org.telegram.messenger.g0.L(3.0f) + this.x);
            drawable3.setBounds(this.w, this.x - org.telegram.messenger.g0.L(3.0f), i13, org.telegram.messenger.g0.L(3.0f) + this.x);
        } else {
            drawable4.setBounds(i12, 0, i11, org.telegram.messenger.g0.L(6.0f));
            drawable3.setBounds(this.x, 0, i14, org.telegram.messenger.g0.L(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.w) - org.telegram.messenger.g0.L(3.0f));
        }
        drawable4.draw(canvas);
        drawable3.draw(canvas);
        if (!z9) {
            canvas.restore();
        }
        Drawable drawable5 = this.G ? this.f : this.e;
        int intrinsicWidth = drawable5.getIntrinsicWidth() / 2;
        drawable5.setBounds(i13 - intrinsicWidth, i14 - intrinsicWidth, i13 + intrinsicWidth, i14 + intrinsicWidth);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (!this.M) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z10 = getMeasuredWidth() > getMeasuredHeight();
        int i7 = this.w;
        float f10 = i7;
        float f11 = this.y - i7;
        float f12 = this.E;
        int i10 = (int) ((f11 * f12) + f10);
        int i11 = this.x;
        float f13 = i11;
        float f14 = this.D - i11;
        int i12 = (int) ((f12 * f14) + f13);
        if (action == 1 || action == 0) {
            if (x10 < i10 - org.telegram.messenger.g0.L(20.0f) || x10 > org.telegram.messenger.g0.L(20.0f) + i10 || y10 < i12 - org.telegram.messenger.g0.L(25.0f) || y10 > org.telegram.messenger.g0.L(25.0f) + i12) {
                try {
                    if (x10 >= this.h - org.telegram.messenger.g0.L(16.0f)) {
                        if (x10 <= org.telegram.messenger.g0.L(16.0f) + this.h && y10 >= this.n - org.telegram.messenger.g0.L(16.0f)) {
                            if (y10 <= org.telegram.messenger.g0.L(16.0f) + this.n) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) - 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.F = true;
                                }
                            }
                        }
                    }
                    if (x10 >= this.r - org.telegram.messenger.g0.L(16.0f)) {
                        if (x10 <= org.telegram.messenger.g0.L(16.0f) + this.r && y10 >= this.s - org.telegram.messenger.g0.L(16.0f)) {
                            if (y10 <= org.telegram.messenger.g0.L(16.0f) + this.s) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) + 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.F = true;
                                }
                            }
                        }
                    }
                    if (z10) {
                        if (x10 >= this.w && x10 <= this.y) {
                            if (action == 0) {
                                this.H = x10;
                                this.F = true;
                            } else if (Math.abs(this.H - x10) <= org.telegram.messenger.g0.L(10.0f)) {
                                float f15 = (x10 - this.w) / (this.y - r2);
                                this.E = f15;
                                r71 r71Var = this.L;
                                if (r71Var != null) {
                                    r71Var.b(f15);
                                }
                                invalidate();
                            }
                        }
                    } else if (y10 >= this.x && y10 <= this.D) {
                        if (action == 1) {
                            this.I = y10;
                            this.F = true;
                        } else if (Math.abs(this.I - y10) <= org.telegram.messenger.g0.L(10.0f)) {
                            float f16 = (y10 - this.x) / (this.D - r0);
                            this.E = f16;
                            r71 r71Var2 = this.L;
                            if (r71Var2 != null) {
                                r71Var2.b(f16);
                            }
                            invalidate();
                        }
                    }
                } catch (Exception unused) {
                }
            } else if (action == 0) {
                this.G = true;
                this.H = x10 - i10;
                this.I = y10 - i12;
                invalidate();
            }
            z9 = true;
            if (action == 1) {
                this.F = false;
                this.G = false;
                invalidate();
            }
            return !z9 || this.F || this.G || super.onTouchEvent(motionEvent);
        }
        if (action == 2 && this.G) {
            if (z10) {
                this.E = ((x10 + this.H) - f10) / f11;
            } else {
                this.E = ((y10 + this.I) - f13) / f14;
            }
            float f17 = this.E;
            if (f17 < 0.0f) {
                this.E = 0.0f;
            } else if (f17 > 1.0f) {
                this.E = 1.0f;
            }
            r71 r71Var3 = this.L;
            if (r71Var3 != null) {
                r71Var3.b(this.E);
            }
            invalidate();
        }
        z9 = false;
        if (action == 1) {
        }
        if (z9) {
        }
    }

    public void setDelegate(r71 r71Var) {
        this.L = r71Var;
    }
}
