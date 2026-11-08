package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.v;
import j$.util.DesugarCollections;
import j6.x;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Cells.f1;
import r6.a;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i7, ArrayList arrayList, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z9, x xVar, Integer num) {
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
        this.D = str8;
        this.E = bArr;
        this.F = str9;
        this.G = z9;
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

    public final boolean c(int i7) {
        return (this.r & i7) == i7;
    }

    public final x d() {
        x xVar = this.H;
        if (xVar == null) {
            return (c(32) || c(64)) ? new x(1, false, false) : xVar;
        }
        return xVar;
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
        byte[] bArr2 = castDevice.E;
        int i10 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (j6.a.d(str3, str2) && j6.a.d(this.c, castDevice.c) && j6.a.d(this.e, castDevice.e) && j6.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (j6.a.d(str4, str) && (i7 = this.h) == i10 && j6.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && j6.a.d(this.w, castDevice.w) && j6.a.d(Integer.valueOf(this.y), Integer.valueOf(castDevice.y)) && j6.a.d(this.D, castDevice.D) && j6.a.d(this.x, castDevice.x) && j6.a.d(str4, str) && i7 == i10 && ((((bArr = this.E) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && j6.a.d(this.F, castDevice.F) && this.G == castDevice.G && j6.a.d(d(), castDevice.d()))) {
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
        return f1.m("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.d);
        xb.l(parcel, 5, this.e);
        xb.l(parcel, 6, this.f);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.h);
        xb.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.r);
        xb.q(parcel, 10, 4);
        parcel.writeInt(this.s);
        xb.l(parcel, 11, this.w);
        xb.l(parcel, 12, this.x);
        xb.q(parcel, 13, 4);
        parcel.writeInt(this.y);
        xb.l(parcel, 14, this.D);
        xb.c(parcel, 15, this.E);
        xb.l(parcel, 16, this.F);
        xb.q(parcel, 17, 4);
        parcel.writeInt(this.G ? 1 : 0);
        xb.k(parcel, 18, d(), i7);
        xb.i(parcel, 19, this.I);
        xb.s(parcel, r10);
    }
}
