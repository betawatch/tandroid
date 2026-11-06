package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class js0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.qp b;

    public /* synthetic */ js0(org.telegram.messenger.qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        us0 us0Var = (us0) obj;
        us0 us0Var2 = (us0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.O0;
                i7 = sparseIntArray.get(us0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray.get(us0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.N0;
                i7 = sparseIntArray2.get(us0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray2.get(us0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i7 - i10;
    }
}
