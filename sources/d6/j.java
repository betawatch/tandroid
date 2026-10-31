package d6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j extends b8.b {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b8.b
    public final boolean K0(int i10, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.b;
        Object obj = this.c;
        int i12 = 0;
        switch (i11) {
            case 0:
                d2.c cVar = (d2.c) obj;
                if (i10 == 1) {
                    x6.b bVar = new x6.b(cVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                    break;
                } else if (i10 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    cVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        x6.b bVar2 = new x6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.u.d(parcel2, bVar2);
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
                        int i13 = com.google.android.gms.internal.cast.u.a;
                        int i14 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar2 = (c) fVar;
                        q qVar = cVar2.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel P0 = oVar.P0();
                                P0.writeInt(i14);
                                P0.writeInt(0);
                                oVar.T0(P0, 6);
                            } catch (RemoteException e) {
                                c.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar2.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar3 = (c) fVar;
                        n6.l.d("Must be called from the main thread.");
                        e6.h hVar = cVar3.j;
                        long g10 = hVar == null ? 0L : hVar.g() - cVar3.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
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
                        c cVar4 = (c) fVar;
                        CastDevice b10 = CastDevice.b(bundle5);
                        if (b10 != null) {
                            String str = b10.d;
                            if (!b10.equals(cVar4.k)) {
                                Object[] objArr = !TextUtils.isEmpty(str) && ((castDevice2 = cVar4.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar4.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != objArr ? "unchanged" : "changed");
                                if (objArr != false && (castDevice = cVar4.k) != null) {
                                    f6.i iVar = cVar4.h;
                                    if (iVar != null) {
                                        g6.b bVar3 = f6.i.v;
                                        Log.i(bVar3.a, bVar3.d("update Cast device to %s", castDevice));
                                        iVar.o = castDevice;
                                        iVar.b();
                                    }
                                    Iterator it = new HashSet(cVar4.d).iterator();
                                    while (it.hasNext()) {
                                        ((d0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar4 = eVar.d;
                if (i10 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    x6.a f7 = new c(eVar.a, eVar.b, readString, eVar.d, eVar.e, new f6.i(eVar.a, bVar4, eVar.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, f7);
                    break;
                } else if (i10 == 2) {
                    boolean z10 = bVar4.e;
                    parcel2.writeNoException();
                    int i15 = com.google.android.gms.internal.cast.u.a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    break;
                } else if (i10 == 3) {
                    String str2 = eVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i10 == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 3:
                c cVar5 = (c) obj;
                if (i10 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var = cVar5.i;
                    if (e0Var != null && e0Var.F == 2) {
                        com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                        b11.c = new c6.b0(e0Var, readString2, readString3, i12);
                        b11.a = 8407;
                        e0Var.e(1, b11.a()).addOnCompleteListener(new k6.h(this, 18));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    String readString4 = parcel.readString();
                    c6.i iVar2 = (c6.i) com.google.android.gms.internal.cast.u.a(parcel, c6.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var2 = cVar5.i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.c = new android.support.v4.media.session.a0(e0Var2, readString4, iVar2, 9);
                        b12.a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new a4.l(this, 12));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var3 = cVar5.i;
                    if (e0Var3 != null && e0Var3.F == 2) {
                        com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                        b13.c = new hf.b(11, e0Var3, readString5);
                        b13.a = 8409;
                        e0Var3.e(1, b13.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    c.g(cVar5, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            default:
                if (i10 == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    ((f6.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    public j(d2.c cVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.c = bVar;
    }
}
