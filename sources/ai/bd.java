package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class bd extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public final int b;
    public final ad c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final xq[] h;
    public final xq[] n;
    public ValueAnimator r;

    public bd(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = -1L;
        this.h = new xq[1];
        this.n = new xq[1];
        this.b = i10;
        this.a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(textView, i11, g6Var);
        textView.setTextSize(1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, w7.z5.q(-2, -2, 5));
        ad adVar = new ad(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = adVar;
        adVar.n = true;
        adVar.getDrawable().r(false, true);
        adVar.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(adVar, i11, g6Var);
        adVar.setTextSize(AndroidUtilities.dp(13.0f));
        adVar.setGravity(5);
        adVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(adVar, w7.z5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.b;
        ha y3 = ha.y(i10, false);
        ha y10 = this.d ? ha.y(i10, true) : null;
        long j10 = 0;
        ag.a i11 = ag.a.i(0L, ag.b.b);
        ad adVar = this.c;
        adVar.a();
        if (this.a == UserConfig.getInstance(i10).getClientUserId()) {
            z11 = !y3.e;
            j10 = y3.p().amount;
            if (y10 != null) {
                z11 |= !y10.e;
                i11 = y10.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = k0.g(i10).h(this.a, false);
            boolean z12 = h == null || h.status == null;
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z11 = z12;
        }
        long j11 = this.f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 6));
            this.r.addListener(new ah.b(this, 4));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z11) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new da0(AndroidUtilities.dp(48.0f), adVar), 0, this.e.length(), 33);
            }
            adVar.c(this.e, z10, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                xq[] xqVarArr = this.n;
                spannableStringBuilder.append((CharSequence) nd.Y0(true, str, 0.62f, xqVarArr));
                xq xqVar = xqVarArr[0];
                if (xqVar != null) {
                    xqVar.setColorKey(org.telegram.ui.ActionBar.k6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) nd.Y0(false, i2.o1.m(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            adVar.setText(spannableStringBuilder);
        } else {
            adVar.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f = j10;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i10 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        if (this.a != j10) {
            this.a = j10;
            a(true);
        }
    }
}
