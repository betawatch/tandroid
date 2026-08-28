package d4;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;
import j3.r0;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements z3.b {
    public static final Parcelable.Creator<c> CREATOR = new c.c(5);
    public final byte[] a;
    public final String b;
    public final String c;

    public c(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((c) obj).a);
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
        return Arrays.hashCode(this.a);
    }

    @Override // z3.b
    public final void populateMediaMetadata(g1 g1Var) {
        String str = this.b;
        if (str != null) {
            g1Var.a = str;
        }
    }

    public final String toString() {
        return d.l(this.a.length, "\"", r0.q("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.a = createByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
