// default package

import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mz2 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ nz2 b;

    public mz2(nz2 nz2Var, long j) {
        this.b = nz2Var;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        kt6.j(1, "fatal").putLong("timestamp", this.a);
        ((nf5) this.b.k.a.a).getClass();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
        return null;
    }
}
