package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e70 extends ek0 {
    public final /* synthetic */ i70 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(i70 i70Var, Context context) {
        super(context, null);
        this.f3 = i70Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.u1) {
            return;
        }
        super.requestLayout();
    }
}
