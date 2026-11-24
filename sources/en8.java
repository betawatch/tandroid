// default package

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class en8 extends h34 {
    final /* synthetic */ fn8 this$0;

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    public static final class a extends h34 {
        final /* synthetic */ fn8 this$0;

        public a(fn8 fn8Var) {
            this.this$0 = fn8Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            fn8 fn8Var = this.this$0;
            int i = fn8Var.a + 1;
            fn8Var.a = i;
            if (i == 1 && fn8Var.d) {
                fn8Var.f.e(u26.ON_START);
                fn8Var.d = false;
            }
        }
    }

    public en8(fn8 fn8Var) {
        this.this$0 = fn8Var;
    }

    @Override // h34, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = ga9.b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            findFragmentByTag.getClass();
            ((ga9) findFragmentByTag).a = this.this$0.n;
        }
    }

    @Override // h34, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        fn8 fn8Var = this.this$0;
        int i = fn8Var.b - 1;
        fn8Var.b = i;
        if (i == 0) {
            Handler handler = fn8Var.e;
            handler.getClass();
            handler.postDelayed(fn8Var.h, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        dn8.a(activity, new a(this.this$0));
    }

    @Override // h34, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        fn8 fn8Var = this.this$0;
        int i = fn8Var.a - 1;
        fn8Var.a = i;
        if (i == 0 && fn8Var.c) {
            fn8Var.f.e(u26.ON_STOP);
            fn8Var.d = true;
        }
    }
}
