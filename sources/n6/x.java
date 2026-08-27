package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.telegram.ui.Cells.pa;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x extends z5.a {
    public static final Parcelable.Creator<x> CREATOR = new o0(8);
    public final a0 a;
    public final o b;

    public x(String str, int i10) {
        y5.l.h(str);
        try {
            this.a = a0.a(str);
            try {
                this.b = o.a(i10);
            } catch (n e9) {
                throw new IllegalArgumentException(e9);
            }
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a.equals(xVar.a) && this.b.equals(xVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return pa.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, n6.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        this.a.getClass();
        r8.l(parcel, 2, "public-key");
        r8.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        r8.r(parcel, q6);
    }
}
