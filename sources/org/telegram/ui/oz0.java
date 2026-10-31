package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class oz0 extends FrameLayout {
    public final org.telegram.ui.Components.d5 a;
    public final /* synthetic */ pz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz0(pz0 pz0Var, Context context) {
        super(context);
        this.b = pz0Var;
        TextView g10 = org.telegram.messenger.m5.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.G6, pz0Var.getResourceProvider());
        g10.setText(org.telegram.messenger.cd.L0(2131751351, null));
        addView(g10, w7.b6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        pz0 pz0Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        String Q = org.telegram.messenger.ui.b0(i10).Q();
        org.telegram.ui.Components.d5 d5Var = this.a;
        if (Q != null && Q.startsWith("animated_")) {
            try {
                d5Var.j(Long.parseLong(Q.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i11 = ((org.telegram.ui.ActionBar.k2) pz0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i11).r.get(Q);
        if (tL_availableReaction != null) {
            d5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.d5 d5Var = this.a;
        d5Var.setBounds((width - d5Var.s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.s) / 2, getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.s) / 2);
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
    }
}
