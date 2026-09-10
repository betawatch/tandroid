package k9;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.x;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n6.l;
import og.u0;
import q9.n;
import t7.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h {
    public static final Object k = new Object();
    public static final a0.f l = new a0.f(0);
    public final Context a;
    public final String b;
    public final j c;
    public final q9.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final n g;
    public final pa.b h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public h(Context context, String str, j jVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        l.f(str);
        this.b = str;
        this.c = jVar;
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList f7 = new u0(11, context, new l2.g(ComponentDiscoveryService.class, 15)).f();
        Trace.endSection();
        Trace.beginSection("Runtime");
        r9.j jVar2 = r9.j.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(f7);
        int i10 = 1;
        arrayList.add(new q9.c(new FirebaseCommonRegistrar(), i10));
        arrayList.add(new q9.c(new ExecutorsRegistrar(), i10));
        arrayList2.add(q9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(q9.a.c(this, h.class, new Class[0]));
        arrayList2.add(q9.a.c(jVar, j.class, new Class[0]));
        u uVar = new u();
        if ((Build.VERSION.SDK_INT >= 24 ? x.g(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(q9.a.c(aVar, a.class, new Class[0]));
        }
        q9.g gVar = new q9.g(jVar2, arrayList, arrayList2, uVar);
        this.d = gVar;
        Trace.endSection();
        this.g = new n(new d(0, this, context));
        this.h = gVar.c(na.c.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.d.e.a.get();
        }
        copyOnWriteArrayList.add(eVar);
        Trace.endSection();
    }

    public static h c() {
        h hVar;
        synchronized (k) {
            try {
                hVar = (h) l.get("[DEFAULT]");
                if (hVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + u6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((na.c) hVar.h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public static h f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j a2 = j.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static h g(Context context, j jVar) {
        h hVar;
        AtomicReference atomicReference = f.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                while (true) {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        com.google.android.gms.common.api.internal.d.b(application);
                        com.google.android.gms.common.api.internal.d.e.a(fVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            a0.f fVar2 = l;
            l.j("FirebaseApp name [DEFAULT] already exists!", !fVar2.containsKey("[DEFAULT]"));
            l.i(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", jVar);
            fVar2.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        l.j("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(u6.b.c(this.b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(u6.b.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        int i10 = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean g10 = i10 >= 24 ? x.g(context) : true;
        String str = this.b;
        if (g10) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.d.g("[DEFAULT]".equals(str));
            ((na.c) this.h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = g.b;
        if (atomicReference.get() == null) {
            g gVar = new g(context);
            while (!atomicReference.compareAndSet(null, gVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(gVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        hVar.a();
        return this.b.equals(hVar.b);
    }

    public final boolean h() {
        boolean z10;
        a();
        ua.a aVar = (ua.a) this.g.get();
        synchronized (aVar) {
            z10 = aVar.a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        of.b bVar = new of.b(this);
        bVar.E(this.b, "name");
        bVar.E(this.c, "options");
        return bVar.toString();
    }
}
