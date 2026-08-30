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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class GoogleLocationProvider implements ILocationServiceProvider {
    private u7.a locationProviderClient;
    private u7.i settingsClient;

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    /* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
    public static final class GoogleLocationRequest implements ILocationServiceProvider.ILocationRequest {
        private LocationRequest request;

        @Override // org.telegram.messenger.ILocationServiceProvider.ILocationRequest
        public void setFastestInterval(long j10) {
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            b6.m.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
            locationRequest.c = j10;
        }

        @Override // org.telegram.messenger.ILocationServiceProvider.ILocationRequest
        public void setInterval(long j10) {
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            b6.m.a("intervalMillis must be greater than or equal to 0", j10 >= 0);
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
            boolean z4;
            int i11 = 105;
            int i12 = i10 != 1 ? i10 != 2 ? i10 != 3 ? 100 : 105 : 104 : 102;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (i12 == 100 || i12 == 102 || i12 == 104) {
                i11 = i12;
            } else if (i12 != 105) {
                i11 = i12;
                z4 = false;
                b6.m.c(z4, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
                locationRequest.a = i12;
            }
            z4 = true;
            b6.m.c(z4, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
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
        } catch (com.google.android.gms.common.api.f e) {
            int statusCode = e.getStatusCode();
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
        u7.i iVar = this.settingsClient;
        u7.e eVar = new u7.e(arrayList, false, false);
        f7.d dVar = (f7.d) iVar;
        dVar.getClass();
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.c = new androidx.biometric.f0(eVar, 12);
        e.a = 2426;
        dVar.e(0, e.e()).addOnCompleteListener(new i4(aVar, 1));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void getLastLocation(q0.a aVar) {
        f7.d dVar = (f7.d) this.locationProviderClient;
        dVar.getClass();
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.c = f7.a.c;
        e.a = 2414;
        dVar.e(0, e.e()).addOnCompleteListener(new i4(aVar, 0));
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = u7.d.a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.c;
        com.google.android.gms.common.api.e eVar2 = f7.d.k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.i;
        this.locationProviderClient = new f7.d(context, eVar2, aVar, iVar);
        this.settingsClient = new f7.d(context, eVar2, aVar, iVar);
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
        Object obj = y5.d.c;
        a8.j jVar = b8.b.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = u7.d.a;
        b6.m.i(eVar, "Api must not be null");
        fVar2.put(eVar, null);
        a8.j jVar2 = eVar.a;
        b6.m.i(jVar2, "Base client builder must not be null");
        switch (jVar2.a) {
            case 10:
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
        arrayList2.add(new com.google.android.gms.common.api.l() { // from class: org.telegram.messenger.h4
            @Override // com.google.android.gms.common.api.l
            public final void onConnectionFailed(y5.a aVar) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        });
        b6.m.a("must call addApi() to add at least one API", !fVar2.isEmpty());
        b8.a aVar = b8.a.a;
        com.google.android.gms.common.api.e eVar2 = b8.b.b;
        if (fVar2.containsKey(eVar2)) {
            aVar = (b8.a) fVar2.get(eVar2);
        }
        m.s3 s3Var = new m.s3(hashSet, fVar, packageName, name, aVar);
        Map map = (Map) s3Var.c;
        a0.f fVar3 = new a0.f(0);
        a0.f fVar4 = new a0.f(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) fVar2.keySet()).iterator();
        com.google.android.gms.common.api.e eVar3 = null;
        while (true) {
            a0.b bVar = (a0.b) it;
            if (!bVar.hasNext()) {
                m.s3 s3Var2 = s3Var;
                a0.f fVar5 = fVar3;
                a0.f fVar6 = fVar4;
                ArrayList arrayList4 = arrayList3;
                Looper looper = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar3.c;
                    if (!equals) {
                        throw new IllegalStateException(android.support.v4.media.a.o("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.j0 j0Var = new com.google.android.gms.common.api.internal.j0(context2, new ReentrantLock(), looper, s3Var2, fVar5, arrayList, arrayList2, fVar6, com.google.android.gms.common.api.internal.j0.f(fVar6.values(), true), arrayList4);
                Set set = com.google.android.gms.common.api.m.a;
                synchronized (set) {
                    set.add(j0Var);
                }
                return new GoogleApiClientImpl(j0Var);
            }
            com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar.next();
            Object obj2 = fVar2.get(eVar4);
            boolean z4 = map.get(eVar4) != null;
            Looper looper2 = mainLooper;
            fVar3.put(eVar4, Boolean.valueOf(z4));
            a0.f fVar7 = fVar4;
            com.google.android.gms.common.api.internal.q1 q1Var = new com.google.android.gms.common.api.internal.q1(eVar4, z4);
            arrayList3.add(q1Var);
            a8.j jVar3 = eVar4.a;
            b6.m.h(jVar3);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            m.s3 s3Var3 = s3Var;
            a0.f fVar8 = fVar3;
            a0.f fVar9 = fVar2;
            com.google.android.gms.common.api.c a2 = jVar3.a(context2, looper2, s3Var3, obj2, q1Var, q1Var);
            fVar7.put(eVar4.b, a2);
            if (!a2.a()) {
                mainLooper = looper2;
                s3Var = s3Var3;
                fVar4 = fVar7;
            } else {
                if (eVar3 != null) {
                    throw new IllegalStateException(android.support.v4.media.a.z(eVar4.c, " cannot be used with ", eVar3.c));
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
        u7.a aVar = this.locationProviderClient;
        u7.c cVar = new u7.c() { // from class: org.telegram.messenger.GoogleLocationProvider.2
            @Override // u7.c
            public void onLocationResult(LocationResult locationResult) {
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.a;
                int size = list.size();
                iLocationListener2.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
            }
        };
        f7.d dVar = (f7.d) aVar;
        dVar.getClass();
        String simpleName = u7.c.class.getSimpleName();
        b6.m.g(simpleName, "Listener type must not be empty");
        dVar.c(new com.google.android.gms.common.api.internal.n(cVar, simpleName), 2418).continueWith(f7.c.a, f7.a.b);
    }

    @Override // org.telegram.messenger.ILocationServiceProvider
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        u7.a aVar = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        u7.c cVar = new u7.c() { // from class: org.telegram.messenger.GoogleLocationProvider.1
            @Override // u7.c
            public void onLocationResult(LocationResult locationResult) {
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.a;
                int size = list.size();
                iLocationListener2.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
            }
        };
        Looper mainLooper = Looper.getMainLooper();
        f7.d dVar = (f7.d) aVar;
        dVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            b6.m.i(mainLooper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p f10 = androidx.biometric.f0.f(mainLooper, cVar, u7.c.class.getSimpleName());
        androidx.activity.o oVar = new androidx.activity.o();
        oVar.c = dVar;
        oVar.a = true;
        oVar.b = f10;
        f7.b bVar = new f7.b(0, oVar, locationRequest);
        r rVar = new r();
        rVar.b = true;
        rVar.c = bVar;
        rVar.d = oVar;
        rVar.e = f10;
        rVar.a = 2436;
        dVar.b(rVar.a());
    }
}
