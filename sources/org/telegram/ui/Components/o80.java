package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
