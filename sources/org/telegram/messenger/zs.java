package org.telegram.messenger;

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class zs {
    public final long a;
    public String b;
    public final HashMap c;
    public boolean d;
    public long e;

    public zs(String str, long j3, int i7, long j10, long j11) {
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
