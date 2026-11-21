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
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.po;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vi;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ta extends View implements fs {
    public static final /* synthetic */ int Q = 0;
    public final RectF E;
    public final y F;
    public final mc G;
    public final org.telegram.ui.Components.d9 H;
    public final Drawable I;
    public int J;
    public po K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public long c;
    public xy0 d;
    public xy0 e;
    public xy0 f;
    public final ArrayList h;
    public sa n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final mc y;

    public ta(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new mc(this);
        this.E = new RectF();
        this.G = new mc(this);
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(this, false);
        this.H = d9Var;
        this.J = -1;
        this.a = i7;
        this.b = h6Var;
        y a02 = org.telegram.ui.ActionBar.m6.a0(822083583, 8, 8);
        this.F = a02;
        a02.setCallback(this);
        d9Var.p = org.telegram.messenger.g0.L(50.0f);
        d9Var.o = org.telegram.messenger.g0.L(13.0f);
        d9Var.x = false;
        d9Var.s = org.telegram.messenger.g0.L(13.0f);
        d9Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final sa a(CharSequence charSequence, String str, boolean z10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += org.telegram.messenger.g0.L(7.0f);
        }
        sa saVar = new sa(str, charSequence, z10);
        arrayList.add(saVar);
        this.L += org.telegram.messenger.g0.L(14.0f);
        this.s = Math.max(this.s, saVar.a.c);
        this.w = Math.max(this.w, saVar.b.c + (z10 ? org.telegram.messenger.g0.L(38.0f) : 0));
        return saVar;
    }

    public final void b(long j3, TLRPC.PeerSettings peerSettings) {
        TL_bots.BotVerification botVerification;
        this.c = j3;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i7 = (int) (org.telegram.messenger.g0.q.x * 0.95f);
        this.L += org.telegram.messenger.g0.L(14.0f);
        xy0 xy0Var = new xy0(org.telegram.messenger.n5.l(j10.t0, j3), 14.0f, org.telegram.messenger.g0.o());
        this.d = xy0Var;
        this.L = xy0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.L;
        int i10 = this.a;
        xy0 xy0Var2 = new xy0(gd.N0(org.telegram.messenger.i5.r(i10).x(j3) ? 2131751789 : 2131751788, null), 14.0f, null);
        this.e = xy0Var2;
        this.L = xy0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String N0 = gd.N0(2131751785, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = gd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = gd.i0(2131751784, str);
            if (TextUtils.isEmpty(i02)) {
                spannableStringBuilder.append((CharSequence) str);
            } else {
                spannableStringBuilder.append((CharSequence) i02);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(org.telegram.messenger.g0.L(12));
            a(org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), N0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String N02 = gd.N0(2131751783, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = gd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, N02, false);
        }
        TLRPC.User c22 = j3 < 0 ? null : mp.u1(i10).c2(Long.valueOf(j3));
        TLRPC.UserFull d2 = j3 < 0 ? null : mp.u1(i10).d2(j3);
        if (d2 == null && j3 > 0) {
            mp.u1(i10).n3(mp.u1(i10).c2(Long.valueOf(j3)), true, 0);
        }
        if (d2 != null) {
            po R0 = mp.u1(i10).R0(j3);
            this.K = R0;
            int max = Math.max(d2.common_chats_count, R0.g);
            if (max > 0) {
                this.n = a(gd.G(max, "Groups", new Object[0]), gd.N0(2131751790, null), true);
                int min = Math.min(3, this.K.e.size());
                org.telegram.ui.Components.d9 d9Var = this.H;
                d9Var.i(min);
                for (int i11 = 0; i11 < Math.min(3, this.K.e.size()); i11++) {
                    d9Var.j(i11, i10, (TLObject) this.K.e.get(i11));
                }
                d9Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + org.telegram.messenger.g0.L(7.66f) + this.w;
        if (c22 == null || c22.verified || o10.B(c22.id)) {
            this.f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        } else if (c22.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            nq nqVar = new nq(R.drawable.filled_info, 0);
            nqVar.I = 0.55f;
            nqVar.J = -0.55f;
            float L = org.telegram.messenger.g0.L(1.0f);
            float L2 = org.telegram.messenger.g0.L(-1.0f);
            nqVar.r = L;
            nqVar.s = L2;
            spannableStringBuilder2.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) gd.N0(2131751786, null));
            this.f = new xy0(spannableStringBuilder2, 12.0f, null);
            this.L = this.f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
        } else if (d2 == null || (botVerification = d2.bot_verification) == null) {
            this.f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
            this.f = new xy0(spannableStringBuilder3, 12.0f, null);
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.y5(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder3.append(fj.h0(botVerification.description, false));
            xy0 xy0Var3 = new xy0(spannableStringBuilder3, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            xy0Var3.a();
            xy0Var3.m(5);
            Point point = org.telegram.messenger.g0.q;
            xy0Var3.p(Math.min(point.x, point.y) * 0.5f);
            xy0Var3.r(this);
            this.f = xy0Var3;
            this.L = this.f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
        }
        float max2 = Math.max(this.M, this.d.k());
        this.M = max2;
        float max3 = Math.max(max2, this.e.k());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + org.telegram.messenger.g0.L(32.0f), i7);
    }

    public final void c(float f10, int i7) {
        if (Math.abs(this.N - f10) > 0.01f || i7 != this.O) {
            invalidate();
        }
        this.O = i7;
        this.N = f10;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.E0;
        int i12 = this.a;
        if (i7 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j3 = this.c;
            if (longValue == j3) {
                b(j3, mp.u1(i12).E1(this.c));
                return;
            }
            return;
        }
        if (i7 == ks.R3 && ((Long) objArr[0]).longValue() == this.c) {
            po R0 = mp.u1(i12).R0(this.c);
            this.K = R0;
            int i13 = R0.g;
            sa saVar = this.n;
            if (saVar == null || i13 <= 0) {
                b(this.c, mp.u1(i12).E1(this.c));
                requestLayout();
            } else {
                saVar.b = new xy0(gd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.K.e.size());
                org.telegram.ui.Components.d9 d9Var = this.H;
                d9Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.K.e.size()); i14++) {
                    d9Var.j(i14, i12, (TLObject) this.K.e.get(i14));
                }
                d9Var.a(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.a;
        ks.f(i7).c(this, ks.E0);
        ks.f(i7).c(this, ks.R3);
        this.H.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.a;
        ks.f(i7).n(this, ks.E0);
        ks.f(i7).n(this, ks.R3);
        this.H.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.h6 h6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.m6.i1(h6Var) ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fa, h6Var) : -1;
        int i7 = this.J;
        Drawable drawable = this.I;
        if (i7 != w02) {
            this.J = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        canvas.save();
        float f11 = 2.0f;
        float width = getWidth() / 2.0f;
        float width2 = (getWidth() - this.M) / 2.0f;
        float height = (getHeight() - this.L) / 2.0f;
        float width3 = (getWidth() + this.M) / 2.0f;
        float height2 = (getHeight() + this.L) / 2.0f;
        RectF rectF = this.x;
        rectF.set(width2, height, width3, height2);
        float a10 = this.y.a(0.025f);
        canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
        int measuredWidth = getMeasuredWidth();
        int i10 = this.O;
        float x10 = getX();
        float f12 = this.N;
        if (h6Var != null) {
            h6Var.e(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.m6.r(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var));
        if (h6Var != null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackgroundDarken", h6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float A = com.google.android.gms.internal.vision.e2.A(getHeight(), this.L, 2.0f, 0.0f);
        float f15 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = A + org.telegram.messenger.g0.L(14.0f);
        xy0 xy0Var = this.d;
        float f16 = 32.0f;
        xy0Var.p = this.M - org.telegram.messenger.g0.L(32.0f);
        xy0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i11 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        xy0 xy0Var2 = this.e;
        xy0Var2.p = this.M - org.telegram.messenger.g0.L(32.0f);
        xy0Var2.c(width - (this.e.k() / 2.0f), this.e.i() / 2.0f, 0.7f, w02, canvas);
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
            sa saVar = (sa) arrayList.get(i13);
            float f17 = f11;
            float L2 = (width - (this.M / f11)) + org.telegram.messenger.g0.L(f13) + this.s;
            float f18 = i12;
            xy0 xy0Var3 = saVar.a;
            float f19 = f13;
            boolean z10 = saVar.c;
            float f20 = f15;
            RectF rectF2 = saVar.d;
            float f21 = f16;
            float f22 = L2 - xy0Var3.c;
            float L3 = (width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f);
            xy0Var3.p = (L3 - f22) - org.telegram.messenger.g0.L(7.66f);
            int i14 = i13;
            xy0Var3.c(f22, xy0Var3.i() / f17, 0.7f, w02, canvas);
            float L4 = (width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f) + saVar.b.c;
            org.telegram.ui.Components.d9 d9Var = this.H;
            rectF2.set(L4, f18, L5 + (z10 ? d9Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f) : 0.0f), saVar.b.i() + f18);
            if (this.n == saVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f17));
                float a11 = this.G.a(0.025f);
                f10 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), saVar.b.i() / f17);
                y yVar = this.F;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f18), (int) rectF3.right, (int) (rectF3.bottom - f18));
                    yVar.draw(canvas);
                }
            } else {
                f10 = 4.0f;
            }
            xy0 xy0Var4 = saVar.b;
            xy0Var4.p = (((this.M / f17) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            xy0Var4.c(L3, saVar.b.i() / f17, 1.0f, w02, canvas);
            if (z10) {
                canvas.save();
                canvas.translate((width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f) + saVar.b.c + org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(1.0f));
                d9Var.g(canvas);
                canvas.translate(d9Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f17);
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
            xy0 xy0Var5 = this.f;
            if (xy0Var5.f > 1) {
                xy0Var5.c(width - (xy0Var5.k() / f23), 0.0f, 0.7f, w02, canvas);
            } else {
                xy0Var5.p = this.M - org.telegram.messenger.g0.L(f24);
                xy0Var5.c(width - (this.f.k() / f23), this.f.i() / f23, 0.7f, w02, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.f3.b(16.0f, (int) this.L, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vi viVar;
        boolean z10 = this.n != null && this.E.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = !z10 && this.x.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        y yVar = this.F;
        mc mcVar = this.G;
        mc mcVar2 = this.y;
        if (action == 0) {
            mcVar2.c(z11);
            mcVar.c(z10);
            yVar.setState(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (mcVar2.i) {
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if ((T instanceof bn) && (viVar = ((bn) T).p1) != null) {
                    viVar.e(true, false);
                }
            } else if (mcVar.i) {
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
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
            mcVar.c(false);
            mcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            mcVar.c(false);
            mcVar2.c(false);
            yVar.setState(new int[0]);
        }
        return mcVar.i || mcVar2.i;
    }

    public void setAnimating(boolean z10) {
        this.P = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }
}
