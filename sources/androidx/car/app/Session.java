package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class Session implements LifecycleOwner {
    private CarContext mCarContext;
    private final LifecycleObserver mLifecycleObserver;
    private LifecycleRegistry mRegistry;
    final LifecycleRegistry mRegistryPublic;

    public void onCarConfigurationChanged(Configuration configuration) {
    }

    public abstract Screen onCreateScreen(Intent intent);

    public void onNewIntent(Intent intent) {
    }

    public Session() {
        LifecycleObserverImpl lifecycleObserverImpl = new LifecycleObserverImpl();
        this.mLifecycleObserver = lifecycleObserverImpl;
        this.mRegistry = new LifecycleRegistry(this);
        this.mRegistryPublic = new LifecycleRegistry(this);
        this.mRegistry.addObserver(lifecycleObserverImpl);
        this.mCarContext = CarContext.create(this.mRegistry);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mRegistryPublic;
    }

    void handleLifecycleEvent(Lifecycle.Event event) {
        this.mRegistry.handleLifecycleEvent(event);
    }

    public final CarContext getCarContext() {
        CarContext carContext = this.mCarContext;
        Objects.requireNonNull(carContext);
        return carContext;
    }

    void configure(Context context, HandshakeInfo handshakeInfo, HostInfo hostInfo, ICarHost iCarHost, Configuration configuration) {
        this.mCarContext.updateHandshakeInfo(handshakeInfo);
        this.mCarContext.updateHostInfo(hostInfo);
        this.mCarContext.attachBaseContext(context, configuration);
        this.mCarContext.setCarHost(iCarHost);
    }

    void onCarConfigurationChangedInternal(Configuration configuration) {
        this.mCarContext.onCarConfigurationChanged(configuration);
        onCarConfigurationChanged(this.mCarContext.getResources().getConfiguration());
    }

    class LifecycleObserverImpl implements DefaultLifecycleObserver {
        LifecycleObserverImpl() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onCreate(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onPause(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            Session.this.mRegistryPublic.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
