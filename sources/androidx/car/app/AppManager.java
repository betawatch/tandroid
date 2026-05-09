package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.AppManager;
import androidx.car.app.IAppManager;
import androidx.car.app.managers.Manager;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.BundlerException;
import androidx.car.app.utils.RemoteUtils;
import androidx.core.location.LocationListenerCompat;
import androidx.lifecycle.Lifecycle;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
public class AppManager implements Manager {
    private final IAppManager.Stub mAppManager;
    private final CarContext mCarContext;
    private final HostDispatcher mHostDispatcher;
    private final Lifecycle mLifecycle;
    final HandlerThread mLocationUpdateHandlerThread = new HandlerThread("LocationUpdateThread");
    private final LocationListenerCompat mLocationListener = new LocationListenerCompat() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda2
        @Override // android.location.LocationListener
        public /* synthetic */ void onFlushComplete(int i) {
            LocationListenerCompat.-CC.$default$onFlushComplete(this, i);
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            AppManager.this.lambda$new$7(location);
        }

        @Override // android.location.LocationListener
        public /* synthetic */ void onLocationChanged(List list) {
            LocationListenerCompat.-CC.$default$onLocationChanged(this, list);
        }

        @Override // android.location.LocationListener
        public /* synthetic */ void onProviderDisabled(String str) {
            LocationListenerCompat.-CC.$default$onProviderDisabled(this, str);
        }

        @Override // android.location.LocationListener
        public /* synthetic */ void onProviderEnabled(String str) {
            LocationListenerCompat.-CC.$default$onProviderEnabled(this, str);
        }

        @Override // android.location.LocationListener
        public /* synthetic */ void onStatusChanged(String str, int i, Bundle bundle) {
            LocationListenerCompat.-CC.$default$onStatusChanged(this, str, i, bundle);
        }
    };

    public void invalidate() {
        this.mHostDispatcher.dispatch("app", "invalidate", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda1
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                Object lambda$invalidate$1;
                lambda$invalidate$1 = AppManager.lambda$invalidate$1((IAppHost) obj);
                return lambda$invalidate$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$invalidate$1(IAppHost iAppHost) {
        iAppHost.invalidate();
        return null;
    }

    public OpenMicrophoneResponse openMicrophone(final OpenMicrophoneRequest openMicrophoneRequest) {
        try {
            return (OpenMicrophoneResponse) this.mHostDispatcher.dispatchForResult("app", "openMicrophone", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda0
                @Override // androidx.car.app.HostCall
                public final Object dispatch(Object obj) {
                    OpenMicrophoneResponse lambda$openMicrophone$5;
                    lambda$openMicrophone$5 = AppManager.lambda$openMicrophone$5(OpenMicrophoneRequest.this, (IAppHost) obj);
                    return lambda$openMicrophone$5;
                }
            });
        } catch (RemoteException e) {
            Log.e("CarApp", "Error getting microphone bytes from host", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ OpenMicrophoneResponse lambda$openMicrophone$5(OpenMicrophoneRequest openMicrophoneRequest, IAppHost iAppHost) {
        try {
            Bundleable openMicrophone = iAppHost.openMicrophone(Bundleable.create(openMicrophoneRequest));
            if (openMicrophone == null) {
                return null;
            }
            return (OpenMicrophoneResponse) openMicrophone.get();
        } catch (BundlerException e) {
            Log.e("CarApp", "Cannot open microphone", e);
            return null;
        }
    }

    IAppManager.Stub getIInterface() {
        return this.mAppManager;
    }

    Lifecycle getLifecycle() {
        return this.mLifecycle;
    }

    void startLocationUpdates() {
        stopLocationUpdates();
        ((LocationManager) this.mCarContext.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, this.mLocationListener, this.mLocationUpdateHandlerThread.getLooper());
    }

    void stopLocationUpdates() {
        ((LocationManager) this.mCarContext.getSystemService("location")).removeUpdates(this.mLocationListener);
    }

    static AppManager create(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        Objects.requireNonNull(carContext);
        Objects.requireNonNull(hostDispatcher);
        Objects.requireNonNull(lifecycle);
        return new AppManager(carContext, hostDispatcher, lifecycle);
    }

    protected AppManager(CarContext carContext, HostDispatcher hostDispatcher, Lifecycle lifecycle) {
        this.mCarContext = carContext;
        this.mHostDispatcher = hostDispatcher;
        this.mLifecycle = lifecycle;
        this.mAppManager = new 1(carContext);
    }

    class 1 extends IAppManager.Stub {
        final /* synthetic */ CarContext val$carContext;

        1(CarContext carContext) {
            this.val$carContext = carContext;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final ScreenManager screenManager = (ScreenManager) this.val$carContext.getCarService(ScreenManager.class);
            Objects.requireNonNull(screenManager);
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "getTemplate", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return ScreenManager.this.getTopTemplate();
                }
            });
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final CarContext carContext = this.val$carContext;
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "onBackPressed", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onBackPressed$0;
                    lambda$onBackPressed$0 = AppManager.1.lambda$onBackPressed$0(CarContext.this);
                    return lambda$onBackPressed$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$onBackPressed$0(CarContext carContext) {
            carContext.getOnBackPressedDispatcher().onBackPressed();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            PackageManager packageManager = this.val$carContext.getPackageManager();
            boolean z = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", this.val$carContext.getPackageName()) == -1;
            boolean z2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName()) == -1;
            if (z && z2) {
                RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
            }
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final CarContext carContext = this.val$carContext;
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "startLocationUpdates", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda3
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$startLocationUpdates$1;
                    lambda$startLocationUpdates$1 = AppManager.1.lambda$startLocationUpdates$1(CarContext.this);
                    return lambda$startLocationUpdates$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$startLocationUpdates$1(CarContext carContext) {
            ((AppManager) carContext.getCarService(AppManager.class)).startLocationUpdates();
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
            Lifecycle lifecycle = AppManager.this.getLifecycle();
            final CarContext carContext = this.val$carContext;
            RemoteUtils.dispatchCallFromHost(lifecycle, iOnDoneCallback, "stopLocationUpdates", new RemoteUtils.HostCall() { // from class: androidx.car.app.AppManager$1$$ExternalSyntheticLambda2
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$stopLocationUpdates$2;
                    lambda$stopLocationUpdates$2 = AppManager.1.lambda$stopLocationUpdates$2(CarContext.this);
                    return lambda$stopLocationUpdates$2;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$stopLocationUpdates$2(CarContext carContext) {
            ((AppManager) carContext.getCarService(AppManager.class)).stopLocationUpdates();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$7(final Location location) {
        this.mHostDispatcher.dispatch("app", "sendLocation", new HostCall() { // from class: androidx.car.app.AppManager$$ExternalSyntheticLambda3
            @Override // androidx.car.app.HostCall
            public final Object dispatch(Object obj) {
                Object lambda$new$6;
                lambda$new$6 = AppManager.lambda$new$6(location, (IAppHost) obj);
                return lambda$new$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$new$6(Location location, IAppHost iAppHost) {
        iAppHost.sendLocation(location);
        return null;
    }
}
