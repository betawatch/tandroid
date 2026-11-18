package di;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
