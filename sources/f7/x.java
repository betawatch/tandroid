package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new db.k(16);
    public final a0 a;
    public final o b;

    public x(String str, int i7) {
        q6.m.h(str);
        try {
            this.a = a0.a(str);
            try {
                this.b = o.a(i7);
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
        return p5.c.l("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f7.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        this.a.getClass();
        bc.l(parcel, 2, "public-key");
        bc.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        bc.s(parcel, r10);
    }
}
