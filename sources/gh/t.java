package gh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import hh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final n9 a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.j6 c;
    public final org.telegram.ui.Components.j6 d;
    public final cq[] e;
    public boolean f;

    public t(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.e = new cq[1];
        setOrientation(0);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.c = j6Var;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        j6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.d = j6Var2;
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.y6, c6Var));
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        n9 n9Var = new n9(context);
        this.a = n9Var;
        org.telegram.ui.Components.j6 j6Var3 = new org.telegram.ui.Components.j6(context, false, false, false);
        this.b = j6Var3;
        j6Var3.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var3.setPadding(AndroidUtilities.dp(20.0f), 0, 0, 0);
        j6Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        j6Var3.setTypeface(AndroidUtilities.bold());
        j6Var3.setGravity(17);
        addView(j6Var3, h7.z5.o(66, -2, 0.0f, 16));
        addView(n9Var, h7.z5.o(32, 32, 0.0f, 16));
        addView(j6Var, h7.z5.o(0, -2, 1.0f, 16));
        addView(j6Var2, h7.z5.p(-2, -2, 0.0f, 16, 0, 0, 20, 0));
    }

    public final void a(long j10, boolean z10) {
        this.d.c(oa.X0(false, i0.a.m((int) j10, ',', new StringBuilder("⭐️")), 0.78f, this.e), z10, true);
    }

    public final void b(int i10, boolean z10, boolean z11) {
        org.telegram.ui.Components.j6 j6Var = this.b;
        if (!z10 || i10 > 3) {
            if (i10 >= 10000) {
                j6Var.setTextSize(AndroidUtilities.dp(12.0f));
            } else if (i10 >= 1000) {
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            } else {
                j6Var.setTextSize(AndroidUtilities.dp(15.0f));
            }
            j6Var.c(Integer.toString(i10), z11, true);
            return;
        }
        if (i10 == 1) {
            j6Var.c(Emoji.replaceWithRestrictedEmoji("🥇", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
        } else if (i10 == 2) {
            j6Var.c(Emoji.replaceWithRestrictedEmoji("🥈", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
        } else if (i10 == 3) {
            j6Var.c(Emoji.replaceWithRestrictedEmoji("🥉", j6Var.getPaint().getFontMetricsInt(), (Runnable) null), z11, true);
        }
    }

    public final void c(TLRPC.User user) {
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        y8Var.r(user);
        n9 n9Var = this.a;
        n9Var.e(user, y8Var);
        n9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
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
            canvas.drawLine(AndroidUtilities.dp(112.0f), getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(16.0f), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.k0);
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
