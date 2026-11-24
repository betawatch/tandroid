// default package

import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m01 {
    public final long a;
    public int b;
    public k01 c;
    public k01 d;
    public int e;
    public long f;
    public boolean g;
    public byte[] h;
    public int i;
    public int j;
    public final LinkedHashMap k = new LinkedHashMap();
    public long l;

    public m01(long j) {
        this.a = j;
    }

    public final boolean a() {
        if (this.h == null) {
            return false;
        }
        Iterator it = this.k.values().iterator();
        while (it.hasNext()) {
            if (((u01) it.next()).i == null) {
                return false;
            }
        }
        return true;
    }
}
