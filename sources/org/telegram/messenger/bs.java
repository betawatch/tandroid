package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class bs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ bs(ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ls lsVar = this.b;
                ArrayList arrayList = null;
                lsVar.i = null;
                SparseArray sparseArray = lsVar.n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((es) sparseArray.valueAt(i7)).b;
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
                            lsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.h3(new bs(lsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        break;
                    }
                }
                break;
            default:
                ls lsVar2 = this.b;
                lsVar2.i = new bs(lsVar2, 0);
                break;
        }
    }
}
