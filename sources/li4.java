// default package

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class li4 {
    public static final Object k = new Object();
    public static final qt l = new qt(0);
    public final Context a;
    public final String b;
    public final zi4 c;
    public final pr2 d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;
    public final e26 g;
    public final nv8 h;
    public final CopyOnWriteArrayList i;
    public final CopyOnWriteArrayList j;

    public li4(Context context, String str, zi4 zi4Var) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.a = context;
        ite.f(str);
        this.b = str;
        this.c = zi4Var;
        lb0 lb0Var = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList p = new lx6(context, new ni6(ComponentDiscoveryService.class, (byte) 20), (byte) 16).p();
        Trace.endSection();
        Trace.beginSection("Runtime");
        m6c m6cVar = m6c.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(p);
        arrayList.add(new kr2(new FirebaseCommonRegistrar(), 1 == true ? 1 : 0));
        arrayList.add(new kr2(new ExecutorsRegistrar(), 1 == true ? 1 : 0));
        arrayList2.add(xq2.c(context, Context.class, new Class[0]));
        arrayList2.add(xq2.c(this, li4.class, new Class[0]));
        arrayList2.add(xq2.c(zi4Var, zi4.class, new Class[0]));
        q7f q7fVar = new q7f((byte) 15);
        if ((Build.VERSION.SDK_INT >= 24 ? ki0.j(context) : true) && FirebaseInitProvider.b.get()) {
            arrayList2.add(xq2.c(lb0Var, lb0.class, new Class[0]));
        }
        pr2 pr2Var = new pr2(m6cVar, arrayList, arrayList2, q7fVar);
        this.d = pr2Var;
        Trace.endSection();
        this.g = new e26(new or2(this, context, (byte) 2));
        this.h = pr2Var.d(ac3.class);
        ii4 ii4Var = new ii4(this);
        a();
        if (atomicBoolean.get()) {
            oe0.e.a.get();
        }
        copyOnWriteArrayList.add(ii4Var);
        Trace.endSection();
    }

    public static li4 c() {
        li4 li4Var;
        synchronized (k) {
            li4Var = (li4) l.get("[DEFAULT]");
            if (li4Var == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + fp.j() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((ac3) li4Var.h.get()).c();
        }
        return li4Var;
    }

    public static li4 f(Context context) {
        synchronized (k) {
            if (l.containsKey("[DEFAULT]")) {
                return c();
            }
            zi4 a = zi4.a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return g(context, a);
        }
    }

    public static li4 g(Context context, zi4 zi4Var) {
        li4 li4Var;
        AtomicReference atomicReference = ji4.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = ji4.a;
            if (atomicReference2.get() == null) {
                ji4 ji4Var = new ji4();
                while (true) {
                    if (atomicReference2.compareAndSet(null, ji4Var)) {
                        oe0.b(application);
                        oe0.e.a(ji4Var);
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
            qt qtVar = l;
            ite.j("FirebaseApp name [DEFAULT] already exists!", !qtVar.containsKey("[DEFAULT]"));
            ite.i(context, "Application context cannot be null.");
            li4Var = new li4(context, "[DEFAULT]", zi4Var);
            qtVar.put("[DEFAULT]", li4Var);
        }
        li4Var.e();
        return li4Var;
    }

    public final void a() {
        ite.j("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(xpd.b(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(xpd.b(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        boolean j = i >= 24 ? ki0.j(context) : true;
        String str = this.b;
        if (j) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb.append(str);
            Log.i("FirebaseApp", sb.toString());
            a();
            this.d.n("[DEFAULT]".equals(str));
            ((ac3) this.h.get()).c();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb2.append(str);
        Log.i("FirebaseApp", sb2.toString());
        AtomicReference atomicReference = ki4.b;
        if (atomicReference.get() == null) {
            ki4 ki4Var = new ki4(context);
            while (!atomicReference.compareAndSet(null, ki4Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(ki4Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof li4)) {
            return false;
        }
        li4 li4Var = (li4) obj;
        li4Var.a();
        return this.b.equals(li4Var.b);
    }

    public final boolean h() {
        boolean z;
        a();
        j73 j73Var = (j73) this.g.get();
        synchronized (j73Var) {
            z = j73Var.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        wm4 wm4Var = new wm4(this);
        wm4Var.a(this.b, "name");
        wm4Var.a(this.c, "options");
        return wm4Var.toString();
    }
}
