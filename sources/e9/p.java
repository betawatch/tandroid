package e9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ p(q qVar, int i9) {
        this.a = i9;
        this.b = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                try {
                    we.b bVar = this.b.d;
                    j9.c cVar = (j9.c) bVar.c;
                    String str = (String) bVar.b;
                    cVar.getClass();
                    boolean delete = new File(cVar.b, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                    return Boolean.FALSE;
                }
            default:
                o oVar = this.b.f;
                we.b bVar2 = oVar.c;
                j9.c cVar2 = (j9.c) bVar2.c;
                String str2 = (String) bVar2.b;
                cVar2.getClass();
                boolean z10 = true;
                if (new File(cVar2.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    j9.c cVar3 = (j9.c) bVar2.c;
                    cVar3.getClass();
                    new File(cVar3.b, str2).delete();
                } else {
                    String e11 = oVar.e();
                    if (e11 == null || !oVar.j.c(e11)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
