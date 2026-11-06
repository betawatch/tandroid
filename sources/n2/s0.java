package n2;

import android.os.Build;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class s0 {
    public static final h9.t0 a;

    static {
        Integer valueOf = Integer.valueOf(qs.b4);
        a = Build.VERSION.SDK_INT < 32 ? h9.t0.p(4, 12, valueOf, 6396, 4) : h9.t0.s(12, valueOf, 6396, 4, 3145980, 82172, 737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172);
    }
}
