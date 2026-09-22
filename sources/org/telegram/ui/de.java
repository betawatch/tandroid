package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.e61 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final ai.n8 e;
    public final /* synthetic */ fe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(fe feVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = feVar;
        this.d = i10;
        this.c = i11;
        this.b = e6Var;
        this.e = n8Var;
        org.telegram.ui.Components.e61 e61Var = new org.telegram.ui.Components.e61(context, i11, i12, true, new b5(this, 3), new y0(this, 13), null, e6Var);
        this.a = e61Var;
        addView(e61Var, w7.x5.c(-1.0f, -1));
        e61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Y2.N(false);
    }
}
