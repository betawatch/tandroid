package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class o80 extends mm0 {
    public final /* synthetic */ s80 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(s80 s80Var, Context context) {
        super(context, null);
        this.Y2 = s80Var;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y2.s) {
            return;
        }
        super.requestLayout();
    }
}
