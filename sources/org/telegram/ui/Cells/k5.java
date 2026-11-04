package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(org.telegram.messenger.camera.q.B(2.0f, this.a, TLObject.FLAG_30), org.telegram.messenger.camera.q.B(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i3) {
        this.a = i3;
    }
}
