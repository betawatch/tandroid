package c9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ba.b {
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    @Override // ba.b
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
                return new d9.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new d9.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                q qVar2 = ExecutorsRegistrar.a;
                return new d9.g(Executors.newCachedThreadPool(new d9.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            default:
                q qVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new d9.a("Firebase Scheduler", 0, null));
        }
    }
}
