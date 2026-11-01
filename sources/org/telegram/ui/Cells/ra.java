package org.telegram.ui.Cells;

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
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.messenger.zo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qj;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ra extends View implements vs {
    public static final /* synthetic */ int P = 0;
    public final RectF D;
    public final y E;
    public final dc F;
    public final org.telegram.ui.Components.t8 G;
    public final Drawable H;
    public int I;
    public zo J;
    public float K;
    public float L;
    public float M;
    public int N;
    public boolean O;
    public final int a;
    public final org.telegram.ui.ActionBar.p6 b;
    public long c;
    public rz0 d;
    public rz0 e;
    public rz0 f;
    public final ArrayList h;
    public qa n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final dc y;

    public ra(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new dc(this);
        this.D = new RectF();
        this.F = new dc(this);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(this, false);
        this.G = t8Var;
        this.I = -1;
        this.a = i10;
        this.b = p6Var;
        y a02 = org.telegram.ui.ActionBar.t6.a0(822083583, 8, 8);
        this.E = a02;
        a02.setCallback(this);
        t8Var.p = org.telegram.messenger.i0.L(50.0f);
        t8Var.o = org.telegram.messenger.i0.L(13.0f);
        t8Var.x = false;
        t8Var.s = org.telegram.messenger.i0.L(13.0f);
        t8Var.h(org.telegram.messenger.i0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.K += org.telegram.messenger.i0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z10);
        arrayList.add(qaVar);
        this.K += org.telegram.messenger.i0.L(14.0f);
        this.s = Math.max(this.s, qaVar.a.c);
        this.w = Math.max(this.w, qaVar.b.c + (z10 ? org.telegram.messenger.i0.L(38.0f) : 0));
        return qaVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        TL_bots.BotVerification botVerification;
        this.c = j10;
        this.L = 0.0f;
        this.K = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i10 = (int) (org.telegram.messenger.i0.q.x * 0.95f);
        this.K += org.telegram.messenger.i0.L(14.0f);
        rz0 rz0Var = new rz0(org.telegram.messenger.o5.l(e20.s0, j10), 14.0f, org.telegram.messenger.i0.o());
        this.d = rz0Var;
        this.K = rz0Var.i() + org.telegram.messenger.i0.L(3.0f) + this.K;
        int i11 = this.a;
        rz0 rz0Var2 = new rz0(dd.L0(org.telegram.messenger.i5.r(i11).x(j10) ? 2131751801 : 2131751800, null), 14.0f, null);
        this.e = rz0Var2;
        this.K = rz0Var2.i() + org.telegram.messenger.i0.L(11.0f) + this.K;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String L0 = dd.L0(2131751797, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = dd.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i02 = dd.i0(2131751796, str);
            if (TextUtils.isEmpty(i02)) {
                spannableStringBuilder.append((CharSequence) str);
            } else {
                spannableStringBuilder.append((CharSequence) i02);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.i0.L(12));
            a(org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), L0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String L02 = dd.L0(2131751795, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = dd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, L02, false);
        }
        TLRPC.User Z1 = j10 < 0 ? null : wp.r1(i11).Z1(Long.valueOf(j10));
        TLRPC.UserFull a2 = j10 < 0 ? null : wp.r1(i11).a2(j10);
        if (a2 == null && j10 > 0) {
            wp.r1(i11).e3(wp.r1(i11).Z1(Long.valueOf(j10)), true, 0);
        }
        if (a2 != null) {
            zo O0 = wp.r1(i11).O0(j10);
            this.J = O0;
            int max = Math.max(a2.common_chats_count, O0.g);
            if (max > 0) {
                this.n = a(dd.G(max, "Groups", new Object[0]), dd.L0(2131751802, null), true);
                int min = Math.min(3, this.J.e.size());
                org.telegram.ui.Components.t8 t8Var = this.G;
                t8Var.i(min);
                for (int i12 = 0; i12 < Math.min(3, this.J.e.size()); i12++) {
                    t8Var.j(i12, i11, (TLObject) this.J.e.get(i12));
                }
                t8Var.a(true, true);
            } else {
                this.J = null;
                this.n = null;
            }
        } else {
            this.J = null;
            this.n = null;
        }
        this.r = this.s + org.telegram.messenger.i0.L(7.66f) + this.w;
        if (Z1 == null || Z1.verified || i20.A(Z1.id)) {
            this.f = null;
            this.K += org.telegram.messenger.i0.L(14.0f);
        } else if (Z1.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            dq dqVar = new dq(R.drawable.filled_info, 0);
            dqVar.H = 0.55f;
            dqVar.I = -0.55f;
            float L = org.telegram.messenger.i0.L(1.0f);
            float L2 = org.telegram.messenger.i0.L(-1.0f);
            dqVar.r = L;
            dqVar.s = L2;
            spannableStringBuilder2.setSpan(dqVar, 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) dd.L0(2131751798, null));
            this.f = new rz0(spannableStringBuilder2, 12.0f, null);
            this.K = this.f.i() + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(15.33f) + this.K;
        } else if (a2 == null || (botVerification = a2.bot_verification) == null) {
            this.f = null;
            this.K += org.telegram.messenger.i0.L(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
            this.f = new rz0(spannableStringBuilder3, 12.0f, null);
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o5(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder3.append((CharSequence) kj.h0(botVerification.description, false));
            rz0 rz0Var3 = new rz0(spannableStringBuilder3, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            rz0Var3.a();
            rz0Var3.m(5);
            Point point = org.telegram.messenger.i0.q;
            rz0Var3.p(Math.min(point.x, point.y) * 0.5f);
            rz0Var3.r(this);
            this.f = rz0Var3;
            this.K = this.f.i() + org.telegram.messenger.i0.L(12.0f) + org.telegram.messenger.i0.L(15.33f) + this.K;
        }
        float max2 = Math.max(this.L, this.d.k());
        this.L = max2;
        float max3 = Math.max(max2, this.e.k());
        this.L = max3;
        float max4 = Math.max(max3, this.r);
        this.L = max4;
        this.L = Math.min(max4 + org.telegram.messenger.i0.L(32.0f), i10);
    }

    public final void c(float f7, int i10) {
        if (Math.abs(this.M - f7) > 0.01f || i10 != this.N) {
            invalidate();
        }
        this.N = i10;
        this.M = f7;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.E0;
        int i13 = this.a;
        if (i10 == i12) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.c;
            if (longValue == j10) {
                b(j10, wp.r1(i13).B1(this.c));
                return;
            }
            return;
        }
        if (i10 == at.O3 && ((Long) objArr[0]).longValue() == this.c) {
            zo O0 = wp.r1(i13).O0(this.c);
            this.J = O0;
            int i14 = O0.g;
            qa qaVar = this.n;
            if (qaVar == null || i14 <= 0) {
                b(this.c, wp.r1(i13).B1(this.c));
                requestLayout();
            } else {
                qaVar.b = new rz0(dd.G(i14, "Groups", new Object[0]), 12.0f, org.telegram.messenger.i0.o());
                int min = Math.min(3, this.J.e.size());
                org.telegram.ui.Components.t8 t8Var = this.G;
                t8Var.i(min);
                for (int i15 = 0; i15 < Math.min(3, this.J.e.size()); i15++) {
                    t8Var.j(i15, i13, (TLObject) this.J.e.get(i15));
                }
                t8Var.a(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.a;
        at.f(i10).c(this, at.E0);
        at.f(i10).c(this, at.O3);
        this.G.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        at.f(i10).n(this, at.E0);
        at.f(i10).n(this, at.O3);
        this.G.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Fa, p6Var) : -1;
        int i10 = this.I;
        Drawable drawable = this.H;
        if (i10 != w02) {
            this.I = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f10 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.L) / 2.0f;
        float height = (getHeight() - this.K) / 2.0f;
        float width3 = (getWidth() + this.L) / 2.0f;
        float height2 = (getHeight() + this.K) / 2.0f;
        RectF rectF = this.x;
        rectF.set(width2, height, width3, height2);
        float a2 = this.y.a(0.025f);
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i11 = this.N;
        float x10 = getX();
        float f11 = this.M;
        if (p6Var != null) {
            p6Var.b(x10, f11, measuredWidth, i11);
        } else {
            org.telegram.ui.ActionBar.t6.r(x10, f11, measuredWidth, i11);
        }
        float f12 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var));
        if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackgroundDarken", p6Var));
        }
        float f13 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.K) / 2.0f);
        float B = c3.i0.B(getHeight(), this.K, 2.0f, 0.0f);
        float f14 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.i0.L(14.0f));
        float L = B + org.telegram.messenger.i0.L(14.0f);
        rz0 rz0Var = this.d;
        float f15 = 32.0f;
        rz0Var.p = this.L - org.telegram.messenger.i0.L(32.0f);
        rz0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.i0.L(3.0f));
        float i12 = L + this.d.i() + org.telegram.messenger.i0.L(3.0f);
        rz0 rz0Var2 = this.e;
        rz0Var2.p = this.L - org.telegram.messenger.i0.L(32.0f);
        rz0Var2.c(width - (this.e.k() / 2.0f), this.e.i() / 2.0f, 0.7f, w02, canvas);
        canvas.translate(0.0f, this.e.i() + org.telegram.messenger.i0.L(11.0f));
        float i13 = this.e.i() + org.telegram.messenger.i0.L(11.0f) + i12;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i14 >= arrayList.size()) {
                break;
            }
            if (i14 > 0) {
                canvas.translate(f13, org.telegram.messenger.i0.L(7.0f));
                i13 += org.telegram.messenger.i0.L(7.0f);
            }
            canvas.save();
            qa qaVar = (qa) arrayList.get(i14);
            float f16 = f10;
            float L2 = (width - (this.L / f10)) + org.telegram.messenger.i0.L(f12) + this.s;
            float f17 = i13;
            rz0 rz0Var3 = qaVar.a;
            float f18 = f12;
            boolean z10 = qaVar.c;
            float f19 = f14;
            RectF rectF2 = qaVar.d;
            float f20 = f15;
            float f21 = L2 - rz0Var3.c;
            float L3 = (width - (this.L / f16)) + org.telegram.messenger.i0.L(f18) + this.s + org.telegram.messenger.i0.L(7.66f);
            rz0Var3.p = (L3 - f21) - org.telegram.messenger.i0.L(7.66f);
            int i15 = i14;
            rz0Var3.c(f21, rz0Var3.i() / f16, 0.7f, w02, canvas);
            float L4 = (width - (this.L / f16)) + org.telegram.messenger.i0.L(f18) + this.s + org.telegram.messenger.i0.L(7.66f);
            float L5 = (width - (this.L / f16)) + org.telegram.messenger.i0.L(f18) + this.s + org.telegram.messenger.i0.L(7.66f) + qaVar.b.c;
            org.telegram.ui.Components.t8 t8Var = this.G;
            rectF2.set(L4, f17, L5 + (z10 ? t8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.i0.L(5.0f) : 0.0f), qaVar.b.i() + f17);
            if (this.n == qaVar) {
                RectF rectF3 = this.D;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.i0.L(4.0f), -org.telegram.messenger.i0.L(f16));
                float a10 = this.F.a(0.025f);
                f7 = 4.0f;
                canvas.scale(a10, a10, rectF3.centerX(), qaVar.b.i() / f16);
                y yVar = this.E;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f17), (int) rectF3.right, (int) (rectF3.bottom - f17));
                    yVar.draw(canvas);
                }
            } else {
                f7 = 4.0f;
            }
            rz0 rz0Var4 = qaVar.b;
            rz0Var4.p = (((this.L / f16) + width) - org.telegram.messenger.i0.L(8.0f)) - L3;
            rz0Var4.c(L3, qaVar.b.i() / f16, 1.0f, w02, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.L / f16)) + org.telegram.messenger.i0.L(f18) + this.s + org.telegram.messenger.i0.L(7.66f) + qaVar.b.c + org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(1.0f));
                t8Var.g(canvas);
                canvas.translate(t8Var.A + org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(13.0f) / f16);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f16), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f16));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.i0.L(f19));
            i13 = org.telegram.messenger.i0.L(f19) + f17;
            i14 = i15 + 1;
            f10 = f16;
            f12 = f18;
            f14 = f19;
            f15 = f20;
            f13 = 0.0f;
        }
        float f22 = f10;
        float f23 = f15;
        if (this.f != null) {
            canvas.translate(0.0f, org.telegram.messenger.i0.L(12.0f));
            rz0 rz0Var5 = this.f;
            if (rz0Var5.f > 1) {
                rz0Var5.c(width - (rz0Var5.k() / f22), 0.0f, 0.7f, w02, canvas);
            } else {
                rz0Var5.p = this.L - org.telegram.messenger.i0.L(f23);
                rz0Var5.c(width - (this.f.k() / f22), this.f.i() / f22, 0.7f, w02, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.m5.b(16.0f, (int) this.K, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qj qjVar;
        boolean z10 = this.n != null && this.D.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = !z10 && this.x.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        y yVar = this.E;
        dc dcVar = this.F;
        dc dcVar2 = this.y;
        if (action == 0) {
            dcVar2.c(z11);
            dcVar.c(z10);
            yVar.setState(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (dcVar2.i) {
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if ((T instanceof un) && (qjVar = ((un) T).o1) != null) {
                    qjVar.e(true, false);
                }
            } else if (dcVar.i) {
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j10 = this.c;
                    if (j10 >= 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    bundle.putBoolean("open_common", true);
                    T2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            dcVar.c(false);
            dcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            dcVar.c(false);
            dcVar2.c(false);
            yVar.setState(new int[0]);
        }
        return dcVar.i || dcVar2.i;
    }

    public void setAnimating(boolean z10) {
        this.O = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }
}
