package ih;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j1 extends ViewGroup {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (k1.V.S) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        k1 k1Var = k1.V;
        if (k1Var.e.getParent() == this) {
            k1Var.e.layout(0, 0, k1Var.F, k1Var.G);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        k1 k1Var = k1.V;
        if (k1Var.e.getParent() == this) {
            k1Var.e.measure(View.MeasureSpec.makeMeasureSpec(k1Var.F, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(k1Var.G, TLObject.FLAG_30));
        }
    }
}
