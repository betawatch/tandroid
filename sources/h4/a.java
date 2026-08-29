package h4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j3.g1;
import j3.t0;
import j7.l1;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements b4.b {
    public static final Parcelable.Creator<a> CREATOR = new g8.b(4);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public a(String str, byte[] bArr, int i10, int i11) {
        this.a = str;
        this.b = bArr;
        this.c = i10;
        this.d = i11;
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

    @Override // b4.b
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // b4.b
    public final /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + l1.f(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "mdta: key=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = d0.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // b4.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
