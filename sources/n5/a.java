package n5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c2.t0;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.j4;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.o4;
import g7.j5;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a {
    public static final r5.b l = new r5.b("CastContext", null);
    public static final Object m = new Object();
    public static volatile a n;
    public final Context a;
    public final o b;
    public final h c;
    public final l d;
    public final b e;
    public final r5.s f;
    public final com.google.android.gms.internal.cast.d g;
    public final com.google.android.gms.internal.cast.n h;
    public final List i;
    public final com.google.android.gms.internal.cast.s j;
    public final com.google.android.gms.internal.cast.f k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, r5.s sVar) {
        s sVar2;
        z zVar;
        com.google.android.gms.internal.cast.u d1Var;
        this.a = context;
        this.e = bVar;
        this.f = sVar;
        this.i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.j = pVar.f;
        if (TextUtils.isEmpty(bVar.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.f(context, bVar, pVar);
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.k;
        if (fVar != null) {
            hashMap.put(fVar.b, fVar.c);
        }
        int i10 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                y5.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.b;
                y5.l.g(str, "Category for SessionProvider must not be null or empty string.");
                y5.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.c);
            }
        }
        bVar.B = new c0(1);
        try {
            o a2 = com.google.android.gms.internal.cast.e.a(context, bVar, pVar, hashMap);
            this.b = a2;
            try {
                m mVar = (m) a2;
                Parcel O0 = mVar.O0(mVar.M0(), 6);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    sVar2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    sVar2 = queryLocalInterface instanceof s ? (s) queryLocalInterface : new s(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                }
                O0.recycle();
                this.d = new l(sVar2);
                try {
                    m mVar2 = (m) a2;
                    Parcel O02 = mVar2.O0(mVar2.M0(), 5);
                    IBinder readStrongBinder2 = O02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        zVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        zVar = queryLocalInterface2 instanceof z ? (z) queryLocalInterface2 : new z(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    O02.recycle();
                    h hVar = new h(zVar, context);
                    this.c = hVar;
                    y5.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar3 = this.j;
                    if (sVar3 != null) {
                        sVar3.f = hVar;
                        t0 t0Var = sVar3.c;
                        y5.l.h(t0Var);
                        t0Var.post(new com.google.android.gms.internal.cast.r(sVar3, i10));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        d1Var = new com.google.android.gms.internal.cast.x(context, newFixedThreadPool instanceof j4 ? (j4) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new o4((ScheduledExecutorService) newFixedThreadPool) : new k4(newFixedThreadPool));
                    } else {
                        d1Var = new d1();
                    }
                    y5.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    d1Var.zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.g = dVar;
                    try {
                        m mVar3 = (m) a2;
                        Parcel M0 = mVar3.M0();
                        com.google.android.gms.internal.cast.t.d(M0, dVar);
                        mVar3.Q0(M0, 3);
                        dVar.c.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(bVar.w).isEmpty()) {
                            r5.b bVar2 = l;
                            Log.i(bVar2.a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.e.w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f.b(i0.a.l(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(j5.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.n.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar = (com.google.android.gms.internal.cast.l) nVar.c.get(j5.a(str2));
                                        if (lVar != null) {
                                            hashMap2.put(str2, lVar);
                                        }
                                    }
                                    nVar.c.clear();
                                    nVar.c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new m5.o(this, 2));
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.c = new n1.d(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new v5.c[]{m5.z.d};
                        b10.b = false;
                        b10.a = 8427;
                        sVar.e(0, b10.b()).addOnSuccessListener(new n2.b0(this, i10));
                    } catch (RemoteException e9) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e9);
                    }
                } catch (RemoteException e10) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e10);
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e11);
            }
        } catch (RemoteException e12) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e12);
        }
    }

    public static a c(Context context) {
        y5.l.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    r5.s sVar = new r5.s(applicationContext, r5.s.k, com.google.android.gms.common.api.b.g, com.google.android.gms.common.api.i.c);
                    try {
                        n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, c2.b0.d(applicationContext), castOptions, sVar), sVar);
                    } catch (d e9) {
                        throw new RuntimeException(e9);
                    }
                }
            }
        }
        return n;
    }

    public static e d(Context context) {
        v5.h a2;
        try {
            a2 = h6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e9) {
            e = e9;
        }
        try {
            Bundle bundle = a2.a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InvocationTargetException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final c2.u a() {
        y5.l.e("Must be called from the main thread.");
        try {
            m mVar = (m) this.b;
            Parcel O0 = mVar.O0(mVar.M0(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(O0, Bundle.CREATOR);
            O0.recycle();
            return c2.u.b(bundle);
        } catch (RemoteException e9) {
            l.a(e9, "Unable to call %s on %s.", "getMergedSelectorAsBundle", o.class.getSimpleName());
            return null;
        }
    }

    public final h b() {
        y5.l.e("Must be called from the main thread.");
        return this.c;
    }
}
