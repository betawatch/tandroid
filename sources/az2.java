// default package

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class az2 {
    public static final sae c = new sae();
    public final au7 a;
    public final AtomicReference b = new AtomicReference(null);

    public az2(au7 au7Var) {
        this.a = au7Var;
        au7Var.a(new ht2(this, (byte) 3));
    }

    public final sae a() {
        az2 az2Var = (az2) this.b.get();
        return az2Var == null ? c : az2Var.a();
    }

    public final boolean b() {
        az2 az2Var = (az2) this.b.get();
        return az2Var != null && az2Var.b();
    }

    public final boolean c() {
        az2 az2Var = (az2) this.b.get();
        return az2Var != null && az2Var.c();
    }

    public final void d(String str, long j, oa0 oa0Var) {
        String i = c00.i("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", i, null);
        }
        this.a.a(new ps0((Object) str, j, (Object) oa0Var, (byte) 1));
    }
}
