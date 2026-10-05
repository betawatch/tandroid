package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONObject;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class r extends o6.a {
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
        if (u6.c.a(this.c, rVar.c)) {
            return n6.l.l(this.a, rVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, String.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.c;
        this.b = jSONObject == null ? null : jSONObject.toString();
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.a, i10);
        g0.l(parcel, 3, this.b);
        g0.r(parcel, q6);
    }
}
