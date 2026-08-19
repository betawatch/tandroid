package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Lazy;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    static final Lazy BG_EXECUTOR = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda2
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService scheduled;
            scheduled = ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(4, ExecutorsRegistrar.factory("Firebase Background", 10, ExecutorsRegistrar.bgPolicy())));
            return scheduled;
        }
    });
    static final Lazy LITE_EXECUTOR = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda3
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService scheduled;
            scheduled = ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.factory("Firebase Lite", 0, ExecutorsRegistrar.litePolicy())));
            return scheduled;
        }
    });
    static final Lazy BLOCKING_EXECUTOR = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda4
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService scheduled;
            scheduled = ExecutorsRegistrar.scheduled(Executors.newCachedThreadPool(ExecutorsRegistrar.factory("Firebase Blocking", 11)));
            return scheduled;
        }
    });
    static final Lazy SCHEDULER = new Lazy(new Provider() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda5
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.factory("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(Component.builder(Qualified.qualified(Background.class, ScheduledExecutorService.class), Qualified.qualified(Background.class, ExecutorService.class), Qualified.qualified(Background.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda6
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.$r8$lambda$oK_dgAjsJ4YgUN9Bhr7JxEecTHE(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(Blocking.class, ScheduledExecutorService.class), Qualified.qualified(Blocking.class, ExecutorService.class), Qualified.qualified(Blocking.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda7
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.$r8$lambda$cIc-1kmvOGchekIoFcI-gGfoNXQ(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(Lightweight.class, ScheduledExecutorService.class), Qualified.qualified(Lightweight.class, ExecutorService.class), Qualified.qualified(Lightweight.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda8
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return ExecutorsRegistrar.$r8$lambda$BlSh1XUzVcreyn-V23Qag7S-0sc(componentContainer);
            }
        }).build(), Component.builder(Qualified.qualified(UiThread.class, Executor.class)).factory(new ComponentFactory() { // from class: com.google.firebase.concurrent.ExecutorsRegistrar$$ExternalSyntheticLambda9
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                Executor executor;
                executor = UiExecutor.INSTANCE;
                return executor;
            }
        }).build());
    }

    public static /* synthetic */ ScheduledExecutorService $r8$lambda$oK_dgAjsJ4YgUN9Bhr7JxEecTHE(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) BG_EXECUTOR.get();
    }

    public static /* synthetic */ ScheduledExecutorService $r8$lambda$cIc-1kmvOGchekIoFcI-gGfoNXQ(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) BLOCKING_EXECUTOR.get();
    }

    public static /* synthetic */ ScheduledExecutorService $r8$lambda$BlSh1XUzVcreyn-V23Qag7S-0sc(ComponentContainer componentContainer) {
        return (ScheduledExecutorService) LITE_EXECUTOR.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService scheduled(ExecutorService executorService) {
        return new DelegatingScheduledExecutorService(executorService, (ScheduledExecutorService) SCHEDULER.get());
    }

    private static ThreadFactory factory(String str, int i) {
        return new CustomThreadFactory(str, i, null);
    }

    private static ThreadFactory factory(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new CustomThreadFactory(str, i, threadPolicy);
    }

    private static StrictMode.ThreadPolicy bgPolicy() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static StrictMode.ThreadPolicy litePolicy() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }
}
