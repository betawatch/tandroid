package b7;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import g7.p8;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p extends y5.a {
    public static final Parcelable.Creator<p> CREATOR = new o(1);
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
    public p(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        l lVar;
        long j11;
        int i9 = locationRequest.a;
        long j12 = locationRequest.b;
        long j13 = locationRequest.c;
        long j14 = locationRequest.d;
        long j15 = locationRequest.e;
        int i10 = locationRequest.f;
        float f10 = locationRequest.h;
        boolean z14 = locationRequest.n;
        long j16 = locationRequest.r;
        boolean z15 = z14;
        int i11 = locationRequest.s;
        int i12 = locationRequest.v;
        String str3 = locationRequest.w;
        boolean z16 = locationRequest.x;
        WorkSource workSource = locationRequest.y;
        l lVar2 = locationRequest.A;
        if (arrayList == null) {
            lVar = lVar2;
        } else {
            if (!arrayList.isEmpty()) {
                workSource = new WorkSource();
                lVar = lVar2;
                j11 = j15;
                int i13 = 0;
                for (int size = arrayList.size(); i13 < size; size = size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    x5.d dVar = (x5.d) obj;
                    e6.f.a(workSource, dVar.a, dVar.b);
                }
                boolean z17 = true;
                i11 = z10 ? 1 : i11;
                i12 = z11 ? 2 : i12;
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
                    x5.l.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z17);
                    j16 = j10;
                }
                if (j13 != -1) {
                    j13 = j12;
                } else if (i9 != 105) {
                    j13 = Math.min(j13, j12);
                }
                this.a = new LocationRequest(i9, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i10, f10, z15, j16 == -1 ? j12 : j16, i11, i12, str3, z16, new WorkSource(workSource), lVar);
            }
            lVar = lVar2;
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
        this.a = new LocationRequest(i9, j12, j13, Math.max(j14, j12), Long.MAX_VALUE, j11, i10, f10, z15, j16 == -1 ? j12 : j16, i11, i12, str3, z16, new WorkSource(workSource), lVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return x5.l.l(this.a, ((p) obj).a);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.r(parcel, q10);
    }
}
