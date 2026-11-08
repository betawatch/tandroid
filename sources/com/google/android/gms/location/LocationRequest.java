package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.b;
import j8.h;
import java.lang.reflect.Method;
import java.util.Arrays;
import q6.m;
import r6.a;
import u7.j;
import u7.n;
import x6.f;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b(23);
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

    public LocationRequest(int i7, long j3, long j10, long j11, long j12, long j13, int i10, float f10, boolean z9, long j14, int i11, int i12, String str, boolean z10, WorkSource workSource, j jVar) {
        this.a = i7;
        this.b = j3;
        this.c = j10;
        this.d = j11;
        this.e = j12 == Long.MAX_VALUE ? j13 : Math.min(Math.max(1L, j12 - SystemClock.elapsedRealtime()), j13);
        this.f = i10;
        this.h = f10;
        this.n = z9;
        this.r = j14 != -1 ? j14 : j3;
        this.s = i11;
        this.w = i12;
        this.x = str;
        this.y = z10;
        this.D = workSource;
        this.E = jVar;
    }

    public static String c(long j3) {
        String sb2;
        if (j3 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = n.a;
        synchronized (sb3) {
            sb3.setLength(0);
            n.a(j3, sb3);
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
        int i7 = this.a;
        if (i7 != locationRequest.a) {
            return false;
        }
        if ((i7 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b()) {
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.w == locationRequest.w && this.y == locationRequest.y && this.D.equals(locationRequest.D) && m.k(this.x, locationRequest.x) && m.k(this.E, locationRequest.E);
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("Request[");
        int i7 = this.a;
        if (i7 == 105) {
            m10.append(h.a(i7));
        } else {
            m10.append("@");
            if (b()) {
                n.a(this.b, m10);
                m10.append("/");
                n.a(this.d, m10);
            } else {
                n.a(this.b, m10);
            }
            m10.append(" ");
            m10.append(h.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            m10.append(", minUpdateInterval=");
            m10.append(c(this.c));
        }
        float f10 = this.h;
        if (f10 > 0.0d) {
            m10.append(", minUpdateDistance=");
            m10.append(f10);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            m10.append(", maxUpdateAge=");
            m10.append(c(this.r));
        }
        long j3 = this.e;
        if (j3 != Long.MAX_VALUE) {
            m10.append(", duration=");
            n.a(j3, m10);
        }
        int i10 = this.f;
        if (i10 != Integer.MAX_VALUE) {
            m10.append(", maxUpdates=");
            m10.append(i10);
        }
        boolean z9 = true;
        int i11 = this.w;
        if (i11 != 0) {
            m10.append(", ");
            if (i11 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i11 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            m10.append(str2);
        }
        int i12 = this.s;
        if (i12 != 0) {
            m10.append(", ");
            if (i12 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i12 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i12 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            m10.append(str);
        }
        if (this.n) {
            m10.append(", waitForAccurateLocation");
        }
        if (this.y) {
            m10.append(", bypass");
        }
        String str3 = this.x;
        if (str3 != null) {
            m10.append(", moduleId=");
            m10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.D;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                m.g(invoke);
                z9 = ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
            if (!z9) {
                m10.append(", ");
                m10.append(workSource);
            }
            jVar = this.E;
            if (jVar != null) {
                m10.append(", impersonation=");
                m10.append(jVar);
            }
            m10.append(']');
            return m10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                m.g(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
            if (intValue != 0) {
                z9 = false;
            }
            if (!z9) {
            }
            jVar = this.E;
            if (jVar != null) {
            }
            m10.append(']');
            return m10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z9) {
        }
        jVar = this.E;
        if (jVar != null) {
        }
        m10.append(']');
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        int i10 = this.a;
        xb.q(parcel, 1, 4);
        parcel.writeInt(i10);
        long j3 = this.b;
        xb.q(parcel, 2, 8);
        parcel.writeLong(j3);
        long j10 = this.c;
        xb.q(parcel, 3, 8);
        parcel.writeLong(j10);
        xb.q(parcel, 6, 4);
        parcel.writeInt(this.f);
        xb.q(parcel, 7, 4);
        parcel.writeFloat(this.h);
        xb.q(parcel, 8, 8);
        parcel.writeLong(this.d);
        xb.q(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        xb.q(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j11 = this.r;
        xb.q(parcel, 11, 8);
        parcel.writeLong(j11);
        xb.q(parcel, 12, 4);
        parcel.writeInt(this.s);
        xb.q(parcel, 13, 4);
        parcel.writeInt(this.w);
        xb.l(parcel, 14, this.x);
        xb.q(parcel, 15, 4);
        parcel.writeInt(this.y ? 1 : 0);
        xb.k(parcel, 16, this.D, i7);
        xb.k(parcel, 17, this.E, i7);
        xb.s(parcel, r10);
    }
}
