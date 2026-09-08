package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements v4.b {
    @Override // v4.b
    public final List a() {
        return hd.o.a;
    }

    @Override // v4.b
    public final Object b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        v4.a c10 = v4.a.c(context);
        kotlin.jvm.internal.i.d(c10, "getInstance(context)");
        if (!c10.b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!q.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.i.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new p());
        }
        e0 e0Var = e0.r;
        e0Var.getClass();
        e0Var.e = new Handler();
        e0Var.f.e(m.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new d0(e0Var));
        return e0Var;
    }
}
