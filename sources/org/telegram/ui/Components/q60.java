package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q60 extends qj0 {
    public final /* synthetic */ u60 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(u60 u60Var, Context context) {
        super(context, null);
        this.e3 = u60Var;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e3.q1) {
            return;
        }
        super.requestLayout();
    }
}
