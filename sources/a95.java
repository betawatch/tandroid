// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class a95 extends tb5 {
    @Override // tb5, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (hl.O1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(420.0f), View.MeasureSpec.getSize(i)), TLObject.FLAG_30), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
