package h4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.g1;
import j3.t0;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements b4.b {
    public static final Parcelable.Creator<d> CREATOR = new g8.b(6);
    public final ArrayList a;

    public d(ArrayList arrayList) {
        this.a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((c) arrayList.get(i10)).a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((c) arrayList.get(i10)).b;
                    i10++;
                }
            }
        }
        f5.a.f(!z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
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
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.a);
    }

    @Override // b4.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
