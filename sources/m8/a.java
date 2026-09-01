package m8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                throw l.d.n(parcel);
            case 3:
                throw l.d.n(parcel);
            case 4:
                throw l.d.n(parcel);
            case 5:
                throw l.d.n(parcel);
            case 6:
                throw l.d.n(parcel);
            case 7:
                u0 u0Var = (u0) t7.a.a(parcel, u0.CREATOR);
                t7.a.b(parcel);
                A0(u0Var);
                break;
            case 8:
                throw l.d.n(parcel);
            case 9:
                throw l.d.n(parcel);
            case 10:
                throw l.d.n(parcel);
            case 11:
                t7.a.b(parcel);
                v();
                break;
            case 12:
                throw l.d.n(parcel);
            case 13:
                throw l.d.n(parcel);
            case 14:
                throw l.d.n(parcel);
            case 15:
                throw l.d.n(parcel);
            case 16:
                throw l.d.n(parcel);
            case 17:
                throw l.d.n(parcel);
            case 18:
                throw l.d.n(parcel);
            case 19:
                throw l.d.n(parcel);
            case 20:
                throw l.d.n(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw l.d.n(parcel);
            case 23:
                throw l.d.n(parcel);
            case 26:
                throw l.d.n(parcel);
            case 27:
                throw l.d.n(parcel);
            case 28:
                throw l.d.n(parcel);
            case 29:
                throw l.d.n(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw l.d.n(parcel);
            case 34:
                throw l.d.n(parcel);
            case 35:
                throw l.d.n(parcel);
            case 36:
                throw l.d.n(parcel);
            case 37:
                throw l.d.n(parcel);
            case 38:
                throw l.d.n(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw l.d.n(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw l.d.n(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // m8.f0
    public void v() {
        throw new UnsupportedOperationException();
    }
}
