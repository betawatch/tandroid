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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h extends c7.a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, int i10) {
        super(str, 1);
        this.b = i10;
    }

    @Override // c7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        int i11 = 2;
        int i12 = 0;
        switch (this.b) {
            case 0:
                i iVar = null;
                Bundle bundle = null;
                switch (i10) {
                    case 1:
                        Bundle bundle2 = (Bundle) u.a(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            iVar = queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 0);
                        }
                        u.b(parcel);
                        q qVar = (q) this;
                        c2.w b10 = c2.w.b(bundle2);
                        if (b10 != null) {
                            HashMap hashMap = qVar.e;
                            if (!hashMap.containsKey(b10)) {
                                hashMap.put(b10, new HashSet());
                            }
                            ((Set) hashMap.get(b10)).add(new j(iVar));
                        }
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        Bundle bundle3 = (Bundle) u.a(parcel, Bundle.CREATOR);
                        int readInt = parcel.readInt();
                        u.b(parcel);
                        q qVar2 = (q) this;
                        c2.w b11 = c2.w.b(bundle3);
                        if (b11 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                qVar2.K0(b11, readInt);
                            } else {
                                new c2.v0(Looper.getMainLooper(), 1).post(new androidx.activity.g(qVar2, b11, readInt, i11));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle4 = (Bundle) u.a(parcel, Bundle.CREATOR);
                        u.b(parcel);
                        q qVar3 = (q) this;
                        c2.w b12 = c2.w.b(bundle4);
                        if (b12 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                qVar3.L0(b12);
                            } else {
                                new c2.v0(Looper.getMainLooper(), 1).post(new ab.o(6, qVar3, b12));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        Bundle bundle5 = (Bundle) u.a(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        u.b(parcel);
                        q qVar4 = (q) this;
                        c2.w b13 = c2.w.b(bundle5);
                        if (b13 != null) {
                            qVar4.c.getClass();
                            c2.d0.b();
                            c2.e c3 = c2.d0.c();
                            ArrayList arrayList = c3.j;
                            if (!b13.d()) {
                                if ((readInt2 & 2) != 0 || !c3.p) {
                                    c2.g0 g0Var = c3.u;
                                    boolean z10 = g0Var != null && g0Var.c && c3.f();
                                    int size = arrayList.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        c2.b0 b0Var = (c2.b0) arrayList.get(i13);
                                        if (((readInt2 & 1) != 0 && b0Var.d()) || ((z10 && !b0Var.d() && b0Var.c() != c3.r) || !b0Var.h(b13))) {
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
                        u.b(parcel);
                        s5.b bVar = q.j;
                        bVar.b("select route with routeId = %s", readString);
                        ((q) this).c.getClass();
                        c2.d0.b();
                        ArrayList arrayList2 = c2.d0.c().j;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 < size2) {
                                Object obj = arrayList2.get(i14);
                                i14++;
                                c2.b0 b0Var2 = (c2.b0) obj;
                                if (b0Var2.c.equals(readString)) {
                                    bVar.b("media route is found and selected", new Object[0]);
                                    c2.d0.b();
                                    c2.d0.c().i(b0Var2, 3);
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        ((q) this).c.getClass();
                        c2.d0.b();
                        c2.b0 b0Var3 = c2.d0.c().v;
                        if (b0Var3 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        c2.d0.b();
                        c2.d0.c().i(b0Var3, 3);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        ((q) this).c.getClass();
                        c2.d0.b();
                        c2.b0 b0Var4 = c2.d0.c().v;
                        if (b0Var4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean equals = c2.d0.f().c.equals(b0Var4.c);
                        parcel2.writeNoException();
                        int i15 = u.a;
                        parcel2.writeInt(equals ? 1 : 0);
                        return true;
                    case 8:
                        String readString2 = parcel.readString();
                        u.b(parcel);
                        ((q) this).c.getClass();
                        c2.d0.b();
                        ArrayList arrayList3 = c2.d0.c().j;
                        int size3 = arrayList3.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 < size3) {
                                Object obj2 = arrayList3.get(i16);
                                i16++;
                                c2.b0 b0Var5 = (c2.b0) obj2;
                                if (b0Var5.c.equals(readString2)) {
                                    bundle = b0Var5.s;
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
                        ((q) this).c.getClass();
                        String str = c2.d0.f().c;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        return true;
                    case 10:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 11:
                        q qVar5 = (q) this;
                        HashMap hashMap2 = qVar5.e;
                        Iterator it = hashMap2.values().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((Set) it.next()).iterator();
                            while (it2.hasNext()) {
                                qVar5.c.h((c2.x) it2.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        ((q) this).c.getClass();
                        c2.d0.b();
                        c2.b0 b0Var6 = c2.d0.c().w;
                        if (b0Var6 != null && c2.d0.f().c.equals(b0Var6.c)) {
                            i12 = 1;
                        }
                        parcel2.writeNoException();
                        int i17 = u.a;
                        parcel2.writeInt(i12);
                        return true;
                    case 13:
                        int readInt3 = parcel.readInt();
                        u.b(parcel);
                        ((q) this).c.getClass();
                        c2.d0.j(readInt3);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            default:
                if (i10 == 1) {
                    j6.b bVar2 = new j6.b((d) this);
                    parcel2.writeNoException();
                    u.d(parcel2, bVar2);
                } else if (i10 == 2) {
                    d dVar = (d) this;
                    s5.b bVar3 = d.e;
                    Log.i(bVar3.a, bVar3.d("onAppEnteredForeground", new Object[0]));
                    dVar.d = 1;
                    Iterator it3 = dVar.c.iterator();
                    while (it3.hasNext()) {
                        ((m) it3.next()).a.m();
                    }
                    parcel2.writeNoException();
                } else if (i10 == 3) {
                    d dVar2 = (d) this;
                    s5.b bVar4 = d.e;
                    Log.i(bVar4.a, bVar4.d("onAppEnteredBackground", new Object[0]));
                    dVar2.d = 2;
                    Iterator it4 = dVar2.c.iterator();
                    while (it4.hasNext()) {
                        n nVar = ((m) it4.next()).a;
                        n.f.b("Stopping RouteDiscovery.", new Object[0]);
                        nVar.c.clear();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            ze.b bVar5 = nVar.e;
                            if (((c2.d0) bVar5.b) == null) {
                                bVar5.b = c2.d0.d((Context) bVar5.a);
                            }
                            c2.d0 d0Var = (c2.d0) bVar5.b;
                            if (d0Var != null) {
                                d0Var.h(nVar);
                            }
                        } else {
                            new c2.v0(Looper.getMainLooper(), 1).post(new k(nVar, i12));
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
