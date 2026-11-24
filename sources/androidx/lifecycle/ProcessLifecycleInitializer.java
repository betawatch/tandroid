package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements pp5 {
    @Override // pp5
    public final List a() {
        return n34.a;
    }

    @Override // pp5
    public final Object b(Context context) {
        context.getClass();
        mx6 P = mx6.P(context);
        P.getClass();
        if (!((HashSet) P.c).contains(ProcessLifecycleInitializer.class)) {
            dq9.m("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!a36.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new z26());
        }
        fn8 fn8Var = fn8.r;
        fn8Var.getClass();
        fn8Var.e = new Handler();
        fn8Var.f.e(u26.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new en8(fn8Var));
        return fn8Var;
    }
}
