package a9;

import android.os.Parcel;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a extends com.google.android.gms.internal.cast.o implements d0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 4);
    }

    @Override // a9.d0
    public void C() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case 2:
                throw a1.g.v(parcel);
            case 3:
                throw a1.g.v(parcel);
            case 4:
                throw a1.g.v(parcel);
            case 5:
                throw a1.g.v(parcel);
            case 6:
                throw a1.g.v(parcel);
            case 7:
                t0 t0Var = (t0) h8.a.a(parcel, t0.CREATOR);
                h8.a.b(parcel);
                i0(t0Var);
                break;
            case 8:
                throw a1.g.v(parcel);
            case 9:
                throw a1.g.v(parcel);
            case 10:
                throw a1.g.v(parcel);
            case 11:
                h8.a.b(parcel);
                C();
                break;
            case 12:
                throw a1.g.v(parcel);
            case 13:
                throw a1.g.v(parcel);
            case 14:
                throw a1.g.v(parcel);
            case 15:
                throw a1.g.v(parcel);
            case 16:
                throw a1.g.v(parcel);
            case 17:
                throw a1.g.v(parcel);
            case 18:
                throw a1.g.v(parcel);
            case 19:
                throw a1.g.v(parcel);
            case 20:
                throw a1.g.v(parcel);
            case 21:
            case 24:
            case 25:
            case hs.U /* 31 */:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                throw a1.g.v(parcel);
            case 23:
                throw a1.g.v(parcel);
            case 26:
                throw a1.g.v(parcel);
            case 27:
                throw a1.g.v(parcel);
            case 28:
                throw a1.g.v(parcel);
            case 29:
                throw a1.g.v(parcel);
            case hs.T /* 30 */:
                throw a1.g.v(parcel);
            case 34:
                throw a1.g.v(parcel);
            case 35:
                throw a1.g.v(parcel);
            case 36:
                throw a1.g.v(parcel);
            case 37:
                throw a1.g.v(parcel);
            case 38:
                throw a1.g.v(parcel);
            case 39:
                throw a1.g.v(parcel);
            case 40:
                throw a1.g.v(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // a9.d0
    public void i0(t0 t0Var) {
        throw new UnsupportedOperationException();
    }
}
