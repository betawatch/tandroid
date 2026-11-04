package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i7.p;
import i8.h;
import java.lang.reflect.Method;
import java.util.Arrays;
import p6.m;
import q6.a;
import t7.j;
import t7.n;
import w6.f;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new p(8);
    public final WorkSource E;
    public final j F;
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

    public LocationRequest(int i3, long j10, long j11, long j12, long j13, long j14, int i10, float f10, boolean z10, long j15, int i11, int i12, String str, boolean z11, WorkSource workSource, j jVar) {
        this.a = i3;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f = i10;
        this.h = f10;
        this.n = z10;
        this.r = j15 != -1 ? j15 : j10;
        this.s = i11;
        this.w = i12;
        this.x = str;
        this.y = z11;
        this.E = workSource;
        this.F = jVar;
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
        int i3 = this.a;
        if (i3 != locationRequest.a) {
            return false;
        }
        if ((i3 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b()) {
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.w == locationRequest.w && this.y == locationRequest.y && this.E.equals(locationRequest.E) && m.k(this.x, locationRequest.x) && m.k(this.F, locationRequest.F);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.E});
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
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l("Request[");
        int i3 = this.a;
        if (i3 == 105) {
            l10.append(h.a(i3));
        } else {
            l10.append("@");
            if (b()) {
                n.a(this.b, l10);
                l10.append("/");
                n.a(this.d, l10);
            } else {
                n.a(this.b, l10);
            }
            l10.append(" ");
            l10.append(h.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            l10.append(", minUpdateInterval=");
            l10.append(c(this.c));
        }
        float f10 = this.h;
        if (f10 > 0.0d) {
            l10.append(", minUpdateDistance=");
            l10.append(f10);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            l10.append(", maxUpdateAge=");
            l10.append(c(this.r));
        }
        long j10 = this.e;
        if (j10 != Long.MAX_VALUE) {
            l10.append(", duration=");
            n.a(j10, l10);
        }
        int i10 = this.f;
        if (i10 != Integer.MAX_VALUE) {
            l10.append(", maxUpdates=");
            l10.append(i10);
        }
        boolean z10 = true;
        int i11 = this.w;
        if (i11 != 0) {
            l10.append(", ");
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
            l10.append(str2);
        }
        int i12 = this.s;
        if (i12 != 0) {
            l10.append(", ");
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
            l10.append(str);
        }
        if (this.n) {
            l10.append(", waitForAccurateLocation");
        }
        if (this.y) {
            l10.append(", bypass");
        }
        String str3 = this.x;
        if (str3 != null) {
            l10.append(", moduleId=");
            l10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.E;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                m.g(invoke);
                z10 = ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
            if (!z10) {
                l10.append(", ");
                l10.append(workSource);
            }
            jVar = this.F;
            if (jVar != null) {
                l10.append(", impersonation=");
                l10.append(jVar);
            }
            l10.append(']');
            return l10.toString();
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
                z10 = false;
            }
            if (!z10) {
            }
            jVar = this.F;
            if (jVar != null) {
            }
            l10.append(']');
            return l10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z10) {
        }
        jVar = this.F;
        if (jVar != null) {
        }
        l10.append(']');
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a;
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(i10);
        long j10 = this.b;
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.c;
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(j11);
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(this.f);
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(this.h);
        j8.a.r(parcel, 8, 8);
        parcel.writeLong(this.d);
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        j8.a.r(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j12 = this.r;
        j8.a.r(parcel, 11, 8);
        parcel.writeLong(j12);
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(this.s);
        j8.a.r(parcel, 13, 4);
        parcel.writeInt(this.w);
        j8.a.m(parcel, 14, this.x);
        j8.a.r(parcel, 15, 4);
        parcel.writeInt(this.y ? 1 : 0);
        j8.a.l(parcel, 16, this.E, i3);
        j8.a.l(parcel, 17, this.F, i3);
        j8.a.t(parcel, s6);
    }
}
