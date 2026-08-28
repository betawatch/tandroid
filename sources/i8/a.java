package i8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a extends a7.a implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 8);
    }

    @Override // a7.a
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 2:
                throw e2.c.p(parcel);
            case 3:
                throw e2.c.p(parcel);
            case 4:
                throw e2.c.p(parcel);
            case 5:
                throw e2.c.p(parcel);
            case 6:
                throw e2.c.p(parcel);
            case 7:
                v0 v0Var = (v0) p7.a.a(parcel, v0.CREATOR);
                p7.a.b(parcel);
                n(v0Var);
                break;
            case 8:
                throw e2.c.p(parcel);
            case 9:
                throw e2.c.p(parcel);
            case 10:
                throw e2.c.p(parcel);
            case 11:
                p7.a.b(parcel);
                x();
                break;
            case 12:
                throw e2.c.p(parcel);
            case 13:
                throw e2.c.p(parcel);
            case 14:
                throw e2.c.p(parcel);
            case 15:
                throw e2.c.p(parcel);
            case 16:
                throw e2.c.p(parcel);
            case 17:
                throw e2.c.p(parcel);
            case 18:
                throw e2.c.p(parcel);
            case 19:
                throw e2.c.p(parcel);
            case 20:
                throw e2.c.p(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw e2.c.p(parcel);
            case 23:
                throw e2.c.p(parcel);
            case 26:
                throw e2.c.p(parcel);
            case 27:
                throw e2.c.p(parcel);
            case 28:
                throw e2.c.p(parcel);
            case 29:
                throw e2.c.p(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw e2.c.p(parcel);
            case 34:
                throw e2.c.p(parcel);
            case 35:
                throw e2.c.p(parcel);
            case 36:
                throw e2.c.p(parcel);
            case 37:
                throw e2.c.p(parcel);
            case 38:
                throw e2.c.p(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw e2.c.p(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw e2.c.p(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // i8.f0
    public void n(v0 v0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // i8.f0
    public void x() {
        throw new UnsupportedOperationException();
    }
}
