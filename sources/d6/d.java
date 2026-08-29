package d6;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d8.e;
import d8.f;
import d8.g;
import d8.h;
import d8.i;
import d8.j;
import d8.k;
import d8.l;
import d8.m;
import f2.i0;
import g4.n;
import g4.o;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int A = ce.b.A(parcel);
                int i10 = 0;
                boolean z10 = false;
                while (parcel.dataPosition() < A) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 == 1) {
                        i10 = ce.b.v(parcel, readInt);
                    } else if (c3 != 2) {
                        ce.b.z(parcel, readInt);
                    } else {
                        z10 = ce.b.o(parcel, readInt);
                    }
                }
                ce.b.n(parcel, A);
                return new c(i10, z10);
            case 1:
                int A2 = ce.b.A(parcel);
                int i11 = 0;
                String[] strArr = null;
                while (parcel.dataPosition() < A2) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 == 2) {
                        i11 = ce.b.v(parcel, readInt2);
                    } else if (c6 != 3) {
                        ce.b.z(parcel, readInt2);
                    } else {
                        strArr = ce.b.j(parcel, readInt2);
                    }
                }
                ce.b.n(parcel, A2);
                d8.a aVar = new d8.a();
                aVar.a = i11;
                aVar.b = strArr;
                return aVar;
            case 2:
                int A3 = ce.b.A(parcel);
                int i12 = 0;
                String str = null;
                String str2 = null;
                Point[] pointArr = null;
                f fVar = null;
                i iVar = null;
                j jVar = null;
                l lVar = null;
                k kVar = null;
                g gVar = null;
                byte[] bArr = null;
                d8.d dVar = null;
                d8.c cVar = null;
                e eVar = null;
                int i13 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < A3) {
                    int readInt3 = parcel.readInt();
                    g gVar2 = gVar;
                    switch ((char) readInt3) {
                        case 2:
                            i12 = ce.b.v(parcel, readInt3);
                            break;
                        case 3:
                            str = ce.b.i(parcel, readInt3);
                            break;
                        case 4:
                            str2 = ce.b.i(parcel, readInt3);
                            break;
                        case 5:
                            i13 = ce.b.v(parcel, readInt3);
                            break;
                        case 6:
                            pointArr = (Point[]) ce.b.l(parcel, readInt3, Point.CREATOR);
                            break;
                        case 7:
                            fVar = (f) ce.b.h(parcel, readInt3, f.CREATOR);
                            break;
                        case '\b':
                            iVar = (i) ce.b.h(parcel, readInt3, i.CREATOR);
                            break;
                        case '\t':
                            jVar = (j) ce.b.h(parcel, readInt3, j.CREATOR);
                            break;
                        case '\n':
                            lVar = (l) ce.b.h(parcel, readInt3, l.CREATOR);
                            break;
                        case 11:
                            kVar = (k) ce.b.h(parcel, readInt3, k.CREATOR);
                            break;
                        case '\f':
                            gVar = (g) ce.b.h(parcel, readInt3, g.CREATOR);
                            continue;
                        case '\r':
                            cVar = (d8.c) ce.b.h(parcel, readInt3, d8.c.CREATOR);
                            break;
                        case 14:
                            dVar = (d8.d) ce.b.h(parcel, readInt3, d8.d.CREATOR);
                            break;
                        case 15:
                            eVar = (e) ce.b.h(parcel, readInt3, e.CREATOR);
                            break;
                        case 16:
                            bArr = ce.b.c(parcel, readInt3);
                            break;
                        case 17:
                            z11 = ce.b.o(parcel, readInt3);
                            break;
                        default:
                            ce.b.z(parcel, readInt3);
                            break;
                    }
                    gVar = gVar2;
                }
                ce.b.n(parcel, A3);
                m mVar = new m();
                mVar.a = i12;
                mVar.b = str;
                mVar.A = bArr;
                mVar.c = str2;
                mVar.d = i13;
                mVar.e = pointArr;
                mVar.B = z11;
                mVar.f = fVar;
                mVar.h = iVar;
                mVar.n = jVar;
                mVar.r = lVar;
                mVar.s = kVar;
                mVar.v = gVar;
                mVar.w = cVar;
                mVar.x = dVar;
                mVar.y = eVar;
                return mVar;
            case 3:
                int A4 = ce.b.A(parcel);
                int i14 = 0;
                String str3 = null;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                boolean z12 = false;
                while (parcel.dataPosition() < A4) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 2:
                            i14 = ce.b.v(parcel, readInt4);
                            break;
                        case 3:
                            i15 = ce.b.v(parcel, readInt4);
                            break;
                        case 4:
                            i16 = ce.b.v(parcel, readInt4);
                            break;
                        case 5:
                            i17 = ce.b.v(parcel, readInt4);
                            break;
                        case 6:
                            i18 = ce.b.v(parcel, readInt4);
                            break;
                        case 7:
                            i19 = ce.b.v(parcel, readInt4);
                            break;
                        case '\b':
                            z12 = ce.b.o(parcel, readInt4);
                            break;
                        case '\t':
                            str3 = ce.b.i(parcel, readInt4);
                            break;
                        default:
                            ce.b.z(parcel, readInt4);
                            break;
                    }
                }
                ce.b.n(parcel, A4);
                d8.b bVar = new d8.b();
                bVar.a = i14;
                bVar.b = i15;
                bVar.c = i16;
                bVar.d = i17;
                bVar.e = i18;
                bVar.f = i19;
                bVar.h = z12;
                bVar.n = str3;
                return bVar;
            case 4:
                int A5 = ce.b.A(parcel);
                h hVar = null;
                String str4 = null;
                String str5 = null;
                i[] iVarArr = null;
                f[] fVarArr = null;
                String[] strArr2 = null;
                d8.a[] aVarArr = null;
                while (parcel.dataPosition() < A5) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            hVar = (h) ce.b.h(parcel, readInt5, h.CREATOR);
                            break;
                        case 3:
                            str4 = ce.b.i(parcel, readInt5);
                            break;
                        case 4:
                            str5 = ce.b.i(parcel, readInt5);
                            break;
                        case 5:
                            iVarArr = (i[]) ce.b.l(parcel, readInt5, i.CREATOR);
                            break;
                        case 6:
                            fVarArr = (f[]) ce.b.l(parcel, readInt5, f.CREATOR);
                            break;
                        case 7:
                            strArr2 = ce.b.j(parcel, readInt5);
                            break;
                        case '\b':
                            aVarArr = (d8.a[]) ce.b.l(parcel, readInt5, d8.a.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt5);
                            break;
                    }
                }
                ce.b.n(parcel, A5);
                d8.d dVar2 = new d8.d();
                dVar2.a = hVar;
                dVar2.b = str4;
                dVar2.c = str5;
                dVar2.d = iVarArr;
                dVar2.e = fVarArr;
                dVar2.f = strArr2;
                dVar2.h = aVarArr;
                return dVar2;
            case 5:
                int A6 = ce.b.A(parcel);
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                d8.b bVar2 = null;
                d8.b bVar3 = null;
                while (parcel.dataPosition() < A6) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 2:
                            str6 = ce.b.i(parcel, readInt6);
                            break;
                        case 3:
                            str7 = ce.b.i(parcel, readInt6);
                            break;
                        case 4:
                            str8 = ce.b.i(parcel, readInt6);
                            break;
                        case 5:
                            str9 = ce.b.i(parcel, readInt6);
                            break;
                        case 6:
                            str10 = ce.b.i(parcel, readInt6);
                            break;
                        case 7:
                            bVar2 = (d8.b) ce.b.h(parcel, readInt6, d8.b.CREATOR);
                            break;
                        case '\b':
                            bVar3 = (d8.b) ce.b.h(parcel, readInt6, d8.b.CREATOR);
                            break;
                        default:
                            ce.b.z(parcel, readInt6);
                            break;
                    }
                }
                ce.b.n(parcel, A6);
                d8.c cVar2 = new d8.c();
                cVar2.a = str6;
                cVar2.b = str7;
                cVar2.c = str8;
                cVar2.d = str9;
                cVar2.e = str10;
                cVar2.f = bVar2;
                cVar2.h = bVar3;
                return cVar2;
            case 6:
                int A7 = ce.b.A(parcel);
                int i20 = 0;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < A7) {
                    int readInt7 = parcel.readInt();
                    char c10 = (char) readInt7;
                    if (c10 == 2) {
                        i20 = ce.b.v(parcel, readInt7);
                    } else if (c10 == 3) {
                        str11 = ce.b.i(parcel, readInt7);
                    } else if (c10 == 4) {
                        str12 = ce.b.i(parcel, readInt7);
                    } else if (c10 != 5) {
                        ce.b.z(parcel, readInt7);
                    } else {
                        str13 = ce.b.i(parcel, readInt7);
                    }
                }
                ce.b.n(parcel, A7);
                f fVar2 = new f();
                fVar2.a = i20;
                fVar2.b = str11;
                fVar2.c = str12;
                fVar2.d = str13;
                return fVar2;
            case 7:
                int A8 = ce.b.A(parcel);
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
                String str26 = null;
                String str27 = null;
                while (parcel.dataPosition() < A8) {
                    int readInt8 = parcel.readInt();
                    String str28 = str26;
                    switch ((char) readInt8) {
                        case 2:
                            str14 = ce.b.i(parcel, readInt8);
                            break;
                        case 3:
                            str15 = ce.b.i(parcel, readInt8);
                            break;
                        case 4:
                            str16 = ce.b.i(parcel, readInt8);
                            break;
                        case 5:
                            str17 = ce.b.i(parcel, readInt8);
                            break;
                        case 6:
                            str18 = ce.b.i(parcel, readInt8);
                            break;
                        case 7:
                            str19 = ce.b.i(parcel, readInt8);
                            break;
                        case '\b':
                            str20 = ce.b.i(parcel, readInt8);
                            break;
                        case '\t':
                            str21 = ce.b.i(parcel, readInt8);
                            break;
                        case '\n':
                            str22 = ce.b.i(parcel, readInt8);
                            break;
                        case 11:
                            str23 = ce.b.i(parcel, readInt8);
                            break;
                        case '\f':
                            str24 = ce.b.i(parcel, readInt8);
                            break;
                        case '\r':
                            str25 = ce.b.i(parcel, readInt8);
                            break;
                        case 14:
                            str26 = ce.b.i(parcel, readInt8);
                            continue;
                        case 15:
                            str27 = ce.b.i(parcel, readInt8);
                            break;
                        default:
                            ce.b.z(parcel, readInt8);
                            break;
                    }
                    str26 = str28;
                }
                ce.b.n(parcel, A8);
                e eVar2 = new e();
                eVar2.a = str14;
                eVar2.b = str15;
                eVar2.c = str16;
                eVar2.d = str17;
                eVar2.e = str18;
                eVar2.f = str19;
                eVar2.h = str20;
                eVar2.n = str21;
                eVar2.r = str22;
                eVar2.s = str23;
                eVar2.v = str24;
                eVar2.w = str25;
                eVar2.x = str26;
                eVar2.y = str27;
                return eVar2;
            case 8:
                int A9 = ce.b.A(parcel);
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                while (parcel.dataPosition() < A9) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            str29 = ce.b.i(parcel, readInt9);
                            break;
                        case 3:
                            str30 = ce.b.i(parcel, readInt9);
                            break;
                        case 4:
                            str31 = ce.b.i(parcel, readInt9);
                            break;
                        case 5:
                            str32 = ce.b.i(parcel, readInt9);
                            break;
                        case 6:
                            str33 = ce.b.i(parcel, readInt9);
                            break;
                        case 7:
                            str34 = ce.b.i(parcel, readInt9);
                            break;
                        case '\b':
                            str35 = ce.b.i(parcel, readInt9);
                            break;
                        default:
                            ce.b.z(parcel, readInt9);
                            break;
                    }
                }
                ce.b.n(parcel, A9);
                h hVar2 = new h();
                hVar2.a = str29;
                hVar2.b = str30;
                hVar2.c = str31;
                hVar2.d = str32;
                hVar2.e = str33;
                hVar2.f = str34;
                hVar2.h = str35;
                return hVar2;
            case 9:
                int A10 = ce.b.A(parcel);
                double d = 0.0d;
                double d10 = 0.0d;
                while (parcel.dataPosition() < A10) {
                    int readInt10 = parcel.readInt();
                    char c11 = (char) readInt10;
                    if (c11 == 2) {
                        d = ce.b.r(parcel, readInt10);
                    } else if (c11 != 3) {
                        ce.b.z(parcel, readInt10);
                    } else {
                        d10 = ce.b.r(parcel, readInt10);
                    }
                }
                ce.b.n(parcel, A10);
                g gVar3 = new g();
                gVar3.a = d;
                gVar3.b = d10;
                return gVar3;
            case 10:
                int A11 = ce.b.A(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < A11) {
                    int readInt11 = parcel.readInt();
                    char c12 = (char) readInt11;
                    if (c12 == 2) {
                        str36 = ce.b.i(parcel, readInt11);
                    } else if (c12 != 3) {
                        ce.b.z(parcel, readInt11);
                    } else {
                        str37 = ce.b.i(parcel, readInt11);
                    }
                }
                ce.b.n(parcel, A11);
                j jVar2 = new j();
                jVar2.a = str36;
                jVar2.b = str37;
                return jVar2;
            case 11:
                int A12 = ce.b.A(parcel);
                int i21 = 0;
                String str38 = null;
                while (parcel.dataPosition() < A12) {
                    int readInt12 = parcel.readInt();
                    char c13 = (char) readInt12;
                    if (c13 == 2) {
                        i21 = ce.b.v(parcel, readInt12);
                    } else if (c13 != 3) {
                        ce.b.z(parcel, readInt12);
                    } else {
                        str38 = ce.b.i(parcel, readInt12);
                    }
                }
                ce.b.n(parcel, A12);
                i iVar2 = new i();
                iVar2.a = i21;
                iVar2.b = str38;
                return iVar2;
            case 12:
                int A13 = ce.b.A(parcel);
                String str39 = null;
                String str40 = null;
                int i22 = 0;
                while (parcel.dataPosition() < A13) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 == 2) {
                        str39 = ce.b.i(parcel, readInt13);
                    } else if (c14 == 3) {
                        str40 = ce.b.i(parcel, readInt13);
                    } else if (c14 != 4) {
                        ce.b.z(parcel, readInt13);
                    } else {
                        i22 = ce.b.v(parcel, readInt13);
                    }
                }
                ce.b.n(parcel, A13);
                l lVar2 = new l();
                lVar2.a = str39;
                lVar2.b = str40;
                lVar2.c = i22;
                return lVar2;
            case 13:
                int A14 = ce.b.A(parcel);
                String str41 = null;
                String str42 = null;
                while (parcel.dataPosition() < A14) {
                    int readInt14 = parcel.readInt();
                    char c15 = (char) readInt14;
                    if (c15 == 2) {
                        str41 = ce.b.i(parcel, readInt14);
                    } else if (c15 != 3) {
                        ce.b.z(parcel, readInt14);
                    } else {
                        str42 = ce.b.i(parcel, readInt14);
                    }
                }
                ce.b.n(parcel, A14);
                k kVar2 = new k();
                kVar2.a = str41;
                kVar2.b = str42;
                return kVar2;
            case 14:
                return new PictureFrame(parcel);
            case 15:
                return new e4.a(parcel);
            case 16:
                i0 i0Var = new i0();
                i0Var.a = parcel.readInt();
                i0Var.b = parcel.readInt();
                i0Var.c = parcel.readInt() == 1;
                return i0Var;
            case 17:
                return new f4.b(parcel);
            case 18:
                return new f4.c(parcel);
            case 19:
                return new g4.a(parcel);
            case 20:
                return new g4.b(parcel);
            case 21:
                return new g4.c(parcel);
            case 22:
                return new g4.d(parcel);
            case 23:
                return new g4.e(parcel);
            case 24:
                return new g4.f(parcel);
            case 25:
                return new g4.k(parcel);
            case 26:
                return new g4.l(parcel);
            case 27:
                return new g4.m(parcel);
            case 28:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString, readString2, z.v(createStringArray));
            default:
                return new o(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.a) {
            case 0:
                return new c[i10];
            case 1:
                return new d8.a[i10];
            case 2:
                return new m[i10];
            case 3:
                return new d8.b[i10];
            case 4:
                return new d8.d[i10];
            case 5:
                return new d8.c[i10];
            case 6:
                return new f[i10];
            case 7:
                return new e[i10];
            case 8:
                return new h[i10];
            case 9:
                return new g[i10];
            case 10:
                return new j[i10];
            case 11:
                return new i[i10];
            case 12:
                return new l[i10];
            case 13:
                return new k[i10];
            case 14:
                return new PictureFrame[i10];
            case 15:
                return new e4.a[i10];
            case 16:
                return new i0[i10];
            case 17:
                return new f4.b[i10];
            case 18:
                return new f4.c[i10];
            case 19:
                return new g4.a[i10];
            case 20:
                return new g4.b[i10];
            case 21:
                return new g4.c[i10];
            case 22:
                return new g4.d[i10];
            case 23:
                return new g4.e[i10];
            case 24:
                return new g4.f[i10];
            case 25:
                return new g4.k[i10];
            case 26:
                return new g4.l[i10];
            case 27:
                return new g4.m[i10];
            case 28:
                return new n[i10];
            default:
                return new o[i10];
        }
    }
}
