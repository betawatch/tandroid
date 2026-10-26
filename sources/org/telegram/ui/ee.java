package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ee extends FrameLayout {
    public final org.telegram.ui.Components.r71 a;
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
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(context, i11, i12, true, new e5(this, 3), new y0(this, 15), null, u6Var);
        this.a = r71Var;
        setClipChildren(false);
        setClipToPadding(false);
        r71Var.setClipToPadding(false);
        r71Var.v1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
        r71Var.g3.r = false;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        r71Var.setOverScrollMode(0);
        addView(r71Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        r71Var.setOnScrollListener(new ai.u0(2, this, r0Var));
        oi.q qVar = geVar.w.d1;
        if (qVar != null) {
            qVar.b(r71Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g3.O(false);
    }
}
