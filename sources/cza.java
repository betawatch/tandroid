// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cza extends LinearLayout implements fn7 {
    public long a;
    public final int b;
    public final qg2 c;
    public SpannableString d;
    public long e;
    public ValueAnimator f;

    public cza(int i, vnb vnbVar, Context context) {
        super(context);
        this.e = -1L;
        this.b = i;
        this.a = yac.h(i).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        bs2.r(13.0f, 1, 2131744812, textView, null);
        textView.setGravity(5);
        textView.setTypeface(hl.o());
        addView(textView, tre.r(-2, -2, 5));
        qg2 qg2Var = new qg2(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = qg2Var;
        qg2Var.n = true;
        qg2Var.getDrawable().r(false, true);
        qg2Var.setTypeface(hl.o());
        yob.U(qg2Var, i2, vnbVar);
        qg2Var.setTextSize(hl.L(13.0f));
        qg2Var.setGravity(5);
        qg2Var.setPadding(hl.L(19.0f), 0, 0, 0);
        addView(qg2Var, tre.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(hl.L(15.0f), hl.L(4.0f), hl.L(15.0f), hl.L(4.0f));
    }

    public final void a(boolean z) {
        long j;
        boolean z2;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i = this.b;
        jxa v = jxa.v(i, false);
        qg2 qg2Var = this.c;
        qg2Var.a();
        if (this.a == yac.h(i).e()) {
            z2 = !v.e;
            j = v.m().amount;
        } else {
            TLRPC.TL_payments_starsRevenueStats h = kt0.g(i).h(this.a, false);
            boolean z3 = h == null || h.status == null;
            j = (h == null || (tL_starsRevenueStatus = h.status) == null) ? 0L : tL_starsRevenueStatus.current_balance.amount;
            z2 = z3;
        }
        long j2 = this.e;
        if (j > j2 && j2 != -1) {
            ValueAnimator valueAnimator = this.f;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new ija(this, (byte) 8));
            this.f.addListener(new po9(this, (byte) 19));
            this.f.setDuration(320L);
            this.f.setInterpolator(new OvershootInterpolator());
            this.f.start();
        }
        if (!z2) {
            qg2Var.setText(ob6.E(j, ' '));
            this.e = j;
            return;
        }
        if (this.d == null) {
            SpannableString spannableString = new SpannableString("x");
            this.d = spannableString;
            spannableString.setSpan(new ya6(hl.L(48.0f), qg2Var), 0, this.d.length(), 33);
        }
        qg2Var.c(this.d, z, true);
        this.e = -1L;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A3) {
            a(true);
        } else if (i == jn7.E3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i = this.b;
        jn7.f(i).b(this, jn7.A3);
        jn7.f(i).b(this, jn7.E3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.b;
        jn7.f(i).n(this, jn7.A3);
        jn7.f(i).n(this, jn7.E3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j) {
        if (this.a != j) {
            this.a = j;
            a(true);
        }
    }
}
