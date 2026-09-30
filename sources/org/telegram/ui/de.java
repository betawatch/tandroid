package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class de extends FrameLayout {
    public final org.telegram.ui.Components.t61 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final int d;
    public final ai.o8 e;
    public final /* synthetic */ fe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(fe feVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f = feVar;
        this.d = i10;
        this.c = i11;
        this.b = d6Var;
        this.e = o8Var;
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, d6Var);
        this.a = t61Var;
        addView(t61Var, w7.y5.c(-1.0f, -1));
        t61Var.setOnScrollListener(new ii.n3(1, this, o8Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Y2.N(false);
    }
}
