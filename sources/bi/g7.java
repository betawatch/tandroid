package bi;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g7 extends org.telegram.ui.Components.fa {
    public ArrayList V1;
    public LimitPreviewView W1;

    public final void d1(long j3) {
        ArrayList arrayList = this.V1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.W1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j3, (TL_stars.StarGiftUpgradePrice) jg.g.i(1, arrayList));
    }
}
