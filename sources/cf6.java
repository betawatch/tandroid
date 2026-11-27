// default package

import android.content.Context;
import android.view.View;
import android.widget.ViewSwitcher;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
