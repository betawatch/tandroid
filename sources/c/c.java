package c;

import android.graphics.PointF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import com.google.firebase.messaging.r;
import e4.f;
import e4.k;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import f2.l0;
import f8.i;
import f8.j;
import g7.o8;
import java.util.ArrayList;
import o8.z;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i9) {
        this.a = i9;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        float f10 = -1.0f;
        float f11 = 0.0f;
        b bVar = null;
        String str = null;
        f8.c cVar = null;
        String str2 = null;
        PointF[] pointFArr = null;
        Bundle bundle = null;
        int i9 = 0;
        switch (this.a) {
            case 0:
                e eVar = new e();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i10 = d.b;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(b.h);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                        a aVar = new a();
                        aVar.a = readStrongBinder;
                        bVar = aVar;
                    } else {
                        bVar = (b) queryLocalInterface;
                    }
                }
                eVar.a = bVar;
                return eVar;
            case 1:
                return new PictureFrame(parcel);
            case 2:
                return new c4.a(parcel);
            case 3:
                int z10 = o8.z(parcel);
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 2) {
                        o8.y(parcel, readInt);
                    } else {
                        bundle = o8.a(parcel, readInt);
                    }
                }
                o8.m(parcel, z10);
                return new r(bundle);
            case 4:
                return new d4.b(parcel);
            case 5:
                return new d4.c(parcel);
            case 6:
                return new e4.a(parcel);
            case 7:
                return new e4.b(parcel);
            case 8:
                return new e4.c(parcel);
            case 9:
                return new e4.d(parcel);
            case 10:
                return new e4.e(parcel);
            case 11:
                return new f(parcel);
            case 12:
                return new k(parcel);
            case 13:
                return new l(parcel);
            case 14:
                return new m(parcel);
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString, readString2, z.v(createStringArray));
            case 16:
                return new o(parcel);
            case 17:
                int z11 = o8.z(parcel);
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    char c10 = (char) readInt2;
                    if (c10 == 2) {
                        pointFArr = (PointF[]) o8.k(parcel, readInt2, PointF.CREATOR);
                    } else if (c10 != 3) {
                        o8.y(parcel, readInt2);
                    } else {
                        i9 = o8.u(parcel, readInt2);
                    }
                }
                o8.m(parcel, z11);
                return new e8.a(pointFArr, i9);
            case 18:
                int z12 = o8.z(parcel);
                LandmarkParcel[] landmarkParcelArr = null;
                e8.a[] aVarArr = null;
                int i11 = 0;
                int i12 = 0;
                float f12 = 0.0f;
                float f13 = 0.0f;
                float f14 = 0.0f;
                float f15 = 0.0f;
                float f16 = Float.MAX_VALUE;
                float f17 = Float.MAX_VALUE;
                float f18 = Float.MAX_VALUE;
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                float f22 = -1.0f;
                while (parcel.dataPosition() < z12) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            i11 = o8.u(parcel, readInt3);
                            break;
                        case 2:
                            i12 = o8.u(parcel, readInt3);
                            break;
                        case 3:
                            f12 = o8.r(parcel, readInt3);
                            break;
                        case 4:
                            f13 = o8.r(parcel, readInt3);
                            break;
                        case 5:
                            f14 = o8.r(parcel, readInt3);
                            break;
                        case 6:
                            f15 = o8.r(parcel, readInt3);
                            break;
                        case 7:
                            f16 = o8.r(parcel, readInt3);
                            break;
                        case '\b':
                            f17 = o8.r(parcel, readInt3);
                            break;
                        case '\t':
                            landmarkParcelArr = (LandmarkParcel[]) o8.k(parcel, readInt3, LandmarkParcel.CREATOR);
                            break;
                        case '\n':
                            f19 = o8.r(parcel, readInt3);
                            break;
                        case 11:
                            f20 = o8.r(parcel, readInt3);
                            break;
                        case '\f':
                            f21 = o8.r(parcel, readInt3);
                            break;
                        case '\r':
                            aVarArr = (e8.a[]) o8.k(parcel, readInt3, e8.a.CREATOR);
                            break;
                        case 14:
                            f18 = o8.r(parcel, readInt3);
                            break;
                        case 15:
                            f22 = o8.r(parcel, readInt3);
                            break;
                        default:
                            o8.y(parcel, readInt3);
                            break;
                    }
                }
                o8.m(parcel, z12);
                return new FaceParcel(i11, i12, f12, f13, f14, f15, f16, f17, f18, landmarkParcelArr, f19, f20, f21, aVarArr, f22);
            case 19:
                int z13 = o8.z(parcel);
                int i13 = 0;
                int i14 = 0;
                boolean z14 = false;
                boolean z15 = false;
                while (parcel.dataPosition() < z13) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i9 = o8.u(parcel, readInt4);
                            break;
                        case 3:
                            i13 = o8.u(parcel, readInt4);
                            break;
                        case 4:
                            i14 = o8.u(parcel, readInt4);
                            break;
                        case 5:
                            z14 = o8.n(parcel, readInt4);
                            break;
                        case 6:
                            z15 = o8.n(parcel, readInt4);
                            break;
                        case 7:
                            f10 = o8.r(parcel, readInt4);
                            break;
                        default:
                            o8.y(parcel, readInt4);
                            break;
                    }
                }
                o8.m(parcel, z13);
                e8.b bVar2 = new e8.b();
                bVar2.a = i9;
                bVar2.b = i13;
                bVar2.c = i14;
                bVar2.d = z14;
                bVar2.e = z15;
                bVar2.f = f10;
                return bVar2;
            case 20:
                int z16 = o8.z(parcel);
                float f23 = 0.0f;
                int i15 = 0;
                while (parcel.dataPosition() < z16) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 == 1) {
                        i9 = o8.u(parcel, readInt5);
                    } else if (c11 == 2) {
                        f11 = o8.r(parcel, readInt5);
                    } else if (c11 == 3) {
                        f23 = o8.r(parcel, readInt5);
                    } else if (c11 != 4) {
                        o8.y(parcel, readInt5);
                    } else {
                        i15 = o8.u(parcel, readInt5);
                    }
                }
                o8.m(parcel, z16);
                return new LandmarkParcel(i9, f11, f23, i15);
            case 21:
                l0 l0Var = new l0();
                l0Var.a = parcel.readInt();
                l0Var.b = parcel.readInt();
                l0Var.c = parcel.readInt() == 1;
                return l0Var;
            case 22:
                return new f4.a(parcel);
            case 23:
                return new f4.b(parcel);
            case 24:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, f4.c.class.getClassLoader());
                return new f4.d(arrayList);
            case 25:
                return new f4.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
            case 26:
                return new f4.e(parcel);
            case 27:
                int z17 = o8.z(parcel);
                f8.b bVar3 = null;
                UserAddress userAddress = null;
                f8.k kVar = null;
                String str3 = null;
                Bundle bundle2 = null;
                String str4 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < z17) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str2 = o8.h(parcel, readInt6);
                            break;
                        case 2:
                            bVar3 = (f8.b) o8.g(parcel, readInt6, f8.b.CREATOR);
                            break;
                        case 3:
                            userAddress = (UserAddress) o8.g(parcel, readInt6, UserAddress.CREATOR);
                            break;
                        case 4:
                            kVar = (f8.k) o8.g(parcel, readInt6, f8.k.CREATOR);
                            break;
                        case 5:
                            str3 = o8.h(parcel, readInt6);
                            break;
                        case 6:
                            bundle2 = o8.a(parcel, readInt6);
                            break;
                        case 7:
                            str4 = o8.h(parcel, readInt6);
                            break;
                        case '\b':
                            bundle3 = o8.a(parcel, readInt6);
                            break;
                        default:
                            o8.y(parcel, readInt6);
                            break;
                    }
                }
                o8.m(parcel, z17);
                i iVar = new i();
                iVar.a = str2;
                iVar.b = bVar3;
                iVar.c = userAddress;
                iVar.d = kVar;
                iVar.e = str3;
                iVar.f = bundle2;
                iVar.h = str4;
                iVar.n = bundle3;
                return iVar;
            case 28:
                int z18 = o8.z(parcel);
                f8.m mVar = null;
                ArrayList arrayList2 = null;
                f8.l lVar = null;
                f8.n nVar = null;
                String str5 = null;
                Bundle bundle4 = null;
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                while (parcel.dataPosition() < z18) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            z19 = o8.n(parcel, readInt7);
                            break;
                        case 2:
                            z20 = o8.n(parcel, readInt7);
                            break;
                        case 3:
                            cVar = (f8.c) o8.g(parcel, readInt7, f8.c.CREATOR);
                            break;
                        case 4:
                            z21 = o8.n(parcel, readInt7);
                            break;
                        case 5:
                            mVar = (f8.m) o8.g(parcel, readInt7, f8.m.CREATOR);
                            break;
                        case 6:
                            arrayList2 = o8.e(parcel, readInt7);
                            break;
                        case 7:
                            lVar = (f8.l) o8.g(parcel, readInt7, f8.l.CREATOR);
                            break;
                        case '\b':
                            nVar = (f8.n) o8.g(parcel, readInt7, f8.n.CREATOR);
                            break;
                        case '\t':
                            r5 = o8.n(parcel, readInt7);
                            break;
                        case '\n':
                            str5 = o8.h(parcel, readInt7);
                            break;
                        case 11:
                            bundle4 = o8.a(parcel, readInt7);
                            break;
                        default:
                            o8.y(parcel, readInt7);
                            break;
                    }
                }
                o8.m(parcel, z18);
                j jVar = new j();
                jVar.a = z19;
                jVar.b = z20;
                jVar.c = cVar;
                jVar.d = z21;
                jVar.e = mVar;
                jVar.f = arrayList2;
                jVar.h = lVar;
                jVar.n = nVar;
                jVar.r = r5;
                jVar.s = str5;
                jVar.v = bundle4;
                return jVar;
            default:
                int z22 = o8.z(parcel);
                while (parcel.dataPosition() < z22) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        i9 = o8.u(parcel, readInt8);
                    } else if (c12 != 3) {
                        o8.y(parcel, readInt8);
                    } else {
                        str = o8.h(parcel, readInt8);
                    }
                }
                o8.m(parcel, z22);
                f8.k kVar2 = new f8.k();
                kVar2.a = i9;
                kVar2.b = str;
                return kVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.a) {
            case 0:
                return new e[i9];
            case 1:
                return new PictureFrame[i9];
            case 2:
                return new c4.a[i9];
            case 3:
                return new r[i9];
            case 4:
                return new d4.b[i9];
            case 5:
                return new d4.c[i9];
            case 6:
                return new e4.a[i9];
            case 7:
                return new e4.b[i9];
            case 8:
                return new e4.c[i9];
            case 9:
                return new e4.d[i9];
            case 10:
                return new e4.e[i9];
            case 11:
                return new f[i9];
            case 12:
                return new k[i9];
            case 13:
                return new l[i9];
            case 14:
                return new m[i9];
            case 15:
                return new n[i9];
            case 16:
                return new o[i9];
            case 17:
                return new e8.a[i9];
            case 18:
                return new FaceParcel[i9];
            case 19:
                return new e8.b[i9];
            case 20:
                return new LandmarkParcel[i9];
            case 21:
                return new l0[i9];
            case 22:
                return new f4.a[i9];
            case 23:
                return new f4.b[i9];
            case 24:
                return new f4.d[i9];
            case 25:
                return new f4.c[i9];
            case 26:
                return new f4.e[i9];
            case 27:
                return new i[i9];
            case 28:
                return new j[i9];
            default:
                return new f8.k[i9];
        }
    }
}
