package jh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final TextView c;
    public final y80 d;
    public kf.b e;
    public final iq[] f;

    public b(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, kf.b.a, c6Var);
    }

    public final void a() {
        kf.b bVar = this.e;
        int i10 = this.a;
        kf.a s10 = s7.x(i10, bVar).s();
        kf.b bVar2 = this.e;
        kf.b bVar3 = kf.b.a;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        y80 y80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(ia.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.g6.Gi;
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new cg.m2(this, 29)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            return;
        }
        if (bVar2 == kf.b.b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            iq[] iqVarArr = this.f;
            textView.setText(ia.X0(true, replaceTags, 0.6f, iqVarArr));
            iqVarArr[0].setColorKey(org.telegram.ui.ActionBar.g6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.g6.Hi;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
            int i13 = org.telegram.ui.ActionBar.g6.Fi;
            y80Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            y80Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            y80Var.setText(sb2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return isEnabled() && super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public b(Context context, int i10, kf.b bVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = new iq[1];
        this.a = i10;
        this.b = c6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var)));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        textView.setGravity(17);
        addView(textView, i7.f6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        y80 y80Var = new y80(context, c6Var);
        this.d = y80Var;
        y80Var.setTextSize(1, 12.0f);
        y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, c6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        y80Var.setGravity(17);
        addView(y80Var, i7.f6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
