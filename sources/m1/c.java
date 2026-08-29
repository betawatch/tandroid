package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import bd.l;
import i7.m7;
import java.util.List;
import jd.c0;
import k1.a0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile za.c e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final za.c a(Object obj, fd.g property) {
        za.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        za.c cVar2 = this.e;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    l lVar = this.b;
                    kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    c0 c0Var = this.c;
                    b bVar = new b(applicationContext, this);
                    kotlin.jvm.internal.j.e(migrations, "migrations");
                    this.e = new za.c(new a0(new k0(bVar, 2), m7.a(new ja.l(migrations, null, 3)), new ab.b(12), c0Var), 27);
                }
                cVar = this.e;
                kotlin.jvm.internal.j.b(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
