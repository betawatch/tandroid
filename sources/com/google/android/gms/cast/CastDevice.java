package com.google.android.gms.cast;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d6.v;
import h6.x;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Components.b10;
import p6.a;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new v(22);
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
    public final String v;
    public final String w;
    public final int x;
    public final String y;

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
        this.v = str6 == null ? "" : str6;
        this.w = str7;
        this.x = i13;
        this.y = str8;
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
        if (h6.a.d(str3, str2) && h6.a.d(this.c, castDevice.c) && h6.a.d(this.e, castDevice.e) && h6.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (h6.a.d(str4, str) && (i10 = this.h) == i11 && h6.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && h6.a.d(this.v, castDevice.v) && h6.a.d(Integer.valueOf(this.x), Integer.valueOf(castDevice.x)) && h6.a.d(this.y, castDevice.y) && h6.a.d(this.w, castDevice.w) && h6.a.d(str4, str) && i10 == i11 && ((((bArr = this.E) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && h6.a.d(this.F, castDevice.F) && this.G == castDevice.G && h6.a.d(d(), castDevice.d()))) {
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
        return b10.k("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.d);
        df.l(parcel, 5, this.e);
        df.l(parcel, 6, this.f);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        df.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        df.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        df.s(parcel, 10, 4);
        parcel.writeInt(this.s);
        df.l(parcel, 11, this.v);
        df.l(parcel, 12, this.w);
        df.s(parcel, 13, 4);
        parcel.writeInt(this.x);
        df.l(parcel, 14, this.y);
        df.c(parcel, 15, this.E);
        df.l(parcel, 16, this.F);
        df.s(parcel, 17, 4);
        parcel.writeInt(this.G ? 1 : 0);
        df.k(parcel, 18, d(), i10);
        df.i(parcel, 19, this.I);
        df.r(parcel, q5);
    }
}
