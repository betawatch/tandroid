// default package

import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ae7 {
    public static final Object b = new Object();
    public static ae7 c;
    public eq2 a;

    public static ae7 c() {
        ae7 ae7Var;
        synchronized (b) {
            fre.j("MlKitContext has not been initialized", c != null);
            ae7Var = c;
            fre.h(ae7Var);
        }
        return ae7Var;
    }

    public static ae7 d(Context context, Executor executor) {
        ae7 ae7Var;
        synchronized (b) {
            fre.j("MlKitContext is already initialized", c == null);
            ae7 ae7Var2 = new ae7();
            c = ae7Var2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList v = new tg2(context, new qx4(MlKitComponentDiscoveryService.class), (byte) 17).v();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            k32 k32Var = bq2.q;
            arrayList.addAll(v);
            arrayList2.add(mp2.c(context, Context.class, new Class[0]));
            arrayList2.add(mp2.c(ae7Var2, ae7.class, new Class[0]));
            eq2 eq2Var = new eq2(executor, arrayList, arrayList2, k32Var);
            ae7Var2.a = eq2Var;
            eq2Var.p(true);
            ae7Var = c;
        }
        return ae7Var;
    }

    public final Object a(Class cls) {
        fre.j("MlKitContext has been deleted", c == this);
        fre.h(this.a);
        return this.a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
