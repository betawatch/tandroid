// default package

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class or4 {
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

    public or4(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
