// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dcd extends b4 {
    public static final Parcelable.Creator<dcd> CREATOR = new lbd(6);
    public final obd a;
    public final obd b;

    public dcd(obd obdVar, obd obdVar2) {
        this.a = obdVar;
        this.b = obdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcd)) {
            return false;
        }
        dcd dcdVar = (dcd) obj;
        return qe1.d(this.a, dcdVar.a) && qe1.d(this.b, dcdVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.k(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
