package g9;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import i7.fa;
import i7.ga;
import i7.na;
import i7.oa;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ga gaVar;
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                l lVar = (l) obj2;
                p pVar = (p) lVar.c;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean booleanValue = bool.booleanValue();
                    u uVar = pVar.b;
                    if (!booleanValue) {
                        uVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    uVar.h.trySetResult(null);
                    Executor executor = (Executor) pVar.e.b;
                    return ((Task) lVar.b).onSuccessTask(executor, new l(i11, this, executor));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = l9.b.e(pVar.g.b.listFiles(p.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                l9.b bVar = ((l9.a) pVar.m.b).b;
                l9.a.a(l9.b.e(bVar.d.listFiles()));
                l9.a.a(l9.b.e(bVar.e.listFiles()));
                l9.a.a(l9.b.e(bVar.f.listFiles()));
                pVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 1:
                p.a((p) obj2, (String) obj, Boolean.FALSE);
                return null;
            case 2:
                return r.a((r) obj2, (e3.f) obj);
            case 3:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                fb.a aVar = (fb.a) obj2;
                HashMap hashMap = ga.f;
                oa.b();
                int i12 = na.a;
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
                } catch (Throwable th2) {
                    try {
                        gaVar.close();
                    } catch (Throwable th3) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        } catch (Exception unused) {
                        }
                    }
                    throw th2;
                }
            default:
                return (h2.f) ((ShortcutInfoCompatSaverImpl) obj2).b.get((String) obj);
        }
    }

    public /* synthetic */ n(MobileVisionBase mobileVisionBase, fb.a aVar) {
        this.a = 3;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
