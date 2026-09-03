package f9;

import android.util.Log;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();

    public boolean a(int i10) {
        return 4 <= i10 || Log.isLoggable("FirebaseCrashlytics", i10);
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void c(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void d(String str, Exception exc) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
