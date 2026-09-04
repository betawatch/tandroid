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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class h extends b8.b {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i10) {
        super(str, 1);
        this.b = i10;
    }

    @Override // b8.b
    public final boolean J0(int i10, Parcel parcel, Parcel parcel2) {
        int i11 = 2;
        int i12 = 0;
        switch (this.b) {
            case 0:
                i iVar = null;
                Bundle bundle = null;
                switch (i10) {
                    case 1:
                        Bundle bundle2 = (Bundle) v.a(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 1);
                        }
                        v.b(parcel);
                        r rVar = (r) this;
                        p4.r b10 = p4.r.b(bundle2);
                        if (b10 != null) {
                            HashMap hashMap = rVar.e;
                            if (!hashMap.containsKey(b10)) {
                                hashMap.put(b10, new HashSet());
                            }
                            ((Set) hashMap.get(b10)).add(new j(iVar));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        Bundle bundle3 = (Bundle) v.a(parcel, Bundle.CREATOR);
                        int readInt = parcel.readInt();
                        v.b(parcel);
                        r rVar2 = (r) this;
                        p4.r b11 = p4.r.b(bundle3);
                        if (b11 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                rVar2.M0(b11, readInt);
                            } else {
                                new c0(Looper.getMainLooper(), 0).post(new androidx.activity.g(rVar2, b11, readInt, i11));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle4 = (Bundle) v.a(parcel, Bundle.CREATOR);
                        v.b(parcel);
                        r rVar3 = (r) this;
                        p4.r b12 = p4.r.b(bundle4);
                        if (b12 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                rVar3.N0(b12);
                            } else {
                                new c0(Looper.getMainLooper(), 0).post(new i9.s(9, rVar3, b12));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        Bundle bundle5 = (Bundle) v.a(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        v.b(parcel);
                        r rVar4 = (r) this;
                        p4.r b13 = p4.r.b(bundle5);
                        if (b13 != null) {
                            rVar4.c.getClass();
                            p4.x.b();
                            p4.e c10 = p4.x.c();
                            ArrayList arrayList = c10.j;
                            if (!b13.d()) {
                                if ((readInt2 & 2) != 0 || !c10.p) {
                                    p4.z zVar = c10.u;
                                    boolean z10 = zVar != null && zVar.c && c10.f();
                                    int size = arrayList.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        p4.v vVar = (p4.v) arrayList.get(i13);
                                        if (((readInt2 & 1) != 0 && vVar.d()) || ((z10 && !vVar.d() && vVar.c() != c10.r) || !vVar.h(b13))) {
                                        }
                                    }
                                }
                                i12 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i12);
                        return true;
                    case 5:
                        String readString = parcel.readString();
                        v.b(parcel);
                        g6.b bVar = r.j;
                        bVar.b("select route with routeId = %s", readString);
                        ((r) this).c.getClass();
                        p4.x.b();
                        ArrayList arrayList2 = p4.x.c().j;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj = arrayList2.get(i14);
                                i14++;
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
                        ((r) this).c.getClass();
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
                        ((r) this).c.getClass();
                        p4.x.b();
                        p4.v vVar4 = p4.x.c().v;
                        if (vVar4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean equals = p4.x.f().c.equals(vVar4.c);
                        parcel2.writeNoException();
                        int i15 = v.a;
                        parcel2.writeInt(equals ? 1 : 0);
                        return true;
                    case 8:
                        String readString2 = parcel.readString();
                        v.b(parcel);
                        ((r) this).c.getClass();
                        p4.x.b();
                        ArrayList arrayList3 = p4.x.c().j;
                        int size3 = arrayList3.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                Object obj2 = arrayList3.get(i16);
                                i16++;
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
                        ((r) this).c.getClass();
                        String str = p4.x.f().c;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        return true;
                    case 10:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 11:
                        r rVar5 = (r) this;
                        HashMap hashMap2 = rVar5.e;
                        Iterator it = hashMap2.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                rVar5.c.h((p4.s) it2.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        ((r) this).c.getClass();
                        p4.x.b();
                        p4.v vVar6 = p4.x.c().w;
                        if (vVar6 != null && p4.x.f().c.equals(vVar6.c)) {
                            i12 = 1;
                        }
                        parcel2.writeNoException();
                        int i17 = v.a;
                        parcel2.writeInt(i12);
                        return true;
                    case 13:
                        int readInt3 = parcel.readInt();
                        v.b(parcel);
                        ((r) this).c.getClass();
                        p4.x.j(readInt3);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            default:
                if (i10 == 1) {
                    x6.b bVar2 = new x6.b((d) this);
                    parcel2.writeNoException();
                    v.d(parcel2, bVar2);
                    return true;
                }
                if (i10 == 2) {
                    d dVar = (d) this;
                    g6.b bVar3 = d.e;
                    Log.i(bVar3.a, bVar3.d("onAppEnteredForeground", new Object[0]));
                    dVar.d = 1;
                    Iterator it3 = dVar.c.iterator();
                    while (it3.hasNext()) {
                        ((m) it3.next()).a.m();
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
                d dVar2 = (d) this;
                g6.b bVar4 = d.e;
                Log.i(bVar4.a, bVar4.d("onAppEnteredBackground", new Object[0]));
                dVar2.d = 2;
                Iterator it4 = dVar2.c.iterator();
                while (it4.hasNext()) {
                    n nVar = ((m) it4.next()).a;
                    n.f.b("Stopping RouteDiscovery.", new Object[0]);
                    nVar.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        n4.y yVar = nVar.e;
                        if (((p4.x) yVar.c) == null) {
                            yVar.c = p4.x.d((Context) yVar.b);
                        }
                        p4.x xVar = (p4.x) yVar.c;
                        if (xVar != null) {
                            xVar.h(nVar);
                        }
                    } else {
                        new c0(Looper.getMainLooper(), 0).post(new k(nVar, i12));
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
