package c7;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends b7.a implements r7.m {
    public static final /* synthetic */ int c = 0;
    public final androidx.activity.n b;

    public j(androidx.activity.n nVar) {
        super("com.google.android.gms.location.ILocationCallback", 1);
        this.b = nVar;
    }

    @Override // b7.a
    public final boolean I0(Parcel parcel, int i10) {
        androidx.activity.n nVar = this.b;
        if (i10 == 1) {
            LocationResult locationResult = (LocationResult) e.a(parcel, LocationResult.CREATOR);
            e.b(parcel);
            nVar.e().a(new k5.i(locationResult, 6));
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
        nVar.e().a(new a9.i(locationAvailability, 8));
        return true;
    }

    public final void J0() {
        this.b.e().a(new ae.b(this, 6));
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
