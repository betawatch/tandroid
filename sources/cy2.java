// default package

import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
