package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class g80 extends zl0 {
    public final /* synthetic */ k80 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(k80 k80Var, Context context) {
        super(context, null);
        this.e3 = k80Var;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3.n) {
            return;
        }
        super.requestLayout();
    }
}
