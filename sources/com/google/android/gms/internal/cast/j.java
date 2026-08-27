package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends c2.v {
    public static final r5.b b = new r5.b("MediaRouterCallback", null);
    public final i a;

    public j(i iVar) {
        y5.l.h(iVar);
        this.a = iVar;
    }

    @Override // c2.v
    public final void d(c2.z zVar) {
        try {
            i iVar = this.a;
            String str = zVar.c;
            Bundle bundle = zVar.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            t.c(M0, bundle);
            iVar.Q0(M0, 1);
        } catch (RemoteException e9) {
            b.a(e9, "Unable to call %s on %s.", "onRouteAdded", i.class.getSimpleName());
        }
    }

    @Override // c2.v
    public final void e(c2.z zVar) {
        try {
            i iVar = this.a;
            String str = zVar.c;
            Bundle bundle = zVar.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            t.c(M0, bundle);
            iVar.Q0(M0, 2);
        } catch (RemoteException e9) {
            b.a(e9, "Unable to call %s on %s.", "onRouteChanged", i.class.getSimpleName());
        }
    }

    @Override // c2.v
    public final void f(c2.z zVar) {
        try {
            i iVar = this.a;
            String str = zVar.c;
            Bundle bundle = zVar.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            t.c(M0, bundle);
            iVar.Q0(M0, 3);
        } catch (RemoteException e9) {
            b.a(e9, "Unable to call %s on %s.", "onRouteRemoved", i.class.getSimpleName());
        }
    }

    @Override // c2.v
    public final void h(c2.b0 b0Var, c2.z zVar, int i10) {
        char c10;
        CastDevice b10;
        String str;
        CastDevice b11;
        i iVar = this.a;
        Integer valueOf = Integer.valueOf(i10);
        String str2 = zVar.c;
        r5.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (zVar.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b10 = CastDevice.b(zVar.s)) != null) {
                    String str3 = b10.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    c2.b0.b();
                    ArrayList arrayList = c2.b0.c().j;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        c2.z zVar2 = (c2.z) obj;
                        c10 = 1;
                        try {
                            str = zVar2.c;
                            if (str != null && !str.endsWith("-groupRoute") && (b11 = CastDevice.b(zVar2.s)) != null) {
                                String str4 = b11.a;
                                if (str4.startsWith("__cast_nearby__")) {
                                    str4 = str4.substring(16);
                                }
                                if (TextUtils.equals(str4, str3)) {
                                    bVar.b("routeId is changed from %s to %s", str2, str);
                                    break;
                                }
                            }
                        } catch (RemoteException e9) {
                            e = e9;
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
        Parcel O0 = iVar.O0(iVar.M0(), 7);
        int readInt = O0.readInt();
        O0.recycle();
        if (readInt < 220400000) {
            Bundle bundle = zVar.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            t.c(M0, bundle);
            iVar.Q0(M0, 4);
            return;
        }
        Bundle bundle2 = zVar.s;
        Parcel M02 = iVar.M0();
        M02.writeString(str);
        M02.writeString(str2);
        t.c(M02, bundle2);
        iVar.Q0(M02, 8);
    }

    @Override // c2.v
    public final void j(c2.b0 b0Var, c2.z zVar, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        String str = zVar.c;
        r5.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (zVar.l != 1) {
            bVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            i iVar = this.a;
            Bundle bundle = zVar.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            t.c(M0, bundle);
            M0.writeInt(i10);
            iVar.Q0(M0, 6);
        } catch (RemoteException e9) {
            bVar.a(e9, "Unable to call %s on %s.", "onRouteUnselected", i.class.getSimpleName());
        }
    }
}
