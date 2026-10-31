package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class nt {
    public final long a;
    public String b;
    public final HashMap c;
    public boolean d;
    public long e;

    public nt(String str, long j10, int i10, long j11, long j12) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.a = j10;
        this.b = str;
        hashMap.put(Integer.valueOf(i10), new Pair(Long.valueOf(j11), Long.valueOf(j12)));
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
