package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import b7.l;
import b7.r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.c;
import e6.f;
import g7.p8;
import java.lang.reflect.Method;
import java.util.Arrays;
import q7.j;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new j(4);
    public final l A;
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

    public LocationRequest(int i9, long j10, long j11, long j12, long j13, long j14, int i10, float f10, boolean z10, long j15, int i11, int i12, String str, boolean z11, WorkSource workSource, l lVar) {
        this.a = i9;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f = i10;
        this.h = f10;
        this.n = z10;
        this.r = j15 != -1 ? j15 : j10;
        this.s = i11;
        this.v = i12;
        this.w = str;
        this.x = z11;
        this.y = workSource;
        this.A = lVar;
    }

    public static String c(long j10) {
        String sb2;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = r.a;
        synchronized (sb3) {
            sb3.setLength(0);
            r.a(sb3, j10);
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
        int i9 = this.a;
        if (i9 != locationRequest.a) {
            return false;
        }
        if ((i9 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b()) {
            return (!b() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.v == locationRequest.v && this.x == locationRequest.x && this.y.equals(locationRequest.y) && x5.l.l(this.w, locationRequest.w) && x5.l.l(this.A, locationRequest.A);
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
        l lVar;
        int intValue;
        String str;
        String str2;
        StringBuilder n10 = c.n("Request[");
        int i9 = this.a;
        if (i9 == 105) {
            n10.append(q7.l.a(i9));
        } else {
            n10.append("@");
            if (b()) {
                r.a(n10, this.b);
                n10.append("/");
                r.a(n10, this.d);
            } else {
                r.a(n10, this.b);
            }
            n10.append(" ");
            n10.append(q7.l.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            n10.append(", minUpdateInterval=");
            n10.append(c(this.c));
        }
        float f10 = this.h;
        if (f10 > 0.0d) {
            n10.append(", minUpdateDistance=");
            n10.append(f10);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            n10.append(", maxUpdateAge=");
            n10.append(c(this.r));
        }
        long j10 = this.e;
        if (j10 != Long.MAX_VALUE) {
            n10.append(", duration=");
            r.a(n10, j10);
        }
        int i10 = this.f;
        if (i10 != Integer.MAX_VALUE) {
            n10.append(", maxUpdates=");
            n10.append(i10);
        }
        boolean z10 = true;
        int i11 = this.v;
        if (i11 != 0) {
            n10.append(", ");
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
            n10.append(str2);
        }
        int i12 = this.s;
        if (i12 != 0) {
            n10.append(", ");
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
                x5.l.h(invoke);
                z10 = ((Boolean) invoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
            if (!z10) {
                n10.append(", ");
                n10.append(workSource);
            }
            lVar = this.A;
            if (lVar != null) {
                n10.append(", impersonation=");
                n10.append(lVar);
            }
            n10.append(']');
            return n10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                x5.l.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
            if (intValue != 0) {
                z10 = false;
            }
            if (!z10) {
            }
            lVar = this.A;
            if (lVar != null) {
            }
            n10.append(']');
            return n10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z10) {
        }
        lVar = this.A;
        if (lVar != null) {
        }
        n10.append(']');
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        int i10 = this.a;
        p8.s(parcel, 1, 4);
        parcel.writeInt(i10);
        long j10 = this.b;
        p8.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.c;
        p8.s(parcel, 3, 8);
        parcel.writeLong(j11);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        p8.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        p8.s(parcel, 8, 8);
        parcel.writeLong(this.d);
        p8.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        p8.s(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j12 = this.r;
        p8.s(parcel, 11, 8);
        parcel.writeLong(j12);
        p8.s(parcel, 12, 4);
        parcel.writeInt(this.s);
        p8.s(parcel, 13, 4);
        parcel.writeInt(this.v);
        p8.l(parcel, 14, this.w);
        p8.s(parcel, 15, 4);
        parcel.writeInt(this.x ? 1 : 0);
        p8.k(parcel, 16, this.y, i9);
        p8.k(parcel, 17, this.A, i9);
        p8.r(parcel, q10);
    }
}
