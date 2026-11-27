// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class b50 extends e50 {
    public static final Parcelable.Creator<b50> CREATOR = new ime((byte) 12);
    public final gfe a;
    public final gfe b;
    public final gfe c;
    public final gfe d;
    public final gfe e;

    public b50(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        xve.h(bArr);
        gfe o = gfe.o(bArr.length, bArr);
        xve.h(bArr2);
        gfe o2 = gfe.o(bArr2.length, bArr2);
        xve.h(bArr3);
        gfe o3 = gfe.o(bArr3.length, bArr3);
        xve.h(bArr4);
        gfe o4 = gfe.o(bArr4.length, bArr4);
        gfe o5 = bArr5 == null ? null : gfe.o(bArr5.length, bArr5);
        this.a = o;
        this.b = o2;
        this.c = o3;
        this.d = o4;
        this.e = o5;
    }

    public final JSONObject b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", lsd.b(this.b.p()));
            jSONObject.put("authenticatorData", lsd.b(this.c.p()));
            jSONObject.put("signature", lsd.b(this.d.p()));
            gfe gfeVar = this.e;
            if (gfeVar != null) {
                jSONObject.put("userHandle", lsd.b(gfeVar == null ? null : gfeVar.p()));
            }
            return jSONObject;
        } catch (JSONException e) {
            grb.j("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return vue.a(this.a, b50Var.a) && vue.a(this.b, b50Var.b) && vue.a(this.c, b50Var.c) && vue.a(this.d, b50Var.d) && vue.a(this.e, b50Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final String toString() {
        ko9 ko9Var = new ko9(getClass().getSimpleName(), (byte) 25);
        lbe lbeVar = cce.d;
        byte[] p = this.a.p();
        ko9Var.B(lbeVar.c(p.length, p), "keyHandle");
        byte[] p2 = this.b.p();
        ko9Var.B(lbeVar.c(p2.length, p2), "clientDataJSON");
        byte[] p3 = this.c.p();
        ko9Var.B(lbeVar.c(p3.length, p3), "authenticatorData");
        byte[] p4 = this.d.p();
        ko9Var.B(lbeVar.c(p4.length, p4), "signature");
        gfe gfeVar = this.e;
        byte[] p5 = gfeVar == null ? null : gfeVar.p();
        if (p5 != null) {
            ko9Var.B(lbeVar.c(p5.length, p5), "userHandle");
        }
        return ko9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a.p());
        bye.c(parcel, 3, this.b.p());
        bye.c(parcel, 4, this.c.p());
        bye.c(parcel, 5, this.d.p());
        gfe gfeVar = this.e;
        bye.c(parcel, 6, gfeVar == null ? null : gfeVar.p());
        bye.s(parcel, r);
    }
}
