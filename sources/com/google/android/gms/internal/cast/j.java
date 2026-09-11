package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j extends p4.s {
    public static final g6.b b = new g6.b("MediaRouterCallback", null);
    public final i a;

    public j(i iVar) {
        n6.l.h(iVar);
        this.a = iVar;
    }

    @Override // p4.s
    public final void d(p4.v vVar) {
        try {
            i iVar = this.a;
            String str = vVar.c;
            Bundle bundle = vVar.s;
            Parcel O0 = iVar.O0();
            O0.writeString(str);
            v.c(O0, bundle);
            iVar.S0(O0, 1);
        } catch (RemoteException e7) {
            b.a(e7, "Unable to call %s on %s.", "onRouteAdded", i.class.getSimpleName());
        }
    }

    @Override // p4.s
    public final void e(p4.v vVar) {
        try {
            i iVar = this.a;
            String str = vVar.c;
            Bundle bundle = vVar.s;
            Parcel O0 = iVar.O0();
            O0.writeString(str);
            v.c(O0, bundle);
            iVar.S0(O0, 2);
        } catch (RemoteException e7) {
            b.a(e7, "Unable to call %s on %s.", "onRouteChanged", i.class.getSimpleName());
        }
    }

    @Override // p4.s
    public final void f(p4.v vVar) {
        try {
            i iVar = this.a;
            String str = vVar.c;
            Bundle bundle = vVar.s;
            Parcel O0 = iVar.O0();
            O0.writeString(str);
            v.c(O0, bundle);
            iVar.S0(O0, 3);
        } catch (RemoteException e7) {
            b.a(e7, "Unable to call %s on %s.", "onRouteRemoved", i.class.getSimpleName());
        }
    }

    @Override // p4.s
    public final void h(p4.x xVar, p4.v vVar, int i10) {
        char c10;
        CastDevice b10;
        String str;
        CastDevice b11;
        i iVar = this.a;
        Integer valueOf = Integer.valueOf(i10);
        String str2 = vVar.c;
        g6.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (vVar.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b10 = CastDevice.b(vVar.s)) != null) {
                    String str3 = b10.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    p4.x.b();
                    ArrayList arrayList = p4.x.c().j;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        p4.v vVar2 = (p4.v) obj;
                        c10 = 1;
                        try {
                            str = vVar2.c;
                            if (str != null && !str.endsWith("-groupRoute") && (b11 = CastDevice.b(vVar2.s)) != null) {
                                String str4 = b11.a;
                                if (str4.startsWith("__cast_nearby__")) {
                                    str4 = str4.substring(16);
                                }
                                if (TextUtils.equals(str4, str3)) {
                                    bVar.b("routeId is changed from %s to %s", str2, str);
                                    break;
                                }
                            }
                        } catch (RemoteException e7) {
                            e = e7;
                            String simpleName = i.class.getSimpleName();
                            Object[] objArr = new Object[2];
                            objArr[0] = "onRouteSelected";
                            objArr[c10] = simpleName;
                            bVar.a(e, "Unable to call %s on %s.", objArr);
                            return;
                        }
                    }
                }
            } catch (RemoteException e10) {
                e = e10;
                c10 = 1;
            }
        }
        str = str2;
        Parcel Q0 = iVar.Q0(iVar.O0(), 7);
        int readInt = Q0.readInt();
        Q0.recycle();
        if (readInt < 220400000) {
            Bundle bundle = vVar.s;
            Parcel O0 = iVar.O0();
            O0.writeString(str);
            v.c(O0, bundle);
            iVar.S0(O0, 4);
            return;
        }
        Bundle bundle2 = vVar.s;
        Parcel O02 = iVar.O0();
        O02.writeString(str);
        O02.writeString(str2);
        v.c(O02, bundle2);
        iVar.S0(O02, 8);
    }

    @Override // p4.s
    public final void j(p4.x xVar, p4.v vVar, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        String str = vVar.c;
        g6.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (vVar.l != 1) {
            bVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            i iVar = this.a;
            Bundle bundle = vVar.s;
            Parcel O0 = iVar.O0();
            O0.writeString(str);
            v.c(O0, bundle);
            O0.writeInt(i10);
            iVar.S0(O0, 6);
        } catch (RemoteException e7) {
            bVar.a(e7, "Unable to call %s on %s.", "onRouteUnselected", i.class.getSimpleName());
        }
    }
}
