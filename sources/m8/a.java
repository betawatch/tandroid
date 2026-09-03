package m8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class a extends a7.c implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 9);
    }

    @Override // m8.f0
    public void A0(u0 u0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw kf.k0.n(parcel);
            case 3:
                throw kf.k0.n(parcel);
            case 4:
                throw kf.k0.n(parcel);
            case 5:
                throw kf.k0.n(parcel);
            case 6:
                throw kf.k0.n(parcel);
            case 7:
                u0 u0Var = (u0) t7.a.a(parcel, u0.CREATOR);
                t7.a.b(parcel);
                A0(u0Var);
                break;
            case 8:
                throw kf.k0.n(parcel);
            case 9:
                throw kf.k0.n(parcel);
            case 10:
                throw kf.k0.n(parcel);
            case 11:
                t7.a.b(parcel);
                v();
                break;
            case 12:
                throw kf.k0.n(parcel);
            case 13:
                throw kf.k0.n(parcel);
            case 14:
                throw kf.k0.n(parcel);
            case 15:
                throw kf.k0.n(parcel);
            case 16:
                throw kf.k0.n(parcel);
            case 17:
                throw kf.k0.n(parcel);
            case 18:
                throw kf.k0.n(parcel);
            case 19:
                throw kf.k0.n(parcel);
            case 20:
                throw kf.k0.n(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw kf.k0.n(parcel);
            case 23:
                throw kf.k0.n(parcel);
            case 26:
                throw kf.k0.n(parcel);
            case 27:
                throw kf.k0.n(parcel);
            case 28:
                throw kf.k0.n(parcel);
            case 29:
                throw kf.k0.n(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw kf.k0.n(parcel);
            case 34:
                throw kf.k0.n(parcel);
            case 35:
                throw kf.k0.n(parcel);
            case 36:
                throw kf.k0.n(parcel);
            case 37:
                throw kf.k0.n(parcel);
            case 38:
                throw kf.k0.n(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw kf.k0.n(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw kf.k0.n(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // m8.f0
    public void v() {
        throw new UnsupportedOperationException();
    }
}
