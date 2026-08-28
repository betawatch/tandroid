package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final x6.s0 a;
    public final x6.s0 b;
    public final x6.s0 c;
    public final x6.s0 d;
    public final x6.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        x5.l.h(bArr);
        x6.s0 t10 = x6.s0.t(bArr.length, bArr);
        x5.l.h(bArr2);
        x6.s0 t11 = x6.s0.t(bArr2.length, bArr2);
        x5.l.h(bArr3);
        x6.s0 t12 = x6.s0.t(bArr3.length, bArr3);
        x5.l.h(bArr4);
        x6.s0 t13 = x6.s0.t(bArr4.length, bArr4);
        x6.s0 t14 = bArr5 == null ? null : x6.s0.t(bArr5.length, bArr5);
        this.a = t10;
        this.b = t11;
        this.c = t12;
        this.d = t13;
        this.e = t14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", e6.b.c(this.b.u()));
            jSONObject.put("authenticatorData", e6.b.c(this.c.u()));
            jSONObject.put("signature", e6.b.c(this.d.u()));
            x6.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", e6.b.c(s0Var == null ? null : s0Var.u()));
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
        return x5.l.l(this.a, iVar.a) && x5.l.l(this.b, iVar.b) && x5.l.l(this.c, iVar.c) && x5.l.l(this.d, iVar.d) && x5.l.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        t5.c cVar = new t5.c(getClass().getSimpleName(), 12);
        x6.k0 k0Var = x6.m0.d;
        byte[] u10 = this.a.u();
        cVar.j(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        cVar.j(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        cVar.j(k0Var.c(u12.length, u12), "authenticatorData");
        byte[] u13 = this.d.u();
        cVar.j(k0Var.c(u13.length, u13), "signature");
        x6.s0 s0Var = this.e;
        byte[] u14 = s0Var == null ? null : s0Var.u();
        if (u14 != null) {
            cVar.j(k0Var.c(u14.length, u14), "userHandle");
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.a.u());
        p8.c(parcel, 3, this.b.u());
        p8.c(parcel, 4, this.c.u());
        p8.c(parcel, 5, this.d.u());
        x6.s0 s0Var = this.e;
        p8.c(parcel, 6, s0Var == null ? null : s0Var.u());
        p8.r(parcel, q10);
    }
}
