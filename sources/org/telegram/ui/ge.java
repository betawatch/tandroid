package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.c71 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final int c;
    public final int d;
    public final ai.o8 e;
    public final /* synthetic */ ie f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ie ieVar, Context context, int i10, int i11, int i12, ai.o8 o8Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f = ieVar;
        this.d = i10;
        this.c = i11;
        this.b = d6Var;
        this.e = o8Var;
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context, i11, i12, true, new c5(this, 3), new z0(this, 15), null, d6Var);
        this.a = c71Var;
        setClipChildren(false);
        setClipToPadding(false);
        c71Var.setClipToPadding(false);
        c71Var.t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        c71Var.f3.r = false;
        c71Var.setCaptureSectionsDecoratorAllowed(true);
        c71Var.setOverScrollMode(0);
        addView(c71Var, w7.z5.c(-1.0f, -1));
        c71Var.setOnScrollListener(new ii.n3(1, this, o8Var));
        li.m mVar = ieVar.w.g2;
        if (mVar != null) {
            mVar.b(c71Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.N(false);
    }
}
