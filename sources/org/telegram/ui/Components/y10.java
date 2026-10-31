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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y10 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.ui.Components.voip.y {
    public int D;
    public final TextPaint E;
    public final org.telegram.ui.hd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.z I;
    public final org.telegram.ui.Cells.g4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final /* synthetic */ z10 P;
    public final r8 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final g9 d;
    public long e;
    public org.telegram.messenger.v3 f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public org.telegram.ui.Components.voip.r w;
    public String x;
    public String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y10(z10 z10Var, Context context) {
        super(context);
        this.P = z10Var;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        this.a = r8Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.g4(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(29.0f));
        r8Var.u((int) (org.telegram.messenger.i0.L(18.0f) / 1.15f));
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        addView(g9Var, w7.b6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.hh, false));
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.eh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(this, context, 2);
        this.F = hdVar;
        hdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(hdVar, w7.b6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.y
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        z10 z10Var = this.P;
        org.telegram.ui.b50 b50Var = z10Var.r;
        if (b50Var.I) {
            return;
        }
        if (z10 && this.w == null) {
            this.w = org.telegram.ui.Components.voip.r.c(z10Var.h, z10Var.n, null, this, null, this.f, z10Var.c, b50Var);
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
            int y3 = org.telegram.messenger.z20.y(24.0f, getMeasuredWidth() - this.D, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.x, org.telegram.messenger.i0.L(22.0f) + y3, org.telegram.messenger.i0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y3, org.telegram.messenger.i0.L(53.0f));
            org.telegram.ui.hd hdVar = this.F;
            if (hdVar.getDrawable() != null) {
                hdVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                hdVar.draw(canvas);
                hdVar.getDrawable().setAlpha(org.telegram.messenger.zs.e4);
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
        boolean z10 = this.H;
        if (z10) {
            float f7 = this.G;
            if (f7 != 1.0f) {
                float f10 = f7 + 0.10666667f;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f10);
                if (this.G <= 0.0f) {
                    float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                    Paint paint = this.r;
                    rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paint);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            float f11 = this.G;
            if (f11 != 0.0f) {
                float f12 = f11 - 0.10666667f;
                if (f12 < 0.0f) {
                    f12 = 0.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f12);
            }
        }
        if (this.G <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.r rVar = this.w;
        if (rVar != null && !rVar.b && !rVar.r && rVar.w && rVar.a.d.isFirstFrameRendered() && rVar.getAlpha() == 1.0f && !this.P.r.w4) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), this.n);
            d(canvas);
        }
        g9 g9Var = this.d;
        float x10 = g9Var.getX() + (g9Var.getMeasuredWidth() / 2);
        float y3 = g9Var.getY() + (g9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.g4 g4Var = this.J;
        g4Var.f();
        g4Var.a(canvas, x10, y3, this);
        float f7 = this.s;
        float L = (f7 * 1.0f) + ((1.0f - f7) * (org.telegram.messenger.i0.L(46.0f) / org.telegram.messenger.i0.L(40.0f)));
        g9Var.setScaleX(g4Var.b() * L);
        g9Var.setScaleY(g4Var.b() * L);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(org.telegram.messenger.v3 v3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        z10 z10Var = this.P;
        int i10 = z10Var.d;
        this.f = v3Var;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
        this.e = C1;
        g9 g9Var = this.d;
        r8 r8Var = this.a;
        if (C1 > 0) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).a).Z1(Long.valueOf(this.e));
            this.b = Z1;
            this.c = null;
            r8Var.r(Z1);
            this.y = org.telegram.messenger.h20.j(this.b, true);
            g9Var.getImageReceiver().d = i10;
            g9Var.j(org.telegram.messenger.ic.l(org.telegram.messenger.d20.s0, 1, this.b), "50_50", r8Var, this.b);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).a).L0(Long.valueOf(-this.e));
            this.c = L0;
            this.b = null;
            r8Var.q(L0);
            TLRPC.Chat chat = this.c;
            if (chat != null) {
                this.y = chat.title;
                g9Var.getImageReceiver().d = i10;
                g9Var.j(org.telegram.messenger.ic.a(1, this.c), "50_50", r8Var, this.c);
            }
        }
        boolean z10 = j10 == this.e;
        if (v3Var == null) {
            this.H = z10Var.n.d == org.telegram.messenger.jj.C1(groupCallParticipant.peer);
        } else {
            org.telegram.messenger.v3 v3Var2 = z10Var.n.e;
            if (v3Var2 != null) {
                this.H = v3Var2.equals(v3Var);
            } else {
                this.H = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.H ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar != null) {
            zVar.h = groupCallParticipant;
            zVar.c(z10);
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
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar == null) {
            return;
        }
        zVar.c(z10);
        org.telegram.ui.Components.voip.z zVar2 = this.I;
        int i10 = 0;
        if (zVar2.k) {
            x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.gh, false);
        } else {
            if (!zVar2.e) {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bh, false);
                x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false);
                if (!z10) {
                    int i11 = this.L;
                    int i12 = this.M;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.N = ofFloat;
                    ofFloat.addUpdateListener(new w10(this, i11, x02, i12, x03, 0));
                    this.N.addListener(new x10(this, x02, x03, i10));
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
                this.J.d(i0.b.o(x03, 38));
                invalidate();
                return;
            }
            x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.eh, false);
        }
        x02 = x04;
        x03 = x02;
        if (!z10) {
        }
    }

    public g9 getAvatarImageView() {
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

    public org.telegram.messenger.v3 getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.r rVar = this.w;
        if (rVar != null) {
            rVar.invalidate();
        } else {
            this.P.n.invalidate();
        }
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z10 z10Var = this.P;
        org.telegram.ui.b50 b50Var = z10Var.r;
        if (z10Var.s && this.f != null) {
            b(true);
        }
        this.K = true;
        if (b50Var.k4.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.z) i0.a.v(1, b50Var.k4);
        } else {
            this.I = new org.telegram.ui.Components.voip.z();
        }
        org.telegram.ui.Components.voip.z zVar = this.I;
        zVar.g = this;
        zVar.c = this.F;
        zVar.c(false);
        org.telegram.ui.Components.voip.z zVar2 = this.I;
        zVar2.h = this.h;
        zVar2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.g4 g4Var = this.J;
        g4Var.e(this, z10);
        if (this.I.e) {
            return;
        }
        g4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar != null) {
            this.P.r.k4.add(zVar);
            org.telegram.ui.Components.voip.z zVar2 = this.I;
            zVar2.c = null;
            zVar2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float L = org.telegram.messenger.i0.L(12.0f);
        TextPaint textPaint = this.E;
        textPaint.setTextSize(L);
        if (this.y != null) {
            int min = (int) Math.min(org.telegram.messenger.i0.L(46.0f), textPaint.measureText(this.y));
            this.D = min;
            this.x = TextUtils.ellipsize(this.y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar != null) {
            zVar.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f7) {
        if (this.s == f7) {
            return;
        }
        this.s = f7;
        Paint paint = this.n;
        g9 g9Var = this.d;
        if (f7 == 1.0f) {
            g9Var.setTranslationY(0.0f);
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
            paint.setAlpha(org.telegram.messenger.zs.e4);
            invalidate();
            org.telegram.ui.Components.voip.r rVar = this.w;
            if (rVar != null) {
                rVar.invalidate();
                return;
            }
            return;
        }
        float f10 = 1.0f - f7;
        float L = (1.0f * f7) + ((org.telegram.messenger.i0.L(46.0f) / org.telegram.messenger.i0.L(40.0f)) * f10);
        g9Var.setTranslationY((-(((g9Var.getMeasuredHeight() / 2.0f) + g9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f10);
        g9Var.setScaleX(L);
        g9Var.setScaleY(L);
        paint.setAlpha((int) (f7 * 255.0f));
        invalidate();
        org.telegram.ui.Components.voip.r rVar2 = this.w;
        if (rVar2 != null) {
            rVar2.invalidate();
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.r rVar) {
        this.w = rVar;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.n.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.hh, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
