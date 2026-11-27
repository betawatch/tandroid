// default package

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jg7 {
    public static final Object b = new Object();
    public static jg7 c;
    public xq2 a;

    public static jg7 c() {
        jg7 jg7Var;
        synchronized (b) {
            xve.j("MlKitContext has not been initialized", c != null);
            jg7Var = c;
            xve.h(jg7Var);
        }
        return jg7Var;
    }

    public static jg7 d(Context context, Executor executor) {
        jg7 jg7Var;
        synchronized (b) {
            xve.j("MlKitContext is already initialized", c == null);
            jg7 jg7Var2 = new jg7();
            c = jg7Var2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList q = new lh2(context, new ri6(MlKitComponentDiscoveryService.class, (byte) 20), (byte) 17).q();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            c22 c22Var = uq2.q;
            arrayList.addAll(q);
            arrayList2.add(fq2.c(context, Context.class, new Class[0]));
            arrayList2.add(fq2.c(jg7Var2, jg7.class, new Class[0]));
            xq2 xq2Var = new xq2(executor, arrayList, arrayList2, c22Var);
            jg7Var2.a = xq2Var;
            xq2Var.o(true);
            jg7Var = c;
        }
        return jg7Var;
    }

    public final Object a(Class cls) {
        xve.j("MlKitContext has been deleted", c == this);
        xve.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
