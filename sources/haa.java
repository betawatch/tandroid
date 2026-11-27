// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class haa extends c4 {
    public static final Parcelable.Creator<haa> CREATOR = new hud((byte) 4);
    public final kt6 a;
    public String b;
    public final JSONObject c;

    public haa(kt6 kt6Var, JSONObject jSONObject) {
        this.a = kt6Var;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haa)) {
            return false;
        }
        haa haaVar = (haa) obj;
        if (ax5.a(this.c, haaVar.c)) {
            return vue.a(this.a, haaVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.l(parcel, 3, this.b);
        bye.s(parcel, r);
    }
}
