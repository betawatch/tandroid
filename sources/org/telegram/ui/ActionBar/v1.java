package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ s6 a;

    public v1(s6 s6Var) {
        this.a = s6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.c(null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b(null);
    }
}
