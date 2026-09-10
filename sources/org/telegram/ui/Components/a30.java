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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a30 extends FrameLayout implements org.telegram.ui.Components.voip.o0 {
    public final TextPaint E;
    public final org.telegram.ui.kd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.p0 I;
    public final org.telegram.ui.Cells.b4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final /* synthetic */ b30 P;
    public final g9 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final w9 d;
    public long e;
    public ChatObject.VideoParticipant f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public org.telegram.ui.Components.voip.t v;
    public String w;
    public String x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(b30 b30Var, Context context) {
        super(context);
        this.P = b30Var;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.a = g9Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.b4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        g9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.a6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.kd kdVar = new org.telegram.ui.kd(this, context, 1);
        this.F = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(kdVar, w7.a6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.o0
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        b30 b30Var = this.P;
        if (b30Var.r.isDismissed()) {
            return;
        }
        if (z10 && this.v == null) {
            this.v = org.telegram.ui.Components.voip.t.c(b30Var.h, b30Var.n, null, this, null, this.f, b30Var.c, b30Var.r);
        } else {
            if (z10) {
                return;
            }
            org.telegram.ui.Components.voip.t tVar = this.v;
            if (tVar != null) {
                tVar.setSecondaryView(null);
            }
            this.v = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.w != null) {
            canvas.save();
            int y3 = org.telegram.messenger.em.y(24.0f, getMeasuredWidth() - this.y, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.w, AndroidUtilities.dp(22.0f) + y3, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y3, AndroidUtilities.dp(53.0f));
            org.telegram.ui.kd kdVar = this.F;
            if (kdVar.getDrawable() != null) {
                kdVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                kdVar.draw(canvas);
                kdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
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
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
                    Paint paint = this.r;
                    rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
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
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.b && !tVar.r && tVar.v && tVar.a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.P.r.F2) {
            d(canvas);
            return;
        }
        if (this.s > 0.0f) {
            float measuredWidth = (1.0f - this.s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.n);
            d(canvas);
        }
        w9 w9Var = this.d;
        float x10 = w9Var.getX() + (w9Var.getMeasuredWidth() / 2);
        float y3 = w9Var.getY() + (w9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.f();
        b4Var.a(canvas, x10, y3, this);
        float f7 = this.s;
        float dp = (f7 * 1.0f) + ((1.0f - f7) * (AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)));
        w9Var.setScaleX(b4Var.b() * dp);
        w9Var.setScaleY(b4Var.b() * dp);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        b30 b30Var = this.P;
        int i10 = b30Var.d;
        this.f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        w9 w9Var = this.d;
        g9 g9Var = this.a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.b = user;
            this.c = null;
            g9Var.m(i10, user);
            this.x = UserObject.getFirstName(this.b);
            w9Var.getImageReceiver().setCurrentAccount(i10);
            w9Var.h(ImageLocation.getForUser(this.b, 1), "50_50", g9Var, this.b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.c = chat;
            this.b = null;
            g9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.c;
            if (chat2 != null) {
                this.x = chat2.title;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.h(ImageLocation.getForChat(this.c, 1), "50_50", g9Var, this.c);
            }
        }
        boolean z10 = j3 == this.e;
        if (videoParticipant == null) {
            this.H = b30Var.n.d == MessageObject.getPeerId(groupCallParticipant.peer);
        } else {
            ChatObject.VideoParticipant videoParticipant2 = b30Var.n.e;
            if (videoParticipant2 != null) {
                this.H = videoParticipant2.equals(videoParticipant);
            } else {
                this.H = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.H ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            p0Var.h = groupCallParticipant;
            p0Var.c(z10);
            f(z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z10) {
        int w02;
        int w03;
        int w04;
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var == null) {
            return;
        }
        p0Var.c(z10);
        org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
        if (p0Var2.k) {
            w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.sg, false);
        } else {
            if (!p0Var2.e) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false);
                w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
                if (!z10) {
                    int i10 = this.L;
                    int i11 = this.M;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.N = ofFloat;
                    ofFloat.addUpdateListener(new z20(this, i10, w02, i11, w03, 0));
                    this.N.addListener(new di.b3(this, w02, w03, 1));
                    this.N.start();
                    return;
                }
                ValueAnimator valueAnimator = this.N;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.N.cancel();
                }
                this.L = w02;
                this.M = w03;
                this.F.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                this.E.setColor(this.L);
                this.r.setColor(w03);
                this.J.d(i0.a.k(w03, 38));
                invalidate();
                return;
            }
            w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false);
        }
        w02 = w04;
        w03 = w02;
        if (!z10) {
        }
    }

    public w9 getAvatarImageView() {
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

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null) {
            tVar.invalidate();
        } else {
            this.P.n.invalidate();
        }
        this.O = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b30 b30Var = this.P;
        org.telegram.ui.j60 j60Var = b30Var.r;
        if (b30Var.s && this.f != null) {
            b(true);
        }
        this.K = true;
        if (j60Var.t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.p0) hc.b.z(1, j60Var.t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.p0();
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        p0Var.g = this;
        p0Var.c = this.F;
        p0Var.c(false);
        org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
        p0Var2.h = this.h;
        p0Var2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.e(this, z10);
        if (this.I.e) {
            return;
        }
        b4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            this.P.r.t2.add(p0Var);
            org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
            p0Var2.c = null;
            p0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.E;
        textPaint.setTextSize(dp);
        if (this.x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.x));
            this.y = min;
            this.w = TextUtils.ellipsize(this.x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            p0Var.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f7) {
        if (this.s == f7) {
            return;
        }
        this.s = f7;
        Paint paint = this.n;
        w9 w9Var = this.d;
        if (f7 == 1.0f) {
            w9Var.setTranslationY(0.0f);
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
            paint.setAlpha(255);
            invalidate();
            org.telegram.ui.Components.voip.t tVar = this.v;
            if (tVar != null) {
                tVar.invalidate();
                return;
            }
            return;
        }
        float f10 = 1.0f - f7;
        float dp = (1.0f * f7) + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
        w9Var.setTranslationY((-(((w9Var.getMeasuredHeight() / 2.0f) + w9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f10);
        w9Var.setScaleX(dp);
        w9Var.setScaleY(dp);
        paint.setAlpha((int) (f7 * 255.0f));
        invalidate();
        org.telegram.ui.Components.voip.t tVar2 = this.v;
        if (tVar2 != null) {
            tVar2.invalidate();
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.t tVar) {
        this.v = tVar;
    }
}
