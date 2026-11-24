package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class LocationRequest extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new xff((byte) 8);
    public final WorkSource E;
    public final bnd F;
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
    public final int w;
    public final String x;
    public final boolean y;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, bnd bndVar) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.h = f;
        this.n = z;
        this.r = j6 != -1 ? j6 : j;
        this.s = i3;
        this.w = i4;
        this.x = str;
        this.y = z2;
        this.E = workSource;
        this.F = bndVar;
    }

    public static String c(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = spd.a;
        synchronized (sb2) {
            sb2.setLength(0);
            spd.a(j, sb2);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean b() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = this.a;
        if (i != locationRequest.a) {
            return false;
        }
        if ((i == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b()) {
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.w == locationRequest.w && this.y == locationRequest.y && this.E.equals(locationRequest.E) && cqe.a(this.x, locationRequest.x) && cqe.a(this.F, locationRequest.F);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.E});
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        bnd bndVar;
        int intValue;
        String str;
        String str2;
        StringBuilder r = tb4.r("Request[");
        int i = this.a;
        if (i == 105) {
            r.append(bze.a(i));
        } else {
            r.append("@");
            boolean b = b();
            long j = this.b;
            if (b) {
                spd.a(j, r);
                r.append("/");
                spd.a(this.d, r);
            } else {
                spd.a(j, r);
            }
            r.append(" ");
            r.append(bze.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            r.append(", minUpdateInterval=");
            r.append(c(this.c));
        }
        float f = this.h;
        if (f > 0.0d) {
            r.append(", minUpdateDistance=");
            r.append(f);
        }
        boolean z = false;
        boolean z2 = this.a == 105;
        long j2 = this.r;
        if (!z2 ? j2 != this.b : j2 != Long.MAX_VALUE) {
            r.append(", maxUpdateAge=");
            r.append(c(this.r));
        }
        long j3 = this.e;
        if (j3 != Long.MAX_VALUE) {
            r.append(", duration=");
            spd.a(j3, r);
        }
        int i2 = this.f;
        if (i2 != Integer.MAX_VALUE) {
            r.append(", maxUpdates=");
            r.append(i2);
        }
        int i3 = this.w;
        if (i3 != 0) {
            r.append(", ");
            if (i3 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    sc8.e();
                    return null;
                }
                str2 = "THROTTLE_NEVER";
            }
            r.append(str2);
        }
        int i4 = this.s;
        if (i4 != 0) {
            r.append(", ");
            if (i4 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i4 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i4 != 2) {
                    sc8.e();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            r.append(str);
        }
        if (this.n) {
            r.append(", waitForAccurateLocation");
        }
        if (this.y) {
            r.append(", bypass");
        }
        String str3 = this.x;
        if (str3 != null) {
            r.append(", moduleId=");
            r.append(str3);
        }
        Method method = qyc.d;
        WorkSource workSource = this.E;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                fre.h(invoke);
                z = ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
            if (!z) {
                r.append(", ");
                r.append(workSource);
            }
            bndVar = this.F;
            if (bndVar != null) {
                r.append(", impersonation=");
                r.append(bndVar);
            }
            r.append(']');
            return r.toString();
        }
        Method method2 = qyc.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                fre.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
            if (intValue == 0) {
                z = true;
            }
            if (!z) {
            }
            bndVar = this.F;
            if (bndVar != null) {
            }
            r.append(']');
            return r.toString();
        }
        intValue = 0;
        if (intValue == 0) {
        }
        if (!z) {
        }
        bndVar = this.F;
        if (bndVar != null) {
        }
        r.append(']');
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.b;
        jte.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        jte.q(parcel, 3, 8);
        parcel.writeLong(j2);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        jte.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        jte.q(parcel, 8, 8);
        parcel.writeLong(this.d);
        jte.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        jte.q(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j3 = this.r;
        jte.q(parcel, 11, 8);
        parcel.writeLong(j3);
        jte.q(parcel, 12, 4);
        parcel.writeInt(this.s);
        jte.q(parcel, 13, 4);
        parcel.writeInt(this.w);
        jte.l(parcel, 14, this.x);
        jte.q(parcel, 15, 4);
        parcel.writeInt(this.y ? 1 : 0);
        jte.k(parcel, 16, this.E, i);
        jte.k(parcel, 17, this.F, i);
        jte.s(parcel, r);
    }
}
