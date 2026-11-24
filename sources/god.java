// default package

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class god extends e1d implements cdf {
    public static final /* synthetic */ int c = 0;
    public final ry b;

    public god(ry ryVar) {
        super("com.google.android.gms.location.ILocationCallback", (byte) 8);
        this.b = ryVar;
    }

    public final void T() {
        this.b.h().a(new fkd((Object) this, (byte) 1));
    }

    public final void U(w76 w76Var) {
        ry ryVar = this.b;
        synchronized (ryVar) {
            w76 w76Var2 = (w76) ryVar.c;
            if (w76Var2 != w76Var) {
                w76Var2.b = null;
                ryVar.c = w76Var;
            }
        }
    }

    @Override // e1d
    public final boolean e(Parcel parcel, int i) {
        ry ryVar = this.b;
        byte b = 1;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) sid.a(parcel, LocationResult.CREATOR);
            sid.b(parcel);
            ryVar.h().a(new et8((Object) locationResult, (byte) 29));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            T();
            return true;
        }
        sid.b(parcel);
        ryVar.h().a(new h8d(b));
        return true;
    }
}
