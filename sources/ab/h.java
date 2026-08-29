package ab;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h {
    public static final Object b = new Object();
    public static h c;
    public a9.j a;

    public static h c() {
        h hVar;
        synchronized (b) {
            z5.l.j("MlKitContext has not been initialized", c != null);
            hVar = c;
            z5.l.h(hVar);
        }
        return hVar;
    }

    public static h d(Context context, Executor executor) {
        h hVar;
        synchronized (b) {
            z5.l.j("MlKitContext is already initialized", c == null);
            h hVar2 = new h();
            c = hVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList o10 = new ze.b(context, new m5.i(MlKitComponentDiscoveryService.class, 1)).o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a9.f fVar = a9.g.g;
            arrayList.addAll(o10);
            arrayList2.add(a9.b.c(context, Context.class, new Class[0]));
            arrayList2.add(a9.b.c(hVar2, h.class, new Class[0]));
            a9.j jVar = new a9.j(executor, arrayList, arrayList2, fVar);
            hVar2.a = jVar;
            jVar.h(true);
            hVar = c;
        }
        return hVar;
    }

    public final Object a(Class cls) {
        z5.l.j("MlKitContext has been deleted", c == this);
        z5.l.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
