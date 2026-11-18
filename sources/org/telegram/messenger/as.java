package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ks b;

    public /* synthetic */ as(ks ksVar, int i7) {
        this.a = i7;
        this.b = ksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ks ksVar = this.b;
                ArrayList arrayList = null;
                ksVar.i = null;
                SparseArray sparseArray = ksVar.n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((ds) sparseArray.valueAt(i7)).b;
                        if (elapsedRealtime - j10 > 1000) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Integer.valueOf(sparseArray.keyAt(i7)));
                        } else {
                            j3 = Math.min(j10, j3);
                        }
                    }
                    if (arrayList != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ksVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.h3(new as(ksVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        break;
                    }
                }
                break;
            default:
                ks ksVar2 = this.b;
                ksVar2.i = new as(ksVar2, 0);
                break;
        }
    }
}
