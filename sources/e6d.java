// default package

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e6d extends e1d implements IInterface {
    public final /* synthetic */ byte b;
    public final /* synthetic */ h6d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6d(h6d h6dVar, byte b) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", (byte) 2);
        this.b = b;
        this.c = h6dVar;
    }

    @Override // e1d
    public final boolean c(int i, Parcel parcel, Parcel parcel2) {
        h6d h6dVar = this.c;
        byte b = this.b;
        switch (i) {
            case 101:
                y5d.b(parcel);
                gxc.b();
                return false;
            case nm7.m1 /* 102 */:
                Status status = (Status) y5d.a(parcel, Status.CREATOR);
                y5d.b(parcel);
                switch (b) {
                    case 0:
                        h6dVar.a(status);
                        break;
                    default:
                        throw new UnsupportedOperationException();
                }
            case nm7.n1 /* 103 */:
                Status status2 = (Status) y5d.a(parcel, Status.CREATOR);
                y5d.b(parcel);
                switch (b) {
                    case 1:
                        h6dVar.a(status2);
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
