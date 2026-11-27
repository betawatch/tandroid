// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n4f extends c4 {
    public static final Parcelable.Creator<n4f> CREATOR = new t4f((byte) 6);
    public final int a;
    public final Bundle b;

    public n4f(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4f)) {
            return false;
        }
        n4f n4fVar = (n4f) obj;
        Bundle bundle = n4fVar.b;
        if (this.a != n4fVar.a) {
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
            if (!bundle.containsKey(str) || !vue.a(bundle2.getString(str), bundle.getString(str))) {
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
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.b(parcel, 2, this.b);
        bye.s(parcel, r);
    }
}
