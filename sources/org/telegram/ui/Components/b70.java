package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b70 extends ek0 {
    public final /* synthetic */ f70 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(f70 f70Var, Context context) {
        super(context, null);
        this.f3 = f70Var;
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.u1) {
            return;
        }
        super.requestLayout();
    }
}
