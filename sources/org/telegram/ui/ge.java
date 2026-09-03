package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.g61 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final int d;
    public final ah.b e;
    public final /* synthetic */ ie f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ie ieVar, Context context, int i10, int i11, int i12, ah.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = ieVar;
        this.d = i10;
        this.c = i11;
        this.b = f6Var;
        this.e = bVar;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(context, i11, i12, true, new f5(this, 3), new c1(this, 13), null, f6Var);
        this.a = g61Var;
        addView(g61Var, k7.b6.c(-1.0f, -1));
        g61Var.setOnScrollListener(new jh.l(2, this, bVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.V2.N(false);
    }
}
