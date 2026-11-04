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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d10 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.ui.Components.voip.z {
    public int E;
    public final TextPaint F;
    public final org.telegram.ui.xc G;
    public float H;
    public boolean I;
    public org.telegram.ui.Components.voip.a0 J;
    public final org.telegram.ui.Cells.e4 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final /* synthetic */ e10 Q;
    public final u8 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final k9 d;
    public long e;
    public org.telegram.messenger.s3 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public org.telegram.ui.Components.voip.r w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(e10 e10Var, Context context) {
        super(context);
        this.Q = e10Var;
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        this.a = u8Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        u8Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        k9 k9Var = new k9(context);
        this.d = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var, b8.mf.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hh, false));
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(2, context, this);
        this.G = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(xcVar, b8.mf.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.H != f10) {
            this.H = f10;
            this.r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.z
    public final void a() {
        this.K.e(this, this.J.e);
        f(true);
    }

    public final void b(boolean z10) {
        e10 e10Var = this.Q;
        org.telegram.ui.x30 x30Var = e10Var.r;
        if (x30Var.J) {
            return;
        }
        if (z10 && this.w == null) {
            this.w = org.telegram.ui.Components.voip.r.c(e10Var.h, e10Var.n, null, this, null, this.f, e10Var.c, x30Var);
        } else {
            if (z10) {
                return;
            }
            org.telegram.ui.Components.voip.r rVar = this.w;
            if (rVar != null) {
                rVar.setSecondaryView(null);
            }
            this.w = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.x != null) {
            canvas.save();
            int y9 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, org.telegram.messenger.g0.L(22.0f) + y9, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y9, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.xc xcVar = this.G;
            if (xcVar.getDrawable() != null) {
                xcVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                xcVar.draw(canvas);
                xcVar.getDrawable().setAlpha(org.telegram.messenger.hs.e4);
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
        org.telegram.ui.Components.voip.r rVar = this.w;
        if (rVar != null && !rVar.b && !rVar.r && rVar.w && rVar.a.d.isFirstFrameRendered() && rVar.getAlpha() == 1.0f && !this.Q.r.x4) {
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
        float y9 = k9Var.getY() + (k9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.f();
        e4Var.a(canvas, x10, y9, this);
        float f10 = this.s;
        float L = (f10 * 1.0f) + ((1.0f - f10) * (org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)));
        k9Var.setScaleX(e4Var.b() * L);
        k9Var.setScaleY(e4Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(org.telegram.messenger.s3 s3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        e10 e10Var = this.Q;
        int i3 = e10Var.d;
        this.f = s3Var;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long C1 = org.telegram.messenger.zi.C1(groupCallParticipant.peer);
        this.e = C1;
        k9 k9Var = this.d;
        u8 u8Var = this.a;
        if (C1 > 0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).a).a2(Long.valueOf(this.e));
            this.b = a22;
            this.c = null;
            u8Var.r(a22);
            this.y = org.telegram.messenger.l10.j(this.b, true);
            k9Var.getImageReceiver().d = i3;
            k9Var.j(org.telegram.messenger.ac.l(org.telegram.messenger.h10.t0, 1, this.b), "50_50", u8Var, this.b);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).a).M0(Long.valueOf(-this.e));
            this.c = M0;
            this.b = null;
            u8Var.q(M0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                k9Var.getImageReceiver().d = i3;
                k9Var.j(org.telegram.messenger.ac.a(1, this.c), "50_50", u8Var, this.c);
            }
        }
        boolean z10 = j10 == this.e;
        if (s3Var == null) {
            this.I = e10Var.n.d == org.telegram.messenger.zi.C1(groupCallParticipant.peer);
        } else {
            org.telegram.messenger.s3 s3Var2 = e10Var.n.e;
            if (s3Var2 != null) {
                this.I = s3Var2.equals(s3Var);
            } else {
                this.I = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.I ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var != null) {
            a0Var.h = groupCallParticipant;
            a0Var.c(z10);
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
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var == null) {
            return;
        }
        a0Var.c(z10);
        org.telegram.ui.Components.voip.a0 a0Var2 = this.J;
        if (a0Var2.k) {
            x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.gh, false);
        } else {
            if (!a0Var2.e) {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bh, false);
                x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false);
                if (!z10) {
                    int i3 = this.M;
                    int i10 = this.N;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O = ofFloat;
                    ofFloat.addUpdateListener(new ci.nc(this, i3, x02, i10, x03, 1));
                    this.O.addListener(new ii.p2(this, x02, x03, 1));
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
            x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eh, false);
        }
        x02 = x04;
        x03 = x02;
        if (!z10) {
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

    public org.telegram.ui.Components.voip.r getRenderer() {
        return this.w;
    }

    public org.telegram.messenger.s3 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        org.telegram.ui.Components.voip.r rVar = this.w;
        if (rVar != null) {
            rVar.invalidate();
        } else {
            this.Q.n.invalidate();
        }
        this.P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e10 e10Var = this.Q;
        org.telegram.ui.x30 x30Var = e10Var.r;
        if (e10Var.s && this.f != null) {
            b(true);
        }
        this.L = true;
        if (x30Var.l4.size() > 0) {
            this.J = (org.telegram.ui.Components.voip.a0) org.telegram.ui.Cells.f1.o(1, x30Var.l4);
        } else {
            this.J = new org.telegram.ui.Components.voip.a0();
        }
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        a0Var.g = this;
        a0Var.c = this.G;
        a0Var.c(false);
        org.telegram.ui.Components.voip.a0 a0Var2 = this.J;
        a0Var2.h = this.h;
        a0Var2.c(false);
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
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var != null) {
            this.Q.r.l4.add(a0Var);
            org.telegram.ui.Components.voip.a0 a0Var2 = this.J;
            a0Var2.c = null;
            a0Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
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
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var != null) {
            a0Var.a(d);
        }
        this.K.c(d);
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
            paint.setAlpha(org.telegram.messenger.hs.e4);
            invalidate();
            org.telegram.ui.Components.voip.r rVar = this.w;
            if (rVar != null) {
                rVar.invalidate();
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
        org.telegram.ui.Components.voip.r rVar2 = this.w;
        if (rVar2 != null) {
            rVar2.invalidate();
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.r rVar) {
        this.w = rVar;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
