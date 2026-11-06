package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new v(18);
    public final k a;
    public String b;
    public final JSONObject c;

    public r(k kVar, JSONObject jSONObject) {
        this.a = kVar;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (x6.c.a(this.c, rVar.c)) {
            return q6.m.k(this.a, rVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.l(parcel, 3, this.b);
        xb.s(parcel, r10);
    }
}
