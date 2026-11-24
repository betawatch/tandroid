package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements pn5 {
    @Override // pn5
    public final List a() {
        return c24.a;
    }

    @Override // pn5
    public final Object b(Context context) {
        context.getClass();
        mv6 N = mv6.N(context);
        N.getClass();
        if (!((HashSet) N.c).contains(ProcessLifecycleInitializer.class)) {
            sc8.j("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!a16.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new z06());
        }
        dl8 dl8Var = dl8.r;
        dl8Var.getClass();
        dl8Var.e = new Handler();
        dl8Var.f.e(u06.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new cl8(dl8Var));
        return dl8Var;
    }
}
