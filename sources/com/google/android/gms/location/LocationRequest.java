package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g8.j;
import java.lang.reflect.Method;
import java.util.Arrays;
import n6.l;
import o6.a;
import r7.p;
import u6.f;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new j(5);
    public final r7.j E;
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

    public LocationRequest(int i10, long j3, long j10, long j11, long j12, long j13, int i11, float f7, boolean z10, long j14, int i12, int i13, String str, boolean z11, WorkSource workSource, r7.j jVar) {
        this.a = i10;
        this.b = j3;
        this.c = j10;
        this.d = j11;
        this.e = j12 == Long.MAX_VALUE ? j13 : Math.min(Math.max(1L, j12 - SystemClock.elapsedRealtime()), j13);
        this.f = i11;
        this.h = f7;
        this.n = z10;
        this.r = j14 != -1 ? j14 : j3;
        this.s = i12;
        this.v = i13;
        this.w = str;
        this.x = z11;
        this.y = workSource;
        this.E = jVar;
    }

    public static String c(long j3) {
        String sb2;
        if (j3 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = p.a;
        synchronized (sb3) {
            sb3.setLength(0);
            p.a(sb3, j3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public final boolean b() {
        long j3 = this.d;
        return j3 > 0 && (j3 >> 1) >= this.b;
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
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.v == locationRequest.v && this.x == locationRequest.x && this.y.equals(locationRequest.y) && l.l(this.w, locationRequest.w) && l.l(this.E, locationRequest.E);
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
        r7.j jVar;
        int intValue;
        String str;
        String str2;
        StringBuilder u10 = a4.a.u("Request[");
        int i10 = this.a;
        if (i10 == 105) {
            u10.append(g8.l.a(i10));
        } else {
            u10.append("@");
            if (b()) {
                p.a(u10, this.b);
                u10.append("/");
                p.a(u10, this.d);
            } else {
                p.a(u10, this.b);
            }
            u10.append(" ");
            u10.append(g8.l.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            u10.append(", minUpdateInterval=");
            u10.append(c(this.c));
        }
        float f7 = this.h;
        if (f7 > 0.0d) {
            u10.append(", minUpdateDistance=");
            u10.append(f7);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            u10.append(", maxUpdateAge=");
            u10.append(c(this.r));
        }
        long j3 = this.e;
        if (j3 != Long.MAX_VALUE) {
            u10.append(", duration=");
            p.a(u10, j3);
        }
        int i11 = this.f;
        if (i11 != Integer.MAX_VALUE) {
            u10.append(", maxUpdates=");
            u10.append(i11);
        }
        boolean z10 = true;
        int i12 = this.v;
        if (i12 != 0) {
            u10.append(", ");
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
            u10.append(str2);
        }
        int i13 = this.s;
        if (i13 != 0) {
            u10.append(", ");
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
            u10.append(str);
        }
        if (this.n) {
            u10.append(", waitForAccurateLocation");
        }
        if (this.x) {
            u10.append(", bypass");
        }
        String str3 = this.w;
        if (str3 != null) {
            u10.append(", moduleId=");
            u10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.y;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                l.h(invoke);
                z10 = ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
            if (!z10) {
                u10.append(", ");
                u10.append(workSource);
            }
            jVar = this.E;
            if (jVar != null) {
                u10.append(", impersonation=");
                u10.append(jVar);
            }
            u10.append(']');
            return u10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                l.h(invoke2);
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
            u10.append(']');
            return u10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z10) {
        }
        jVar = this.E;
        if (jVar != null) {
        }
        u10.append(']');
        return u10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        int i11 = this.a;
        e0.s(parcel, 1, 4);
        parcel.writeInt(i11);
        long j3 = this.b;
        e0.s(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.c;
        e0.s(parcel, 3, 8);
        parcel.writeLong(j10);
        e0.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        e0.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        e0.s(parcel, 8, 8);
        parcel.writeLong(this.d);
        e0.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        e0.s(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j11 = this.r;
        e0.s(parcel, 11, 8);
        parcel.writeLong(j11);
        e0.s(parcel, 12, 4);
        parcel.writeInt(this.s);
        e0.s(parcel, 13, 4);
        parcel.writeInt(this.v);
        e0.l(parcel, 14, this.w);
        e0.s(parcel, 15, 4);
        parcel.writeInt(this.x ? 1 : 0);
        e0.k(parcel, 16, this.y, i10);
        e0.k(parcel, 17, this.E, i10);
        e0.r(parcel, q6);
    }
}
