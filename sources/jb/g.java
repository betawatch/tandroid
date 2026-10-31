package jb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m2.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public r9.g a;

    public static g c() {
        g gVar;
        synchronized (b) {
            n6.l.i("MlKitContext has not been initialized", c != null);
            gVar = c;
            n6.l.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            n6.l.i("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList l4 = new m5.e(21, context, new t(MlKitComponentDiscoveryService.class, 20)).l();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            org.telegram.utils.twidget.t tVar = r9.e.o;
            arrayList.addAll(l4);
            arrayList2.add(r9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(r9.a.c(gVar2, g.class, new Class[0]));
            r9.g gVar3 = new r9.g(executor, arrayList, arrayList2, tVar);
            gVar2.a = gVar3;
            gVar3.f(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        n6.l.i("MlKitContext has been deleted", c == this);
        n6.l.g(this.a);
        return this.a.b(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
