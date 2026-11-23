package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.bc;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.v;
import j$.util.DesugarCollections;
import j6.y;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p5.c;
import r6.a;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new v(22);
    public final String E;
    public final byte[] F;
    public final String G;
    public final boolean H;
    public final y I;
    public final Integer J;
    public final String a;
    public final String b;
    public final InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int h;
    public final List n;
    public final int r;
    public final int s;
    public final String w;
    public final String x;
    public final int y;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i7, ArrayList arrayList, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z10, y yVar, Integer num) {
        this.a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.c = InetAddress.getByName(str2);
            } catch (UnknownHostException e10) {
                Log.i("CastDevice", "Unable to convert host address (" + this.b + ") to ipaddress: " + e10.getMessage());
            }
        }
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = str5 == null ? "" : str5;
        this.h = i7;
        this.n = arrayList == null ? new ArrayList() : arrayList;
        this.r = i10;
        this.s = i11;
        this.w = str6 == null ? "" : str6;
        this.x = str7;
        this.y = i12;
        this.E = str8;
        this.F = bArr;
        this.G = str9;
        this.H = z10;
        this.I = yVar;
        this.J = num;
    }

    public static CastDevice b(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean c(int i7) {
        return (this.r & i7) == i7;
    }

    public final y d() {
        y yVar = this.I;
        if (yVar == null) {
            return (c(32) || c(64)) ? new y(1, false, false) : yVar;
        }
        return yVar;
    }

    public final boolean equals(Object obj) {
        int i7;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr2 = castDevice.F;
        int i10 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (j6.a.d(str3, str2) && j6.a.d(this.c, castDevice.c) && j6.a.d(this.e, castDevice.e) && j6.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (j6.a.d(str4, str) && (i7 = this.h) == i10 && j6.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && j6.a.d(this.w, castDevice.w) && j6.a.d(Integer.valueOf(this.y), Integer.valueOf(castDevice.y)) && j6.a.d(this.E, castDevice.E) && j6.a.d(this.x, castDevice.x) && j6.a.d(str4, str) && i7 == i10 && ((((bArr = this.F) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && j6.a.d(this.G, castDevice.G) && this.H == castDevice.H && j6.a.d(d(), castDevice.d()))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String str = this.d;
        if (!TextUtils.isEmpty(str)) {
            int length = str.length();
            str = length <= 2 ? length == 2 ? "xx" : "x" : String.format(locale, "%c%d%c", Character.valueOf(str.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str.charAt(length - 1)));
        }
        return c.l("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.d);
        bc.l(parcel, 5, this.e);
        bc.l(parcel, 6, this.f);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        bc.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        bc.q(parcel, 9, 4);
        parcel.writeInt(this.r);
        bc.q(parcel, 10, 4);
        parcel.writeInt(this.s);
        bc.l(parcel, 11, this.w);
        bc.l(parcel, 12, this.x);
        bc.q(parcel, 13, 4);
        parcel.writeInt(this.y);
        bc.l(parcel, 14, this.E);
        bc.c(parcel, 15, this.F);
        bc.l(parcel, 16, this.G);
        bc.q(parcel, 17, 4);
        parcel.writeInt(this.H ? 1 : 0);
        bc.k(parcel, 18, d(), i7);
        bc.i(parcel, 19, this.J);
        bc.s(parcel, r10);
    }
}
