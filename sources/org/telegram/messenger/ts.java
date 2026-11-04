package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ts {
    public final long a;
    public String b;
    public final HashMap c;
    public boolean d;
    public long e;

    public ts(String str, long j10, int i3, long j11, long j12) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.a = j10;
        this.b = str;
        hashMap.put(Integer.valueOf(i3), new Pair(Long.valueOf(j11), Long.valueOf(j12)));
        this.e = j11;
    }

    public final long a() {
        long j10 = -1;
        for (Pair pair : this.c.values()) {
            if (j10 == -1 || j10 > ((Long) pair.first).longValue()) {
                j10 = ((Long) pair.first).longValue();
            }
        }
        return j10;
    }
}
