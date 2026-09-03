package mh;

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
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class b extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final TextView c;
    public final g90 d;
    public mf.b e;
    public final oq[] f;

    public b(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, i10, mf.b.a, g6Var);
    }

    public final void a() {
        mf.b bVar = this.e;
        int i10 = this.a;
        mf.a s6 = t7.x(i10, bVar).s();
        mf.b bVar2 = this.e;
        mf.b bVar3 = mf.b.a;
        int i11 = 1;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        g90 g90Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(ja.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s6.a(), ',')), 0.6f, null));
            int i12 = org.telegram.ui.ActionBar.k6.Gi;
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
            g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new lh.c3(this, i11)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            return;
        }
        if (bVar2 == mf.b.b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s6.b()));
            oq[] oqVarArr = this.f;
            textView.setText(ja.X0(true, replaceTags, 0.6f, oqVarArr));
            oqVarArr[0].setColorKey(org.telegram.ui.ActionBar.k6.Gi);
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            sb.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s6.c() * 100.0d), "USD", 2));
            int i13 = org.telegram.ui.ActionBar.k6.Hi;
            int v02 = org.telegram.ui.ActionBar.k6.v0(i13, g6Var);
            int i14 = org.telegram.ui.ActionBar.k6.Fi;
            g90Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.k6.v0(i14, g6Var)));
            g90Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.k6.v0(i13, g6Var), org.telegram.ui.ActionBar.k6.v0(i14, g6Var)));
            g90Var.setText(sb);
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

    public b(Context context, int i10, mf.b bVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = new oq[1];
        this.a = i10;
        this.b = g6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Fi, g6Var)));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hi, g6Var));
        textView.setGravity(17);
        addView(textView, k7.c6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        g90 g90Var = new g90(context, g6Var);
        this.d = g90Var;
        g90Var.setTextSize(1, 12.0f);
        g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, g6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        g90Var.setGravity(17);
        addView(g90Var, k7.c6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
