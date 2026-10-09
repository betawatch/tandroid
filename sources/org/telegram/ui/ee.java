package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.k71 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final int d;
    public final ai.p8 e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.p8 p8Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = e6Var;
        this.e = p8Var;
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(context, i11, i12, true, new b5(this, 3), new z0(this, 13), null, e6Var);
        this.a = k71Var;
        addView(k71Var, w7.x5.d(-1.0f, -1));
        k71Var.setOnScrollListener(new ii.n3(1, this, p8Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.W2.N(false);
    }
}
