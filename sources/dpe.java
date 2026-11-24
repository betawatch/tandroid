// default package

import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dpe extends e1d implements jue {
    public dpe() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 8);
    }

    @Override // e1d
    public final boolean e(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        z7e z7eVar = (z7e) sid.a(parcel, z7e.CREATOR);
        sid.b(parcel);
        t(z7eVar);
        return true;
    }
}
