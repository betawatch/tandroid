package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k7 extends FrameLayout {
    public final org.telegram.ui.Components.ep a;
    public final FrameLayout b;
    public final TextView c;
    public boolean d;
    public int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ g7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(g7 g7Var, Context context, int i10) {
        super(context);
        this.f = i10;
        this.h = g7Var;
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.a = epVar;
        epVar.setDrawBackgroundAsArc(14);
        epVar.b(org.telegram.ui.ActionBar.t6.i7, org.telegram.ui.ActionBar.t6.g7, org.telegram.ui.ActionBar.t6.k7);
        View view = new View(getContext());
        view.setOnClickListener(new a(this, 7));
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        textView.setGravity(5);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.n6, null);
        if (org.telegram.messenger.cd.X) {
            addView(epVar, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
            addView(view, w7.b6.d(40, 40.0f, 21, 0.0f, 0.0f, 0.0f, 0.0f));
            addView(frameLayout, w7.b6.d(-1, -2.0f, 0, 90.0f, 0.0f, 40.0f, 0.0f));
            addView(textView, w7.b6.d(69, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            return;
        }
        addView(epVar, w7.b6.d(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        addView(view, w7.b6.d(40, 40.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.b6.d(-1, -2.0f, 0, 48.0f, 0.0f, 90.0f, 0.0f));
        addView(textView, w7.b6.d(69, -2.0f, 21, 0.0f, 0.0f, 21.0f, 0.0f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            if (org.telegram.messenger.cd.X) {
                canvas.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(48.0f), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            } else {
                canvas.drawLine(getMeasuredWidth() - org.telegram.messenger.i0.L(90.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
            }
        }
    }
}
