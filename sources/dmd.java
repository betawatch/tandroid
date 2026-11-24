// default package

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dmd extends dzc implements bbf {
    public static final /* synthetic */ int c = 0;
    public final qx b;

    public dmd(qx qxVar) {
        super("com.google.android.gms.location.ILocationCallback", (byte) 8);
        this.b = qxVar;
    }

    public final void T() {
        this.b.h().a(new v39(this, (byte) 28));
    }

    public final void U(w56 w56Var) {
        qx qxVar = this.b;
        synchronized (qxVar) {
            w56 w56Var2 = (w56) qxVar.c;
            if (w56Var2 != w56Var) {
                w56Var2.b = null;
                qxVar.c = w56Var;
            }
        }
    }

    @Override // dzc
    public final boolean e(Parcel parcel, int i) {
        qx qxVar = this.b;
        byte b = 1;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) rgd.a(parcel, LocationResult.CREATOR);
            rgd.b(parcel);
            qxVar.h().a(new g29((Object) locationResult, (byte) 27));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            T();
            return true;
        }
        rgd.b(parcel);
        qxVar.h().a(new f6d(b));
        return true;
    }
}
