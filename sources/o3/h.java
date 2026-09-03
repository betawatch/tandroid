package o3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h implements Comparator, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new l4.j(14);
    public final g[] a;
    public int b;
    public final String c;
    public final int d;

    public h(String str, ArrayList arrayList) {
        this(str, false, (g[]) arrayList.toArray(new g[0]));
    }

    public final h a(String str) {
        return h5.d0.a(this.c, str) ? this : new h(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        UUID uuid = j3.h.a;
        return uuid.equals(gVar.b) ? uuid.equals(gVar2.b) ? 0 : 1 : gVar.b.compareTo(gVar2.b);
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
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (h5.d0.a(this.c, hVar.c) && Arrays.equals(this.a, hVar.a)) {
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

    public h(String str, boolean z4, g... gVarArr) {
        this.c = str;
        gVarArr = z4 ? (g[]) gVarArr.clone() : gVarArr;
        this.a = gVarArr;
        this.d = gVarArr.length;
        Arrays.sort(gVarArr, this);
    }

    public h(Parcel parcel) {
        this.c = parcel.readString();
        g[] gVarArr = (g[]) parcel.createTypedArray(g.CREATOR);
        int i10 = h5.d0.a;
        this.a = gVarArr;
        this.d = gVarArr.length;
    }
}
