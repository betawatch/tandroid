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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class z81 extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public int E;
    public int F;
    public final y61 G;
    public final /* synthetic */ d91 H;
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
    public z81(d91 d91Var, Context context) {
        super(context);
        this.H = d91Var;
        this.x = true;
        this.G = new y61(this, 4);
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
        y61 y61Var = this.G;
        AndroidUtilities.cancelRunOnUIThread(y61Var);
        if (this.x && this.H.a.y()) {
            AndroidUtilities.runOnUIThread(y61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.s == i10 || i10 < 0 || this.H.H) {
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
        if (this.b || i10 < 0 || this.H.H) {
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
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<z81, Float>) property, 1.0f));
                this.y.setDuration(150L);
                this.y.addListener(new y81(this, 0));
                this.y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<z81, Float>) property, 0.0f));
            this.y.setDuration(150L);
            this.y.addListener(new y81(this, 1));
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
        d91 d91Var = this.H;
        if (d91Var.P) {
            if (d91Var.M && d91Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - d91Var.L;
                d91Var.L = currentTimeMillis;
                float f7 = d91Var.N - (j3 / 150.0f);
                d91Var.N = f7;
                if (f7 < 0.0f) {
                    d91Var.N = 0.0f;
                }
                invalidate();
            }
            float f10 = d91Var.N;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f10);
            imageReceiver.draw(canvas);
        }
        if (d91Var.a.d == null || d91Var.H) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!d91Var.U) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.r, measuredHeight - AndroidUtilities.dp((d91Var.T ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((d91Var.T ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i11 = 0;
            if (d91Var.U) {
                dp = measuredHeight - AndroidUtilities.dp(3.0f);
                dp2 = AndroidUtilities.dp(7.0f);
            } else if (d91Var.T) {
                dp = measuredHeight - AndroidUtilities.dp(29.0f);
                i11 = AndroidUtilities.dp(36.0f) + this.r;
                measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.r;
                dp2 = AndroidUtilities.dp(28.0f);
            } else {
                dp = measuredHeight - AndroidUtilities.dp(13.0f);
                dp2 = AndroidUtilities.dp(12.0f);
            }
            int i12 = measuredHeight - dp2;
            boolean z10 = d91Var.T;
            Paint paint = this.h;
            if (z10) {
                canvas.drawRect(i11, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i13 = this.b ? this.F : ((int) ((this.v / this.s) * (measuredWidth - i11))) + i11;
            int i14 = this.w;
            if (i14 != 0 && (i10 = this.s) != 0) {
                float f11 = i11;
                float f12 = dp;
                float e = a4.a.e(i14, i10, measuredWidth - i11, f11);
                float dp3 = AndroidUtilities.dp(3.0f) + dp;
                if (d91Var.T) {
                    paint = this.n;
                }
                canvas2.drawRect(f11, f12, e, dp3, paint);
            }
            float f13 = i13;
            float dp4 = AndroidUtilities.dp(3.0f) + dp;
            Paint paint2 = this.f;
            canvas2.drawRect(i11, dp, f13, dp4, paint2);
            if (d91Var.U) {
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
        d91 d91Var = this.H;
        h71 h71Var = d91Var.a;
        if (d91Var.T) {
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
        y61 y61Var = this.G;
        if (action == 0) {
            if (!this.x || d91Var.U || d91Var.H) {
                d(true, true);
            } else if (this.s != 0) {
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y3 >= measuredHeight - AndroidUtilities.dp(10.0f) && y3 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                    this.b = true;
                    this.E = x10;
                    this.F = i13;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(y61Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (d91Var.w && h71Var.y()) {
                AndroidUtilities.runOnUIThread(y61Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (d91Var.w) {
                    int i14 = (int) (((this.F - i10) / (measuredWidth - i10)) * this.s);
                    this.v = i14;
                    h71Var.L(i14 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x11 = (int) motionEvent.getX();
            int i15 = this.F - (this.E - x11);
            this.F = i15;
            this.E = x11;
            if (i15 < i10) {
                this.F = i10;
            } else if (i15 > measuredWidth) {
                this.F = measuredWidth;
            }
            c((int) (((this.F - i10) / (measuredWidth - i10)) * this.s * MediaDataController.MAX_STYLE_RUNS_COUNT));
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
