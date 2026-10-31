package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c6.v;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g6.x;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o6.a;
import org.telegram.ui.Cells.f1;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new v(22);
    public final String D;
    public final byte[] E;
    public final String F;
    public final boolean G;
    public final x H;
    public final Integer I;
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

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i10, ArrayList arrayList, int i11, int i12, String str6, String str7, int i13, String str8, byte[] bArr, String str9, boolean z10, x xVar, Integer num) {
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
        this.h = i10;
        this.n = arrayList == null ? new ArrayList() : arrayList;
        this.r = i11;
        this.s = i12;
        this.w = str6 == null ? "" : str6;
        this.x = str7;
        this.y = i13;
        this.D = str8;
        this.E = bArr;
        this.F = str9;
        this.G = z10;
        this.H = xVar;
        this.I = num;
    }

    public static CastDevice b(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final boolean c(int i10) {
        return (this.r & i10) == i10;
    }

    public final x d() {
        x xVar = this.H;
        if (xVar == null) {
            return (c(32) || c(64)) ? new x(1, false, false) : xVar;
        }
        return xVar;
    }

    public final boolean equals(Object obj) {
        int i10;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr2 = castDevice.E;
        int i11 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (g6.a.d(str3, str2) && g6.a.d(this.c, castDevice.c) && g6.a.d(this.e, castDevice.e) && g6.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (g6.a.d(str4, str) && (i10 = this.h) == i11 && g6.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && g6.a.d(this.w, castDevice.w) && g6.a.d(Integer.valueOf(this.y), Integer.valueOf(castDevice.y)) && g6.a.d(this.D, castDevice.D) && g6.a.d(this.x, castDevice.x) && g6.a.d(str4, str) && i10 == i11 && ((((bArr = this.E) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && g6.a.d(this.F, castDevice.F) && this.G == castDevice.G && g6.a.d(d(), castDevice.d()))) {
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
        return f1.o("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.d);
        h0.l(parcel, 5, this.e);
        h0.l(parcel, 6, this.f);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        h0.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        h0.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        h0.s(parcel, 10, 4);
        parcel.writeInt(this.s);
        h0.l(parcel, 11, this.w);
        h0.l(parcel, 12, this.x);
        h0.s(parcel, 13, 4);
        parcel.writeInt(this.y);
        h0.l(parcel, 14, this.D);
        h0.c(parcel, 15, this.E);
        h0.l(parcel, 16, this.F);
        h0.s(parcel, 17, 4);
        parcel.writeInt(this.G ? 1 : 0);
        h0.k(parcel, 18, d(), i10);
        h0.i(parcel, 19, this.I);
        h0.r(parcel, q6);
    }
}
