package org.telegram.messenger;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.PushListenerController;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class GoogleLocationProvider implements ILocationServiceProvider {
    private s7.a locationProviderClient;
    private s7.i settingsClient;

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static final class GoogleApiClientImpl implements ILocationServiceProvider.IMapApiClient {
        private com.google.android.gms.common.api.m apiClient;

        @Override // org.telegram.messenger.ILocationServiceProvider.IMapApiClient
        public void connect() {
            this.apiClient.a();
        }

        @Override // org.telegram.messenger.ILocationServiceProvider.IMapApiClient
        public void disconnect() {
            this.apiClient.b();
        }

        private GoogleApiClientImpl(com.google.android.gms.common.api.m mVar) {
            this.apiClient = mVar;
        }
    }

    /* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
    public static final class GoogleLocationRequest implements ILocationServiceProvider.ILocationRequest {
        private LocationRequest request;

        @Override // org.telegram.messenger.ILocationServiceProvider.ILocationRequest
        public void setFastestInterval(long j10) {
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            z5.l.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
            locationRequest.c = j10;
        }

        @Override // org.telegram.messenger.ILocationServiceProvider.ILocationRequest
        public void setInterval(long j10) {
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            z5.l.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
            long j11 = locationRequest.c;
            long j12 = locationRequest.b;
            if (j11 == j12 / 6) {
                locationRequest.c = j10 / 6;
            }
            if (locationRequest.r == j12) {
                locationRequest.r = j10;
            }
            locationRequest.b = j10;
        }

        @Override // org.telegram.messenger.ILocationServiceProvider.ILocationRequest
        public void setPriority(int i10) {
            boolean z10;
            int i11 = 105;
            int i12 = i10 != 1 ? i10 != 2 ? i10 != 3 ? 100 : 105 : 104 : 102;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (i12 == 100 || i12 == 102 || i12 == 104) {
                i11 = i12;
            } else if (i12 != 105) {
                i11 = i12;
                z10 = false;
                z5.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
                locationRequest.a = i12;
            }
            z10 = true;
            z5.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
            locationRequest.a = i12;
        }

        private GoogleLocationRequest(LocationRequest locationRequest) {
            this.request = locationRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$checkLocationSettings$1(q0.a aVar, Task task) {
        try {
            task.getResult(com.google.android.gms.common.api.f.class);
            aVar.accept(0);
        } catch (com.google.android.gms.common.api.f e10) {
            int statusCode = e10.getStatusCode();
            if (statusCode == 6) {
                aVar.accept(1);
            } else {
                if (statusCode != 8502) {
                    return;
                }
                aVar.accept(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getLastLocation$0(q0.a aVar, Task task) {
        if (task.getException() != null) {
            return;
        }
        aVar.accept((Location) task.getResult());
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void checkLocationSettings(ILocationServiceProvider.ILocationRequest iLocationRequest, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        if (locationRequest != null) {
            arrayList.add(locationRequest);
        }
        s7.i iVar = this.settingsClient;
        s7.e eVar = new s7.e(arrayList, false, false);
        d7.c cVar = (d7.c) iVar;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.c = new ag.o1(eVar, 9);
        b10.a = 2426;
        cVar.e(0, b10.b()).addOnCompleteListener(new h4(aVar, 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void getLastLocation(q0.a aVar) {
        d7.c cVar = (d7.c) this.locationProviderClient;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.c = d7.a.c;
        b10.a = 2414;
        cVar.e(0, b10.b()).addOnCompleteListener(new h4(aVar, 0));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = s7.d.a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.c;
        com.google.android.gms.common.api.e eVar2 = d7.c.k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.i;
        this.locationProviderClient = new d7.c(context, eVar2, aVar, iVar);
        this.settingsClient = new d7.c(context, eVar2, aVar, iVar);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public ILocationServiceProvider.ILocationRequest onCreateLocationRequest() {
        return new GoogleLocationRequest(new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, ConnectionsManager.DEFAULT_DATACENTER_ID, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public ILocationServiceProvider.IMapApiClient onCreateLocationServicesAPI(Context context, final ILocationServiceProvider.IAPIConnectionCallbacks iAPIConnectionCallbacks, final ILocationServiceProvider.IAPIOnConnectionFailedListener iAPIOnConnectionFailedListener) {
        List list;
        Context context2 = ApplicationLoader.applicationContext;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        a0.f fVar = new a0.f(0);
        a0.f fVar2 = new a0.f(0);
        Object obj = w5.d.c;
        b6.b bVar = z7.b.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = s7.d.a;
        z5.l.i(eVar, "Api must not be null");
        fVar2.put(eVar, null);
        b6.b bVar2 = eVar.a;
        z5.l.i(bVar2, "Base client builder must not be null");
        switch (bVar2.a) {
            case 6:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new com.google.android.gms.common.api.k() { // from class: org.telegram.messenger.GoogleLocationProvider.3
            @Override // com.google.android.gms.common.api.k
            public void onConnected(Bundle bundle) {
                iAPIConnectionCallbacks.onConnected(bundle);
            }

            @Override // com.google.android.gms.common.api.k
            public void onConnectionSuspended(int i10) {
                iAPIConnectionCallbacks.onConnectionSuspended(i10);
            }
        });
        arrayList2.add(new com.google.android.gms.common.api.l() { // from class: org.telegram.messenger.g4
            @Override // com.google.android.gms.common.api.l
            public final void onConnectionFailed(w5.a aVar) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        });
        z5.l.a("must call addApi() to add at least one API", !fVar2.isEmpty());
        z7.a aVar = z7.a.a;
        com.google.android.gms.common.api.e eVar2 = z7.b.b;
        if (fVar2.containsKey(eVar2)) {
            aVar = (z7.a) fVar2.get(eVar2);
        }
        m.s3 s3Var = new m.s3(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) s3Var.c;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        com.google.android.gms.common.api.e eVar3 = null;
        while (true) {
            a0.b bVar3 = (a0.b) it;
            if (!bVar3.hasNext()) {
                m.s3 s3Var2 = s3Var;
                a0.f fVar5 = fVar3;
                a0.f fVar6 = fVar4;
                ArrayList arrayList4 = arrayList3;
                Looper looper = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar3.c;
                    if (!equals) {
                        throw new IllegalStateException(a4.w.n("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.j0 j0Var = new com.google.android.gms.common.api.internal.j0(context2, new ReentrantLock(), looper, s3Var2, fVar5, arrayList, arrayList2, fVar6, com.google.android.gms.common.api.internal.j0.g(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(j0Var);
                }
                return new GoogleApiClientImpl(j0Var);
            }
            com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar3.next();
            Object obj2 = fVar2.get(eVar4);
            boolean z10 = map.get(eVar4) != null;
            Looper looper2 = mainLooper;
            fVar3.put(eVar4, Boolean.valueOf(z10));
            a0.f fVar7 = fVar4;
            com.google.android.gms.common.api.internal.o1 o1Var = new com.google.android.gms.common.api.internal.o1(eVar4, z10);
            arrayList3.add(o1Var);
            b6.b bVar4 = eVar4.a;
            z5.l.h(bVar4);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            m.s3 s3Var3 = s3Var;
            a0.f fVar8 = fVar3;
            a0.f fVar9 = fVar2;
            com.google.android.gms.common.api.c a2 = bVar4.a(context2, looper2, s3Var3, obj2, o1Var, o1Var);
            fVar7.put(eVar4.b, a2);
            if (!a2.a()) {
                mainLooper = looper2;
                s3Var = s3Var3;
                fVar4 = fVar7;
            } else {
                if (eVar3 != null) {
                    throw new IllegalStateException(a4.w.y(eVar4.c, " cannot be used with ", eVar3.c));
                }
                mainLooper = looper2;
                s3Var = s3Var3;
                fVar4 = fVar7;
                eVar3 = eVar4;
            }
            map = map2;
            fVar3 = fVar8;
            fVar2 = fVar9;
            arrayList3 = arrayList5;
        }
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        s7.a aVar = this.locationProviderClient;
        s7.c cVar = new s7.c() { // from class: org.telegram.messenger.GoogleLocationProvider.2
            @Override // s7.c
            public void onLocationResult(LocationResult locationResult) {
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.a;
                int size = list.size();
                iLocationListener2.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
            }
        };
        d7.c cVar2 = (d7.c) aVar;
        cVar2.getClass();
        String simpleName = s7.c.class.getSimpleName();
        z5.l.g(simpleName, "Listener type must not be empty");
        cVar2.c(new com.google.android.gms.common.api.internal.n(cVar, simpleName), 2418).continueWith(d7.b.a, d7.a.b);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        s7.a aVar = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        s7.c cVar = new s7.c() { // from class: org.telegram.messenger.GoogleLocationProvider.1
            @Override // s7.c
            public void onLocationResult(LocationResult locationResult) {
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.a;
                int size = list.size();
                iLocationListener2.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
            }
        };
        Looper mainLooper = Looper.getMainLooper();
        d7.c cVar2 = (d7.c) aVar;
        cVar2.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            z5.l.i(mainLooper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p i10 = za.c.i(mainLooper, cVar, s7.c.class.getSimpleName());
        androidx.activity.n nVar = new androidx.activity.n();
        nVar.c = cVar2;
        nVar.a = true;
        nVar.b = i10;
        ze.b bVar = new ze.b(nVar, locationRequest);
        r rVar = new r();
        rVar.b = true;
        rVar.c = bVar;
        rVar.d = nVar;
        rVar.e = i10;
        rVar.a = 2436;
        cVar2.b(rVar.a());
    }
}
