// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b50 extends c50 {
    public static final Parcelable.Creator<b50> CREATOR = new rhe((byte) 25);
    public final v34 a;
    public final String b;
    public final int c;

    public b50(int i, int i2, String str) {
        try {
            this.a = v34.a(i);
            this.b = str;
            this.c = i2;
        } catch (u34 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b50)) {
            return false;
        }
        b50 b50Var = (b50) obj;
        return cqe.a(this.a, b50Var.a) && cqe.a(this.b, b50Var.b) && cqe.a(Integer.valueOf(this.c), Integer.valueOf(b50Var.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        vk9 vk9Var = new vk9(getClass().getSimpleName(), (byte) 25);
        String valueOf = String.valueOf((int) this.a.a);
        qcd qcdVar = new qcd((byte) 24, false);
        ((vk9) vk9Var.d).d = qcdVar;
        vk9Var.d = qcdVar;
        qcdVar.c = valueOf;
        qcdVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            vk9Var.B(str, "errorMessage");
        }
        return vk9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        byte b = this.a.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(b);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.s(parcel, r);
    }
}
