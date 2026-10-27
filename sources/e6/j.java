package e6;

import a8.h0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import d6.e0;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.li1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends c8.b {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.b
    public final boolean I0(int i10, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.b;
        Object obj = this.c;
        int i12 = 0;
        switch (i11) {
            case 0:
                li1 li1Var = (li1) obj;
                if (i10 == 1) {
                    y6.b bVar = new y6.b(li1Var);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                    break;
                } else if (i10 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    li1Var.getClass();
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
                        y6.b bVar2 = new y6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.t.d(parcel2, bVar2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.t.a;
                        int i14 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel N0 = oVar.N0();
                                N0.writeInt(i14);
                                N0.writeInt(0);
                                oVar.R0(N0, 6);
                            } catch (RemoteException e) {
                                c.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) fVar;
                        o6.l.e("Must be called from the main thread.");
                        f6.h hVar = cVar2.j;
                        long g7 = hVar == null ? 0L : hVar.g() - cVar2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g7);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b(bundle5);
                        if (b10 != null) {
                            String str = b10.d;
                            if (!b10.equals(cVar3.k)) {
                                Object[] objArr = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != objArr ? "unchanged" : "changed");
                                if (objArr != false && (castDevice = cVar3.k) != null) {
                                    g6.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        h6.b bVar3 = g6.h.v;
                                        Log.i(bVar3.a, bVar3.d("update Cast device to %s", castDevice));
                                        hVar2.o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
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
                    com.google.android.gms.internal.cast.t.b(parcel);
                    y6.a f7 = new c(eVar.a, eVar.b, readString, eVar.d, eVar.e, new g6.h(eVar.a, bVar4, eVar.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, f7);
                    break;
                } else if (i10 == 2) {
                    boolean z10 = bVar4.e;
                    parcel2.writeNoException();
                    int i15 = com.google.android.gms.internal.cast.t.a;
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
                c cVar4 = (c) obj;
                if (i10 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    e0 e0Var = cVar4.i;
                    if (e0Var != null && e0Var.F == 2) {
                        com.google.android.gms.common.api.internal.u b11 = com.google.android.gms.common.api.internal.v.b();
                        b11.c = new d6.b0(e0Var, readString2, readString3, i12);
                        b11.a = 8407;
                        e0Var.e(1, b11.a()).addOnCompleteListener(new za.c(this, 17));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    String readString4 = parcel.readString();
                    d6.i iVar = (d6.i) com.google.android.gms.internal.cast.t.a(parcel, d6.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    e0 e0Var2 = cVar4.i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.u b12 = com.google.android.gms.common.api.internal.v.b();
                        b12.c = new h0(e0Var2, readString4, iVar, 13);
                        b12.a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new rb.c(this, 18));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    e0 e0Var3 = cVar4.i;
                    if (e0Var3 != null && e0Var3.F == 2) {
                        com.google.android.gms.common.api.internal.u b13 = com.google.android.gms.common.api.internal.v.b();
                        b13.c = new rf.b(15, e0Var3, readString5);
                        b13.a = 8409;
                        e0Var3.e(1, b13.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    c.g(cVar4, readInt2);
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
                    com.google.android.gms.internal.cast.t.b(parcel);
                    ((g6.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
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
    public j(g6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.c = bVar;
    }

    public j(li1 li1Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.c = li1Var;
    }
}
