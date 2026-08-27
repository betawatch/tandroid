package c8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.r;
import f2.j0;
import h7.q8;
import java.util.ArrayList;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int z10 = q8.z(parcel);
                int i10 = 0;
                String str = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            i10 = q8.u(parcel, readInt);
                            break;
                        case 3:
                            i11 = q8.u(parcel, readInt);
                            break;
                        case 4:
                            i12 = q8.u(parcel, readInt);
                            break;
                        case 5:
                            i13 = q8.u(parcel, readInt);
                            break;
                        case 6:
                            i14 = q8.u(parcel, readInt);
                            break;
                        case 7:
                            i15 = q8.u(parcel, readInt);
                            break;
                        case '\b':
                            z11 = q8.n(parcel, readInt);
                            break;
                        case '\t':
                            str = q8.h(parcel, readInt);
                            break;
                        default:
                            q8.y(parcel, readInt);
                            break;
                    }
                }
                q8.m(parcel, z10);
                b bVar = new b();
                bVar.a = i10;
                bVar.b = i11;
                bVar.c = i12;
                bVar.d = i13;
                bVar.e = i14;
                bVar.f = i15;
                bVar.h = z11;
                bVar.n = str;
                return bVar;
            case 1:
                int z12 = q8.z(parcel);
                h hVar = null;
                String str2 = null;
                String str3 = null;
                i[] iVarArr = null;
                f[] fVarArr = null;
                String[] strArr = null;
                a[] aVarArr = null;
                while (parcel.dataPosition() < z12) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            hVar = (h) q8.g(parcel, readInt2, h.CREATOR);
                            break;
                        case 3:
                            str2 = q8.h(parcel, readInt2);
                            break;
                        case 4:
                            str3 = q8.h(parcel, readInt2);
                            break;
                        case 5:
                            iVarArr = (i[]) q8.k(parcel, readInt2, i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (f[]) q8.k(parcel, readInt2, f.CREATOR);
                            break;
                        case 7:
                            strArr = q8.i(parcel, readInt2);
                            break;
                        case '\b':
                            aVarArr = (a[]) q8.k(parcel, readInt2, a.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt2);
                            break;
                    }
                }
                q8.m(parcel, z12);
                d dVar = new d();
                dVar.a = hVar;
                dVar.b = str2;
                dVar.c = str3;
                dVar.d = iVarArr;
                dVar.e = fVarArr;
                dVar.f = strArr;
                dVar.h = aVarArr;
                return dVar;
            case 2:
                int z13 = q8.z(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                b bVar2 = null;
                b bVar3 = null;
                while (parcel.dataPosition() < z13) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 2:
                            str4 = q8.h(parcel, readInt3);
                            break;
                        case 3:
                            str5 = q8.h(parcel, readInt3);
                            break;
                        case 4:
                            str6 = q8.h(parcel, readInt3);
                            break;
                        case 5:
                            str7 = q8.h(parcel, readInt3);
                            break;
                        case 6:
                            str8 = q8.h(parcel, readInt3);
                            break;
                        case 7:
                            bVar2 = (b) q8.g(parcel, readInt3, b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (b) q8.g(parcel, readInt3, b.CREATOR);
                            break;
                        default:
                            q8.y(parcel, readInt3);
                            break;
                    }
                }
                q8.m(parcel, z13);
                c cVar = new c();
                cVar.a = str4;
                cVar.b = str5;
                cVar.c = str6;
                cVar.d = str7;
                cVar.e = str8;
                cVar.f = bVar2;
                cVar.h = bVar3;
                return cVar;
            case 3:
                int z14 = q8.z(parcel);
                int i16 = 0;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (parcel.dataPosition() < z14) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 == 2) {
                        i16 = q8.u(parcel, readInt4);
                    } else if (c10 == 3) {
                        str9 = q8.h(parcel, readInt4);
                    } else if (c10 == 4) {
                        str10 = q8.h(parcel, readInt4);
                    } else if (c10 != 5) {
                        q8.y(parcel, readInt4);
                    } else {
                        str11 = q8.h(parcel, readInt4);
                    }
                }
                q8.m(parcel, z14);
                f fVar = new f();
                fVar.a = i16;
                fVar.b = str9;
                fVar.c = str10;
                fVar.d = str11;
                return fVar;
            case 4:
                int z15 = q8.z(parcel);
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                while (parcel.dataPosition() < z15) {
                    int readInt5 = parcel.readInt();
                    String str26 = str24;
                    switch ((char) readInt5) {
                        case 2:
                            str12 = q8.h(parcel, readInt5);
                            break;
                        case 3:
                            str13 = q8.h(parcel, readInt5);
                            break;
                        case 4:
                            str14 = q8.h(parcel, readInt5);
                            break;
                        case 5:
                            str15 = q8.h(parcel, readInt5);
                            break;
                        case 6:
                            str16 = q8.h(parcel, readInt5);
                            break;
                        case 7:
                            str17 = q8.h(parcel, readInt5);
                            break;
                        case '\b':
                            str18 = q8.h(parcel, readInt5);
                            break;
                        case '\t':
                            str19 = q8.h(parcel, readInt5);
                            break;
                        case '\n':
                            str20 = q8.h(parcel, readInt5);
                            break;
                        case 11:
                            str21 = q8.h(parcel, readInt5);
                            break;
                        case '\f':
                            str22 = q8.h(parcel, readInt5);
                            break;
                        case '\r':
                            str23 = q8.h(parcel, readInt5);
                            break;
                        case 14:
                            str24 = q8.h(parcel, readInt5);
                            continue;
                        case 15:
                            str25 = q8.h(parcel, readInt5);
                            break;
                        default:
                            q8.y(parcel, readInt5);
                            break;
                    }
                    str24 = str26;
                }
                q8.m(parcel, z15);
                e eVar = new e();
                eVar.a = str12;
                eVar.b = str13;
                eVar.c = str14;
                eVar.d = str15;
                eVar.e = str16;
                eVar.f = str17;
                eVar.h = str18;
                eVar.n = str19;
                eVar.r = str20;
                eVar.s = str21;
                eVar.v = str22;
                eVar.w = str23;
                eVar.x = str24;
                eVar.y = str25;
                return eVar;
            case 5:
                int z16 = q8.z(parcel);
                String str27 = null;
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                while (parcel.dataPosition() < z16) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            str27 = q8.h(parcel, readInt6);
                            break;
                        case 3:
                            str28 = q8.h(parcel, readInt6);
                            break;
                        case 4:
                            str29 = q8.h(parcel, readInt6);
                            break;
                        case 5:
                            str30 = q8.h(parcel, readInt6);
                            break;
                        case 6:
                            str31 = q8.h(parcel, readInt6);
                            break;
                        case 7:
                            str32 = q8.h(parcel, readInt6);
                            break;
                        case '\b':
                            str33 = q8.h(parcel, readInt6);
                            break;
                        default:
                            q8.y(parcel, readInt6);
                            break;
                    }
                }
                q8.m(parcel, z16);
                h hVar2 = new h();
                hVar2.a = str27;
                hVar2.b = str28;
                hVar2.c = str29;
                hVar2.d = str30;
                hVar2.e = str31;
                hVar2.f = str32;
                hVar2.h = str33;
                return hVar2;
            case 6:
                int z17 = q8.z(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < z17) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 == 2) {
                        d = q8.q(parcel, readInt7);
                    } else if (c11 != 3) {
                        q8.y(parcel, readInt7);
                    } else {
                        d10 = q8.q(parcel, readInt7);
                    }
                }
                q8.m(parcel, z17);
                g gVar = new g();
                gVar.a = d;
                gVar.b = d10;
                return gVar;
            case 7:
                int z18 = q8.z(parcel);
                String str34 = null;
                String str35 = null;
                while (parcel.dataPosition() < z18) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 == 2) {
                        str34 = q8.h(parcel, readInt8);
                    } else if (c12 != 3) {
                        q8.y(parcel, readInt8);
                    } else {
                        str35 = q8.h(parcel, readInt8);
                    }
                }
                q8.m(parcel, z18);
                j jVar = new j();
                jVar.a = str34;
                jVar.b = str35;
                return jVar;
            case 8:
                int z19 = q8.z(parcel);
                int i17 = 0;
                String str36 = null;
                while (parcel.dataPosition() < z19) {
                    int readInt9 = parcel.readInt();
                    char c13 = (char) readInt9;
                    if (c13 == 2) {
                        i17 = q8.u(parcel, readInt9);
                    } else if (c13 != 3) {
                        q8.y(parcel, readInt9);
                    } else {
                        str36 = q8.h(parcel, readInt9);
                    }
                }
                q8.m(parcel, z19);
                i iVar = new i();
                iVar.a = i17;
                iVar.b = str36;
                return iVar;
            case 9:
                int z20 = q8.z(parcel);
                String str37 = null;
                String str38 = null;
                int i18 = 0;
                while (parcel.dataPosition() < z20) {
                    int readInt10 = parcel.readInt();
                    char c14 = (char) readInt10;
                    if (c14 == 2) {
                        str37 = q8.h(parcel, readInt10);
                    } else if (c14 == 3) {
                        str38 = q8.h(parcel, readInt10);
                    } else if (c14 != 4) {
                        q8.y(parcel, readInt10);
                    } else {
                        i18 = q8.u(parcel, readInt10);
                    }
                }
                q8.m(parcel, z20);
                l lVar = new l();
                lVar.a = str37;
                lVar.b = str38;
                lVar.c = i18;
                return lVar;
            case 10:
                int z21 = q8.z(parcel);
                String str39 = null;
                String str40 = null;
                while (parcel.dataPosition() < z21) {
                    int readInt11 = parcel.readInt();
                    char c15 = (char) readInt11;
                    if (c15 == 2) {
                        str39 = q8.h(parcel, readInt11);
                    } else if (c15 != 3) {
                        q8.y(parcel, readInt11);
                    } else {
                        str40 = q8.h(parcel, readInt11);
                    }
                }
                q8.m(parcel, z21);
                k kVar = new k();
                kVar.a = str39;
                kVar.b = str40;
                return kVar;
            case 11:
                int z22 = q8.z(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < z22) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        q8.y(parcel, readInt12);
                    } else {
                        bundle = q8.a(parcel, readInt12);
                    }
                }
                q8.m(parcel, z22);
                return new r(bundle);
            case 12:
                return new d4.b(parcel);
            case 13:
                return new d4.c(parcel);
            case 14:
                return new e4.a(parcel);
            case 15:
                return new e4.b(parcel);
            case 16:
                return new e4.c(parcel);
            case 17:
                return new e4.d(parcel);
            case 18:
                return new e4.e(parcel);
            case 19:
                return new e4.f(parcel);
            case 20:
                return new e4.k(parcel);
            case 21:
                return new e4.l(parcel);
            case 22:
                return new e4.m(parcel);
            case 23:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new e4.n(readString, readString2, z.v(createStringArray));
            case 24:
                return new e4.o(parcel);
            case 25:
                j0 j0Var = new j0();
                j0Var.a = parcel.readInt();
                j0Var.b = parcel.readInt();
                j0Var.c = parcel.readInt() == 1;
                return j0Var;
            case 26:
                return new f4.a(parcel);
            case 27:
                return new f4.b(parcel);
            case 28:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, f4.c.class.getClassLoader());
                return new f4.d(arrayList);
            default:
                return new f4.c(parcel.readLong(), parcel.readLong(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new b[i10];
            case 1:
                return new d[i10];
            case 2:
                return new c[i10];
            case 3:
                return new f[i10];
            case 4:
                return new e[i10];
            case 5:
                return new h[i10];
            case 6:
                return new g[i10];
            case 7:
                return new j[i10];
            case 8:
                return new i[i10];
            case 9:
                return new l[i10];
            case 10:
                return new k[i10];
            case 11:
                return new r[i10];
            case 12:
                return new d4.b[i10];
            case 13:
                return new d4.c[i10];
            case 14:
                return new e4.a[i10];
            case 15:
                return new e4.b[i10];
            case 16:
                return new e4.c[i10];
            case 17:
                return new e4.d[i10];
            case 18:
                return new e4.e[i10];
            case 19:
                return new e4.f[i10];
            case 20:
                return new e4.k[i10];
            case 21:
                return new e4.l[i10];
            case 22:
                return new e4.m[i10];
            case 23:
                return new e4.n[i10];
            case 24:
                return new e4.o[i10];
            case 25:
                return new j0[i10];
            case 26:
                return new f4.a[i10];
            case 27:
                return new f4.b[i10];
            case 28:
                return new f4.d[i10];
            default:
                return new f4.c[i10];
        }
    }
}
