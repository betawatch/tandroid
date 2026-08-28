package a4;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a implements z3.b {
    public static final Parcelable.Creator<a> CREATOR = new w.a(1);
    public final int a;
    public final String b;

    public a(int i9, String str) {
        this.a = i9;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // z3.b
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // z3.b
    public final /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.a);
        sb2.append(",url=");
        return d.r(sb2, this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }

    @Override // z3.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
