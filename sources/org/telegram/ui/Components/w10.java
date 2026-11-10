package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w10 extends FrameLayout {
    public final /* synthetic */ org.telegram.ui.f30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(org.telegram.ui.f30 f30Var, Context context) {
        super(context);
        this.a = f30Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        b20.I0(this.a);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        org.telegram.ui.f30 f30Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) f30Var.m1.getLayoutParams();
        if (z9) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int y10 = org.telegram.messenger.camera.q.y(200.0f, View.MeasureSpec.getSize(i7), 2);
        f30Var.l1.setPadding(y10, 0, y10, 0);
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(f30Var.n1, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), 0);
    }
}
