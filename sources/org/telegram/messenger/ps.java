package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ps implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs b;

    public /* synthetic */ ps(zs zsVar, int i10) {
        this.a = i10;
        this.b = zsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zs zsVar = this.b;
                ArrayList arrayList = null;
                zsVar.i = null;
                SparseArray sparseArray = zsVar.n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = Long.MAX_VALUE;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        long j11 = ((ss) sparseArray.valueAt(i10)).b;
                        if (elapsedRealtime - j11 > 1000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Integer.valueOf(sparseArray.keyAt(i10)));
                        } else {
                            j10 = Math.min(j11, j10);
                        }
                    }
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            zsVar.j(((Integer) arrayList.get(i11)).intValue());
                        }
                    }
                    if (j10 != Long.MAX_VALUE) {
                        i0.h3(new ps(zsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j10)));
                        break;
                    }
                }
                break;
            default:
                zs zsVar2 = this.b;
                zsVar2.i = new ps(zsVar2, 0);
                break;
        }
    }
}
