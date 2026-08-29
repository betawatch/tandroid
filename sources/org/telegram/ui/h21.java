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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h21 extends FrameLayout {
    public final org.telegram.ui.Components.n5 a;
    public final /* synthetic */ i21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h21(i21 i21Var, Context context) {
        super(context);
        this.b = i21Var;
        TextView h = org.telegram.messenger.x3.h(context, 1, 16.0f);
        h.setTextColor(i21Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
        h.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(h, i7.f6.d(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.n5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        i21 i21Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.o2) i21Var).currentAccount;
        String doubleTapReaction = MediaDataController.getInstance(i10).getDoubleTapReaction();
        org.telegram.ui.Components.n5 n5Var = this.a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                n5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i11 = ((org.telegram.ui.ActionBar.o2) i21Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            n5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.n5 n5Var = this.a;
        n5Var.setBounds((width - n5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - n5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + n5Var.s) / 2);
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
