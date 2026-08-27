package l3;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new h5.h(20);
    public final c[] a;
    public int b;
    public final String c;
    public final int d;

    public d(String str, ArrayList arrayList) {
        this(str, false, (c[]) arrayList.toArray(new c[0]));
    }

    public final d a(String str) {
        return g0.a(this.c, str) ? this : new d(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = h3.h.a;
        return uuid.equals(cVar.b) ? uuid.equals(cVar2.b) ? 0 : 1 : cVar.b.compareTo(cVar2.b);
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
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (g0.a(this.c, dVar.c) && Arrays.equals(this.a, dVar.a)) {
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

    public d(String str, boolean z10, c... cVarArr) {
        this.c = str;
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        this.a = cVarArr;
        this.d = cVarArr.length;
        Arrays.sort(cVarArr, this);
    }

    public d(Parcel parcel) {
        this.c = parcel.readString();
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        int i10 = g0.a;
        this.a = cVarArr;
        this.d = cVarArr.length;
    }
}
