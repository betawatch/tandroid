package n5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends a7.a {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 3);
        this.c = fVar;
    }

    @Override // a7.a
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i10 = this.b;
        Object obj = this.c;
        int i11 = 2;
        int i12 = 0;
        switch (i10) {
            case 0:
                v0.l lVar = (v0.l) obj;
                if (i9 == 1) {
                    h6.b bVar = new h6.b(lVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                    break;
                } else if (i9 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    lVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i9 == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            case 1:
                f fVar = (f) obj;
                switch (i9) {
                    case 1:
                        h6.b bVar2 = new h6.b(fVar);
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
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel M0 = oVar.M0();
                                M0.writeInt(i14);
                                M0.writeInt(0);
                                oVar.Q0(M0, 6);
                            } catch (RemoteException e10) {
                                c.m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) fVar;
                        x5.l.e("Must be called from the main thread.");
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
                                boolean z10 = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != z10 ? "unchanged" : "changed");
                                if (z10 && (castDevice = cVar3.k) != null) {
                                    p5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        q5.b bVar3 = p5.h.v;
                                        Log.i(bVar3.a, bVar3.d("update Cast device to %s", castDevice));
                                        hVar2.o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((f0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) obj;
                b bVar4 = fVar2.d;
                if (i9 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    h6.a f10 = new c(fVar2.a, fVar2.b, readString, fVar2.d, fVar2.e, new p5.h(fVar2.a, bVar4, fVar2.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, f10);
                    break;
                } else if (i9 == 2) {
                    boolean z11 = bVar4.e;
                    parcel2.writeNoException();
                    int i15 = com.google.android.gms.internal.cast.u.a;
                    parcel2.writeInt(z11 ? 1 : 0);
                    break;
                } else if (i9 == 3) {
                    String str2 = fVar2.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i9 == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            case 3:
                c cVar4 = (c) obj;
                if (i9 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    m5.f0 f0Var = cVar4.i;
                    if (f0Var != null && f0Var.F == 2) {
                        com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                        b11.c = new m5.b0(f0Var, readString2, readString3, i12);
                        b11.a = 8407;
                        f0Var.e(1, b11.b()).addOnCompleteListener(new n2.p(this, i11));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i9 == 2) {
                    String readString4 = parcel.readString();
                    m5.i iVar = (m5.i) com.google.android.gms.internal.cast.u.a(parcel, m5.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    m5.f0 f0Var2 = cVar4.i;
                    if (f0Var2 != null && f0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.c = new j4.c(f0Var2, readString4, iVar, false, 12);
                        b12.a = 8406;
                        f0Var2.e(1, b12.b()).addOnCompleteListener(new e0(this, i12));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i9 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    m5.f0 f0Var3 = cVar4.i;
                    if (f0Var3 != null && f0Var3.F == 2) {
                        com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                        b13.c = new g5.b(19, f0Var3, readString5);
                        b13.a = 8409;
                        f0Var3.e(1, b13.b());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i9 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    c.g(cVar4, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i9 == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            default:
                if (i9 == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    ((p5.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i9 == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 3);
        this.c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 3);
        this.c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 3);
        this.c = bVar;
    }

    public j(v0.l lVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 3);
        this.c = lVar;
    }
}
