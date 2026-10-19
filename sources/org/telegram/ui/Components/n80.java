package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class n80 extends im0 {
    public final /* synthetic */ r80 V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n80(r80 r80Var, Context context) {
        super(context, null);
        this.V2 = r80Var;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.V2.n) {
            return;
        }
        super.requestLayout();
    }
}
