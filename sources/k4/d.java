package k4;

import android.os.Parcel;
import android.os.Parcelable;
import j3.d1;
import j3.n0;
import j8.t;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d implements e4.b {
    public static final Parcelable.Creator<d> CREATOR = new t(13);
    public final ArrayList a;

    public d(ArrayList arrayList) {
        this.a = arrayList;
        boolean z4 = false;
        if (!arrayList.isEmpty()) {
            long j10 = ((c) arrayList.get(0)).b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((c) arrayList.get(i10)).a < j10) {
                    z4 = true;
                    break;
                } else {
                    j10 = ((c) arrayList.get(i10)).b;
                    i10++;
                }
            }
        }
        h5.a.f(!z4);
    }

    @Override // e4.b
    public final /* synthetic */ n0 b() {
        return null;
    }

    @Override // e4.b
    public final /* synthetic */ byte[] d() {
        return null;
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

    @Override // e4.b
    public final /* synthetic */ void c(d1 d1Var) {
    }
}
