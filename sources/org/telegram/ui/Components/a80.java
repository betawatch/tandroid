package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a80 extends vl0 {
    public final /* synthetic */ e80 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(e80 e80Var, Context context) {
        super(context, null);
        this.X2 = e80Var;
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
