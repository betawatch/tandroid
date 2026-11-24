// default package

import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cy2 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ dy2 b;

    public cy2(dy2 dy2Var, long j) {
        this.b = dy2Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ls6.j(1, "fatal").putLong("timestamp", this.a);
        ((pd5) this.b.k.a.a).getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
        return null;
    }
}
