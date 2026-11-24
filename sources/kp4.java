// default package

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class kp4 {
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

    public kp4(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
