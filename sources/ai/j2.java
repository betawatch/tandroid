package ai;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class j2 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (m2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m2 m2Var = m2.Z;
        if (m2Var.e.getParent() == this) {
            m2Var.e.layout(0, 0, m2Var.J, m2Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        m2 m2Var = m2.Z;
        if (m2Var.e.getParent() == this) {
            m2Var.e.measure(View.MeasureSpec.makeMeasureSpec(m2Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(m2Var.K, TLObject.FLAG_30));
        }
    }
}
