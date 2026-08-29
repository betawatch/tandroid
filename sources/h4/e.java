package h4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.g1;
import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e implements b4.b {
    public static final Parcelable.Creator<e> CREATOR = new g8.b(8);
    public final float a;
    public final int b;

    public e(float f9, int i10) {
        this.a = f9;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b) {
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
        return ((Float.valueOf(this.a).hashCode() + 527) * 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    public e(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    @Override // b4.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
