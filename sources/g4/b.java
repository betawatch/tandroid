package g4;

import h3.g1;
import h3.t0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b implements z3.b {
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
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }

    @Override // z3.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
