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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l95 extends FrameLayout implements vlb, nb5 {
    public int E;
    public final TextPaint F;
    public final cj1 G;
    public float H;
    public boolean I;
    public ob5 J;
    public final vb5 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ m95 Q;
    public final pc0 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final bf0 d;
    public long e;
    public rd2 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public ha5 w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l95(m95 m95Var, Context context) {
        super(context);
        this.Q = m95Var;
        pc0 pc0Var = new pc0((ylb) null);
        this.a = pc0Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new vb5(gm.L(26.0f), gm.L(29.0f));
        pc0Var.s((int) (gm.L(18.0f) / 1.15f));
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setRoundRadius(gm.L(20.0f));
        addView(bf0Var, qoe.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(cmb.w0(null, cmb.jh, false));
        paint2.setColor(cmb.w0(null, cmb.gh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gm.L(2.0f));
        textPaint.setColor(-1);
        cj1 cj1Var = new cj1((byte) 2, context, this);
        this.G = cj1Var;
        cj1Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(cj1Var, qoe.c(24.0f, 24));
    }

    private void setSelectedProgress(float f) {
        if (this.H != f) {
            this.H = f;
            this.r.setAlpha((int) (f * 255.0f));
        }
    }

    @Override // nb5
    public final void a() {
        this.K.e(this, this.J.e);
        f(true);
    }

    public final void b(boolean z) {
        m95 m95Var = this.Q;
        g95 g95Var = m95Var.r;
        if (g95Var.J) {
            return;
        }
        ha5 ha5Var = this.w;
        if (z) {
            if (ha5Var == null) {
                this.w = ha5.c(m95Var.h, m95Var.n, null, this, null, this.f, m95Var.c, g95Var);
            }
        } else {
            if (ha5Var != null) {
                ha5Var.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int D = wi8.D(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, gm.L(22.0f) + D, gm.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(D, gm.L(53.0f));
            cj1 cj1Var = this.G;
            if (cj1Var.getDrawable() != null) {
                cj1Var.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                cj1Var.draw(canvas);
                cj1Var.getDrawable().setAlpha(nm7.d4);
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
                    RectF rectF = gm.P;
                    rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                    Paint paint = this.r;
                    rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                    canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), paint);
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
        ha5 ha5Var = this.w;
        if (ha5Var != null && !ha5Var.b && !ha5Var.r && ha5Var.w && ha5Var.a.d.isFirstFrameRendered() && ha5Var.getAlpha() == 1.0f && !this.Q.r.v4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = gm.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, gm.L(13.0f), gm.L(13.0f), this.n);
            d(canvas);
        }
        bf0 bf0Var = this.d;
        float x = bf0Var.getX() + (bf0Var.getMeasuredWidth() / 2);
        float y = bf0Var.getY() + (bf0Var.getMeasuredHeight() / 2);
        vb5 vb5Var = this.K;
        vb5Var.f();
        vb5Var.a(canvas, x, y, this);
        float f = this.s;
        float L = (f * 1.0f) + ((1.0f - f) * (gm.L(46.0f) / gm.L(40.0f)));
        bf0Var.setScaleX(vb5Var.b() * L);
        bf0Var.setScaleY(vb5Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(rd2 rd2Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        this.f = rd2Var;
        this.h = groupCallParticipant;
        long j = this.e;
        long B1 = k47.B1(groupCallParticipant.peer);
        this.e = B1;
        m95 m95Var = this.Q;
        int i = m95Var.d;
        bf0 bf0Var = this.d;
        pc0 pc0Var = this.a;
        if (B1 > 0) {
            TLRPC.User W1 = oc7.r1(j5.a(i).a).W1(Long.valueOf(this.e));
            this.b = W1;
            this.c = null;
            pc0Var.q(W1);
            this.y = m9c.k(this.b, true);
            bf0Var.getImageReceiver().d = i;
            bf0Var.m(gn5.l(z8c.t0, 1, this.b), "50_50", pc0Var, this.b);
        } else {
            TLRPC.Chat L0 = oc7.r1(j5.a(i).a).L0(Long.valueOf(-this.e));
            this.c = L0;
            this.b = null;
            pc0Var.p(L0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                bf0Var.getImageReceiver().d = i;
                bf0Var.m(gn5.a(1, this.c), "50_50", pc0Var, this.c);
            }
        }
        boolean z = false;
        boolean z2 = j == this.e;
        c75 c75Var = m95Var.n;
        if (rd2Var == null) {
            boolean z3 = c75Var.d == k47.B1(groupCallParticipant.peer);
            this.I = z3;
            z = z3;
        } else {
            rd2 rd2Var2 = c75Var.e;
            if (rd2Var2 != null) {
                z = rd2Var2.equals(rd2Var);
                this.I = z;
            } else {
                this.I = false;
            }
        }
        if (!z2) {
            setSelectedProgress(z ? 1.0f : 0.0f);
        }
        ob5 ob5Var = this.J;
        if (ob5Var != null) {
            ob5Var.h = groupCallParticipant;
            ob5Var.c(z2);
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
        ob5 ob5Var = this.J;
        if (ob5Var == null) {
            return;
        }
        ob5Var.c(z);
        ob5 ob5Var2 = this.J;
        if (ob5Var2.k) {
            w03 = cmb.w0(null, cmb.ih, false);
        } else {
            if (!ob5Var2.e) {
                w0 = cmb.w0(null, cmb.dh, false);
                w02 = cmb.w0(null, cmb.fh, false);
                if (!z) {
                    int i = this.M;
                    int i2 = this.N;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O = ofFloat;
                    ofFloat.addUpdateListener(new k95(this, i, w0, i2, w02, (byte) 0));
                    this.O.addListener(new lx0(this, w0, w02, (byte) 1));
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
                this.K.d(on2.p(w02, 38));
                invalidate();
                return;
            }
            w03 = cmb.w0(null, cmb.gh, false);
        }
        w0 = w03;
        w02 = w0;
        if (!z) {
        }
    }

    public bf0 getAvatarImageView() {
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

    public ha5 getRenderer() {
        return this.w;
    }

    public rd2 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        ha5 ha5Var = this.w;
        if (ha5Var != null) {
            ha5Var.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ob5 ob5Var;
        super.onAttachedToWindow();
        m95 m95Var = this.Q;
        g95 g95Var = m95Var.r;
        if (m95Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (g95Var.l4.size() > 0) {
            ob5Var = (ob5) td4.m(1, g95Var.l4);
            this.J = ob5Var;
        } else {
            ob5Var = new ob5();
            this.J = ob5Var;
        }
        ob5Var.g = this;
        ob5Var.c = this.G;
        ob5Var.c(false);
        ob5 ob5Var2 = this.J;
        ob5Var2.h = this.h;
        ob5Var2.c(false);
        f(false);
        boolean z = this.J.e;
        vb5 vb5Var = this.K;
        vb5Var.e(this, z);
        if (this.J.e) {
            return;
        }
        vb5Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        ob5 ob5Var = this.J;
        if (ob5Var != null) {
            this.Q.r.l4.add(ob5Var);
            ob5 ob5Var2 = this.J;
            ob5Var2.c = null;
            ob5Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float L = gm.L(12.0f);
        TextPaint textPaint = this.F;
        textPaint.setTextSize(L);
        if (this.y != null) {
            int min = (int) Math.min(gm.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAmplitude(double d) {
        ob5 ob5Var = this.J;
        if (ob5Var != null) {
            ob5Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f) {
        if (this.s != f) {
            this.s = f;
            Paint paint = this.n;
            bf0 bf0Var = this.d;
            if (f == 1.0f) {
                bf0Var.setTranslationY(0.0f);
                bf0Var.setScaleX(1.0f);
                bf0Var.setScaleY(1.0f);
                paint.setAlpha(nm7.d4);
                invalidate();
                ha5 ha5Var = this.w;
                if (ha5Var != null) {
                    ha5Var.invalidate();
                    return;
                }
                return;
            }
            float f2 = 1.0f - f;
            float L = (1.0f * f) + ((gm.L(46.0f) / gm.L(40.0f)) * f2);
            bf0Var.setTranslationY((-(((bf0Var.getMeasuredHeight() / 2.0f) + bf0Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f2);
            bf0Var.setScaleX(L);
            bf0Var.setScaleY(L);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            ha5 ha5Var2 = this.w;
            if (ha5Var2 != null) {
                ha5Var2.invalidate();
            }
        }
    }

    public void setRenderer(ha5 ha5Var) {
        this.w = ha5Var;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.n.setColor(cmb.w0(null, cmb.jh, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
