package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e80;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class bb extends LinearLayout implements is {
    public long a;
    public final int b;
    public final ab c;
    public SpannableString d;
    public long e;
    public ValueAnimator f;

    public bb(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = -1L;
        this.b = i7;
        this.a = m10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(textView, i10, e6Var);
        i5.c.w(textView, 1, 13.0f, null, 2131745155);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ja.r(-2, -2, 5));
        ab abVar = new ab(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = abVar;
        abVar.n = true;
        abVar.getDrawable().r(false, true);
        abVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.Y(abVar, i10, e6Var);
        abVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        abVar.setGravity(5);
        abVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(abVar, c8.ja.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z10) {
        long j3;
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.b;
        v8 y10 = v8.y(i7, false);
        ab abVar = this.c;
        abVar.a();
        if (this.a == m10.i(i7).e()) {
            z11 = !y10.e;
            j3 = y10.p().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = e0.g(i7).h(this.a, false);
            boolean z12 = h == null || h.status == null;
            j3 = (h == null || (tL_starsRevenueStatus = h.status) == null) ? 0L : tL_starsRevenueStatus.current_balance.amount;
            z11 = z12;
        }
        long j10 = this.e;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 10));
            this.f.addListener(new ai.i0(this, 7));
            this.f.setDuration(320L);
            this.f.setInterpolator(new OvershootInterpolator());
            this.f.start();
        }
        if (!z11) {
            abVar.setText(hd.E(j3, ' '));
            this.e = j3;
            return;
        }
        if (this.d == null) {
            SpannableString spannableString = new SpannableString("x");
            this.d = spannableString;
            spannableString.setSpan(new e80(org.telegram.messenger.g0.L(48.0f), abVar), 0, this.d.length(), 33);
        }
        abVar.c(this.d, z10, true);
        this.e = -1L;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.y3) {
            a(true);
        } else if (i7 == ns.C3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.b;
        ns.f(i7).c(this, ns.y3);
        ns.f(i7).c(this, ns.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.b;
        ns.f(i7).n(this, ns.y3);
        ns.f(i7).n(this, ns.C3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        if (this.a != j3) {
            this.a = j3;
            a(true);
        }
    }
}
