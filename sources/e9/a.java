package e9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import h7.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements g9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // g9.a
    public void K(Bundle bundle) {
        ((db.a) this.a.a).K(bundle);
    }

    public void a(f0.d dVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.c).add(dVar);
            ((u) fVar.b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
