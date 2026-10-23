package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ce extends FrameLayout {
    public final org.telegram.ui.Components.j71 a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final int c;
    public final int d;
    public final ah.g e;
    public final /* synthetic */ ee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(ee eeVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = eeVar;
        this.d = i10;
        this.c = i11;
        this.b = g6Var;
        this.e = gVar;
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(context, i11, i12, true, new f5(this, 3), new a1(this, 13), null, g6Var);
        this.a = j71Var;
        addView(j71Var, w7.z5.c(-1.0f, -1));
        j71Var.setOnScrollListener(new ki.m3(1, this, gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.Z2.N(false);
    }
}
