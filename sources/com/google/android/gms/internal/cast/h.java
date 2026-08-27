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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class h extends b7.a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i10) {
        super(str, 2);
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // b7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        int i11 = 2;
        int i12 = 0;
        r4 = 0;
        int i13 = 0;
        i12 = 0;
        i12 = 0;
        switch (this.b) {
            case 0:
                i iVar = null;
                Bundle bundle = null;
                switch (i10) {
                    case 1:
                        Bundle bundle2 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 1);
                        }
                        t.b(parcel);
                        p pVar = (p) this;
                        c2.u b10 = c2.u.b(bundle2);
                        if (b10 != null) {
                            HashMap hashMap = pVar.e;
                            if (!hashMap.containsKey(b10)) {
                                hashMap.put(b10, new HashSet());
                            }
                            ((Set) hashMap.get(b10)).add(new j(iVar));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        Bundle bundle3 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        int readInt = parcel.readInt();
                        t.b(parcel);
                        p pVar2 = (p) this;
                        c2.u b11 = c2.u.b(bundle3);
                        if (b11 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pVar2.K0(b11, readInt);
                            } else {
                                new c2.t0(Looper.getMainLooper(), 1).post(new androidx.activity.g(pVar2, b11, readInt, i11));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle4 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        t.b(parcel);
                        p pVar3 = (p) this;
                        c2.u b12 = c2.u.b(bundle4);
                        if (b12 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pVar3.L0(b12);
                            } else {
                                new c2.t0(Looper.getMainLooper(), 1).post(new a9.o(pVar3, b12, i12, i11));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        Bundle bundle5 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        t.b(parcel);
                        p pVar4 = (p) this;
                        c2.u b13 = c2.u.b(bundle5);
                        if (b13 != null) {
                            pVar4.c.getClass();
                            c2.b0.b();
                            c2.e c10 = c2.b0.c();
                            ArrayList arrayList = c10.j;
                            if (!b13.d()) {
                                if ((readInt2 & 2) != 0 || !c10.p) {
                                    c2.e0 e0Var = c10.u;
                                    boolean z10 = e0Var != null && e0Var.c && c10.f();
                                    int size = arrayList.size();
                                    for (int i14 = 0; i14 < size; i14++) {
                                        c2.z zVar = (c2.z) arrayList.get(i14);
                                        if (((readInt2 & 1) != 0 && zVar.d()) || ((z10 && !zVar.d() && zVar.c() != c10.r) || !zVar.h(b13))) {
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
                        t.b(parcel);
                        r5.b bVar = p.j;
                        bVar.b("select route with routeId = %s", readString);
                        ((p) this).c.getClass();
                        c2.b0.b();
                        ArrayList arrayList2 = c2.b0.c().j;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                c2.z zVar2 = (c2.z) obj;
                                if (zVar2.c.equals(readString)) {
                                    bVar.b("media route is found and selected", new Object[0]);
                                    c2.b0.b();
                                    c2.b0.c().i(zVar2, 3);
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        ((p) this).c.getClass();
                        c2.b0.b();
                        c2.z zVar3 = c2.b0.c().v;
                        if (zVar3 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        c2.b0.b();
                        c2.b0.c().i(zVar3, 3);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        ((p) this).c.getClass();
                        c2.b0.b();
                        c2.z zVar4 = c2.b0.c().v;
                        if (zVar4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean equals = c2.b0.f().c.equals(zVar4.c);
                        parcel2.writeNoException();
                        int i16 = t.a;
                        parcel2.writeInt(equals ? 1 : 0);
                        return true;
                    case 8:
                        String readString2 = parcel.readString();
                        t.b(parcel);
                        ((p) this).c.getClass();
                        c2.b0.b();
                        ArrayList arrayList3 = c2.b0.c().j;
                        int size3 = arrayList3.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                Object obj2 = arrayList3.get(i17);
                                i17++;
                                c2.z zVar5 = (c2.z) obj2;
                                if (zVar5.c.equals(readString2)) {
                                    bundle = zVar5.s;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                        } else {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                        }
                        return true;
                    case 9:
                        ((p) this).c.getClass();
                        String str = c2.b0.f().c;
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
                                pVar5.c.h((c2.v) it2.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        ((p) this).c.getClass();
                        c2.b0.b();
                        c2.z zVar6 = c2.b0.c().w;
                        if (zVar6 != null && c2.b0.f().c.equals(zVar6.c)) {
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
                        c2.b0.j(readInt3);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            default:
                if (i10 == 1) {
                    i6.b bVar2 = new i6.b((d) this);
                    parcel2.writeNoException();
                    t.d(parcel2, bVar2);
                } else if (i10 == 2) {
                    d dVar = (d) this;
                    r5.b bVar3 = d.e;
                    Log.i(bVar3.a, bVar3.d("onAppEnteredForeground", new Object[0]));
                    dVar.d = 1;
                    Iterator it3 = dVar.c.iterator();
                    while (it3.hasNext()) {
                        ((m) it3.next()).a.m();
                    }
                    parcel2.writeNoException();
                } else if (i10 == 3) {
                    d dVar2 = (d) this;
                    r5.b bVar4 = d.e;
                    Log.i(bVar4.a, bVar4.d("onAppEnteredBackground", new Object[0]));
                    dVar2.d = 2;
                    Iterator it4 = dVar2.c.iterator();
                    while (it4.hasNext()) {
                        n nVar = ((m) it4.next()).a;
                        n.f.b("Stopping RouteDiscovery.", new Object[0]);
                        nVar.c.clear();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            xe.b bVar5 = nVar.e;
                            if (((c2.b0) bVar5.c) == null) {
                                bVar5.c = c2.b0.d((Context) bVar5.b);
                            }
                            c2.b0 b0Var = (c2.b0) bVar5.c;
                            if (b0Var != null) {
                                b0Var.h(nVar);
                            }
                        } else {
                            new c2.t0(Looper.getMainLooper(), 1).post(new k(nVar, i12 == true ? 1 : 0));
                        }
                    }
                    parcel2.writeNoException();
                } else {
                    if (i10 != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
        }
    }
}
