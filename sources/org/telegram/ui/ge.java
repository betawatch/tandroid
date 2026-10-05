package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class ge extends FrameLayout {
    public final org.telegram.ui.Components.e71 a;
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
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(context, i11, i12, true, new c5(this, 3), new z0(this, 15), null, d6Var);
        this.a = e71Var;
        setClipChildren(false);
        setClipToPadding(false);
        e71Var.setClipToPadding(false);
        e71Var.s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        e71Var.f3.r = false;
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        e71Var.setOverScrollMode(0);
        addView(e71Var, w7.z5.c(-1.0f, -1));
        e71Var.setOnScrollListener(new ii.n3(1, this, o8Var));
        li.p pVar = ieVar.w.d1;
        if (pVar != null) {
            pVar.b(e71Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f3.N(false);
    }
}
