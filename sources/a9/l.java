package a9;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements y9.b {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    @Override // y9.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return ExecutorsRegistrar.a();
            case 1:
                z8.m mVar = ExecutorsRegistrar.a;
                return new h(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                z8.m mVar2 = ExecutorsRegistrar.a;
                return new h(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                z8.m mVar3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new a("Firebase Scheduler", 0, null));
            case 4:
                return Collections.EMPTY_SET;
            default:
                return null;
        }
    }
}
