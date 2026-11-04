package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new r0(19);
    public final p7.t0 a;
    public final p7.t0 b;
    public final p7.t0 c;
    public final p7.t0 d;
    public final p7.t0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        p6.m.g(bArr);
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(bArr2);
        p7.t0 o11 = p7.t0.o(bArr2.length, bArr2);
        p6.m.g(bArr3);
        p7.t0 o12 = p7.t0.o(bArr3.length, bArr3);
        p6.m.g(bArr4);
        p7.t0 o13 = p7.t0.o(bArr4.length, bArr4);
        p7.t0 o14 = bArr5 == null ? null : p7.t0.o(bArr5.length, bArr5);
        this.a = o10;
        this.b = o11;
        this.c = o12;
        this.d = o13;
        this.e = o14;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", w6.b.c(this.b.p()));
            jSONObject.put("authenticatorData", w6.b.c(this.c.p()));
            jSONObject.put("signature", w6.b.c(this.d.p()));
            p7.t0 t0Var = this.e;
            if (t0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", w6.b.c(t0Var == null ? null : t0Var.p()));
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
        return p6.m.k(this.a, iVar.a) && p6.m.k(this.b, iVar.b) && p6.m.k(this.c, iVar.c) && p6.m.k(this.d, iVar.d) && p6.m.k(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        p7.d dVar = new p7.d(getClass().getSimpleName(), 1);
        p7.l0 l0Var = p7.n0.d;
        byte[] p10 = this.a.p();
        dVar.I(l0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.b.p();
        dVar.I(l0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.c.p();
        dVar.I(l0Var.c(p12.length, p12), "authenticatorData");
        byte[] p13 = this.d.p();
        dVar.I(l0Var.c(p13.length, p13), "signature");
        p7.t0 t0Var = this.e;
        byte[] p14 = t0Var == null ? null : t0Var.p();
        if (p14 != null) {
            dVar.I(l0Var.c(p14.length, p14), "userHandle");
        }
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.a.p());
        j8.a.d(parcel, 3, this.b.p());
        j8.a.d(parcel, 4, this.c.p());
        j8.a.d(parcel, 5, this.d.p());
        p7.t0 t0Var = this.e;
        j8.a.d(parcel, 6, t0Var == null ? null : t0Var.p());
        j8.a.t(parcel, s6);
    }
}
