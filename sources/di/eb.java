package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class eb extends LinearLayout implements gs {
    public long a;
    public final int b;
    public final db c;
    public SpannableString d;
    public long e;
    public ValueAnimator f;

    public eb(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.e = -1L;
        this.b = i7;
        this.a = k10.i(i7).e();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        i5.c.r(13.0f, 1, 2131744912, textView, null);
        textView.setGravity(5);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ma.r(-2, -2, 5));
        db dbVar = new db(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = dbVar;
        dbVar.n = true;
        dbVar.getDrawable().r(false, true);
        dbVar.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(dbVar, i10, h6Var);
        dbVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
        dbVar.setGravity(5);
        dbVar.setPadding(org.telegram.messenger.g0.L(19.0f), 0, 0, 0);
        addView(dbVar, c8.ma.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(4.0f));
    }

    public final void a(boolean z10) {
        long j3;
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i7 = this.b;
        y8 y10 = y8.y(i7, false);
        db dbVar = this.c;
        dbVar.a();
        if (this.a == k10.i(i7).e()) {
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
            ofFloat.addUpdateListener(new ah.g(this, 10));
            this.f.addListener(new ai.k0(this, 7));
            this.f.setDuration(320L);
            this.f.setInterpolator(new OvershootInterpolator());
            this.f.start();
        }
        if (!z11) {
            dbVar.setText(hd.E(j3, ' '));
            this.e = j3;
            return;
        }
        if (this.d == null) {
            SpannableString spannableString = new SpannableString("x");
            this.d = spannableString;
            spannableString.setSpan(new r80(org.telegram.messenger.g0.L(48.0f), dbVar), 0, this.d.length(), 33);
        }
        dbVar.c(this.d, z10, true);
        this.e = -1L;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.A3) {
            a(true);
        } else if (i7 == ls.E3 && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i7 = this.b;
        ls.f(i7).c(this, ls.A3);
        ls.f(i7).c(this, ls.E3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = this.b;
        ls.f(i7).n(this, ls.A3);
        ls.f(i7).n(this, ls.E3);
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
