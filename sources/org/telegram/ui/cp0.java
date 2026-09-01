package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cp0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.l01 b;
    public final org.telegram.ui.Components.j5 c;
    public final /* synthetic */ dp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(dp0 dp0Var, Context context) {
        super(context);
        this.d = dp0Var;
        ip0 ip0Var = dp0Var.g0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z4 = ip0Var.a;
        textView.setTextColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
        if (dp0Var.d0 == 1) {
            textView.setText(LocaleController.getString(z4 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z4 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, k7.c6.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        dp0 dp0Var = this.d;
        ip0 ip0Var = dp0Var.g0;
        int i12 = dp0Var.n;
        if (i12 >= 0) {
            if (i12 < 7) {
                return ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[i12]);
            }
            if (dp0Var.d0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.p2) ip0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(dp0Var.n)) == null) ? ip0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.k6.s8;
        if (AndroidUtilities.computePerceivedBrightness(ip0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.k6.n6;
            g6Var4 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.v0(i14, g6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(ip0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.k6.A8;
            g6Var3 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.l1(0.5f, org.telegram.ui.ActionBar.k6.v0(i15, g6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        g6Var = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i16, g6Var);
        g6Var2 = ((org.telegram.ui.ActionBar.p2) ip0Var).resourceProvider;
        return org.telegram.ui.ActionBar.k6.v(v02, org.telegram.ui.ActionBar.k6.l1(0.7f, ip0.u0(org.telegram.ui.ActionBar.k6.v0(i13, g6Var2))));
    }

    public final void b(boolean z4) {
        dp0 dp0Var = this.d;
        long j10 = dp0Var.r;
        org.telegram.ui.Components.j5 j5Var = this.c;
        if (j10 != 0) {
            j5Var.j(j10, z4);
            this.b = null;
        } else {
            j5Var.g(null, z4);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.l01(LocaleController.getString(dp0Var.g0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z4 = LocaleController.isRTL;
        org.telegram.ui.Components.j5 j5Var = this.c;
        j5Var.setBounds(z4 ? AndroidUtilities.dp(21.0f) : (getWidth() - j5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + j5Var.s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.j5 j5Var = this.c;
        j5Var.k(valueOf);
        org.telegram.ui.Components.l01 l01Var = this.b;
        if (l01Var != null) {
            l01Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.g0.getThemedColor(org.telegram.ui.ActionBar.k6.q6), canvas);
        } else {
            j5Var.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
