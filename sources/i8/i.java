package i8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.g0;
import org.telegram.messenger.o4;
import org.telegram.messenger.p4;
import org.telegram.messenger.q4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class i extends c8.b {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 10);
        this.c = bVar;
    }

    @Override // c8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        t7.a iVar;
        boolean lambda$setOnMarkerClickListener$1;
        j8.f fVar;
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof t7.a ? (t7.a) queryLocalInterface : new t7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
                    }
                    t7.b.a(parcel);
                    org.telegram.messenger.f fVar2 = (org.telegram.messenger.f) this.c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) fVar2.b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) fVar2.c, new k8.f(iVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    break;
                }
                break;
            case 1:
                b bVar = (b) this.c;
                if (i10 == 1) {
                    bVar.onFinish();
                } else if (i10 == 2) {
                    bVar.onCancel();
                }
                parcel2.writeNoException();
                break;
            case 2:
                if (i10 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        fVar = queryLocalInterface2 instanceof j8.f ? (j8.f) queryLocalInterface2 : new j8.f(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 10);
                    }
                    t7.b.a(parcel);
                    q4 q4Var = (q4) ((f) this.c);
                    q4Var.a.lambda$getMapAsync$0(q4Var.b, new c(fVar));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    y6.a K0 = y6.b.K0(parcel.readStrongBinder());
                    t7.b.a(parcel);
                    ((o4) this.c).b.accept((Location) y6.b.L0(K0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i10 == 1) {
                    ((p4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    t7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((g0) this.c).b, readInt);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    ((p4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    ((p4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.f fVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g0 g0Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.c = g0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o4 o4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.c = o4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p4 p4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.c = p4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p4 p4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.c = p4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p4 p4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.c = p4Var;
    }
}
