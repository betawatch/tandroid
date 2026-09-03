package c8;

import android.os.Parcel;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class c extends a7.c implements d {
    public c() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 11);
    }

    @Override // a7.c
    public final boolean F0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 3:
                y6.a.b(parcel);
                break;
            case 4:
                y6.a.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                y6.a.b(parcel);
                break;
            case 7:
                y6.a.b(parcel);
                break;
            case 8:
                h hVar = (h) y6.a.a(parcel, h.CREATOR);
                y6.a.b(parcel);
                h(hVar);
                break;
            case 9:
                y6.a.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
