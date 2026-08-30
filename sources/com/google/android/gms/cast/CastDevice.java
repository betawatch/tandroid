package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j$.util.DesugarCollections;
import j7.f5;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.telegram.ui.yh;
import q5.v;
import u5.y;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new v(22);
    public final byte[] B;
    public final String C;
    public final boolean D;
    public final y E;
    public final Integer F;
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

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i10, ArrayList arrayList, int i11, int i12, String str6, String str7, int i13, String str8, byte[] bArr, String str9, boolean z4, y yVar, Integer num) {
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
        this.B = bArr;
        this.C = str9;
        this.D = z4;
        this.E = yVar;
        this.F = num;
    }

    public static CastDevice e(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
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
        byte[] bArr2 = castDevice.B;
        int i11 = castDevice.h;
        String str = castDevice.f;
        String str2 = castDevice.a;
        String str3 = this.a;
        if (str3 == null) {
            return str2 == null;
        }
        if (u5.a.d(str3, str2) && u5.a.d(this.c, castDevice.c) && u5.a.d(this.e, castDevice.e) && u5.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (u5.a.d(str4, str) && (i10 = this.h) == i11 && u5.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && u5.a.d(this.v, castDevice.v) && u5.a.d(Integer.valueOf(this.x), Integer.valueOf(castDevice.x)) && u5.a.d(this.y, castDevice.y) && u5.a.d(this.w, castDevice.w) && u5.a.d(str4, str) && i10 == i11 && ((((bArr = this.B) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && u5.a.d(this.C, castDevice.C) && this.D == castDevice.D && u5.a.d(g(), castDevice.g()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i10) {
        return (this.r & i10) == i10;
    }

    public final y g() {
        y yVar = this.E;
        if (yVar == null) {
            return (f(32) || f(64)) ? new y(1, false, false) : yVar;
        }
        return yVar;
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
        return yh.l("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.l(parcel, 4, this.d);
        f5.l(parcel, 5, this.e);
        f5.l(parcel, 6, this.f);
        f5.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        f5.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        f5.s(parcel, 10, 4);
        parcel.writeInt(this.s);
        f5.l(parcel, 11, this.v);
        f5.l(parcel, 12, this.w);
        f5.s(parcel, 13, 4);
        parcel.writeInt(this.x);
        f5.l(parcel, 14, this.y);
        f5.c(parcel, 15, this.B);
        f5.l(parcel, 16, this.C);
        f5.s(parcel, 17, 4);
        parcel.writeInt(this.D ? 1 : 0);
        f5.k(parcel, 18, g(), i10);
        f5.i(parcel, 19, this.F);
        f5.r(parcel, q10);
    }
}
