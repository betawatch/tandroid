package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class g10 implements Application.ActivityLifecycleCallbacks {
    private static g10 Instance;
    private int refs;
    private boolean wasInBackground = true;
    private long enterBackgroundTime = 0;
    private CopyOnWriteArrayList<f10> listeners = new CopyOnWriteArrayList<>();

    public g10(Application application) {
        Instance = this;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static g10 getInstance() {
        return Instance;
    }

    public void addListener(f10 f10Var) {
        this.listeners.add(f10Var);
    }

    public boolean isBackground() {
        return this.refs == 0;
    }

    public boolean isForeground() {
        return this.refs > 0;
    }

    public boolean isWasInBackground(boolean z10) {
        if (z10 && SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
            this.wasInBackground = false;
        }
        return this.wasInBackground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i10 = this.refs + 1;
        this.refs = i10;
        if (i10 == 1) {
            if (SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
                this.wasInBackground = false;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to foreground");
            }
            Iterator<f10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameForeground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i10 = this.refs - 1;
        this.refs = i10;
        if (i10 == 0) {
            this.enterBackgroundTime = SystemClock.elapsedRealtime();
            this.wasInBackground = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to background");
            }
            Iterator<f10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameBackground();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        }
    }

    public void removeListener(f10 f10Var) {
        this.listeners.remove(f10Var);
    }

    public void resetBackgroundVar() {
        this.wasInBackground = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
