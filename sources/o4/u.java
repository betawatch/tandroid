package o4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h3.g1;
import h3.t0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u implements z3.b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);
    public final String a;
    public final String b;
    public final List c;

    public u(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.a, uVar.a) && TextUtils.equals(this.b, uVar.b) && this.c.equals(uVar.c)) {
                return true;
            }
        }
        return false;
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
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb2.append(str != null ? aa.d.r(aa.d.t(" [", str, ", "), this.b, "]") : "");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        List list = this.c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }

    public u(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.c = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // z3.b
    public final /* synthetic */ void populateMediaMetadata(g1 g1Var) {
    }
}
