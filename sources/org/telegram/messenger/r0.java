package org.telegram.messenger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r0 implements Application.ActivityLifecycleCallbacks {
    public static r0 f;
    public int a;
    public boolean b = true;
    public long c = 0;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final ArrayList e = new ArrayList();

    public r0(t0 t0Var) {
        f = this;
        t0Var.registerActivityLifecycleCallbacks(this);
    }

    public final void a(Activity activity) {
        int i7 = this.a + 1;
        this.a = i7;
        if (i7 == 1) {
            if (SystemClock.elapsedRealtime() - this.c < 200) {
                this.b = false;
            }
            if (r2.a) {
                a8.b("switch to foreground");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.yz) it.next()).b();
                } catch (Exception e10) {
                    a8.g(e10, true);
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
        boolean z9 = this.a == 0;
        a(activity);
        if (z9) {
            t0.c(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i7 = this.a - 1;
        this.a = i7;
        if (i7 == 0) {
            this.c = SystemClock.elapsedRealtime();
            this.b = true;
            if (r2.a) {
                a8.b("switch to background");
            }
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((org.telegram.ui.Components.yz) it.next()).a();
                } catch (Exception e10) {
                    a8.g(e10, true);
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
