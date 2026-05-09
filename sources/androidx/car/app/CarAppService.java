package androidx.car.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.utils.ThreadUtils;
import androidx.car.app.validation.HostValidator;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class CarAppService extends Service {
    private AppInfo mAppInfo;
    private final Map mBinders = new HashMap();
    private HostInfo mHostInfo;

    public abstract HostValidator createHostValidator();

    public abstract Session onCreateSession();

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.mBinders) {
            try {
                Iterator it = this.mBinders.values().iterator();
                while (it.hasNext()) {
                    ((CarAppBinder) it.next()).destroy();
                }
                this.mBinders.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        SessionInfo sessionInfo;
        CarAppBinder carAppBinder;
        if (SessionInfoIntentEncoder.containsSessionInfo(intent)) {
            sessionInfo = SessionInfoIntentEncoder.decode(intent);
        } else {
            sessionInfo = SessionInfo.DEFAULT_SESSION_INFO;
        }
        synchronized (this.mBinders) {
            try {
                if (!this.mBinders.containsKey(sessionInfo)) {
                    this.mBinders.put(sessionInfo, new CarAppBinder(this, sessionInfo));
                }
                CarAppBinder carAppBinder2 = (CarAppBinder) this.mBinders.get(sessionInfo);
                Objects.requireNonNull(carAppBinder2);
                carAppBinder = carAppBinder2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        final SessionInfo sessionInfo;
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "onUnbind intent: " + intent);
        }
        if (SessionInfoIntentEncoder.containsSessionInfo(intent)) {
            sessionInfo = SessionInfoIntentEncoder.decode(intent);
        } else {
            sessionInfo = SessionInfo.DEFAULT_SESSION_INFO;
        }
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                CarAppService.this.lambda$onUnbind$0(sessionInfo);
            }
        });
        if (!Log.isLoggable("CarApp", 3)) {
            return true;
        }
        Log.d("CarApp", "onUnbind completed");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onUnbind$0(SessionInfo sessionInfo) {
        synchronized (this.mBinders) {
            try {
                CarAppBinder carAppBinder = (CarAppBinder) this.mBinders.remove(sessionInfo);
                if (carAppBinder != null) {
                    carAppBinder.onDestroyLifecycle();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Session onCreateSession(SessionInfo sessionInfo) {
        return onCreateSession();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        for (String str : strArr) {
            if ("AUTO_DRIVE".equals(str)) {
                ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.CarAppService$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CarAppService.this.lambda$dump$1();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dump$1() {
        synchronized (this.mBinders) {
            try {
                for (CarAppBinder carAppBinder : this.mBinders.values()) {
                    if (Log.isLoggable("CarApp", 3)) {
                        Log.d("CarApp", "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                    }
                    carAppBinder.onAutoDriveEnabled();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HostInfo getHostInfo() {
        return this.mHostInfo;
    }

    void setHostInfo(HostInfo hostInfo) {
        this.mHostInfo = hostInfo;
    }

    AppInfo getAppInfo() {
        if (this.mAppInfo == null) {
            this.mAppInfo = AppInfo.create(this);
        }
        return this.mAppInfo;
    }
}
