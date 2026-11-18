package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(n10.C(2.0f, this.a, TLObject.FLAG_30), n10.C(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i7) {
        this.a = i7;
    }
}
