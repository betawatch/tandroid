package cb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h {
    public static final Object b = new Object();
    public static h c;
    public c9.j a;

    public static h c() {
        h hVar;
        synchronized (b) {
            b6.m.j("MlKitContext has not been initialized", c != null);
            hVar = c;
            b6.m.h(hVar);
        }
        return hVar;
    }

    public static h d(Context context, Executor executor) {
        h hVar;
        synchronized (b) {
            b6.m.j("MlKitContext is already initialized", c == null);
            h hVar2 = new h();
            c = hVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList w10 = new af.c(16, context, new c9.e(MlKitComponentDiscoveryService.class)).w();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            af.a aVar = c9.g.g;
            arrayList.addAll(w10);
            arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
            arrayList2.add(c9.b.c(hVar2, h.class, new Class[0]));
            c9.j jVar = new c9.j(executor, arrayList, arrayList2, aVar);
            hVar2.a = jVar;
            jVar.h(true);
            hVar = c;
        }
        return hVar;
    }

    public final Object a(Class cls) {
        b6.m.j("MlKitContext has been deleted", c == this);
        b6.m.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
