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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d91 extends View {
    public float E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public AnimatorSet K;
    public c91 L;
    public boolean M;
    public final org.telegram.ui.Cells.c2 N;
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

    public d91(Context context) {
        super(context);
        this.M = true;
        this.N = new org.telegram.ui.Cells.c2(this);
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
        this.K.addListener(new k61(this, 4));
        this.K.start();
        return true;
    }

    public final void b(float f7, boolean z10) {
        c91 c91Var;
        if (f7 == this.E) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        this.E = f7;
        if (z10 && (c91Var = this.L) != null) {
            c91Var.b(f7);
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
        float f7 = this.E;
        int i14 = (int) (((i10 - i11) * f7) + i11);
        int i15 = (int) (((i12 - i13) * f7) + i13);
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
        Drawable drawable5 = this.G ? this.f : this.e;
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
        if (!this.M) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z11 = getMeasuredWidth() > getMeasuredHeight();
        int i10 = this.v;
        float f7 = i10;
        float f10 = this.x - i10;
        float f11 = this.E;
        int i11 = (int) ((f10 * f11) + f7);
        int i12 = this.w;
        float f12 = i12;
        float f13 = this.y - i12;
        int i13 = (int) ((f11 * f13) + f12);
        if (action == 1 || action == 0) {
            if (x10 < i11 - AndroidUtilities.dp(20.0f) || x10 > AndroidUtilities.dp(20.0f) + i11 || y3 < i13 - AndroidUtilities.dp(25.0f) || y3 > AndroidUtilities.dp(25.0f) + i13) {
                try {
                    if (x10 >= this.h - AndroidUtilities.dp(16.0f)) {
                        if (x10 <= AndroidUtilities.dp(16.0f) + this.h && y3 >= this.n - AndroidUtilities.dp(16.0f)) {
                            if (y3 <= AndroidUtilities.dp(16.0f) + this.n) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) - 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.F = true;
                                }
                            }
                        }
                    }
                    if (x10 >= this.r - AndroidUtilities.dp(16.0f)) {
                        if (x10 <= AndroidUtilities.dp(16.0f) + this.r && y3 >= this.s - AndroidUtilities.dp(16.0f)) {
                            if (y3 <= AndroidUtilities.dp(16.0f) + this.s) {
                                if (action == 1 && a((((float) Math.floor(getZoom() / 0.25f)) * 0.25f) + 0.25f)) {
                                    performHapticFeedback(3);
                                } else {
                                    this.F = true;
                                }
                            }
                        }
                    }
                    if (z11) {
                        if (x10 >= this.v && x10 <= this.x) {
                            if (action == 0) {
                                this.H = x10;
                                this.F = true;
                            } else if (Math.abs(this.H - x10) <= AndroidUtilities.dp(10.0f)) {
                                float f14 = (x10 - this.v) / (this.x - r2);
                                this.E = f14;
                                c91 c91Var = this.L;
                                if (c91Var != null) {
                                    c91Var.b(f14);
                                }
                                invalidate();
                            }
                        }
                    } else if (y3 >= this.w && y3 <= this.y) {
                        if (action == 1) {
                            this.I = y3;
                            this.F = true;
                        } else if (Math.abs(this.I - y3) <= AndroidUtilities.dp(10.0f)) {
                            float f15 = (y3 - this.w) / (this.y - r0);
                            this.E = f15;
                            c91 c91Var2 = this.L;
                            if (c91Var2 != null) {
                                c91Var2.b(f15);
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
            c91 c91Var3 = this.L;
            if (c91Var3 != null) {
                c91Var3.b(this.E);
            }
            invalidate();
        }
        z10 = false;
        if (action == 1) {
        }
        if (z10) {
        }
    }

    public void setDelegate(c91 c91Var) {
        this.L = c91Var;
    }
}
