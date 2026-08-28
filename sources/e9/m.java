package e9;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import g7.fa;
import g7.ga;
import g7.na;
import g7.oa;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ga gaVar;
        int i9 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i9) {
            case 0:
                we.b bVar = (we.b) obj2;
                o oVar = (o) bVar.c;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean booleanValue = bool.booleanValue();
                    t tVar = oVar.b;
                    if (!booleanValue) {
                        tVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    tVar.h.trySetResult(null);
                    Executor executor = (Executor) oVar.e.b;
                    return ((Task) bVar.b).onSuccessTask(executor, new we.b(22, this, executor));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = j9.c.e(oVar.g.b.listFiles(o.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                j9.c cVar = ((j9.b) oVar.m.b).b;
                j9.b.a(j9.c.e(cVar.d.listFiles()));
                j9.b.a(j9.c.e(cVar.e.listFiles()));
                j9.b.a(j9.c.e(cVar.f.listFiles()));
                oVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 1:
                o.a((o) obj2, (String) obj, Boolean.FALSE);
                return null;
            case 2:
                return q.a((q) obj2, (c3.h) obj);
            case 3:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                db.a aVar = (db.a) obj2;
                HashMap hashMap = ga.f;
                oa.b();
                int i10 = na.a;
                oa.b();
                if (Boolean.parseBoolean("")) {
                    HashMap hashMap2 = ga.f;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new ga("detectorTaskWithResource#run"));
                    }
                    gaVar = (ga) hashMap2.get("detectorTaskWithResource#run");
                } else {
                    gaVar = fa.h;
                }
                gaVar.a();
                try {
                    Object e10 = mobileVisionBase.b.e(aVar);
                    gaVar.close();
                    return e10;
                } catch (Throwable th) {
                    try {
                        gaVar.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            default:
                return (h2.f) ((ShortcutInfoCompatSaverImpl) obj2).b.get((String) obj);
        }
    }

    public /* synthetic */ m(MobileVisionBase mobileVisionBase, db.a aVar) {
        this.a = 3;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
