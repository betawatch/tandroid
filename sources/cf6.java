// default package

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cf6 extends ViewSwitcher {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf6(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_31));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_31));
                break;
        }
    }
}
