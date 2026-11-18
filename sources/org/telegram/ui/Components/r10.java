package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r10 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.voip.m0 {
    public int E;
    public final TextPaint F;
    public final org.telegram.ui.xc G;
    public float H;
    public boolean I;
    public org.telegram.ui.Components.voip.n0 J;
    public final org.telegram.ui.Cells.e4 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ s10 Q;
    public final b9 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final q9 d;
    public long e;
    public org.telegram.messenger.u3 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public org.telegram.ui.Components.voip.y w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r10(s10 s10Var, Context context) {
        super(context);
        this.Q = s10Var;
        b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
        this.a = b9Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        b9Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        q9 q9Var = new q9(context);
        this.d = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var, c8.ma.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.kh, false));
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(2, context, this);
        this.G = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(xcVar, c8.ma.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.H != f10) {
            this.H = f10;
            this.r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void a() {
        this.K.e(this, this.J.e);
        f(true);
    }

    public final void b(boolean z10) {
        s10 s10Var = this.Q;
        org.telegram.ui.f40 f40Var = s10Var.r;
        if (f40Var.J) {
            return;
        }
        if (z10 && this.w == null) {
            this.w = org.telegram.ui.Components.voip.y.c(s10Var.h, s10Var.n, null, this, null, this.f, s10Var.c, f40Var);
        } else {
            if (z10) {
                return;
            }
            org.telegram.ui.Components.voip.y yVar = this.w;
            if (yVar != null) {
                yVar.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int z10 = org.telegram.messenger.n10.z(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, org.telegram.messenger.g0.L(22.0f) + z10, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(z10, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.xc xcVar = this.G;
            if (xcVar.getDrawable() != null) {
                xcVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                xcVar.draw(canvas);
                xcVar.getDrawable().setAlpha(org.telegram.messenger.ks.e4);
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
        boolean z10 = this.I;
        if (z10) {
            float f10 = this.H;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f11);
                if (this.H <= 0.0f) {
                    float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                    Paint paint = this.r;
                    rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), paint);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f12 = this.H;
            if (f12 != 0.0f) {
                float f13 = f12 - 0.10666667f;
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f13);
            }
        }
        if (this.H <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.y yVar = this.w;
        if (yVar != null && !yVar.b && !yVar.r && yVar.w && yVar.a.d.isFirstFrameRendered() && yVar.getAlpha() == 1.0f && !this.Q.r.E4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.n);
            d(canvas);
        }
        q9 q9Var = this.d;
        float x10 = q9Var.getX() + (q9Var.getMeasuredWidth() / 2);
        float y10 = q9Var.getY() + (q9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.f();
        e4Var.a(canvas, x10, y10, this);
        float f10 = this.s;
        float L = (f10 * 1.0f) + ((1.0f - f10) * (org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)));
        q9Var.setScaleX(e4Var.b() * L);
        q9Var.setScaleY(e4Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(org.telegram.messenger.u3 u3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        s10 s10Var = this.Q;
        int i7 = s10Var.d;
        this.f = u3Var;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long B1 = org.telegram.messenger.fj.B1(groupCallParticipant.peer);
        this.e = B1;
        q9 q9Var = this.d;
        b9 b9Var = this.a;
        if (B1 > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).a).c2(Long.valueOf(this.e));
            this.b = c22;
            this.c = null;
            b9Var.r(c22);
            this.y = org.telegram.messenger.o10.k(this.b, true);
            q9Var.getImageReceiver().d = i7;
            q9Var.j(org.telegram.messenger.fc.l(org.telegram.messenger.j10.t0, 1, this.b), "50_50", b9Var, this.b);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).a).O0(Long.valueOf(-this.e));
            this.c = O0;
            this.b = null;
            b9Var.q(O0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                q9Var.getImageReceiver().d = i7;
                q9Var.j(org.telegram.messenger.fc.a(1, this.c), "50_50", b9Var, this.c);
            }
        }
        boolean z10 = j3 == this.e;
        if (u3Var == null) {
            this.I = s10Var.n.d == org.telegram.messenger.fj.B1(groupCallParticipant.peer);
        } else {
            org.telegram.messenger.u3 u3Var2 = s10Var.n.e;
            if (u3Var2 != null) {
                this.I = u3Var2.equals(u3Var);
            } else {
                this.I = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.I ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z10);
            f(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10) {
        int x02;
        int x03;
        int x04;
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var == null) {
            return;
        }
        n0Var.c(z10);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.J;
        if (n0Var2.k) {
            x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.jh, false);
        } else {
            if (!n0Var2.e) {
                x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.eh, false);
                x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.gh, false);
                if (!z10) {
                    int i7 = this.M;
                    int i10 = this.N;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O = ofFloat;
                    ofFloat.addUpdateListener(new di.gc(this, i7, x02, i10, x03, 1));
                    this.O.addListener(new ki.i2(this, x02, x03, 1));
                    this.O.start();
                    return;
                }
                ValueAnimator valueAnimator = this.O;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.O.cancel();
                }
                this.M = x02;
                this.N = x03;
                this.G.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                this.F.setColor(this.M);
                this.r.setColor(x03);
                this.K.d(i0.a.o(x03, 38));
                invalidate();
                return;
            }
            x04 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.hh, false);
        }
        x02 = x04;
        x03 = x02;
        if (!z10) {
        }
    }

    public q9 getAvatarImageView() {
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

    public org.telegram.ui.Components.voip.y getRenderer() {
        return this.w;
    }

    public org.telegram.messenger.u3 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        org.telegram.ui.Components.voip.y yVar = this.w;
        if (yVar != null) {
            yVar.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s10 s10Var = this.Q;
        org.telegram.ui.f40 f40Var = s10Var.r;
        if (s10Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (f40Var.s4.size() > 0) {
            this.J = (org.telegram.ui.Components.voip.n0) p5.c.g(1, f40Var.s4);
        } else {
            this.J = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        n0Var.g = this;
        n0Var.c = this.G;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.J;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z10 = this.J.e;
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.e(this, z10);
        if (this.J.e) {
            return;
        }
        e4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var != null) {
            this.Q.r.s4.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.J;
            n0Var2.c = null;
            n0Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float L = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.F;
        textPaint.setTextSize(L);
        if (this.y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.y));
            this.E = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.s == f10) {
            return;
        }
        this.s = f10;
        Paint paint = this.n;
        q9 q9Var = this.d;
        if (f10 == 1.0f) {
            q9Var.setTranslationY(0.0f);
            q9Var.setScaleX(1.0f);
            q9Var.setScaleY(1.0f);
            paint.setAlpha(org.telegram.messenger.ks.e4);
            invalidate();
            org.telegram.ui.Components.voip.y yVar = this.w;
            if (yVar != null) {
                yVar.invalidate();
                return;
            }
            return;
        }
        float f11 = 1.0f - f10;
        float L = (1.0f * f10) + ((org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)) * f11);
        q9Var.setTranslationY((-(((q9Var.getMeasuredHeight() / 2.0f) + q9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f11);
        q9Var.setScaleX(L);
        q9Var.setScaleY(L);
        paint.setAlpha((int) (f10 * 255.0f));
        invalidate();
        org.telegram.ui.Components.voip.y yVar2 = this.w;
        if (yVar2 != null) {
            yVar2.invalidate();
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.y yVar) {
        this.w = yVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.kh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
