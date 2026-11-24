// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class h9c extends View implements jm7 {
    public static final /* synthetic */ int Q = 0;
    public final RectF E;
    public final fg0 F;
    public final u51 G;
    public final gd0 H;
    public final Drawable I;
    public int J;
    public sb7 K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final ylb b;
    public long c;
    public uib d;
    public uib e;
    public uib f;
    public final ArrayList h;
    public g9c n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final u51 y;

    public h9c(int i, ylb ylbVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new u51(this);
        this.E = new RectF();
        this.G = new u51(this);
        gd0 gd0Var = new gd0(this, false);
        this.H = gd0Var;
        this.J = -1;
        this.a = i;
        this.b = ylbVar;
        fg0 Y = cmb.Y(822083583, 8, 8);
        this.F = Y;
        Y.setCallback(this);
        gd0Var.p = gm.L(50.0f);
        gd0Var.o = gm.L(13.0f);
        gd0Var.x = false;
        gd0Var.s = gm.L(13.0f);
        gd0Var.h(gm.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final g9c a(CharSequence charSequence, String str, boolean z) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += gm.L(7.0f);
        }
        g9c g9cVar = new g9c(charSequence, str, z);
        arrayList.add(g9cVar);
        this.L += gm.L(14.0f);
        this.s = Math.max(this.s, g9cVar.a.c);
        this.w = Math.max(this.w, g9cVar.b.c + (z ? gm.L(38.0f) : 0));
        return g9cVar;
    }

    public final void b(long j, TLRPC.PeerSettings peerSettings) {
        TLRPC.User W1;
        TLRPC.UserFull X1;
        float f;
        TL_bots.BotVerification botVerification;
        this.c = j;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i = (int) (gm.q.x * 0.95f);
        this.L += gm.L(14.0f);
        uib uibVar = new uib(pg3.k(z8c.t0, j), 14.0f, gm.o());
        this.d = uibVar;
        this.L = uibVar.h() + gm.L(3.0f) + this.L;
        int i2 = this.a;
        uib uibVar2 = new uib(jb6.M0(bw2.r(i2).x(j) ? 2131751738 : 2131751737, null), 14.0f, null);
        this.e = uibVar2;
        this.L = uibVar2.h() + gm.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = jb6.M0(2131751734, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = jb6.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i0 = jb6.i0(2131751733, str);
            if (TextUtils.isEmpty(i0)) {
                spannableStringBuilder.append((CharSequence) str);
            } else {
                spannableStringBuilder.append((CharSequence) i0);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(gm.L(12.0f));
            a(gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = jb6.M0(2131751732, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = jb6.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        if (j < 0) {
            W1 = null;
            X1 = null;
        } else {
            W1 = oc7.r1(i2).W1(Long.valueOf(j));
            X1 = oc7.r1(i2).X1(j);
        }
        if (X1 != null || j <= 0) {
            f = 14.0f;
        } else {
            f = 14.0f;
            oc7.r1(i2).k3(0, oc7.r1(i2).W1(Long.valueOf(j)), true);
        }
        if (X1 != null) {
            sb7 O0 = oc7.r1(i2).O0(j);
            this.K = O0;
            int max = Math.max(X1.common_chats_count, O0.g);
            if (max > 0) {
                this.n = a(jb6.G(max, "Groups", new Object[0]), jb6.M0(2131751739, null), true);
                int min = Math.min(3, this.K.e.size());
                gd0 gd0Var = this.H;
                gd0Var.i(min);
                for (int i3 = 0; i3 < Math.min(3, this.K.e.size()); i3++) {
                    gd0Var.j(i3, i2, (TLObject) this.K.e.get(i3));
                }
                gd0Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + gm.L(7.66f) + this.w;
        if (W1 == null || W1.verified || m9c.C(W1.id)) {
            this.f = null;
            this.L += gm.L(f);
        } else if (W1.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            pn2 pn2Var = new pn2(R.drawable.filled_info, 0);
            pn2Var.I = 0.55f;
            pn2Var.J = -0.55f;
            float L = gm.L(1.0f);
            float L2 = gm.L(-1.0f);
            pn2Var.r = L;
            pn2Var.s = L2;
            spannableStringBuilder2.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) jb6.M0(2131751735, null));
            this.f = new uib(spannableStringBuilder2, 12.0f, null);
            this.L = this.f.h() + gm.L(12.0f) + gm.L(15.33f) + this.L;
        } else if (X1 == null || (botVerification = X1.bot_verification) == null) {
            this.f = null;
            this.L += gm.L(f);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
            this.f = new uib(spannableStringBuilder3, 12.0f, null);
            spannableStringBuilder3.setSpan(new gn(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder3.append(k47.h0(botVerification.description, false));
            uib uibVar3 = new uib(spannableStringBuilder3, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            uibVar3.a();
            uibVar3.l(5);
            Point point = gm.q;
            uibVar3.o(Math.min(point.x, point.y) * 0.5f);
            uibVar3.q(this);
            this.f = uibVar3;
            this.L = this.f.h() + gm.L(12.0f) + gm.L(15.33f) + this.L;
        }
        float max2 = Math.max(this.M, this.d.j());
        this.M = max2;
        float max3 = Math.max(max2, this.e.j());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + gm.L(32.0f), i);
    }

    public final void c(float f, int i) {
        if (Math.abs(this.N - f) > 0.01f || i != this.O) {
            invalidate();
        }
        this.O = i;
        this.N = f;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.E0;
        int i4 = this.a;
        if (i == i3) {
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.c;
            if (longValue == j) {
                b(j, oc7.r1(i4).A1(this.c));
                return;
            }
            return;
        }
        if (i == nm7.R3 && ((Long) objArr[0]).longValue() == this.c) {
            sb7 O0 = oc7.r1(i4).O0(this.c);
            this.K = O0;
            int i5 = O0.g;
            g9c g9cVar = this.n;
            if (g9cVar == null || i5 <= 0) {
                b(this.c, oc7.r1(i4).A1(this.c));
                requestLayout();
            } else {
                g9cVar.b = new uib(jb6.G(i5, "Groups", new Object[0]), 12.0f, gm.o());
                int min = Math.min(3, this.K.e.size());
                gd0 gd0Var = this.H;
                gd0Var.i(min);
                for (int i6 = 0; i6 < Math.min(3, this.K.e.size()); i6++) {
                    gd0Var.j(i6, i4, (TLObject) this.K.e.get(i6));
                }
                gd0Var.a(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        nm7.f(i).b(this, nm7.E0);
        nm7.f(i).b(this, nm7.R3);
        this.H.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        nm7.f(i).n(this, nm7.E0);
        nm7.f(i).n(this, nm7.R3);
        this.H.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        ylb ylbVar = this.b;
        int v0 = cmb.g1(ylbVar) ? cmb.v0(cmb.Ea, ylbVar) : -1;
        int i = this.J;
        Drawable drawable = this.I;
        if (i != v0) {
            this.J = v0;
            drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f2 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.M) / 2.0f;
        float height = (getHeight() - this.L) / 2.0f;
        float width3 = (getWidth() + this.M) / 2.0f;
        float height2 = (getHeight() + this.L) / 2.0f;
        RectF rectF = this.x;
        rectF.set(width2, height, width3, height2);
        float a = this.y.a(0.025f);
        canvas.scale(a, a, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i2 = this.O;
        float x = getX();
        float f3 = this.N;
        if (ylbVar != null) {
            ylbVar.b(x, f3, measuredWidth, i2);
        } else {
            cmb.q(x, f3, measuredWidth, i2);
        }
        float f4 = 16.0f;
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.U0("paintChatActionBackground", ylbVar));
        if (ylbVar != null ? ylbVar.g() : cmb.b1()) {
            canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), cmb.U0("paintChatActionBackgroundDarken", ylbVar));
        }
        float f5 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z = aq1.z(getHeight(), this.L, 2.0f, 0.0f);
        float f6 = 14.0f;
        canvas.translate(0.0f, gm.L(14.0f));
        float L = z + gm.L(14.0f);
        uib uibVar = this.d;
        float f7 = 32.0f;
        uibVar.p = this.M - gm.L(32.0f);
        uibVar.c(width - (this.d.j() / 2.0f), this.d.h() / 2.0f, 1.0f, v0, canvas);
        canvas.translate(0.0f, this.d.h() + gm.L(3.0f));
        float h = L + this.d.h() + gm.L(3.0f);
        uib uibVar2 = this.e;
        uibVar2.p = this.M - gm.L(32.0f);
        uibVar2.c(width - (this.e.j() / 2.0f), this.e.h() / 2.0f, 0.7f, v0, canvas);
        canvas.translate(0.0f, this.e.h() + gm.L(11.0f));
        float h2 = this.e.h() + gm.L(11.0f) + h;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i3 > 0) {
                canvas.translate(f5, gm.L(7.0f));
                h2 += gm.L(7.0f);
            }
            canvas.save();
            g9c g9cVar = (g9c) arrayList.get(i3);
            float f8 = f2;
            float L2 = (width - (this.M / f2)) + gm.L(f4) + this.s;
            float f9 = h2;
            uib uibVar3 = g9cVar.a;
            float f10 = f4;
            boolean z2 = g9cVar.c;
            float f11 = f6;
            RectF rectF2 = g9cVar.d;
            float f12 = f7;
            float f13 = L2 - uibVar3.c;
            float L3 = (width - (this.M / f8)) + gm.L(f10) + this.s + gm.L(7.66f);
            uibVar3.p = (L3 - f13) - gm.L(7.66f);
            int i4 = i3;
            uibVar3.c(f13, uibVar3.h() / f8, 0.7f, v0, canvas);
            float L4 = (width - (this.M / f8)) + gm.L(f10) + this.s + gm.L(7.66f);
            float L5 = (width - (this.M / f8)) + gm.L(f10) + this.s + gm.L(7.66f) + g9cVar.b.c;
            gd0 gd0Var = this.H;
            rectF2.set(L4, f9, L5 + (z2 ? gd0Var.A + (drawable.getIntrinsicWidth() * 0.8f) + gm.L(5.0f) : 0.0f), g9cVar.b.h() + f9);
            if (this.n == g9cVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-gm.L(4.0f), -gm.L(f8));
                float a2 = this.G.a(0.025f);
                f = 4.0f;
                canvas.scale(a2, a2, rectF3.centerX(), g9cVar.b.h() / f8);
                fg0 fg0Var = this.F;
                if (fg0Var != null) {
                    fg0Var.setBounds((int) rectF3.left, (int) (rectF3.top - f9), (int) rectF3.right, (int) (rectF3.bottom - f9));
                    fg0Var.draw(canvas);
                }
            } else {
                f = 4.0f;
            }
            uib uibVar4 = g9cVar.b;
            uibVar4.p = (((this.M / f8) + width) - gm.L(8.0f)) - L3;
            uibVar4.c(L3, g9cVar.b.h() / f8, 1.0f, v0, canvas);
            if (z2) {
                canvas.save();
                canvas.translate((width - (this.M / f8)) + gm.L(f10) + this.s + gm.L(7.66f) + g9cVar.b.c + gm.L(f), gm.L(1.0f));
                gd0Var.g(canvas);
                canvas.translate(gd0Var.A + gm.L(1.0f), gm.L(13.0f) / f8);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f8), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f8));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, gm.L(f11));
            h2 = gm.L(f11) + f9;
            i3 = i4 + 1;
            f2 = f8;
            f4 = f10;
            f6 = f11;
            f7 = f12;
            f5 = 0.0f;
        }
        float f14 = f2;
        float f15 = f7;
        if (this.f != null) {
            canvas.translate(0.0f, gm.L(12.0f));
            uib uibVar5 = this.f;
            if (uibVar5.f > 1) {
                uibVar5.c(width - (uibVar5.j() / f14), 0.0f, 0.7f, v0, canvas);
            } else {
                uibVar5.p = this.M - gm.L(f15);
                uibVar5.c(width - (this.f.j() / f14), this.f.h() / f14, 0.7f, v0, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), kt6.e(16.0f, (int) this.L, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pr1 pr1Var;
        boolean z = this.n != null && this.E.contains(motionEvent.getX(), motionEvent.getY());
        boolean z2 = !z && this.x.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        fg0 fg0Var = this.F;
        u51 u51Var = this.G;
        u51 u51Var2 = this.y;
        if (action == 0) {
            u51Var2.c(z2);
            u51Var.c(z);
            fg0Var.setState(z ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (u51Var2.i) {
                d S = LaunchActivity.S();
                if ((S instanceof yv1) && (pr1Var = ((yv1) S).p1) != null) {
                    pr1Var.e(true, false);
                }
            } else if (u51Var.i) {
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    Bundle bundle = new Bundle();
                    long j = this.c;
                    if (j >= 0) {
                        bundle.putLong("user_id", j);
                    } else {
                        bundle.putLong("chat_id", -j);
                    }
                    bundle.putBoolean("open_common", true);
                    S2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            u51Var.c(false);
            u51Var2.c(false);
            fg0Var.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            u51Var.c(false);
            u51Var2.c(false);
            fg0Var.setState(new int[0]);
        }
        return u51Var.i || u51Var2.i;
    }

    public void setAnimating(boolean z) {
        this.P = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }
}
