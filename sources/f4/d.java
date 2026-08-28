package f4;

import android.os.Parcel;
import android.os.Parcelable;
import h3.g1;
import h3.t0;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements z3.b {
    public static final Parcelable.Creator<d> CREATOR = new c.c(24);
    public final ArrayList a;

    public d(ArrayList arrayList) {
        this.a = arrayList;
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).b;
            int i9 = 1;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                if (((c) arrayList.get(i9)).a < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((c) arrayList.get(i9)).b;
                    i9++;
                }
            }
        }
        d5.a.f(!z10);
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

    @Override // z3.b
    public final /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // z3.b
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
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeList(this.a);
    }

    @Override // z3.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
