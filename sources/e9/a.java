package e9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements g9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    public void a(f0.d dVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.c).add(dVar);
            ((db.a) fVar.b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override // g9.a
    public void q2(Bundle bundle) {
        ((cb.b) this.a.a).q2(bundle);
    }
}
