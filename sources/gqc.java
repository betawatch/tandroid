// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class gqc extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqc(uqc uqcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = uqcVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                uqcVar.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - hl.L(24.0f)), TLObject.FLAG_30), 0);
                setMeasuredDimension(size, hl.L(36.0f) + uqcVar.a0.getMeasuredHeight());
                break;
            default:
                uqcVar.e.measure(i, 0);
                setMeasuredDimension(View.MeasureSpec.getSize(i), uqcVar.e.getMeasuredHeight());
                break;
        }
    }
}
