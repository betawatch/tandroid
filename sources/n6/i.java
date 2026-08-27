package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new o0(26);
    public final y6.s0 a;
    public final y6.s0 b;
    public final y6.s0 c;
    public final y6.s0 d;
    public final y6.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        y5.l.h(bArr);
        y6.s0 t10 = y6.s0.t(bArr.length, bArr);
        y5.l.h(bArr2);
        y6.s0 t11 = y6.s0.t(bArr2.length, bArr2);
        y5.l.h(bArr3);
        y6.s0 t12 = y6.s0.t(bArr3.length, bArr3);
        y5.l.h(bArr4);
        y6.s0 t13 = y6.s0.t(bArr4.length, bArr4);
        y6.s0 t14 = bArr5 == null ? null : y6.s0.t(bArr5.length, bArr5);
        this.a = t10;
        this.b = t11;
        this.c = t12;
        this.d = t13;
        this.e = t14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", f6.b.c(this.b.u()));
            jSONObject.put("authenticatorData", f6.b.c(this.c.u()));
            jSONObject.put("signature", f6.b.c(this.d.u()));
            y6.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", f6.b.c(s0Var == null ? null : s0Var.u()));
            return jSONObject;
        } catch (JSONException e9) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return y5.l.l(this.a, iVar.a) && y5.l.l(this.b, iVar.b) && y5.l.l(this.c, iVar.c) && y5.l.l(this.d, iVar.d) && y5.l.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        u2.b bVar = new u2.b(getClass().getSimpleName(), 12);
        y6.k0 k0Var = y6.m0.d;
        byte[] u10 = this.a.u();
        bVar.j(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        bVar.j(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        bVar.j(k0Var.c(u12.length, u12), "authenticatorData");
        byte[] u13 = this.d.u();
        bVar.j(k0Var.c(u13.length, u13), "signature");
        y6.s0 s0Var = this.e;
        byte[] u14 = s0Var == null ? null : s0Var.u();
        if (u14 != null) {
            bVar.j(k0Var.c(u14.length, u14), "userHandle");
        }
        return bVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.a.u());
        r8.c(parcel, 3, this.b.u());
        r8.c(parcel, 4, this.c.u());
        r8.c(parcel, 5, this.d.u());
        y6.s0 s0Var = this.e;
        r8.c(parcel, 6, s0Var == null ? null : s0Var.u());
        r8.r(parcel, q6);
    }
}
