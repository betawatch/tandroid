package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ks0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.qp b;

    public /* synthetic */ ks0(org.telegram.messenger.qp qpVar, int i7) {
        this.a = i7;
        this.b = qpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7;
        int i10;
        vs0 vs0Var = (vs0) obj;
        vs0 vs0Var2 = (vs0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.O0;
                i7 = sparseIntArray.get(vs0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray.get(vs0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.N0;
                i7 = sparseIntArray2.get(vs0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray2.get(vs0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i7 - i10;
    }
}
