package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h7.r8;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import m5.w;
import org.telegram.ui.Cells.pa;
import r5.y;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new w(22);
    public final byte[] A;
    public final String B;
    public final boolean C;
    public final y D;
    public final Integer E;
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
    public final String v;
    public final String w;
    public final int x;
    public final String y;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i10, ArrayList arrayList, int i11, int i12, String str6, String str7, int i13, String str8, byte[] bArr, String str9, boolean z10, y yVar, Integer num) {
        this.a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.c = InetAddress.getByName(str2);
            } catch (UnknownHostException e9) {
                Log.i("CastDevice", "Unable to convert host address (" + this.b + ") to ipaddress: " + e9.getMessage());
            }
        }
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = str5 == null ? "" : str5;
        this.h = i10;
        this.n = arrayList == null ? new ArrayList() : arrayList;
        this.r = i11;
        this.s = i12;
        this.v = str6 == null ? "" : str6;
        this.w = str7;
        this.x = i13;
        this.y = str8;
        this.A = bArr;
        this.B = str9;
        this.C = z10;
        this.D = yVar;
        this.E = num;
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

    public final y d() {
        y yVar = this.D;
        if (yVar == null) {
            return (c(32) || c(64)) ? new y(1, false, false) : yVar;
        }
        return yVar;
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
        byte[] bArr2 = castDevice.A;
        int i11 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (r5.a.d(str3, str2) && r5.a.d(this.c, castDevice.c) && r5.a.d(this.e, castDevice.e) && r5.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (r5.a.d(str4, str) && (i10 = this.h) == i11 && r5.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && r5.a.d(this.v, castDevice.v) && r5.a.d(Integer.valueOf(this.x), Integer.valueOf(castDevice.x)) && r5.a.d(this.y, castDevice.y) && r5.a.d(this.w, castDevice.w) && r5.a.d(str4, str) && i10 == i11 && ((((bArr = this.A) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && r5.a.d(this.B, castDevice.B) && this.C == castDevice.C && r5.a.d(d(), castDevice.d()))) {
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
        return pa.j("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.d);
        r8.l(parcel, 5, this.e);
        r8.l(parcel, 6, this.f);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        r8.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        r8.s(parcel, 10, 4);
        parcel.writeInt(this.s);
        r8.l(parcel, 11, this.v);
        r8.l(parcel, 12, this.w);
        r8.s(parcel, 13, 4);
        parcel.writeInt(this.x);
        r8.l(parcel, 14, this.y);
        r8.c(parcel, 15, this.A);
        r8.l(parcel, 16, this.B);
        r8.s(parcel, 17, 4);
        parcel.writeInt(this.C ? 1 : 0);
        r8.k(parcel, 18, d(), i10);
        r8.i(parcel, 19, this.E);
        r8.r(parcel, q6);
    }
}
