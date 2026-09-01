package h2;

import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import i9.n;
import i9.p;
import i9.s;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k7.fa;
import k7.ga;
import k7.na;
import k7.oa;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ga gaVar;
        int i10 = this.a;
        boolean z4 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                return (h) ((ShortcutInfoCompatSaverImpl) obj).b.get((String) obj2);
            case 1:
                f7.b bVar = (f7.b) obj;
                n nVar = (n) bVar.c;
                Boolean bool = (Boolean) obj2;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean booleanValue = bool.booleanValue();
                    s sVar = nVar.b;
                    if (!booleanValue) {
                        sVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    sVar.h.trySetResult(null);
                    Executor executor = (Executor) nVar.e.b;
                    return ((Task) bVar.b).onSuccessTask(executor, new f7.b(this, executor, z4, 12));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                Iterator it = n9.b.e(nVar.g.b.listFiles(n.r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                n9.b bVar2 = ((n9.a) nVar.m.b).b;
                n9.a.a(n9.b.e(bVar2.d.listFiles()));
                n9.a.a(n9.b.e(bVar2.e.listFiles()));
                n9.a.a(n9.b.e(bVar2.f.listFiles()));
                nVar.q.trySetResult(null);
                return Tasks.forResult(null);
            case 2:
                n.a((n) obj, (String) obj2, Boolean.FALSE);
                return null;
            case 3:
                return p.a((p) obj, (e3.g) obj2);
            default:
                MobileVisionBase mobileVisionBase = (MobileVisionBase) obj2;
                hb.a aVar = (hb.a) obj;
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
                    Object e6 = mobileVisionBase.b.e(aVar);
                    gaVar.close();
                    return e6;
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
        }
    }

    public /* synthetic */ g(MobileVisionBase mobileVisionBase, hb.a aVar) {
        this.a = 4;
        this.b = mobileVisionBase;
        this.c = aVar;
    }
}
