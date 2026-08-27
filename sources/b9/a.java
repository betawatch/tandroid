package b9;

import a9.m;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d9.a {
    public final /* synthetic */ f a;

    public /* synthetic */ a(f fVar) {
        this.a = fVar;
    }

    public void a(m mVar) {
        f fVar = this.a;
        synchronized (fVar) {
            ((ArrayList) fVar.c).add(mVar);
            ((ab.a) fVar.b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override // d9.a
    public void s(Bundle bundle) {
        ((xa.a) this.a.a).s(bundle);
    }
}
