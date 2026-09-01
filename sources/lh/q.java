package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final p9 a;
    public final k6 b;
    public final k6 c;
    public final k6 d;
    public final oq[] e;
    public boolean f;

    public q(Context context, g6 g6Var) {
        super(context);
        this.e = new oq[1];
        setOrientation(0);
        k6 k6Var = new k6(context, false, false, false);
        this.c = k6Var;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        k6Var.setEllipsizeByGradient(true);
        k6 k6Var2 = new k6(context, false, false, false);
        this.d = k6Var2;
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var));
        k6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        p9 p9Var = new p9(context);
        this.a = p9Var;
        k6 k6Var3 = new k6(context, false, false, false);
        this.b = k6Var3;
        k6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        k6Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        k6Var3.setTypeface(AndroidUtilities.bold());
        k6Var3.setGravity(17);
        addView(k6Var3, k7.c6.o(66, -2, 0.0f, 16));
        addView(p9Var, k7.c6.o(32, 32, 0.0f, 16));
        addView(k6Var, k7.c6.o(0, -2, 1.0f, 16));
        addView(k6Var2, k7.c6.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z4) {
        this.d.c(ja.X0(false, l.d.l((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z4, true);
    }

    public final void b(int i10, boolean z4, boolean z10) {
        k6 k6Var = this.b;
        if (!z4 || i10 > 3) {
            if (i10 >= 10000) {
                k6Var.setTextSize(AndroidUtilities.dp(12.0f));
            } else if (i10 >= 1000) {
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                k6Var.setTextSize(AndroidUtilities.dp(15.0f));
            }
            k6Var.c(Integer.toString(i10), z10, true);
            return;
        }
        if (i10 == 1) {
            k6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", k6Var.getPaint().getFontMetricsInt(), (Runnable) null), z10, true);
        } else if (i10 == 2) {
            k6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", k6Var.getPaint().getFontMetricsInt(), (Runnable) null), z10, true);
        } else if (i10 == 3) {
            k6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", k6Var.getPaint().getFontMetricsInt(), (Runnable) null), z10, true);
        }
    }

    public final void c(TLRPC.User user) {
        z8 z8Var = new z8((g6) null);
        z8Var.r(user);
        p9 p9Var = this.a;
        p9Var.e(user, z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        this.c.setText(UserObject.getUserName(user));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        this.b.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
    }
}
