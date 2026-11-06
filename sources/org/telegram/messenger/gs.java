package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class gs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs b;

    public /* synthetic */ gs(qs qsVar, int i7) {
        this.a = i7;
        this.b = qsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qs qsVar = this.b;
                ArrayList arrayList = null;
                qsVar.i = null;
                SparseArray sparseArray = qsVar.n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = Long.MAX_VALUE;
                    for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                        long j10 = ((js) sparseArray.valueAt(i7)).b;
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
                            qsVar.j(((Integer) arrayList.get(i10)).intValue());
                        }
                    }
                    if (j3 != Long.MAX_VALUE) {
                        g0.i3(new gs(qsVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j3)));
                        break;
                    }
                }
                break;
            default:
                qs qsVar2 = this.b;
                qsVar2.i = new gs(qsVar2, 0);
                break;
        }
    }
}
