package d6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cast.j4;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.o4;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import v7.l5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public final com.google.android.gms.internal.cast.c g;
    public final com.google.android.gms.internal.cast.m h;
    public final List i;
    public final com.google.android.gms.internal.cast.t j;
    public final com.google.android.gms.internal.cast.e k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.q qVar, g6.r rVar) {
        r rVar2;
        y yVar;
        LinkProperties linkProperties;
        this.a = context;
        this.e = bVar;
        this.f = rVar;
        this.i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.j = qVar.f;
        if (TextUtils.isEmpty(bVar.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.e(context, bVar, qVar);
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.k;
        if (eVar != null) {
            hashMap.put(eVar.b, eVar.c);
        }
        int i10 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                n6.l.h(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.b;
                n6.l.f(str, "Category for SessionProvider must not be null or empty string.");
                n6.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.d.a(context, bVar, qVar, hashMap);
            this.b = a2;
            try {
                l lVar = (l) a2;
                Parcel R0 = lVar.R0(lVar.P0(), 6);
                IBinder readStrongBinder = R0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    rVar2 = queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                }
                R0.recycle();
                this.d = new k(rVar2);
                try {
                    l lVar2 = (l) a2;
                    Parcel R02 = lVar2.R0(lVar2.P0(), 5);
                    IBinder readStrongBinder2 = R02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        yVar = queryLocalInterface2 instanceof y ? (y) queryLocalInterface2 : new y(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                    }
                    R02.recycle();
                    g gVar = new g(yVar, context);
                    this.c = gVar;
                    n6.l.f("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.t tVar = this.j;
                    if (tVar != null) {
                        tVar.f = gVar;
                        com.google.android.gms.internal.cast.z zVar = tVar.c;
                        n6.l.g(zVar);
                        zVar.post(new com.google.android.gms.internal.cast.s(tVar, i10));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    com.google.android.gms.internal.cast.x xVar = new com.google.android.gms.internal.cast.x(context, newFixedThreadPool instanceof j4 ? (j4) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new o4((ScheduledExecutorService) newFixedThreadPool) : new k4(newFixedThreadPool));
                    n6.l.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = xVar.c;
                    com.google.android.gms.internal.cast.x.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!xVar.f && connectivityManager != null && f0.c.b(xVar.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            xVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), xVar.b);
                        xVar.f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.g = cVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel P0 = lVar3.P0();
                        com.google.android.gms.internal.cast.u.d(P0, cVar);
                        lVar3.T0(P0, 3);
                        cVar.c.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(bVar.x).isEmpty()) {
                            g6.b bVar2 = l;
                            Log.i(bVar2.a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.x))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.e.x);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f.b(i0.a.j(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(l5.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.m.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.c.get(l5.a(str2));
                                        if (kVar != null) {
                                            hashMap2.put(str2, kVar);
                                        }
                                    }
                                    mVar.c.clear();
                                    mVar.c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new za.c(this, 15));
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.c = new a6.i(rVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 24);
                        b10.d = new k6.c[]{c6.y.d};
                        b10.b = false;
                        b10.a = 8427;
                        rVar.e(0, b10.a()).addOnSuccessListener(new a6.i(this, 17));
                    } catch (RemoteException e) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e);
                    }
                } catch (RemoteException e7) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e7);
                }
            } catch (RemoteException e10) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e10);
            }
        } catch (RemoteException e11) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e11);
        }
    }

    public static a c(Context context) {
        n6.l.d("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    g6.r rVar = new g6.r(applicationContext, g6.r.k, com.google.android.gms.common.api.b.k, com.google.android.gms.common.api.i.c);
                    try {
                        n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.q(applicationContext, p4.y.d(applicationContext), castOptions, rVar), rVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return n;
    }

    public static e d(Context context) {
        androidx.biometric.s a2;
        try {
            a2 = w6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
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
        } catch (ClassNotFoundException e7) {
            e = e7;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InvocationTargetException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final p4.s a() {
        n6.l.d("Must be called from the main thread.");
        try {
            l lVar = (l) this.b;
            Parcel R0 = lVar.R0(lVar.P0(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.u.a(R0, Bundle.CREATOR);
            R0.recycle();
            return p4.s.b(bundle);
        } catch (RemoteException e) {
            l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        n6.l.d("Must be called from the main thread.");
        return this.c;
    }
}
