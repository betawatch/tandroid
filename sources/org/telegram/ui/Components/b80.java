package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b80 extends vl0 {
    public final /* synthetic */ f80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(f80 f80Var, Context context) {
        super(context, null);
        this.X2 = f80Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
