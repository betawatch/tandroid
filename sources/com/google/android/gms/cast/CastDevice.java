package com.google.android.gms.cast;

import a6.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o5.v;
import org.telegram.ui.th;
import s5.y;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i10, ArrayList arrayList, int i11, int i12, String str6, String str7, int i13, String str8, byte[] bArr, String str9, boolean z10, y yVar, Integer num) {
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
        if (s5.a.d(str3, str2) && s5.a.d(this.c, castDevice.c) && s5.a.d(this.e, castDevice.e) && s5.a.d(this.d, castDevice.d)) {
            String str4 = this.f;
            if (s5.a.d(str4, str) && (i10 = this.h) == i11 && s5.a.d(this.n, castDevice.n) && this.r == castDevice.r && this.s == castDevice.s && s5.a.d(this.v, castDevice.v) && s5.a.d(Integer.valueOf(this.x), Integer.valueOf(castDevice.x)) && s5.a.d(this.y, castDevice.y) && s5.a.d(this.w, castDevice.w) && s5.a.d(str4, str) && i10 == i11 && ((((bArr = this.A) == null && bArr2 == null) || Arrays.equals(bArr, bArr2)) && s5.a.d(this.B, castDevice.B) && this.C == castDevice.C && s5.a.d(d(), castDevice.d()))) {
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
        return th.j("\"", str, "\" (", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.a);
        o.l(parcel, 3, this.b);
        o.l(parcel, 4, this.d);
        o.l(parcel, 5, this.e);
        o.l(parcel, 6, this.f);
        o.s(parcel, 7, 4);
        parcel.writeInt(this.h);
        o.p(parcel, 8, DesugarCollections.unmodifiableList(this.n));
        o.s(parcel, 9, 4);
        parcel.writeInt(this.r);
        o.s(parcel, 10, 4);
        parcel.writeInt(this.s);
        o.l(parcel, 11, this.v);
        o.l(parcel, 12, this.w);
        o.s(parcel, 13, 4);
        parcel.writeInt(this.x);
        o.l(parcel, 14, this.y);
        o.c(parcel, 15, this.A);
        o.l(parcel, 16, this.B);
        o.s(parcel, 17, 4);
        parcel.writeInt(this.C ? 1 : 0);
        o.k(parcel, 18, d(), i10);
        o.i(parcel, 19, this.E);
        o.r(parcel, q6);
    }
}
