package org.telegram.messenger;

import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class qs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;

    public /* synthetic */ qs(at atVar, int i10) {
        this.a = i10;
        this.b = atVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                at atVar = this.b;
                ArrayList arrayList = null;
                atVar.i = null;
                SparseArray sparseArray = atVar.n;
                if (sparseArray.size() != 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j10 = Long.MAX_VALUE;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        long j11 = ((ts) sparseArray.valueAt(i10)).b;
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
                            atVar.j(((Integer) arrayList.get(i11)).intValue());
                        }
                    }
                    if (j10 != Long.MAX_VALUE) {
                        i0.h3(new qs(atVar, 1), Math.max(17L, 5017 - (elapsedRealtime - j10)));
                        break;
                    }
                }
                break;
            default:
                at atVar2 = this.b;
                atVar2.i = new qs(atVar2, 0);
                break;
        }
    }
}
