package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import c7.k;
import c7.q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f6.f;
import h7.r8;
import java.lang.reflect.Method;
import java.util.Arrays;
import r6.l;
import z5.a;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new l(12);
    public final k A;
    public int a;
    public long b;
    public long c;
    public final long d;
    public final long e;
    public final int f;
    public final float h;
    public final boolean n;
    public long r;
    public final int s;
    public final int v;
    public final String w;
    public final boolean x;
    public final WorkSource y;

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, k kVar) {
        this.a = i10;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f = i11;
        this.h = f10;
        this.n = z10;
        this.r = j15 != -1 ? j15 : j10;
        this.s = i12;
        this.v = i13;
        this.w = str;
        this.x = z11;
        this.y = workSource;
        this.A = kVar;
    }

    public static String c(long j10) {
        String sb2;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = q.a;
        synchronized (sb3) {
            sb3.setLength(0);
            q.a(sb3, j10);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public final boolean b() {
        long j10 = this.d;
        return j10 > 0 && (j10 >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i10 = this.a;
        if (i10 != locationRequest.a) {
            return false;
        }
        if ((i10 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b()) {
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.v == locationRequest.v && this.x == locationRequest.x && this.y.equals(locationRequest.y) && y5.l.l(this.w, locationRequest.w) && y5.l.l(this.A, locationRequest.A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.y});
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        k kVar;
        int intValue;
        String str;
        String str2;
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("Request[");
        int i10 = this.a;
        if (i10 == 105) {
            o10.append(r7.k.a(i10));
        } else {
            o10.append("@");
            if (b()) {
                q.a(o10, this.b);
                o10.append("/");
                q.a(o10, this.d);
            } else {
                q.a(o10, this.b);
            }
            o10.append(" ");
            o10.append(r7.k.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            o10.append(", minUpdateInterval=");
            o10.append(c(this.c));
        }
        float f10 = this.h;
        if (f10 > 0.0d) {
            o10.append(", minUpdateDistance=");
            o10.append(f10);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            o10.append(", maxUpdateAge=");
            o10.append(c(this.r));
        }
        long j10 = this.e;
        if (j10 != Long.MAX_VALUE) {
            o10.append(", duration=");
            q.a(o10, j10);
        }
        int i11 = this.f;
        if (i11 != Integer.MAX_VALUE) {
            o10.append(", maxUpdates=");
            o10.append(i11);
        }
        boolean z10 = true;
        int i12 = this.v;
        if (i12 != 0) {
            o10.append(", ");
            if (i12 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i12 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            o10.append(str2);
        }
        int i13 = this.s;
        if (i13 != 0) {
            o10.append(", ");
            if (i13 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i13 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i13 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            o10.append(str);
        }
        if (this.n) {
            o10.append(", waitForAccurateLocation");
        }
        if (this.x) {
            o10.append(", bypass");
        }
        String str3 = this.w;
        if (str3 != null) {
            o10.append(", moduleId=");
            o10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.y;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                y5.l.h(invoke);
                z10 = ((Boolean) invoke).booleanValue();
            } catch (Exception e9) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e9);
            }
            if (!z10) {
                o10.append(", ");
                o10.append(workSource);
            }
            kVar = this.A;
            if (kVar != null) {
                o10.append(", impersonation=");
                o10.append(kVar);
            }
            o10.append(']');
            return o10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                y5.l.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
            if (intValue != 0) {
                z10 = false;
            }
            if (!z10) {
            }
            kVar = this.A;
            if (kVar != null) {
            }
            o10.append(']');
            return o10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z10) {
        }
        kVar = this.A;
        if (kVar != null) {
        }
        o10.append(']');
        return o10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        int i11 = this.a;
        r8.s(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.b;
        r8.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.c;
        r8.s(parcel, 3, 8);
        parcel.writeLong(j11);
        r8.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        r8.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        r8.s(parcel, 8, 8);
        parcel.writeLong(this.d);
        r8.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        r8.s(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j12 = this.r;
        r8.s(parcel, 11, 8);
        parcel.writeLong(j12);
        r8.s(parcel, 12, 4);
        parcel.writeInt(this.s);
        r8.s(parcel, 13, 4);
        parcel.writeInt(this.v);
        r8.l(parcel, 14, this.w);
        r8.s(parcel, 15, 4);
        parcel.writeInt(this.x ? 1 : 0);
        r8.k(parcel, 16, this.y, i10);
        r8.k(parcel, 17, this.A, i10);
        r8.r(parcel, q6);
    }
}
