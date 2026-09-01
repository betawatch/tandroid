package mh;

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
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y9 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public final int b;
    public final x9 c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final oq[] h;
    public final oq[] n;
    public ValueAnimator r;

    public y9(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = -1L;
        this.h = new oq[1];
        this.n = new oq[1];
        this.b = i10;
        this.a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.b.l(i11, g6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, k7.c6.q(-2, -2, 5));
        x9 x9Var = new x9(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = x9Var;
        x9Var.n = true;
        x9Var.getDrawable().o(false, true, false);
        x9Var.setTypeface(AndroidUtilities.bold());
        x9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        x9Var.setTextSize(AndroidUtilities.dp(13.0f));
        x9Var.setGravity(5);
        x9Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(x9Var, k7.c6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z4) {
        boolean z10;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.b;
        t7 y10 = t7.y(i10, false);
        t7 y11 = this.d ? t7.y(i10, true) : null;
        long j10 = 0;
        mf.a i11 = mf.a.i(0L, mf.b.b);
        x9 x9Var = this.c;
        x9Var.a();
        if (this.a == UserConfig.getInstance(i10).getClientUserId()) {
            z10 = !y10.e;
            j10 = y10.p().amount;
            if (y11 != null) {
                z10 |= !y11.e;
                i11 = y11.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = a0.g(i10).h(this.a, false);
            boolean z11 = h == null || h.status == null;
            if (h != null && (tL_starsRevenueStatus = h.status) != null) {
                j10 = tL_starsRevenueStatus.current_balance.amount;
            }
            z10 = z11;
        }
        long j11 = this.f;
        if (j10 > j11 && j11 != -1) {
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
            this.r = ofFloat;
            ofFloat.addUpdateListener(new eg.m1(this, 16));
            this.r.addListener(new dg.l0(this, 11));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z10) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new l90(AndroidUtilities.dp(48.0f), x9Var), 0, this.e.length(), 33);
            }
            x9Var.c(this.e, z4, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                oq[] oqVarArr = this.n;
                spannableStringBuilder.append((CharSequence) ja.X0(true, str, 0.62f, oqVarArr));
                oq oqVar = oqVarArr[0];
                if (oqVar != null) {
                    oqVar.setColorKey(org.telegram.ui.ActionBar.k6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) ja.X0(false, l.d.l(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            x9Var.setText(spannableStringBuilder);
        } else {
            x9Var.setText(LocaleController.formatNumber(j10, ' '));
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
