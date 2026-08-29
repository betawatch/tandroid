package lh;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (i1.V.S) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        i1 i1Var = i1.V;
        if (i1Var.e.getParent() == this) {
            i1Var.e.layout(0, 0, i1Var.F, i1Var.G);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        i1 i1Var = i1.V;
        if (i1Var.e.getParent() == this) {
            i1Var.e.measure(View.MeasureSpec.makeMeasureSpec(i1Var.F, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i1Var.G, TLObject.FLAG_30));
        }
    }
}
