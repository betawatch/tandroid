package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class dy0 extends FrameLayout {
    public final org.telegram.ui.Components.n5 a;
    public final /* synthetic */ ey0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy0(ey0 ey0Var, Context context) {
        super(context);
        this.b = ey0Var;
        TextView textView = new TextView(context);
        textView.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, ey0Var.getResourceProvider());
        textView.setText(org.telegram.messenger.hd.N0(2131751338, null));
        addView(textView, c8.ma.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), this);
    }

    public final void a(boolean z10) {
        int i7;
        int i10;
        ey0 ey0Var = this.b;
        i7 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        String S = org.telegram.messenger.si.d0(i7).S();
        org.telegram.ui.Components.n5 n5Var = this.a;
        if (S != null && S.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(S.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.si.d0(i10).r.get(S);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.a;
        n5Var.setBounds((width - n5Var.s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - n5Var.s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + n5Var.s) / 2);
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
