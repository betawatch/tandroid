package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m3 extends sh.m3 {
    public boolean W;
    public final /* synthetic */ p3 a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p3 p3Var, Context context) {
        super(context);
        this.a0 = p3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.W = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.W = false;
        int size = View.MeasureSpec.getSize(i11);
        y3 y3Var = this.a0.H.H;
        if (y3Var != null) {
            y3Var.getClass();
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
