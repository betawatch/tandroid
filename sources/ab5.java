// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ab5 extends FrameLayout {
    public final /* synthetic */ d85 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab5(d85 d85Var, Context context) {
        super(context);
        this.a = d85Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.a.D0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        d85 d85Var = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) d85Var.m1.getLayoutParams();
        if (z) {
            int L = gm.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = gm.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        int D = wi8.D(200.0f, View.MeasureSpec.getSize(i), 2);
        d85Var.l1.setPadding(D, 0, D, 0);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(370.0f), TLObject.FLAG_30));
        measureChildWithMargins(d85Var.n1, 0, 0, View.MeasureSpec.makeMeasureSpec(gm.L(64.0f), TLObject.FLAG_30), 0);
    }
}
