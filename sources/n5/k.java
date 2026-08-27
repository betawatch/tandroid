package n5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import m5.f0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class k extends b7.a {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 2);
        this.c = fVar;
    }

    @Override // b7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.b;
        int i12 = 3;
        Object obj = this.c;
        int i13 = 0;
        switch (i11) {
            case 0:
                u3.k kVar = (u3.k) obj;
                if (i10 == 1) {
                    i6.b bVar = new i6.b(kVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                    break;
                } else if (i10 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    kVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            case 1:
                g gVar = (g) obj;
                switch (i10) {
                    case 1:
                        i6.b bVar2 = new i6.b(gVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.t.d(parcel2, bVar2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i14 = com.google.android.gms.internal.cast.t.a;
                        int i15 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) gVar;
                        r rVar = cVar.e;
                        if (rVar != null) {
                            try {
                                p pVar = (p) rVar;
                                Parcel M0 = pVar.M0();
                                M0.writeInt(i15);
                                M0.writeInt(0);
                                pVar.Q0(M0, 6);
                            } catch (RemoteException e9) {
                                c.m.a(e9, "Unable to call %s on %s.", "disconnectFromDevice", r.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) gVar;
                        y5.l.e("Must be called from the main thread.");
                        o5.h hVar = cVar2.j;
                        long g10 = hVar == null ? 0L : hVar.g() - cVar2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) gVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar3 = (c) gVar;
                        CastDevice b10 = CastDevice.b(bundle5);
                        if (b10 != null) {
                            String str = b10.d;
                            if (!b10.equals(cVar3.k)) {
                                boolean z10 = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != z10 ? "unchanged" : "changed");
                                if (z10 && (castDevice = cVar3.k) != null) {
                                    p5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        r5.b bVar3 = p5.h.v;
                                        Log.i(bVar3.a, bVar3.d("update Cast device to %s", castDevice));
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
                com.google.android.gms.internal.cast.f fVar = (com.google.android.gms.internal.cast.f) obj;
                b bVar4 = fVar.d;
                if (i10 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    i6.a f10 = new c(fVar.a, fVar.b, readString, fVar.d, fVar.e, new p5.h(fVar.a, bVar4, fVar.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, f10);
                    break;
                } else if (i10 == 2) {
                    boolean z11 = bVar4.e;
                    parcel2.writeNoException();
                    int i16 = com.google.android.gms.internal.cast.t.a;
                    parcel2.writeInt(z11 ? 1 : 0);
                    break;
                } else if (i10 == 3) {
                    String str2 = fVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i10 == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            case 3:
                c cVar4 = (c) obj;
                if (i10 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f0 f0Var = cVar4.i;
                    if (f0Var != null && f0Var.F == 2) {
                        com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                        b11.c = new m5.c0(f0Var, readString2, readString3, i13);
                        b11.a = 8407;
                        f0Var.e(1, b11.b()).addOnCompleteListener(new n1.d(this, i12));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    String readString4 = parcel.readString();
                    m5.i iVar = (m5.i) com.google.android.gms.internal.cast.t.a(parcel, m5.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f0 f0Var2 = cVar4.i;
                    if (f0Var2 != null && f0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.c = new j9.a(f0Var2, readString4, iVar);
                        b12.a = 8406;
                        f0Var2.e(1, b12.b()).addOnCompleteListener(new ga.c(this, 29));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f0 f0Var3 = cVar4.i;
                    if (f0Var3 != null && f0Var3.F == 2) {
                        com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                        b13.c = new g5.b(20, f0Var3, readString5);
                        b13.a = 8409;
                        f0Var3.e(1, b13.b());
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
                }
                break;
            default:
                if (i10 == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    ((p5.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 2);
        this.c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 2);
        this.c = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 2);
        this.c = bVar;
    }

    public k(u3.k kVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 2);
        this.c = kVar;
    }
}
