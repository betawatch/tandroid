package ka;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.k0;
import c8.d0;
import c8.m0;
import com.google.android.gms.internal.play_billing.s0;
import h9.f1;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import m1.e0;
import m1.f0;
import o1.e;
import p1.i;
import q1.h;
import rd.l;
import vd.g;
import zd.b0;
import zd.j0;
import zd.t1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ g[] d;
    public final String a;
    public final ThreadLocal b;
    public final q1.d c;

    static {
        m mVar = new m(kotlin.jvm.internal.c.NO_RECEIVER, d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s.a.getClass();
        d = new g[]{mVar};
    }

    public d(Context context, String name) {
        q1.d dVar;
        j.e(context, "context");
        j.e(name, "name");
        this.a = name;
        this.b = new ThreadLocal();
        final int i7 = 0;
        f1 f1Var = new f1(new l(this) { // from class: ka.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // rd.l
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        m1.b ex = (m1.b) obj;
                        j.e(ex, "ex");
                        Log.w(s.a(d.class).b(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), ex);
                        return new q1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.b.a;
                        LinkedHashSet keysToMigrate = p1.j.a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return d0.a(new o1.d(it, sharedPreferencesName, e.a, new b(keysToMigrate, null, 2), new i(3, null)));
                }
            }
        }, 15);
        final int i10 = 1;
        l lVar = new l(this) { // from class: ka.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // rd.l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        m1.b ex = (m1.b) obj;
                        j.e(ex, "ex");
                        Log.w(s.a(d.class).b(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), ex);
                        return new q1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.b.a;
                        LinkedHashSet keysToMigrate = p1.j.a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return d0.a(new o1.d(it, sharedPreferencesName, e.a, new b(keysToMigrate, null, 2), new i(3, null)));
                }
            }
        };
        ge.e eVar = j0.a;
        ge.d dVar2 = ge.d.c;
        t1 t1Var = new t1();
        dVar2.getClass();
        ee.c b10 = b0.b(m0.c(dVar2, t1Var));
        s0 s0Var = new s0(name, f1Var, lVar, b10);
        g property = d[0];
        j.e(property, "property");
        q1.d dVar3 = (q1.d) s0Var.b;
        if (dVar3 == null) {
            synchronized (s0Var.c) {
                try {
                    if (((q1.d) s0Var.b) == null) {
                        Context applicationContext = context.getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        List list = (List) lVar.invoke(applicationContext);
                        o1.a aVar = new o1.a(1, applicationContext, s0Var);
                        s0Var.b = new q1.d(new q1.d(new m1.b0(new f0(h.a, e0.b, new k0(aVar, 3)), d0.a(new be.l(list, (id.c) null, 8)), f1Var, b10)));
                    }
                    dVar = (q1.d) s0Var.b;
                    j.b(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar3 = dVar;
        }
        this.c = dVar3;
    }

    public final void a(l lVar) {
    }

    public final Object b(q1.e key, Long l10) {
        j.e(key, "key");
        return b0.u(new de.c(this, key, (Object) l10, (id.c) null));
    }
}
