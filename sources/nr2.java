// default package

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class nr2 implements nv8 {
    public final /* synthetic */ byte a;

    public /* synthetic */ nr2(byte b) {
        this.a = b;
    }

    @Override // nv8
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                e26 e26Var = ExecutorsRegistrar.a;
                return new ue3(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new j63("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                e26 e26Var2 = ExecutorsRegistrar.a;
                return new ue3(Executors.newCachedThreadPool(new j63("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                e26 e26Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new j63("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
