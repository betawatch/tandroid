package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o3 extends rh.m3 {
    public boolean W;
    public final /* synthetic */ r3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(r3 r3Var, Context context) {
        super(context);
        this.a0 = r3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.W = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.W = false;
        int size = View.MeasureSpec.getSize(i11);
        a4 a4Var = this.a0.H.H;
        if (a4Var != null) {
            a4Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.W) {
            return;
        }
        super.requestLayout();
    }
}
