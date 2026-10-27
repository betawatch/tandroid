package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(wh.D(2.0f, this.a, TLObject.FLAG_30), wh.D(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i10) {
        this.a = i10;
    }
}
