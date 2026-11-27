// default package

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hr3 implements Comparator, Parcelable {
    public static final Parcelable.Creator<hr3> CREATOR = new g31(15);
    public final gr3[] a;
    public int b;
    public final String c;
    public final int d;

    public hr3(Parcel parcel) {
        this.c = parcel.readString();
        gr3[] gr3VarArr = (gr3[]) parcel.createTypedArray(gr3.CREATOR);
        String str = gcc.a;
        this.a = gr3VarArr;
        this.d = gr3VarArr.length;
    }

    public final hr3 a(String str) {
        return Objects.equals(this.c, str) ? this : new hr3(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        gr3 gr3Var = (gr3) obj;
        gr3 gr3Var2 = (gr3) obj2;
        UUID uuid = o51.b;
        return uuid.equals(gr3Var.b) ? uuid.equals(gr3Var2.b) ? 0 : 1 : gr3Var.b.compareTo(gr3Var2.b);
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
        if (obj != null && hr3.class == obj.getClass()) {
            hr3 hr3Var = (hr3) obj;
            if (Objects.equals(this.c, hr3Var.c) && Arrays.equals(this.a, hr3Var.a)) {
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

    public hr3(String str, boolean z, gr3... gr3VarArr) {
        this.c = str;
        gr3VarArr = z ? (gr3[]) gr3VarArr.clone() : gr3VarArr;
        this.a = gr3VarArr;
        this.d = gr3VarArr.length;
        Arrays.sort(gr3VarArr, this);
    }

    public hr3(String str, ArrayList arrayList) {
        this(str, false, (gr3[]) arrayList.toArray(new gr3[0]));
    }
}
