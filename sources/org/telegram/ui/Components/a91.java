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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class a91 extends FrameLayout {
    public static final /* synthetic */ int F = 0;
    public int B;
    public int C;
    public final z61 D;
    public final /* synthetic */ e91 E;
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
    public a91(e91 e91Var, Context context) {
        super(context);
        this.E = e91Var;
        this.x = true;
        this.D = new z61(this, 4);
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
        z61 z61Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(z61Var);
        if (this.x && this.E.a.y()) {
            AndroidUtilities.runOnUIThread(z61Var, 3000L);
        }
    }

    public final void b(int i10) {
        if (this.s == i10 || i10 < 0 || this.E.E) {
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
        if (this.b || i10 < 0 || this.E.E) {
            return;
        }
        this.v = i10;
        this.e = new StaticLayout(AndroidUtilities.formatShortDuration(this.v), this.c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z4, boolean z10) {
        if (this.x == z4) {
            return;
        }
        this.x = z4;
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z11 = this.x;
        Property property = View.ALPHA;
        if (z11) {
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.y = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<a91, Float>) property, 1.0f));
                this.y.setDuration(150L);
                this.y.addListener(new z81(this, 0));
                this.y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z10) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<a91, Float>) property, 0.0f));
            this.y.setDuration(150L);
            this.y.addListener(new z81(this, 1));
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
        e91 e91Var = this.E;
        if (e91Var.M) {
            if (e91Var.J && e91Var.K != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - e91Var.I;
                e91Var.I = currentTimeMillis;
                float f10 = e91Var.K - (j10 / 150.0f);
                e91Var.K = f10;
                if (f10 < 0.0f) {
                    e91Var.K = 0.0f;
                }
                invalidate();
            }
            float f11 = e91Var.K;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f11);
            imageReceiver.draw(canvas);
        }
        if (e91Var.a.d == null || e91Var.E) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!e91Var.R) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.r, measuredHeight - AndroidUtilities.dp((e91Var.Q ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((e91Var.Q ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i11 = 0;
            if (e91Var.R) {
                dp = measuredHeight - AndroidUtilities.dp(3.0f);
                dp2 = AndroidUtilities.dp(7.0f);
            } else if (e91Var.Q) {
                dp = measuredHeight - AndroidUtilities.dp(29.0f);
                i11 = AndroidUtilities.dp(36.0f) + this.r;
                measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.r;
                dp2 = AndroidUtilities.dp(28.0f);
            } else {
                dp = measuredHeight - AndroidUtilities.dp(13.0f);
                dp2 = AndroidUtilities.dp(12.0f);
            }
            int i12 = measuredHeight - dp2;
            boolean z4 = e91Var.Q;
            Paint paint = this.h;
            if (z4) {
                canvas.drawRect(i11, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i13 = this.b ? this.C : ((int) ((this.v / this.s) * (measuredWidth - i11))) + i11;
            int i14 = this.w;
            if (i14 != 0 && (i10 = this.s) != 0) {
                float f12 = i11;
                float f13 = dp;
                float c3 = vh.w2.c(i14, i10, measuredWidth - i11, f12);
                float dp3 = AndroidUtilities.dp(3.0f) + dp;
                if (e91Var.Q) {
                    paint = this.n;
                }
                canvas2.drawRect(f12, f13, c3, dp3, paint);
            }
            float f14 = i13;
            float dp4 = AndroidUtilities.dp(3.0f) + dp;
            Paint paint2 = this.f;
            canvas2.drawRect(i11, dp, f14, dp4, paint2);
            if (e91Var.R) {
                return;
            }
            canvas2.drawCircle(f14, i12, AndroidUtilities.dp(this.b ? 7.0f : 5.0f), paint2);
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
        e91 e91Var = this.E;
        i71 i71Var = e91Var.a;
        if (e91Var.Q) {
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
        z61 z61Var = this.D;
        if (action == 0) {
            if (!this.x || e91Var.R || e91Var.E) {
                d(true, true);
            } else if (this.s != 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= i13 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i13 && y10 >= measuredHeight - AndroidUtilities.dp(10.0f) && y10 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                    this.b = true;
                    this.B = x10;
                    this.C = i13;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(z61Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (e91Var.w && i71Var.y()) {
                AndroidUtilities.runOnUIThread(z61Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (e91Var.w) {
                    int i14 = (int) (((this.C - i10) / (measuredWidth - i10)) * this.s);
                    this.v = i14;
                    i71Var.L(i14 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x11 = (int) motionEvent.getX();
            int i15 = this.C - (this.B - x11);
            this.C = i15;
            this.B = x11;
            if (i15 < i10) {
                this.C = i10;
            } else if (i15 > measuredWidth) {
                this.C = measuredWidth;
            }
            c((int) (((this.C - i10) / (measuredWidth - i10)) * this.s * MediaDataController.MAX_STYLE_RUNS_COUNT));
            invalidate();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        a();
    }
}
