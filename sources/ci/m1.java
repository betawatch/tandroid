package ci;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class m1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (o1.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o1 o1Var = o1.Z;
        if (o1Var.e.getParent() == this) {
            o1Var.e.layout(0, 0, o1Var.J, o1Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        o1 o1Var = o1.Z;
        if (o1Var.e.getParent() == this) {
            o1Var.e.measure(View.MeasureSpec.makeMeasureSpec(o1Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(o1Var.K, TLObject.FLAG_30));
        }
    }
}
