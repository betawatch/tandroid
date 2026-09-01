package c8;

import android.os.Parcel;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
