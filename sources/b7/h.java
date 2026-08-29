package b7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(19);
    public final int a;
    public final Bundle b;

    public h(int i10, Bundle bundle) {
        this.a = i10;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        Bundle bundle = hVar.b;
        if (this.a != hVar.a) {
            return false;
        }
        Bundle bundle2 = this.b;
        if (bundle2 == null) {
            return bundle == null;
        }
        if (bundle == null || bundle2.size() != bundle.size()) {
            return false;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str) || !z5.l.l(bundle2.getString(str), bundle.getString(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.a));
        Bundle bundle = this.b;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = bundle.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Arrays.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        o.b(parcel, 2, this.b);
        o.r(parcel, q6);
    }
}
