package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Method;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class LocationRequest extends c4 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new nkf((byte) 8);
    public final WorkSource E;
    public final srd F;
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

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, String str, boolean z2, WorkSource workSource, srd srdVar) {
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
        this.F = srdVar;
    }

    public static String c(long j) {
        String sb;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = iud.a;
        synchronized (sb2) {
            sb2.setLength(0);
            iud.a(j, sb2);
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
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.w == locationRequest.w && this.y == locationRequest.y && this.E.equals(locationRequest.E) && vue.a(this.x, locationRequest.x) && vue.a(this.F, locationRequest.F);
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
        srd srdVar;
        int intValue;
        String str;
        String str2;
        StringBuilder r = qd4.r("Request[");
        int i = this.a;
        if (i == 105) {
            r.append(t3f.a(i));
        } else {
            r.append("@");
            boolean b = b();
            long j = this.b;
            if (b) {
                iud.a(j, r);
                r.append("/");
                iud.a(this.d, r);
            } else {
                iud.a(j, r);
            }
            r.append(" ");
            r.append(t3f.a(this.a));
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
            iud.a(j3, r);
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
                    iy8.d();
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
                    iy8.d();
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
        Method method = g3d.d;
        WorkSource workSource = this.E;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                xve.h(invoke);
                z = ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
            if (!z) {
                r.append(", ");
                r.append(workSource);
            }
            srdVar = this.F;
            if (srdVar != null) {
                r.append(", impersonation=");
                r.append(srdVar);
            }
            r.append(']');
            return r.toString();
        }
        Method method2 = g3d.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                xve.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
            if (intValue == 0) {
                z = true;
            }
            if (!z) {
            }
            srdVar = this.F;
            if (srdVar != null) {
            }
            r.append(']');
            return r.toString();
        }
        intValue = 0;
        if (intValue == 0) {
        }
        if (!z) {
        }
        srdVar = this.F;
        if (srdVar != null) {
        }
        r.append(']');
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.b;
        bye.q(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        bye.q(parcel, 3, 8);
        parcel.writeLong(j2);
        bye.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        bye.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        bye.q(parcel, 8, 8);
        parcel.writeLong(this.d);
        bye.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        bye.q(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j3 = this.r;
        bye.q(parcel, 11, 8);
        parcel.writeLong(j3);
        bye.q(parcel, 12, 4);
        parcel.writeInt(this.s);
        bye.q(parcel, 13, 4);
        parcel.writeInt(this.w);
        bye.l(parcel, 14, this.x);
        bye.q(parcel, 15, 4);
        parcel.writeInt(this.y ? 1 : 0);
        bye.k(parcel, 16, this.E, i);
        bye.k(parcel, 17, this.F, i);
        bye.s(parcel, r);
    }
}
