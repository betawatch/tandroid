package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o7 extends FrameLayout {
    public final org.telegram.ui.Components.zp a;
    public final FrameLayout b;
    public final TextView c;
    public boolean d;
    public int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ k7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(k7 k7Var, Context context, int i10) {
        super(context);
        this.f = i10;
        this.h = k7Var;
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 21, null);
        this.a = zpVar;
        zpVar.setDrawBackgroundAsArc(14);
        zpVar.b(org.telegram.ui.ActionBar.y6.i7, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.n6, null);
        if (LocaleController.isRTL) {
            addView(zpVar, org.telegram.ui.Components.gb1.h(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, org.telegram.ui.Components.gb1.h(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, org.telegram.ui.Components.gb1.h(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(zpVar, org.telegram.ui.Components.gb1.h(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, org.telegram.ui.Components.gb1.h(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, org.telegram.ui.Components.gb1.h(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
            }
        }
    }
}
