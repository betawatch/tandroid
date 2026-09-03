package o3;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g implements Comparator, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new l4.j(14);
    public final f[] a;
    public int b;
    public final String c;
    public final int d;

    public g(String str, ArrayList arrayList) {
        this(str, false, (f[]) arrayList.toArray(new f[0]));
    }

    public final g a(String str) {
        return d0.a(this.c, str) ? this : new g(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        f fVar = (f) obj;
        f fVar2 = (f) obj2;
        UUID uuid = j3.h.a;
        return uuid.equals(fVar.b) ? uuid.equals(fVar2.b) ? 0 : 1 : fVar.b.compareTo(fVar2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (d0.a(this.c, gVar.c) && Arrays.equals(this.a, gVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public g(String str, boolean z4, f... fVarArr) {
        this.c = str;
        fVarArr = z4 ? (f[]) fVarArr.clone() : fVarArr;
        this.a = fVarArr;
        this.d = fVarArr.length;
        Arrays.sort(fVarArr, this);
    }

    public g(Parcel parcel) {
        this.c = parcel.readString();
        f[] fVarArr = (f[]) parcel.createTypedArray(f.CREATOR);
        int i10 = d0.a;
        this.a = fVarArr;
        this.d = fVarArr.length;
    }
}
