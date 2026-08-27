package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v0 extends z5.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(25);
    public final boolean a;
    public final y6.s0 b;

    public v0(boolean z10, y6.s0 s0Var) {
        this.a = z10;
        this.b = s0Var;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            y6.s0 s0Var = this.b;
            byte[] u10 = s0Var == null ? null : s0Var.u();
            if (u10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(u10, 32), 11));
                if (u10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(u10, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e9) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && y5.l.l(this.b, v0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return a9.p.m("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        y6.s0 s0Var = this.b;
        r8.c(parcel, 2, s0Var == null ? null : s0Var.u());
        r8.r(parcel, q6);
    }
}
