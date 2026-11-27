// default package

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nz0 {
    public final long a;
    public int b;
    public lz0 c;
    public lz0 d;
    public int e;
    public long f;
    public boolean g;
    public byte[] h;
    public int i;
    public int j;
    public final LinkedHashMap k = new LinkedHashMap();
    public long l;

    public nz0(long j) {
        this.a = j;
    }

    public final boolean a() {
        if (this.h == null) {
            return false;
        }
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            if (((vz0) it.next()).i == null) {
                return false;
            }
        }
        return true;
    }
}
