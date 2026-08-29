package com.google.android.gms.location;

import a6.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.o;
import d7.j;
import d7.p;
import g6.f;
import java.lang.reflect.Method;
import java.util.Arrays;
import s6.i;
import s7.k;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new i(16);
    public final j A;
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

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f9, boolean z10, long j15, int i12, int i13, String str, boolean z11, WorkSource workSource, j jVar) {
        this.a = i10;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f = i11;
        this.h = f9;
        this.n = z10;
        this.r = j15 != -1 ? j15 : j10;
        this.s = i12;
        this.v = i13;
        this.w = str;
        this.x = z11;
        this.y = workSource;
        this.A = jVar;
    }

    public static String c(long j10) {
        String sb2;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = p.a;
        synchronized (sb3) {
            sb3.setLength(0);
            p.a(sb3, j10);
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
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.v == locationRequest.v && this.x == locationRequest.x && this.y.equals(locationRequest.y) && l.l(this.w, locationRequest.w) && l.l(this.A, locationRequest.A);
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
        j jVar;
        int intValue;
        String str;
        String str2;
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Request[");
        int i10 = this.a;
        if (i10 == 105) {
            n10.append(k.a(i10));
        } else {
            n10.append("@");
            if (b()) {
                p.a(n10, this.b);
                n10.append("/");
                p.a(n10, this.d);
            } else {
                p.a(n10, this.b);
            }
            n10.append(" ");
            n10.append(k.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            n10.append(", minUpdateInterval=");
            n10.append(c(this.c));
        }
        float f9 = this.h;
        if (f9 > 0.0d) {
            n10.append(", minUpdateDistance=");
            n10.append(f9);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            n10.append(", maxUpdateAge=");
            n10.append(c(this.r));
        }
        long j10 = this.e;
        if (j10 != Long.MAX_VALUE) {
            n10.append(", duration=");
            p.a(n10, j10);
        }
        int i11 = this.f;
        if (i11 != Integer.MAX_VALUE) {
            n10.append(", maxUpdates=");
            n10.append(i11);
        }
        boolean z10 = true;
        int i12 = this.v;
        if (i12 != 0) {
            n10.append(", ");
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
            n10.append(str2);
        }
        int i13 = this.s;
        if (i13 != 0) {
            n10.append(", ");
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
            n10.append(str);
        }
        if (this.n) {
            n10.append(", waitForAccurateLocation");
        }
        if (this.x) {
            n10.append(", bypass");
        }
        String str3 = this.w;
        if (str3 != null) {
            n10.append(", moduleId=");
            n10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.y;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                l.h(invoke);
                z10 = ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
            if (!z10) {
                n10.append(", ");
                n10.append(workSource);
            }
            jVar = this.A;
            if (jVar != null) {
                n10.append(", impersonation=");
                n10.append(jVar);
            }
            n10.append(']');
            return n10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                l.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
            if (intValue != 0) {
                z10 = false;
            }
            if (!z10) {
            }
            jVar = this.A;
            if (jVar != null) {
            }
            n10.append(']');
            return n10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z10) {
        }
        jVar = this.A;
        if (jVar != null) {
        }
        n10.append(']');
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.a;
        o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.b;
        o.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.c;
        o.s(parcel, 3, 8);
        parcel.writeLong(j11);
        o.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        o.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        o.s(parcel, 8, 8);
        parcel.writeLong(this.d);
        o.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        o.s(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j12 = this.r;
        o.s(parcel, 11, 8);
        parcel.writeLong(j12);
        o.s(parcel, 12, 4);
        parcel.writeInt(this.s);
        o.s(parcel, 13, 4);
        parcel.writeInt(this.v);
        o.l(parcel, 14, this.w);
        o.s(parcel, 15, 4);
        parcel.writeInt(this.x ? 1 : 0);
        o.k(parcel, 16, this.y, i10);
        o.k(parcel, 17, this.A, i10);
        o.r(parcel, q6);
    }
}
