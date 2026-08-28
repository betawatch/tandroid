package b7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends a7.a implements q7.n {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.o b;

    public k(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 1);
        this.b = oVar;
    }

    @Override // a7.a
    public final boolean I0(Parcel parcel, int i9) {
        androidx.activity.o oVar = this.b;
        if (i9 == 1) {
            LocationResult locationResult = (LocationResult) f.a(parcel, LocationResult.CREATOR);
            f.b(parcel);
            oVar.e().a(new xa.c(locationResult, 6));
            return true;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                return false;
            }
            J0();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) f.a(parcel, LocationAvailability.CREATOR);
        f.b(parcel);
        oVar.e().a(new fa.c(locationAvailability, 5));
        return true;
    }

    public final void J0() {
        this.b.e().a(new k5.i(this, 5));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.o oVar = this.b;
        synchronized (oVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) oVar.b;
            if (pVar2 != pVar) {
                pVar2.b = null;
                pVar2.c = null;
                oVar.b = pVar;
            }
        }
    }
}
