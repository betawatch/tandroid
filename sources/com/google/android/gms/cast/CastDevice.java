package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CastDevice extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new e2f((byte) 21);
    public final String E;
    public final byte[] F;
    public final String G;
    public final boolean H;
    public final ckf I;
    public final Integer J;
    public final String a;
    public final String b;
    public final InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int h;
    public final ArrayList n;
    public final int r;
    public final int s;
    public final String w;
    public final String x;
    public final int y;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, ckf ckfVar, Integer num) {
        this.a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.c = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                Log.i("CastDevice", "Unable to convert host address (" + this.b + ") to ipaddress: " + e.getMessage());
            }
        }
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = str5 == null ? "" : str5;
        this.h = i;
        this.n = arrayList == null ? new ArrayList() : arrayList;
        this.r = i2;
        this.s = i3;
        this.w = str6 == null ? "" : str6;
        this.x = str7;
        this.y = i4;
        this.E = str8;
        this.F = bArr;
        this.G = str9;
        this.H = z;
        this.I = ckfVar;
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

    public final boolean c(int i) {
        return (this.r & i) == i;
    }

    public final ckf d() {
        ckf ckfVar = this.I;
        if (ckfVar == null) {
            boolean c = c(32);
            boolean c2 = c(64);
            if (c || c2) {
                return new ckf(1, false, false);
            }
        }
        return ckfVar;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr = castDevice.F;
        int i2 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (!qe1.d(str3, str2) || !qe1.d(this.c, castDevice.c) || !qe1.d(this.e, castDevice.e) || !qe1.d(this.d, castDevice.d)) {
            return false;
        }
        String str4 = this.f;
        if (!qe1.d(str4, str) || (i = this.h) != i2 || !qe1.d(this.n, castDevice.n) || this.r != castDevice.r || this.s != castDevice.s || !qe1.d(this.w, castDevice.w) || !qe1.d(Integer.valueOf(this.y), Integer.valueOf(castDevice.y)) || !qe1.d(this.E, castDevice.E) || !qe1.d(this.x, castDevice.x) || !qe1.d(str4, str) || i != i2) {
            return false;
        }
        byte[] bArr2 = this.F;
        return ((bArr2 == null && bArr == null) || Arrays.equals(bArr2, bArr)) && qe1.d(this.G, castDevice.G) && this.H == castDevice.H && qe1.d(d(), castDevice.d());
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
        return b10.i("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.l(parcel, 4, this.d);
        mve.l(parcel, 5, this.e);
        mve.l(parcel, 6, this.f);
        mve.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        mve.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        mve.q(parcel, 9, 4);
        parcel.writeInt(this.r);
        mve.q(parcel, 10, 4);
        parcel.writeInt(this.s);
        mve.l(parcel, 11, this.w);
        mve.l(parcel, 12, this.x);
        mve.q(parcel, 13, 4);
        parcel.writeInt(this.y);
        mve.l(parcel, 14, this.E);
        mve.c(parcel, 15, this.F);
        mve.l(parcel, 16, this.G);
        mve.q(parcel, 17, 4);
        parcel.writeInt(this.H ? 1 : 0);
        mve.k(parcel, 18, d(), i);
        mve.i(parcel, 19, this.J);
        mve.s(parcel, r);
    }
}
