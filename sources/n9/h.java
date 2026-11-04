package n9;

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
import m2.t;
import org.telegram.ui.Components.i9;
import p6.m;
import t9.n;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public static final Object k = new Object();
    public static final a0.f l = new a0.f(0);
    public final Context a;
    public final String b;
    public final k c;
    public final t9.g d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final n g;
    public final ta.b h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public h(Context context, String str, k kVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        m.e(str);
        this.b = str;
        this.c = kVar;
        a aVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList l02 = new t(context, new i9(ComponentDiscoveryService.class, 20), false, 26).l0();
        Trace.endSection();
        Trace.beginSection("Runtime");
        u9.m mVar = u9.m.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(l02);
        int i3 = 1;
        arrayList.add(new t9.c(new FirebaseCommonRegistrar(), i3));
        arrayList.add(new t9.c(new ExecutorsRegistrar(), i3));
        arrayList2.add(t9.a.c(context, Context.class, new Class[0]));
        arrayList2.add(t9.a.c(this, h.class, new Class[0]));
        arrayList2.add(t9.a.c(kVar, k.class, new Class[0]));
        kb.a aVar2 = new kb.a(10);
        if ((Build.VERSION.SDK_INT >= 24 ? x.g(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(t9.a.c(aVar, a.class, new Class[0]));
        }
        t9.g gVar = new t9.g(mVar, arrayList, arrayList2, aVar2);
        this.d = gVar;
        Trace.endSection();
        this.g = new n(new d(0, this, context));
        this.h = gVar.f(ra.d.class);
        e eVar = new e(this);
        a();
        if (atomicBoolean.get()) {
            com.google.android.gms.common.api.internal.c.e.a.get();
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
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + w6.d.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((ra.d) hVar.h.get()).c();
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
                k a10 = k.a(context);
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

    public static h g(Context context, k kVar) {
        h hVar;
        AtomicReference atomicReference = f.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = f.a;
            if (atomicReference2.get() == null) {
                f fVar = new f();
                while (true) {
                    if (atomicReference2.compareAndSet(null, fVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.e.a(fVar);
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
            m.i("FirebaseApp name [DEFAULT] already exists!", !fVar2.containsKey("[DEFAULT]"));
            m.h(context, "Application context cannot be null.");
            hVar = new h(context, "[DEFAULT]", kVar);
            fVar2.put("[DEFAULT]", hVar);
        }
        hVar.e();
        return hVar;
    }

    public final void a() {
        m.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(w6.b.c(this.b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(w6.b.c(this.c.b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        int i3 = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean g7 = i3 >= 24 ? x.g(context) : true;
        String str = this.b;
        if (g7) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            a();
            this.d.h("[DEFAULT]".equals(str));
            ((ra.d) this.h.get()).c();
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
        ya.a aVar = (ya.a) this.g.get();
        synchronized (aVar) {
            z10 = aVar.a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        t tVar = new t(this);
        tVar.A(this.b, "name");
        tVar.A(this.c, "options");
        return tVar.toString();
    }
}
