// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class jw extends i22 {
    public boolean d0;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.d0 = true;
        setOffsetY(View.MeasureSpec.getSize(i2) * 0.4f);
        this.d0 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - hl.L(56.0f)) - hl.m, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d0) {
            return;
        }
        super.requestLayout();
    }
}
