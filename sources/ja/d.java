package ja;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.lifecycle.k0;
import b8.cc;
import b8.tb;
import com.google.android.gms.internal.play_billing.s0;
import gi.w5;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import l1.e0;
import l1.f0;
import n1.e;
import o1.i;
import od.l;
import p1.h;
import sd.g;
import wd.b0;
import wd.j0;
import wd.t1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ g[] d;
    public final String a;
    public final ThreadLocal b;
    public final p1.d c;

    static {
        m mVar = new m(kotlin.jvm.internal.c.NO_RECEIVER, d.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        s.a.getClass();
        d = new g[]{mVar};
    }

    public d(Context context, String name) {
        p1.d dVar;
        j.e(context, "context");
        j.e(name, "name");
        this.a = name;
        this.b = new ThreadLocal();
        final int i3 = 0;
        w5 w5Var = new w5(new l(this) { // from class: ja.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // od.l
            public final Object invoke(Object obj) {
                switch (i3) {
                    case 0:
                        l1.b ex = (l1.b) obj;
                        j.e(ex, "ex");
                        Log.w(s.a(d.class).b(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), ex);
                        return new p1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.b.a;
                        LinkedHashSet keysToMigrate = o1.j.a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return tb.a(new n1.d(it, sharedPreferencesName, e.a, new b(keysToMigrate, null, 2), new i(3, null)));
                }
            }
        }, 12);
        final int i10 = 1;
        l lVar = new l(this) { // from class: ja.a
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // od.l
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        l1.b ex = (l1.b) obj;
                        j.e(ex, "ex");
                        Log.w(s.a(d.class).b(), "CorruptionException in " + this.b.a + " DataStore running in process " + Process.myPid(), ex);
                        return new p1.b(true);
                    default:
                        Context it = (Context) obj;
                        j.e(it, "it");
                        String sharedPreferencesName = this.b.a;
                        LinkedHashSet keysToMigrate = o1.j.a;
                        j.e(sharedPreferencesName, "sharedPreferencesName");
                        j.e(keysToMigrate, "keysToMigrate");
                        return tb.a(new n1.d(it, sharedPreferencesName, e.a, new b(keysToMigrate, null, 2), new i(3, null)));
                }
            }
        };
        de.e eVar = j0.a;
        de.d dVar2 = de.d.c;
        t1 t1Var = new t1();
        dVar2.getClass();
        be.c b10 = b0.b(cc.c(dVar2, t1Var));
        s0 s0Var = new s0(name, w5Var, lVar, b10);
        g property = d[0];
        j.e(property, "property");
        p1.d dVar3 = (p1.d) s0Var.b;
        if (dVar3 == null) {
            synchronized (s0Var.c) {
                try {
                    if (((p1.d) s0Var.b) == null) {
                        Context applicationContext = context.getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        List list = (List) lVar.invoke(applicationContext);
                        n1.a aVar = new n1.a(1, applicationContext, s0Var);
                        s0Var.b = new p1.d(new p1.d(new l1.b0(new f0(h.a, e0.b, new k0(aVar, 3)), tb.a(new ae.d(list, (fd.c) null, 7)), w5Var, b10)));
                    }
                    dVar = (p1.d) s0Var.b;
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

    public final Object b(p1.e key, Long l10) {
        j.e(key, "key");
        return b0.u(new ae.c(this, key, (Object) l10, (fd.c) null));
    }
}
