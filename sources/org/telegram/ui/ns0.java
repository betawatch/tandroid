package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ns0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.qp b;

    public /* synthetic */ ns0(org.telegram.messenger.qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ys0 ys0Var = (ys0) obj;
        ys0 ys0Var2 = (ys0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.O0;
                i7 = sparseIntArray.get(ys0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray.get(ys0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.N0;
                i7 = sparseIntArray2.get(ys0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray2.get(ys0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i7 - i10;
    }
}
