package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements i2.b {
    @Override // i2.b
    public final List a() {
        return pc.o.a;
    }

    @Override // i2.b
    public final Object b(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        i2.a c10 = i2.a.c(context);
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
