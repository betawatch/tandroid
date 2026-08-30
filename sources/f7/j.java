package f7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class j extends a7.c implements u7.m {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.o b;

    public j(androidx.activity.o oVar) {
        super("com.google.android.gms.location.ILocationCallback", 5);
        this.b = oVar;
    }

    @Override // a7.c
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.o oVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) e.a(parcel, LocationResult.CREATOR);
            e.b(parcel);
            oVar.e().a(new a3.c(locationResult, 14));
            return true;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return false;
            }
            J0();
            return true;
        }
        LocationAvailability locationAvailability = (LocationAvailability) e.a(parcel, LocationAvailability.CREATOR);
        e.b(parcel);
        oVar.e().a(new ja.c(locationAvailability, 9));
        return true;
    }

    public final void J0() {
        this.b.e().a(new o5.i(this, 17));
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
