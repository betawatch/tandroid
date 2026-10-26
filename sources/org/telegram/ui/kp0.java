package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kp0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView a;
    public org.telegram.ui.Components.q11 b;
    public final org.telegram.ui.Components.r5 c;
    public final /* synthetic */ lp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(lp0 lp0Var, Context context) {
        super(context);
        this.d = lp0Var;
        int i10 = org.telegram.ui.ActionBar.y6.d6;
        rp0 rp0Var = lp0Var.p0;
        org.telegram.ui.ActionBar.f7.i(i10, this, rp0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        boolean z10 = rp0Var.a;
        org.telegram.ui.ActionBar.f7.V(textView, i11, rp0Var.getResourceProvider());
        if (lp0Var.m0 == 1) {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelReplyIcon : R.string.UserReplyIcon));
        } else {
            textView.setText(LocaleController.getString(z10 ? R.string.ChannelProfileIcon : R.string.UserProfileIcon));
        }
        addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, 20.0f, 0.0f, 20.0f, 0.0f));
        this.c = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), 13, this, false);
    }

    public final int a() {
        int i10;
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor color;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        lp0 lp0Var = this.d;
        rp0 rp0Var = lp0Var.p0;
        int i12 = lp0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.r8[i12]);
            }
            if (lp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.r2) rp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(lp0Var.h)) == null) ? rp0Var.getThemedColor(org.telegram.ui.ActionBar.y6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.y6.s8;
        if (AndroidUtilities.computePerceivedBrightness(rp0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.y6.n6;
            u6Var4 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
            return org.telegram.ui.ActionBar.y6.w0(i14, u6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(rp0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.y6.A8;
            u6Var3 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
            return org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(i15, u6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.y6.d6;
        u6Var = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i16, u6Var);
        u6Var2 = ((org.telegram.ui.ActionBar.r2) rp0Var).resourceProvider;
        return org.telegram.ui.ActionBar.y6.v(w02, org.telegram.ui.ActionBar.y6.o1(0.7f, rp0.x0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var2))));
    }

    public final void b(boolean z10) {
        lp0 lp0Var = this.d;
        long j10 = lp0Var.n;
        org.telegram.ui.Components.r5 r5Var = this.c;
        if (j10 != 0) {
            r5Var.j(j10, z10);
            this.b = null;
        } else {
            r5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.q11(LocaleController.getString(lp0Var.p0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
            }
        }
    }

    public final void c() {
        boolean z10 = LocaleController.isRTL;
        org.telegram.ui.Components.r5 r5Var = this.c;
        r5Var.setBounds(z10 ? AndroidUtilities.dp(21.0f) : (getWidth() - r5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - r5Var.s) / 2, LocaleController.isRTL ? AndroidUtilities.dp(21.0f) + r5Var.s : getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + r5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c();
        Integer valueOf = Integer.valueOf(a());
        org.telegram.ui.Components.r5 r5Var = this.c;
        r5Var.k(valueOf);
        org.telegram.ui.Components.q11 q11Var = this.b;
        if (q11Var != null) {
            q11Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.y6.q6), canvas);
        } else {
            r5Var.draw(canvas);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        lp0 lp0Var = this.d;
        setBackgroundColor(lp0Var.p0.getThemedColor(org.telegram.ui.ActionBar.y6.d6));
        this.a.setTextColor(lp0Var.p0.getThemedColor(org.telegram.ui.ActionBar.y6.G6));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
