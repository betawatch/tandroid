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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class g extends a7.c {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i10) {
        super(str, 1);
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        int i11 = 0;
        r4 = 0;
        int i12 = 0;
        i11 = 0;
        i11 = 0;
        int i13 = 2;
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
                            hVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new h(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 1);
                        }
                        t.b(parcel);
                        p pVar = (p) this;
                        c2.w b10 = c2.w.b(bundle2);
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
                        c2.w b11 = c2.w.b(bundle3);
                        if (b11 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pVar2.K0(b11, readInt);
                            } else {
                                new a7.e(Looper.getMainLooper(), 2).post(new androidx.activity.g(pVar2, b11, readInt, i13));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        Bundle bundle4 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        t.b(parcel);
                        p pVar3 = (p) this;
                        c2.w b12 = c2.w.b(bundle4);
                        if (b12 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                pVar3.L0(b12);
                            } else {
                                new a7.e(Looper.getMainLooper(), 2).post(new androidx.biometric.j(pVar3, b12, i11, 5));
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        Bundle bundle5 = (Bundle) t.a(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        t.b(parcel);
                        p pVar4 = (p) this;
                        c2.w b13 = c2.w.b(bundle5);
                        if (b13 != null) {
                            pVar4.c.getClass();
                            c2.d0.b();
                            c2.e c3 = c2.d0.c();
                            ArrayList arrayList = c3.j;
                            if (!b13.d()) {
                                if ((readInt2 & 2) != 0 || !c3.p) {
                                    c2.g0 g0Var = c3.u;
                                    boolean z4 = g0Var != null && g0Var.c && c3.f();
                                    int size = arrayList.size();
                                    for (int i14 = 0; i14 < size; i14++) {
                                        c2.b0 b0Var = (c2.b0) arrayList.get(i14);
                                        if (((readInt2 & 1) != 0 && b0Var.d()) || ((z4 && !b0Var.d() && b0Var.c() != c3.r) || !b0Var.h(b13))) {
                                        }
                                    }
                                }
                                i11 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i11);
                        return true;
                    case 5:
                        String readString = parcel.readString();
                        t.b(parcel);
                        u5.b bVar = p.j;
                        bVar.b("select route with routeId = %s", readString);
                        ((p) this).c.getClass();
                        c2.d0.b();
                        ArrayList arrayList2 = c2.d0.c().j;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size2) {
                                Object obj = arrayList2.get(i15);
                                i15++;
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
                        ((p) this).c.getClass();
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
                        ((p) this).c.getClass();
                        c2.d0.b();
                        c2.b0 b0Var4 = c2.d0.c().v;
                        if (b0Var4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean equals = c2.d0.f().c.equals(b0Var4.c);
                        parcel2.writeNoException();
                        int i16 = t.a;
                        parcel2.writeInt(equals ? 1 : 0);
                        return true;
                    case 8:
                        String readString2 = parcel.readString();
                        t.b(parcel);
                        ((p) this).c.getClass();
                        c2.d0.b();
                        ArrayList arrayList3 = c2.d0.c().j;
                        int size3 = arrayList3.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                Object obj2 = arrayList3.get(i17);
                                i17++;
                                c2.b0 b0Var5 = (c2.b0) obj2;
                                if (b0Var5.c.equals(readString2)) {
                                    bundle = b0Var5.s;
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
                        String str = c2.d0.f().c;
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
                                pVar5.c.h((c2.x) it2.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        ((p) this).c.getClass();
                        c2.d0.b();
                        c2.b0 b0Var6 = c2.d0.c().w;
                        if (b0Var6 != null && c2.d0.f().c.equals(b0Var6.c)) {
                            i12 = 1;
                        }
                        parcel2.writeNoException();
                        int i18 = t.a;
                        parcel2.writeInt(i12);
                        return true;
                    case 13:
                        int readInt3 = parcel.readInt();
                        t.b(parcel);
                        ((p) this).c.getClass();
                        c2.d0.j(readInt3);
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            default:
                if (i10 == 1) {
                    l6.b bVar2 = new l6.b((c) this);
                    parcel2.writeNoException();
                    t.d(parcel2, bVar2);
                    return true;
                }
                if (i10 == 2) {
                    c cVar = (c) this;
                    u5.b bVar3 = c.e;
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
                u5.b bVar4 = c.e;
                Log.i(bVar4.a, bVar4.d("onAppEnteredBackground", new Object[0]));
                cVar2.d = 2;
                Iterator it4 = cVar2.c.iterator();
                while (it4.hasNext()) {
                    m mVar = ((l) it4.next()).a;
                    m.f.b("Stopping RouteDiscovery.", new Object[0]);
                    mVar.c.clear();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        af.c cVar3 = mVar.e;
                        if (((c2.d0) cVar3.c) == null) {
                            cVar3.c = c2.d0.d((Context) cVar3.b);
                        }
                        c2.d0 d0Var = (c2.d0) cVar3.c;
                        if (d0Var != null) {
                            d0Var.h(mVar);
                        }
                    } else {
                        new a7.e(Looper.getMainLooper(), 2).post(new j(mVar, i11 == true ? 1 : 0));
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }
}
