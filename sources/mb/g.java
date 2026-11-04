package mb;

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import m2.t;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g {
    public static final Object b = new Object();
    public static g c;
    public t9.g a;

    public static g c() {
        g gVar;
        synchronized (b) {
            p6.m.i("MlKitContext has not been initialized", c != null);
            gVar = c;
            p6.m.g(gVar);
        }
        return gVar;
    }

    public static g d(Context context, Executor executor) {
        g gVar;
        synchronized (b) {
            p6.m.i("MlKitContext is already initialized", c == null);
            g gVar2 = new g();
            c = gVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList l02 = new t(context, new i9(MlKitComponentDiscoveryService.class, 20), false, 26).l0();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            s0.b bVar = t9.e.A;
            arrayList.addAll(l02);
            arrayList2.add(t9.a.c(context, Context.class, new Class[0]));
            arrayList2.add(t9.a.c(gVar2, g.class, new Class[0]));
            t9.g gVar3 = new t9.g(executor, arrayList, arrayList2, bVar);
            gVar2.a = gVar3;
            gVar3.h(true);
            gVar = c;
        }
        return gVar;
    }

    public final Object a(Class cls) {
        p6.m.i("MlKitContext has been deleted", c == this);
        p6.m.g(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
