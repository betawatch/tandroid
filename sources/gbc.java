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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gbc extends View implements fn7 {
    public static final /* synthetic */ int Q = 0;
    public final RectF E;
    public final hf0 F;
    public final v41 G;
    public final ic0 H;
    public final Drawable I;
    public int J;
    public yb7 K;
    public float L;
    public float M;
    public float N;
    public int O;
    public boolean P;
    public final int a;
    public final vnb b;
    public long c;
    public pkb d;
    public pkb e;
    public pkb f;
    public final ArrayList h;
    public fbc n;
    public float r;
    public float s;
    public float w;
    public final RectF x;
    public final v41 y;

    public gbc(int i, vnb vnbVar, Context context) {
        super(context);
        this.h = new ArrayList();
        this.x = new RectF();
        this.y = new v41(this);
        this.E = new RectF();
        this.G = new v41(this);
        ic0 ic0Var = new ic0(this, false);
        this.H = ic0Var;
        this.J = -1;
        this.a = i;
        this.b = vnbVar;
        hf0 Y = aob.Y(822083583, 8, 8);
        this.F = Y;
        Y.setCallback(this);
        ic0Var.p = hl.L(50.0f);
        ic0Var.o = hl.L(13.0f);
        ic0Var.x = false;
        ic0Var.s = hl.L(13.0f);
        ic0Var.h(hl.L(18.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_mini_forumarrow).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final fbc a(CharSequence charSequence, String str, boolean z) {
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            this.L += hl.L(7.0f);
        }
        fbc fbcVar = new fbc(charSequence, str, z);
        arrayList.add(fbcVar);
        this.L += hl.L(14.0f);
        this.s = Math.max(this.s, fbcVar.a.c);
        this.w = Math.max(this.w, fbcVar.b.c + (z ? hl.L(38.0f) : 0));
        return fbcVar;
    }

    public final void b(long j, TLRPC.PeerSettings peerSettings) {
        TLRPC.User X1;
        TLRPC.UserFull Y1;
        float f;
        TL_bots.BotVerification botVerification;
        this.c = j;
        this.M = 0.0f;
        this.L = 0.0f;
        this.s = 0.0f;
        this.w = 0.0f;
        this.h.clear();
        int i = (int) (hl.q.x * 0.95f);
        this.L += hl.L(14.0f);
        pkb pkbVar = new pkb(wf3.k(yac.t0, j), 14.0f, hl.o());
        this.d = pkbVar;
        this.L = pkbVar.h() + hl.L(3.0f) + this.L;
        int i2 = this.a;
        pkb pkbVar2 = new pkb(ob6.M0(lv2.r(i2).x(j) ? 2131751766 : 2131751765, null), 14.0f, null);
        this.e = pkbVar2;
        this.L = pkbVar2.h() + hl.L(11.0f) + this.L;
        if (peerSettings != null && peerSettings.phone_country != null) {
            String M0 = ob6.M0(2131751762, null);
            String str = peerSettings.phone_country;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String E0 = ob6.E0(str);
            if (!TextUtils.isEmpty(E0)) {
                spannableStringBuilder.append((CharSequence) E0).append((CharSequence) " ");
            }
            String i0 = ob6.i0(2131751761, str);
            if (TextUtils.isEmpty(i0)) {
                spannableStringBuilder.append((CharSequence) str);
            } else {
                spannableStringBuilder.append((CharSequence) i0);
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(hl.L(12.0f));
            a(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), true, null, 0), M0, false);
        }
        if (peerSettings != null && peerSettings.registration_month != null) {
            String M02 = ob6.M0(2131751760, null);
            String str2 = peerSettings.registration_month;
            String[] split = str2.split("\\.");
            if (split.length == 2) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                Calendar calendar = Calendar.getInstance();
                calendar.set(parseInt2, parseInt - 1, 1, 0, 0, 0);
                calendar.set(14, 0);
                str2 = ob6.e0(calendar.getTimeInMillis() / 1000, true);
            }
            a(str2, M02, false);
        }
        if (j < 0) {
            X1 = null;
            Y1 = null;
        } else {
            X1 = uc7.s1(i2).X1(Long.valueOf(j));
            Y1 = uc7.s1(i2).Y1(j);
        }
        if (Y1 != null || j <= 0) {
            f = 14.0f;
        } else {
            f = 14.0f;
            uc7.s1(i2).o3(0, uc7.s1(i2).X1(Long.valueOf(j)), true);
        }
        if (Y1 != null) {
            yb7 P0 = uc7.s1(i2).P0(j);
            this.K = P0;
            int max = Math.max(Y1.common_chats_count, P0.g);
            if (max > 0) {
                this.n = a(ob6.G(max, "Groups", new Object[0]), ob6.M0(2131751767, null), true);
                int min = Math.min(3, this.K.e.size());
                ic0 ic0Var = this.H;
                ic0Var.i(min);
                for (int i3 = 0; i3 < Math.min(3, this.K.e.size()); i3++) {
                    ic0Var.j(i3, i2, (TLObject) this.K.e.get(i3));
                }
                ic0Var.a(true, true);
            } else {
                this.K = null;
                this.n = null;
            }
        } else {
            this.K = null;
            this.n = null;
        }
        this.r = this.s + hl.L(7.66f) + this.w;
        if (X1 == null || X1.verified || lbc.C(X1.id)) {
            this.f = null;
            this.L += hl.L(f);
        } else if (X1.bot_verification_icon == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("i  ");
            wm2 wm2Var = new wm2(R.drawable.filled_info, 0);
            wm2Var.I = 0.55f;
            wm2Var.J = -0.55f;
            float L = hl.L(1.0f);
            float L2 = hl.L(-1.0f);
            wm2Var.r = L;
            wm2Var.s = L2;
            spannableStringBuilder2.setSpan(wm2Var, 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131751763, null));
            this.f = new pkb(spannableStringBuilder2, 12.0f, null);
            this.L = this.f.h() + hl.L(12.0f) + hl.L(15.33f) + this.L;
        } else if (Y1 == null || (botVerification = Y1.bot_verification) == null) {
            this.f = null;
            this.L += hl.L(f);
        } else {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("i  ");
            this.f = new pkb(spannableStringBuilder3, 12.0f, null);
            spannableStringBuilder3.setSpan(new hm(botVerification.icon, this.f.a.getFontMetricsInt()), 0, 1, 33);
            spannableStringBuilder3.append(r47.h0(botVerification.description, false));
            pkb pkbVar3 = new pkb(spannableStringBuilder3, 12.0f, null);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            pkbVar3.a();
            pkbVar3.l(5);
            Point point = hl.q;
            pkbVar3.o(Math.min(point.x, point.y) * 0.5f);
            pkbVar3.q(this);
            this.f = pkbVar3;
            this.L = this.f.h() + hl.L(12.0f) + hl.L(15.33f) + this.L;
        }
        float max2 = Math.max(this.M, this.d.j());
        this.M = max2;
        float max3 = Math.max(max2, this.e.j());
        this.M = max3;
        float max4 = Math.max(max3, this.r);
        this.M = max4;
        this.M = Math.min(max4 + hl.L(32.0f), i);
    }

    public final void c(float f, int i) {
        if (Math.abs(this.N - f) > 0.01f || i != this.O) {
            invalidate();
        }
        this.O = i;
        this.N = f;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.E0;
        int i4 = this.a;
        if (i == i3) {
            long longValue = ((Long) objArr[0]).longValue();
            long j = this.c;
            if (longValue == j) {
                b(j, uc7.s1(i4).B1(this.c));
                return;
            }
            return;
        }
        if (i == jn7.R3 && ((Long) objArr[0]).longValue() == this.c) {
            yb7 P0 = uc7.s1(i4).P0(this.c);
            this.K = P0;
            int i5 = P0.g;
            fbc fbcVar = this.n;
            if (fbcVar == null || i5 <= 0) {
                b(this.c, uc7.s1(i4).B1(this.c));
                requestLayout();
            } else {
                fbcVar.b = new pkb(ob6.G(i5, "Groups", new Object[0]), 12.0f, hl.o());
                int min = Math.min(3, this.K.e.size());
                ic0 ic0Var = this.H;
                ic0Var.i(min);
                for (int i6 = 0; i6 < Math.min(3, this.K.e.size()); i6++) {
                    ic0Var.j(i6, i4, (TLObject) this.K.e.get(i6));
                }
                ic0Var.a(true, true);
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        jn7.f(i).b(this, jn7.E0);
        jn7.f(i).b(this, jn7.R3);
        this.H.e();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        jn7.f(i).n(this, jn7.E0);
        jn7.f(i).n(this, jn7.R3);
        this.H.f();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        vnb vnbVar = this.b;
        int v0 = aob.g1(vnbVar) ? aob.v0(aob.Fa, vnbVar) : -1;
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
        if (vnbVar != null) {
            vnbVar.b(x, f3, measuredWidth, i2);
        } else {
            aob.q(x, f3, measuredWidth, i2);
        }
        float f4 = 16.0f;
        canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.U0("paintChatActionBackground", vnbVar));
        if (vnbVar != null ? vnbVar.g() : aob.b1()) {
            canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), aob.U0("paintChatActionBackgroundDarken", vnbVar));
        }
        float f5 = 0.0f;
        canvas.translate(0.0f, (getHeight() - this.L) / 2.0f);
        float z = bp1.z(getHeight(), this.L, 2.0f, 0.0f);
        float f6 = 14.0f;
        canvas.translate(0.0f, hl.L(14.0f));
        float L = z + hl.L(14.0f);
        pkb pkbVar = this.d;
        float f7 = 32.0f;
        pkbVar.p = this.M - hl.L(32.0f);
        pkbVar.c(width - (this.d.j() / 2.0f), this.d.h() / 2.0f, 1.0f, v0, canvas);
        canvas.translate(0.0f, this.d.h() + hl.L(3.0f));
        float h = L + this.d.h() + hl.L(3.0f);
        pkb pkbVar2 = this.e;
        pkbVar2.p = this.M - hl.L(32.0f);
        pkbVar2.c(width - (this.e.j() / 2.0f), this.e.h() / 2.0f, 0.7f, v0, canvas);
        canvas.translate(0.0f, this.e.h() + hl.L(11.0f));
        float h2 = this.e.h() + hl.L(11.0f) + h;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (i3 > 0) {
                canvas.translate(f5, hl.L(7.0f));
                h2 += hl.L(7.0f);
            }
            canvas.save();
            fbc fbcVar = (fbc) arrayList.get(i3);
            float f8 = f2;
            float L2 = (width - (this.M / f2)) + hl.L(f4) + this.s;
            float f9 = h2;
            pkb pkbVar3 = fbcVar.a;
            float f10 = f4;
            boolean z2 = fbcVar.c;
            float f11 = f6;
            RectF rectF2 = fbcVar.d;
            float f12 = f7;
            float f13 = L2 - pkbVar3.c;
            float L3 = (width - (this.M / f8)) + hl.L(f10) + this.s + hl.L(7.66f);
            pkbVar3.p = (L3 - f13) - hl.L(7.66f);
            int i4 = i3;
            pkbVar3.c(f13, pkbVar3.h() / f8, 0.7f, v0, canvas);
            float L4 = (width - (this.M / f8)) + hl.L(f10) + this.s + hl.L(7.66f);
            float L5 = (width - (this.M / f8)) + hl.L(f10) + this.s + hl.L(7.66f) + fbcVar.b.c;
            ic0 ic0Var = this.H;
            rectF2.set(L4, f9, L5 + (z2 ? ic0Var.A + (drawable.getIntrinsicWidth() * 0.8f) + hl.L(5.0f) : 0.0f), fbcVar.b.h() + f9);
            if (this.n == fbcVar) {
                RectF rectF3 = this.E;
                rectF3.set(rectF2);
                rectF3.inset(-hl.L(4.0f), -hl.L(f8));
                float a2 = this.G.a(0.025f);
                f = 4.0f;
                canvas.scale(a2, a2, rectF3.centerX(), fbcVar.b.h() / f8);
                hf0 hf0Var = this.F;
                if (hf0Var != null) {
                    hf0Var.setBounds((int) rectF3.left, (int) (rectF3.top - f9), (int) rectF3.right, (int) (rectF3.bottom - f9));
                    hf0Var.draw(canvas);
                }
            } else {
                f = 4.0f;
            }
            pkb pkbVar4 = fbcVar.b;
            pkbVar4.p = (((this.M / f8) + width) - hl.L(8.0f)) - L3;
            pkbVar4.c(L3, fbcVar.b.h() / f8, 1.0f, v0, canvas);
            if (z2) {
                canvas.save();
                canvas.translate((width - (this.M / f8)) + hl.L(f10) + this.s + hl.L(7.66f) + fbcVar.b.c + hl.L(f), hl.L(1.0f));
                ic0Var.g(canvas);
                canvas.translate(ic0Var.A + hl.L(1.0f), hl.L(13.0f) / f8);
                drawable.setBounds(0, (int) (((-drawable.getIntrinsicHeight()) * 0.8f) / f8), (int) (drawable.getIntrinsicWidth() * 0.8f), (int) ((drawable.getIntrinsicHeight() * 0.8f) / f8));
                drawable.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            canvas.translate(0.0f, hl.L(f11));
            h2 = hl.L(f11) + f9;
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
            canvas.translate(0.0f, hl.L(12.0f));
            pkb pkbVar5 = this.f;
            if (pkbVar5.f > 1) {
                pkbVar5.c(width - (pkbVar5.j() / f14), 0.0f, 0.7f, v0, canvas);
            } else {
                pkbVar5.p = this.M - hl.L(f15);
                pkbVar5.c(width - (this.f.j() / f14), this.f.h() / f14, 0.7f, v0, canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), qu6.e(16.0f, (int) this.L, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qq1 qq1Var;
        boolean z = this.n != null && this.E.contains(motionEvent.getX(), motionEvent.getY());
        boolean z2 = !z && this.x.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        hf0 hf0Var = this.F;
        v41 v41Var = this.G;
        v41 v41Var2 = this.y;
        if (action == 0) {
            v41Var2.c(z2);
            v41Var.c(z);
            hf0Var.setState(z ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : new int[0]);
        } else if (motionEvent.getAction() == 1) {
            if (v41Var2.i) {
                e S = LaunchActivity.S();
                if ((S instanceof zu1) && (qq1Var = ((zu1) S).p1) != null) {
                    qq1Var.e(true, false);
                }
            } else if (v41Var.i) {
                e S2 = LaunchActivity.S();
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
            v41Var.c(false);
            v41Var2.c(false);
            hf0Var.setState(new int[0]);
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
            v41Var2.c(false);
            hf0Var.setState(new int[0]);
        }
        return v41Var.i || v41Var2.i;
    }

    public void setAnimating(boolean z) {
        this.P = z;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }
}
