package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h3 extends ki.r3 {
    public boolean d0;
    public final /* synthetic */ k3 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(k3 k3Var, Context context) {
        super(context);
        this.e0 = k3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i10) * 0.4f);
        this.d0 = false;
        int size = View.MeasureSpec.getSize(i10);
        t3 t3Var = this.e0.M.L;
        if (t3Var != null) {
            t3Var.getClass();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.m, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d0) {
            return;
        }
        super.requestLayout();
    }
}
