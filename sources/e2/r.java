package e2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r implements Comparator, Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new p(0);
    public final q[] a;
    public int b;
    public final String c;
    public final int d;

    public r(String str, ArrayList arrayList) {
        this(str, false, (q[]) arrayList.toArray(new q[0]));
    }

    public final r a(String str) {
        return Objects.equals(this.c, str) ? this : new r(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        UUID uuid = l.b;
        return uuid.equals(qVar.b) ? uuid.equals(qVar2.b) ? 0 : 1 : qVar.b.compareTo(qVar2.b);
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
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (Objects.equals(this.c, rVar.c) && Arrays.equals(this.a, rVar.a)) {
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
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public r(String str, boolean z9, q... qVarArr) {
        this.c = str;
        qVarArr = z9 ? (q[]) qVarArr.clone() : qVarArr;
        this.a = qVarArr;
        this.d = qVarArr.length;
        Arrays.sort(qVarArr, this);
    }

    public r(Parcel parcel) {
        this.c = parcel.readString();
        q[] qVarArr = (q[]) parcel.createTypedArray(q.CREATOR);
        String str = h2.m0.a;
        this.a = qVarArr;
        this.d = qVarArr.length;
    }
}
