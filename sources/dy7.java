// default package

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
