package i9;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ o(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                try {
                    f7.b bVar = this.b.d;
                    n9.b bVar2 = (n9.b) bVar.c;
                    String str = (String) bVar.b;
                    bVar2.getClass();
                    boolean delete = new File(bVar2.b, str).delete();
                    if (!delete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(delete);
                } catch (Exception e) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.b.f;
                f7.b bVar3 = nVar.c;
                n9.b bVar4 = (n9.b) bVar3.c;
                String str2 = (String) bVar3.b;
                bVar4.getClass();
                boolean z4 = true;
                if (new File(bVar4.b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    n9.b bVar5 = (n9.b) bVar3.c;
                    bVar5.getClass();
                    new File(bVar5.b, str2).delete();
                } else {
                    String e6 = nVar.e();
                    if (e6 == null || !nVar.j.c(e6)) {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }
}
