// default package

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
