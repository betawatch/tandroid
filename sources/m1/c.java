package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import g7.o6;
import hd.c0;
import java.util.List;
import k1.z;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile android.support.v4.media.c e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final android.support.v4.media.c a(Object obj, dd.g property) {
        android.support.v4.media.c cVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        android.support.v4.media.c cVar2 = this.e;
        if (cVar2 != null) {
            return cVar2;
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
                    this.e = new android.support.v4.media.c(new z(new k0(bVar, 2), o6.a(new ha.l(migrations, null, 4)), new v9.d(13), c0Var), 29);
                }
                cVar = this.e;
                kotlin.jvm.internal.i.b(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
