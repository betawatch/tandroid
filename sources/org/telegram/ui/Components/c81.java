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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c81 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public int A;
    public int B;
    public final b61 C;
    public final /* synthetic */ g81 D;
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
    public c81(g81 g81Var, Context context) {
        super(context);
        this.D = g81Var;
        this.x = true;
        this.C = new b61(this, 4);
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
        b61 b61Var = this.C;
        AndroidUtilities.cancelRunOnUIThread(b61Var);
        if (this.x && this.D.a.z()) {
            AndroidUtilities.runOnUIThread(b61Var, 3000L);
        }
    }

    public final void b(int i9) {
        if (this.s == i9 || i9 < 0 || this.D.D) {
            return;
        }
        this.s = i9;
        StaticLayout staticLayout = new StaticLayout(AndroidUtilities.formatShortDuration(this.s), this.c, AndroidUtilities.dp(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i9) {
        if (this.b || i9 < 0 || this.D.D) {
            return;
        }
        this.v = i9;
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
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<c81, Float>) property, 1.0f));
                this.y.setDuration(150L);
                this.y.addListener(new b81(this, 0));
                this.y.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.y = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<c81, Float>) property, 0.0f));
            this.y.setDuration(150L);
            this.y.addListener(new b81(this, 1));
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
        int i9;
        g81 g81Var = this.D;
        if (g81Var.L) {
            if (g81Var.I && g81Var.J != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - g81Var.H;
                g81Var.H = currentTimeMillis;
                float f10 = g81Var.J - (j10 / 150.0f);
                g81Var.J = f10;
                if (f10 < 0.0f) {
                    g81Var.J = 0.0f;
                }
                invalidate();
            }
            float f11 = g81Var.J;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f11);
            imageReceiver.draw(canvas);
        }
        if (g81Var.a.d == null || g81Var.D) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!g81Var.Q) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - AndroidUtilities.dp(58.0f)) - this.r, measuredHeight - AndroidUtilities.dp((g81Var.P ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(18.0f), measuredHeight - AndroidUtilities.dp((g81Var.P ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i10 = 0;
            if (g81Var.Q) {
                dp = measuredHeight - AndroidUtilities.dp(3.0f);
                dp2 = AndroidUtilities.dp(7.0f);
            } else if (g81Var.P) {
                dp = measuredHeight - AndroidUtilities.dp(29.0f);
                i10 = AndroidUtilities.dp(36.0f) + this.r;
                measuredWidth = (measuredWidth - AndroidUtilities.dp(76.0f)) - this.r;
                dp2 = AndroidUtilities.dp(28.0f);
            } else {
                dp = measuredHeight - AndroidUtilities.dp(13.0f);
                dp2 = AndroidUtilities.dp(12.0f);
            }
            int i11 = measuredHeight - dp2;
            boolean z10 = g81Var.P;
            Paint paint = this.h;
            if (z10) {
                canvas.drawRect(i10, dp, measuredWidth, AndroidUtilities.dp(3.0f) + dp, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i12 = this.b ? this.B : ((int) ((this.v / this.s) * (measuredWidth - i10))) + i10;
            int i13 = this.w;
            if (i13 != 0 && (i9 = this.s) != 0) {
                float f12 = i10;
                float f13 = dp;
                float b10 = org.telegram.ui.Cells.j2.b(i13, i9, measuredWidth - i10, f12);
                float dp3 = AndroidUtilities.dp(3.0f) + dp;
                if (g81Var.P) {
                    paint = this.n;
                }
                canvas2.drawRect(f12, f13, b10, dp3, paint);
            }
            float f14 = i12;
            float dp4 = AndroidUtilities.dp(3.0f) + dp;
            Paint paint2 = this.f;
            canvas2.drawRect(i10, dp, f14, dp4, paint2);
            if (g81Var.Q) {
                return;
            }
            canvas2.drawCircle(f14, i11, AndroidUtilities.dp(this.b ? 7.0f : 5.0f), paint2);
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
        int i9;
        int i10;
        g81 g81Var = this.D;
        k61 k61Var = g81Var.a;
        if (g81Var.P) {
            i9 = AndroidUtilities.dp(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - AndroidUtilities.dp(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(12.0f);
            i9 = 0;
        }
        int i11 = this.s;
        if (i11 != 0) {
            i10 = (int) ((this.v / i11) * (measuredWidth - i9));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i9;
        int action = motionEvent.getAction();
        b61 b61Var = this.C;
        if (action == 0) {
            if (!this.x || g81Var.Q || g81Var.D) {
                d(true, true);
            } else if (this.s != 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= i12 - AndroidUtilities.dp(10.0f) && x10 <= AndroidUtilities.dp(10.0f) + i12 && y10 >= measuredHeight - AndroidUtilities.dp(10.0f) && y10 <= AndroidUtilities.dp(10.0f) + measuredHeight) {
                    this.b = true;
                    this.A = x10;
                    this.B = i12;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            AndroidUtilities.cancelRunOnUIThread(b61Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (g81Var.w && k61Var.z()) {
                AndroidUtilities.runOnUIThread(b61Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (g81Var.w) {
                    int i13 = (int) (((this.B - i9) / (measuredWidth - i9)) * this.s);
                    this.v = i13;
                    k61Var.M(i13 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x11 = (int) motionEvent.getX();
            int i14 = this.B - (this.A - x11);
            this.B = i14;
            this.A = x11;
            if (i14 < i9) {
                this.B = i9;
            } else if (i14 > measuredWidth) {
                this.B = measuredWidth;
            }
            c((int) (((this.B - i9) / (measuredWidth - i9)) * this.s * MediaDataController.MAX_STYLE_RUNS_COUNT));
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
