package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w70 extends sl0 {
    public final /* synthetic */ a80 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(a80 a80Var, Context context) {
        super(context, null);
        this.U2 = a80Var;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.n) {
            return;
        }
        super.requestLayout();
    }
}
