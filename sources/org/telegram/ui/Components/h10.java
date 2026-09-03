package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class h10 implements Application.ActivityLifecycleCallbacks {
    private static h10 Instance;
    private int refs;
    private boolean wasInBackground = true;
    private long enterBackgroundTime = 0;
    private CopyOnWriteArrayList<g10> listeners = new CopyOnWriteArrayList<>();

    public h10(Application application) {
        Instance = this;
        application.registerActivityLifecycleCallbacks(this);
    }

    public static h10 getInstance() {
        return Instance;
    }

    public void addListener(g10 g10Var) {
        this.listeners.add(g10Var);
    }

    public boolean isBackground() {
        return this.refs == 0;
    }

    public boolean isForeground() {
        return this.refs > 0;
    }

    public boolean isWasInBackground(boolean z4) {
        if (z4 && SystemClock.elapsedRealtime() - this.enterBackgroundTime < 200) {
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
            Iterator<g10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameForeground();
                } catch (Exception e6) {
                    FileLog.e(e6);
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
            Iterator<g10> it = this.listeners.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onBecameBackground();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public void removeListener(g10 g10Var) {
        this.listeners.remove(g10Var);
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
