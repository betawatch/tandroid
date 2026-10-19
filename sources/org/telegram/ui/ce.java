package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ce extends FrameLayout {
    public final org.telegram.ui.Components.b71 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final int d;
    public final ah.g e;
    public final /* synthetic */ ee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(ee eeVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f = eeVar;
        this.d = i10;
        this.c = i11;
        this.b = d6Var;
        this.e = gVar;
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(context, i11, i12, true, new g5(this, 3), new b1(this, 13), null, d6Var);
        this.a = b71Var;
        addView(b71Var, w7.z5.c(-1.0f, -1));
        b71Var.setOnScrollListener(new ki.m3(1, this, gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.W2.N(false);
    }
}
