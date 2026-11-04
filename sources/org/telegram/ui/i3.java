package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i3 extends ii.c4 {
    public boolean d0;
    public final /* synthetic */ l3 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(l3 l3Var, Context context) {
        super(context);
        this.e0 = l3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        this.d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.d0 = false;
        int size = View.MeasureSpec.getSize(i10);
        u3 u3Var = this.e0.M.L;
        if (u3Var != null) {
            u3Var.getClass();
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.m, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d0) {
            return;
        }
        super.requestLayout();
    }
}
