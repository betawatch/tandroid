package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o81 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public int A;
    public int B;
    public final o61 C;
    public final /* synthetic */ s81 D;
    public final ImageReceiver a;
    public boolean b;
    public final TextPaint c;
    public StaticLayout d;
    public StaticLayout e;
    public final Paint f;
    public final Paint h;
    public final Paint n;
    public int r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public AnimatorSet y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o81(s81 s81Var, Context context) {
        super(context);
        this.D = s81Var;
        this.x = true;
        this.C = new o61(this, 4);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setColor(-15095832);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(-6975081);
        Paint paint3 = new Paint(1);
        this.n = paint3;
        paint3.setColor(-1);
        this.a = new ImageReceiver(this);
    }

    public final void a() {
        o61 o61Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(o61Var);
        if (this.x && this.D.a.z()) {
            AndroidUtilities.runOnUIThread(o61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.s == i10 || i10 < 0 || this.D.D) {
            return;
        }
        this.s = i10;
        StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.s), this.c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i10) {
        if (this.b || i10 < 0 || this.D.D) {
            return;
        }
        this.v = i10;
        this.e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.x;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<o81, Float>) property, 1.0f));
                this.y.setDuration(150L);
                this.y.addListener(new n81(this, 0));
                this.y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<o81, Float>) property, 0.0f));
            this.y.setDuration(150L);
            this.y.addListener(new n81(this, 1));
            this.y.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int dp;
        int dp2;
        Canvas canvas2;
        int i10;
        s81 s81Var = this.D;
        if (s81Var.L) {
            if (s81Var.I && s81Var.J != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - s81Var.H;
                s81Var.H = currentTimeMillis;
                float f9 = s81Var.J - (j10 / 150.0f);
                s81Var.J = f9;
                if (f9 < 0.0f) {
                    s81Var.J = 0.0f;
                }
                invalidate();
            }
            float f10 = s81Var.J;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f10);
            imageReceiver.draw(canvas);
        }
        if (s81Var.a.d == null || s81Var.D) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!s81Var.Q) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.r, measuredHeight - AndroidUtilities.dp((s81Var.P ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((s81Var.P ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i11 = 0;
            if (s81Var.Q) {
                dp = measuredHeight - AndroidUtilities.dp(3.0f);
                dp2 = AndroidUtilities.dp(7.0f);
            } else if (s81Var.P) {
                dp = measuredHeight - AndroidUtilities.dp(29.0f);
                i11 = AndroidUtilities.dp(36.0f) + this.r;
                measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.r;
                dp2 = AndroidUtilities.dp(28.0f);
            } else {
                dp = measuredHeight - AndroidUtilities.dp(13.0f);
                dp2 = AndroidUtilities.dp(12.0f);
            }
            int i12 = measuredHeight - dp2;
            boolean z10 = s81Var.P;
            Paint paint = this.h;
            if (z10) {
                canvas.drawRect(i11, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i13 = this.b ? this.B : ((int) ((this.v / this.s) * (measuredWidth - i11))) + i11;
            int i14 = this.w;
            if (i14 != 0 && (i10 = this.s) != 0) {
                float f11 = i11;
                float f12 = dp;
                float c3 = u3.c.c(i14, i10, measuredWidth - i11, f11);
                float dp3 = AndroidUtilities.dp(3.0f) + dp;
                if (s81Var.P) {
                    paint = this.n;
                }
                canvas2.drawRect(f11, f12, c3, dp3, paint);
            }
            float f13 = i13;
            float dp4 = AndroidUtilities.dp(3.0f) + dp;
            Paint paint2 = this.f;
            canvas2.drawRect(i11, dp, f13, dp4, paint2);
            if (s81Var.Q) {
                return;
            }
            canvas2.drawCircle(f13, i12, AndroidUtilities.dp(this.b ? 7.0f : 5.0f), paint2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.x) {
            onTouchEvent(motionEvent);
            return this.b;
        }
        d(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        s81 s81Var = this.D;
        x61 x61Var = s81Var.a;
        if (s81Var.P) {
            i10 = AndroidUtilities.dp(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i10 = 0;
        }
        int i12 = this.s;
        if (i12 != 0) {
            i11 = (int) ((this.v / i12) * (measuredWidth - i10));
        } else {
            i11 = 0;
        }
        int i13 = i11 + i10;
        int action = motionEvent.getAction();
        o61 o61Var = this.C;
        if (action == 0) {
            if (!this.x || s81Var.Q || s81Var.D) {
                d(true, true);
            } else if (this.s != 0) {
                int x4 = (int) motionEvent.getX();
                int y8 = (int) motionEvent.getY();
                if (x4 >= i13 - AndroidUtilities.dp(10.0f) && x4 <= AndroidUtilities.dp(10.0f) + i13 && y8 >= measuredHeight - AndroidUtilities.dp(10.0f) && y8 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                    this.b = true;
                    this.A = x4;
                    this.B = i13;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(o61Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (s81Var.w && x61Var.z()) {
                AndroidUtilities.runOnUIThread(o61Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (s81Var.w) {
                    int i14 = (int) (((this.B - i10) / (measuredWidth - i10)) * this.s);
                    this.v = i14;
                    x61Var.M(i14 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x10 = (int) motionEvent.getX();
            int i15 = this.B - (this.A - x10);
            this.B = i15;
            this.A = x10;
            if (i15 < i10) {
                this.B = i10;
            } else if (i15 > measuredWidth) {
                this.B = measuredWidth;
            }
            c((int) (((this.B - i10) / (measuredWidth - i10)) * this.s * MediaDataController.MAX_STYLE_RUNS_COUNT));
            invalidate();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        a();
    }
}
