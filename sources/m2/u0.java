package m2;

import android.os.Build;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class u0 {
    public static final g9.t0 a;

    static {
        Integer valueOf = Integer.valueOf(hs.b4);
        a = Build.VERSION.SDK_INT < 32 ? g9.t0.p(4, 12, valueOf, 6396, 4) : g9.t0.s(12, valueOf, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }
}
