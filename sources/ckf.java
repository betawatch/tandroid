// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ckf extends b4 {
    public static final Parcelable.Creator<ckf> CREATOR = new v6d((byte) 6);
    public final int a;
    public final boolean b;
    public final boolean c;

    public ckf(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ckf)) {
            return false;
        }
        ckf ckfVar = (ckf) obj;
        return this.a == ckfVar.a && this.b == ckfVar.b && this.c == ckfVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.s(parcel, r);
    }
}
