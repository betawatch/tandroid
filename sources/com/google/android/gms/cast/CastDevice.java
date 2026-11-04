package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e6.v;
import i6.x;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.Cells.f1;
import q6.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new v(22);
    public final String E;
    public final byte[] F;
    public final String G;
    public final boolean H;
    public final x I;
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

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i3, ArrayList arrayList, int i10, int i11, String str6, String str7, int i12, String str8, byte[] bArr, String str9, boolean z10, x xVar, Integer num) {
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
        this.h = i3;
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
        this.I = xVar;
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

    public final boolean c(int i3) {
        return (this.r & i3) == i3;
    }

    public final x d() {
        x xVar = this.I;
        if (xVar == null) {
            return (c(32) || c(64)) ? new x(1, false, false) : xVar;
        }
        return xVar;
    }

    public final boolean equals(Object obj) {
        int i3;
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
        if (i6.a.d(str3, str2) && i6.a.d(this.c, castDevice.c) && i6.a.d(this.e, castDevice.e) && i6.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (i6.a.d(str4, str) && (i3 = this.h) == i10 && i6.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && i6.a.d(this.w, castDevice.w) && i6.a.d(Integer.valueOf(this.y), Integer.valueOf(castDevice.y)) && i6.a.d(this.E, castDevice.E) && i6.a.d(this.x, castDevice.x) && i6.a.d(str4, str) && i3 == i10 && ((((bArr = this.F) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && i6.a.d(this.G, castDevice.G) && this.H == castDevice.H && i6.a.d(d(), castDevice.d()))) {
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
        return f1.q("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.d);
        j8.a.m(parcel, 5, this.e);
        j8.a.m(parcel, 6, this.f);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.h);
        j8.a.q(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.r);
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(this.s);
        j8.a.m(parcel, 11, this.w);
        j8.a.m(parcel, 12, this.x);
        j8.a.r(parcel, 13, 4);
        parcel.writeInt(this.y);
        j8.a.m(parcel, 14, this.E);
        j8.a.d(parcel, 15, this.F);
        j8.a.m(parcel, 16, this.G);
        j8.a.r(parcel, 17, 4);
        parcel.writeInt(this.H ? 1 : 0);
        j8.a.l(parcel, 18, d(), i3);
        j8.a.j(parcel, 19, this.J);
        j8.a.t(parcel, s6);
    }
}
