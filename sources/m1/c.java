package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import k2.u;
import rd.l;
import zd.c0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile u e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final u a(Object obj, vd.g property) {
        u uVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        u uVar2 = this.e;
        if (uVar2 != null) {
            return uVar2;
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
                    this.e = new u(new a0(new k0(bVar, 2), hd.h.b(new bb.i(migrations, null, 1)), new na.d(12), c0Var), 6);
                }
                uVar = this.e;
                kotlin.jvm.internal.i.b(uVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }
}
