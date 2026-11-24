// default package

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mqd extends b4 {
    public static final Parcelable.Creator<mqd> CREATOR = new jid((byte) 28);
    public final LocationRequest a;

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mqd(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, String str, boolean z3, boolean z4, String str2, long j) {
        epd epdVar;
        long j2;
        int i = locationRequest.a;
        long j3 = locationRequest.b;
        long j4 = locationRequest.c;
        long j5 = locationRequest.d;
        long j6 = locationRequest.e;
        int i2 = locationRequest.f;
        float f = locationRequest.h;
        boolean z5 = locationRequest.n;
        long j7 = locationRequest.r;
        boolean z6 = z5;
        int i3 = locationRequest.s;
        int i4 = locationRequest.w;
        String str3 = locationRequest.x;
        boolean z7 = locationRequest.y;
        WorkSource workSource = locationRequest.E;
        epd epdVar2 = locationRequest.F;
        if (arrayList == null) {
            epdVar = epdVar2;
        } else {
            if (!arrayList.isEmpty()) {
                workSource = new WorkSource();
                epdVar = epdVar2;
                j2 = j6;
                int i5 = 0;
                for (int size = arrayList.size(); i5 < size; size = size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    xj2 xj2Var = (xj2) obj;
                    r0d.a(workSource, xj2Var.a, xj2Var.b);
                }
                boolean z8 = true;
                i3 = z ? 1 : i3;
                i4 = z2 ? 2 : i4;
                if (str == null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        str3 = str;
                    }
                } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
                    str3 = str2;
                }
                z7 = z3 ? true : z7;
                z6 = z4 ? true : z6;
                if (j != Long.MAX_VALUE) {
                    if (j != -1 && j < 0) {
                        z8 = false;
                    }
                    ite.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z8);
                    j7 = j;
                }
                if (j4 != -1) {
                    j4 = j3;
                } else if (i != 105) {
                    j4 = Math.min(j4, j3);
                }
                this.a = new LocationRequest(i, j3, j4, Math.max(j5, j3), Long.MAX_VALUE, j2, i2, f, z6, j7 == -1 ? j3 : j7, i3, i4, str3, z7, new WorkSource(workSource), epdVar);
            }
            epdVar = epdVar2;
            workSource = null;
        }
        j2 = j6;
        boolean z82 = true;
        if (z) {
        }
        if (z2) {
        }
        if (str == null) {
        }
        if (z3) {
        }
        if (z4) {
        }
        if (j != Long.MAX_VALUE) {
        }
        if (j4 != -1) {
        }
        this.a = new LocationRequest(i, j3, j4, Math.max(j5, j3), Long.MAX_VALUE, j2, i2, f, z6, j7 == -1 ? j3 : j7, i3, i4, str3, z7, new WorkSource(workSource), epdVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mqd) {
            return fse.a(this.a, ((mqd) obj).a);
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
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 1, this.a, i);
        mve.s(parcel, r);
    }
}
