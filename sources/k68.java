// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k68 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(wi8.E(2.0f, this.a, TLObject.FLAG_30), wi8.E(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i) {
        this.a = i;
    }
}
