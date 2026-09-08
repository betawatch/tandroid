package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(27);
    public final a0 a;
    public final o b;

    public x(String str, int i10) {
        n6.l.h(str);
        try {
            this.a = a0.a(str);
            try {
                this.b = o.a(i10);
            } catch (n e7) {
                throw new IllegalArgumentException(e7);
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
        return p6.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c7.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        this.a.getClass();
        w7.e0.l(parcel, 2, "public-key");
        w7.e0.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        w7.e0.r(parcel, q6);
    }
}
