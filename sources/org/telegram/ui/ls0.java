package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ls0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.mp b;

    public /* synthetic */ ls0(org.telegram.messenger.mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        ws0 ws0Var = (ws0) obj;
        ws0 ws0Var2 = (ws0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.P0;
                i7 = sparseIntArray.get(ws0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray.get(ws0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.O0;
                i7 = sparseIntArray2.get(ws0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray2.get(ws0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i7 - i10;
    }
}
