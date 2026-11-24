// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class c2a extends View {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e2a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2a(e2a e2aVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = e2aVar;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        e2a e2aVar = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(e2aVar.d.e), TLObject.FLAG_30));
                break;
            default:
                i2a i2aVar = e2aVar.d;
                int i3 = i2aVar.y.J;
                if (i3 >= i2aVar.r.getPaddingTop() && !i2aVar.S) {
                    i3 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30));
                break;
        }
    }
}
