package ci;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class n1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (p1.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p1 p1Var = p1.Z;
        if (p1Var.e.getParent() == this) {
            p1Var.e.layout(0, 0, p1Var.J, p1Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        p1 p1Var = p1.Z;
        if (p1Var.e.getParent() == this) {
            p1Var.e.measure(View.MeasureSpec.makeMeasureSpec(p1Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(p1Var.K, TLObject.FLAG_30));
        }
    }
}
