package bi;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
