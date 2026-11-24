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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m75 extends FrameLayout implements tjb, p95 {
    public int E;
    public final TextPaint F;
    public final vh1 G;
    public float H;
    public boolean I;
    public q95 J;
    public final x95 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ n75 Q;
    public final pb0 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final be0 d;
    public long e;
    public gc2 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public h85 w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m75(n75 n75Var, Context context) {
        super(context);
        this.Q = n75Var;
        pb0 pb0Var = new pb0((wjb) null);
        this.a = pb0Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new x95(gl.L(26.0f), gl.L(29.0f));
        pb0Var.s((int) (gl.L(18.0f) / 1.15f));
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setRoundRadius(gl.L(20.0f));
        addView(be0Var, nme.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(bkb.w0(null, bkb.jh, false));
        paint2.setColor(bkb.w0(null, bkb.gh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(gl.L(2.0f));
        textPaint.setColor(-1);
        vh1 vh1Var = new vh1((byte) 2, context, this);
        this.G = vh1Var;
        vh1Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(vh1Var, nme.c(24.0f, 24));
    }

    private void setSelectedProgress(float f) {
        if (this.H != f) {
            this.H = f;
            this.r.setAlpha((int) (f * 255.0f));
        }
    }

    @Override // p95
    public final void a() {
        this.K.e(this, this.J.e);
        f(true);
    }

    public final void b(boolean z) {
        n75 n75Var = this.Q;
        h75 h75Var = n75Var.r;
        if (h75Var.J) {
            return;
        }
        h85 h85Var = this.w;
        if (z) {
            if (h85Var == null) {
                this.w = h85.c(n75Var.h, n75Var.n, null, this, null, this.f, n75Var.c, h75Var);
            }
        } else {
            if (h85Var != null) {
                h85Var.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int D = ug8.D(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, gl.L(22.0f) + D, gl.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(D, gl.L(53.0f));
            vh1 vh1Var = this.G;
            if (vh1Var.getDrawable() != null) {
                vh1Var.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                vh1Var.draw(canvas);
                vh1Var.getDrawable().setAlpha(kk7.d4);
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
                    RectF rectF = gl.P;
                    rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                    Paint paint = this.r;
                    rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                    canvas.drawRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), paint);
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
        h85 h85Var = this.w;
        if (h85Var != null && !h85Var.b && !h85Var.r && h85Var.w && h85Var.a.d.isFirstFrameRendered() && h85Var.getAlpha() == 1.0f && !this.Q.r.v4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = gl.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, gl.L(13.0f), gl.L(13.0f), this.n);
            d(canvas);
        }
        be0 be0Var = this.d;
        float x = be0Var.getX() + (be0Var.getMeasuredWidth() / 2);
        float y = be0Var.getY() + (be0Var.getMeasuredHeight() / 2);
        x95 x95Var = this.K;
        x95Var.f();
        x95Var.a(canvas, x, y, this);
        float f = this.s;
        float L = (f * 1.0f) + ((1.0f - f) * (gl.L(46.0f) / gl.L(40.0f)));
        be0Var.setScaleX(x95Var.b() * L);
        be0Var.setScaleY(x95Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(gc2 gc2Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        this.f = gc2Var;
        this.h = groupCallParticipant;
        long j = this.e;
        long B1 = k27.B1(groupCallParticipant.peer);
        this.e = B1;
        n75 n75Var = this.Q;
        int i = n75Var.d;
        be0 be0Var = this.d;
        pb0 pb0Var = this.a;
        if (B1 > 0) {
            TLRPC.User V1 = na7.q1(j5.a(i).a).V1(Long.valueOf(this.e));
            this.b = V1;
            this.c = null;
            pb0Var.q(V1);
            this.y = l7c.k(this.b, true);
            be0Var.getImageReceiver().d = i;
            be0Var.m(gl5.l(y6c.t0, 1, this.b), "50_50", pb0Var, this.b);
        } else {
            TLRPC.Chat K0 = na7.q1(j5.a(i).a).K0(Long.valueOf(-this.e));
            this.c = K0;
            this.b = null;
            pb0Var.p(K0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                be0Var.getImageReceiver().d = i;
                be0Var.m(gl5.a(1, this.c), "50_50", pb0Var, this.c);
            }
        }
        boolean z = false;
        boolean z2 = j == this.e;
        e55 e55Var = n75Var.n;
        if (gc2Var == null) {
            boolean z3 = e55Var.d == k27.B1(groupCallParticipant.peer);
            this.I = z3;
            z = z3;
        } else {
            gc2 gc2Var2 = e55Var.e;
            if (gc2Var2 != null) {
                z = gc2Var2.equals(gc2Var);
                this.I = z;
            } else {
                this.I = false;
            }
        }
        if (!z2) {
            setSelectedProgress(z ? 1.0f : 0.0f);
        }
        q95 q95Var = this.J;
        if (q95Var != null) {
            q95Var.h = groupCallParticipant;
            q95Var.c(z2);
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
        q95 q95Var = this.J;
        if (q95Var == null) {
            return;
        }
        q95Var.c(z);
        q95 q95Var2 = this.J;
        if (q95Var2.k) {
            w03 = bkb.w0(null, bkb.ih, false);
        } else {
            if (!q95Var2.e) {
                w0 = bkb.w0(null, bkb.dh, false);
                w02 = bkb.w0(null, bkb.fh, false);
                if (!z) {
                    int i = this.M;
                    int i2 = this.N;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O = ofFloat;
                    ofFloat.addUpdateListener(new l75(this, i, w0, i2, w02, (byte) 0));
                    this.O.addListener(new dw0(this, w0, w02, (byte) 1));
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
                this.K.d(bm2.o(w02, 38));
                invalidate();
                return;
            }
            w03 = bkb.w0(null, bkb.gh, false);
        }
        w0 = w03;
        w02 = w0;
        if (!z) {
        }
    }

    public be0 getAvatarImageView() {
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

    public h85 getRenderer() {
        return this.w;
    }

    public gc2 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        h85 h85Var = this.w;
        if (h85Var != null) {
            h85Var.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        q95 q95Var;
        super.onAttachedToWindow();
        n75 n75Var = this.Q;
        h75 h75Var = n75Var.r;
        if (n75Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (h75Var.l4.size() > 0) {
            q95Var = (q95) tb4.l(1, h75Var.l4);
            this.J = q95Var;
        } else {
            q95Var = new q95();
            this.J = q95Var;
        }
        q95Var.g = this;
        q95Var.c = this.G;
        q95Var.c(false);
        q95 q95Var2 = this.J;
        q95Var2.h = this.h;
        q95Var2.c(false);
        f(false);
        boolean z = this.J.e;
        x95 x95Var = this.K;
        x95Var.e(this, z);
        if (this.J.e) {
            return;
        }
        x95Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        q95 q95Var = this.J;
        if (q95Var != null) {
            this.Q.r.l4.add(q95Var);
            q95 q95Var2 = this.J;
            q95Var2.c = null;
            q95Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float L = gl.L(12.0f);
        TextPaint textPaint = this.F;
        textPaint.setTextSize(L);
        if (this.y != null) {
            int min = (int) Math.min(gl.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAmplitude(double d) {
        q95 q95Var = this.J;
        if (q95Var != null) {
            q95Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f) {
        if (this.s != f) {
            this.s = f;
            Paint paint = this.n;
            be0 be0Var = this.d;
            if (f == 1.0f) {
                be0Var.setTranslationY(0.0f);
                be0Var.setScaleX(1.0f);
                be0Var.setScaleY(1.0f);
                paint.setAlpha(kk7.d4);
                invalidate();
                h85 h85Var = this.w;
                if (h85Var != null) {
                    h85Var.invalidate();
                    return;
                }
                return;
            }
            float f2 = 1.0f - f;
            float L = (1.0f * f) + ((gl.L(46.0f) / gl.L(40.0f)) * f2);
            be0Var.setTranslationY((-(((be0Var.getMeasuredHeight() / 2.0f) + be0Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f2);
            be0Var.setScaleX(L);
            be0Var.setScaleY(L);
            paint.setAlpha((int) (f * 255.0f));
            invalidate();
            h85 h85Var2 = this.w;
            if (h85Var2 != null) {
                h85Var2.invalidate();
            }
        }
    }

    public void setRenderer(h85 h85Var) {
        this.w = h85Var;
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.n.setColor(bkb.w0(null, bkb.jh, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
