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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ko;
import org.telegram.messenger.l10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qi;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ra extends View implements cs {
    public static final /* synthetic */ int Q = 0;
    public final RectF E;
    public final y F;
    public final gc G;
    public final org.telegram.ui.Components.w8 H;
    public final Drawable I;
    public int J;
    public ko K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public long c;
    public ly0 d;
    public ly0 e;
    public ly0 f;
    public final ArrayList h;
    public qa n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final gc y;

    public ra(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new gc(this);
        this.E = new RectF();
        this.G = new gc(this);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(this, false);
        this.H = w8Var;
        this.J = -1;
        this.a = i3;
        this.b = e6Var;
        y a02 = org.telegram.ui.ActionBar.k6.a0(822083583, 8, 8);
        this.F = a02;
        a02.setCallback(this);
        w8Var.p = org.telegram.messenger.g0.L(50.0f);
        w8Var.o = org.telegram.messenger.g0.L(13.0f);
        w8Var.x = false;
        w8Var.s = org.telegram.messenger.g0.L(13.0f);
        w8Var.h(org.telegram.messenger.g0.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final qa a(CharSequence charSequence, String str, boolean z10) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += org.telegram.messenger.g0.L(7.0f);
        }
        qa qaVar = new qa(str, charSequence, z10);
        arrayList.add(qaVar);
        this.L += org.telegram.messenger.g0.L(14.0f);
        this.s = Math.max(this.s, qaVar.a.c);
        this.w = Math.max(this.w, qaVar.b.c + (z10 ? org.telegram.messenger.g0.L(38.0f) : 0));
        return qaVar;
    }

    public final void b(long j10, TLRPC.PeerSettings peerSettings) {
        TL_bots.BotVerification botVerification;
        this.c = j10;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i3 = (int) (org.telegram.messenger.g0.q.x * 0.95f);
        this.L += org.telegram.messenger.g0.L(14.0f);
        ly0 ly0Var = new ly0(org.telegram.messenger.m5.l(h10.t0, j10), 14.0f, org.telegram.messenger.g0.o());
        this.d = ly0Var;
        this.L = ly0Var.i() + org.telegram.messenger.g0.L(3.0f) + this.L;
        int i10 = this.a;
        ly0 ly0Var2 = new ly0(bd.M0(org.telegram.messenger.g5.r(i10).x(j10) ? 2131751801 : 2131751800, null), 14.0f, null);
        this.e = ly0Var2;
        this.L = ly0Var2.i() + org.telegram.messenger.g0.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = bd.M0(2131751797, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String F0 = bd.F0(str);
            if (!TextUtils.isEmpty(F0)) {
                spannableStringBuilder.append((CharSequence) F0).append((CharSequence) " ");
            }
            String i02 = bd.i0(2131751796, str);
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
            String M02 = bd.M0(2131751795, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = bd.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        TLRPC.User a22 = j10 < 0 ? null : hp.s1(i10).a2(Long.valueOf(j10));
        TLRPC.UserFull b22 = j10 < 0 ? null : hp.s1(i10).b2(j10);
        if (b22 == null && j10 > 0) {
            hp.s1(i10).g3(hp.s1(i10).a2(Long.valueOf(j10)), true, 0);
        }
        if (b22 != null) {
            ko P0 = hp.s1(i10).P0(j10);
            this.K = P0;
            int max = Math.max(b22.common_chats_count, P0.g);
            if (max > 0) {
                this.n = a(bd.G(max, "Groups", new Object[0]), bd.M0(2131751802, null), true);
                int min = Math.min(3, this.K.e.size());
                org.telegram.ui.Components.w8 w8Var = this.H;
                w8Var.i(min);
                for (int i11 = 0; i11 < Math.min(3, this.K.e.size()); i11++) {
                    w8Var.j(i11, i10, (TLObject) this.K.e.get(i11));
                }
                w8Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + org.telegram.messenger.g0.L(7.66f) + this.w;
        if (a22 == null || a22.verified || l10.A(a22.id)) {
            this.f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        } else if (a22.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            wp wpVar = new wp(R.drawable.filled_info, 0);
            wpVar.I = 0.55f;
            wpVar.J = -0.55f;
            float L = org.telegram.messenger.g0.L(1.0f);
            float L2 = org.telegram.messenger.g0.L(-1.0f);
            wpVar.r = L;
            wpVar.s = L2;
            spannableStringBuilder2.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) bd.M0(2131751798, null));
            this.f = new ly0(spannableStringBuilder2, 12.0f, null);
            this.L = this.f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
        } else if (b22 == null || (botVerification = b22.bot_verification) == null) {
            this.f = null;
            this.L += org.telegram.messenger.g0.L(14.0f);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
            this.f = new ly0(spannableStringBuilder3, 12.0f, null);
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.p5(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder3.append(zi.h0(botVerification.description, false));
            ly0 ly0Var3 = new ly0(spannableStringBuilder3, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            ly0Var3.a();
            ly0Var3.m(5);
            Point point = org.telegram.messenger.g0.q;
            ly0Var3.p(Math.min(point.x, point.y) * 0.5f);
            ly0Var3.r(this);
            this.f = ly0Var3;
            this.L = this.f.i() + org.telegram.messenger.g0.L(12.0f) + org.telegram.messenger.g0.L(15.33f) + this.L;
        }
        float max2 = Math.max(this.M, this.d.k());
        this.M = max2;
        float max3 = Math.max(max2, this.e.k());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + org.telegram.messenger.g0.L(32.0f), i3);
    }

    public final void c(float f10, int i3) {
        if (Math.abs(this.N - f10) > 0.01f || i3 != this.O) {
            invalidate();
        }
        this.O = i3;
        this.N = f10;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.E0;
        int i12 = this.a;
        if (i3 == i11) {
            long longValue = ((Long) objArr[0]).longValue();
            long j10 = this.c;
            if (longValue == j10) {
                b(j10, hp.s1(i12).C1(this.c));
                return;
            }
            return;
        }
        if (i3 == hs.O3 && ((Long) objArr[0]).longValue() == this.c) {
            ko P0 = hp.s1(i12).P0(this.c);
            this.K = P0;
            int i13 = P0.g;
            qa qaVar = this.n;
            if (qaVar == null || i13 <= 0) {
                b(this.c, hp.s1(i12).C1(this.c));
                requestLayout();
            } else {
                qaVar.b = new ly0(bd.G(i13, "Groups", new Object[0]), 12.0f, org.telegram.messenger.g0.o());
                int min = Math.min(3, this.K.e.size());
                org.telegram.ui.Components.w8 w8Var = this.H;
                w8Var.i(min);
                for (int i14 = 0; i14 < Math.min(3, this.K.e.size()); i14++) {
                    w8Var.j(i14, i12, (TLObject) this.K.e.get(i14));
                }
                w8Var.a(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = this.a;
        hs.f(i3).c(this, hs.E0);
        hs.f(i3).c(this, hs.O3);
        this.H.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.a;
        hs.f(i3).n(this, hs.E0);
        hs.f(i3).n(this, hs.O3);
        this.H.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int w02 = org.telegram.ui.ActionBar.k6.i1(e6Var) ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Fa, e6Var) : -1;
        int i3 = this.J;
        Drawable drawable = this.I;
        if (i3 != w02) {
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
        if (e6Var != null) {
            e6Var.b(x10, f12, measuredWidth, i10);
        } else {
            org.telegram.ui.ActionBar.k6.r(x10, f12, measuredWidth, i10);
        }
        float f13 = 16.0f;
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var));
        if (e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", e6Var));
        }
        float f14 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z10 = com.google.android.recaptcha.internal.a.z(getHeight(), this.L, 2.0f, 0.0f);
        float f15 = 14.0f;
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float L = z10 + org.telegram.messenger.g0.L(14.0f);
        ly0 ly0Var = this.d;
        float f16 = 32.0f;
        ly0Var.p = this.M - org.telegram.messenger.g0.L(32.0f);
        ly0Var.c(width - (this.d.k() / 2.0f), this.d.i() / 2.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, this.d.i() + org.telegram.messenger.g0.L(3.0f));
        float i11 = L + this.d.i() + org.telegram.messenger.g0.L(3.0f);
        ly0 ly0Var2 = this.e;
        ly0Var2.p = this.M - org.telegram.messenger.g0.L(32.0f);
        ly0Var2.c(width - (this.e.k() / 2.0f), this.e.i() / 2.0f, 0.7f, w02, canvas);
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
            float L2 = (width - (this.M / f11)) + org.telegram.messenger.g0.L(f13) + this.s;
            float f18 = i12;
            ly0 ly0Var3 = qaVar.a;
            float f19 = f13;
            boolean z11 = qaVar.c;
            float f20 = f15;
            RectF rectF2 = qaVar.d;
            float f21 = f16;
            float f22 = L2 - ly0Var3.c;
            float L3 = (width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f);
            ly0Var3.p = (L3 - f22) - org.telegram.messenger.g0.L(7.66f);
            int i14 = i13;
            ly0Var3.c(f22, ly0Var3.i() / f17, 0.7f, w02, canvas);
            float L4 = (width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f);
            float L5 = (width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f) + qaVar.b.c;
            org.telegram.ui.Components.w8 w8Var = this.H;
            rectF2.set(L4, f18, L5 + (z11 ? w8Var.A + (drawable.getIntrinsicWidth() * 0.8f) + org.telegram.messenger.g0.L(5.0f) : 0.0f), qaVar.b.i() + f18);
            if (this.n == qaVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-org.telegram.messenger.g0.L(4.0f), -org.telegram.messenger.g0.L(f17));
                float a11 = this.G.a(0.025f);
                f10 = 4.0f;
                canvas.scale(a11, a11, rectF3.centerX(), qaVar.b.i() / f17);
                y yVar = this.F;
                if (yVar != null) {
                    yVar.setBounds((int) rectF3.left, (int) (rectF3.top - f18), (int) rectF3.right, (int) (rectF3.bottom - f18));
                    yVar.draw(canvas);
                }
            } else {
                f10 = 4.0f;
            }
            ly0 ly0Var4 = qaVar.b;
            ly0Var4.p = (((this.M / f17) + width) - org.telegram.messenger.g0.L(8.0f)) - L3;
            ly0Var4.c(L3, qaVar.b.i() / f17, 1.0f, w02, canvas);
            if (z11) {
                canvas.save();
                canvas.translate((width - (this.M / f17)) + org.telegram.messenger.g0.L(f19) + this.s + org.telegram.messenger.g0.L(7.66f) + qaVar.b.c + org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(1.0f));
                w8Var.g(canvas);
                canvas.translate(w8Var.A + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(13.0f) / f17);
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
            ly0 ly0Var5 = this.f;
            if (ly0Var5.f > 1) {
                ly0Var5.c(width - (ly0Var5.k() / f23), 0.0f, 0.7f, w02, canvas);
            } else {
                ly0Var5.p = this.M - org.telegram.messenger.g0.L(f24);
                ly0Var5.c(width - (this.f.k() / f23), this.f.i() / f23, 0.7f, w02, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.k5.b(16.0f, (int) this.L, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qi qiVar;
        boolean z10 = this.n != null && this.E.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = !z10 && this.x.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        y yVar = this.F;
        gc gcVar = this.G;
        gc gcVar2 = this.y;
        if (action == 0) {
            gcVar2.c(z11);
            gcVar.c(z10);
            yVar.setState(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (gcVar2.i) {
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if ((T instanceof wm) && (qiVar = ((wm) T).p1) != null) {
                    qiVar.e(true, false);
                }
            } else if (gcVar.i) {
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
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
            gcVar.c(false);
            gcVar2.c(false);
            yVar.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            gcVar.c(false);
            gcVar2.c(false);
            yVar.setState(new int[0]);
        }
        return gcVar.i || gcVar2.i;
    }

    public void setAnimating(boolean z10) {
        this.P = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }
}
