package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s extends z5.a {
    public static final Parcelable.Creator<s> CREATOR = new w(18);
    public final k a;
    public String b;
    public final JSONObject c;

    public s(k kVar, JSONObject jSONObject) {
        this.a = kVar;
        this.c = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (f6.c.a(this.c, sVar.c)) {
            return y5.l.l(this.a, sVar.a);
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
        int q6 = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.a, i10);
        r8.l(parcel, 3, this.b);
        r8.r(parcel, q6);
    }
}
