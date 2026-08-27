package m1;

import ad.l;
import android.content.Context;
import androidx.lifecycle.k0;
import h7.q6;
import ia.m;
import id.c0;
import java.util.List;
import k1.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile n1.d e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final n1.d a(Object obj, ed.g property) {
        n1.d dVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        n1.d dVar2 = this.e;
        if (dVar2 != null) {
            return dVar2;
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
                    this.e = new n1.d(new z(new k0(bVar, 2), q6.a(new m(migrations, null, 3)), new w9.d(12), c0Var), 0);
                }
                dVar = this.e;
                kotlin.jvm.internal.j.b(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }
}
