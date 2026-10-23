package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class oc extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.ActionBar.n5 a;
    public org.telegram.ui.Components.i11 b;
    public org.telegram.ui.Components.p5 c;
    public org.telegram.ui.ActionBar.g6 d;
    public boolean e;
    public int f;

    public final void a(int i10, int i11, boolean z10) {
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.r8[i11], this.d);
        } else {
            MessagesController messagesController = MessagesController.getInstance(i10);
            MessagesController.PeerColors peerColors = z10 ? messagesController.peerColors : messagesController.profilePeerColors;
            b(peerColors != null ? peerColors.getColor(i11) : null);
        }
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        if (peerColor != null) {
            this.f = peerColor.getColor(0, g6Var);
            return;
        }
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) > 0.8f) {
            this.f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, g6Var);
        } else if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) < 0.2f) {
            this.f = org.telegram.ui.ActionBar.k6.o1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        } else {
            this.f = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, g6Var), org.telegram.ui.ActionBar.k6.o1(0.7f, lp0.w0(org.telegram.ui.ActionBar.k6.w0(i10, g6Var))));
        }
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (j10 == 0) {
            p5Var.g(null, z11);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            p5Var.j(j10, z11);
            this.b = null;
        }
        p5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.p5 p5Var = this.c;
        if (document == null) {
            p5Var.g(null, false);
            if (this.b == null) {
                this.b = new org.telegram.ui.Components.i11(LocaleController.getString(R.string.ChannelReplyIconOff), 16.0f, null);
            }
        } else {
            p5Var.i(document, false);
            this.b = null;
        }
        p5Var.m(false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.p5 p5Var = this.c;
        p5Var.k(Integer.valueOf(this.f));
        org.telegram.ui.Components.i11 i11Var = this.b;
        if (i11Var != null) {
            canvas2 = canvas;
            i11Var.c((getMeasuredWidth() - this.b.l()) - AndroidUtilities.dp(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.q6, g6Var), canvas2);
        } else {
            canvas2 = canvas;
            p5Var.draw(canvas2);
        }
        if (this.e) {
            Paint d = g6Var != null ? g6Var.d("paintDivider") : org.telegram.ui.ActionBar.k6.k0;
            if (d != null) {
                canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(23.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : 0), getMeasuredHeight() - 1, d);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        if (i10 <= 0) {
            n5Var.i(null);
        } else {
            n5Var.i(new uo0(i10, getContext(), this.d, false));
            n5Var.setDrawablePadding(AndroidUtilities.dp(6.0f));
        }
    }

    public final void f() {
        org.telegram.ui.Components.p5 p5Var = this.c;
        p5Var.setBounds((getWidth() - p5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - p5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + p5Var.s) / 2);
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
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        if (n5Var != null) {
            n5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
