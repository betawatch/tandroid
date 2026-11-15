package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r60 extends uj0 {
    public final /* synthetic */ v60 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(v60 v60Var, Context context) {
        super(context, null);
        this.f3 = v60Var;
    }

    @Override // org.telegram.ui.Components.uj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.u1) {
            return;
        }
        super.requestLayout();
    }
}
