package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class b6 extends org.telegram.ui.Components.ka {
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
