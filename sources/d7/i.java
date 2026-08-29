package d7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends c7.a implements s7.m {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public i(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 4);
        this.b = nVar;
    }

    @Override // c7.a
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) d.a(parcel, LocationResult.CREATOR);
            d.b(parcel);
            nVar.e().a(new za.c(locationResult, 11));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            J0();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) d.a(parcel, LocationAvailability.CREATOR);
        d.b(parcel);
        nVar.e().a(new ha.c(locationAvailability, 13));
        return true;
    }

    public final void J0() {
        this.b.e().a(new m5.i(this, 10));
    }

    public final void K0(com.google.android.gms.common.api.internal.p pVar) {
        androidx.activity.n nVar = this.b;
        synchronized (nVar) {
            com.google.android.gms.common.api.internal.p pVar2 = (com.google.android.gms.common.api.internal.p) nVar.b;
            if (pVar2 != pVar) {
                pVar2.b = null;
                pVar2.c = null;
                nVar.b = pVar;
            }
        }
    }
}
