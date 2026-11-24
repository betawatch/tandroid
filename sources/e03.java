// default package

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e03 extends b4 {
    public static final Parcelable.Creator<e03> CREATOR = new x21((byte) 10);
    public final PendingIntent a;
    public final j03 b;

    public e03(PendingIntent pendingIntent, j03 j03Var) {
        this.a = pendingIntent;
        this.b = j03Var;
        if (pendingIntent == null && j03Var == null) {
            w26.j("pendingIntent or createCredentialResponse must be specified.");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.k(parcel, 2, this.b, i);
        jte.s(parcel, r);
    }
}
