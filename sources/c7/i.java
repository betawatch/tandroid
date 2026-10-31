package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.s0 a;
    public final n7.s0 b;
    public final n7.s0 c;
    public final n7.s0 d;
    public final n7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n6.l.g(bArr);
        n7.s0 s10 = n7.s0.s(bArr.length, bArr);
        n6.l.g(bArr2);
        n7.s0 s11 = n7.s0.s(bArr2.length, bArr2);
        n6.l.g(bArr3);
        n7.s0 s12 = n7.s0.s(bArr3.length, bArr3);
        n6.l.g(bArr4);
        n7.s0 s13 = n7.s0.s(bArr4.length, bArr4);
        n7.s0 s14 = bArr5 == null ? null : n7.s0.s(bArr5.length, bArr5);
        this.a = s10;
        this.b = s11;
        this.c = s12;
        this.d = s13;
        this.e = s14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.b.t()));
            jSONObject.put("authenticatorData", u6.b.c(this.c.t()));
            jSONObject.put("signature", u6.b.c(this.d.t()));
            n7.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", u6.b.c(s0Var == null ? null : s0Var.t()));
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
        return n6.l.k(this.a, iVar.a) && n6.l.k(this.b, iVar.b) && n6.l.k(this.c, iVar.c) && n6.l.k(this.d, iVar.d) && n6.l.k(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        li.k kVar = new li.k(getClass().getSimpleName());
        n7.k0 k0Var = n7.m0.d;
        byte[] t10 = this.a.t();
        kVar.M(k0Var.c(t10.length, t10), "keyHandle");
        byte[] t11 = this.b.t();
        kVar.M(k0Var.c(t11.length, t11), "clientDataJSON");
        byte[] t12 = this.c.t();
        kVar.M(k0Var.c(t12.length, t12), "authenticatorData");
        byte[] t13 = this.d.t();
        kVar.M(k0Var.c(t13.length, t13), "signature");
        n7.s0 s0Var = this.e;
        byte[] t14 = s0Var == null ? null : s0Var.t();
        if (t14 != null) {
            kVar.M(k0Var.c(t14.length, t14), "userHandle");
        }
        return kVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.c(parcel, 2, this.a.t());
        w7.h0.c(parcel, 3, this.b.t());
        w7.h0.c(parcel, 4, this.c.t());
        w7.h0.c(parcel, 5, this.d.t());
        n7.s0 s0Var = this.e;
        w7.h0.c(parcel, 6, s0Var == null ? null : s0Var.t());
        w7.h0.r(parcel, q6);
    }
}
