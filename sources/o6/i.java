package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new n0(27);
    public final z6.s0 a;
    public final z6.s0 b;
    public final z6.s0 c;
    public final z6.s0 d;
    public final z6.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        z5.l.h(bArr);
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(bArr2);
        z6.s0 t11 = z6.s0.t(bArr2.length, bArr2);
        z5.l.h(bArr3);
        z6.s0 t12 = z6.s0.t(bArr3.length, bArr3);
        z5.l.h(bArr4);
        z6.s0 t13 = z6.s0.t(bArr4.length, bArr4);
        z6.s0 t14 = bArr5 == null ? null : z6.s0.t(bArr5.length, bArr5);
        this.a = t10;
        this.b = t11;
        this.c = t12;
        this.d = t13;
        this.e = t14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", g6.b.c(this.b.u()));
            jSONObject.put("authenticatorData", g6.b.c(this.c.u()));
            jSONObject.put("signature", g6.b.c(this.d.u()));
            z6.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", g6.b.c(s0Var == null ? null : s0Var.u()));
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
        return z5.l.l(this.a, iVar.a) && z5.l.l(this.b, iVar.b) && z5.l.l(this.c, iVar.c) && z5.l.l(this.d, iVar.d) && z5.l.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        v5.c cVar = new v5.c(getClass().getSimpleName(), 11);
        z6.k0 k0Var = z6.m0.d;
        byte[] u10 = this.a.u();
        cVar.j(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        cVar.j(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        cVar.j(k0Var.c(u12.length, u12), "authenticatorData");
        byte[] u13 = this.d.u();
        cVar.j(k0Var.c(u13.length, u13), "signature");
        z6.s0 s0Var = this.e;
        byte[] u14 = s0Var == null ? null : s0Var.u();
        if (u14 != null) {
            cVar.j(k0Var.c(u14.length, u14), "userHandle");
        }
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.a.u());
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.b.u());
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.c.u());
        com.google.android.gms.internal.cast.o.c(parcel, 5, this.d.u());
        z6.s0 s0Var = this.e;
        com.google.android.gms.internal.cast.o.c(parcel, 6, s0Var == null ? null : s0Var.u());
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
