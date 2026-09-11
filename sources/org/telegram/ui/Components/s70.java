package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
