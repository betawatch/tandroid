package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ej extends FragmentContextView {
    public final /* synthetic */ FrameLayout Q0;
    public final /* synthetic */ jj R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(jj jjVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout2) {
        super(context, n2Var, frameLayout, false, d6Var);
        this.R0 = jjVar;
        this.Q0 = frameLayout2;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        this.R0.x.i(this.Q0, i10 == 0, true);
    }
}
