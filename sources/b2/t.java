package b2;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class t implements Comparator, Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new r(0);
    public final s[] a;
    public int b;
    public final String c;
    public final int d;

    public t(String str, ArrayList arrayList) {
        this(str, false, (s[]) arrayList.toArray(new s[0]));
    }

    public final t a(String str) {
        return Objects.equals(this.c, str) ? this : new t(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        UUID uuid = n.b;
        return uuid.equals(sVar.b) ? uuid.equals(sVar2.b) ? 0 : 1 : sVar.b.compareTo(sVar2.b);
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
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (Objects.equals(this.c, tVar.c) && Arrays.equals(this.a, tVar.a)) {
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

    public t(String str, boolean z10, s... sVarArr) {
        this.c = str;
        sVarArr = z10 ? (s[]) sVarArr.clone() : sVarArr;
        this.a = sVarArr;
        this.d = sVarArr.length;
        Arrays.sort(sVarArr, this);
    }

    public t(Parcel parcel) {
        this.c = parcel.readString();
        s[] sVarArr = (s[]) parcel.createTypedArray(s.CREATOR);
        String str = e2.m0.a;
        this.a = sVarArr;
        this.d = sVarArr.length;
    }
}
