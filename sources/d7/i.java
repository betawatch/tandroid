package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(16);
    public final o7.s0 a;
    public final o7.s0 b;
    public final o7.s0 c;
    public final o7.s0 d;
    public final o7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        o6.l.h(bArr);
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(bArr2);
        o7.s0 s11 = o7.s0.s(bArr2.length, bArr2);
        o6.l.h(bArr3);
        o7.s0 s12 = o7.s0.s(bArr3.length, bArr3);
        o6.l.h(bArr4);
        o7.s0 s13 = o7.s0.s(bArr4.length, bArr4);
        o7.s0 s14 = bArr5 == null ? null : o7.s0.s(bArr5.length, bArr5);
        this.a = s10;
        this.b = s11;
        this.c = s12;
        this.d = s13;
        this.e = s14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", v6.b.c(this.b.t()));
            jSONObject.put("authenticatorData", v6.b.c(this.c.t()));
            jSONObject.put("signature", v6.b.c(this.d.t()));
            o7.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", v6.b.c(s0Var == null ? null : s0Var.t()));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return o6.l.l(this.a, iVar.a) && o6.l.l(this.b, iVar.b) && o6.l.l(this.c, iVar.c) && o6.l.l(this.d, iVar.d) && o6.l.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        k6.c cVar = new k6.c(getClass().getSimpleName());
        o7.k0 k0Var = o7.m0.d;
        byte[] t10 = this.a.t();
        cVar.K(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.b.t();
        cVar.K(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.c.t();
        cVar.K(k0Var.c(t12.length, t12), "authenticatorData");
        byte[] t13 = this.d.t();
        cVar.K(k0Var.c(t13.length, t13), "signature");
        o7.s0 s0Var = this.e;
        byte[] t14 = s0Var == null ? null : s0Var.t();
        if (t14 != null) {
            cVar.K(k0Var.c(t14.length, t14), "userHandle");
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.a.t());
        df.c(parcel, 3, this.b.t());
        df.c(parcel, 4, this.c.t());
        df.c(parcel, 5, this.d.t());
        o7.s0 s0Var = this.e;
        df.c(parcel, 6, s0Var == null ? null : s0Var.t());
        df.r(parcel, q5);
    }
}
