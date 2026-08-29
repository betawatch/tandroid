package jh;

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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.iq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class x9 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public final int b;
    public final w9 c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final iq[] h;
    public final iq[] n;
    public ValueAnimator r;

    public x9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = -1L;
        this.h = new iq[1];
        this.n = new iq[1];
        this.b = i10;
        this.a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.b.m(i11, c6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, i7.f6.q(-2, -2, 5));
        w9 w9Var = new w9(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = w9Var;
        w9Var.n = true;
        w9Var.getDrawable().o(false, true, false);
        w9Var.setTypeface(AndroidUtilities.bold());
        w9Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        w9Var.setTextSize(AndroidUtilities.dp(13.0f));
        w9Var.setGravity(5);
        w9Var.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(w9Var, i7.f6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.b;
        s7 y8 = s7.y(i10, false);
        s7 y10 = this.d ? s7.y(i10, true) : null;
        long j10 = 0;
        kf.a i11 = kf.a.i(0L, kf.b.b);
        w9 w9Var = this.c;
        w9Var.a();
        if (this.a == UserConfig.getInstance(i10).getClientUserId()) {
            z11 = !y8.e;
            j10 = y8.p().amount;
            if (y10 != null) {
                z11 |= !y10.e;
                i11 = y10.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = b0.g(i10).h(this.a, false);
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
            ofFloat.addUpdateListener(new bg.q1(this, 16));
            this.r.addListener(new ag.m0(this, 10));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z11) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new d90(AndroidUtilities.dp(48.0f), w9Var), 0, this.e.length(), 33);
            }
            w9Var.c(this.e, z10, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                iq[] iqVarArr = this.n;
                spannableStringBuilder.append((CharSequence) ia.X0(true, str, 0.62f, iqVarArr));
                iq iqVar = iqVarArr[0];
                if (iqVar != null) {
                    iqVar.setColorKey(org.telegram.ui.ActionBar.g6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) ia.X0(false, j7.l1.m(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            w9Var.setText(spannableStringBuilder);
        } else {
            w9Var.setText(LocaleController.formatNumber(j10, ' '));
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        if (this.a != j10) {
            this.a = j10;
            a(true);
        }
    }
}
