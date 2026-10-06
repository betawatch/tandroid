package n2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class s implements h2.b {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                c = z10;
            }
        }
        z10 = false;
        c = z10;
    }

    public s(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
