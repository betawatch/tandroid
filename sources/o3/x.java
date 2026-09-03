package o3;

import java.util.UUID;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x implements n3.b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z4;
        if ("Amazon".equals(h5.d0.c)) {
            String str = h5.d0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
                d = z4;
            }
        }
        z4 = false;
        d = z4;
    }

    public x(UUID uuid, byte[] bArr, boolean z4) {
        this.a = uuid;
        this.b = bArr;
        this.c = z4;
    }
}
