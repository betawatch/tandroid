// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class kw0 extends zo0 {
    public final /* synthetic */ ow0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(ow0 ow0Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.s = ow0Var;
    }

    @Override // zo0, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.s.f0 && gl.O1() && !gl.E && !gl.N1()) {
            Point point = gl.q;
            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
    }
}
