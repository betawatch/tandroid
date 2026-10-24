package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
