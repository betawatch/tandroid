package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v70 extends rl0 {
    public final /* synthetic */ z70 U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(z70 z70Var, Context context) {
        super(context, null);
        this.U2 = z70Var;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.U2.n) {
            return;
        }
        super.requestLayout();
    }
}
