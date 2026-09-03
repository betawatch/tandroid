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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t20 extends FrameLayout implements org.telegram.ui.Components.voip.m0 {
    public final TextPaint B;
    public final org.telegram.ui.md C;
    public float D;
    public boolean E;
    public org.telegram.ui.Components.voip.n0 F;
    public final org.telegram.ui.Cells.b4 G;
    public boolean H;
    public int I;
    public int J;
    public ValueAnimator K;
    public boolean L;
    public final /* synthetic */ u20 M;
    public final z8 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final p9 d;
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
    public t20(u20 u20Var, Context context) {
        super(context);
        this.M = u20Var;
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        this.a = z8Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.G = new org.telegram.ui.Cells.b4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        z8Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var, k7.b6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.md mdVar = new org.telegram.ui.md(this, context, 1);
        this.C = mdVar;
        mdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(mdVar, k7.b6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.D != f10) {
            this.D = f10;
            this.r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void a() {
        this.G.e(this, this.F.e);
        f(true);
    }

    public final void b(boolean z4) {
        u20 u20Var = this.M;
        if (u20Var.r.isDismissed()) {
            return;
        }
        if (z4 && this.v == null) {
            this.v = org.telegram.ui.Components.voip.t.c(u20Var.h, u20Var.n, null, this, null, this.f, u20Var.c, u20Var.r);
        } else {
            if (z4) {
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
            int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth() - this.y, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.B;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.w, AndroidUtilities.dp(22.0f) + x10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(x10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.md mdVar = this.C;
            if (mdVar.getDrawable() != null) {
                mdVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                mdVar.draw(canvas);
                mdVar.getDrawable().setAlpha(255);
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
        boolean z4 = this.E;
        if (z4) {
            float f10 = this.D;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f11);
                if (this.D <= 0.0f) {
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
        if (!z4) {
            float f12 = this.D;
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
        if (this.D <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.b && !tVar.r && tVar.v && tVar.a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.M.r.C2) {
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
        p9 p9Var = this.d;
        float x10 = p9Var.getX() + (p9Var.getMeasuredWidth() / 2);
        float y10 = p9Var.getY() + (p9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.b4 b4Var = this.G;
        b4Var.f();
        b4Var.a(canvas, x10, y10, this);
        float f10 = this.s;
        float dp = (f10 * 1.0f) + ((1.0f - f10) * (AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)));
        p9Var.setScaleX(b4Var.b() * dp);
        p9Var.setScaleY(b4Var.b() * dp);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.C) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        u20 u20Var = this.M;
        int i10 = u20Var.d;
        this.f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        p9 p9Var = this.d;
        z8 z8Var = this.a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.b = user;
            this.c = null;
            z8Var.m(i10, user);
            this.x = UserObject.getFirstName(this.b);
            p9Var.getImageReceiver().setCurrentAccount(i10);
            p9Var.h(ImageLocation.getForUser(this.b, 1), "50_50", z8Var, this.b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.c = chat;
            this.b = null;
            z8Var.k(i10, chat);
            TLRPC.Chat chat2 = this.c;
            if (chat2 != null) {
                this.x = chat2.title;
                p9Var.getImageReceiver().setCurrentAccount(i10);
                p9Var.h(ImageLocation.getForChat(this.c, 1), "50_50", z8Var, this.c);
            }
        }
        boolean z4 = j10 == this.e;
        if (videoParticipant == null) {
            this.E = u20Var.n.d == MessageObject.getPeerId(groupCallParticipant.peer);
        } else {
            ChatObject.VideoParticipant videoParticipant2 = u20Var.n.e;
            if (videoParticipant2 != null) {
                this.E = videoParticipant2.equals(videoParticipant);
            } else {
                this.E = false;
            }
        }
        if (!z4) {
            setSelectedProgress(this.E ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z4);
            f(z4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z4) {
        int w02;
        int w03;
        int w04;
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var == null) {
            return;
        }
        n0Var.c(z4);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.F;
        int i10 = 0;
        if (n0Var2.k) {
            w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.sg, false);
        } else {
            if (!n0Var2.e) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ng, false);
                w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pg, false);
                if (!z4) {
                    int i11 = this.I;
                    int i12 = this.J;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.K = ofFloat;
                    ofFloat.addUpdateListener(new lh.ya(this, i11, w02, i12, w03, 1));
                    this.K.addListener(new s20(this, w02, w03, i10));
                    this.K.start();
                    return;
                }
                ValueAnimator valueAnimator = this.K;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.K.cancel();
                }
                this.I = w02;
                this.J = w03;
                this.C.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                this.B.setColor(this.I);
                this.r.setColor(w03);
                this.G.d(i0.a.k(w03, 38));
                invalidate();
                return;
            }
            w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.qg, false);
        }
        w02 = w04;
        w03 = w02;
        if (!z4) {
        }
    }

    public p9 getAvatarImageView() {
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
        if (this.L) {
            return;
        }
        this.L = true;
        super.invalidate();
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null) {
            tVar.invalidate();
        } else {
            this.M.n.invalidate();
        }
        this.L = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u20 u20Var = this.M;
        org.telegram.ui.e60 e60Var = u20Var.r;
        if (u20Var.s && this.f != null) {
            b(true);
        }
        this.H = true;
        if (e60Var.q2.size() > 0) {
            this.F = (org.telegram.ui.Components.voip.n0) e2.c.g(1, e60Var.q2);
        } else {
            this.F = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        n0Var.g = this;
        n0Var.c = this.C;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.F;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z4 = this.F.e;
        org.telegram.ui.Cells.b4 b4Var = this.G;
        b4Var.e(this, z4);
        if (this.F.e) {
            return;
        }
        b4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.H = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var != null) {
            this.M.r.q2.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.F;
            n0Var2.c = null;
            n0Var2.c(false);
            this.F.b();
        }
        this.F = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.B;
        textPaint.setTextSize(dp);
        if (this.x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.x));
            this.y = min;
            this.w = TextUtils.ellipsize(this.x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.G.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.s == f10) {
            return;
        }
        this.s = f10;
        Paint paint = this.n;
        p9 p9Var = this.d;
        if (f10 == 1.0f) {
            p9Var.setTranslationY(0.0f);
            p9Var.setScaleX(1.0f);
            p9Var.setScaleY(1.0f);
            paint.setAlpha(255);
            invalidate();
            org.telegram.ui.Components.voip.t tVar = this.v;
            if (tVar != null) {
                tVar.invalidate();
                return;
            }
            return;
        }
        float f11 = 1.0f - f10;
        float dp = (1.0f * f10) + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f11);
        p9Var.setTranslationY((-(((p9Var.getMeasuredHeight() / 2.0f) + p9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f11);
        p9Var.setScaleX(dp);
        p9Var.setScaleY(dp);
        paint.setAlpha((int) (f10 * 255.0f));
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
