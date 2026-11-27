// default package

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class k9d extends u3d {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e05 e05Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", (byte) 9);
        this.c = e05Var;
    }

    @Override // u3d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        byte b = this.b;
        bad badVar = null;
        qae qaeVar = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        badVar = queryLocalInterface instanceof bad ? (bad) queryLocalInterface : new hmf(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                    }
                    jld.a(parcel);
                    dl6 dl6Var = new dl6(badVar);
                    HashMap hashMap = ((x05) ((e05) obj).b).b;
                    if (((w05) hashMap.get(dl6Var)) == null) {
                        hashMap.put(dl6Var, new w05(dl6Var));
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        qaeVar = queryLocalInterface2 instanceof qae ? (qae) queryLocalInterface2 : new qae(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 6);
                    }
                    jld.a(parcel);
                    z05 z05Var = (z05) obj;
                    um4 um4Var = new um4(qaeVar);
                    am2 am2Var = z05Var.a;
                    pt2 pt2Var = z05Var.b;
                    x05 x05Var = new x05();
                    x05Var.b = new HashMap();
                    x05Var.c = new HashMap();
                    x05Var.a = um4Var;
                    pt2Var.accept(x05Var);
                    am2Var.v((tt) am2Var.b);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    al5 T = br7.T(parcel.readStrongBinder());
                    jld.a(parcel);
                    ((n42) ((e05) obj).b).accept((Location) br7.U(T));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i == 1) {
                    ((i42) ((e05) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i == 1) {
                    int readInt = parcel.readInt();
                    jld.a(parcel);
                    bk5 bk5Var = (bk5) ((e05) obj).b;
                    int i2 = 2;
                    if (readInt != 2) {
                        i2 = 3;
                        if (readInt != 3) {
                            i2 = 1;
                        }
                    }
                    bk5Var.c(i2);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i == 1) {
                    ((dc6) ((e05) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    ((i42) ((e05) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e05 e05Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", (byte) 9);
        this.c = e05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e05 e05Var, byte b, boolean z) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", (byte) 9);
        this.c = e05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e05 e05Var, char c) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", (byte) 9);
        this.c = e05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e05 e05Var, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", (byte) 9);
        this.c = e05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(e05 e05Var, short s) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", (byte) 9);
        this.c = e05Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9d(z05 z05Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 9);
        this.c = z05Var;
    }
}
