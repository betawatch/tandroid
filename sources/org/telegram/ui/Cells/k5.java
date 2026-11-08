package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(2.0f, this.a, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i7) {
        this.a = i7;
    }
}
