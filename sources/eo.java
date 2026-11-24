// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eo extends b4 {
    public static final Parcelable.Creator<eo> CREATOR = new b1d((byte) 6);
    public final ArrayList a;
    public final boolean b;
    public final String c;
    public final String d;

    public eo(ArrayList arrayList, boolean z, String str, String str2) {
        fre.h(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static eo b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(is6.h);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((tq7) it.next()).a());
        }
        return new eo(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof eo)) {
            return false;
        }
        eo eoVar = (eo) obj;
        return this.b == eoVar.b && cqe.a(this.a, eoVar.a) && cqe.a(this.c, eoVar.c) && cqe.a(this.d, eoVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.l(parcel, 3, this.c);
        jte.l(parcel, 4, this.d);
        jte.s(parcel, r);
    }
}
