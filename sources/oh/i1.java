package oh;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (j1.W.T) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        j1 j1Var = j1.W;
        if (j1Var.e.getParent() == this) {
            j1Var.e.layout(0, 0, j1Var.G, j1Var.H);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        j1 j1Var = j1.W;
        if (j1Var.e.getParent() == this) {
            j1Var.e.measure(View.MeasureSpec.makeMeasureSpec(j1Var.G, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(j1Var.H, TLObject.FLAG_30));
        }
    }
}
