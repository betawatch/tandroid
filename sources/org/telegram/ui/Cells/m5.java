package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(vl.C(2.0f, this.a, TLObject.FLAG_30), vl.C(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i10) {
        this.a = i10;
    }
}
