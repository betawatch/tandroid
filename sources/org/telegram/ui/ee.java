package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.s71 a;
    public final org.telegram.ui.ActionBar.u6 b;
    public final int c;
    public final int d;
    public final ag.r0 e;
    public final /* synthetic */ ge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ge geVar, Context context, int i10, int i11, int i12, ag.r0 r0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f = geVar;
        this.d = i10;
        this.c = i11;
        this.b = u6Var;
        this.e = r0Var;
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(context, i11, i12, true, new e5(this, 3), new y0(this, 15), null, u6Var);
        this.a = s71Var;
        setClipChildren(false);
        setClipToPadding(false);
        s71Var.setClipToPadding(false);
        s71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        s71Var.g3.r = false;
        s71Var.setCaptureSectionsDecoratorAllowed(true);
        s71Var.setOverScrollMode(0);
        addView(s71Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        s71Var.setOnScrollListener(new ai.u0(2, this, r0Var));
        oi.q qVar = geVar.w.d1;
        if (qVar != null) {
            qVar.b(s71Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
