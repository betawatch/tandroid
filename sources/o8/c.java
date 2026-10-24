package o8;

import android.os.Parcel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class c extends b8.b implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 6);
    }

    @Override // b8.b
    public final boolean G0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                k7.a.b(parcel);
                break;
            case 4:
                k7.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                k7.a.b(parcel);
                break;
            case 7:
                k7.a.b(parcel);
                break;
            case 8:
                h hVar = (h) k7.a.a(parcel, h.CREATOR);
                k7.a.b(parcel);
                B(hVar);
                break;
            case 9:
                k7.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
