package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
