package j8;

import ai.c0;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b8.ke;
import com.google.android.gms.internal.cast.o;
import java.util.HashMap;
import k8.e;
import l8.f;
import org.telegram.messenger.ba;
import org.telegram.messenger.p1;
import org.telegram.messenger.s9;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.y9;
import org.telegram.messenger.z9;
import org.telegram.ui.Components.ik;
import org.telegram.ui.u90;
import p4.q;
import p6.m;
import u7.i;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends o {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(org.telegram.messenger.o oVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 10);
        this.c = oVar;
    }

    @Override // com.google.android.gms.internal.cast.o
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        u7.a iVar;
        e eVar;
        switch (this.b) {
            case 0:
                if (i3 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof u7.a ? (u7.a) queryLocalInterface : new i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
                    }
                    u7.b.a(parcel);
                    org.telegram.messenger.o oVar = (org.telegram.messenger.o) this.c;
                    f fVar = new f(iVar);
                    z9 z9Var = (z9) oVar.b;
                    xa xaVar = (xa) oVar.c;
                    HashMap hashMap = z9Var.b;
                    if (((y9) hashMap.get(fVar)) == null) {
                        hashMap.put(fVar, new y9(fVar));
                    }
                    xaVar.onClick();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    break;
                }
                break;
            case 1:
                if (i3 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        eVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        eVar = queryLocalInterface2 instanceof e ? (e) queryLocalInterface2 : new e(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 10);
                    }
                    u7.b.a(parcel);
                    ba baVar = (ba) this.c;
                    q qVar = new q();
                    new HashMap();
                    m.g(eVar);
                    qVar.a = eVar;
                    ke keVar = baVar.a;
                    q0.a aVar = baVar.b;
                    z9 z9Var2 = new z9();
                    z9Var2.b = new HashMap();
                    z9Var2.c = new HashMap();
                    z9Var2.a = qVar;
                    aVar.accept(z9Var2);
                    keVar.m((c0) keVar.b);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i3 == 1) {
                    z6.a M0 = z6.b.M0(parcel.readStrongBinder());
                    u7.b.a(parcel);
                    ((s9) this.c).b.accept((Location) z6.b.N0(M0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i3 == 1) {
                    ((ik) ((p1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i3 == 1) {
                    int readInt = parcel.readInt();
                    u7.b.a(parcel);
                    wa waVar = (wa) ((p1) this.c).b;
                    int i10 = 2;
                    if (readInt != 2) {
                        i10 = 3;
                        if (readInt != 3) {
                            i10 = 1;
                        }
                    }
                    waVar.c(i10);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i3 == 1) {
                    ((u90) ((p1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i3 == 1) {
                    ((ik) ((p1) this.c).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p1 p1Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 10);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p1 p1Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 10);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p1 p1Var, char c2) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 10);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p1 p1Var, int i3) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 10);
        this.c = p1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s9 s9Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 10);
        this.c = s9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ba baVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 10);
        this.c = baVar;
    }
}
