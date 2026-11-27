package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements sp5 {
    @Override // sp5
    public final List a() {
        return x24.a;
    }

    @Override // sp5
    public final Object b(Context context) {
        context.getClass();
        rx6 O = rx6.O(context);
        O.getClass();
        if (!((HashSet) O.c).contains(ProcessLifecycleInitializer.class)) {
            grb.i("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!e36.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new d36());
        }
        qo8 qo8Var = qo8.r;
        qo8Var.getClass();
        qo8Var.e = new Handler();
        qo8Var.f.e(y26.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new po8(qo8Var));
        return qo8Var;
    }
}
