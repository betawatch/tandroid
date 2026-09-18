package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fe extends FrameLayout {
    public final org.telegram.ui.Components.f61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final ai.n8 e;
    public final /* synthetic */ he f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(he heVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = heVar;
        this.d = i10;
        this.c = i11;
        this.b = f6Var;
        this.e = n8Var;
        org.telegram.ui.Components.f61 f61Var = new org.telegram.ui.Components.f61(context, i11, i12, true, new b5(this, 3), new y0(this, 14), null, f6Var);
        this.a = f61Var;
        addView(f61Var, w7.x5.c(-1.0f, -1));
        f61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Y2.N(false);
    }
}
