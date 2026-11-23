package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i extends l {
    public static final Parcelable.Creator<i> CREATOR = new t0(4);
    public final q7.s0 a;
    public final q7.s0 b;
    public final q7.s0 c;
    public final q7.s0 d;
    public final q7.s0 e;

    public i(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        q6.m.h(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.h(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.h(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        q6.m.h(bArr4);
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
        return q6.m.l(this.a, iVar.a) && q6.m.l(this.b, iVar.b) && q6.m.l(this.c, iVar.c) && q6.m.l(this.d, iVar.d) && q6.m.l(this.e, iVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        i61 i61Var = new i61(getClass().getSimpleName());
        q7.k0 k0Var = q7.m0.d;
        byte[] p10 = this.a.p();
        i61Var.R(k0Var.c(p10.length, p10), "keyHandle");
        byte[] p11 = this.b.p();
        i61Var.R(k0Var.c(p11.length, p11), "clientDataJSON");
        byte[] p12 = this.c.p();
        i61Var.R(k0Var.c(p12.length, p12), "authenticatorData");
        byte[] p13 = this.d.p();
        i61Var.R(k0Var.c(p13.length, p13), "signature");
        q7.s0 s0Var = this.e;
        byte[] p14 = s0Var == null ? null : s0Var.p();
        if (p14 != null) {
            i61Var.R(k0Var.c(p14.length, p14), "userHandle");
        }
        return i61Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.c(parcel, 2, this.a.p());
        cc.c(parcel, 3, this.b.p());
        cc.c(parcel, 4, this.c.p());
        cc.c(parcel, 5, this.d.p());
        q7.s0 s0Var = this.e;
        cc.c(parcel, 6, s0Var == null ? null : s0Var.p());
        cc.s(parcel, r10);
    }
}
