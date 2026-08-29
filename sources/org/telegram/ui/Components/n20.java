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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n20 extends FrameLayout implements org.telegram.ui.Components.voip.n0 {
    public final TextPaint A;
    public final org.telegram.ui.ed B;
    public float C;
    public boolean D;
    public org.telegram.ui.Components.voip.o0 E;
    public final org.telegram.ui.Cells.a4 F;
    public boolean G;
    public int H;
    public int I;
    public ValueAnimator J;
    public boolean K;
    public final /* synthetic */ o20 L;
    public final e9 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final t9 d;
    public long e;
    public ChatObject.VideoParticipant f;
    public TLRPC.GroupCallParticipant h;
    public final Paint n;
    public final Paint r;
    public float s;
    public org.telegram.ui.Components.voip.u v;
    public String w;
    public String x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(o20 o20Var, Context context) {
        super(context);
        this.L = o20Var;
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        this.a = e9Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.F = new org.telegram.ui.Cells.a4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        e9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        t9 t9Var = new t9(context);
        this.d = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(t9Var, i7.f6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.ed edVar = new org.telegram.ui.ed(this, context, 1);
        this.B = edVar;
        edVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(edVar, i7.f6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f9) {
        if (this.C != f9) {
            this.C = f9;
            this.r.setAlpha((int) (f9 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.n0
    public final void a() {
        this.F.e(this, this.E.e);
        f(true);
    }

    public final void b(boolean z10) {
        o20 o20Var = this.L;
        if (o20Var.r.isDismissed()) {
            return;
        }
        if (z10 && this.v == null) {
            this.v = org.telegram.ui.Components.voip.u.c(o20Var.h, o20Var.n, null, this, null, this.f, o20Var.c, o20Var.r);
        } else {
            if (z10) {
                return;
            }
            org.telegram.ui.Components.voip.u uVar = this.v;
            if (uVar != null) {
                uVar.setSecondaryView(null);
            }
            this.v = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.w != null) {
            canvas.save();
            int x4 = org.telegram.ui.b.x(24.0f, getMeasuredWidth() - this.y, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.A;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.w, AndroidUtilities.dp(22.0f) + x4, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(x4, AndroidUtilities.dp(53.0f));
            org.telegram.ui.ed edVar = this.B;
            if (edVar.getDrawable() != null) {
                edVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                edVar.draw(canvas);
                edVar.getDrawable().setAlpha(255);
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
        boolean z10 = this.D;
        if (z10) {
            float f9 = this.C;
            if (f9 != 1.0f) {
                float f10 = f9 + 0.10666667f;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f10);
                if (this.C <= 0.0f) {
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
            float f11 = this.C;
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
        if (this.C <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.b && !uVar.r && uVar.v && uVar.a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.L.r.B2) {
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
        t9 t9Var = this.d;
        float x4 = t9Var.getX() + (t9Var.getMeasuredWidth() / 2);
        float y8 = t9Var.getY() + (t9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.a4 a4Var = this.F;
        a4Var.f();
        a4Var.a(canvas, x4, y8, this);
        float f9 = this.s;
        float dp = (f9 * 1.0f) + ((1.0f - f9) * (AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)));
        t9Var.setScaleX(a4Var.b() * dp);
        t9Var.setScaleY(a4Var.b() * dp);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.B) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        o20 o20Var = this.L;
        int i10 = o20Var.d;
        this.f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        t9 t9Var = this.d;
        e9 e9Var = this.a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.b = user;
            this.c = null;
            e9Var.m(i10, user);
            this.x = UserObject.getFirstName(this.b);
            t9Var.getImageReceiver().setCurrentAccount(i10);
            t9Var.h(ImageLocation.getForUser(this.b, 1), "50_50", e9Var, this.b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.c = chat;
            this.b = null;
            e9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.c;
            if (chat2 != null) {
                this.x = chat2.title;
                t9Var.getImageReceiver().setCurrentAccount(i10);
                t9Var.h(ImageLocation.getForChat(this.c, 1), "50_50", e9Var, this.c);
            }
        }
        boolean z10 = j10 == this.e;
        if (videoParticipant == null) {
            this.D = o20Var.n.d == MessageObject.getPeerId(groupCallParticipant.peer);
        } else {
            ChatObject.VideoParticipant videoParticipant2 = o20Var.n.e;
            if (videoParticipant2 != null) {
                this.D = videoParticipant2.equals(videoParticipant);
            } else {
                this.D = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.D ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var != null) {
            o0Var.h = groupCallParticipant;
            o0Var.c(z10);
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
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var == null) {
            return;
        }
        o0Var.c(z10);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.E;
        int i10 = 0;
        if (o0Var2.k) {
            w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.sg, false);
        } else {
            if (!o0Var2.e) {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ng, false);
                w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.pg, false);
                if (!z10) {
                    int i11 = this.H;
                    int i12 = this.I;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.addUpdateListener(new jh.xa(this, i11, w02, i12, w03, 1));
                    this.J.addListener(new m20(this, w02, w03, i10));
                    this.J.start();
                    return;
                }
                ValueAnimator valueAnimator = this.J;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.J.cancel();
                }
                this.H = w02;
                this.I = w03;
                this.B.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                this.A.setColor(this.H);
                this.r.setColor(w03);
                this.F.d(i0.a.k(w03, 38));
                invalidate();
                return;
            }
            w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.qg, false);
        }
        w02 = w04;
        w03 = w02;
        if (!z10) {
        }
    }

    public t9 getAvatarImageView() {
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

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.K) {
            return;
        }
        this.K = true;
        super.invalidate();
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null) {
            uVar.invalidate();
        } else {
            this.L.n.invalidate();
        }
        this.K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o20 o20Var = this.L;
        org.telegram.ui.r50 r50Var = o20Var.r;
        if (o20Var.s && this.f != null) {
            b(true);
        }
        this.G = true;
        if (r50Var.p2.size() > 0) {
            this.E = (org.telegram.ui.Components.voip.o0) com.google.android.recaptcha.internal.a.j(1, r50Var.p2);
        } else {
            this.E = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        o0Var.g = this;
        o0Var.c = this.B;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.E;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.E.e;
        org.telegram.ui.Cells.a4 a4Var = this.F;
        a4Var.e(this, z10);
        if (this.E.e) {
            return;
        }
        a4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.G = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var != null) {
            this.L.r.p2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.E;
            o0Var2.c = null;
            o0Var2.c(false);
            this.E.b();
        }
        this.E = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.A;
        textPaint.setTextSize(dp);
        if (this.x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.x));
            this.y = min;
            this.w = TextUtils.ellipsize(this.x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        super.setAlpha(f9);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var != null) {
            o0Var.a(d);
        }
        this.F.c(d);
    }

    public void setProgressToFullscreen(float f9) {
        if (this.s == f9) {
            return;
        }
        this.s = f9;
        Paint paint = this.n;
        t9 t9Var = this.d;
        if (f9 == 1.0f) {
            t9Var.setTranslationY(0.0f);
            t9Var.setScaleX(1.0f);
            t9Var.setScaleY(1.0f);
            paint.setAlpha(255);
            invalidate();
            org.telegram.ui.Components.voip.u uVar = this.v;
            if (uVar != null) {
                uVar.invalidate();
                return;
            }
            return;
        }
        float f10 = 1.0f - f9;
        float dp = (1.0f * f9) + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
        t9Var.setTranslationY((-(((t9Var.getMeasuredHeight() / 2.0f) + t9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f10);
        t9Var.setScaleX(dp);
        t9Var.setScaleY(dp);
        paint.setAlpha((int) (f9 * 255.0f));
        invalidate();
        org.telegram.ui.Components.voip.u uVar2 = this.v;
        if (uVar2 != null) {
            uVar2.invalidate();
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.u uVar) {
        this.v = uVar;
    }
}
