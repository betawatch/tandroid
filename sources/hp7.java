// default package

import android.util.Pair;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hp7 {
    public final long a;
    public String b;
    public final HashMap c;
    public boolean d;
    public long e;

    public hp7(String str, long j, int i, long j2, long j3) {
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
