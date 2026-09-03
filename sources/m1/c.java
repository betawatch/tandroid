package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import dd.l;
import java.util.List;
import k1.d0;
import k7.s7;
import ld.c0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final l b;
    public final c0 c;
    public final Object d;
    public volatile bb.b e;

    public c(String name, l lVar, c0 c0Var) {
        kotlin.jvm.internal.j.e(name, "name");
        this.a = name;
        this.b = lVar;
        this.c = c0Var;
        this.d = new Object();
    }

    public final bb.b a(Object obj, hd.g property) {
        bb.b bVar;
        Context thisRef = (Context) obj;
        kotlin.jvm.internal.j.e(thisRef, "thisRef");
        kotlin.jvm.internal.j.e(property, "property");
        bb.b bVar2 = this.e;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    l lVar = this.b;
                    kotlin.jvm.internal.j.d(applicationContext, "applicationContext");
                    List migrations = (List) lVar.invoke(applicationContext);
                    c0 c0Var = this.c;
                    b bVar3 = new b(applicationContext, this);
                    kotlin.jvm.internal.j.e(migrations, "migrations");
                    this.e = new bb.b(new d0(new k0(bVar3, 2), s7.a(new k1.c(migrations, (uc.c) null, 0)), new cb.b(11), c0Var), 27);
                }
                bVar = this.e;
                kotlin.jvm.internal.j.b(bVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
