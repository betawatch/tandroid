package cb;

import android.content.Context;
import androidx.emoji2.text.w;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h {
    public static final Object b = new Object();
    public static h c;
    public c9.i a;

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
            ArrayList w10 = new bf.b(16, context, new ja.c(MlKitComponentDiscoveryService.class, 4)).w();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            w wVar = c9.f.g;
            arrayList.addAll(w10);
            arrayList2.add(c9.b.c(context, Context.class, new Class[0]));
            arrayList2.add(c9.b.c(hVar2, h.class, new Class[0]));
            c9.i iVar = new c9.i(executor, arrayList, arrayList2, wVar);
            hVar2.a = iVar;
            iVar.g(true);
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
