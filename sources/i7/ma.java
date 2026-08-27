package i7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class ma {
    public static e7.s a;

    public static synchronized ka a(ga gaVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (a == null) {
                    a = new e7.s(3);
                }
                kaVar = (ka) a.G(gaVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaVar;
    }

    public static synchronized ka b() {
        ka a2;
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a2 = a(new ga());
        }
        return a2;
    }
}
