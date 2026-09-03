package f7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import j7.g5;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o extends c6.a {
    public static final Parcelable.Creator<o> CREATOR = new n(1);
    public final LocationRequest a;

    /* JADX WARN: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(LocationRequest locationRequest, ArrayList arrayList, boolean z4, boolean z10, String str, boolean z11, boolean z12, String str2, long j10) {
        k kVar;
        long j11;
        int i10 = locationRequest.a;
        long j12 = locationRequest.b;
        long j13 = locationRequest.c;
        long j14 = locationRequest.d;
        long j15 = locationRequest.e;
        int i11 = locationRequest.f;
        float f10 = locationRequest.h;
        boolean z13 = locationRequest.n;
        long j16 = locationRequest.r;
        boolean z14 = z13;
        int i12 = locationRequest.s;
        int i13 = locationRequest.v;
        String str3 = locationRequest.w;
        boolean z15 = locationRequest.x;
        WorkSource workSource = locationRequest.y;
        k kVar2 = locationRequest.B;
        if (arrayList == null) {
            kVar = kVar2;
        } else {
            if (!arrayList.isEmpty()) {
                workSource = new WorkSource();
                kVar = kVar2;
                j11 = j15;
                int i14 = 0;
                for (int size = arrayList.size(); i14 < size; size = size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    b6.d dVar = (b6.d) obj;
                    i6.f.a(workSource, dVar.a, dVar.b);
                }
                boolean z16 = true;
                i12 = z4 ? 1 : i12;
                i13 = z10 ? 2 : i13;
                if (str == null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        str3 = str;
                    }
                } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
                    str3 = str2;
                }
                z15 = z11 ? true : z15;
                z14 = z12 ? true : z14;
                if (j10 != Long.MAX_VALUE) {
                    if (j10 != -1 && j10 < 0) {
                        z16 = false;
                    }
                    b6.m.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z16);
                    j16 = j10;
                }
                if (j13 != -1) {
                    j13 = j12;
                } else if (i10 != 105) {
                    j13 = Math.min(j13, j12);
                }
                this.a = new LocationRequest(i10, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i11, f10, z14, j16 == -1 ? j12 : j16, i12, i13, str3, z15, new WorkSource(workSource), kVar);
            }
            kVar = kVar2;
            workSource = null;
        }
        j11 = j15;
        boolean z162 = true;
        if (z4) {
        }
        if (z10) {
        }
        if (str == null) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        if (j13 != -1) {
        }
        this.a = new LocationRequest(i10, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i11, f10, z14, j16 == -1 ? j12 : j16, i12, i13, str3, z15, new WorkSource(workSource), kVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return b6.m.l(this.a, ((o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.r(parcel, q10);
    }
}
