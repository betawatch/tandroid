package o9;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.emoji2.text.w;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import j2.n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.qt;
import sg.i0;
import u9.m;
import v9.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class g {
    public static final Object k = new Object();
    public static final a0.f l = new a0.f(0);
    public final Context a;
    public final String b;
    public final i c;
    public final u9.f d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final m g;
    public final ua.b h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public g(Context context, String str, i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        q6.m.e(str);
        this.b = str;
        this.c = iVar;
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList b10 = new i0(4, context, new qt(ComponentDiscoveryService.class, 20)).b();
        Trace.endSection();
        Trace.beginSection("Runtime");
        j jVar = j.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(b10);
        int i7 = 1;
        arrayList.add(new u9.c(new FirebaseCommonRegistrar(), i7));
        arrayList.add(new u9.c(new ExecutorsRegistrar(), i7));
        arrayList2.add(u9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(u9.a.c(this, g.class, new Class[0]));
        arrayList2.add(u9.a.c(iVar, i.class, new Class[0]));
        qb.a aVar2 = new qb.a(12);
        if ((Build.VERSION.SDK_INT >= 24 ? w.g(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(u9.a.c(aVar, a.class, new Class[0]));
        }
        u9.f fVar = new u9.f(jVar, arrayList, arrayList2, aVar2);
        this.d = fVar;
        Trace.endSection();
        this.g = new m(new c(0, this, context));
        this.h = fVar.c(sa.c.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.c.e.a.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + x6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((sa.c) gVar.h.get()).c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i a10 = i.a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.e.a(eVar);
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
            a0.f fVar = l;
            q6.m.i("FirebaseApp name [DEFAULT] already exists!", !fVar.containsKey("[DEFAULT]"));
            q6.m.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            fVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        q6.m.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(x6.b.c(this.b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(x6.b.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean g10 = i7 >= 24 ? w.g(context) : true;
        String str = this.b;
        if (g10) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.d.h("[DEFAULT]".equals(str));
            ((sa.c) this.h.get()).c();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        AtomicReference atomicReference = f.b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            while (!atomicReference.compareAndSet(null, fVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    public final boolean h() {
        boolean z9;
        a();
        za.a aVar = (za.a) this.g.get();
        synchronized (aVar) {
            z9 = aVar.a;
        }
        return z9;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        n nVar = new n(this);
        nVar.X(this.b, "name");
        nVar.X(this.c, "options");
        return nVar.toString();
    }
}
