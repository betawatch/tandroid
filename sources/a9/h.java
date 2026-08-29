package a9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements z9.b {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // z9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                return ExecutorsRegistrar.a();
            case 3:
                q qVar = ExecutorsRegistrar.a;
                return new b9.h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new b9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                q qVar2 = ExecutorsRegistrar.a;
                return new b9.h(Executors.newCachedThreadPool(new b9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                q qVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new b9.a("Firebase Scheduler", 0, null));
        }
    }
}
