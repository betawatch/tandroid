package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
