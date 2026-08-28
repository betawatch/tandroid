package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends y5.a {
    public static final Parcelable.Creator<g> CREATOR = new r0(10);
    public final k0 a;
    public final u0 b;
    public final h c;
    public final v0 d;
    public final String e;

    public g(k0 k0Var, u0 u0Var, h hVar, v0 v0Var, String str) {
        this.a = k0Var;
        this.b = u0Var;
        this.c = hVar;
        this.d = v0Var;
        this.e = str;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            h hVar = this.c;
            if (hVar != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", hVar.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e10) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e10);
                }
            }
            k0 k0Var = this.a;
            if (k0Var != null) {
                jSONObject.put("uvm", k0Var.b());
            }
            v0 v0Var = this.d;
            if (v0Var != null) {
                jSONObject.put("prf", v0Var.b());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return x5.l.l(this.a, gVar.a) && x5.l.l(this.b, gVar.b) && x5.l.l(this.c, gVar.c) && x5.l.l(this.d, gVar.d) && x5.l.l(this.e, gVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return aa.d.o("AuthenticationExtensionsClientOutputs{", b().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.k(parcel, 2, this.b, i9);
        p8.k(parcel, 3, this.c, i9);
        p8.k(parcel, 4, this.d, i9);
        p8.l(parcel, 5, this.e);
        p8.r(parcel, q10);
    }
}
