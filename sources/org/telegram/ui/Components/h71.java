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
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h71 extends FrameLayout {
    public static final /* synthetic */ int I = 0;
    public AnimatorSet D;
    public int E;
    public int F;
    public final s51 G;
    public final /* synthetic */ l71 H;
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
    public int w;
    public int x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h71(l71 l71Var, Context context) {
        super(context);
        this.H = l71Var;
        this.y = true;
        this.G = new s51(this, 3);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
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
        s51 s51Var = this.G;
        org.telegram.messenger.g0.r(s51Var);
        if (this.y && this.H.a.d0()) {
            org.telegram.messenger.g0.i3(s51Var, 3000L);
        }
    }

    public final void b(int i7) {
        if (this.s == i7 || i7 < 0 || this.H.H) {
            return;
        }
        this.s = i7;
        StaticLayout staticLayout = new StaticLayout(org.telegram.messenger.g0.g0(this.s, false, false), this.c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i7) {
        if (this.b || i7 < 0 || this.H.H) {
            return;
        }
        this.w = i7;
        this.e = new StaticLayout(org.telegram.messenger.g0.g0(this.w, false, false), this.c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z9, boolean z10) {
        if (this.y == z9) {
            return;
        }
        this.y = z9;
        AnimatorSet animatorSet = this.D;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z11 = this.y;
        Property property = View.ALPHA;
        if (z11) {
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.D = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<h71, Float>) property, 1.0f));
                this.D.setDuration(150L);
                this.D.addListener(new g71(this, 0));
                this.D.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z10) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.D = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<h71, Float>) property, 0.0f));
            this.D.setDuration(150L);
            this.D.addListener(new g71(this, 1));
            this.D.start();
        } else {
            setAlpha(0.0f);
        }
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int L;
        int L2;
        Canvas canvas2;
        int i7;
        l71 l71Var = this.H;
        if (l71Var.P) {
            if (l71Var.M && l71Var.N != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - l71Var.L;
                l71Var.L = currentTimeMillis;
                float f10 = l71Var.N - (j3 / 150.0f);
                l71Var.N = f10;
                if (f10 < 0.0f) {
                    l71Var.N = 0.0f;
                }
                invalidate();
            }
            float f11 = l71Var.N;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (l71Var.a.d == null || l71Var.H) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!l71Var.U) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.r, measuredHeight - org.telegram.messenger.g0.L((l71Var.T ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(18.0f), measuredHeight - org.telegram.messenger.g0.L((l71Var.T ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i10 = 0;
            if (l71Var.U) {
                L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                L2 = org.telegram.messenger.g0.L(7.0f);
            } else if (l71Var.T) {
                L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                i10 = org.telegram.messenger.g0.L(36.0f) + this.r;
                measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.r;
                L2 = org.telegram.messenger.g0.L(28.0f);
            } else {
                L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                L2 = org.telegram.messenger.g0.L(12.0f);
            }
            int i11 = measuredHeight - L2;
            boolean z9 = l71Var.T;
            Paint paint = this.h;
            if (z9) {
                canvas.drawRect(i10, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i12 = this.b ? this.F : ((int) ((this.w / this.s) * (measuredWidth - i10))) + i10;
            int i13 = this.x;
            if (i13 != 0 && (i7 = this.s) != 0) {
                float f12 = i10;
                float f13 = L;
                float c10 = com.google.android.recaptcha.internal.a.c(i13, i7, measuredWidth - i10, f12);
                float L3 = org.telegram.messenger.g0.L(3.0f) + L;
                if (l71Var.T) {
                    paint = this.n;
                }
                canvas2.drawRect(f12, f13, c10, L3, paint);
            }
            float f14 = i12;
            float L4 = org.telegram.messenger.g0.L(3.0f) + L;
            Paint paint2 = this.f;
            canvas2.drawRect(i10, L, f14, L4, paint2);
            if (l71Var.U) {
                return;
            }
            canvas2.drawCircle(f14, i11, org.telegram.messenger.g0.L(this.b ? 7.0f : 5.0f), paint2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (this.y) {
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
        int i7;
        int i10;
        l71 l71Var = this.H;
        t51 t51Var = l71Var.a;
        if (l71Var.T) {
            i7 = org.telegram.messenger.g0.L(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(12.0f);
            i7 = 0;
        }
        int i11 = this.s;
        if (i11 != 0) {
            i10 = (int) ((this.w / i11) * (measuredWidth - i7));
        } else {
            i10 = 0;
        }
        int i12 = i10 + i7;
        int action = motionEvent.getAction();
        s51 s51Var = this.G;
        if (action == 0) {
            if (!this.y || l71Var.U || l71Var.H) {
                d(true, true);
            } else if (this.s != 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y10 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y10 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                    this.b = true;
                    this.E = x10;
                    this.F = i12;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            org.telegram.messenger.g0.r(s51Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (l71Var.x && t51Var.d0()) {
                org.telegram.messenger.g0.i3(s51Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (l71Var.x) {
                    int i13 = (int) (((this.F - i7) / (measuredWidth - i7)) * this.s);
                    this.w = i13;
                    t51Var.q0(i13 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x11 = (int) motionEvent.getX();
            int i14 = this.F - (this.E - x11);
            this.F = i14;
            this.E = x11;
            if (i14 < i7) {
                this.F = i7;
            } else if (i14 > measuredWidth) {
                this.F = measuredWidth;
            }
            c((int) (((this.F - i7) / (measuredWidth - i7)) * this.s * 1000));
            invalidate();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        super.requestDisallowInterceptTouchEvent(z9);
        a();
    }
}
