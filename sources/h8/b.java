package h8;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import bh.d;
import i8.f;
import j8.e;
import java.util.HashMap;
import n4.q;
import n6.l;
import org.telegram.messenger.aa;
import org.telegram.messenger.eb;
import org.telegram.messenger.fb;
import org.telegram.messenger.ga;
import org.telegram.messenger.ha;
import org.telegram.messenger.ja;
import org.telegram.messenger.p;
import org.telegram.messenger.s1;
import org.telegram.ui.Components.lk;
import s7.i;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class b extends b8.b {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.c = pVar;
    }

    @Override // b8.b
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        s7.a iVar;
        f fVar;
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof s7.a ? (s7.a) queryLocalInterface : new i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 9);
                    }
                    s7.b.a(parcel);
                    p pVar = (p) this.c;
                    e eVar = new e(iVar);
                    ha haVar = (ha) pVar.b;
                    fb fbVar = (fb) pVar.c;
                    HashMap hashMap = haVar.b;
                    ga gaVar = (ga) hashMap.get(eVar);
                    if (gaVar == null) {
                        gaVar = new ga(haVar, eVar);
                        hashMap.put(eVar, gaVar);
                    }
                    fbVar.a(gaVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    break;
                }
                break;
            case 1:
                if (i10 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        fVar = queryLocalInterface2 instanceof f ? (f) queryLocalInterface2 : new f(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 9);
                    }
                    s7.b.a(parcel);
                    ja jaVar = (ja) this.c;
                    q qVar = new q();
                    new HashMap();
                    l.g(fVar);
                    qVar.a = fVar;
                    d dVar = jaVar.a;
                    q0.a aVar = jaVar.b;
                    ha haVar2 = new ha();
                    haVar2.b = new HashMap();
                    haVar2.c = new HashMap();
                    haVar2.a = qVar;
                    aVar.accept(haVar2);
                    dVar.q((fg.i) dVar.a);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    x6.a M0 = x6.b.M0(parcel.readStrongBinder());
                    s7.b.a(parcel);
                    ((aa) this.c).b.accept((Location) x6.b.N0(M0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    ((lk) ((s1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    s7.b.a(parcel);
                    eb ebVar = (eb) ((s1) this.c).b;
                    int i11 = 2;
                    if (readInt != 2) {
                        i11 = 3;
                        if (readInt != 3) {
                            i11 = 1;
                        }
                    }
                    ebVar.d(i11);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    ((Runnable) ((s1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    ((lk) ((s1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s1 s1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.c = s1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s1 s1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.c = s1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s1 s1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.c = s1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s1 s1Var, int i10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.c = s1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aa aaVar) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.c = aaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ja jaVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.c = jaVar;
    }
}
