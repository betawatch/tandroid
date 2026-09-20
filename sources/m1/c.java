package m1;

import android.content.Context;
import androidx.lifecycle.k0;
import java.util.List;
import k1.a0;
import k2.u;
import rd.l;
import zd.c0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
