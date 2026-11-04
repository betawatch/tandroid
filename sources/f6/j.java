package f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends com.google.android.gms.internal.cast.o {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 0);
        this.c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.o
    public final boolean K0(int i3, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i10 = this.b;
        Object obj = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                s0.b bVar = (s0.b) obj;
                if (i3 == 1) {
                    z6.b bVar2 = new z6.b(bVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, bVar2);
                    break;
                } else if (i3 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    bVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i3 == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 1:
                f fVar = (f) obj;
                switch (i3) {
                    case 1:
                        z6.b bVar3 = new z6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.u.d(parcel2, bVar3);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i12 = com.google.android.gms.internal.cast.u.a;
                        int i13 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel P0 = oVar.P0();
                                P0.writeInt(i13);
                                P0.writeInt(0);
                                oVar.T0(P0, 6);
                            } catch (RemoteException e10) {
                                c.m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) fVar;
                        p6.m.d("Must be called from the main thread.");
                        g6.h hVar = cVar2.j;
                        long g7 = hVar == null ? 0L : hVar.g() - cVar2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g7);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b(bundle5);
                        if (b10 != null) {
                            String str = b10.d;
                            if (!b10.equals(cVar3.k)) {
                                Object[] objArr = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != objArr ? "unchanged" : "changed");
                                if (objArr != false && (castDevice = cVar3.k) != null) {
                                    h6.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        i6.b bVar4 = h6.h.v;
                                        Log.i(bVar4.a, bVar4.d("update Cast device to %s", castDevice));
                                        hVar2.o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((e0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar5 = eVar.d;
                if (i3 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    z6.a f10 = new c(eVar.a, eVar.b, readString, eVar.d, eVar.e, new h6.h(eVar.a, bVar5, eVar.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, f10);
                    break;
                } else if (i3 == 2) {
                    boolean z10 = bVar5.e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.u.a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    break;
                } else if (i3 == 3) {
                    String str2 = eVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i3 == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 3:
                c cVar4 = (c) obj;
                int i15 = 23;
                if (i3 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e6.e0 e0Var = cVar4.i;
                    if (e0Var != null && e0Var.G == 2) {
                        com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                        b11.c = new e6.b0(e0Var, readString2, readString3, i11);
                        b11.a = 8407;
                        e0Var.e(1, b11.a()).addOnCompleteListener(new android.support.v4.media.c(this, i15));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i3 == 2) {
                    String readString4 = parcel.readString();
                    e6.i iVar = (e6.i) com.google.android.gms.internal.cast.u.a(parcel, e6.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e6.e0 e0Var2 = cVar4.i;
                    if (e0Var2 != null && e0Var2.G == 2) {
                        com.google.android.gms.common.api.internal.s b12 = com.google.android.gms.common.api.internal.t.b();
                        b12.c = new android.support.v4.media.session.a0(e0Var2, readString4, iVar, 16);
                        b12.a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new c6.i(this, i15));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i3 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e6.e0 e0Var3 = cVar4.i;
                    if (e0Var3 != null && e0Var3.G == 2) {
                        com.google.android.gms.common.api.internal.s b13 = com.google.android.gms.common.api.internal.t.b();
                        b13.c = new tf.b(e0Var3, readString5);
                        b13.a = 8409;
                        e0Var3.e(1, b13.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i3 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    c.g(cVar4, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i3 == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            default:
                if (i3 == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    ((h6.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i3 == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 0);
        this.c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 0);
        this.c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 0);
        this.c = bVar;
    }

    public j(s0.b bVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 0);
        this.c = bVar;
    }
}
