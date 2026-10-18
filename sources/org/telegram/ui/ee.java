package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.a71 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final int d;
    public final ah.g e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, ah.g gVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = d6Var;
        this.e = gVar;
        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(context, i11, i12, true, new g5(this, 3), new b1(this, 13), null, d6Var);
        this.a = a71Var;
        addView(a71Var, w7.z5.c(-1.0f, -1));
        a71Var.setOnScrollListener(new ki.m3(1, this, gVar));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.W2.N(false);
    }
}
