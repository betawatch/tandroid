package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class dy0 extends FrameLayout {
    public final org.telegram.ui.Components.g5 a;
    public final /* synthetic */ ey0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.b = ey0Var;
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.s6.U(g10, org.telegram.ui.ActionBar.l6.G6, ey0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.id.M0(2131751350, null));
        addView(g10, c8.ha.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z9) {
        int i7;
        int i10;
        ey0 ey0Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.f2) ey0Var).currentAccount;
        String Q = org.telegram.messenger.ui.b0(i7).Q();
        org.telegram.ui.Components.g5 g5Var = this.a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                g5Var.j(Long.parseLong(Q.substring(9)), z9);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.f2) ey0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i10).r.get(Q);
        if (tL_availableReaction != null) {
            g5Var.i(tL_availableReaction.static_icon, z9);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.g5 g5Var = this.a;
        g5Var.setBounds((width - g5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - g5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + g5Var.s) / 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b();
        this.a.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }
}
