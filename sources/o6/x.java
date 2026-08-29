package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends a6.a {
    public static final Parcelable.Creator<x> CREATOR = new n0(9);
    public final a0 a;
    public final o b;

    public x(String str, int i10) {
        z5.l.h(str);
        try {
            this.a = a0.a(str);
            try {
                this.b = o.a(i10);
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
        return th.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, o6.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        this.a.getClass();
        com.google.android.gms.internal.cast.o.l(parcel, 2, "public-key");
        com.google.android.gms.internal.cast.o.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
