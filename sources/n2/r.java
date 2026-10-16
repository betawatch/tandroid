package n2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class r implements h2.b {
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

    public r(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
