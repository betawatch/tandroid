package a8;

import android.os.Parcel;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c extends c7.a implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 10);
    }

    @Override // c7.a
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                w6.a.b(parcel);
                break;
            case 4:
                w6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                w6.a.b(parcel);
                break;
            case 7:
                w6.a.b(parcel);
                break;
            case 8:
                h hVar = (h) w6.a.a(parcel, h.CREATOR);
                w6.a.b(parcel);
                t0(hVar);
                break;
            case 9:
                w6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
