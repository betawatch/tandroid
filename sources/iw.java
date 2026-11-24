// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iw extends r12 {
    public boolean d0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i2) * 0.4f);
        this.d0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - gl.L(56.0f)) - gl.m, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d0) {
            return;
        }
        super.requestLayout();
    }
}
