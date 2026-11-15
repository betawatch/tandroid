package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k5 extends View {
    public int a;

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i20.B(2.0f, this.a, TLObject.FLAG_30), i20.B(2.0f, this.a, TLObject.FLAG_30));
    }

    public void setItemSize(int i7) {
        this.a = i7;
    }
}
