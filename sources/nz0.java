// default package

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
