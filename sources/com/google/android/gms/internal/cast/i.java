package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class i extends s4.s {
    public static final j6.b b = new j6.b("MediaRouterCallback", null);
    public final h a;

    public i(h hVar) {
        q6.m.g(hVar);
        this.a = hVar;
    }

    @Override // s4.s
    public final void d(s4.v vVar) {
        try {
            h hVar = this.a;
            String str = vVar.c;
            Bundle bundle = vVar.s;
            Parcel p12 = hVar.p1();
            p12.writeString(str);
            t.c(p12, bundle);
            hVar.t1(p12, 1);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "onRouteAdded", h.class.getSimpleName());
        }
    }

    @Override // s4.s
    public final void e(s4.v vVar) {
        try {
            h hVar = this.a;
            String str = vVar.c;
            Bundle bundle = vVar.s;
            Parcel p12 = hVar.p1();
            p12.writeString(str);
            t.c(p12, bundle);
            hVar.t1(p12, 2);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "onRouteChanged", h.class.getSimpleName());
        }
    }

    @Override // s4.s
    public final void f(s4.v vVar) {
        try {
            h hVar = this.a;
            String str = vVar.c;
            Bundle bundle = vVar.s;
            Parcel p12 = hVar.p1();
            p12.writeString(str);
            t.c(p12, bundle);
            hVar.t1(p12, 3);
        } catch (RemoteException e10) {
            b.a(e10, "Unable to call %s on %s.", "onRouteRemoved", h.class.getSimpleName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v7 */
    @Override // s4.s
    public final void h(s4.x xVar, s4.v vVar, int i7) {
        ?? r18;
        CastDevice b10;
        String str;
        CastDevice b11;
        h hVar = this.a;
        Integer valueOf = Integer.valueOf(i7);
        String str2 = vVar.c;
        boolean z9 = true;
        j6.b bVar = b;
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
                    s4.x.b();
                    ArrayList arrayList = s4.x.c().j;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        s4.v vVar2 = (s4.v) obj;
                        boolean z10 = z9;
                        try {
                            str = vVar2.c;
                            if (str != null && !str.endsWith("-groupRoute") && (b11 = CastDevice.b(vVar2.s)) != null) {
                                String str4 = b11.a;
                                if (str4.startsWith("__cast_nearby__")) {
                                    str4 = str4.substring(16);
                                }
                                if (TextUtils.equals(str4, str3)) {
                                    Object[] objArr = new Object[2];
                                    objArr[0] = str2;
                                    objArr[z10 ? 1 : 0] = str;
                                    bVar.b("routeId is changed from %s to %s", objArr);
                                    break;
                                }
                            }
                            z9 = z10 ? 1 : 0;
                        } catch (RemoteException e10) {
                            e = e10;
                            r18 = z10;
                            String simpleName = h.class.getSimpleName();
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = "onRouteSelected";
                            objArr2[r18] = simpleName;
                            bVar.a(e, "Unable to call %s on %s.", objArr2);
                            return;
                        }
                    }
                }
            } catch (RemoteException e11) {
                e = e11;
                r18 = z9;
            }
        }
        str = str2;
        Parcel r12 = hVar.r1(hVar.p1(), 7);
        int readInt = r12.readInt();
        r12.recycle();
        if (readInt < 220400000) {
            Bundle bundle = vVar.s;
            Parcel p12 = hVar.p1();
            p12.writeString(str);
            t.c(p12, bundle);
            hVar.t1(p12, 4);
            return;
        }
        Bundle bundle2 = vVar.s;
        Parcel p13 = hVar.p1();
        p13.writeString(str);
        p13.writeString(str2);
        t.c(p13, bundle2);
        hVar.t1(p13, 8);
    }

    @Override // s4.s
    public final void j(s4.x xVar, s4.v vVar, int i7) {
        Integer valueOf = Integer.valueOf(i7);
        String str = vVar.c;
        j6.b bVar = b;
        Log.i(bVar.a, bVar.d("onRouteUnselected with reason = %d, routeId = %s", valueOf, str));
        if (vVar.l != 1) {
            bVar.b("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            h hVar = this.a;
            Bundle bundle = vVar.s;
            Parcel p12 = hVar.p1();
            p12.writeString(str);
            t.c(p12, bundle);
            p12.writeInt(i7);
            hVar.t1(p12, 6);
        } catch (RemoteException e10) {
            bVar.a(e10, "Unable to call %s on %s.", "onRouteUnselected", h.class.getSimpleName());
        }
    }
}
