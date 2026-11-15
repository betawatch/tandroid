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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i71 extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final w41 H;
    public final /* synthetic */ m71 I;
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
    public i71(m71 m71Var, Context context) {
        super(context);
        this.I = m71Var;
        this.y = true;
        this.H = new w41(this, 6);
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
        w41 w41Var = this.H;
        org.telegram.messenger.g0.r(w41Var);
        if (this.y && this.I.a.d0()) {
            org.telegram.messenger.g0.i3(w41Var, 3000L);
        }
    }

    public final void b(int i7) {
        if (this.s == i7 || i7 < 0 || this.I.I) {
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
        if (this.b || i7 < 0 || this.I.I) {
            return;
        }
        this.w = i7;
        this.e = new StaticLayout(org.telegram.messenger.g0.g0(this.w, false, false), this.c, org.telegram.messenger.g0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z10, boolean z11) {
        if (this.y == z10) {
            return;
        }
        this.y = z10;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z12 = this.y;
        Property property = View.ALPHA;
        if (z12) {
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<i71, Float>) property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new h71(this, 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z11) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<i71, Float>) property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new h71(this, 1));
            this.E.start();
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
        m71 m71Var = this.I;
        if (m71Var.Q) {
            if (m71Var.N && m71Var.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - m71Var.M;
                m71Var.M = currentTimeMillis;
                float f10 = m71Var.O - (j3 / 150.0f);
                m71Var.O = f10;
                if (f10 < 0.0f) {
                    m71Var.O = 0.0f;
                }
                invalidate();
            }
            float f11 = m71Var.O;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f11);
            imageReceiver.h(canvas, null);
        }
        if (m71Var.a.d == null || m71Var.I) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!m71Var.V) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - org.telegram.messenger.g0.L(58.0f)) - this.r, measuredHeight - org.telegram.messenger.g0.L((m71Var.U ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(18.0f), measuredHeight - org.telegram.messenger.g0.L((m71Var.U ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i10 = 0;
            if (m71Var.V) {
                L = measuredHeight - org.telegram.messenger.g0.L(3.0f);
                L2 = org.telegram.messenger.g0.L(7.0f);
            } else if (m71Var.U) {
                L = measuredHeight - org.telegram.messenger.g0.L(29.0f);
                i10 = org.telegram.messenger.g0.L(36.0f) + this.r;
                measuredWidth = (measuredWidth - org.telegram.messenger.g0.L(76.0f)) - this.r;
                L2 = org.telegram.messenger.g0.L(28.0f);
            } else {
                L = measuredHeight - org.telegram.messenger.g0.L(13.0f);
                L2 = org.telegram.messenger.g0.L(12.0f);
            }
            int i11 = measuredHeight - L2;
            boolean z10 = m71Var.U;
            Paint paint = this.h;
            if (z10) {
                canvas.drawRect(i10, L, measuredWidth, org.telegram.messenger.g0.L(3.0f) + L, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i12 = this.b ? this.G : ((int) ((this.w / this.s) * (measuredWidth - i10))) + i10;
            int i13 = this.x;
            if (i13 != 0 && (i7 = this.s) != 0) {
                float f12 = i10;
                float f13 = L;
                float c10 = com.google.android.gms.internal.vision.e2.c(i13, i7, measuredWidth - i10, f12);
                float L3 = org.telegram.messenger.g0.L(3.0f) + L;
                if (m71Var.U) {
                    paint = this.n;
                }
                canvas2.drawRect(f12, f13, c10, L3, paint);
            }
            float f14 = i12;
            float L4 = org.telegram.messenger.g0.L(3.0f) + L;
            Paint paint2 = this.f;
            canvas2.drawRect(i10, L, f14, L4, paint2);
            if (m71Var.V) {
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
        m71 m71Var = this.I;
        u51 u51Var = m71Var.a;
        if (m71Var.U) {
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
        w41 w41Var = this.H;
        if (action == 0) {
            if (!this.y || m71Var.V || m71Var.I) {
                d(true, true);
            } else if (this.s != 0) {
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (x10 >= i12 - org.telegram.messenger.g0.L(10.0f) && x10 <= org.telegram.messenger.g0.L(10.0f) + i12 && y10 >= measuredHeight - org.telegram.messenger.g0.L(10.0f) && y10 <= org.telegram.messenger.g0.L(10.0f) + measuredHeight) {
                    this.b = true;
                    this.F = x10;
                    this.G = i12;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            org.telegram.messenger.g0.r(w41Var);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (m71Var.x && u51Var.d0()) {
                org.telegram.messenger.g0.i3(w41Var, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (m71Var.x) {
                    int i13 = (int) (((this.G - i7) / (measuredWidth - i7)) * this.s);
                    this.w = i13;
                    u51Var.q0(i13 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x11 = (int) motionEvent.getX();
            int i14 = this.G - (this.F - x11);
            this.G = i14;
            this.F = x11;
            if (i14 < i7) {
                this.G = i7;
            } else if (i14 > measuredWidth) {
                this.G = measuredWidth;
            }
            c((int) (((this.G - i7) / (measuredWidth - i7)) * this.s * 1000));
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
