package e9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import f5.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements g9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    @Override // g9.a
    public void A(Bundle bundle) {
        ((db.a) this.a.a).A(bundle);
    }

    public void a(u uVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.c).add(uVar);
            ((h7.u) fVar.b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
