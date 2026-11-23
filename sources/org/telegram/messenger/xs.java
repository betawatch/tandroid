package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class xs {
    public final long a;
    public String b;
    public final HashMap c;
    public boolean d;
    public long e;

    public xs(String str, long j3, int i7, long j10, long j11) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.a = j3;
        this.b = str;
        hashMap.put(Integer.valueOf(i7), new Pair(Long.valueOf(j10), Long.valueOf(j11)));
        this.e = j10;
    }

    public final long a() {
        long j3 = -1;
        for (Pair pair : this.c.values()) {
            if (j3 == -1 || j3 > ((Long) pair.first).longValue()) {
                j3 = ((Long) pair.first).longValue();
            }
        }
        return j3;
    }
}
