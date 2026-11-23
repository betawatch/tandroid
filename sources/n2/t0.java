package n2;

import android.os.Build;
import org.telegram.messenger.ls;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static final h9.t0 a;

    static {
        Integer valueOf = Integer.valueOf(ls.b4);
        a = Build.VERSION.SDK_INT < 32 ? h9.t0.p(4, 12, valueOf, 6396, 4) : h9.t0.s(12, valueOf, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }
}
