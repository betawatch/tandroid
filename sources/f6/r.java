package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.a, i7);
        yb.l(parcel, 3, this.b);
        yb.s(parcel, r10);
    }
}
