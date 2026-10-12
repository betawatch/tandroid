package bi;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class z1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (b2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b2 b2Var = b2.Z;
        if (b2Var.e.getParent() == this) {
            b2Var.e.layout(0, 0, b2Var.J, b2Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        b2 b2Var = b2.Z;
        if (b2Var.e.getParent() == this) {
            b2Var.e.measure(View.MeasureSpec.makeMeasureSpec(b2Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(b2Var.K, TLObject.FLAG_30));
        }
    }
}
