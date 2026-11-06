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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.to;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ra extends View implements ls {
    public static final /* synthetic */ int P = 0;
    public final RectF D;
    public final y E;
    public final ic F;
    public final org.telegram.ui.Components.y8 G;
    public final Drawable H;
    public int I;
    public to J;
    public float K;
    public float L;
    public float M;
    public int N;
    public boolean O;
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public long c;
    public my0 d;
    public my0 e;
    public my0 f;
    public final ArrayList h;
    public qa n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final ic y;

    public ra(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new ic(this);
        this.D = new RectF();
        this.F = new ic(this);
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(this, false);
        this.G = y8Var;
        this.I = -1;
        this.a = i7;
        this.b = f6Var;
        y a02 = org.telegram.ui.ActionBar.k6.a0(822083583, 8, 8);
        this.E = a02;
        a02.setCallback(this);
        y8Var.p = org.telegram.messenger.g0.L(50.0f);
        y8Var.o = org.telegram.messenger.g0.L(13.0f);
        y8Var.x = false;
        y8Var.s = org.telegram.messenger.g0.L(13.0f);
        y8Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.H = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z9) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.K += org.telegram.messenger.g0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z9);
        arrayList.add(qaVar);
        this.K += org.telegram.messenger.g0.L(14.0f);
        this.s = Math.max(this.s, qaVar.a.c);
        this.w = Math.max(this.w, qaVar.b.c + (z9 ? org.telegram.messenger.g0.L(38.0f) : 0));
        return qaVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        TL_bots.BotVerification botVerification;
        this.c = j3;
        this.L = 0.0f;
        this.K = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i7 = (int) (org.telegram.messenger.g0.q.x * 0.95f);
        this.K += org.telegram.messenger.g0.L(14.0f);
        my0 my0Var = new my0(org.telegram.messenger.m5.l(p10.s0, j3), 14.0f, org.telegram.messenger.g0.o());
        this.d = my0Var;
        this.K = my0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.K;
        int i10 = this.a;
        my0 my0Var2 = new my0(hd.M0(org.telegram.messenger.g5.r(i10).x(j3) ? 2131751801 : 2131751800, null), 14.0f, null);
        this.e = my0Var2;
        this.K = my0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.K;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = hd.M0(2131751797, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = hd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = hd.i0(2131751796, str);
            if (TextUtils.isEmpty(i02)) {
                spannableStringBuilder.append((CharSequence) str);
            } else {
                spannableStringBuilder.append((CharSequence) i02);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(12));
            a(org.telegram.messenger.i6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = hd.M0(2131751795, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = hd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        TLRPC.User a22 = j3 < 0 ? null : qp.s1(i10).a2(Long.valueOf(j3));
        TLRPC.UserFull b22 = j3 < 0 ? null : qp.s1(i10).b2(j3);
        if (b22 == null && j3 > 0) {
            qp.s1(i10).g3(qp.s1(i10).a2(Long.valueOf(j3)), true, 0);
        }
        if (b22 != null) {
            to P0 = qp.s1(i10).P0(j3);
            this.J = P0;
            int max = Math.max(b22.common_chats_count, P0.g);
            if (max > 0) {
                this.n = a(hd.G(max, "Groups", new Object[0]), hd.M0(2131751802, null), true);
                int min = Math.min(3, this.J.e.size());
                org.telegram.ui.Components.y8 y8Var = this.G;
                y8Var.i(min);
                for (int i11 = 0; i11 < Math.min(3, this.J.e.size()); i11++) {
                    y8Var.j(i11, i10, (TLObject) this.J.e.get(i11));
                }
                y8Var.a(true, true);
            } else {
                this.J = null;
                this.n = null;
            }
        } else {
            this.J = null;
            this.n = null;
        }
        this.r = this.s + org.telegram.messenger.g0.L(7.66f) + this.w;
        if (a22 == null || a22.verified || t10.A(a22.id)) {
            this.f = null;
            this.K += org.telegram.messenger.g0.L(14.0f);
        } else if (a22.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            wp wpVar = new wp(R.drawable.filled_info, 0);
            wpVar.H = 0.55f;
            wpVar.I = -0.55f;
            float L = org.telegram.messenger.g0.L(1.0f);
            float L2 = org.telegram.messenger.g0.L(-1.0f);
            wpVar.r = L;
            wpVar.s = L2;
            spannableStringBuilder2.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) hd.M0(2131751798, null));
            this.f = new my0(spannableStringBuilder2, 12.0f, null);
            this.K = this.f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.K;
        } else if (b22 == null || (botVerification = b22.bot_verification) == null) {
            this.f = null;
            this.K += org.telegram.messenger.g0.L(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
            this.f = new my0(spannableStringBuilder3, 12.0f, null);
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r5(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder3.append(ij.h0(botVerification.description, false));
            my0 my0Var3 = new my0(spannableStringBuilder3, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            my0Var3.a();
            my0Var3.m(5);
            Point point = org.telegram.messenger.g0.q;
            my0Var3.p(Math.min(point.x, point.y) * 0.5f);
            my0Var3.r(this);
            this.f = my0Var3;
            this.K = this.f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.K;
        }
        float max2 = Math.max(this.L, this.d.k());
        this.L = max2;
        float max3 = Math.max(max2, this.e.k());
        this.L = max3;
        float max4 = Math.max(max3, this.r);
        this.L = max4;
        this.L = Math.min(max4 + org.telegram.messenger.g0.L(32.0f), i7);
    }

    public final void c(float f10, int i7) {
        if (Math.abs(this.M - f10) > 0.01f || i7 != this.N) {
            invalidate();
        }
        this.N = i7;
        this.M = f10;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.E0;
        int i12 = this.a;
        if (i7 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.c;
            if (longValue == j3) {
                b(j3, qp.s1(i12).C1(this.c));
                return;
            }
            return;
        }
        if (i7 == qs.O3 && ((Long) objArr[0]).longValue() == this.c) {
            to P0 = qp.s1(i12).P0(this.c);
            this.J = P0;
            int i13 = P0.g;
            qa qaVar = this.n;
            if (qaVar == null || i13 <= 0) {
                b(this.c, qp.s1(i12).C1(this.c));
                requestLayout();
            } else {
                qaVar.b = new my0(hd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.J.e.size());
                org.telegram.ui.Components.y8 y8Var = this.G;
                y8Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.J.e.size()); i14++) {
                    y8Var.j(i14, i12, (TLObject) this.J.e.get(i14));
                }
                y8Var.a(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        qs.f(i7).c(this, qs.E0);
        qs.f(i7).c(this, qs.O3);
        this.G.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        qs.f(i7).n(this, qs.E0);
        qs.f(i7).n(this, qs.O3);
        this.G.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.k6.i1(f6Var) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Fa, f6Var) : -1;
        int i7 = this.I;
        Drawable drawable = this.H;
        if (i7 != w02) {
            this.I = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f11 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.L) / 2.0f;
        float height = (getHeight() - this.K) / 2.0f;
        float width3 = (getWidth() + this.L) / 2.0f;
        float height2 = (getHeight() + this.K) / 2.0f;
        RectF rectF = this.x;
        rectF.set(width2, height, width3, height2);
        float a10 = this.y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.N;
        float x10 = getX();
        float f12 = this.M;
        if (f6Var != null) {
            f6Var.b(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.k6.r(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", f6Var));
        if (f6Var != null ? f6Var.g() : org.telegram.ui.ActionBar.k6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", f6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.K) / 2.0f);
        float A = com.google.android.recaptcha.internal.a.A(getHeight(), this.K, 2.0f, 0.0f);
        float f15 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = A + org.telegram.messenger.g0.L(14.0f);
        my0 my0Var = this.d;
        float f16 = 32.0f;
        my0Var.p = this.L - org.telegram.messenger.g0.L(32.0f);
        my0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i11 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        my0 my0Var2 = this.e;
        my0Var2.p = this.L - org.telegram.messenger.g0.L(32.0f);
        my0Var2.c(width - (this.e.k() / 2.0f), this.e.i() / 2.0f, 0.7f, w02, canvas);
        canvas.translate(0.0f, this.e.i() + org.telegram.messenger.g0.L(11.0f));
        float i12 = this.e.i() + org.telegram.messenger.g0.L(11.0f) + i11;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i13 >= arrayList.size()) {
                break;
            }
            if (i13 > 0) {
                canvas.translate(f14, org.telegram.messenger.g0.L(7.0f));
                i12 += org.telegram.messenger.g0.L(7.0f);
            }
            canvas.save();
            qa qaVar = (qa) arrayList.get(i13);
            float f17 = f11;
            float L2 = (width - (this.L / f11)) + org.telegram.messenger.g0.L(f13) + this.s;
            float f18 = i12;
            my0 my0Var3 = qaVar.a;
            float f19 = f13;
            boolean z9 = qaVar.c;
            float f20 = f15;
            RectF rectF2 = qaVar.d;
            float f21 = f16;
            float f22 = L2 - my0Var3.c;
            float L3 = (width - (this.L / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f);
            my0Var3.p = (L3 - f22) - org.telegram.messenger.g0.L(7.66f);
            int i14 = i13;
            my0Var3.c(f22, my0Var3.i() / f17, 0.7f, w02, canvas);
            float L4 = (width - (this.L / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.L / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f) + qaVar.b.c;
            org.telegram.ui.Components.y8 y8Var = this.G;
            rectF2.set(L4, f18, L5 + (z9 ? y8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f) : 0.0f), qaVar.b.i() + f18);
            if (this.n == qaVar) {
                RectF rectF3 = this.D;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f17));
                float a11 = this.F.a(0.025f);
                f10 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), qaVar.b.i() / f17);
                y yVar = this.E;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f18), (int) rectF3.right, (int) (rectF3.bottom - f18));
                    yVar.draw(canvas);
                }
            } else {
                f10 = 4.0f;
            }
            my0 my0Var4 = qaVar.b;
            my0Var4.p = (((this.L / f17) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            my0Var4.c(L3, qaVar.b.i() / f17, 1.0f, w02, canvas);
            if (z9) {
                canvas.save();
                canvas.translate((width - (this.L / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f) + qaVar.b.c + org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(1.0f));
                y8Var.g(canvas);
                canvas.translate(y8Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f17);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f17), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f17));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, org.telegram.messenger.g0.L(f20));
            i12 = org.telegram.messenger.g0.L(f20) + f18;
            i13 = i14 + 1;
            f11 = f17;
            f13 = f19;
            f15 = f20;
            f16 = f21;
            f14 = 0.0f;
        }
        float f23 = f11;
        float f24 = f16;
        if (this.f != null) {
            canvas.translate(0.0f, org.telegram.messenger.g0.L(12.0f));
            my0 my0Var5 = this.f;
            if (my0Var5.f > 1) {
                my0Var5.c(width - (my0Var5.k() / f23), 0.0f, 0.7f, w02, canvas);
            } else {
                my0Var5.p = this.L - org.telegram.messenger.g0.L(f24);
                my0Var5.c(width - (this.f.k() / f23), this.f.i() / f23, 0.7f, w02, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(16.0f, (int) this.K, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ui uiVar;
        boolean z9 = this.n != null && this.D.contains(motionEvent.getX(), motionEvent.getY());
        boolean z10 = !z9 && this.x.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        y yVar = this.E;
        ic icVar = this.F;
        ic icVar2 = this.y;
        if (action == 0) {
            icVar2.c(z10);
            icVar.c(z9);
            yVar.setState(z9 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (icVar2.i) {
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if ((T instanceof an) && (uiVar = ((an) T).o1) != null) {
                    uiVar.e(true, false);
                }
            } else if (icVar.i) {
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    Bundle bundle = new Bundle();
                    long j3 = this.c;
                    if (j3 >= 0) {
                        bundle.putLong("user_id", j3);
                    } else {
                        bundle.putLong("chat_id", -j3);
                    }
                    bundle.putBoolean("open_common", true);
                    T2.presentFragment(new ProfileActivity(bundle, null));
                }
                invalidate();
            }
            icVar.c(false);
            icVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
            icVar2.c(false);
            yVar.setState(new int[0]);
        }
        return icVar.i || icVar2.i;
    }

    public void setAnimating(boolean z9) {
        this.O = z9;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }
}
