package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(ll.C(2.0f, this.a, TLObject.FLAG_30), ll.C(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i9) {
        this.a = i9;
    }
}
