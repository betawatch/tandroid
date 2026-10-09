package m1;

import ae.d0;
import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import m2.t;
import sd.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final d0 c;
    public final Object d;
    public volatile t e;

    public c(String name, l lVar, d0 d0Var) {
        kotlin.jvm.internal.i.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = d0Var;
        this.d = new Object();
    }

    public final t a(Object obj, wd.g property) {
        t tVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.i.e(thisRef, "thisRef");
        kotlin.jvm.internal.i.e(property, "property");
        t tVar2 = this.e;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    l lVar = this.b;
                    kotlin.jvm.internal.i.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    d0 d0Var = this.c;
                    b bVar = new b(applicationContext, this);
                    kotlin.jvm.internal.i.e(migrations, "migrations");
                    this.e = new t(new a0(new k0(bVar, 2), id.h.b(new bb.i(migrations, null, 1)), new na.d(12), d0Var), 1);
                }
                tVar = this.e;
                kotlin.jvm.internal.i.b(tVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }
}
