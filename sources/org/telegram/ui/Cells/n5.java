package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(rk.C(2.0f, this.a, TLObject.FLAG_30), rk.C(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i10) {
        this.a = i10;
    }
}
