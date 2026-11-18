package k8;

import a8.q;
import a8.r7;
import ai.k0;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import l8.e;
import m8.f;
import org.telegram.messenger.bb;
import org.telegram.messenger.ca;
import org.telegram.messenger.cb;
import org.telegram.messenger.da;
import org.telegram.messenger.fa;
import org.telegram.messenger.j1;
import org.telegram.messenger.o;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.yk;
import org.telegram.ui.aa0;
import v7.i;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
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
                    da daVar = (da) oVar.b;
                    cb cbVar = (cb) oVar.c;
                    HashMap hashMap = daVar.b;
                    if (((ca) hashMap.get(fVar)) == null) {
                        hashMap.put(fVar, new ca(fVar));
                    }
                    cbVar.onClick();
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
                    fa faVar = (fa) this.c;
                    a aVar = new a(eVar);
                    r7 r7Var = faVar.a;
                    q0.a aVar2 = faVar.b;
                    da daVar2 = new da();
                    daVar2.b = new HashMap();
                    daVar2.c = new HashMap();
                    daVar2.a = aVar;
                    aVar2.accept(daVar2);
                    r7Var.r((k0) r7Var.b);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i7 == 1) {
                    a7.a m12 = a7.b.m1(parcel.readStrongBinder());
                    v7.b.a(parcel);
                    ((dl) ((j1) this.c).b).accept((Location) a7.b.n1(m12));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i7 == 1) {
                    ((yk) ((j1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i7 == 1) {
                    int readInt = parcel.readInt();
                    v7.b.a(parcel);
                    bb bbVar = (bb) ((j1) this.c).b;
                    int i10 = 2;
                    if (readInt != 2) {
                        i10 = 3;
                        if (readInt != 3) {
                            i10 = 1;
                        }
                    }
                    bbVar.c(i10);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i7 == 1) {
                    ((aa0) ((j1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i7 == 1) {
                    ((yk) ((j1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j1 j1Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 12);
        this.c = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j1 j1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 12);
        this.c = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j1 j1Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 12);
        this.c = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j1 j1Var, int i7) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 12);
        this.c = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j1 j1Var, short s5) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 12);
        this.c = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fa faVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 12);
        this.c = faVar;
    }
}
