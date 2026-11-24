// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h48 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(ug8.E(2.0f, this.a, TLObject.FLAG_30), ug8.E(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i) {
        this.a = i;
    }
}
