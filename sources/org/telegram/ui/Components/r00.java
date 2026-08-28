package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class r00 implements Application.ActivityLifecycleCallbacks {
    private static r00 Instance;
    private int refs;
    private boolean wasInBackground = true;
    private long enterBackgroundTime = 0;
    private CopyOnWriteArrayList<q00> listeners = new CopyOnWriteArrayList<>();

    public r00(Application application) {
        Instance = this;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static r00 getInstance() {
        return Instance;
    }

    public void addListener(q00 q00Var) {
        this.listeners.add(q00Var);
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
        int i9 = this.refs + 1;
        this.refs = i9;
        if (i9 == 1) {
            if (SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
                this.wasInBackground = false;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to foreground");
            }
            Iterator<q00> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameForeground();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i9 = this.refs - 1;
        this.refs = i9;
        if (i9 == 0) {
            this.enterBackgroundTime = SystemClock.elapsedRealtime();
            this.wasInBackground = true;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("switch to background");
            }
            Iterator<q00> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameBackground();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public void removeListener(q00 q00Var) {
        this.listeners.remove(q00Var);
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
