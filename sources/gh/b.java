package gh;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final TextView c;
    public final l80 d;
    public gf.b e;
    public final eq[] f;

    public b(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, i9, gf.b.a, b6Var);
    }

    public final void a() {
        gf.b bVar = this.e;
        int i9 = this.a;
        gf.a s10 = v7.x(i9, bVar).s();
        gf.b bVar2 = this.e;
        gf.b bVar3 = gf.b.a;
        TextView textView = this.c;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        l80 l80Var = this.d;
        if (bVar2 == bVar3) {
            textView.setText(oa.X0(false, LocaleController.formatString(R.string.Gift2MessageStarsInfo, LocaleController.formatNumber(s10.a(), ',')), 0.6f, null));
            int i10 = org.telegram.ui.ActionBar.f6.Gi;
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
            l80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new fh.o1(this, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            return;
        }
        if (bVar2 == gf.b.b) {
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2MessageStarsInfoTON, s10.b()));
            eq[] eqVarArr = this.f;
            textView.setText(oa.X0(true, replaceTags, 0.6f, eqVarArr));
            eqVarArr[0].setColorKey(org.telegram.ui.ActionBar.f6.Gi);
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            sb2.append(BillingController.getInstance().formatCurrency((long) (MessagesController.getInstance(i9).config.tonUsdRate.get() * s10.c() * 100.0d), "USD", 2));
            int i11 = org.telegram.ui.ActionBar.f6.Hi;
            int v02 = org.telegram.ui.ActionBar.f6.v0(i11, b6Var);
            int i12 = org.telegram.ui.ActionBar.f6.Fi;
            l80Var.setTextColor(i0.a.d(0.33f, v02, org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
            l80Var.setLinkTextColor(i0.a.d(0.33f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var), org.telegram.ui.ActionBar.f6.v0(i12, b6Var)));
            l80Var.setText(sb2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starBalanceUpdated) {
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
        int i9 = this.a;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.botStarsUpdated);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starBalanceUpdated);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.botStarsUpdated);
    }

    public b(Context context, int i9, gf.b bVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f = new eq[1];
        this.a = i9;
        this.b = b6Var;
        this.e = bVar;
        setOrientation(1);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(9.0f));
        setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Fi, b6Var)));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var));
        textView.setGravity(17);
        addView(textView, g7.e6.p(-2, -2, 0.0f, 17, 0, 0, 0, 0));
        l80 l80Var = new l80(context, b6Var);
        this.d = l80Var;
        l80Var.setTextSize(1, 12.0f);
        l80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2MessageStarsInfoLink), new a(context, b6Var)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        l80Var.setGravity(17);
        addView(l80Var, g7.e6.p(-2, -2, 0.0f, 17, 0, 1, 0, 0));
        a();
    }
}
