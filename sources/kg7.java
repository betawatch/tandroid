// default package

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kg7 {
    public static final Object b = new Object();
    public static kg7 c;
    public xq2 a;

    public static kg7 c() {
        kg7 kg7Var;
        synchronized (b) {
            xve.j("MlKitContext has not been initialized", c != null);
            kg7Var = c;
            xve.h(kg7Var);
        }
        return kg7Var;
    }

    public static kg7 d(Context context, Executor executor) {
        kg7 kg7Var;
        synchronized (b) {
            xve.j("MlKitContext is already initialized", c == null);
            kg7 kg7Var2 = new kg7();
            c = kg7Var2;
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
            arrayList2.add(fq2.c(kg7Var2, kg7.class, new Class[0]));
            xq2 xq2Var = new xq2(executor, arrayList, arrayList2, c22Var);
            kg7Var2.a = xq2Var;
            xq2Var.o(true);
            kg7Var = c;
        }
        return kg7Var;
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
