package c9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import f7.v;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // e9.a
    public void a(Bundle bundle) {
        ((v) this.a.a).a(bundle);
    }

    public void b(eg.c cVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.c).add(cVar);
            ((bb.a) fVar.b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
