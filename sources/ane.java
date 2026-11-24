// default package

import android.os.Parcel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
