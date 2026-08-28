package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d0 extends g {
    final /* synthetic */ e0 this$0;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static final class a extends g {
        final /* synthetic */ e0 this$0;

        public a(e0 e0Var) {
            this.this$0 = e0Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            kotlin.jvm.internal.i.e(activity, "activity");
            e0 e0Var = this.this$0;
            int i9 = e0Var.a + 1;
            e0Var.a = i9;
            if (i9 == 1 && e0Var.d) {
                e0Var.f.e(m.ON_START);
                e0Var.d = false;
            }
        }
    }

    public d0(e0 e0Var) {
        this.this$0 = e0Var;
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i9 = h0.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            kotlin.jvm.internal.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((h0) findFragmentByTag).a = this.this$0.n;
        }
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i9 = e0Var.b - 1;
        e0Var.b = i9;
        if (i9 == 0) {
            Handler handler = e0Var.e;
            kotlin.jvm.internal.i.b(handler);
            handler.postDelayed(e0Var.h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.e(activity, "activity");
        c0.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        e0 e0Var = this.this$0;
        int i9 = e0Var.a - 1;
        e0Var.a = i9;
        if (i9 == 0 && e0Var.c) {
            e0Var.f.e(m.ON_STOP);
            e0Var.d = true;
        }
    }
}
