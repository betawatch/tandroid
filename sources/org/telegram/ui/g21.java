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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g21 extends FrameLayout {
    public final org.telegram.ui.Components.i5 a;
    public final /* synthetic */ h21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g21(h21 h21Var, Context context) {
        super(context);
        this.b = h21Var;
        TextView g10 = org.telegram.messenger.l0.g(context, 1, 16.0f);
        g10.setTextColor(h21Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        g10.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g10, g7.e6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.i5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        int i9;
        int i10;
        h21 h21Var = this.b;
        i9 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        String doubleTapReaction = MediaDataController.getInstance(i9).getDoubleTapReaction();
        org.telegram.ui.Components.i5 i5Var = this.a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                i5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i10 = ((org.telegram.ui.ActionBar.o2) h21Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            i5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.i5 i5Var = this.a;
        i5Var.setBounds((width - i5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - i5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + i5Var.s) / 2);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }
}
