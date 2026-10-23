package n2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
