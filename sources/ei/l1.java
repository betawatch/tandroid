package ei;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (n1.a0.X) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        n1 n1Var = n1.a0;
        if (n1Var.e.getParent() == this) {
            n1Var.e.layout(0, 0, n1Var.K, n1Var.L);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        n1 n1Var = n1.a0;
        if (n1Var.e.getParent() == this) {
            n1Var.e.measure(View.MeasureSpec.makeMeasureSpec(n1Var.K, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(n1Var.L, TLObject.FLAG_30));
        }
    }
}
