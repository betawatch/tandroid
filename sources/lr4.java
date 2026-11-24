// default package

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lr4 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                c = z;
            }
        }
        z = false;
        c = z;
    }

    public lr4(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
