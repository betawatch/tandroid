package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import b6.m;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.c;
import f7.k;
import f7.q;
import i6.f;
import j7.f5;
import java.lang.reflect.Method;
import java.util.Arrays;
import u6.p;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new p(8);
    public final k B;
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

    public LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z4, long j15, int i12, int i13, String str, boolean z10, WorkSource workSource, k kVar) {
        this.a = i10;
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1L, j13 - SystemClock.elapsedRealtime()), j14);
        this.f = i11;
        this.h = f10;
        this.n = z4;
        this.r = j15 != -1 ? j15 : j10;
        this.s = i12;
        this.v = i13;
        this.w = str;
        this.x = z10;
        this.y = workSource;
        this.B = kVar;
    }

    public static String f(long j10) {
        String sb;
        if (j10 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb2 = q.a;
        synchronized (sb2) {
            sb2.setLength(0);
            q.a(sb2, j10);
            sb = sb2.toString();
        }
        return sb;
    }

    public final boolean e() {
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
        if ((i10 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && e() == locationRequest.e()) {
            return (!e() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.h == locationRequest.h && this.n == locationRequest.n && this.s == locationRequest.s && this.v == locationRequest.v && this.x == locationRequest.x && this.y.equals(locationRequest.y) && m.l(this.w, locationRequest.w) && m.l(this.B, locationRequest.B);
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
        StringBuilder l10 = c.l("Request[");
        int i10 = this.a;
        if (i10 == 105) {
            l10.append(u7.k.a(i10));
        } else {
            l10.append("@");
            if (e()) {
                q.a(l10, this.b);
                l10.append("/");
                q.a(l10, this.d);
            } else {
                q.a(l10, this.b);
            }
            l10.append(" ");
            l10.append(u7.k.a(this.a));
        }
        if (this.a == 105 || this.c != this.b) {
            l10.append(", minUpdateInterval=");
            l10.append(f(this.c));
        }
        float f10 = this.h;
        if (f10 > 0.0d) {
            l10.append(", minUpdateDistance=");
            l10.append(f10);
        }
        if (this.a != 105 ? this.r != this.b : this.r != Long.MAX_VALUE) {
            l10.append(", maxUpdateAge=");
            l10.append(f(this.r));
        }
        long j10 = this.e;
        if (j10 != Long.MAX_VALUE) {
            l10.append(", duration=");
            q.a(l10, j10);
        }
        int i11 = this.f;
        if (i11 != Integer.MAX_VALUE) {
            l10.append(", maxUpdates=");
            l10.append(i11);
        }
        boolean z4 = true;
        int i12 = this.v;
        if (i12 != 0) {
            l10.append(", ");
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
            l10.append(str2);
        }
        int i13 = this.s;
        if (i13 != 0) {
            l10.append(", ");
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
            l10.append(str);
        }
        if (this.n) {
            l10.append(", waitForAccurateLocation");
        }
        if (this.x) {
            l10.append(", bypass");
        }
        String str3 = this.w;
        if (str3 != null) {
            l10.append(", moduleId=");
            l10.append(str3);
        }
        Method method = f.d;
        WorkSource workSource = this.y;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                m.h(invoke);
                z4 = ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
            if (!z4) {
                l10.append(", ");
                l10.append(workSource);
            }
            kVar = this.B;
            if (kVar != null) {
                l10.append(", impersonation=");
                l10.append(kVar);
            }
            l10.append(']');
            return l10.toString();
        }
        Method method2 = f.c;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                m.h(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e6) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e6);
            }
            if (intValue != 0) {
                z4 = false;
            }
            if (!z4) {
            }
            kVar = this.B;
            if (kVar != null) {
            }
            l10.append(']');
            return l10.toString();
        }
        intValue = 0;
        if (intValue != 0) {
        }
        if (!z4) {
        }
        kVar = this.B;
        if (kVar != null) {
        }
        l10.append(']');
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a;
        f5.s(parcel, 1, 4);
        parcel.writeInt(i11);
        long j10 = this.b;
        f5.s(parcel, 2, 8);
        parcel.writeLong(j10);
        long j11 = this.c;
        f5.s(parcel, 3, 8);
        parcel.writeLong(j11);
        f5.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        f5.s(parcel, 7, 4);
        parcel.writeFloat(this.h);
        f5.s(parcel, 8, 8);
        parcel.writeLong(this.d);
        f5.s(parcel, 9, 4);
        parcel.writeInt(this.n ? 1 : 0);
        f5.s(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j12 = this.r;
        f5.s(parcel, 11, 8);
        parcel.writeLong(j12);
        f5.s(parcel, 12, 4);
        parcel.writeInt(this.s);
        f5.s(parcel, 13, 4);
        parcel.writeInt(this.v);
        f5.l(parcel, 14, this.w);
        f5.s(parcel, 15, 4);
        parcel.writeInt(this.x ? 1 : 0);
        f5.k(parcel, 16, this.y, i10);
        f5.k(parcel, 17, this.B, i10);
        f5.r(parcel, q10);
    }
}
