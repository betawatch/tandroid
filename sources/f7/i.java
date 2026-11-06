package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new t0(4);
    public final q7.s0 a;
    public final q7.s0 b;
    public final q7.s0 c;
    public final q7.s0 d;
    public final q7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        q6.m.g(bArr4);
        q7.s0 o12 = q7.s0.o(bArr4.length, bArr4);
        q7.s0 o13 = bArr5 == null ? null : q7.s0.o(bArr5.length, bArr5);
        this.a = o4;
        this.b = o10;
        this.c = o11;
        this.d = o12;
        this.e = o13;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", x6.b.c(this.b.p()));
            jSONObject.put("authenticatorData", x6.b.c(this.c.p()));
            jSONObject.put("signature", x6.b.c(this.d.p()));
            q7.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", x6.b.c(s0Var == null ? null : s0Var.p()));
            return jSONObject;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return q6.m.k(this.a, iVar.a) && q6.m.k(this.b, iVar.b) && q6.m.k(this.c, iVar.c) && q6.m.k(this.d, iVar.d) && q6.m.k(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        hy0 hy0Var = new hy0(getClass().getSimpleName(), 9);
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.a.p();
        hy0Var.N(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.b.p();
        hy0Var.N(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.c.p();
        hy0Var.N(k0Var.c(p12.length, p12), "authenticatorData");
        byte[] p13 = this.d.p();
        hy0Var.N(k0Var.c(p13.length, p13), "signature");
        q7.s0 s0Var = this.e;
        byte[] p14 = s0Var == null ? null : s0Var.p();
        if (p14 != null) {
            hy0Var.N(k0Var.c(p14.length, p14), "userHandle");
        }
        return hy0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.a.p());
        xb.c(parcel, 3, this.b.p());
        xb.c(parcel, 4, this.c.p());
        xb.c(parcel, 5, this.d.p());
        q7.s0 s0Var = this.e;
        xb.c(parcel, 6, s0Var == null ? null : s0Var.p());
        xb.s(parcel, r10);
    }
}
