package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class i extends c2.w {
    public static final u5.b b = new u5.b("MediaRouterCallback", null);
    public final h a;

    public i(h hVar) {
        b6.m.h(hVar);
        this.a = hVar;
    }

    @Override // c2.w
    public final void d(c2.a0 a0Var) {
        try {
            h hVar = this.a;
            String str = a0Var.c;
            Bundle bundle = a0Var.s;
            Parcel M0 = hVar.M0();
            M0.writeString(str);
            s.c(M0, bundle);
            hVar.Q0(M0, 1);
        } catch (RemoteException e6) {
            b.a(e6, "Unable to call %s on %s.", "onRouteAdded", h.class.getSimpleName());
        }
    }

    @Override // c2.w
    public final void e(c2.a0 a0Var) {
        try {
            h hVar = this.a;
            String str = a0Var.c;
            Bundle bundle = a0Var.s;
            Parcel M0 = hVar.M0();
            M0.writeString(str);
            s.c(M0, bundle);
            hVar.Q0(M0, 2);
        } catch (RemoteException e6) {
            b.a(e6, "Unable to call %s on %s.", "onRouteChanged", h.class.getSimpleName());
        }
    }

    @Override // c2.w
    public final void f(c2.a0 a0Var) {
        try {
            h hVar = this.a;
            String str = a0Var.c;
            Bundle bundle = a0Var.s;
            Parcel M0 = hVar.M0();
            M0.writeString(str);
            s.c(M0, bundle);
            hVar.Q0(M0, 3);
        } catch (RemoteException e6) {
            b.a(e6, "Unable to call %s on %s.", "onRouteRemoved", h.class.getSimpleName());
        }
    }

    @Override // c2.w
    public final void h(c2.c0 c0Var, c2.a0 a0Var, int i10) {
        char c3;
        CastDevice e6;
        String str;
        CastDevice e10;
        h hVar = this.a;
        Integer valueOf = Integer.valueOf(i10);
        String str2 = a0Var.c;
        u5.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (a0Var.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (e6 = CastDevice.e(a0Var.s)) != null) {
                    String str3 = e6.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    c2.c0.b();
                    ArrayList arrayList = c2.c0.c().j;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        c2.a0 a0Var2 = (c2.a0) obj;
                        c3 = 1;
                        try {
                            str = a0Var2.c;
                            if (str != null && !str.endsWith("-groupRoute") && (e10 = CastDevice.e(a0Var2.s)) != null) {
                                String str4 = e10.a;
                                if (str4.startsWith("__cast_nearby__")) {
                                    str4 = str4.substring(16);
                                }
                                if (TextUtils.equals(str4, str3)) {
                                    bVar.b("routeId is changed from %s to %s", str2, str);
                                    break;
                                }
                            }
                        } catch (RemoteException e11) {
                            e = e11;
                            String simpleName = h.class.getSimpleName();
                            Object[] objArr = new Object[2];
                            objArr[0] = "onRouteSelected";
                            objArr[c3] = simpleName;
                            bVar.a(e, "Unable to call %s on %s.", objArr);
                            return;
                        }
                    }
                }
            } catch (RemoteException e12) {
                e = e12;
                c3 = 1;
            }
        }
        str = str2;
        Parcel O0 = hVar.O0(hVar.M0(), 7);
        int readInt = O0.readInt();
        O0.recycle();
        if (readInt < 220400000) {
            Bundle bundle = a0Var.s;
            Parcel M0 = hVar.M0();
            M0.writeString(str);
            s.c(M0, bundle);
            hVar.Q0(M0, 4);
            return;
        }
        Bundle bundle2 = a0Var.s;
        Parcel M02 = hVar.M0();
        M02.writeString(str);
        M02.writeString(str2);
        s.c(M02, bundle2);
        hVar.Q0(M02, 8);
    }

    @Override // c2.w
    public final void j(c2.c0 c0Var, c2.a0 a0Var, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        String str = a0Var.c;
        u5.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (a0Var.l != 1) {
            bVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            h hVar = this.a;
            Bundle bundle = a0Var.s;
            Parcel M0 = hVar.M0();
            M0.writeString(str);
            s.c(M0, bundle);
            M0.writeInt(i10);
            hVar.Q0(M0, 6);
        } catch (RemoteException e6) {
            bVar.a(e6, "Unable to call %s on %s.", "onRouteUnselected", h.class.getSimpleName());
        }
    }
}
