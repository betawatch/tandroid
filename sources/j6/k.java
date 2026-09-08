package j6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public k(int i10, int i11, Bundle bundle, int i12) {
        this.e = i12;
        this.a = i10;
        this.c = i11;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(cc.k kVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + kVar.toString());
        }
        this.b.setException(kVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.b.setResult(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + a() + "}";
    }
}
