package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u80 extends qm0 {
    public final /* synthetic */ y80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(y80 y80Var, Context context) {
        super(context, null);
        this.V2 = y80Var;
    }

    @Override // org.telegram.ui.Components.qm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.n) {
            return;
        }
        super.requestLayout();
    }
}
