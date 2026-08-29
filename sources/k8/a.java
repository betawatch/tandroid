package k8;

import android.os.Parcel;
import androidx.car.app.navigation.model.Maneuver;
import j7.l1;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a extends c7.a implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 8);
    }

    @Override // c7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                throw l1.p(parcel);
            case 3:
                throw l1.p(parcel);
            case 4:
                throw l1.p(parcel);
            case 5:
                throw l1.p(parcel);
            case 6:
                throw l1.p(parcel);
            case 7:
                v0 v0Var = (v0) r7.a.a(parcel, v0.CREATOR);
                r7.a.b(parcel);
                m0(v0Var);
                break;
            case 8:
                throw l1.p(parcel);
            case 9:
                throw l1.p(parcel);
            case 10:
                throw l1.p(parcel);
            case 11:
                r7.a.b(parcel);
                w();
                break;
            case 12:
                throw l1.p(parcel);
            case 13:
                throw l1.p(parcel);
            case 14:
                throw l1.p(parcel);
            case 15:
                throw l1.p(parcel);
            case 16:
                throw l1.p(parcel);
            case 17:
                throw l1.p(parcel);
            case 18:
                throw l1.p(parcel);
            case 19:
                throw l1.p(parcel);
            case 20:
                throw l1.p(parcel);
            case 21:
            case 24:
            case 25:
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw l1.p(parcel);
            case 23:
                throw l1.p(parcel);
            case 26:
                throw l1.p(parcel);
            case 27:
                throw l1.p(parcel);
            case 28:
                throw l1.p(parcel);
            case 29:
                throw l1.p(parcel);
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                throw l1.p(parcel);
            case 34:
                throw l1.p(parcel);
            case 35:
                throw l1.p(parcel);
            case 36:
                throw l1.p(parcel);
            case 37:
                throw l1.p(parcel);
            case 38:
                throw l1.p(parcel);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                throw l1.p(parcel);
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                throw l1.p(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // k8.f0
    public void m0(v0 v0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // k8.f0
    public void w() {
        throw new UnsupportedOperationException();
    }
}
