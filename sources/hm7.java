// default package

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class hm7 {
    public final long a;
    public String b;
    public final HashMap c;
    public boolean d;
    public long e;

    public hm7(String str, long j, int i, long j2, long j3) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.a = j;
        this.b = str;
        hashMap.put(Integer.valueOf(i), new Pair(Long.valueOf(j2), Long.valueOf(j3)));
        this.e = j2;
    }

    public final long a() {
        long j = -1;
        for (Pair pair : this.c.values()) {
            if (j == -1 || j > ((Long) pair.first).longValue()) {
                j = ((Long) pair.first).longValue();
            }
        }
        return j;
    }
}
