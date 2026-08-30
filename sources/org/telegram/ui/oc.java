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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class oc extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 a;
    public org.telegram.ui.Components.k01 b;
    public org.telegram.ui.Components.j5 c;
    public org.telegram.ui.ActionBar.f6 d;
    public boolean e;
    public int f;

    public final void a(int i10, int i11, boolean z4) {
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            MessagesController.PeerColors peerColors = z4 ? messagesController.peerColors : messagesController.profilePeerColors;
            b(peerColors != null ? peerColors.getColor(i11) : null);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (peerColor != null) {
            this.f = peerColor.getColor(0, f6Var);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var);
        } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.j6.l1(0.5f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var), org.telegram.ui.ActionBar.j6.l1(0.7f, gp0.u0(org.telegram.ui.ActionBar.j6.v0(i10, f6Var))));
        }
    }

    public final void c(long j10, boolean z4, boolean z10) {
        org.telegram.ui.Components.j5 j5Var = this.c;
        if (j10 == 0) {
            j5Var.g(null, z10);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            j5Var.j(j10, z10);
            this.b = null;
        }
        j5Var.m(z4, z10);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.j5 j5Var = this.c;
        if (document == null) {
            j5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            j5Var.i(document, false);
            this.b = null;
        }
        j5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.j5 j5Var = this.c;
        j5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.k01 k01Var = this.b;
        if (k01Var != null) {
            canvas2 = canvas;
            k01Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.q6, f6Var), canvas2);
        } else {
            canvas2 = canvas;
            j5Var.draw(canvas2);
        }
        if (this.e) {
            Paint G = f6Var != null ? f6Var.G("paintDivider") : org.telegram.ui.ActionBar.j6.k0;
            if (G != null) {
                canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : 0), getMeasuredHeight() - 1, G);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        if (i10 <= 0) {
            k5Var.i(null);
        } else {
            k5Var.i(new so0(i10, getContext(), this.d, false));
            k5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.j5 j5Var = this.c;
        j5Var.setBounds((getWidth() - j5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - j5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + j5Var.s) / 2);
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
