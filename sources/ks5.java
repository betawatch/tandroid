// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ks5 extends r59 {
    public int f3;
    public final /* synthetic */ xs5 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks5(xs5 xs5Var, Context context) {
        super(context, null);
        this.g3 = xs5Var;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        xs5 xs5Var = this.g3;
        ks5 ks5Var = xs5Var.P1;
        if (this.f3 != View.MeasureSpec.getSize(i2)) {
            this.f3 = View.MeasureSpec.getSize(i2);
            xs5Var.U1 = true;
            ks5Var.setPadding(0, 0, 0, 0);
            xs5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f3;
            int i4 = (int) ((i3 / 5.0f) * 2.0f);
            if (i4 < gm.L(60.0f) + (i3 - measuredHeight)) {
                i4 = this.f3 - measuredHeight;
            }
            xs5Var.U1 = true;
            ks5Var.setPadding(0, i4, 0, 0);
            xs5Var.U1 = false;
            measure(i, View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
        }
        super.onMeasure(i, i2);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.U1) {
            return;
        }
        super.requestLayout();
    }
}
