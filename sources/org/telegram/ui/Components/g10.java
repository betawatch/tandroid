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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g10 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.voip.m0 {
    public int D;
    public final TextPaint E;
    public final org.telegram.ui.yc F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.n0 I;
    public final org.telegram.ui.Cells.e4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final /* synthetic */ h10 P;
    public final v8 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final k9 d;
    public long e;
    public org.telegram.messenger.s3 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public org.telegram.ui.Components.voip.y w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g10(h10 h10Var, Context context) {
        super(context);
        this.P = h10Var;
        v8 v8Var = new v8((org.telegram.ui.ActionBar.h6) null);
        this.a = v8Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        v8Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        k9 k9Var = new k9(context);
        this.d = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var, c8.ha.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hh, false));
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.yc ycVar = new org.telegram.ui.yc(2, context, this);
        this.F = ycVar;
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(ycVar, c8.ha.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.G != f10) {
            this.G = f10;
            this.r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z9) {
        h10 h10Var = this.P;
        org.telegram.ui.f40 f40Var = h10Var.r;
        if (f40Var.I) {
            return;
        }
        if (z9 && this.w == null) {
            this.w = org.telegram.ui.Components.voip.y.c(h10Var.h, h10Var.n, null, this, null, this.f, h10Var.c, f40Var);
        } else {
            if (z9) {
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
            int y10 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth() - this.D, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, org.telegram.messenger.g0.L(22.0f) + y10, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y10, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.yc ycVar = this.F;
            if (ycVar.getDrawable() != null) {
                ycVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                ycVar.draw(canvas);
                ycVar.getDrawable().setAlpha(org.telegram.messenger.qs.e4);
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
        boolean z9 = this.H;
        if (z9) {
            float f10 = this.G;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f11);
                if (this.G <= 0.0f) {
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
        if (!z9) {
            float f12 = this.G;
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
        if (this.G <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.y yVar = this.w;
        if (yVar != null && !yVar.b && !yVar.r && yVar.w && yVar.a.d.isFirstFrameRendered() && yVar.getAlpha() == 1.0f && !this.P.r.z4) {
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
        k9 k9Var = this.d;
        float x10 = k9Var.getX() + (k9Var.getMeasuredWidth() / 2);
        float y10 = k9Var.getY() + (k9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.e4 e4Var = this.J;
        e4Var.f();
        e4Var.a(canvas, x10, y10, this);
        float f10 = this.s;
        float L = (f10 * 1.0f) + ((1.0f - f10) * (org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)));
        k9Var.setScaleX(e4Var.b() * L);
        k9Var.setScaleY(e4Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(org.telegram.messenger.s3 s3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        h10 h10Var = this.P;
        int i7 = h10Var.d;
        this.f = s3Var;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
        this.e = B1;
        k9 k9Var = this.d;
        v8 v8Var = this.a;
        if (B1 > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).a).a2(Long.valueOf(this.e));
            this.b = a22;
            this.c = null;
            v8Var.r(a22);
            this.y = org.telegram.messenger.t10.j(this.b, true);
            k9Var.getImageReceiver().d = i7;
            k9Var.j(org.telegram.messenger.hc.l(org.telegram.messenger.p10.s0, 1, this.b), "50_50", v8Var, this.b);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).a).M0(Long.valueOf(-this.e));
            this.c = M0;
            this.b = null;
            v8Var.q(M0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                k9Var.getImageReceiver().d = i7;
                k9Var.j(org.telegram.messenger.hc.a(1, this.c), "50_50", v8Var, this.c);
            }
        }
        boolean z9 = j3 == this.e;
        if (s3Var == null) {
            this.H = h10Var.n.d == org.telegram.messenger.ij.B1(groupCallParticipant.peer);
        } else {
            org.telegram.messenger.s3 s3Var2 = h10Var.n.e;
            if (s3Var2 != null) {
                this.H = s3Var2.equals(s3Var);
            } else {
                this.H = false;
            }
        }
        if (!z9) {
            setSelectedProgress(this.H ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z9);
            f(z9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z9) {
        int x02;
        int x03;
        int x04;
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var == null) {
            return;
        }
        n0Var.c(z9);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.I;
        if (n0Var2.k) {
            x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.gh, false);
        } else {
            if (!n0Var2.e) {
                x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bh, false);
                x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dh, false);
                if (!z9) {
                    int i7 = this.L;
                    int i10 = this.M;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.N = ofFloat;
                    ofFloat.addUpdateListener(new bi.wd(this, i7, x02, i10, x03, 1));
                    this.N.addListener(new hi.p2(this, x02, x03, 1));
                    this.N.start();
                    return;
                }
                ValueAnimator valueAnimator = this.N;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.N.cancel();
                }
                this.L = x02;
                this.M = x03;
                this.F.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                this.E.setColor(this.L);
                this.r.setColor(x03);
                this.J.d(i0.a.o(x03, 38));
                invalidate();
                return;
            }
            x04 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.eh, false);
        }
        x02 = x04;
        x03 = x02;
        if (!z9) {
        }
    }

    public k9 getAvatarImageView() {
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

    public org.telegram.messenger.s3 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.y yVar = this.w;
        if (yVar != null) {
            yVar.invalidate();
        } else {
            this.P.n.invalidate();
        }
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h10 h10Var = this.P;
        org.telegram.ui.f40 f40Var = h10Var.r;
        if (h10Var.s && this.f != null) {
            b(true);
        }
        this.K = true;
        if (f40Var.n4.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.n0) org.telegram.ui.Cells.f1.k(1, f40Var.n4);
        } else {
            this.I = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        n0Var.g = this;
        n0Var.c = this.F;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.I;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z9 = this.I.e;
        org.telegram.ui.Cells.e4 e4Var = this.J;
        e4Var.e(this, z9);
        if (this.I.e) {
            return;
        }
        e4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var != null) {
            this.P.r.n4.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.I;
            n0Var2.c = null;
            n0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        float L = org.telegram.messenger.g0.L(12.0f);
        TextPaint textPaint = this.E;
        textPaint.setTextSize(L);
        if (this.y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.y));
            this.D = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.s == f10) {
            return;
        }
        this.s = f10;
        Paint paint = this.n;
        k9 k9Var = this.d;
        if (f10 == 1.0f) {
            k9Var.setTranslationY(0.0f);
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
            paint.setAlpha(org.telegram.messenger.qs.e4);
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
        k9Var.setTranslationY((-(((k9Var.getMeasuredHeight() / 2.0f) + k9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f11);
        k9Var.setScaleX(L);
        k9Var.setScaleY(L);
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
            this.n.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.hh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
