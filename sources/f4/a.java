package f4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.f0;
import h3.g1;
import h3.t0;
import j3.r0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements z3.b {
    public static final Parcelable.Creator<a> CREATOR = new c.c(22);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public a(String str, byte[] bArr, int i9, int i10) {
        this.a = str;
        this.b = bArr;
        this.c = i9;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.a.equals(aVar.a) && Arrays.equals(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d) {
                return true;
            }
        }
        return false;
    }

    @Override // z3.b
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // z3.b
    public final /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + r0.f(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = f0.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // z3.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
