package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kc extends FrameLayout {
    public org.telegram.ui.ActionBar.h5 a;
    public org.telegram.ui.Components.pz0 b;
    public org.telegram.ui.Components.i5 c;
    public org.telegram.ui.ActionBar.c6 d;
    public boolean e;
    public int f;

    public final void a(int i10, int i11, boolean z10) {
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            MessagesController.PeerColors peerColors = z10 ? messagesController.peerColors : messagesController.profilePeerColors;
            b(peerColors != null ? peerColors.getColor(i11) : null);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        if (peerColor != null) {
            this.f = peerColor.getColor(0, c6Var);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.s8;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var);
        } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(i10, c6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.g6.l1(0.5f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.l1(0.7f, ap0.u0(org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
        }
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.i5 i5Var = this.c;
        if (j10 == 0) {
            i5Var.g(null, z11);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            i5Var.j(j10, z11);
            this.b = null;
        }
        i5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.i5 i5Var = this.c;
        if (document == null) {
            i5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            i5Var.i(document, false);
            this.b = null;
        }
        i5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.c6 c6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.i5 i5Var = this.c;
        i5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.pz0 pz0Var = this.b;
        if (pz0Var != null) {
            canvas2 = canvas;
            pz0Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.q6, c6Var), canvas2);
        } else {
            canvas2 = canvas;
            i5Var.draw(canvas2);
        }
        if (this.e) {
            Paint N = c6Var != null ? c6Var.N("paintDivider") : org.telegram.ui.ActionBar.g6.k0;
            if (N != null) {
                canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : 0), getMeasuredHeight() - 1, N);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        if (i10 <= 0) {
            h5Var.i(null);
        } else {
            h5Var.i(new mo0(i10, getContext(), this.d, false));
            h5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.i5 i5Var = this.c;
        i5Var.setBounds((getWidth() - i5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.s) / 2);
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
