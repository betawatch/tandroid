package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import androidx.car.app.ICarApp;
import androidx.car.app.navigation.NavigationManager;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.car.app.utils.ThreadUtils;
import androidx.car.app.validation.HostValidator;
import androidx.car.app.versioning.CarAppApiLevels;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import j$.util.Objects;
import java.security.InvalidParameterException;

/* loaded from: classes.dex */
final class CarAppBinder extends ICarApp.Stub {
    private Session mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private HostValidator mHostValidator;
    private CarAppService mService;

    CarAppBinder(CarAppService carAppService, SessionInfo sessionInfo) {
        this.mService = carAppService;
        this.mCurrentSessionInfo = sessionInfo;
    }

    void destroy() {
        onDestroyLifecycle();
        this.mCurrentSession = null;
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    void onDestroyLifecycle() {
        Session session = this.mCurrentSession;
        if (session != null) {
            session.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate intent: " + intent);
        }
        RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onAppCreate", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda4
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppCreate$0;
                lambda$onAppCreate$0 = CarAppBinder.this.lambda$onAppCreate$0(iCarHost, configuration, intent);
                return lambda$onAppCreate$0;
            }
        });
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate completed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        Session session = this.mCurrentSession;
        if (session == null || session.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            SessionInfo sessionInfo = this.mCurrentSessionInfo;
            Objects.requireNonNull(sessionInfo);
            session = carAppService.onCreateSession(sessionInfo);
            this.mCurrentSession = session;
        }
        Session session2 = session;
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        Objects.requireNonNull(handshakeInfo);
        HostInfo hostInfo = carAppService.getHostInfo();
        Objects.requireNonNull(hostInfo);
        session2.configure(carAppService, handshakeInfo, hostInfo, iCarHost, configuration);
        LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) session2.getLifecycle();
        Lifecycle.State currentState = lifecycleRegistry.getCurrentState();
        int size = ((ScreenManager) session2.getCarContext().getCarService(ScreenManager.class)).getScreenStackInternal().size();
        if (!currentState.isAtLeast(Lifecycle.State.CREATED) || size < 1) {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "onAppCreate the app was not yet created or the screen stack was empty state: " + lifecycleRegistry.getCurrentState() + ", stack size: " + size);
            }
            session2.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            ((ScreenManager) session2.getCarContext().getCarService(ScreenManager.class)).push(session2.onCreateScreen(intent));
            return null;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onAppCreate the app was already created");
        }
        onNewIntentInternal(session2, intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppStart$1;
                lambda$onAppStart$1 = CarAppBinder.this.lambda$onAppStart$1();
                return lambda$onAppStart$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda7
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppResume$2;
                lambda$onAppResume$2 = CarAppBinder.this.lambda$onAppResume$2();
                return lambda$onAppResume$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppPause$3;
                lambda$onAppPause$3 = CarAppBinder.this.lambda$onAppPause$3();
                return lambda$onAppPause$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda3
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onAppStop$4;
                lambda$onAppStop$4 = CarAppBinder.this.lambda$onAppStop$4();
                return lambda$onAppStop$4;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        session.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda6
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onNewIntent$5;
                lambda$onNewIntent$5 = CarAppBinder.this.lambda$onNewIntent$5(intent);
                return lambda$onNewIntent$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        onNewIntentInternal(session, intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        RemoteUtils.dispatchCallFromHost(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onConfigurationChanged$6;
                lambda$onConfigurationChanged$6 = CarAppBinder.this.lambda$onConfigurationChanged$6(configuration);
                return lambda$onConfigurationChanged$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        onConfigurationChangedInternal(session, configuration);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppBinder$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                CarAppBinder.this.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        Session session = this.mCurrentSession;
        Objects.requireNonNull(session);
        str.hashCode();
        if (str.equals("app")) {
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getManager", ((AppManager) session.getCarContext().getCarService(AppManager.class)).getIInterface());
            return;
        }
        if (str.equals("navigation")) {
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getManager", ((NavigationManager) session.getCarContext().getCarService(NavigationManager.class)).getIInterface());
            return;
        }
        Log.e("CarApp", str + "%s is not a valid manager");
        RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "getManager", new InvalidParameterException(str + " is not a valid manager type"));
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        try {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "getAppInfo", carAppService.getAppInfo());
        } catch (IllegalArgumentException e) {
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "getAppInfo", e);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(Bundleable bundleable, IOnDoneCallback iOnDoneCallback) {
        CarAppService carAppService = this.mService;
        Objects.requireNonNull(carAppService);
        try {
            HandshakeInfo handshakeInfo = (HandshakeInfo) bundleable.get();
            String hostPackageName = handshakeInfo.getHostPackageName();
            int callingUid = Binder.getCallingUid();
            HostInfo hostInfo = new HostInfo(hostPackageName, callingUid);
            if (!getHostValidator().isValidHost(hostInfo)) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Unknown host '" + hostPackageName + "', uid:" + callingUid));
                return;
            }
            AppInfo appInfo = carAppService.getAppInfo();
            int minCarAppApiLevel = appInfo.getMinCarAppApiLevel();
            int latestCarAppApiLevel = appInfo.getLatestCarAppApiLevel();
            int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
            if (minCarAppApiLevel > hostCarAppApiLevel) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is less than the app's min API level (" + minCarAppApiLevel + ")"));
                return;
            }
            if (latestCarAppApiLevel < hostCarAppApiLevel) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is greater than the app's max API level (" + latestCarAppApiLevel + ")"));
                return;
            }
            carAppService.setHostInfo(hostInfo);
            this.mHandshakeInfo = handshakeInfo;
            RemoteUtils.sendSuccessResponseToHost(iOnDoneCallback, "onHandshakeCompleted", null);
        } catch (BundlerException e) {
            e = e;
            carAppService.setHostInfo(null);
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            carAppService.setHostInfo(null);
            RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "onHandshakeCompleted", e);
        }
    }

    private Lifecycle getCurrentLifecycle() {
        Session session = this.mCurrentSession;
        if (session == null) {
            return null;
        }
        return session.getLifecycle();
    }

    private HostValidator getHostValidator() {
        if (this.mHostValidator == null) {
            CarAppService carAppService = this.mService;
            Objects.requireNonNull(carAppService);
            this.mHostValidator = carAppService.createHostValidator();
        }
        return this.mHostValidator;
    }

    private void onNewIntentInternal(Session session, Intent intent) {
        ThreadUtils.checkMainThread();
        session.onNewIntent(intent);
    }

    private void onConfigurationChangedInternal(Session session, Configuration configuration) {
        ThreadUtils.checkMainThread();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onCarConfigurationChanged configuration: " + configuration);
        }
        session.onCarConfigurationChangedInternal(configuration);
    }

    void onAutoDriveEnabled() {
        Session session = this.mCurrentSession;
        if (session != null) {
            ((NavigationManager) session.getCarContext().getCarService(NavigationManager.class)).onAutoDriveEnabled();
        }
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (!CarAppApiLevels.isValid(hostCarAppApiLevel)) {
            throw new IllegalArgumentException("Invalid Car App API level received: " + hostCarAppApiLevel);
        }
        this.mHandshakeInfo = handshakeInfo;
    }

    HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    Session getCurrentSession() {
        return this.mCurrentSession;
    }

    SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }
}
