// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class k14 extends xya {
    public final /* synthetic */ byte P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k14(Context context, boolean z, wjb wjbVar, byte b) {
        super(wjbVar, context, z);
        this.P = b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.P) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), TLObject.FLAG_30));
                break;
        }
    }
}
