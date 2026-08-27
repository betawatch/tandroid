package hh;

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
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final TextView c;
    public final p80 d;
    public hf.b e;
    public final cq[] f;

    public b(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, i10, hf.b.a, c6Var);
    }

    public final void a() {
        hf.b bVar = this.e;
        int i10 = this.a;
        hf.a s10 = u7.x(i10, bVar).s();
        hf.b bVar2 = this.e;
        hf.b bVar3 = hf.b.a;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        p80 p80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(oa.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i11 = org.telegram.ui.ActionBar.g6.Gi;
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new f2.r(this, 15)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            return;
        }
        if (bVar2 == hf.b.b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            cq[] cqVarArr = this.f;
            textView.setText(oa.X0(true, replaceTags, 0.6f, cqVarArr));
            cqVarArr[0].setColorKey(org.telegram.ui.ActionBar.g6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i10).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i12 = org.telegram.ui.ActionBar.g6.Hi;
            int v02 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
            int i13 = org.telegram.ui.ActionBar.g6.Fi;
            p80Var.setTextColor(i0.b.d(0.33f, v02, org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            p80Var.setLinkTextColor(i0.b.d(0.33f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var), org.telegram.ui.ActionBar.g6.v0(i13, c6Var)));
            p80Var.setText(sb2);
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

    public b(Context context, int i10, hf.b bVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = new cq[1];
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
        addView(textView, h7.z5.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        p80 p80Var = new p80(context, c6Var);
        this.d = p80Var;
        p80Var.setTextSize(1, 12.0f);
        p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, c6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        p80Var.setGravity(17);
        addView(p80Var, h7.z5.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
