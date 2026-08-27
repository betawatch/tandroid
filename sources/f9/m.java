package f9;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import h7.fa;
import h7.ga;
import h7.na;
import h7.oa;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ga gaVar;
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                xe.b bVar = (xe.b) obj2;
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
                    return ((Task) bVar.b).onSuccessTask(executor, new xe.b(25, this, executor));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = k9.c.e(oVar.g.b.listFiles(o.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                k9.c cVar = ((k9.b) oVar.m.b).b;
                k9.b.a(k9.c.e(cVar.d.listFiles()));
                k9.b.a(k9.c.e(cVar.e.listFiles()));
                k9.b.a(k9.c.e(cVar.f.listFiles()));
                oVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 1:
                o.a((o) obj2, (String) obj, Boolean.FALSE);
                return null;
            case 2:
                return q.a((q) obj2, (c3.g) obj);
            case 3:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj;
                eb.a aVar = (eb.a) obj2;
                HashMap hashMap = ga.f;
                oa.b();
                int i11 = na.a;
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
                    Object e9 = mobileVisionBase.b.e(aVar);
                    gaVar.close();
                    return e9;
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

    public /* synthetic */ m(MobileVisionBase mobileVisionBase, eb.a aVar) {
        this.a = 3;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
