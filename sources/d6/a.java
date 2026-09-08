package d6;

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
import com.google.android.gms.internal.cast.g1;
import com.google.android.gms.internal.cast.n4;
import com.google.android.gms.internal.cast.o4;
import com.google.android.gms.internal.cast.s4;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import v7.i5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public static final g6.b l = new g6.b("CastContext", null);
    public static final Object m = new Object();
    public static volatile a n;
    public final Context a;
    public final n b;
    public final g c;
    public final k d;
    public final b e;
    public final g6.r f;
    public final com.google.android.gms.internal.cast.d g;
    public final com.google.android.gms.internal.cast.n h;
    public final List i;
    public final com.google.android.gms.internal.cast.u j;
    public final com.google.android.gms.internal.cast.f k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.r rVar, g6.r rVar2) {
        r rVar3;
        y yVar;
        com.google.android.gms.internal.cast.w g1Var;
        this.a = context;
        this.e = bVar;
        this.f = rVar2;
        this.i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.j = rVar.f;
        if (TextUtils.isEmpty(bVar.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.f(context, bVar, rVar);
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
                n6.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.b;
                n6.l.g(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, rVar, hashMap);
            this.b = a2;
            try {
                l lVar = (l) a2;
                Parcel Q0 = lVar.Q0(lVar.O0(), 6);
                IBinder readStrongBinder = Q0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar3 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    rVar3 = queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                }
                Q0.recycle();
                this.d = new k(rVar3);
                try {
                    l lVar2 = (l) a2;
                    Parcel Q02 = lVar2.Q0(lVar2.O0(), 5);
                    IBinder readStrongBinder2 = Q02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        yVar = queryLocalInterface2 instanceof y ? (y) queryLocalInterface2 : new y(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    Q02.recycle();
                    g gVar = new g(yVar, context);
                    this.c = gVar;
                    n6.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.u uVar = this.j;
                    if (uVar != null) {
                        uVar.f = gVar;
                        com.google.android.gms.internal.cast.c0 c0Var = uVar.c;
                        n6.l.h(c0Var);
                        c0Var.post(new com.google.android.gms.internal.cast.t(uVar, i10));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        g1Var = new com.google.android.gms.internal.cast.z(context, newFixedThreadPool instanceof n4 ? (n4) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new s4((ScheduledExecutorService) newFixedThreadPool) : new o4(newFixedThreadPool));
                    } else {
                        g1Var = new g1();
                    }
                    n6.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    g1Var.zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel O0 = lVar3.O0();
                        com.google.android.gms.internal.cast.v.d(O0, dVar);
                        lVar3.S0(O0, 3);
                        dVar.c.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(bVar.w).isEmpty()) {
                            g6.b bVar2 = l;
                            Log.i(bVar2.a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.e.w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f.b(i2.g.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(i5.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.n.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.c.get(i5.a(str2));
                                        if (lVar4 != null) {
                                            hashMap2.put(str2, lVar4);
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
                        int i11 = 13;
                        rVar2.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new a4.m(this, i11));
                        com.google.android.gms.common.api.internal.v e7 = com.google.android.gms.common.api.internal.w.e();
                        e7.c = new a6.i(rVar2, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 22);
                        e7.d = new k6.c[]{c6.y.d};
                        e7.b = false;
                        e7.a = 8427;
                        rVar2.e(0, e7.a()).addOnSuccessListener(new a6.m(this, i11));
                    } catch (RemoteException e10) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e10);
                    }
                } catch (RemoteException e11) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e11);
                }
            } catch (RemoteException e12) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e12);
            }
        } catch (RemoteException e13) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e13);
        }
    }

    public static a c(Context context) {
        n6.l.e("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    g6.r rVar = new g6.r(applicationContext, g6.r.k, com.google.android.gms.common.api.b.t, com.google.android.gms.common.api.i.c);
                    try {
                        n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.r(applicationContext, p4.x.d(applicationContext), castOptions, rVar), rVar);
                    } catch (d e7) {
                        throw new RuntimeException(e7);
                    }
                }
            }
        }
        return n;
    }

    public static e d(Context context) {
        k6.h a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e7) {
            e = e7;
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

    public final p4.r a() {
        n6.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.b;
            Parcel Q0 = lVar.Q0(lVar.O0(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.v.a(Q0, Bundle.CREATOR);
            Q0.recycle();
            return p4.r.b(bundle);
        } catch (RemoteException e7) {
            l.a(e7, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.e("Must be called from the main thread.");
        return this.c;
    }
}
