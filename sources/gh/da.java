package gh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class da extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public long a;
    public final int b;
    public final ca c;
    public boolean d;
    public SpannableString e;
    public long f;
    public final eq[] h;
    public final eq[] n;
    public ValueAnimator r;

    public da(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f = -1L;
        this.h = new eq[1];
        this.n = new eq[1];
        this.b = i9;
        this.a = UserConfig.getInstance(i9).getClientUserId();
        setOrientation(1);
        setGravity(21);
        TextView textView = new TextView(context);
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        ll.n(i10, b6Var, textView, 1, 13.0f);
        textView.setText(LocaleController.getString(R.string.StarsBalance));
        textView.setGravity(5);
        textView.setTypeface(AndroidUtilities.bold());
        addView(textView, g7.e6.q(-2, -2, 5));
        ca caVar = new ca(this, context, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        this.c = caVar;
        caVar.n = true;
        caVar.getDrawable().o(false, true, false);
        caVar.setTypeface(AndroidUtilities.bold());
        caVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        caVar.setTextSize(AndroidUtilities.dp(13.0f));
        caVar.setGravity(5);
        caVar.setPadding(AndroidUtilities.dp(19.0f), 0, 0, 0);
        addView(caVar, g7.e6.t(-2, 20, 5, 0, -2, 0, 0));
        a(false);
        setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(4.0f));
    }

    public final void a(boolean z10) {
        boolean z11;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        int i9 = this.b;
        v7 y10 = v7.y(i9, false);
        v7 y11 = this.d ? v7.y(i9, true) : null;
        long j10 = 0;
        gf.a i10 = gf.a.i(0L, gf.b.b);
        ca caVar = this.c;
        caVar.a();
        if (this.a == UserConfig.getInstance(i9).getClientUserId()) {
            z11 = !y10.e;
            j10 = y10.p().amount;
            if (y11 != null) {
                z11 |= !y11.e;
                i10 = y11.s();
            }
        } else {
            TLRPC.TL_payments_starsRevenueStats h = c0.g(i9).h(this.a, false);
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
            ofFloat.addUpdateListener(new bg.b(this, 7));
            this.r.addListener(new ag.e(this, 5));
            this.r.setDuration(320L);
            this.r.setInterpolator(new OvershootInterpolator());
            this.r.start();
        }
        if (z11) {
            if (this.e == null) {
                SpannableString spannableString = new SpannableString("x");
                this.e = spannableString;
                spannableString.setSpan(new q80(AndroidUtilities.dp(48.0f), caVar), 0, this.e.length(), 33);
            }
            caVar.c(this.e, z10, true);
            this.f = -1L;
            return;
        }
        if (this.d) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!i10.k()) {
                String str = "⭐️" + i10.d();
                eq[] eqVarArr = this.n;
                spannableStringBuilder.append((CharSequence) oa.X0(true, str, 0.62f, eqVarArr));
                eq eqVar = eqVarArr[0];
                if (eqVar != null) {
                    eqVar.setColorKey(org.telegram.ui.ActionBar.f6.il);
                }
                spannableStringBuilder.append((CharSequence) "  ");
            }
            spannableStringBuilder.append((CharSequence) oa.X0(false, j3.r0.n(j10, ' ', new StringBuilder("⭐️")), 0.62f, this.h));
            caVar.setText(spannableStringBuilder);
        } else {
            caVar.setText(LocaleController.formatNumber(j10, ' '));
        }
        this.f = j10;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starBalanceUpdated) {
            a(true);
        } else if (i9 == NotificationCenter.botStarsUpdated && ((Long) objArr[0]).longValue() == this.a) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        int i9 = this.b;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.b;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        if (this.a != j10) {
            this.a = j10;
            a(true);
        }
    }
}
