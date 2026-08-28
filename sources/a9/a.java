package a9;

import android.os.Bundle;
import android.util.Log;
import d7.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements c9.a {
    public final /* synthetic */ c a;

    public /* synthetic */ a(c cVar) {
        this.a = cVar;
    }

    @Override // c9.a
    public void V1(Bundle bundle) {
        ((u) this.a.b).V1(bundle);
    }

    public void a(b bVar) {
        c cVar = this.a;
        synchronized (cVar) {
            ((ArrayList) cVar.a).add(bVar);
            ((v9.d) cVar.c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
