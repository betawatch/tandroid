package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class as0 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.hp b;

    public /* synthetic */ as0(org.telegram.messenger.hp hpVar, int i3) {
        this.a = i3;
        this.b = hpVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i3;
        int i10;
        ls0 ls0Var = (ls0) obj;
        ls0 ls0Var2 = (ls0) obj2;
        switch (this.a) {
            case 0:
                SparseIntArray sparseIntArray = this.b.P0;
                i3 = sparseIntArray.get(ls0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray.get(ls0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
            default:
                SparseIntArray sparseIntArray2 = this.b.O0;
                i3 = sparseIntArray2.get(ls0Var.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                i10 = sparseIntArray2.get(ls0Var2.a, ConnectionsManager.DEFAULT_DATACENTER_ID);
                break;
        }
        return i3 - i10;
    }
}
