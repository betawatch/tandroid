package bi;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class y1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (a2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a2 a2Var = a2.Z;
        if (a2Var.e.getParent() == this) {
            a2Var.e.layout(0, 0, a2Var.J, a2Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        a2 a2Var = a2.Z;
        if (a2Var.e.getParent() == this) {
            a2Var.e.measure(View.MeasureSpec.makeMeasureSpec(a2Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(a2Var.K, TLObject.FLAG_30));
        }
    }
}
