package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j7 extends FrameLayout {
    public final org.telegram.ui.Components.dp a;
    public final FrameLayout b;
    public final TextView c;
    public boolean d;
    public int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ f7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(f7 f7Var, Context context, int i9) {
        super(context);
        this.f = i9;
        this.h = f7Var;
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 21, null);
        this.a = dpVar;
        dpVar.setDrawBackgroundAsArc(14);
        dpVar.b(org.telegram.ui.ActionBar.f6.i7, org.telegram.ui.ActionBar.f6.g7, org.telegram.ui.ActionBar.f6.k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 8));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.n6, false));
        if (LocaleController.isRTL) {
            addView(dpVar, g7.e6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, g7.e6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, g7.e6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, g7.e6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(dpVar, g7.e6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, g7.e6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, g7.e6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, g7.e6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (LocaleController.isRTL) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - AndroidUtilities.dp(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
            }
        }
    }
}
