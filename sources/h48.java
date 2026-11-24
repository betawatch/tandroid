// default package

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
