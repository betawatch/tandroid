package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import dd.l;
import java.util.List;
import k1.d0;
import k7.s7;
import ld.c0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile a3.c e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final a3.c a(Object obj, hd.g property) {
        a3.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        a3.c cVar2 = this.e;
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
                    this.e = new a3.c(new d0(new k0(bVar, 2), s7.a(new k1.c(migrations, (uc.c) null, 0)), new cb.b(11), c0Var), 25);
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
