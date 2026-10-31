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
import org.telegram.messenger.db;
import org.telegram.messenger.eb;
import org.telegram.messenger.fa;
import org.telegram.messenger.ga;
import org.telegram.messenger.ia;
import org.telegram.messenger.p;
import org.telegram.messenger.s1;
import org.telegram.messenger.z9;
import org.telegram.ui.Components.lk;
import s7.i;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends b8.b {
    public final /* synthetic */ int b = 1;
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
                    ga gaVar = (ga) pVar.b;
                    eb ebVar = (eb) pVar.c;
                    HashMap hashMap = gaVar.b;
                    fa faVar = (fa) hashMap.get(eVar);
                    if (faVar == null) {
                        faVar = new fa(gaVar, eVar);
                        hashMap.put(eVar, faVar);
                    }
                    ebVar.a(faVar);
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
                    ia iaVar = (ia) this.c;
                    q qVar = new q();
                    new HashMap();
                    l.g(fVar);
                    qVar.a = fVar;
                    d dVar = iaVar.a;
                    q0.a aVar = iaVar.b;
                    ga gaVar2 = new ga();
                    gaVar2.b = new HashMap();
                    gaVar2.c = new HashMap();
                    gaVar2.a = qVar;
                    aVar.accept(gaVar2);
                    dVar.q((fg.i) dVar.a);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i10 == 1) {
                    x6.a M0 = x6.b.M0(parcel.readStrongBinder());
                    s7.b.a(parcel);
                    ((z9) this.c).b.accept((Location) x6.b.N0(M0));
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
                    db dbVar = (db) ((s1) this.c).b;
                    int i11 = 2;
                    if (readInt != 2) {
                        i11 = 3;
                        if (readInt != 3) {
                            i11 = 1;
                        }
                    }
                    dbVar.d(i11);
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
    public b(z9 z9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.c = z9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ia iaVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.c = iaVar;
    }
}
