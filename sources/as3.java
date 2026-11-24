// default package

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class as3 implements Comparator, Parcelable {
    public static final Parcelable.Creator<as3> CREATOR = new f41(15);
    public final zr3[] a;
    public int b;
    public final String c;
    public final int d;

    public as3(Parcel parcel) {
        this.c = parcel.readString();
        zr3[] zr3VarArr = (zr3[]) parcel.createTypedArray(zr3.CREATOR);
        String str = hac.a;
        this.a = zr3VarArr;
        this.d = zr3VarArr.length;
    }

    public final as3 a(String str) {
        return Objects.equals(this.c, str) ? this : new as3(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zr3 zr3Var = (zr3) obj;
        zr3 zr3Var2 = (zr3) obj2;
        UUID uuid = n61.b;
        return uuid.equals(zr3Var.b) ? uuid.equals(zr3Var2.b) ? 0 : 1 : zr3Var.b.compareTo(zr3Var2.b);
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
        if (obj != null && as3.class == obj.getClass()) {
            as3 as3Var = (as3) obj;
            if (Objects.equals(this.c, as3Var.c) && Arrays.equals(this.a, as3Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        String str = this.c;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public as3(String str, boolean z, zr3... zr3VarArr) {
        this.c = str;
        zr3VarArr = z ? (zr3[]) zr3VarArr.clone() : zr3VarArr;
        this.a = zr3VarArr;
        this.d = zr3VarArr.length;
        Arrays.sort(zr3VarArr, this);
    }

    public as3(String str, ArrayList arrayList) {
        this(str, false, (zr3[]) arrayList.toArray(new zr3[0]));
    }
}
