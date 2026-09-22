package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l31 extends FrameLayout {
    public final org.telegram.ui.Components.m5 a;
    public final /* synthetic */ m31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l31(m31 m31Var, Context context) {
        super(context);
        this.b = m31Var;
        TextView g10 = org.telegram.messenger.y0.g(context, 1, 16.0f);
        g10.setTextColor(m31Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, w7.x5.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.m5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        m31 m31Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        String doubleTapReaction = MediaDataController.getInstance(i10).getDoubleTapReaction();
        org.telegram.ui.Components.m5 m5Var = this.a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                m5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i11 = ((org.telegram.ui.ActionBar.n2) m31Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            m5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.m5 m5Var = this.a;
        m5Var.setBounds((width - m5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - m5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + m5Var.s) / 2);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
