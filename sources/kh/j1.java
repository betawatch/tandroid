package kh;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ org.telegram.ui.Components.j5 a;

    public j1(org.telegram.ui.Components.j5 j5Var) {
        this.a = j5Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.b();
    }
}
