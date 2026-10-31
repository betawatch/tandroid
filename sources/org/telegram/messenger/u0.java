package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u0 implements Application.ActivityLifecycleCallbacks {
    public static u0 f;
    public int a;
    public boolean b = true;
    public long c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList e = new ArrayList();

    public u0(w0 w0Var) {
        f = this;
        w0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i10 = this.a + 1;
        this.a = i10;
        if (i10 == 1) {
            if (SystemClock.elapsedRealtime() - this.c < 200) {
                this.b = false;
            }
            if (v2.a) {
                f8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.m00) it.next()).b();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public final void b(Activity activity) {
        ArrayList arrayList = this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Activity activity2 = (Activity) ((WeakReference) arrayList.get(size)).get();
            if (activity2 == null || activity2 == activity) {
                arrayList.remove(size);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity);
        this.e.add(new WeakReference(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z10 = this.a == 0;
        a(activity);
        if (z10) {
            w0.c(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.a - 1;
        this.a = i10;
        if (i10 == 0) {
            this.c = SystemClock.elapsedRealtime();
            this.b = true;
            if (v2.a) {
                f8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.m00) it.next()).a();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
