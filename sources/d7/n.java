package d7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new m(1);
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
    public n(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        j jVar;
        long j11;
        int i10 = locationRequest.a;
        long j12 = locationRequest.b;
        long j13 = locationRequest.c;
        long j14 = locationRequest.d;
        long j15 = locationRequest.e;
        int i11 = locationRequest.f;
        float f9 = locationRequest.h;
        boolean z14 = locationRequest.n;
        long j16 = locationRequest.r;
        boolean z15 = z14;
        int i12 = locationRequest.s;
        int i13 = locationRequest.v;
        String str3 = locationRequest.w;
        boolean z16 = locationRequest.x;
        WorkSource workSource = locationRequest.y;
        j jVar2 = locationRequest.A;
        if (arrayList == null) {
            jVar = jVar2;
        } else {
            if (!arrayList.isEmpty()) {
                workSource = new WorkSource();
                jVar = jVar2;
                j11 = j15;
                int i14 = 0;
                for (int size = arrayList.size(); i14 < size; size = size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    z5.d dVar = (z5.d) obj;
                    g6.f.a(workSource, dVar.a, dVar.b);
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
                    z5.l.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z17);
                    j16 = j10;
                }
                if (j13 != -1) {
                    j13 = j12;
                } else if (i10 != 105) {
                    j13 = Math.min(j13, j12);
                }
                this.a = new LocationRequest(i10, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i11, f9, z15, j16 == -1 ? j12 : j16, i12, i13, str3, z16, new WorkSource(workSource), jVar);
            }
            jVar = jVar2;
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
        this.a = new LocationRequest(i10, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i11, f9, z15, j16 == -1 ? j12 : j16, i12, i13, str3, z16, new WorkSource(workSource), jVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return z5.l.l(this.a, ((n) obj).a);
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
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 1, this.a, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
