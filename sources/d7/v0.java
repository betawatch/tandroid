package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v0 extends p6.a {
    public static final Parcelable.Creator<v0> CREATOR = new r0(15);
    public final boolean a;
    public final o7.s0 b;

    public v0(boolean z10, o7.s0 s0Var) {
        this.a = z10;
        this.b = s0Var;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            o7.s0 s0Var = this.b;
            byte[] t10 = s0Var == null ? null : s0Var.t();
            if (t10 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(t10, 32), 11));
                if (t10.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(t10, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && o6.l.l(this.b, v0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return a1.g.p("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        o7.s0 s0Var = this.b;
        df.c(parcel, 2, s0Var == null ? null : s0Var.t());
        df.r(parcel, q5);
    }
}
