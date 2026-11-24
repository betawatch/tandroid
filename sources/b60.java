// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class b60 extends c60 {
    public static final Parcelable.Creator<b60> CREATOR = new sje((byte) 25);
    public final f54 a;
    public final String b;
    public final int c;

    public b60(int i, int i2, String str) {
        try {
            this.a = f54.a(i);
            this.b = str;
            this.c = i2;
        } catch (e54 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b60)) {
            return false;
        }
        b60 b60Var = (b60) obj;
        return fse.a(this.a, b60Var.a) && fse.a(this.b, b60Var.b) && fse.a(Integer.valueOf(this.c), Integer.valueOf(b60Var.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        wm9 wm9Var = new wm9(getClass().getSimpleName(), (byte) 25);
        String valueOf = String.valueOf((int) this.a.a);
        sed sedVar = new sed((byte) 24, false);
        ((wm9) wm9Var.d).d = sedVar;
        wm9Var.d = sedVar;
        sedVar.c = valueOf;
        sedVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            wm9Var.B(str, "errorMessage");
        }
        return wm9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        byte b = this.a.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(b);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
