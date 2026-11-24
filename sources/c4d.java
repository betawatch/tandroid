// default package

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class c4d extends dzc implements IInterface {
    public final /* synthetic */ byte b;
    public final /* synthetic */ f4d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4d(f4d f4dVar, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 2);
        this.b = b;
        this.c = f4dVar;
    }

    @Override // dzc
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        f4d f4dVar = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                w3d.b(parcel);
                fvc.b();
                return false;
            case kk7.m1 /* 102 */:
                Status status = (Status) w3d.a(parcel, Status.CREATOR);
                w3d.b(parcel);
                switch (b) {
                    case 0:
                        f4dVar.a(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case kk7.n1 /* 103 */:
                Status status2 = (Status) w3d.a(parcel, Status.CREATOR);
                w3d.b(parcel);
                switch (b) {
                    case 1:
                        f4dVar.a(status2);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
