package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b6 extends org.telegram.ui.Components.ja {
    public ArrayList W1;
    public LimitPreviewView X1;

    public final void e1(long j3) {
        ArrayList arrayList = this.W1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.X1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j3, (TL_stars.StarGiftUpgradePrice) i5.c.h(1, arrayList));
    }
}
