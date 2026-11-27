// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class iqc extends frc {
    public final /* synthetic */ uqc m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqc(uqc uqcVar, Context context) {
        super(context);
        this.m0 = uqcVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, 0);
        uqc uqcVar = this.m0;
        if (uqcVar.r <= 0 || getMeasuredHeight() <= uqcVar.r) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(paddingRight + ((int) ((getMeasuredWidth() - paddingRight) * (Math.max(0, uqcVar.r - paddingBottom) / Math.max(1, getMeasuredHeight() - paddingBottom)))), TLObject.FLAG_30), 0);
    }

    @Override // frc
    public final void setStickerStyle(float[] fArr) {
        super.setStickerStyle(fArr);
        uqc uqcVar = this.m0;
        uqcVar.Y0(uqcVar.A0);
        uqcVar.Z0(fArr);
    }
}
