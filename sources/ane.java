// default package

import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class ane extends dzc implements gse {
    public ane() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 8);
    }

    @Override // dzc
    public final boolean e(Parcel parcel, int i) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            zze();
            return true;
        }
        w5e w5eVar = (w5e) rgd.a(parcel, w5e.CREATOR);
        rgd.b(parcel);
        t(w5eVar);
        return true;
    }
}
