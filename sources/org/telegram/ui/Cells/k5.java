package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
