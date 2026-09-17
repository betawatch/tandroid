package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class s70 extends ll0 {
    public final /* synthetic */ w70 X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(w70 w70Var, Context context) {
        super(context, null);
        this.X2 = w70Var;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.X2.n) {
            return;
        }
        super.requestLayout();
    }
}
