package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs b;

    public /* synthetic */ xr(hs hsVar, int i3) {
        this.a = i3;
        this.b = hsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hs hsVar = this.b;
                ArrayList arrayList = null;
                hsVar.i = null;
                SparseArray sparseArray = hsVar.n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = Long.MAX_VALUE;
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        long j11 = ((as) sparseArray.valueAt(i3)).b;
                        if (elapsedRealtime - j11 > 1000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Integer.valueOf(sparseArray.keyAt(i3)));
                        } else {
                            j10 = Math.min(j11, j10);
                        }
                    }
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            hsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j10 != Long.MAX_VALUE) {
                        g0.i3(new xr(hsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j10)));
                        break;
                    }
                }
                break;
            default:
                hs hsVar2 = this.b;
                hsVar2.i = new xr(hsVar2, 0);
                break;
        }
    }
}
