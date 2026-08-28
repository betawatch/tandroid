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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b20 extends FrameLayout implements org.telegram.ui.Components.voip.m0 {
    public final TextPaint A;
    public final org.telegram.ui.fd B;
    public float C;
    public boolean D;
    public org.telegram.ui.Components.voip.n0 E;
    public final org.telegram.ui.Cells.c4 F;
    public boolean G;
    public int H;
    public int I;
    public ValueAnimator J;
    public boolean K;
    public final /* synthetic */ c20 L;
    public final z8 a;
    public TLRPC.User b;
    public TLRPC.Chat c;
    public final o9 d;
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
    public b20(c20 c20Var, Context context) {
        super(context);
        this.L = c20Var;
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        this.a = z8Var;
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.F = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        z8Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        o9 o9Var = new o9(context);
        this.d = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var, g7.e6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.fd fdVar = new org.telegram.ui.fd(this, context, 1);
        this.B = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(fdVar, g7.e6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.C != f10) {
            this.C = f10;
            this.r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override // org.telegram.ui.Components.voip.m0
    public final void a() {
        this.F.e(this, this.E.e);
        f(true);
    }

    public final void b(boolean z10) {
        c20 c20Var = this.L;
        if (c20Var.r.isDismissed()) {
            return;
        }
        if (z10 && this.v == null) {
            this.v = org.telegram.ui.Components.voip.t.c(c20Var.h, c20Var.n, null, this, null, this.f, c20Var.c, c20Var.r);
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
            int y10 = org.telegram.messenger.ll.y(24.0f, getMeasuredWidth() - this.y, 2);
            int alpha = (int) (getAlpha() * this.s * 255.0f);
            TextPaint textPaint = this.A;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.w, AndroidUtilities.dp(22.0f) + y10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.fd fdVar = this.B;
            if (fdVar.getDrawable() != null) {
                fdVar.getDrawable().setAlpha((int) (getAlpha() * this.s * 255.0f));
                fdVar.draw(canvas);
                fdVar.getDrawable().setAlpha(255);
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
            float f10 = this.C;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.10666667f;
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f11);
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
            float f12 = this.C;
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
        if (this.C <= 0.0f) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.b && !tVar.r && tVar.v && tVar.a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.L.r.B2) {
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
        o9 o9Var = this.d;
        float x10 = o9Var.getX() + (o9Var.getMeasuredWidth() / 2);
        float y10 = o9Var.getY() + (o9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.F;
        c4Var.f();
        c4Var.a(canvas, x10, y10, this);
        float f10 = this.s;
        float dp = (f10 * 1.0f) + ((1.0f - f10) * (AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)));
        o9Var.setScaleX(c4Var.b() * dp);
        o9Var.setScaleY(c4Var.b() * dp);
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
        c20 c20Var = this.L;
        int i9 = c20Var.d;
        this.f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        o9 o9Var = this.d;
        z8 z8Var = this.a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i9).getMessagesController().getUser(Long.valueOf(this.e));
            this.b = user;
            this.c = null;
            z8Var.m(i9, user);
            this.x = UserObject.getFirstName(this.b);
            o9Var.getImageReceiver().setCurrentAccount(i9);
            o9Var.h(ImageLocation.getForUser(this.b, 1), "50_50", z8Var, this.b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i9).getMessagesController().getChat(Long.valueOf(-this.e));
            this.c = chat;
            this.b = null;
            z8Var.k(i9, chat);
            TLRPC.Chat chat2 = this.c;
            if (chat2 != null) {
                this.x = chat2.title;
                o9Var.getImageReceiver().setCurrentAccount(i9);
                o9Var.h(ImageLocation.getForChat(this.c, 1), "50_50", z8Var, this.c);
            }
        }
        boolean z10 = j10 == this.e;
        if (videoParticipant == null) {
            this.D = c20Var.n.d == MessageObject.getPeerId(groupCallParticipant.peer);
        } else {
            ChatObject.VideoParticipant videoParticipant2 = c20Var.n.e;
            if (videoParticipant2 != null) {
                this.D = videoParticipant2.equals(videoParticipant);
            } else {
                this.D = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.D ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
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
        int w02;
        int w03;
        int w04;
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var == null) {
            return;
        }
        n0Var.c(z10);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
        if (n0Var2.k) {
            w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.sg, false);
        } else {
            if (!n0Var2.e) {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ng, false);
                w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.pg, false);
                if (!z10) {
                    int i9 = this.H;
                    int i10 = this.I;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.addUpdateListener(new gh.db(this, i9, w02, i10, w03, 1));
                    this.J.addListener(new mh.r2(this, w02, w03, 1));
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
            w04 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.qg, false);
        }
        w02 = w04;
        w03 = w02;
        if (!z10) {
        }
    }

    public o9 getAvatarImageView() {
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
        if (this.K) {
            return;
        }
        this.K = true;
        super.invalidate();
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null) {
            tVar.invalidate();
        } else {
            this.L.n.invalidate();
        }
        this.K = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c20 c20Var = this.L;
        org.telegram.ui.o50 o50Var = c20Var.r;
        if (c20Var.s && this.f != null) {
            b(true);
        }
        this.G = true;
        if (o50Var.p2.size() > 0) {
            this.E = (org.telegram.ui.Components.voip.n0) e2.c.k(1, o50Var.p2);
        } else {
            this.E = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        n0Var.g = this;
        n0Var.c = this.B;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z10 = this.E.e;
        org.telegram.ui.Cells.c4 c4Var = this.F;
        c4Var.e(this, z10);
        if (this.E.e) {
            return;
        }
        c4Var.c(0.0d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.G = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            this.L.r.p2.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
            n0Var2.c = null;
            n0Var2.c(false);
            this.E.b();
        }
        this.E = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.F.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.s == f10) {
            return;
        }
        this.s = f10;
        Paint paint = this.n;
        o9 o9Var = this.d;
        if (f10 == 1.0f) {
            o9Var.setTranslationY(0.0f);
            o9Var.setScaleX(1.0f);
            o9Var.setScaleY(1.0f);
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
        o9Var.setTranslationY((-(((o9Var.getMeasuredHeight() / 2.0f) + o9Var.getTop()) - (getMeasuredHeight() / 2.0f))) * f11);
        o9Var.setScaleX(dp);
        o9Var.setScaleY(dp);
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
