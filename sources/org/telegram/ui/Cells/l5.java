package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(org.telegram.ui.b.B(2.0f, this.a, TLObject.FLAG_30), org.telegram.ui.b.B(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i10) {
        this.a = i10;
    }
}
