package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sc extends LinearLayout implements ls {
    public long a;
    public final int b;
    public final rc c;
    public SpannableString d;
    public long e;
    public ValueAnimator f;

    public sc(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.e = -1L;
        this.b = i7;
        this.a = p10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        jg.g.v(textView, 1, 13.0f, null, 2131745155);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.r(-2, -2, 5));
        rc rcVar = new rc(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = rcVar;
        rcVar.n = true;
        rcVar.getDrawable().r(false, true);
        rcVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(rcVar, i10, h6Var);
        rcVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        rcVar.setGravity(5);
        rcVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(rcVar, c8.ha.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z9) {
        long j3;
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.b;
        ea y10 = ea.y(i7, false);
        rc rcVar = this.c;
        rcVar.a();
        int i10 = 1;
        if (this.a == p10.i(i7).e()) {
            z10 = !y10.e;
            j3 = y10.p().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = n0.g(i7).h(this.a, false);
            boolean z11 = h == null || h.status == null;
            j3 = (h == null || (tL_starsRevenueStatus = h.status) == null) ? 0L : tL_starsRevenueStatus.current_balance.amount;
            z10 = z11;
        }
        long j10 = this.e;
        if (j3 > j10 && j10 != -1) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 8));
            this.f.addListener(new t5(this, i10));
            this.f.setDuration(320L);
            this.f.setInterpolator(new OvershootInterpolator());
            this.f.start();
        }
        if (!z10) {
            rcVar.setText(org.telegram.messenger.id.E(j3, ' '));
            this.e = j3;
            return;
        }
        if (this.d == null) {
            SpannableString spannableString = new SpannableString("x");
            this.d = spannableString;
            spannableString.setSpan(new b80(org.telegram.messenger.g0.L(48.0f), rcVar), 0, this.d.length(), 33);
        }
        rcVar.c(this.d, z9, true);
        this.e = -1L;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y3) {
            a(true);
        } else if (i7 == qs.C3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.b;
        qs.f(i7).c(this, qs.y3);
        qs.f(i7).c(this, qs.C3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.b;
        qs.f(i7).n(this, qs.y3);
        qs.f(i7).n(this, qs.C3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        if (this.a != j3) {
            this.a = j3;
            a(true);
        }
    }
}
