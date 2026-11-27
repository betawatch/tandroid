// default package

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class dy7 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = ey7.d;
        boolean z = true;
        if (!jrd.a("robolectric", Build.FINGERPRINT) && (((classLoader = ey7.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
