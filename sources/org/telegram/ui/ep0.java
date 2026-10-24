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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ep0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView a;
    public org.telegram.ui.Components.i11 b;
    public final org.telegram.ui.Components.p5 c;
    public final /* synthetic */ fp0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(fp0 fp0Var, Context context) {
        super(context);
        this.d = fp0Var;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        lp0 lp0Var = fp0Var.p0;
        org.telegram.ui.ActionBar.r6.i(i10, this, lp0Var.getResourceProvider());
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        boolean z10 = lp0Var.a;
        org.telegram.ui.ActionBar.r6.W(textView, i11, lp0Var.getResourceProvider());
        if (fp0Var.m0 == 1) {
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
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        fp0 fp0Var = this.d;
        lp0 lp0Var = fp0Var.p0;
        int i12 = fp0Var.h;
        if (i12 >= 0) {
            if (i12 < 7) {
                return lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[i12]);
            }
            if (fp0Var.m0 == 1) {
                i11 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i11).peerColors;
            } else {
                i10 = ((org.telegram.ui.ActionBar.o2) lp0Var).currentAccount;
                peerColors = MessagesController.getInstance(i10).profilePeerColors;
            }
            return (peerColors == null || (color = peerColors.getColor(fp0Var.h)) == null) ? lp0Var.getThemedColor(org.telegram.ui.ActionBar.k6.r8[0]) : color.getColor1();
        }
        int i13 = org.telegram.ui.ActionBar.k6.s8;
        if (AndroidUtilities.computePerceivedBrightness(lp0Var.getThemedColor(i13)) > 0.8f) {
            int i14 = org.telegram.ui.ActionBar.k6.n6;
            g6Var4 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.w0(i14, g6Var4);
        }
        if (AndroidUtilities.computePerceivedBrightness(lp0Var.getThemedColor(i13)) < 0.2f) {
            int i15 = org.telegram.ui.ActionBar.k6.A8;
            g6Var3 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
            return org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(i15, g6Var3));
        }
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        g6Var = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i16, g6Var);
        g6Var2 = ((org.telegram.ui.ActionBar.o2) lp0Var).resourceProvider;
        return org.telegram.ui.ActionBar.k6.v(w02, org.telegram.ui.ActionBar.k6.o1(0.7f, lp0.w0(org.telegram.ui.ActionBar.k6.w0(i13, g6Var2))));
    }

    public final void b(boolean z10) {
        fp0 fp0Var = this.d;
        long j10 = fp0Var.n;
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (j10 != 0) {
            p5Var.j(j10, z10);
            this.b = null;
        } else {
            p5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.i11(LocaleController.getString(fp0Var.p0.a ? R.string.ChannelReplyIconOff : R.string.UserReplyIconOff), 16.0f, null);
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
        org.telegram.ui.Components.i11 i11Var = this.b;
        if (i11Var != null) {
            i11Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, this.d.p0.getThemedColor(org.telegram.ui.ActionBar.k6.q6), canvas);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        fp0 fp0Var = this.d;
        setBackgroundColor(fp0Var.p0.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        this.a.setTextColor(fp0Var.p0.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
