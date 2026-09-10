package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.e0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String a;
    public final int b;
    public final long c;

    public c(int i10, String str, long j3) {
        this.a = str;
        this.b = i10;
        this.c = j3;
    }

    public final long b() {
        long j3 = this.c;
        return j3 == -1 ? this.b : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        of.b bVar = new of.b(this);
        bVar.E(this.a, "name");
        bVar.E(Long.valueOf(b()), "version");
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.l(parcel, 1, this.a);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        e0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        e0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.a = str;
        this.c = j3;
        this.b = -1;
    }
}
