package ai;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class k2 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (n2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n2 n2Var = n2.Z;
        if (n2Var.e.getParent() == this) {
            n2Var.e.layout(0, 0, n2Var.J, n2Var.K);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        n2 n2Var = n2.Z;
        if (n2Var.e.getParent() == this) {
            n2Var.e.measure(View.MeasureSpec.makeMeasureSpec(n2Var.J, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(n2Var.K, TLObject.FLAG_30));
        }
    }
}
