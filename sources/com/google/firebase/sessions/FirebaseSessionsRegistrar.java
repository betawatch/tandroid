package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final Qualified firebaseApp = Qualified.unqualified(FirebaseApp.class);

    @Deprecated
    private static final Qualified firebaseInstallationsApi = Qualified.unqualified(FirebaseInstallationsApi.class);

    @Deprecated
    private static final Qualified backgroundDispatcher = Qualified.qualified(Background.class, CoroutineDispatcher.class);

    @Deprecated
    private static final Qualified blockingDispatcher = Qualified.qualified(Blocking.class, CoroutineDispatcher.class);

    @Deprecated
    private static final Qualified transportFactory = Qualified.unqualified(TransportFactory.class);

    @Deprecated
    private static final Qualified sessionFirelogPublisher = Qualified.unqualified(SessionFirelogPublisher.class);

    @Deprecated
    private static final Qualified sessionGenerator = Qualified.unqualified(SessionGenerator.class);

    @Deprecated
    private static final Qualified sessionsSettings = Qualified.unqualified(SessionsSettings.class);

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FirebaseSessions getComponents$lambda-0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (CoroutineContext) obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionGenerator getComponents$lambda-1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionFirelogPublisher getComponents$lambda-2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        FirebaseApp firebaseApp2 = (FirebaseApp) obj;
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[firebaseInstallationsApi]");
        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) obj2;
        Object obj3 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[sessionsSettings]");
        SessionsSettings sessionsSettings2 = (SessionsSettings) obj3;
        Provider provider = componentContainer.getProvider(transportFactory);
        Intrinsics.checkNotNullExpressionValue(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl(firebaseApp2, firebaseInstallationsApi2, sessionsSettings2, eventGDTLogger, (CoroutineContext) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionsSettings getComponents$lambda-3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (CoroutineContext) obj2, (CoroutineContext) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionDatastore getComponents$lambda-4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (CoroutineContext) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SessionLifecycleServiceBinder getComponents$lambda-5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        List<Component> listOf;
        Component.Builder name = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified qualified = firebaseApp;
        Component.Builder add = name.add(Dependency.required(qualified));
        Qualified qualified2 = sessionsSettings;
        Component.Builder add2 = add.add(Dependency.required(qualified2));
        Qualified qualified3 = backgroundDispatcher;
        Component build = add2.add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                FirebaseSessions firebaseSessions;
                firebaseSessions = FirebaseSessionsRegistrar.getComponents$lambda-0(componentContainer);
                return firebaseSessions;
            }
        }).eagerInDefaultApp().build();
        Component build2 = Component.builder(SessionGenerator.class).name("session-generator").factory(new ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                SessionGenerator sessionGenerator2;
                sessionGenerator2 = FirebaseSessionsRegistrar.getComponents$lambda-1(componentContainer);
                return sessionGenerator2;
            }
        }).build();
        Component.Builder add3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified qualified4 = firebaseInstallationsApi;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Component[]{build, build2, add3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                SessionFirelogPublisher sessionFirelogPublisher2;
                sessionFirelogPublisher2 = FirebaseSessionsRegistrar.getComponents$lambda-2(componentContainer);
                return sessionFirelogPublisher2;
            }
        }).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda3
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                SessionsSettings sessionsSettings2;
                sessionsSettings2 = FirebaseSessionsRegistrar.getComponents$lambda-3(componentContainer);
                return sessionsSettings2;
            }
        }).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda4
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                SessionDatastore sessionDatastore;
                sessionDatastore = FirebaseSessionsRegistrar.getComponents$lambda-4(componentContainer);
                return sessionDatastore;
            }
        }).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new ComponentFactory() { // from class: com.google.firebase.sessions.FirebaseSessionsRegistrar$$ExternalSyntheticLambda5
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                SessionLifecycleServiceBinder sessionLifecycleServiceBinder;
                sessionLifecycleServiceBinder = FirebaseSessionsRegistrar.getComponents$lambda-5(componentContainer);
                return sessionLifecycleServiceBinder;
            }
        }).build(), LibraryVersionComponent.create(LIBRARY_NAME, "1.2.0")});
        return listOf;
    }
}
