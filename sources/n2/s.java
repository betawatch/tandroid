package n2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
