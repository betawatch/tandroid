// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
