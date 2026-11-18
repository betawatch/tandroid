package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dy0 extends FrameLayout {
    public final org.telegram.ui.Components.m5 a;
    public final /* synthetic */ ey0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.b = ey0Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, ey0Var.getResourceProvider());
        textView.setText(org.telegram.messenger.gd.M0(2131751339, null));
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        int i7;
        int i10;
        ey0 ey0Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        String S = org.telegram.messenger.ri.d0(i7).S();
        org.telegram.ui.Components.m5 m5Var = this.a;
        if (S != null && S.startsWith("animated_")) {
            try {
                m5Var.j(Long.parseLong(S.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i10).r.get(S);
        if (tL_availableReaction != null) {
            m5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.m5 m5Var = this.a;
        m5Var.setBounds((width - m5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - m5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + m5Var.s) / 2);
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
