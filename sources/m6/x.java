package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.telegram.ui.Cells.j2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class x extends y5.a {
    public static final Parcelable.Creator<x> CREATOR = new h5.h(27);
    public final a0 a;
    public final o b;

    public x(String str, int i9) {
        x5.l.h(str);
        try {
            this.a = a0.a(str);
            try {
                this.b = o.a(i9);
            } catch (n e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z e11) {
            throw new IllegalArgumentException(e11);
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
        return j2.h("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, m6.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        this.a.getClass();
        p8.l(parcel, 2, "public-key");
        p8.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        p8.r(parcel, q10);
    }
}
