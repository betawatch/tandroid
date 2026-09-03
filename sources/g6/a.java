package g6;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import com.google.android.gms.common.api.n;
import j7.g5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new c();
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public a(ArrayList arrayList, boolean z4, String str, String str2) {
        m.h(arrayList);
        this.a = arrayList;
        this.b = z4;
        this.c = str;
        this.d = str2;
    }

    public static a e(List list, boolean z4) {
        TreeSet treeSet = new TreeSet(b.a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((n) it.next()).c());
        }
        return new a(new ArrayList(treeSet), z4, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && m.l(this.a, aVar.a) && m.l(this.c, aVar.c) && m.l(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.p(parcel, 1, this.a);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.l(parcel, 3, this.c);
        g5.l(parcel, 4, this.d);
        g5.r(parcel, q10);
    }
}
