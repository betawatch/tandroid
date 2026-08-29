package c4;

import a4.w;
import android.os.Parcel;
import android.os.Parcelable;
import j3.g1;
import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements b4.b {
    public static final Parcelable.Creator<a> CREATOR = new w.a(25);
    public final int a;
    public final String b;

    public a(int i10, String str) {
        this.a = i10;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // b4.b
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // b4.b
    public final /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.a);
        sb2.append(",url=");
        return w.q(sb2, this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }

    @Override // b4.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
