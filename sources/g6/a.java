package g6;

import a8.m8;
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
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.internal.cast.j4;
import com.google.android.gms.internal.cast.n4;
import f3.l0;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class a {
    public static final j6.b l = new j6.b("CastContext", null);
    public static final Object m = new Object();
    public static volatile a n;
    public final Context a;
    public final n b;
    public final g c;
    public final k d;
    public final b e;
    public final j6.r f;
    public final com.google.android.gms.internal.cast.c g;
    public final com.google.android.gms.internal.cast.m h;
    public final List i;
    public final com.google.android.gms.internal.cast.s j;
    public final com.google.android.gms.internal.cast.e k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, j6.r rVar) {
        r rVar2;
        y yVar;
        LinkProperties linkProperties;
        this.a = context;
        this.e = bVar;
        this.f = rVar;
        this.i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.j = pVar.f;
        if (TextUtils.isEmpty(bVar.a)) {
            this.k = null;
        } else {
            this.k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.k;
        if (eVar != null) {
            hashMap.put(eVar.b, eVar.c);
        }
        int i7 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                q6.m.h(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.b;
                q6.m.f(str, "Category for SessionProvider must not be null or empty string.");
                q6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.c);
            }
        }
        bVar.F = new b0(1);
        try {
            n a10 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.b = a10;
            try {
                l lVar = (l) a10;
                Parcel r12 = lVar.r1(lVar.p1(), 6);
                IBinder readStrongBinder = r12.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    rVar2 = queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 2);
                }
                r12.recycle();
                this.d = new k(rVar2);
                try {
                    l lVar2 = (l) a10;
                    Parcel r13 = lVar2.r1(lVar2.p1(), 5);
                    IBinder readStrongBinder2 = r13.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        yVar = queryLocalInterface2 instanceof y ? (y) queryLocalInterface2 : new y(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 2);
                    }
                    r13.recycle();
                    g gVar = new g(yVar, context);
                    this.c = gVar;
                    q6.m.f("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar = this.j;
                    if (sVar != null) {
                        sVar.f = gVar;
                        com.google.android.gms.internal.cast.y yVar2 = sVar.c;
                        q6.m.g(yVar2);
                        yVar2.post(new com.google.android.gms.internal.cast.r(sVar, i7));
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                    com.google.android.gms.internal.cast.w wVar = new com.google.android.gms.internal.cast.w(context, newFixedThreadPool instanceof i4 ? (i4) newFixedThreadPool : newFixedThreadPool instanceof ScheduledExecutorService ? new n4((ScheduledExecutorService) newFixedThreadPool) : new j4(newFixedThreadPool));
                    q6.m.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    ConnectivityManager connectivityManager = wVar.c;
                    com.google.android.gms.internal.cast.w.j.b("Start monitoring connectivity changes", new Object[0]);
                    if (!wVar.f && connectivityManager != null && f0.d.b(wVar.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            wVar.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), wVar.b);
                        wVar.f = true;
                    }
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.g = cVar;
                    try {
                        l lVar3 = (l) a10;
                        Parcel p12 = lVar3.p1();
                        com.google.android.gms.internal.cast.t.d(p12, cVar);
                        lVar3.t1(p12, 3);
                        cVar.c.add(this.h.a);
                        if (!DesugarCollections.unmodifiableList(bVar.x).isEmpty()) {
                            j6.b bVar2 = l;
                            Log.i(bVar2.a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.x))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List unmodifiableList = DesugarCollections.unmodifiableList(this.e.x);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f.b(jg.g.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            Iterator it2 = unmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(m8.a((String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.m.f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.c) {
                                try {
                                    for (String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.c.get(m8.a(str2));
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
                        rVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new cb.c(this, 29));
                        com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                        b10.c = new l0(rVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new n6.c[]{f6.y.d};
                        b10.b = false;
                        b10.a = 8427;
                        rVar.e(0, b10.a()).addOnSuccessListener(new d6.i(this, 27));
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
        q6.m.d("Must be called from the main thread.");
        if (n == null) {
            synchronized (m) {
                if (n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    j6.r rVar = new j6.r(applicationContext, j6.r.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
                    try {
                        n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, s4.x.d(applicationContext), castOptions, rVar), rVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return n;
    }

    public static e d(Context context) {
        androidx.biometric.t a10;
        try {
            a10 = z6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a10.a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InvocationTargetException e16) {
            e = e16;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final s4.r a() {
        q6.m.d("Must be called from the main thread.");
        try {
            l lVar = (l) this.b;
            Parcel r12 = lVar.r1(lVar.p1(), 1);
            Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(r12, Bundle.CREATOR);
            r12.recycle();
            return s4.r.b(bundle);
        } catch (RemoteException e10) {
            l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        q6.m.d("Must be called from the main thread.");
        return this.c;
    }
}
