// default package

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class b3d extends e1d implements IInterface {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3d(byte b) {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks", (byte) 1);
        this.b = b;
        switch (b) {
            case 1:
                super("com.google.android.gms.signin.internal.ISignInCallbacks", (byte) 1);
                break;
            default:
                break;
        }
    }

    public void T(Status status, og7 og7Var) {
        throw new UnsupportedOperationException();
    }

    public abstract void U(e5d e5dVar);

    public void V(Status status, qg7 qg7Var) {
        throw new UnsupportedOperationException();
    }

    @Override // e1d
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        switch (this.b) {
            case 0:
                if (i == 1) {
                    Status status = (Status) g4d.a(parcel, Status.CREATOR);
                    og7 og7Var = (og7) g4d.a(parcel, og7.CREATOR);
                    g4d.d(parcel);
                    T(status, og7Var);
                    break;
                } else if (i == 2) {
                    Status status2 = (Status) g4d.a(parcel, Status.CREATOR);
                    qg7 qg7Var = (qg7) g4d.a(parcel, qg7.CREATOR);
                    g4d.d(parcel);
                    V(status2, qg7Var);
                    break;
                } else {
                    if (i == 3) {
                        g4d.d(parcel);
                        gxc.b();
                    } else if (i == 4) {
                        g4d.d(parcel);
                        gxc.b();
                    }
                    break;
                }
            default:
                switch (i) {
                    case 3:
                        g4d.d(parcel);
                        break;
                    case 4:
                        g4d.d(parcel);
                        break;
                    case 6:
                        g4d.d(parcel);
                        break;
                    case 7:
                        g4d.d(parcel);
                        break;
                    case 8:
                        e5d e5dVar = (e5d) g4d.a(parcel, e5d.CREATOR);
                        g4d.d(parcel);
                        U(e5dVar);
                        break;
                    case 9:
                        g4d.d(parcel);
                        break;
                }
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
