package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g7 extends org.telegram.ui.Components.ga {
    public ArrayList S1;
    public LimitPreviewView T1;

    public final void d1(long j3) {
        ArrayList arrayList = this.S1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.T1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j3, (TL_stars.StarGiftUpgradePrice) jg.g.i(1, arrayList));
    }
}
