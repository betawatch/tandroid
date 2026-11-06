package k8;

import a8.q;
import a8.r7;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bi.x5;
import java.util.HashMap;
import l8.e;
import m8.f;
import org.telegram.messenger.db;
import org.telegram.messenger.ea;
import org.telegram.messenger.eb;
import org.telegram.messenger.fa;
import org.telegram.messenger.ha;
import org.telegram.messenger.o;
import org.telegram.messenger.p1;
import org.telegram.messenger.y9;
import org.telegram.ui.Components.jk;
import org.telegram.ui.x90;
import v7.i;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c extends q {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o oVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 12);
        this.c = oVar;
    }

    @Override // a8.q
    public final boolean K0(int i7, Parcel parcel, Parcel parcel2) {
        v7.a iVar;
        e eVar;
        switch (this.b) {
            case 0:
                if (i7 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof v7.a ? (v7.a) queryLocalInterface : new i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 11);
                    }
                    v7.b.a(parcel);
                    o oVar = (o) this.c;
                    f fVar = new f(iVar);
                    fa faVar = (fa) oVar.b;
                    eb ebVar = (eb) oVar.c;
                    HashMap hashMap = faVar.b;
                    if (((ea) hashMap.get(fVar)) == null) {
                        hashMap.put(fVar, new ea(fVar));
                    }
                    ebVar.onClick();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    break;
                }
                break;
            case 1:
                if (i7 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        eVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        eVar = queryLocalInterface2 instanceof e ? (e) queryLocalInterface2 : new e(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 11);
                    }
                    v7.b.a(parcel);
                    ha haVar = (ha) this.c;
                    wf.b bVar = new wf.b(eVar);
                    r7 r7Var = haVar.a;
                    q0.a aVar = haVar.b;
                    fa faVar2 = new fa();
                    faVar2.b = new HashMap();
                    faVar2.c = new HashMap();
                    faVar2.a = bVar;
                    aVar.accept(faVar2);
                    r7Var.n((x5) r7Var.b);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i7 == 1) {
                    a7.a M0 = a7.b.M0(parcel.readStrongBinder());
                    v7.b.a(parcel);
                    ((y9) this.c).b.accept((Location) a7.b.N0(M0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i7 == 1) {
                    ((jk) ((p1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    int readInt = parcel.readInt();
                    v7.b.a(parcel);
                    db dbVar = (db) ((p1) this.c).b;
                    int i10 = 2;
                    if (readInt != 2) {
                        i10 = 3;
                        if (readInt != 3) {
                            i10 = 1;
                        }
                    }
                    dbVar.c(i10);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i7 == 1) {
                    ((x90) ((p1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i7 == 1) {
                    ((jk) ((p1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p1 p1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 12);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p1 p1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 12);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p1 p1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 12);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p1 p1Var, int i7) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 12);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y9 y9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 12);
        this.c = y9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ha haVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 12);
        this.c = haVar;
    }
}
