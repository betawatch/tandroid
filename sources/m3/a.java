package m3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import k7.z7;
import l4.j;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements e4.b {
    public static final Parcelable.Creator<a> CREATOR = new j(10);
    public final long a;

    public a(long j10) {
        this.a = j10;
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.a == ((a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return z7.a(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j10 = this.a;
        sb.append(j10 == -2082844800000L ? "unset" : Long.valueOf(j10));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.a);
    }

    public a(Parcel parcel) {
        this.a = parcel.readLong();
    }

    @Override // e4.b
    public final /* synthetic */ void c(d1 d1Var) {
    }
}
