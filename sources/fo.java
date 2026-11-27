// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fo extends c4 {
    public static final Parcelable.Creator<fo> CREATOR = new s5d((byte) 6);
    public final ArrayList a;
    public final boolean b;
    public final String c;
    public final String d;

    public fo(ArrayList arrayList, boolean z, String str, String str2) {
        xve.h(arrayList);
        this.a = arrayList;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public static fo b(List list, boolean z) {
        TreeSet treeSet = new TreeSet(nu6.h);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((yt7) it.next()).a());
        }
        return new fo(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return this.b == foVar.b && vue.a(this.a, foVar.a) && vue.a(this.c, foVar.c) && vue.a(this.d, foVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.p(parcel, 1, this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bye.l(parcel, 3, this.c);
        bye.l(parcel, 4, this.d);
        bye.s(parcel, r);
    }
}
