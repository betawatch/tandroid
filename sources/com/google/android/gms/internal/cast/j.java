package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends c2.w {
    public static final q5.b b = new q5.b("MediaRouterCallback", null);
    public final i a;

    public j(i iVar) {
        x5.l.h(iVar);
        this.a = iVar;
    }

    @Override // c2.w
    public final void d(c2.a0 a0Var) {
        try {
            i iVar = this.a;
            String str = a0Var.c;
            Bundle bundle = a0Var.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            u.c(M0, bundle);
            iVar.Q0(M0, 1);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "onRouteAdded", i.class.getSimpleName());
        }
    }

    @Override // c2.w
    public final void e(c2.a0 a0Var) {
        try {
            i iVar = this.a;
            String str = a0Var.c;
            Bundle bundle = a0Var.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            u.c(M0, bundle);
            iVar.Q0(M0, 2);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "onRouteChanged", i.class.getSimpleName());
        }
    }

    @Override // c2.w
    public final void f(c2.a0 a0Var) {
        try {
            i iVar = this.a;
            String str = a0Var.c;
            Bundle bundle = a0Var.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            u.c(M0, bundle);
            iVar.Q0(M0, 3);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "onRouteRemoved", i.class.getSimpleName());
        }
    }

    @Override // c2.w
    public final void h(c2.c0 c0Var, c2.a0 a0Var, int i9) {
        char c10;
        CastDevice b10;
        String str;
        CastDevice b11;
        i iVar = this.a;
        Integer valueOf = Integer.valueOf(i9);
        String str2 = a0Var.c;
        q5.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (a0Var.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b10 = CastDevice.b(a0Var.s)) != null) {
                    String str3 = b10.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    c2.c0.b();
                    ArrayList arrayList = c2.c0.c().j;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        c2.a0 a0Var2 = (c2.a0) obj;
                        c10 = 1;
                        try {
                            str = a0Var2.c;
                            if (str != null && !str.endsWith("-groupRoute") && (b11 = CastDevice.b(a0Var2.s)) != null) {
                                String str4 = b11.a;
                                if (str4.startsWith("__cast_nearby__")) {
                                    str4 = str4.substring(16);
                                }
                                if (TextUtils.equals(str4, str3)) {
                                    bVar.b("routeId is changed from %s to %s", str2, str);
                                    break;
                                }
                            }
                        } catch (RemoteException e10) {
                            e = e10;
                            String simpleName = i.class.getSimpleName();
                            Object[] objArr = new Object[2];
                            objArr[0] = "onRouteSelected";
                            objArr[c10] = simpleName;
                            bVar.a(e, "Unable to call %s on %s.", objArr);
                            return;
                        }
                    }
                }
            } catch (RemoteException e11) {
                e = e11;
                c10 = 1;
            }
        }
        str = str2;
        Parcel O0 = iVar.O0(iVar.M0(), 7);
        int readInt = O0.readInt();
        O0.recycle();
        if (readInt < 220400000) {
            Bundle bundle = a0Var.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            u.c(M0, bundle);
            iVar.Q0(M0, 4);
            return;
        }
        Bundle bundle2 = a0Var.s;
        Parcel M02 = iVar.M0();
        M02.writeString(str);
        M02.writeString(str2);
        u.c(M02, bundle2);
        iVar.Q0(M02, 8);
    }

    @Override // c2.w
    public final void j(c2.c0 c0Var, c2.a0 a0Var, int i9) {
        Integer valueOf = Integer.valueOf(i9);
        String str = a0Var.c;
        q5.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (a0Var.l != 1) {
            bVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            i iVar = this.a;
            Bundle bundle = a0Var.s;
            Parcel M0 = iVar.M0();
            M0.writeString(str);
            u.c(M0, bundle);
            M0.writeInt(i9);
            iVar.Q0(M0, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "onRouteUnselected", i.class.getSimpleName());
        }
    }
}
