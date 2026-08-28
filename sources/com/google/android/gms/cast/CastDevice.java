package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import m5.v;
import org.telegram.ui.Cells.j2;
import q5.y;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new v(22);
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

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i9, ArrayList arrayList, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z10, y yVar, Integer num) {
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
        this.h = i9;
        this.n = arrayList == null ? new ArrayList() : arrayList;
        this.r = i10;
        this.s = i11;
        this.v = str6 == null ? "" : str6;
        this.w = str7;
        this.x = i12;
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

    public final boolean c(int i9) {
        return (this.r & i9) == i9;
    }

    public final y d() {
        y yVar = this.D;
        if (yVar == null) {
            return (c(32) || c(64)) ? new y(1, false, false) : yVar;
        }
        return yVar;
    }

    public final boolean equals(Object obj) {
        int i9;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr2 = castDevice.A;
        int i10 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (q5.a.d(str3, str2) && q5.a.d(this.c, castDevice.c) && q5.a.d(this.e, castDevice.e) && q5.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (q5.a.d(str4, str) && (i9 = this.h) == i10 && q5.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && q5.a.d(this.v, castDevice.v) && q5.a.d(Integer.valueOf(this.x), Integer.valueOf(castDevice.x)) && q5.a.d(this.y, castDevice.y) && q5.a.d(this.w, castDevice.w) && q5.a.d(str4, str) && i9 == i10 && ((((bArr = this.A) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && q5.a.d(this.B, castDevice.B) && this.C == castDevice.C && q5.a.d(d(), castDevice.d()))) {
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
        return j2.h("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.d);
        p8.l(parcel, 5, this.e);
        p8.l(parcel, 6, this.f);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        p8.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        p8.s(parcel, 10, 4);
        parcel.writeInt(this.s);
        p8.l(parcel, 11, this.v);
        p8.l(parcel, 12, this.w);
        p8.s(parcel, 13, 4);
        parcel.writeInt(this.x);
        p8.l(parcel, 14, this.y);
        p8.c(parcel, 15, this.A);
        p8.l(parcel, 16, this.B);
        p8.s(parcel, 17, 4);
        parcel.writeInt(this.C ? 1 : 0);
        p8.k(parcel, 18, d(), i9);
        p8.i(parcel, 19, this.E);
        p8.r(parcel, q10);
    }
}
