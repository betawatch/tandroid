package ci;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h6 extends org.telegram.ui.Components.fa {
    public ArrayList T1;
    public LimitPreviewView U1;

    public final void d1(long j10) {
        ArrayList arrayList = this.T1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.U1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j10, (TL_stars.StarGiftUpgradePrice) k2.p1.h(1, arrayList));
    }
}
