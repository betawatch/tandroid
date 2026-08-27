package hh;

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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.u80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class da extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public final int b;
    public final ca c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final cq[] h;
    public final cq[] n;
    public ValueAnimator r;

    public da(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = -1L;
        this.h = new cq[1];
        this.n = new cq[1];
        this.b = i10;
        this.a = UserConfig.getInstance(i10).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        rl.l(i11, c6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, h7.z5.q(-2, -2, 5));
        ca caVar = new ca(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = caVar;
        caVar.n = true;
        caVar.getDrawable().o(false, true, false);
        caVar.setTypeface(AndroidUtilities.bold());
        caVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        caVar.setTextSize(AndroidUtilities.dp(13.0f));
        caVar.setGravity(5);
        caVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(caVar, h7.z5.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i10 = this.b;
        u7 y10 = u7.y(i10, false);
        u7 y11 = this.d ? u7.y(i10, true) : null;
        long j10 = 0;
        hf.a i11 = hf.a.i(0L, hf.b.b);
        ca caVar = this.c;
        caVar.a();
        if (this.a == UserConfig.getInstance(i10).getClientUserId()) {
            z11 = !y10.e;
            j10 = y10.p().amount;
            if (y11 != null) {
                z11 |= !y11.e;
                i11 = y11.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = c0.g(i10).h(this.a, false);
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
            ofFloat.addUpdateListener(new ag.u(this, 10));
            this.r.addListener(new ag.r1(this, 7));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z11) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new u80(AndroidUtilities.dp(48.0f), caVar), 0, this.e.length(), 33);
            }
            caVar.c(this.e, z10, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i11.k()) {
                String str = "⭐️" + i11.d();
                cq[] cqVarArr = this.n;
                spannableStringBuilder.append((CharSequence) oa.X0(true, str, 0.62f, cqVarArr));
                cq cqVar = cqVarArr[0];
                if (cqVar != null) {
                    cqVar.setColorKey(org.telegram.ui.ActionBar.g6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) oa.X0(false, i0.a.m(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            caVar.setText(spannableStringBuilder);
        } else {
            caVar.setText(LocaleController.formatNumber(j10, ' '));
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
