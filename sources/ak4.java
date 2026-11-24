// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ak4 extends View {
    public final /* synthetic */ byte a;
    public final byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ak4(Context context, int i, byte b) {
        super(context);
        this.a = b;
        switch (b) {
            case 1:
                this.b = i;
                super(context);
                break;
            default:
                this.b = i;
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.b), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.b), TLObject.FLAG_30));
                break;
        }
    }
}
