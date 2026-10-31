package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends p4.t {
    public static final g6.b b = new g6.b("MediaRouterCallback", null);
    public final h a;

    public i(h hVar) {
        n6.l.g(hVar);
        this.a = hVar;
    }

    @Override // p4.t
    public final void d(p4.w wVar) {
        try {
            h hVar = this.a;
            String str = wVar.c;
            Bundle bundle = wVar.s;
            Parcel P0 = hVar.P0();
            P0.writeString(str);
            u.c(P0, bundle);
            hVar.T0(P0, 1);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteAdded", h.class.getSimpleName());
        }
    }

    @Override // p4.t
    public final void e(p4.w wVar) {
        try {
            h hVar = this.a;
            String str = wVar.c;
            Bundle bundle = wVar.s;
            Parcel P0 = hVar.P0();
            P0.writeString(str);
            u.c(P0, bundle);
            hVar.T0(P0, 2);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteChanged", h.class.getSimpleName());
        }
    }

    @Override // p4.t
    public final void f(p4.w wVar) {
        try {
            h hVar = this.a;
            String str = wVar.c;
            Bundle bundle = wVar.s;
            Parcel P0 = hVar.P0();
            P0.writeString(str);
            u.c(P0, bundle);
            hVar.T0(P0, 3);
        } catch (RemoteException e) {
            b.a(e, "Unable to call %s on %s.", "onRouteRemoved", h.class.getSimpleName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v7 */
    @Override // p4.t
    public final void h(p4.y yVar, p4.w wVar, int i10) {
        ?? r18;
        CastDevice b10;
        String str;
        CastDevice b11;
        h hVar = this.a;
        Integer valueOf = Integer.valueOf(i10);
        String str2 = wVar.c;
        boolean z10 = true;
        g6.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteSelected with reason = %d, routeId = %s", valueOf, str2));
        if (wVar.l != 1) {
            return;
        }
        if (str2 != null) {
            try {
                if (str2.endsWith("-groupRoute") && (b10 = CastDevice.b(wVar.s)) != null) {
                    String str3 = b10.a;
                    if (str3.startsWith("__cast_nearby__")) {
                        str3 = str3.substring(16);
                    }
                    p4.y.b();
                    ArrayList arrayList = p4.y.c().j;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        p4.w wVar2 = (p4.w) obj;
                        boolean z11 = z10;
                        try {
                            str = wVar2.c;
                            if (str != null && !str.endsWith("-groupRoute") && (b11 = CastDevice.b(wVar2.s)) != null) {
                                String str4 = b11.a;
                                if (str4.startsWith("__cast_nearby__")) {
                                    str4 = str4.substring(16);
                                }
                                if (TextUtils.equals(str4, str3)) {
                                    Object[] objArr = new Object[2];
                                    objArr[0] = str2;
                                    objArr[z11 ? 1 : 0] = str;
                                    bVar.b("routeId is changed from %s to %s", objArr);
                                    break;
                                }
                            }
                            z10 = z11 ? 1 : 0;
                        } catch (RemoteException e) {
                            e = e;
                            r18 = z11;
                            String simpleName = h.class.getSimpleName();
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = "onRouteSelected";
                            objArr2[r18] = simpleName;
                            bVar.a(e, "Unable to call %s on %s.", objArr2);
                            return;
                        }
                    }
                }
            } catch (RemoteException e7) {
                e = e7;
                r18 = z10;
            }
        }
        str = str2;
        Parcel R0 = hVar.R0(hVar.P0(), 7);
        int readInt = R0.readInt();
        R0.recycle();
        if (readInt < 220400000) {
            Bundle bundle = wVar.s;
            Parcel P0 = hVar.P0();
            P0.writeString(str);
            u.c(P0, bundle);
            hVar.T0(P0, 4);
            return;
        }
        Bundle bundle2 = wVar.s;
        Parcel P02 = hVar.P0();
        P02.writeString(str);
        P02.writeString(str2);
        u.c(P02, bundle2);
        hVar.T0(P02, 8);
    }

    @Override // p4.t
    public final void j(p4.y yVar, p4.w wVar, int i10) {
        Integer valueOf = Integer.valueOf(i10);
        String str = wVar.c;
        g6.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (wVar.l != 1) {
            bVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            h hVar = this.a;
            Bundle bundle = wVar.s;
            Parcel P0 = hVar.P0();
            P0.writeString(str);
            u.c(P0, bundle);
            P0.writeInt(i10);
            hVar.T0(P0, 6);
        } catch (RemoteException e) {
            bVar.a(e, "Unable to call %s on %s.", "onRouteUnselected", h.class.getSimpleName());
        }
    }
}
