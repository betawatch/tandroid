// default package

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mee extends b4 {
    public static final Parcelable.Creator<mee> CREATOR = new sje((byte) 4);
    public final boolean a;
    public final rce b;

    public mee(boolean z, rce rceVar) {
        this.a = z;
        this.b = rceVar;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            rce rceVar = this.b;
            byte[] p = rceVar == null ? null : rceVar.p();
            if (p != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(p, 32), 11));
                if (p.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(p, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            rjb.k("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mee)) {
            return false;
        }
        mee meeVar = (mee) obj;
        return this.a == meeVar.a && fse.a(this.b, meeVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return kt6.o("AuthenticationExtensionsPrfOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        rce rceVar = this.b;
        mve.c(parcel, 2, rceVar == null ? null : rceVar.p());
        mve.s(parcel, r);
    }
}
