package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j3 extends fi.q4 {
    public boolean c0;
    public final /* synthetic */ m3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(m3 m3Var, Context context) {
        super(context);
        this.d0 = m3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        v3 v3Var = this.d0.K.K;
        if (v3Var != null) {
            v3Var.getClass();
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
