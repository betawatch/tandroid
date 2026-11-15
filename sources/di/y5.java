package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y5 extends org.telegram.ui.Components.ca {
    public ArrayList W1;
    public LimitPreviewView X1;

    public final void d1(long j3) {
        ArrayList arrayList = this.W1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.X1.j((TL_stars.StarGiftUpgradePrice) arrayList.get(0), j3, (TL_stars.StarGiftUpgradePrice) i5.c.h(1, arrayList));
    }
}
