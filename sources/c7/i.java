package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(15);
    public final n7.s0 a;
    public final n7.s0 b;
    public final n7.s0 c;
    public final n7.s0 d;
    public final n7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        n6.l.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        n6.l.h(bArr4);
        n7.s0 t13 = n7.s0.t(bArr4.length, bArr4);
        n7.s0 t14 = bArr5 == null ? null : n7.s0.t(bArr5.length, bArr5);
        this.a = t10;
        this.b = t11;
        this.c = t12;
        this.d = t13;
        this.e = t14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", u6.b.c(this.b.u()));
            jSONObject.put("authenticatorData", u6.b.c(this.c.u()));
            jSONObject.put("signature", u6.b.c(this.d.u()));
            n7.s0 s0Var = this.e;
            if (s0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", u6.b.c(s0Var == null ? null : s0Var.u()));
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return n6.l.l(this.a, iVar.a) && n6.l.l(this.b, iVar.b) && n6.l.l(this.c, iVar.c) && n6.l.l(this.d, iVar.d) && n6.l.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        m2.t tVar = new m2.t(getClass().getSimpleName(), 7);
        n7.k0 k0Var = n7.m0.d;
        byte[] u10 = this.a.u();
        tVar.T(k0Var.c(u10.length, u10), "keyHandle");
        byte[] u11 = this.b.u();
        tVar.T(k0Var.c(u11.length, u11), "clientDataJSON");
        byte[] u12 = this.c.u();
        tVar.T(k0Var.c(u12.length, u12), "authenticatorData");
        byte[] u13 = this.d.u();
        tVar.T(k0Var.c(u13.length, u13), "signature");
        n7.s0 s0Var = this.e;
        byte[] u14 = s0Var == null ? null : s0Var.u();
        if (u14 != null) {
            tVar.T(k0Var.c(u14.length, u14), "userHandle");
        }
        return tVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.a.u());
        w7.e0.c(parcel, 3, this.b.u());
        w7.e0.c(parcel, 4, this.c.u());
        w7.e0.c(parcel, 5, this.d.u());
        n7.s0 s0Var = this.e;
        w7.e0.c(parcel, 6, s0Var == null ? null : s0Var.u());
        w7.e0.r(parcel, q6);
    }
}
