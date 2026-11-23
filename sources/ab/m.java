package ab;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements ua.b {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i7) {
        this.a = i7;
    }

    @Override // ua.b
    public final Object get() {
        switch (this.a) {
            case 0:
                ob.c cVar = FirebaseMessaging.m;
                return null;
            case 1:
                return Collections.EMPTY_SET;
            case 2:
                return null;
            case 3:
                return ExecutorsRegistrar.a();
            case 4:
                u9.m mVar = ExecutorsRegistrar.a;
                return new v9.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new v9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                u9.m mVar2 = ExecutorsRegistrar.a;
                return new v9.f(Executors.newCachedThreadPool(new v9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                u9.m mVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new v9.a("Firebase Scheduler", 0, null));
        }
    }
}
