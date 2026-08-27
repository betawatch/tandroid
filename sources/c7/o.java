package c7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import h7.r8;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o extends z5.a {
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
    public o(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        k kVar;
        long j11;
        int i10 = locationRequest.a;
        long j12 = locationRequest.b;
        long j13 = locationRequest.c;
        long j14 = locationRequest.d;
        long j15 = locationRequest.e;
        int i11 = locationRequest.f;
        float f10 = locationRequest.h;
        boolean z14 = locationRequest.n;
        long j16 = locationRequest.r;
        boolean z15 = z14;
        int i12 = locationRequest.s;
        int i13 = locationRequest.v;
        String str3 = locationRequest.w;
        boolean z16 = locationRequest.x;
        WorkSource workSource = locationRequest.y;
        k kVar2 = locationRequest.A;
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
                    y5.d dVar = (y5.d) obj;
                    f6.f.a(workSource, dVar.a, dVar.b);
                }
                boolean z17 = true;
                i12 = z10 ? 1 : i12;
                i13 = z11 ? 2 : i13;
                if (str == null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        str3 = str;
                    }
                } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
                    str3 = str2;
                }
                z16 = z12 ? true : z16;
                z15 = z13 ? true : z15;
                if (j10 != Long.MAX_VALUE) {
                    if (j10 != -1 && j10 < 0) {
                        z17 = false;
                    }
                    y5.l.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z17);
                    j16 = j10;
                }
                if (j13 != -1) {
                    j13 = j12;
                } else if (i10 != 105) {
                    j13 = Math.min(j13, j12);
                }
                this.a = new LocationRequest(i10, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i11, f10, z15, j16 == -1 ? j12 : j16, i12, i13, str3, z16, new WorkSource(workSource), kVar);
            }
            kVar = kVar2;
            workSource = null;
        }
        j11 = j15;
        boolean z172 = true;
        if (z10) {
        }
        if (z11) {
        }
        if (str == null) {
        }
        if (z12) {
        }
        if (z13) {
        }
        if (j10 != Long.MAX_VALUE) {
        }
        if (j13 != -1) {
        }
        this.a = new LocationRequest(i10, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i11, f10, z15, j16 == -1 ? j12 : j16, i12, i13, str3, z16, new WorkSource(workSource), kVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return y5.l.l(this.a, ((o) obj).a);
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
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.a, i10);
        r8.r(parcel, q6);
    }
}
