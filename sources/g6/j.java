package g6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class j extends a8.q {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.c = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a8.q
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i10 = this.b;
        Object obj = this.c;
        boolean z9 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (i10) {
            case 0:
                v0.j jVar = (v0.j) obj;
                if (i7 == 1) {
                    a7.b bVar = new a7.b(jVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                    break;
                } else if (i7 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    jVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i7 == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 1:
                f fVar = (f) obj;
                switch (i7) {
                    case 1:
                        a7.b bVar2 = new a7.b(fVar);
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
                        int i11 = com.google.android.gms.internal.cast.t.a;
                        int i12 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel p12 = oVar.p1();
                                p12.writeInt(i12);
                                p12.writeInt(0);
                                oVar.t1(p12, 6);
                            } catch (RemoteException e10) {
                                c.m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) fVar;
                        q6.m.d("Must be called from the main thread.");
                        h6.h hVar = cVar2.j;
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
                                Object[] objArr3 = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != objArr3 ? "unchanged" : "changed");
                                if (objArr3 != false && (castDevice = cVar3.k) != null) {
                                    i6.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        j6.b bVar3 = i6.h.v;
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
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar4 = eVar.d;
                if (i7 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    a7.a f10 = new c(eVar.a, eVar.b, readString, eVar.d, eVar.e, new i6.h(eVar.a, bVar4, eVar.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.t.d(parcel2, f10);
                    break;
                } else if (i7 == 2) {
                    boolean z10 = bVar4.e;
                    parcel2.writeNoException();
                    int i13 = com.google.android.gms.internal.cast.t.a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    break;
                } else if (i7 == 3) {
                    String str2 = eVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i7 == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 3:
                c cVar4 = (c) obj;
                if (i7 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f6.e0 e0Var = cVar4.i;
                    if (e0Var != null && e0Var.G == 2) {
                        com.google.android.gms.common.api.internal.s b11 = com.google.android.gms.common.api.internal.t.b();
                        b11.c = new f6.b0(e0Var, readString2, readString3, objArr2 == true ? 1 : 0);
                        b11.a = 8407;
                        e0Var.e(1, b11.a()).addOnCompleteListener(new d0((Object) this, (int) (objArr == true ? 1 : 0)));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i7 == 2) {
                    String readString4 = parcel.readString();
                    f6.i iVar = (f6.i) com.google.android.gms.internal.cast.t.a(parcel, f6.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f6.e0 e0Var2 = cVar4.i;
                    if (e0Var2 != null && e0Var2.G == 2) {
                        com.google.android.gms.common.api.internal.s b12 = com.google.android.gms.common.api.internal.t.b();
                        b12.c = new android.support.v4.media.session.a0(e0Var2, readString4, iVar, false, 23);
                        b12.a = 8406;
                        e0Var2.e(1, b12.a()).addOnCompleteListener(new aa.n(this, 26));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i7 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f6.e0 e0Var3 = cVar4.i;
                    if (e0Var3 != null && e0Var3.G == 2) {
                        com.google.android.gms.common.api.internal.s b13 = com.google.android.gms.common.api.internal.t.b();
                        b13.c = new q4.q(e0Var3, readString5, z9, 22);
                        b13.a = 8409;
                        e0Var3.e(1, b13.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i7 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    c.g(cVar4, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i7 == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            default:
                if (i7 == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    com.google.android.gms.internal.cast.t.b(parcel);
                    ((i6.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i7 == 2) {
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
    public j(i6.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.c = bVar;
    }

    public j(v0.j jVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.c = jVar;
    }
}
