package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u81 extends View {
    public float A;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public AnimatorSet G;
    public t81 H;
    public boolean I;
    public final org.telegram.ui.Cells.b2 J;
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
    public int v;
    public int w;
    public int x;
    public int y;

    public u81(Context context) {
        super(context);
        this.I = true;
        this.J = new org.telegram.ui.Cells.b2(this);
        this.a = context.getResources().getDrawable(R.drawable.zoom_minus);
        this.b = context.getResources().getDrawable(R.drawable.zoom_plus);
        this.c = context.getResources().getDrawable(R.drawable.zoom_slide);
        this.d = context.getResources().getDrawable(R.drawable.zoom_slide_a);
        this.e = context.getResources().getDrawable(R.drawable.zoom_round);
        this.f = context.getResources().getDrawable(R.drawable.zoom_round_b);
    }

    public final boolean a(float f9) {
        if (f9 < 0.0f || f9 > 1.0f) {
            return false;
        }
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F = f9;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, this.J, f9));
        this.G.setDuration(180L);
        this.G.addListener(new p11(this, 9));
        this.G.start();
        return true;
    }

    public final void b(float f9, boolean z10) {
        t81 t81Var;
        if (f9 == this.A) {
            return;
        }
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        this.A = f9;
        if (z10 && (t81Var = this.H) != null) {
            t81Var.a(f9);
        }
        invalidate();
    }

    public float getZoom() {
        return this.G != null ? this.F : this.A;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredHeight = getMeasuredHeight() / 2;
        boolean z10 = getMeasuredWidth() > getMeasuredHeight();
        if (z10) {
            this.h = AndroidUtilities.dp(41.0f);
            this.n = measuredHeight;
            this.r = getMeasuredWidth() - AndroidUtilities.dp(41.0f);
            this.s = measuredHeight;
            this.v = AndroidUtilities.dp(18.0f) + this.h;
            this.w = measuredHeight;
            this.x = this.r - AndroidUtilities.dp(18.0f);
            this.y = measuredHeight;
        } else {
            this.h = measuredWidth;
            this.n = AndroidUtilities.dp(41.0f);
            this.r = measuredWidth;
            this.s = getMeasuredHeight() - AndroidUtilities.dp(41.0f);
            this.v = measuredWidth;
            this.w = AndroidUtilities.dp(18.0f) + this.n;
            this.x = measuredWidth;
            this.y = this.s - AndroidUtilities.dp(18.0f);
        }
        int dp = this.h - AndroidUtilities.dp(7.0f);
        int dp2 = this.n - AndroidUtilities.dp(7.0f);
        int dp3 = AndroidUtilities.dp(7.0f) + this.h;
        int dp4 = AndroidUtilities.dp(7.0f) + this.n;
        Drawable drawable = this.a;
        drawable.setBounds(dp, dp2, dp3, dp4);
        drawable.draw(canvas);
        int dp5 = this.r - AndroidUtilities.dp(7.0f);
        int dp6 = this.s - AndroidUtilities.dp(7.0f);
        int dp7 = AndroidUtilities.dp(7.0f) + this.r;
        int dp8 = AndroidUtilities.dp(7.0f) + this.s;
        Drawable drawable2 = this.b;
        drawable2.setBounds(dp5, dp6, dp7, dp8);
        drawable2.draw(canvas);
        int i10 = this.x;
        int i11 = this.v;
        int i12 = this.y;
        int i13 = this.w;
        float f9 = this.A;
        int i14 = (int) (((i10 - i11) * f9) + i11);
        int i15 = (int) (((i12 - i13) * f9) + i13);
        Drawable drawable3 = this.d;
        Drawable drawable4 = this.c;
        if (z10) {
            drawable4.setBounds(i11, i13 - AndroidUtilities.dp(3.0f), this.x, AndroidUtilities.dp(3.0f) + this.w);
            drawable3.setBounds(this.v, this.w - AndroidUtilities.dp(3.0f), i14, AndroidUtilities.dp(3.0f) + this.w);
        } else {
            drawable4.setBounds(i13, 0, i12, AndroidUtilities.dp(6.0f));
            drawable3.setBounds(this.w, 0, i15, AndroidUtilities.dp(6.0f));
            canvas.save();
            canvas.rotate(90.0f);
            canvas.translate(0.0f, (-this.v) - AndroidUtilities.dp(3.0f));
        }
        drawable4.draw(canvas);
        drawable3.draw(canvas);
        if (!z10) {
            canvas.restore();
        }
        Drawable drawable5 = this.C ? this.f : this.e;
        int intrinsicWidth = drawable5.getIntrinsicWidth() / 2;
        drawable5.setBounds(i14 - intrinsicWidth, i15 - intrinsicWidth, i14 + intrinsicWidth, i15 + intrinsicWidth);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01d9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (!this.I) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = getMeasuredWidth() > getMeasuredHeight();
        int i10 = this.v;
        float f9 = i10;
        float f10 = this.x - i10;
        float f11 = this.A;
        int i11 = (int) ((f10 * f11) + f9);
        int i12 = this.w;
        float f12 = i12;
        float f13 = this.y - i12;
        int i13 = (int) ((f11 * f13) + f12);
        if (action == 1 || action == 0) {
            if (x4 < i11 - AndroidUtilities.dp(20.0f) || x4 > AndroidUtilities.dp(20.0f) + i11 || y8 < i13 - AndroidUtilities.dp(25.0f) || y8 > AndroidUtilities.dp(25.0f) + i13) {
                try {
                    if (x4 >= this.h - AndroidUtilities.dp(16.0f)) {
                        if (x4 <= AndroidUtilities.dp(16.0f) + this.h && y8 >= this.n - AndroidUtilities.dp(16.0f)) {
                            if (y8 <= AndroidUtilities.dp(16.0f) + this.n) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) - 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.B = true;
                                }
                            }
                        }
                    }
                    if (x4 >= this.r - AndroidUtilities.dp(16.0f)) {
                        if (x4 <= AndroidUtilities.dp(16.0f) + this.r && y8 >= this.s - AndroidUtilities.dp(16.0f)) {
                            if (y8 <= AndroidUtilities.dp(16.0f) + this.s) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) + 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.B = true;
                                }
                            }
                        }
                    }
                    if (z11) {
                        if (x4 >= this.v && x4 <= this.x) {
                            if (action == 0) {
                                this.D = x4;
                                this.B = true;
                            } else if (Math.abs(this.D - x4) <= AndroidUtilities.dp(10.0f)) {
                                float f14 = (x4 - this.v) / (this.x - r2);
                                this.A = f14;
                                t81 t81Var = this.H;
                                if (t81Var != null) {
                                    t81Var.a(f14);
                                }
                                invalidate();
                            }
                        }
                    } else if (y8 >= this.w && y8 <= this.y) {
                        if (action == 1) {
                            this.E = y8;
                            this.B = true;
                        } else if (Math.abs(this.E - y8) <= AndroidUtilities.dp(10.0f)) {
                            float f15 = (y8 - this.w) / (this.y - r0);
                            this.A = f15;
                            t81 t81Var2 = this.H;
                            if (t81Var2 != null) {
                                t81Var2.a(f15);
                            }
                            invalidate();
                        }
                    }
                } catch (Exception unused) {
                }
            } else if (action == 0) {
                this.C = true;
                this.D = x4 - i11;
                this.E = y8 - i13;
                invalidate();
            }
            z10 = true;
            if (action == 1) {
                this.B = false;
                this.C = false;
                invalidate();
            }
            return !z10 || this.B || this.C || super.onTouchEvent(motionEvent);
        }
        if (action == 2 && this.C) {
            if (z11) {
                this.A = ((x4 + this.D) - f9) / f10;
            } else {
                this.A = ((y8 + this.E) - f12) / f13;
            }
            float f16 = this.A;
            if (f16 < 0.0f) {
                this.A = 0.0f;
            } else if (f16 > 1.0f) {
                this.A = 1.0f;
            }
            t81 t81Var3 = this.H;
            if (t81Var3 != null) {
                t81Var3.a(this.A);
            }
            invalidate();
        }
        z10 = false;
        if (action == 1) {
        }
        if (z10) {
        }
    }

    public void setDelegate(t81 t81Var) {
        this.H = t81Var;
    }
}
