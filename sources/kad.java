// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kad extends u3d {
    public final /* synthetic */ byte b = 0;
    public final Object c;

    public kad(c22 c22Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", (byte) 4);
        this.c = c22Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u3d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        byte b = this.b;
        Object obj = this.c;
        boolean z = false;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                c22 c22Var = (c22) obj;
                if (i == 1) {
                    br7 br7Var = new br7(c22Var);
                    parcel2.writeNoException();
                    ald.d(parcel2, br7Var);
                    break;
                } else if (i == 2) {
                    int readInt = parcel.readInt();
                    ald.b(parcel);
                    c22Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 1:
                v8a v8aVar = (v8a) obj;
                switch (i) {
                    case 1:
                        br7 br7Var2 = new br7(v8aVar);
                        parcel2.writeNoException();
                        ald.d(parcel2, br7Var2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) ald.a(parcel, Bundle.CREATOR);
                        ald.b(parcel);
                        ((md1) v8aVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) ald.a(parcel, Bundle.CREATOR);
                        ald.b(parcel);
                        ((md1) v8aVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i2 = ald.a;
                        int i3 = parcel.readInt() != 0 ? 1 : 0;
                        ald.b(parcel);
                        md1 md1Var = (md1) v8aVar;
                        ycd ycdVar = md1Var.e;
                        if (ycdVar != null) {
                            try {
                                ncd ncdVar = (ncd) ycdVar;
                                Parcel R = ncdVar.R();
                                R.writeInt(i3);
                                R.writeInt(0);
                                ncdVar.V(R, 6);
                            } catch (RemoteException e) {
                                md1.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", ycd.class.getSimpleName());
                            }
                            md1Var.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        md1 md1Var2 = (md1) v8aVar;
                        xve.e("Must be called from the main thread.");
                        v99 v99Var = md1Var2.j;
                        long g = v99Var == null ? 0L : v99Var.g() - md1Var2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) ald.a(parcel, Bundle.CREATOR);
                        ald.b(parcel);
                        ((md1) v8aVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) ald.a(parcel, Bundle.CREATOR);
                        ald.b(parcel);
                        ((md1) v8aVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) ald.a(parcel, Bundle.CREATOR);
                        ald.b(parcel);
                        md1 md1Var3 = (md1) v8aVar;
                        CastDevice b2 = CastDevice.b(bundle5);
                        if (b2 != null) {
                            String str = b2.d;
                            if (!b2.equals(md1Var3.k)) {
                                Object[] objArr2 = !TextUtils.isEmpty(str) && ((castDevice2 = md1Var3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                md1Var3.k = b2;
                                md1.m.b("update to device (%s) with name %s", b2, true != objArr2 ? "unchanged" : "changed");
                                if (objArr2 != false && (castDevice = md1Var3.k) != null) {
                                    alf alfVar = md1Var3.h;
                                    if (alfVar != null) {
                                        he6 he6Var = alf.v;
                                        Log.i(he6Var.a, he6Var.d("update Cast device to %s", castDevice));
                                        alfVar.o = castDevice;
                                        alfVar.b();
                                    }
                                    Iterator it = new HashSet(md1Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((kmf) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                xbd xbdVar = (xbd) obj;
                ld1 ld1Var = xbdVar.d;
                if (i == 1) {
                    String readString = parcel.readString();
                    ald.b(parcel);
                    al5 f = new md1(xbdVar.a, xbdVar.b, readString, xbdVar.d, xbdVar.e, new alf(xbdVar.a, ld1Var, xbdVar.e)).f();
                    parcel2.writeNoException();
                    ald.d(parcel2, f);
                    break;
                } else if (i == 2) {
                    boolean z2 = ld1Var.e;
                    parcel2.writeNoException();
                    int i4 = ald.a;
                    parcel2.writeInt(z2 ? 1 : 0);
                    break;
                } else if (i == 3) {
                    String str2 = xbdVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 3:
                if (i == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    ald.b(parcel);
                    ((o3e) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            default:
                md1 md1Var4 = (md1) obj;
                byte b3 = 5;
                if (i == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    ald.b(parcel);
                    rjd rjdVar = md1Var4.i;
                    if (rjdVar != null && rjdVar.G == 2) {
                        wjb b4 = xjb.b();
                        b4.a = new ygd(rjdVar, readString2, readString3, objArr == true ? 1 : 0);
                        b4.d = (char) 8407;
                        rjdVar.e(1, b4.a()).addOnCompleteListener(new uae(this, b3));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 2) {
                    String readString4 = parcel.readString();
                    f26 f26Var = (f26) ald.a(parcel, f26.CREATOR);
                    ald.b(parcel);
                    rjd rjdVar2 = md1Var4.i;
                    if (rjdVar2 != null && rjdVar2.G == 2) {
                        wjb b5 = xjb.b();
                        b5.a = new ko9((Object) rjdVar2, (Object) readString4, (Object) f26Var, (byte) 21);
                        b5.d = (char) 8406;
                        rjdVar2.e(1, b5.a()).addOnCompleteListener(new xae(this));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 3) {
                    String readString5 = parcel.readString();
                    ald.b(parcel);
                    rjd rjdVar3 = md1Var4.i;
                    if (rjdVar3 != null && rjdVar3.G == 2) {
                        wjb b6 = xjb.b();
                        b6.a = new zhc(rjdVar3, readString5, z, (byte) 12);
                        b6.d = (char) 8409;
                        rjdVar3.e(1, b6.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 4) {
                    int readInt2 = parcel.readInt();
                    ald.b(parcel);
                    md1.g(md1Var4, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kad(md1 md1Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 4);
        this.c = md1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kad(v8a v8aVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 4);
        this.c = v8aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kad(xbd xbdVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 4);
        this.c = xbdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kad(o3e o3eVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 4);
        this.c = o3eVar;
    }
}
