// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dyc extends FrameLayout {
    public static final /* synthetic */ int J = 0;
    public AnimatorSet E;
    public int F;
    public int G;
    public final olc H;
    public final /* synthetic */ hyc I;
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
    public dyc(hyc hycVar, Activity activity) {
        super(activity);
        this.I = hycVar;
        this.y = true;
        this.H = new olc(this, (byte) 21);
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(hl.L(12.0f));
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
        olc olcVar = this.H;
        hl.r(olcVar);
        if (this.y && this.I.a.c0()) {
            hl.d3(olcVar, 3000L);
        }
    }

    public final void b(int i) {
        if (this.s == i || i < 0 || this.I.I) {
            return;
        }
        this.s = i;
        StaticLayout staticLayout = new StaticLayout(hl.g0(this.s, false, false), this.c, hl.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            this.r = (int) Math.ceil(this.d.getLineWidth(0));
        }
        invalidate();
    }

    public final void c(int i) {
        if (this.b || i < 0 || this.I.I) {
            return;
        }
        this.w = i;
        this.e = new StaticLayout(hl.g0(this.w, false, false), this.c, hl.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public final void d(boolean z, boolean z2) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        boolean z3 = this.y;
        Property property = View.ALPHA;
        if (z3) {
            if (z2) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E = animatorSet2;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, (Property<dyc, Float>) property, 1.0f));
                this.E.setDuration(150L);
                this.E.addListener(new cyc(this, (byte) 0));
                this.E.start();
            } else {
                setAlpha(1.0f);
            }
        } else if (z2) {
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.E = animatorSet3;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(this, (Property<dyc, Float>) property, 0.0f));
            this.E.setDuration(150L);
            this.E.addListener(new cyc(this, (byte) 1));
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
        int i;
        hyc hycVar = this.I;
        if (hycVar.Q) {
            if (hycVar.N && hycVar.O != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - hycVar.M;
                hycVar.M = currentTimeMillis;
                float f = hycVar.O - (j / 150.0f);
                hycVar.O = f;
                if (f < 0.0f) {
                    hycVar.O = 0.0f;
                }
                invalidate();
            }
            float f2 = hycVar.O;
            ImageReceiver imageReceiver = this.a;
            imageReceiver.setAlpha(f2);
            imageReceiver.h(canvas, null);
        }
        if (hycVar.a.d == null || hycVar.I) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!hycVar.V) {
            if (this.d != null) {
                canvas.save();
                canvas.translate((measuredWidth - hl.L(58.0f)) - this.r, measuredHeight - hl.L((hycVar.U ? 6 : 10) + 29));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (this.e != null) {
                canvas.save();
                canvas.translate(hl.L(18.0f), measuredHeight - hl.L((hycVar.U ? 6 : 10) + 29));
                this.e.draw(canvas);
                canvas.restore();
            }
        }
        if (this.s != 0) {
            int i2 = 0;
            if (hycVar.V) {
                L = measuredHeight - hl.L(3.0f);
                L2 = hl.L(7.0f);
            } else if (hycVar.U) {
                L = measuredHeight - hl.L(29.0f);
                i2 = hl.L(36.0f) + this.r;
                measuredWidth = (measuredWidth - hl.L(76.0f)) - this.r;
                L2 = hl.L(28.0f);
            } else {
                L = measuredHeight - hl.L(13.0f);
                L2 = hl.L(12.0f);
            }
            int i3 = measuredHeight - L2;
            boolean z = hycVar.U;
            Paint paint = this.h;
            if (z) {
                canvas.drawRect(i2, L, measuredWidth, hl.L(3.0f) + L, paint);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            int i4 = this.b ? this.G : ((int) ((this.w / this.s) * (measuredWidth - i2))) + i2;
            int i5 = this.x;
            if (i5 != 0 && (i = this.s) != 0) {
                float f3 = i2;
                float f4 = L;
                float B = c00.B(i5, i, measuredWidth - i2, f3);
                float L3 = hl.L(3.0f) + L;
                if (hycVar.U) {
                    paint = this.n;
                }
                canvas2.drawRect(f3, f4, B, L3, paint);
            }
            float f5 = i4;
            float L4 = hl.L(3.0f) + L;
            Paint paint2 = this.f;
            canvas2.drawRect(i2, L, f5, L4, paint2);
            if (hycVar.V) {
                return;
            }
            canvas2.drawCircle(f5, i3, hl.L(this.b ? 7.0f : 5.0f), paint2);
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
        int i;
        int i2;
        hyc hycVar = this.I;
        kfc kfcVar = hycVar.a;
        if (hycVar.U) {
            i = hl.L(36.0f) + this.r;
            measuredWidth = (getMeasuredWidth() - hl.L(76.0f)) - this.r;
            measuredHeight = getMeasuredHeight() - hl.L(28.0f);
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight() - hl.L(12.0f);
            i = 0;
        }
        int i3 = this.s;
        if (i3 != 0) {
            i2 = (int) ((this.w / i3) * (measuredWidth - i));
        } else {
            i2 = 0;
        }
        int i4 = i2 + i;
        int action = motionEvent.getAction();
        olc olcVar = this.H;
        if (action == 0) {
            if (!this.y || hycVar.V || hycVar.I) {
                d(true, true);
            } else if (this.s != 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= i4 - hl.L(10.0f) && x <= hl.L(10.0f) + i4 && y >= measuredHeight - hl.L(10.0f) && y <= hl.L(10.0f) + measuredHeight) {
                    this.b = true;
                    this.F = x;
                    this.G = i4;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    invalidate();
                }
            }
            hl.r(olcVar);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (hycVar.x && kfcVar.c0()) {
                hl.d3(olcVar, 3000L);
            }
            if (this.b) {
                this.b = false;
                if (hycVar.x) {
                    int i5 = (int) (((this.G - i) / (measuredWidth - i)) * this.s);
                    this.w = i5;
                    kfcVar.p0(i5 * 1000, false);
                }
            }
        } else if (motionEvent.getAction() == 2 && this.b) {
            int x2 = (int) motionEvent.getX();
            int i6 = this.G - (this.F - x2);
            this.G = i6;
            this.F = x2;
            if (i6 < i) {
                this.G = i;
                i6 = i;
            } else if (i6 > measuredWidth) {
                this.G = measuredWidth;
                i6 = measuredWidth;
            }
            c((int) (((i6 - i) / (measuredWidth - i)) * this.s * 1000));
            invalidate();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        a();
    }
}
