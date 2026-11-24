package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class LocationRequest extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new yhf((byte) 8);
    public final WorkSource E;
    public final epd F;
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

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, epd epdVar) {
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
        this.F = epdVar;
    }

    public static String c(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = vrd.a;
        synchronized (sb2) {
            sb2.setLength(0);
            vrd.a(j, sb2);
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
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.w == locationRequest.w && this.y == locationRequest.y && this.E.equals(locationRequest.E) && fse.a(this.x, locationRequest.x) && fse.a(this.F, locationRequest.F);
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
        epd epdVar;
        int intValue;
        String str;
        String str2;
        StringBuilder s = td4.s("Request[");
        int i = this.a;
        if (i == 105) {
            s.append(d1f.a(i));
        } else {
            s.append("@");
            boolean b = b();
            long j = this.b;
            if (b) {
                vrd.a(j, s);
                s.append("/");
                vrd.a(this.d, s);
            } else {
                vrd.a(j, s);
            }
            s.append(" ");
            s.append(d1f.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            s.append(", minUpdateInterval=");
            s.append(c(this.c));
        }
        float f = this.h;
        if (f > 0.0d) {
            s.append(", minUpdateDistance=");
            s.append(f);
        }
        boolean z = false;
        boolean z2 = this.a == 105;
        long j2 = this.r;
        if (!z2 ? j2 != this.b : j2 != Long.MAX_VALUE) {
            s.append(", maxUpdateAge=");
            s.append(c(this.r));
        }
        long j3 = this.e;
        if (j3 != Long.MAX_VALUE) {
            s.append(", duration=");
            vrd.a(j3, s);
        }
        int i2 = this.f;
        if (i2 != Integer.MAX_VALUE) {
            s.append(", maxUpdates=");
            s.append(i2);
        }
        int i3 = this.w;
        if (i3 != 0) {
            s.append(", ");
            if (i3 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    i98.g();
                    return null;
                }
                str2 = "THROTTLE_NEVER";
            }
            s.append(str2);
        }
        int i4 = this.s;
        if (i4 != 0) {
            s.append(", ");
            if (i4 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i4 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i4 != 2) {
                    i98.g();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            s.append(str);
        }
        if (this.n) {
            s.append(", waitForAccurateLocation");
        }
        if (this.y) {
            s.append(", bypass");
        }
        String str3 = this.x;
        if (str3 != null) {
            s.append(", moduleId=");
            s.append(str3);
        }
        Method method = r0d.d;
        WorkSource workSource = this.E;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                ite.h(invoke);
                z = ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
            if (!z) {
                s.append(", ");
                s.append(workSource);
            }
            epdVar = this.F;
            if (epdVar != null) {
                s.append(", impersonation=");
                s.append(epdVar);
            }
            s.append(']');
            return s.toString();
        }
        Method method2 = r0d.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                ite.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
            if (intValue == 0) {
                z = true;
            }
            if (!z) {
            }
            epdVar = this.F;
            if (epdVar != null) {
            }
            s.append(']');
            return s.toString();
        }
        intValue = 0;
        if (intValue == 0) {
        }
        if (!z) {
        }
        epdVar = this.F;
        if (epdVar != null) {
        }
        s.append(']');
        return s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.b;
        mve.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        mve.q(parcel, 3, 8);
        parcel.writeLong(j2);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        mve.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        mve.q(parcel, 8, 8);
        parcel.writeLong(this.d);
        mve.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        mve.q(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j3 = this.r;
        mve.q(parcel, 11, 8);
        parcel.writeLong(j3);
        mve.q(parcel, 12, 4);
        parcel.writeInt(this.s);
        mve.q(parcel, 13, 4);
        parcel.writeInt(this.w);
        mve.l(parcel, 14, this.x);
        mve.q(parcel, 15, 4);
        parcel.writeInt(this.y ? 1 : 0);
        mve.k(parcel, 16, this.E, i);
        mve.k(parcel, 17, this.F, i);
        mve.s(parcel, r);
    }
}
