package o3;

import h5.d0;
import java.util.UUID;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class w implements n3.b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z4;
        if ("Amazon".equals(d0.c)) {
            String str = d0.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z4 = true;
                d = z4;
            }
        }
        z4 = false;
        d = z4;
    }

    public w(UUID uuid, byte[] bArr, boolean z4) {
        this.a = uuid;
        this.b = bArr;
        this.c = z4;
    }
}
