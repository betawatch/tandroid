package g9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ q(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                try {
                    l lVar = this.b.d;
                    l9.b bVar = (l9.b) lVar.c;
                    String str = (String) lVar.b;
                    bVar.getClass();
                    boolean delete = new File(bVar.b, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e10) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                    return Boolean.FALSE;
                }
            default:
                p pVar = this.b.f;
                l lVar2 = pVar.c;
                l9.b bVar2 = (l9.b) lVar2.c;
                String str2 = (String) lVar2.b;
                bVar2.getClass();
                boolean z10 = true;
                if (new File(bVar2.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    l9.b bVar3 = (l9.b) lVar2.c;
                    bVar3.getClass();
                    new File(bVar3.b, str2).delete();
                } else {
                    String e11 = pVar.e();
                    if (e11 == null || !pVar.j.c(e11)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
