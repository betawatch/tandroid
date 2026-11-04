package ne;

import b8.ib;
import org.telegram.tgnet.TLObject;
import ud.k;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    public static final int a;

    static {
        Object a10;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.j.d(property, "getProperty(...)");
            a10 = k.b(property);
        } catch (Throwable th2) {
            a10 = ib.a(th2);
        }
        if (a10 instanceof dd.f) {
            a10 = null;
        }
        Integer num = (Integer) a10;
        a = num != null ? num.intValue() : TLObject.FLAG_21;
    }
}
