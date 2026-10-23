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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class bp0 extends FrameLayout {
    public final TextView a;
    public org.telegram.ui.Components.f11 b;
    public final org.telegram.ui.Components.p5 c;
    public final /* synthetic */ cp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp0(cp0 cp0Var, Context context) {
        super(context);
        this.d = cp0Var;
        ip0 ip0Var = cp0Var.p0;
        setBackgroundColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        boolean z10 = ip0Var.a;
        textView.setTextColor(ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
        if (cp0Var.m0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, w7.z5.d(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.p5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        cp0 cp0Var = this.d;
        ip0 ip0Var = cp0Var.p0;
        int i12 = cp0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.r8[i12]);
            }
            if (cp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.n2) ip0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(cp0Var.h)) == null) ? ip0Var.getThemedColor(org.telegram.ui.ActionBar.h6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.h6.s8;
        if (AndroidUtilities.computePerceivedBrightness(ip0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.h6.n6;
            d6Var4 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
            return org.telegram.ui.ActionBar.h6.w0(i14, d6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(ip0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.h6.A8;
            d6Var3 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
            return org.telegram.ui.ActionBar.h6.m1(0.5f, org.telegram.ui.ActionBar.h6.w0(i15, d6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.h6.d6;
        d6Var = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i16, d6Var);
        d6Var2 = ((org.telegram.ui.ActionBar.n2) ip0Var).resourceProvider;
        return org.telegram.ui.ActionBar.h6.v(w02, org.telegram.ui.ActionBar.h6.m1(0.7f, ip0.w0(org.telegram.ui.ActionBar.h6.w0(i13, d6Var2))));
    }

    public final void b(boolean z10) {
        cp0 cp0Var = this.d;
        long j10 = cp0Var.n;
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (j10 != 0) {
            p5Var.j(j10, z10);
            this.b = null;
        } else {
            p5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.f11(LocaleController.getString(cp0Var.p0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.p5 p5Var = this.c;
        p5Var.setBounds(z10 ? AndroidUtilities.dp(21.0f) : (getWidth() - p5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + p5Var.s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.p5 p5Var = this.c;
        p5Var.k(valueOf);
        org.telegram.ui.Components.f11 f11Var = this.b;
        if (f11Var != null) {
            f11Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.h6.q6), canvas);
        } else {
            p5Var.draw(canvas);
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
