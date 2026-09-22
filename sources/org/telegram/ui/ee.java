package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.u61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final ai.n8 e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, ai.n8 n8Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = f6Var;
        this.e = n8Var;
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(context, i11, i12, true, new b5(this, 3), new y0(this, 14), null, f6Var);
        this.a = u61Var;
        addView(u61Var, w7.y5.c(-1.0f, -1));
        u61Var.setOnScrollListener(new ii.m3(1, this, n8Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Y2.N(false);
    }
}
