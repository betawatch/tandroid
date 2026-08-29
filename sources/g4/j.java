package g4;

import j3.g1;
import j3.t0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class j implements b4.b {
    public final String a;

    public j(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
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

    public String toString() {
        return this.a;
    }

    @Override // b4.b
    public /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
