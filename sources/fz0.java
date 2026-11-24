// default package

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fz0 {
    public final long a;
    public int b;
    public dz0 c;
    public dz0 d;
    public int e;
    public long f;
    public boolean g;
    public byte[] h;
    public int i;
    public int j;
    public final LinkedHashMap k = new LinkedHashMap();
    public long l;

    public fz0(long j) {
        this.a = j;
    }

    public final boolean a() {
        if (this.h == null) {
            return false;
        }
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            if (((nz0) it.next()).i == null) {
                return false;
            }
        }
        return true;
    }
}
