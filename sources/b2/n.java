package b2;

import android.os.Build;
import android.os.IBinder;
import java.util.UUID;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class n {
    public static final int a;
    public static final UUID b;
    public static final UUID c;
    public static final UUID d;
    public static final UUID e;
    public static final UUID f;

    static {
        a = Build.VERSION.SDK_INT >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
        b = new UUID(0L, 0L);
        c = new UUID(1186680826959645954L, -5988876978535335093L);
        d = new UUID(-2129748144642739255L, 8654423357094679310L);
        e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }
}
