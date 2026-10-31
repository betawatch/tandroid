package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(z20.B(2.0f, this.a, TLObject.FLAG_30), z20.B(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i10) {
        this.a = i10;
    }
}
