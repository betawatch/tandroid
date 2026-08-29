package n3;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Comparator, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new i4.g(26);
    public final b[] a;
    public int b;
    public final String c;
    public final int d;

    public c(String str, ArrayList arrayList) {
        this(str, false, (b[]) arrayList.toArray(new b[0]));
    }

    public final c a(String str) {
        return d0.a(this.c, str) ? this : new c(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        UUID uuid = j3.h.a;
        return uuid.equals(bVar.b) ? uuid.equals(bVar2.b) ? 0 : 1 : bVar.b.compareTo(bVar2.b);
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
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (d0.a(this.c, cVar.c) && Arrays.equals(this.a, cVar.a)) {
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

    public c(String str, boolean z10, b... bVarArr) {
        this.c = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public c(Parcel parcel) {
        this.c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i10 = d0.a;
        this.a = bVarArr;
        this.d = bVarArr.length;
    }
}
