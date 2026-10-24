package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class k3 extends gi.e4 {
    public boolean c0;
    public final /* synthetic */ n3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(n3 n3Var, Context context) {
        super(context);
        this.d0 = n3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        w3 w3Var = this.d0.L.K;
        if (w3Var != null) {
            w3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c0) {
            return;
        }
        super.requestLayout();
    }
}
