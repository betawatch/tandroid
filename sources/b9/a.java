package b9;

import android.os.Parcel;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class a extends a8.q implements d0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 6);
    }

    @Override // b9.d0
    public void H() {
        throw new UnsupportedOperationException();
    }

    @Override // b9.d0
    public void O(t0 t0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // a8.q
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 2:
                throw a8.p0.v(parcel);
            case 3:
                throw a8.p0.v(parcel);
            case 4:
                throw a8.p0.v(parcel);
            case 5:
                throw a8.p0.v(parcel);
            case 6:
                throw a8.p0.v(parcel);
            case 7:
                t0 t0Var = (t0) i8.a.a(parcel, t0.CREATOR);
                i8.a.b(parcel);
                O(t0Var);
                break;
            case 8:
                throw a8.p0.v(parcel);
            case 9:
                throw a8.p0.v(parcel);
            case 10:
                throw a8.p0.v(parcel);
            case 11:
                i8.a.b(parcel);
                H();
                break;
            case 12:
                throw a8.p0.v(parcel);
            case 13:
                throw a8.p0.v(parcel);
            case 14:
                throw a8.p0.v(parcel);
            case 15:
                throw a8.p0.v(parcel);
            case 16:
                throw a8.p0.v(parcel);
            case 17:
                throw a8.p0.v(parcel);
            case 18:
                throw a8.p0.v(parcel);
            case 19:
                throw a8.p0.v(parcel);
            case 20:
                throw a8.p0.v(parcel);
            case 21:
            case 24:
            case 25:
            case qs.U /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw a8.p0.v(parcel);
            case 23:
                throw a8.p0.v(parcel);
            case 26:
                throw a8.p0.v(parcel);
            case 27:
                throw a8.p0.v(parcel);
            case 28:
                throw a8.p0.v(parcel);
            case 29:
                throw a8.p0.v(parcel);
            case qs.T /* 30 */:
                throw a8.p0.v(parcel);
            case 34:
                throw a8.p0.v(parcel);
            case 35:
                throw a8.p0.v(parcel);
            case 36:
                throw a8.p0.v(parcel);
            case 37:
                throw a8.p0.v(parcel);
            case 38:
                throw a8.p0.v(parcel);
            case 39:
                throw a8.p0.v(parcel);
            case 40:
                throw a8.p0.v(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
