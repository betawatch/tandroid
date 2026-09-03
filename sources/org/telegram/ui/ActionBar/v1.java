package org.telegram.ui.ActionBar;

import android.view.View;
import org.telegram.ui.Components.s6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
