// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o95 extends FrameLayout implements snb, qb5 {
    public int E;
    public final TextPaint F;
    public final di1 G;
    public float H;
    public boolean I;
    public rb5 J;
    public final yb5 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ p95 Q;
    public final rb0 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final de0 d;
    public long e;
    public wc2 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public ka5 w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o95(p95 p95Var, Context context) {
        super(context);
        this.Q = p95Var;
        rb0 rb0Var = new rb0((vnb) null);
        this.a = rb0Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new yb5(hl.L(26.0f), hl.L(29.0f));
        rb0Var.s((int) (hl.L(18.0f) / 1.15f));
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var, tre.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(aob.w0(null, aob.kh, false));
        paint2.setColor(aob.w0(null, aob.hh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(hl.L(2.0f));
        textPaint.setColor(-1);
        di1 di1Var = new di1((byte) 2, context, this);
        this.G = di1Var;
        di1Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(di1Var, tre.c(24.0f, 24));
    }

    private void setSelectedProgress(float f) {
        if (this.H != f) {
            this.H = f;
            this.r.setAlpha((int) (f * 255.0f));
        }
    }

    @Override // qb5
    public final void a() {
        this.K.e(this, this.J.e);
        f(true);
    }

    public final void b(boolean z) {
        p95 p95Var = this.Q;
        j95 j95Var = p95Var.r;
        if (j95Var.J) {
            return;
        }
        ka5 ka5Var = this.w;
        if (z) {
            if (ka5Var == null) {
                this.w = ka5.c(p95Var.h, p95Var.n, null, this, null, this.f, p95Var.c, j95Var);
            }
        } else {
            if (ka5Var != null) {
                ka5Var.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int D = ik8.D(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, hl.L(22.0f) + D, hl.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(D, hl.L(53.0f));
            di1 di1Var = this.G;
            if (di1Var.getDrawable() != null) {
                di1Var.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                di1Var.draw(canvas);
                di1Var.getDrawable().setAlpha(jn7.d4);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        boolean z = this.I;
        if (z) {
            float f = this.H;
            if (f != 1.0f) {
                float f2 = f + 0.10666667f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f2);
                if (this.H <= 0.0f) {
                    float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
                    RectF rectF = hl.P;
                    rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                    Paint paint = this.r;
                    rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                    canvas.drawRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), paint);
                    return;
                }
                return;
            }
        }
        if (!z) {
            float f3 = this.H;
            if (f3 != 0.0f) {
                float f4 = f3 - 0.10666667f;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f4);
            }
        }
        if (this.H <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ka5 ka5Var = this.w;
        if (ka5Var != null && !ka5Var.b && !ka5Var.r && ka5Var.w && ka5Var.a.d.c.P && ka5Var.getAlpha() == 1.0f && !this.Q.r.v4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = hl.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, hl.L(13.0f), hl.L(13.0f), this.n);
            d(canvas);
        }
        de0 de0Var = this.d;
        float x = de0Var.getX() + (de0Var.getMeasuredWidth() / 2);
        float y = de0Var.getY() + (de0Var.getMeasuredHeight() / 2);
        yb5 yb5Var = this.K;
        yb5Var.f();
        yb5Var.a(canvas, x, y, this);
        float f = this.s;
        float L = (f * 1.0f) + ((1.0f - f) * (hl.L(46.0f) / hl.L(40.0f)));
        de0Var.setScaleX(yb5Var.b() * L);
        de0Var.setScaleY(yb5Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(wc2 wc2Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        this.f = wc2Var;
        this.h = groupCallParticipant;
        long j = this.e;
        long B1 = r47.B1(groupCallParticipant.peer);
        this.e = B1;
        p95 p95Var = this.Q;
        int i = p95Var.d;
        de0 de0Var = this.d;
        rb0 rb0Var = this.a;
        if (B1 > 0) {
            TLRPC.User X1 = uc7.s1(k5.a(i).a).X1(Long.valueOf(this.e));
            this.b = X1;
            this.c = null;
            rb0Var.q(X1);
            this.y = lbc.k(this.b, true);
            de0Var.getImageReceiver().d = i;
            de0Var.m(jn5.l(yac.t0, 1, this.b), "50_50", rb0Var, this.b);
        } else {
            TLRPC.Chat M0 = uc7.s1(k5.a(i).a).M0(Long.valueOf(-this.e));
            this.c = M0;
            this.b = null;
            rb0Var.p(M0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                de0Var.getImageReceiver().d = i;
                de0Var.m(jn5.a(1, this.c), "50_50", rb0Var, this.c);
            }
        }
        boolean z = false;
        boolean z2 = j == this.e;
        g75 g75Var = p95Var.n;
        if (wc2Var == null) {
            boolean z3 = g75Var.d == r47.B1(groupCallParticipant.peer);
            this.I = z3;
            z = z3;
        } else {
            wc2 wc2Var2 = g75Var.e;
            if (wc2Var2 != null) {
                z = wc2Var2.equals(wc2Var);
                this.I = z;
            } else {
                this.I = false;
            }
        }
        if (!z2) {
            setSelectedProgress(z ? 1.0f : 0.0f);
        }
        rb5 rb5Var = this.J;
        if (rb5Var != null) {
            rb5Var.h = groupCallParticipant;
            rb5Var.c(z2);
            f(z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z) {
        int w0;
        int w02;
        int w03;
        rb5 rb5Var = this.J;
        if (rb5Var == null) {
            return;
        }
        rb5Var.c(z);
        rb5 rb5Var2 = this.J;
        if (rb5Var2.k) {
            w03 = aob.w0(null, aob.jh, false);
        } else {
            if (!rb5Var2.e) {
                w0 = aob.w0(null, aob.eh, false);
                w02 = aob.w0(null, aob.gh, false);
                if (!z) {
                    int i = this.M;
                    int i2 = this.N;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O = ofFloat;
                    ofFloat.addUpdateListener(new n95(this, i, w0, i2, w02, (byte) 0));
                    this.O.addListener(new mw0(this, w0, w02, (byte) 1));
                    this.O.start();
                    return;
                }
                ValueAnimator valueAnimator = this.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.O.cancel();
                }
                this.M = w0;
                this.N = w02;
                this.G.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                this.F.setColor(this.M);
                this.r.setColor(w02);
                this.K.d(vm2.o(w02, 38));
                invalidate();
                return;
            }
            w03 = aob.w0(null, aob.hh, false);
        }
        w0 = w03;
        w02 = w0;
        if (!z) {
        }
    }

    public de0 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.s;
    }

    public ka5 getRenderer() {
        return this.w;
    }

    public wc2 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        ka5 ka5Var = this.w;
        if (ka5Var != null) {
            ka5Var.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        rb5 rb5Var;
        super.onAttachedToWindow();
        p95 p95Var = this.Q;
        j95 j95Var = p95Var.r;
        if (p95Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (j95Var.l4.size() > 0) {
            rb5Var = (rb5) qd4.l(1, j95Var.l4);
            this.J = rb5Var;
        } else {
            rb5Var = new rb5();
            this.J = rb5Var;
        }
        rb5Var.g = this;
        rb5Var.c = this.G;
        rb5Var.c(false);
        rb5 rb5Var2 = this.J;
        rb5Var2.h = this.h;
        rb5Var2.c(false);
        f(false);
        boolean z = this.J.e;
        yb5 yb5Var = this.K;
        yb5Var.e(this, z);
        if (this.J.e) {
            return;
        }
        yb5Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        rb5 rb5Var = this.J;
        if (rb5Var != null) {
            this.Q.r.l4.add(rb5Var);
            rb5 rb5Var2 = this.J;
            rb5Var2.c = null;
            rb5Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float L = hl.L(12.0f);
        TextPaint textPaint = this.F;
        textPaint.setTextSize(L);
        if (this.y != null) {
            int min = (int) Math.min(hl.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAmplitude(double d) {
        rb5 rb5Var = this.J;
        if (rb5Var != null) {
            rb5Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f) {
        if (this.s != f) {
            this.s = f;
            Paint paint = this.n;
            de0 de0Var = this.d;
            if (f == 1.0f) {
                de0Var.setTranslationY(0.0f);
                de0Var.setScaleX(1.0f);
                de0Var.setScaleY(1.0f);
                paint.setAlpha(jn7.d4);
                invalidate();
                ka5 ka5Var = this.w;
                if (ka5Var != null) {
                    ka5Var.invalidate();
                    return;
                }
                return;
            }
            float f2 = 1.0f - f;
            float L = (1.0f * f) + ((hl.L(46.0f) / hl.L(40.0f)) * f2);
            de0Var.setTranslationY((-(((de0Var.getMeasuredHeight() / 2.0f) + de0Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f2);
            de0Var.setScaleX(L);
            de0Var.setScaleY(L);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            ka5 ka5Var2 = this.w;
            if (ka5Var2 != null) {
                ka5Var2.invalidate();
            }
        }
    }

    public void setRenderer(ka5 ka5Var) {
        this.w = ka5Var;
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.n.setColor(aob.w0(null, aob.kh, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
