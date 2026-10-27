package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class g extends c8.b {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i10) {
        super(str, 1);
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        int i11 = 3;
        int i12 = 2;
        int i13 = 0;
        switch (this.b) {
            case 0:
                h hVar = null;
                Bundle bundle = null;
                switch (i10) {
                    case 1:
                        Bundle bundle2 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            hVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 2);
                        }
                        t.b(parcel);
                        p pVar = (p) this;
                        p4.r b10 = p4.r.b(bundle2);
                        if (b10 != null) {
                            HashMap hashMap = pVar.e;
                            if (!hashMap.containsKey(b10)) {
                                hashMap.put(b10, new HashSet());
                            }
                            ((Set) hashMap.get(b10)).add(new i(hVar));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        Bundle bundle3 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        int readInt = parcel.readInt();
                        t.b(parcel);
                        p pVar2 = (p) this;
                        p4.r b11 = p4.r.b(bundle3);
                        if (b11 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pVar2.L0(b11, readInt);
                            } else {
                                new y(Looper.getMainLooper(), 0).post(new androidx.activity.g(pVar2, b11, readInt, i12));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle4 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        t.b(parcel);
                        p pVar3 = (p) this;
                        p4.r b12 = p4.r.b(bundle4);
                        if (b12 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pVar3.M0(b12);
                            } else {
                                new y(Looper.getMainLooper(), 0).post(new k9.u(i11, pVar3, b12));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        Bundle bundle5 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        t.b(parcel);
                        p pVar4 = (p) this;
                        p4.r b13 = p4.r.b(bundle5);
                        if (b13 != null) {
                            pVar4.c.getClass();
                            p4.x.b();
                            p4.e c10 = p4.x.c();
                            ArrayList arrayList = c10.j;
                            if (!b13.d()) {
                                if ((readInt2 & 2) != 0 || !c10.p) {
                                    p4.z zVar = c10.u;
                                    Object[] objArr = zVar != null && zVar.c && c10.f();
                                    int size = arrayList.size();
                                    for (int i14 = 0; i14 < size; i14++) {
                                        p4.v vVar = (p4.v) arrayList.get(i14);
                                        if (((readInt2 & 1) != 0 && vVar.d()) || ((objArr != false && !vVar.d() && vVar.c() != c10.r) || !vVar.h(b13))) {
                                        }
                                    }
                                }
                                i13 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i13);
                        return true;
                    case 5:
                        String readString = parcel.readString();
                        t.b(parcel);
                        h6.b bVar = p.j;
                        bVar.b("select route with routeId = %s", readString);
                        ((p) this).c.getClass();
                        p4.x.b();
                        ArrayList arrayList2 = p4.x.c().j;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                p4.v vVar2 = (p4.v) obj;
                                if (vVar2.c.equals(readString)) {
                                    bVar.b("media route is found and selected", new Object[0]);
                                    p4.x.b();
                                    p4.x.c().i(vVar2, 3);
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        ((p) this).c.getClass();
                        p4.x.b();
                        p4.v vVar3 = p4.x.c().v;
                        if (vVar3 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        p4.x.b();
                        p4.x.c().i(vVar3, 3);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        ((p) this).c.getClass();
                        p4.x.b();
                        p4.v vVar4 = p4.x.c().v;
                        if (vVar4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean equals = p4.x.f().c.equals(vVar4.c);
                        parcel2.writeNoException();
                        int i16 = t.a;
                        parcel2.writeInt(equals ? 1 : 0);
                        return true;
                    case 8:
                        String readString2 = parcel.readString();
                        t.b(parcel);
                        ((p) this).c.getClass();
                        p4.x.b();
                        ArrayList arrayList3 = p4.x.c().j;
                        int size3 = arrayList3.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                Object obj2 = arrayList3.get(i17);
                                i17++;
                                p4.v vVar5 = (p4.v) obj2;
                                if (vVar5.c.equals(readString2)) {
                                    bundle = vVar5.s;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                            return true;
                        }
                        parcel2.writeInt(1);
                        bundle.writeToParcel(parcel2, 1);
                        return true;
                    case 9:
                        ((p) this).c.getClass();
                        String str = p4.x.f().c;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        return true;
                    case 10:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 11:
                        p pVar5 = (p) this;
                        HashMap hashMap2 = pVar5.e;
                        Iterator it = hashMap2.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                pVar5.c.h((p4.s) it2.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        ((p) this).c.getClass();
                        p4.x.b();
                        p4.v vVar6 = p4.x.c().w;
                        if (vVar6 != null && p4.x.f().c.equals(vVar6.c)) {
                            i13 = 1;
                        }
                        parcel2.writeNoException();
                        int i18 = t.a;
                        parcel2.writeInt(i13);
                        return true;
                    case 13:
                        int readInt3 = parcel.readInt();
                        t.b(parcel);
                        ((p) this).c.getClass();
                        p4.x.j(readInt3);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            default:
                if (i10 == 1) {
                    y6.b bVar2 = new y6.b((c) this);
                    parcel2.writeNoException();
                    t.d(parcel2, bVar2);
                    return true;
                }
                if (i10 == 2) {
                    c cVar = (c) this;
                    h6.b bVar3 = c.e;
                    Log.i(bVar3.a, bVar3.d("onAppEnteredForeground", new Object[0]));
                    cVar.d = 1;
                    Iterator it3 = cVar.c.iterator();
                    while (it3.hasNext()) {
                        ((l) it3.next()).a.m();
                    }
                    parcel2.writeNoException();
                    return true;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                c cVar2 = (c) this;
                h6.b bVar4 = c.e;
                Log.i(bVar4.a, bVar4.d("onAppEnteredBackground", new Object[0]));
                cVar2.d = 2;
                Iterator it4 = cVar2.c.iterator();
                while (it4.hasNext()) {
                    m mVar = ((l) it4.next()).a;
                    m.f.b("Stopping RouteDiscovery.", new Object[0]);
                    mVar.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        rf.b bVar5 = mVar.e;
                        if (((p4.x) bVar5.c) == null) {
                            bVar5.c = p4.x.d((Context) bVar5.b);
                        }
                        p4.x xVar = (p4.x) bVar5.c;
                        if (xVar != null) {
                            xVar.h(mVar);
                        }
                    } else {
                        new y(Looper.getMainLooper(), 0).post(new j(mVar, i13));
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
