// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class f24 extends x2b {
    public final /* synthetic */ byte P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f24(Context context, boolean z, vnb vnbVar, byte b) {
        super(vnbVar, context, z);
        this.P = b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.P) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), TLObject.FLAG_30));
                break;
        }
    }
}
