package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import be.c0;
import java.util.List;
import k1.z;
import k2.w0;
import td.l;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile w0 e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final w0 a(Object obj, xd.g property) {
        w0 w0Var;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        w0 w0Var2 = this.e;
        if (w0Var2 != null) {
            return w0Var2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    l lVar = this.b;
                    kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    c0 c0Var = this.c;
                    b bVar = new b(applicationContext, this);
                    kotlin.jvm.internal.i.e(migrations, "migrations");
                    this.e = new w0(new z(new k0(bVar, 2), jd.h.b(new ab.l(migrations, null, 4)), new rb.b(12), c0Var), 6);
                }
                w0Var = this.e;
                kotlin.jvm.internal.i.b(w0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0Var;
    }
}
