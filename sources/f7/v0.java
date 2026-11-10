package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import c8.xb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v0 extends r6.a {
    public static final Parcelable.Creator<v0> CREATOR = new t0(3);
    public final boolean a;
    public final q7.s0 b;

    public v0(boolean z9, q7.s0 s0Var) {
        this.a = z9;
        this.b = s0Var;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            q7.s0 s0Var = this.b;
            byte[] p10 = s0Var == null ? null : s0Var.p();
            if (p10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(p10, 32), 11));
                if (p10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(p10, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && q6.m.k(this.b, v0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return a8.p0.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        q7.s0 s0Var = this.b;
        xb.c(parcel, 2, s0Var == null ? null : s0Var.p());
        xb.s(parcel, r10);
    }
}
