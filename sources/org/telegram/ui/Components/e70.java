package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
