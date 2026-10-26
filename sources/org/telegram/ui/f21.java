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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class f21 extends FrameLayout {
    public final org.telegram.ui.Components.r5 a;
    public final /* synthetic */ g21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f21(g21 g21Var, Context context) {
        super(context);
        this.b = g21Var;
        TextView g7 = org.telegram.messenger.t.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.G6, g21Var.getResourceProvider());
        g7.setText(LocaleController.getString(R.string.DoubleTapSetting));
        addView(g7, org.telegram.ui.Components.gb1.h(-1, -2.0f, 23, 20.0f, 0.0f, 48.0f, 0.0f));
        this.a = new org.telegram.ui.Components.r5(AndroidUtilities.dp(24.0f), this);
    }

    public final void a(boolean z10) {
        int i10;
        int i11;
        g21 g21Var = this.b;
        i10 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        String doubleTapReaction = MediaDataController.getInstance(i10).getDoubleTapReaction();
        org.telegram.ui.Components.r5 r5Var = this.a;
        if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
            try {
                r5Var.j(Long.parseLong(doubleTapReaction.substring(9)), z10);
                return;
            } catch (Exception unused) {
            }
        }
        i11 = ((org.telegram.ui.ActionBar.r2) g21Var).currentAccount;
        TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i11).getReactionsMap().get(doubleTapReaction);
        if (tL_availableReaction != null) {
            r5Var.i(tL_availableReaction.static_icon, z10);
        }
    }

    public final void b() {
        int width = getWidth();
        org.telegram.ui.Components.r5 r5Var = this.a;
        r5Var.setBounds((width - r5Var.s) - AndroidUtilities.dp(21.0f), (getHeight() - r5Var.s) / 2, getWidth() - AndroidUtilities.dp(21.0f), (getHeight() + r5Var.s) / 2);
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
