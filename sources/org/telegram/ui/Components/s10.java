package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s10 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.x20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s10(org.telegram.ui.x20 x20Var, Context context) {
        super(context);
        this.a = x20Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        x10.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10);
        org.telegram.ui.x20 x20Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x20Var.k1.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y9 = org.telegram.messenger.camera.q.y(200.0f, View.MeasureSpec.getSize(i3), 2);
        x20Var.j1.setPadding(y9, 0, y9, 0);
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(x20Var.l1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), 0);
    }
}
