package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.g;
import g8.i;
import java.lang.reflect.Method;
import java.util.Arrays;
import n6.l;
import o6.a;
import r7.j;
import r7.n;
import u6.f;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new g(4);
    public final WorkSource D;
    public final j E;
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

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f7, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, j jVar) {
        this.a = i10;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f = i11;
        this.h = f7;
        this.n = z10;
        this.r = j15 != -1 ? j15 : j10;
        this.s = i12;
        this.w = i13;
        this.x = str;
        this.y = z11;
        this.D = workSource;
        this.E = jVar;
    }

    public static String c(long j10) {
        String sb2;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = n.a;
        synchronized (sb3) {
            sb3.setLength(0);
            n.a(j10, sb3);
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
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.w == locationRequest.w && this.y == locationRequest.y && this.D.equals(locationRequest.D) && l.k(this.x, locationRequest.x) && l.k(this.E, locationRequest.E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.D});
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        j jVar;
        int intValue;
        String str;
        String str2;
        StringBuilder t10 = a1.g.t("Request[");
        int i10 = this.a;
        if (i10 == 105) {
            t10.append(i.a(i10));
        } else {
            t10.append("@");
            if (b()) {
                n.a(this.b, t10);
                t10.append("/");
                n.a(this.d, t10);
            } else {
                n.a(this.b, t10);
            }
            t10.append(" ");
            t10.append(i.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            t10.append(", minUpdateInterval=");
            t10.append(c(this.c));
        }
        float f7 = this.h;
        if (f7 > 0.0d) {
            t10.append(", minUpdateDistance=");
            t10.append(f7);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            t10.append(", maxUpdateAge=");
            t10.append(c(this.r));
        }
        long j10 = this.e;
        if (j10 != Long.MAX_VALUE) {
            t10.append(", duration=");
            n.a(j10, t10);
        }
        int i11 = this.f;
        if (i11 != Integer.MAX_VALUE) {
            t10.append(", maxUpdates=");
            t10.append(i11);
        }
        boolean z10 = true;
        int i12 = this.w;
        if (i12 != 0) {
            t10.append(", ");
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
            t10.append(str2);
        }
        int i13 = this.s;
        if (i13 != 0) {
            t10.append(", ");
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
            t10.append(str);
        }
        if (this.n) {
            t10.append(", waitForAccurateLocation");
        }
        if (this.y) {
            t10.append(", bypass");
        }
        String str3 = this.x;
        if (str3 != null) {
            t10.append(", moduleId=");
            t10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.D;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                l.g(invoke);
                z10 = ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
            if (!z10) {
                t10.append(", ");
                t10.append(workSource);
            }
            jVar = this.E;
            if (jVar != null) {
                t10.append(", impersonation=");
                t10.append(jVar);
            }
            t10.append(']');
            return t10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                l.g(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e7) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
            }
            if (intValue != 0) {
                z10 = false;
            }
            if (!z10) {
            }
            jVar = this.E;
            if (jVar != null) {
            }
            t10.append(']');
            return t10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z10) {
        }
        jVar = this.E;
        if (jVar != null) {
        }
        t10.append(']');
        return t10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        int i11 = this.a;
        h0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.b;
        h0.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.c;
        h0.s(parcel, 3, 8);
        parcel.writeLong(j11);
        h0.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        h0.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        h0.s(parcel, 8, 8);
        parcel.writeLong(this.d);
        h0.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        h0.s(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j12 = this.r;
        h0.s(parcel, 11, 8);
        parcel.writeLong(j12);
        h0.s(parcel, 12, 4);
        parcel.writeInt(this.s);
        h0.s(parcel, 13, 4);
        parcel.writeInt(this.w);
        h0.l(parcel, 14, this.x);
        h0.s(parcel, 15, 4);
        parcel.writeInt(this.y ? 1 : 0);
        h0.k(parcel, 16, this.D, i10);
        h0.k(parcel, 17, this.E, i10);
        h0.r(parcel, q6);
    }
}
